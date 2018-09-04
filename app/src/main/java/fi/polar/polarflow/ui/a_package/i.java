package fi.polar.polarflow.ui.a_package;

import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.bj;
import fi.polar.polarflow.ui.exeview.a_package.a_package.br;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public abstract class i extends br {
   private static final long h;
   public TextView a;
   public TextView c;
   public long d;
   protected float e;
   protected float f;
   private float g;

   static {
      h = TimeUnit.HOURS.toMillis(10L);
   }

   public i(int var1) {
      super(var1);
   }

   public int a() {
      int var1;
      switch(j.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968662;
         break;
      case 2:
         var1 = 2130968661;
         break;
      case 3:
         var1 = 2130968660;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   public void a(long var1) {
      this.d = var1;
      this.b(SystemClock.elapsedRealtime() - this.d);
   }

   public void a(View var1) {
      super.a((View)var1);
      this.a = (TextView)var1.findViewById(2131755276);
      this.c = (TextView)var1.findViewById(2131755275);
      if (bj.c.equals(this.l())) {
         this.f = (float)this.c.getResources().getDimensionPixelSize(2131362010);
         this.g = (float)this.c.getResources().getDimensionPixelSize(2131362009);
         this.e = this.f;
      }

      if (this.P != null) {
         this.b(this.P.getLong(q, -1L));
      } else {
         this.e();
         if (this.Q.isRunning() && !this.Q.isPaused()) {
            this.f();
         }
      }

   }

   public void a(Collection var1) {
      if (this.Q.isRunning() && !this.Q.isPaused()) {
         this.e();
      }

   }

   public void b(long var1) {
      long var3;
      if (var1 > fi.polar.polarflow.ui.c.a) {
         var3 = fi.polar.polarflow.ui.c.a;
      } else {
         var3 = var1;
         if (var1 < 0L) {
            var3 = 0L;
         }
      }

      String var6;
      if (bj.c.equals(this.l())) {
         float var5;
         if (var3 < h) {
            var5 = this.f;
         } else {
            var5 = this.g;
         }

         if (this.e != var5) {
            this.c.setTextSize(0, var5);
            this.e = var5;
         }

         var6 = String.valueOf(TimeUnit.MILLISECONDS.toHours(var3));
      } else {
         var6 = this.c(TimeUnit.MILLISECONDS.toHours(var3));
      }

      String var7 = this.c(TimeUnit.MILLISECONDS.toSeconds(var3) % 60L);
      String var8 = this.c(TimeUnit.MILLISECONDS.toMinutes(var3) % 60L);
      this.a.setText(var7);
      var6 = var6 + ":" + var8;
      this.c.setText(var6);
   }

   protected String c(long var1) {
      String var3;
      if (var1 < 10L) {
         var3 = "0" + String.valueOf(var1);
      } else {
         var3 = String.valueOf(var1);
      }

      return var3;
   }

   public void d() {
      if (this.Q.isRunning() && !this.Q.isPaused()) {
         this.e();
      }

   }

   public abstract void e();

   public void f() {
      this.d = SystemClock.elapsedRealtime() - this.Q.getDurationMs();
      super.f();
   }

   public void g() {
      this.e();
   }
}
