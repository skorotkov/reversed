package fi.polar.polarflow.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;

import fi.polar.polarflow.c.o_SessionSensors;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.TrainingDataRefs;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.service.datalayer.at;
import fi.polar.polarflow.service.sensorhubsocket.SensorHubDataWriterService;
import fi.polar.polarflow.ui.NotificationReceiver;
import fi.polar.polarflow.util.z;
import java.util.List;

public class TrainingService extends Service {
   private final BroadcastReceiver a = new p_TrainingServiceBroadcastReceiver(this);
   private final c_BatteryManagerListener b_batteryListener = new q_TrainingServiceBatteryListener(this);
   private final Runnable c_periodicSavingTask = new r_PeriodicSavingTask(this);
   private final IBinder d = new v(this);
   private final Handler e = new Handler();
   private o_SessionSensors f_sessionSensors;
   private a_BatteryManager g_batteryManager;
   private w h_vibratorManager;
   private Training i_training;
   private android.support.v4.c.g j;
   private boolean k;
   private int l_sessionState;
   private boolean m;
   private o_DataSaver n_dataSaver = null;
   private z o = null;
   private final Runnable p = new t_StopSessionTask(this);

   // $FF: synthetic method
   static int a_getSessionState(TrainingService var0) {
      return var0.l_sessionState;
   }

   // $FF: synthetic method
   static int a_setSessionState(TrainingService var0, int var1) {
      var0.l_sessionState = var1;
      return var1;
   }

   private long a(long var1) {
      SportProfile var3 = this.c(var1);
      Sport var4;
      if (var3 != null) {
         var4 = var3.getSport();
      } else {
         var4 = null;
      }

      if (var4 != null) {
         var1 = var4.getParentId();
      } else {
         var1 = -2L;
      }

      return var1;
   }

   private void a_startSession(long var1_sportId, String var3_tstPath) {
      fi.polar.polarflow.util.d.c("TrainingService", "startSession(sportId, path), sportId:" + var1_sportId + " TST path: " + var3_tstPath);
      if (this.l_sessionState == 0) {
         TrainingSessionTarget var4;
         if (var3_tstPath != null) {
            var4 = TrainingSessionTarget.getTrainingTargetForPath(var3_tstPath);
         } else {
            var4 = null;
         }

         this.i_training.setSportId(var1_sportId);
         this.i_training.setTrainingSessionTarget(var4);
         this.g_startSession();
      }

   }

   public static void a_start(Context var0) {
      var0.startService(new Intent(var0, TrainingService.class));
   }

   private void a_saveAndPublishSession(TrainingDataRefs var1, at var2) {
      fi.polar.polarflow.util.d.c("TrainingService", "saveAndPublishSession");
      n_TrainingSaveAndPublishRunnable var3_saveAndPublishTask = new n_TrainingSaveAndPublishRunnable(this, var1, var2);
      if (this.n_dataSaver != null) {
         var3_saveAndPublishTask.a_setDataSaver(this.n_dataSaver);
      }

      var3_saveAndPublishTask.a(this.f_sessionSensors.d());
      (new Thread(var3_saveAndPublishTask)).start();
   }

   // $FF: synthetic method
   static void a_startSession(TrainingService var0, long var1, String var3) {
      var0.a_startSession(var1, var3);
   }

   // $FF: synthetic method
   static void a_saveAndPublishSession(TrainingService var0, TrainingDataRefs var1, at var2) {
      var0.a_saveAndPublishSession(var1, var2);
   }

   // $FF: synthetic method
   static void a_broadcastSessionStateChange(TrainingService var0, String var1, long var2) {
      var0.a_broadcastSessionStateChange(var1, var2);
   }

   private void a_broadcastSessionStateChange(String var1, long var2) {
      Intent var4 = new Intent(var1);
      byte var5 = -1;
      switch(var1.hashCode()) {
      case -459962514:
         if (var1.equals("TrainingService.action.TRAINING_PAUSED")) {
            var5 = 2;
         }
         break;
      case 513808247:
         if (var1.equals("TrainingService.action.TRAINING_RESUMED")) {
            var5 = 3;
         }
         break;
      case 1814043169:
         if (var1.equals("TrainingService.action.TRAINING_STARTED")) {
            var5 = 0;
         }
         break;
      case 1826909037:
         if (var1.equals("TrainingService.action.TRAINING_STOPPED")) {
            var5 = 1;
         }
      }

      switch(var5) {
      case 0:
         var4.putExtra(SportProfile.KEY_SPORT_ID, this.i_training.getSportId());
         var4.putExtra("TrainingService.key.TIMESTAMP", this.i_training.getStartTimeFromBoot());
         Intent var6 = new Intent(var4);
         var6.setClass(this.getApplicationContext(), NotificationReceiver.class);
         var6.setFlags(268435456);
         if (this.i_training.getTrainingSessionTarget() != null) {
            var6.putExtra("TrainingService.extra.TRAINING_TARGET_PATH", this.i_training.getTrainingSessionTarget().getPath());
         }

         this.sendBroadcast(var6);
         break;
      case 1:
         var4.putExtra("TrainingService.key.TIMESTAMP", var2);
         break;
      case 2:
         var4.putExtra(SportProfile.KEY_SPORT_ID, this.i_training.getSportId());
         var4.putExtra("TrainingService.key.TIMESTAMP", this.i_training.getPauseStartTimeFromBoot());
         break;
      case 3:
         var4.putExtra(SportProfile.KEY_SPORT_ID, this.i_training.getSportId());
         var4.putExtra("TrainingService.key.TIMESTAMP", this.i_training.getSamplingStartTimeFromBoot());
      }

      this.j.a(var4);
   }

   private void a(boolean var1) {
      long var2 = 2L;
      if (this.a(this.i_training.getSportId()) == 2L) {
         Intent var4 = new Intent(this, SensorHubDataWriterService.class);
         var4.setAction("SensorHubDataWriterService.action.SENSOR_SPORT_EVENT");
         if (!var1) {
            var2 = -1L;
         }

         var4.putExtra("SensorHubDataWriterService.extra.SPORT_ID", var2);
         this.startService(var4);
      }

   }

   // $FF: synthetic method
   static boolean a(TrainingService var0, boolean var1) {
      var0.m = var1;
      return var1;
   }

   private int b(long var1) {
      SportProfile var3 = this.c(var1);
      int var4;
      if (var3 != null) {
         var4 = var3.getSettings().getEnabledSensors();
      } else {
         var4 = 0;
      }

      return var4;
   }

   // $FF: synthetic method
   static Training b_getTraining(TrainingService var0) {
      return var0.i_training;
   }

   public static void b_stop(Context var0) {
      var0.stopService(new Intent(var0, TrainingService.class));
   }

   // $FF: synthetic method
   static void b(TrainingService var0, boolean var1) {
      var0.a(var1);
   }

   private SportProfile c(long var1) {
      SportProfile var3 = this.i_training.getSportProfile();
      SportProfile var4;
      if (var3 != null) {
         var4 = var3;
         if (var3.getSportId() == var1) {
            return var4;
         }
      }

      var4 = SportProfile.getSportProfileBySportId(var1);
      return var4;
   }

   // $FF: synthetic method
   static void c_startPeriodicSaving(TrainingService var0) {
      var0.k_startPeriodicSaving();
   }

   // $FF: synthetic method
   static Runnable d(TrainingService var0) {
      return var0.c_periodicSavingTask;
   }

   // $FF: synthetic method
   static Handler e(TrainingService var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static Runnable f(TrainingService var0) {
      return var0.p;
   }

   private void g_startSession() {
      fi.polar.polarflow.util.d.c("TrainingService", "startSession()");
      this.l_sessionState = 1;
      this.i_training.startSession();
      this.i_training.setLocalBroadcastManager(this.j);
      this.f_sessionSensors.a_startSessionSensors(this.b(this.i_training.getSportId()));
      this.g_batteryManager.a_start();
      if (this.g_batteryManager.c_isBatteryLow()) {
         this.k_startPeriodicSaving();
      }

      SportProfile var1 = this.i_training.getSportProfile();
      if (var1 != null && var1.getVibration()) {
         this.h_vibratorManager = new w(this);
         this.h_vibratorManager.a();
      }

      this.startForeground(2, this.i());
      this.a_broadcastSessionStateChange("TrainingService.action.TRAINING_STARTED", 0L);
      this.a(true);
      this.m().a(this.getApplicationContext(), false);
   }

   // $FF: synthetic method
   static boolean g(TrainingService var0) {
      return var0.m;
   }

   private at h() {
      return new u(this, this.getApplicationContext());
   }

   // $FF: synthetic method
   static z h(TrainingService var0) {
      return var0.m();
   }

   private Notification i() {
      return NotificationReceiver.a(this, this.i_training.isPaused(), this.i_training.getDurationMs());
   }

   // $FF: synthetic method
   static at i(TrainingService var0) {
      return var0.h();
   }

   private void j() {
      ((NotificationManager)this.getSystemService("notification")).notify(2, this.i());
   }

   private void k_startPeriodicSaving() {
      fi.polar.polarflow.util.d.c("TrainingService", "startPeriodicSaving");
      if (!this.k) {
         long var1 = this.i_training.getDurationMs();
         if (var1 < fi.polar.polarflow.util.b.l_10minutesInMs) { // less than 10 min
            this.e.postDelayed(this.c_periodicSavingTask, fi.polar.polarflow.util.b.l_10minutesInMs - var1);
         } else {
            this.c_periodicSavingTask.run();
         }

         this.k = true;
      }

   }

   private void l_stopPeriodicSaving() {
      fi.polar.polarflow.util.d.c("TrainingService", "stopPeriodicSaving");
      this.e.removeCallbacks(this.c_periodicSavingTask);
      this.k = false;
   }

   private z m() {
      z var1;
      if (this.o != null) {
         var1 = this.o;
      } else {
         var1 = new z();
      }

      return var1;
   }

   public void a_stopSession() {
      if (this.l_sessionState == 1) {
         fi.polar.polarflow.util.d.c("TrainingService", "stopSession");
         this.l_sessionState = 2;
         this.l_stopPeriodicSaving();
         this.g_batteryManager.b_stop();
         if (this.h_vibratorManager != null) {
            this.h_vibratorManager.b();
            this.h_vibratorManager = null;
         }

         this.f_sessionSensors.a_stopSessionSensors((fi.polar.polarflow.c.k)(new s(this)));
      }

   }

   public long b_pauseSession() {
      long var1;
      if (this.l_sessionState == 1) {
         fi.polar.polarflow.util.d.c("TrainingService", "pauseSession()");
         var1 = this.i_training.pauseSession();
         this.f_sessionSensors.b_pauseSessionSensors();
         this.j();
      } else {
         var1 = 0L;
      }

      return var1;
   }

   public void c_resumeSession() {
      if (this.l_sessionState == 1) {
         fi.polar.polarflow.util.d.c("TrainingService", "resumeSession()");
         this.i_training.resumeSession();
         this.f_sessionSensors.c_resumeSessionSensors();
         this.j();
      }

   }

   public void d_saveAndPublishSession() {
      this.a_saveAndPublishSession(this.i_training.getTrainingDataRefs(true), (at)null);
   }

   public List e_getAutoLaps() {
      return this.i_training.getAutoLaps();
   }

   public List f_getManualLaps() {
      return this.i_training.getManualLaps();
   }

   public IBinder onBind(Intent var1) {
      fi.polar.polarflow.util.d.c("TrainingService", "onBind");
      return this.d;
   }

   public void onCreate() {
      fi.polar.polarflow.util.d.c("TrainingService", "onCreate()");
      this.j = android.support.v4.c.g.a(this);
      this.f_sessionSensors = new o_SessionSensors(this);
      this.g_batteryManager = new a_BatteryManager(this);
      this.g_batteryManager.a_addListener(this.b_batteryListener);
      IntentFilter var1 = new IntentFilter();
      var1.addAction("TrainingService.action.START_SESSION");
      var1.addAction("TrainingService.action.STOP_SESSION");
      var1.addAction("TrainingService.action.PAUSE_SESSION");
      var1.addAction("TrainingService.action.RESUME_SESSION");
      var1.addAction("DailyActivityService.action.TRAINING_LOAD_DATA");
      this.j.a(this.a, var1);
      this.i_training = Training.getInstance();
      this.l_sessionState = 0;
   }

   public void onDestroy() {
      fi.polar.polarflow.util.d.c("TrainingService", "onDestroy()");
      this.j.a(this.a);
      this.f_sessionSensors.a();
      this.g_batteryManager.b_removeListener(this.b_batteryListener);
      this.g_batteryManager.b_stop();
      if (this.h_vibratorManager != null) {
         this.h_vibratorManager.b();
      }

      this.e.removeCallbacksAndMessages((Object)null);
      super.onDestroy();
   }

   public int onStartCommand(Intent var1, int var2, int var3) {
      fi.polar.polarflow.util.d.c("TrainingService", "onStartCommand() startId: " + var3);
      return 1;
   }
}
