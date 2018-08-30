package fi.polar.polarflow.ui.a;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import fi.polar.polarflow.ui.exeview.a.a.bj;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public abstract class ag extends i {
   protected long i;
   protected long j;
   protected float k;
   protected float l;
   protected float m;
   protected float n;

   public ag() {
      super(100);
   }

   private static void a(View var0, int var1) {
      LayoutParams var2 = var0.getLayoutParams();
      var2.width = var1;
      var0.setLayoutParams(var2);
   }

   private void f(long var1) {
      if (bj.c.equals(this.l())) {
         if (var1 < 60L) {
            if (this.e != this.n) {
               this.c.setTextSize(0, this.n);
               this.e = this.n;
            }

            if (this.m != this.k) {
               a(this.a, (int)this.k);
               this.m = this.k;
            }
         } else if (this.m != this.l) {
            a(this.a, (int)this.l);
            this.m = this.l;
         }
      }

   }

   public void a(View var1) {
      if (bj.c.equals(this.l())) {
         this.k = (float)var1.getResources().getDimensionPixelSize(2131362016);
         this.l = (float)var1.getResources().getDimensionPixelSize(2131362017);
         this.m = this.k;
         this.n = (float)var1.getResources().getDimensionPixelSize(2131362015);
      }

      super.a(var1);
   }

   public void b(long var1) {
      int var3 = 9;
      long var4 = 0L;
      long var6 = TimeUnit.MILLISECONDS.toMinutes(var1);
      this.f(var6);
      if (var6 < 60L) {
         if (var1 < 0L) {
            var3 = 0;
            var1 = 0L;
            var6 = var4;
         } else {
            int var8 = (int)Math.round((double)(var1 - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(var1))) / 1000.0D * 10.0D);
            if (var8 <= 9) {
               var3 = var8;
            }
         }

         this.c.setText(String.format(Locale.getDefault(), "%02d:%02d", var6 % 60L, TimeUnit.MILLISECONDS.toSeconds(var1) % 60L));
         this.a.setText(String.format(Locale.getDefault(), "%01d", var3));
      } else {
         super.b(var1);
      }

   }

   protected void d(long var1) {
      this.r();
      this.b(var1);
   }
}
