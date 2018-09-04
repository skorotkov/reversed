package fi.polar.polarflow.ui.exeview.laps.a_package.a_package;

import android.content.Intent;
import android.view.View;
import fi.polar.polarflow.data.Lap;
import fi.polar.polarflow.ui.a_package.i;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class c extends i {
   private long g;
   private long h;

   public c() {
      super(100);
   }

   public void a(Intent var1) {
      super.a((Intent)var1);
      if ("ExerciseLapCalc.ACTION_AUTO_LAP".equals(var1.getAction())) {
         this.h = ((Lap)var1.getParcelableExtra("ExerciseLapCalc.KEY_LAP")).getSplitTimeMillis();
         this.f();
         this.e();
      }

   }

   public void a(View var1) {
      Intent var2 = this.a((String)"ExerciseLapCalc.ACTION_AUTO_LAP");
      if (var2 != null) {
         this.h = ((Lap)var2.getParcelableExtra("ExerciseLapCalc.KEY_LAP")).getSplitTimeMillis();
      }

      this.g = this.Q.getStartTimeFromBoot() + this.Q.getPausedTime();
      super.a(var1);
   }

   public void a(Collection var1) {
      super.a(var1);
      Intent var2 = e(var1, "ExerciseLapCalc.ACTION_AUTO_LAP");
      if (var2 != null) {
         this.h = ((Lap)var2.getParcelableExtra("ExerciseLapCalc.KEY_LAP")).getSplitTimeMillis();
         this.e();
      }

   }

   public void b(long var1) {
      byte var3 = 9;
      long var4 = 0L;
      long var6 = TimeUnit.MILLISECONDS.toMinutes(var1);
      if (var6 < 60L) {
         int var8;
         if (var1 < 0L) {
            var8 = 0;
            var1 = 0L;
            var6 = var4;
         } else {
            var8 = (int)Math.round((double)(var1 - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(var1))) / 1000.0D * 10.0D);
            if (var8 > 9) {
               var8 = var3;
            }
         }

         String var9 = this.c(var6 % 60L);
         String var10 = this.c(TimeUnit.MILLISECONDS.toSeconds(var1) % 60L);
         var10 = var9 + ":" + var10;
         this.c.setText(var10);
         this.a.setText(String.valueOf(var8));
      } else {
         super.b(var1);
      }

   }

   public void d(long var1) {
      this.r();
      this.b(var1);
   }

   public void e() {
      this.a(this.g + this.h);
   }
}
