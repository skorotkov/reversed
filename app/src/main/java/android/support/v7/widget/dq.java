package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

class dq implements bf {
   // $FF: synthetic field
   final dl a;

   dq(dl var1) {
      this.a = var1;
   }

   public int a() {
      return this.a.getChildCount();
   }

   public int a(View var1) {
      return this.a.indexOfChild(var1);
   }

   public void a(int var1) {
      View var2 = this.a.getChildAt(var1);
      if (var2 != null) {
         this.a.m(var2);
      }

      this.a.removeViewAt(var1);
   }

   public void a(View var1, int var2) {
      this.a.addView(var1, var2);
      this.a.n(var1);
   }

   public void a(View var1, int var2, LayoutParams var3) {
      ey var4 = dl.e(var1);
      if (var4 != null) {
         if (!var4.s() && !var4.c()) {
            throw new IllegalArgumentException("Called attach on a child which is not detached: " + var4);
         }

         var4.n();
      }

      dl.a(this.a, var1, var2, var3);
   }

   public ey b(View var1) {
      return dl.e(var1);
   }

   public View b(int var1) {
      return this.a.getChildAt(var1);
   }

   public void b() {
      int var1 = this.a();

      for(int var2 = 0; var2 < var1; ++var2) {
         this.a.m(this.b(var2));
      }

      this.a.removeAllViews();
   }

   public void c(int var1) {
      View var2 = this.b(var1);
      if (var2 != null) {
         ey var3 = dl.e(var2);
         if (var3 != null) {
            if (var3.s() && !var3.c()) {
               throw new IllegalArgumentException("called detach on an already detached child " + var3);
            }

            var3.b(256);
         }
      }

      dl.a(this.a, var1);
   }

   public void c(View var1) {
      ey var2 = dl.e(var1);
      if (var2 != null) {
         ey.a(var2, this.a);
      }

   }

   public void d(View var1) {
      ey var2 = dl.e(var1);
      if (var2 != null) {
         ey.b(var2, this.a);
      }

   }
}
