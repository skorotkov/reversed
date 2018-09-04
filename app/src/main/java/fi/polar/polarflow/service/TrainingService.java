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
   private final BroadcastReceiver a = new p(this);
   private final c b = new q(this);
   private final Runnable c = new r(this);
   private final IBinder d = new v(this);
   private final Handler e = new Handler();
   private fi.polar.polarflow.c_sensor_package.o f;
   private a g;
   private w h;
   private Training i;
   private android.support.v4.c.g j;
   private boolean k;
   private int l;
   private boolean m;
   private o n = null;
   private z o = null;
   private final Runnable p = new t(this);

   // $FF: synthetic method
   static int a(TrainingService var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static int a(TrainingService var0, int var1) {
      var0.l = var1;
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

   private void a(long var1, String var3) {
      fi.polar.polarflow.util.d.c("TrainingService", "startSession(sportId, path), sportId:" + var1 + " TST path: " + var3);
      if (this.l == 0) {
         TrainingSessionTarget var4;
         if (var3 != null) {
            var4 = TrainingSessionTarget.getTrainingTargetForPath(var3);
         } else {
            var4 = null;
         }

         this.i.setSportId(var1);
         this.i.setTrainingSessionTarget(var4);
         this.g();
      }

   }

   public static void a(Context var0) {
      var0.startService(new Intent(var0, TrainingService.class));
   }

   private void a(TrainingDataRefs var1, at var2) {
      fi.polar.polarflow.util.d.c("TrainingService", "saveAndPublishSession");
      n var3 = new n(this, var1, var2);
      if (this.n != null) {
         var3.a(this.n);
      }

      var3.a(this.f.d());
      (new Thread(var3)).start();
   }

   // $FF: synthetic method
   static void a(TrainingService var0, long var1, String var3) {
      var0.a(var1, var3);
   }

   // $FF: synthetic method
   static void a(TrainingService var0, TrainingDataRefs var1, at var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(TrainingService var0, String var1, long var2) {
      var0.a(var1, var2);
   }

   private void a(String var1, long var2) {
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
         var4.putExtra(SportProfile.KEY_SPORT_ID, this.i.getSportId());
         var4.putExtra("TrainingService.key.TIMESTAMP", this.i.getStartTimeFromBoot());
         Intent var6 = new Intent(var4);
         var6.setClass(this.getApplicationContext(), NotificationReceiver.class);
         var6.setFlags(268435456);
         if (this.i.getTrainingSessionTarget() != null) {
            var6.putExtra("TrainingService.extra.TRAINING_TARGET_PATH", this.i.getTrainingSessionTarget().getPath());
         }

         this.sendBroadcast(var6);
         break;
      case 1:
         var4.putExtra("TrainingService.key.TIMESTAMP", var2);
         break;
      case 2:
         var4.putExtra(SportProfile.KEY_SPORT_ID, this.i.getSportId());
         var4.putExtra("TrainingService.key.TIMESTAMP", this.i.getPauseStartTimeFromBoot());
         break;
      case 3:
         var4.putExtra(SportProfile.KEY_SPORT_ID, this.i.getSportId());
         var4.putExtra("TrainingService.key.TIMESTAMP", this.i.getSamplingStartTimeFromBoot());
      }

      this.j.a(var4);
   }

   private void a(boolean var1) {
      long var2 = 2L;
      if (this.a(this.i.getSportId()) == 2L) {
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
   static Training b(TrainingService var0) {
      return var0.i;
   }

   public static void b(Context var0) {
      var0.stopService(new Intent(var0, TrainingService.class));
   }

   // $FF: synthetic method
   static void b(TrainingService var0, boolean var1) {
      var0.a(var1);
   }

   private SportProfile c(long var1) {
      SportProfile var3 = this.i.getSportProfile();
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
   static void c(TrainingService var0) {
      var0.k();
   }

   // $FF: synthetic method
   static Runnable d(TrainingService var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static Handler e(TrainingService var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static Runnable f(TrainingService var0) {
      return var0.p;
   }

   private void g() {
      fi.polar.polarflow.util.d.c("TrainingService", "startSession()");
      this.l = 1;
      this.i.startSession();
      this.i.setLocalBroadcastManager(this.j);
      this.f.a(this.b(this.i.getSportId()));
      this.g.a();
      if (this.g.c()) {
         this.k();
      }

      SportProfile var1 = this.i.getSportProfile();
      if (var1 != null && var1.getVibration()) {
         this.h = new w(this);
         this.h.a();
      }

      this.startForeground(2, this.i());
      this.a("TrainingService.action.TRAINING_STARTED", 0L);
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
      return NotificationReceiver.a(this, this.i.isPaused(), this.i.getDurationMs());
   }

   // $FF: synthetic method
   static at i(TrainingService var0) {
      return var0.h();
   }

   private void j() {
      ((NotificationManager)this.getSystemService("notification")).notify(2, this.i());
   }

   private void k() {
      fi.polar.polarflow.util.d.c("TrainingService", "startPeriodicSaving");
      if (!this.k) {
         long var1 = this.i.getDurationMs();
         if (var1 < fi.polar.polarflow.util.b.l) {
            this.e.postDelayed(this.c, fi.polar.polarflow.util.b.l - var1);
         } else {
            this.c.run();
         }

         this.k = true;
      }

   }

   private void l() {
      fi.polar.polarflow.util.d.c("TrainingService", "stopPeriodicSaving");
      this.e.removeCallbacks(this.c);
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

   public void a() {
      if (this.l == 1) {
         fi.polar.polarflow.util.d.c("TrainingService", "stopSession");
         this.l = 2;
         this.l();
         this.g.b();
         if (this.h != null) {
            this.h.b();
            this.h = null;
         }

         this.f.a((fi.polar.polarflow.c_sensor_package.k)(new s(this)));
      }

   }

   public long b() {
      long var1;
      if (this.l == 1) {
         fi.polar.polarflow.util.d.c("TrainingService", "pauseSession()");
         var1 = this.i.pauseSession();
         this.f.b();
         this.j();
      } else {
         var1 = 0L;
      }

      return var1;
   }

   public void c() {
      if (this.l == 1) {
         fi.polar.polarflow.util.d.c("TrainingService", "resumeSession()");
         this.i.resumeSession();
         this.f.c();
         this.j();
      }

   }

   public void d() {
      this.a(this.i.getTrainingDataRefs(true), (at)null);
   }

   public List e() {
      return this.i.getAutoLaps();
   }

   public List f() {
      return this.i.getManualLaps();
   }

   public IBinder onBind(Intent var1) {
      fi.polar.polarflow.util.d.c("TrainingService", "onBind");
      return this.d;
   }

   public void onCreate() {
      fi.polar.polarflow.util.d.c("TrainingService", "onCreate()");
      this.j = android.support.v4.c.g.a(this);
      this.f = new fi.polar.polarflow.c_sensor_package.o(this);
      this.g = new a(this);
      this.g.a(this.b);
      IntentFilter var1 = new IntentFilter();
      var1.addAction("TrainingService.action.START_SESSION");
      var1.addAction("TrainingService.action.STOP_SESSION");
      var1.addAction("TrainingService.action.PAUSE_SESSION");
      var1.addAction("TrainingService.action.RESUME_SESSION");
      var1.addAction("DailyActivityService.action.TRAINING_LOAD_DATA");
      this.j.a(this.a, var1);
      this.i = Training.getInstance();
      this.l = 0;
   }

   public void onDestroy() {
      fi.polar.polarflow.util.d.c("TrainingService", "onDestroy()");
      this.j.a(this.a);
      this.f.a();
      this.g.b(this.b);
      this.g.b();
      if (this.h != null) {
         this.h.b();
      }

      this.e.removeCallbacksAndMessages((Object)null);
      super.onDestroy();
   }

   public int onStartCommand(Intent var1, int var2, int var3) {
      fi.polar.polarflow.util.d.c("TrainingService", "onStartCommand() startId: " + var3);
      return 1;
   }
}
