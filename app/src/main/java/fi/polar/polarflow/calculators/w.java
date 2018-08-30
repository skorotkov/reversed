package fi.polar.polarflow.calculators;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.Sport;

public class w implements ae, ah, al, y {
   private AlarmManager a;
   private PendingIntent b;
   private final android.support.v4.c.g c;
   private final int d;
   private long e;
   private int f;
   private float g;
   private int h;
   private final Training i;
   private final BroadcastReceiver j;

   public w(Context var1) {
      this(var1, (Training)null, (AlarmManager)null);
   }

   public w(Context var1, Training var2, AlarmManager var3) {
      this.h = 0;
      this.j = new x(this);
      this.c = android.support.v4.c.g.a(var1);
      if (var2 == null) {
         var2 = Training.getInstance();
      }

      this.i = var2;
      this.d = this.i.getTrainingSessionTarget().getExerciseTarget().getVolumeTargetType();
      if (var3 != null) {
         this.a = var3;
      } else {
         this.a = (AlarmManager)var1.getApplicationContext().getSystemService("alarm");
      }

      this.a(var1);
      fi.polar.polarflow.util.d.c("ExerciseVolumeTargetCalc", "Training volume target " + this.d);
      IntentFilter var4 = new IntentFilter();
      switch(this.d) {
      case 0:
         this.e = this.i.getTrainingSessionTarget().getExerciseTarget().getVolumeTargetDuration();
         var4.addAction("fi.polar.polarflow.action.VOLUME_TARGET_ALARM_TRIGGERED");
         this.e();
         break;
      case 1:
         this.g = this.i.getTrainingSessionTarget().getExerciseTarget().getVolumeTargetDistance();
         if (Sport.isSwimmingSport(this.i.getSportId())) {
            var4.addAction("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA");
         } else {
            var4.addAction("fi.polar.polarflow.ACTION_LOCATION_DATA");
         }
         break;
      case 2:
         this.f = this.i.getTrainingSessionTarget().getExerciseTarget().getVolumeTargetCalories();
         var4.addAction("DailyActivityService.action.TRAINING_LOAD_DATA");
         break;
      default:
         fi.polar.polarflow.util.d.e("ExerciseVolumeTargetCalc", "Not supported volume target type!");
      }

      this.c.a(this.j, var4);
   }

   private void a() {
      if (this.d == 0) {
         this.a.cancel(this.b);
      }

   }

   private void a(float var1) {
      if (var1 >= this.g && this.h < 2) {
         if (this.h == 0) {
            this.g *= 2.0F;
         }

         this.f();
      }

   }

   private void a(int var1) {
      if (var1 >= this.f && this.h < 2) {
         if (this.h == 0) {
            this.f *= 2;
         }

         this.f();
      }

   }

   private void a(Context var1) {
      Intent var2 = new Intent(var1.getApplicationContext(), AlarmReceiver.class);
      var2.setAction("fi.polar.polarflow.action.CALCULATOR_ALARM");
      var2.putExtra("fi.polar.polarflow.extra.LOCAL_ACTION", "fi.polar.polarflow.action.VOLUME_TARGET_ALARM_TRIGGERED");
      this.b = PendingIntent.getBroadcast(var1.getApplicationContext(), 1, var2, 268435456);
   }

   // $FF: synthetic method
   static void a(w var0) {
      var0.f();
   }

   // $FF: synthetic method
   static void a(w var0, float var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(w var0, int var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void b(w var0) {
      var0.e();
   }

   private void e() {
      long var1 = this.i.getDurationMs();
      long var3 = this.i.getPausedTime();
      long var5;
      if (this.e > var1) {
         var5 = this.e - var1;
      } else if (this.e * 2L > var1) {
         var5 = this.e * 2L - var1;
      } else {
         var5 = 0L;
      }

      if (var5 > 0L) {
         this.a.setExactAndAllowWhileIdle(2, var5 + var1 + this.i.getStartTimeFromBoot() + var3, this.b);
      }

   }

   private void f() {
      Intent var1 = new Intent("ExerciseVolumeTargetCalc.action.TARGET_REACHED");
      ++this.h;
      if (this.h == 2) {
         var1.putExtra("ExerciseVolumeTargetCalc.key.TARGET_DOUBLED", true);
      }

      this.i.setTrainingSessionTargetDone(true);
      this.i.setExerciseTargetReached(true);
      this.c.a(var1);
   }

   public void b() {
      this.a();
   }

   public void c() {
      if (this.d == 0) {
         this.e();
      }

   }

   public void d() {
      this.a();
      this.c.a(this.j);
   }
}
