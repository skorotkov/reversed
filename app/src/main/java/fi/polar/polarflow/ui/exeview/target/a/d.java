package fi.polar.polarflow.ui.exeview.target.a;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a.a.br;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class d extends br {
   protected TextView a;
   protected TextView c;
   long d;
   private Context e;
   private int f;
   private float g;
   private long h = -1L;

   public d() {
      super(1000);
   }

   private void a(long var1, long var3, TextView var5, TextView var6) {
      if (var3 <= var1) {
         var3 = var1;
      }

      float var7;
      if (var3 < TimeUnit.HOURS.toMillis(10L)) {
         var7 = this.e.getResources().getDimension(2131362171);
      } else {
         var7 = this.e.getResources().getDimension(2131362172);
      }

      int var8 = (int)var7;
      if (var5.getTextSize() != (float)var8) {
         var5.setTextSize(0, (float)var8);
      }

      if (var3 < TimeUnit.MINUTES.toMillis(10L)) {
         var7 = this.e.getResources().getDimension(2131362183);
      } else if (var3 < TimeUnit.HOURS.toMillis(1L)) {
         var7 = this.e.getResources().getDimension(2131362184);
      } else if (var3 < TimeUnit.HOURS.toMillis(10L)) {
         var7 = this.e.getResources().getDimension(2131362185);
      } else {
         var7 = this.e.getResources().getDimension(2131362186);
      }

      if (var6.getTextSize() != (float)((int)var7)) {
         var6.setTextSize(0, (float)((int)var7));
      }

   }

   private void a(boolean var1) {
      this.d = SystemClock.elapsedRealtime() - this.Q.getDurationMs();
      this.a(SystemClock.elapsedRealtime() - this.d, var1);
   }

   private String[] a(long var1, long var3) {
      long var5 = TimeUnit.MILLISECONDS.toHours(var1);
      long var7 = TimeUnit.MILLISECONDS.toMinutes(var1) % 60L;
      var1 = TimeUnit.MILLISECONDS.toSeconds(var1) % 60L;
      long var9 = TimeUnit.MILLISECONDS.toHours(var3);
      long var11 = TimeUnit.MILLISECONDS.toMinutes(var3) % 60L;
      var3 = TimeUnit.MILLISECONDS.toSeconds(var3) % 60L;
      String[] var13 = new String[2];
      String var14;
      if (var5 <= 0L && var9 <= 0L) {
         if (var7 <= 9L && var11 <= 9L) {
            var14 = "%d:%02d";
         } else {
            var14 = "%02d:%02d";
         }

         var13[0] = String.format(var14, var7, var1);
         var13[1] = String.format(var14, var11, var3);
      } else {
         if (var5 <= 9L && var9 <= 9L) {
            var14 = "%d:%02d:%02d";
         } else {
            var14 = "%02d:%02d:%02d";
         }

         var13[0] = String.format(var14, var5, var7, var1);
         var13[1] = String.format(var14, var9, var11, var3);
      }

      return var13;
   }

   private void e() {
      if (this.h == -1L) {
         this.h = this.Q.getTrainingSessionTarget().getExerciseTarget().getVolumeTargetDuration();
      }

   }

   private int s() {
      int var1 = (int)(this.g - fi.polar.polarflow.ui.exeview.target.k.a(this.a, this.c)) / 2;
      if (var1 <= 0) {
         var1 = this.c.getPaddingRight();
      }

      return var1;
   }

   public int a() {
      return 2130968692;
   }

   public void a(long var1, boolean var3) {
      var1 = fi.polar.polarflow.ui.c.a(var1);
      String[] var4 = this.a(var1, this.h);
      String var5 = " / " + var4[1];
      this.a.setText(var4[0]);
      if (var3 || !var5.equals(this.c.getText())) {
         this.c.setText(var5);
      }

      int var6 = var4[0].length() + var5.length();
      if (var6 != this.f) {
         this.a(var1, this.h, this.a, this.c);
         this.f = var6;
         this.c.setPadding(this.c.getPaddingLeft(), this.c.getPaddingTop(), this.s(), this.c.getPaddingBottom());
      }

   }

   public void a(View var1) {
      this.e = var1.getContext();
      this.g = (float)this.e.getResources().getDisplayMetrics().widthPixels;
      this.a = (TextView)var1.findViewById(2131755352);
      this.c = (TextView)var1.findViewById(2131755351);
      this.e();
      this.a(true);
      if (this.Q.isRunning() && !this.Q.isPaused()) {
         super.f();
      }

   }

   public void a(Collection var1) {
      if (this.Q.isRunning() && !this.Q.isPaused()) {
         this.a(true);
      }

   }

   public void d() {
      if (this.Q.isRunning() && !this.Q.isPaused()) {
         this.a(true);
      }

   }

   public void f() {
      this.d = SystemClock.elapsedRealtime() - this.Q.getDurationMs();
      super.f();
   }

   public void g() {
      this.a(false);
   }
}
