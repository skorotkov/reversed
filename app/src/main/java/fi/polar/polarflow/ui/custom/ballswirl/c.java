package fi.polar.polarflow.ui.custom.ballswirl;

import android.graphics.Point;

class c {
   public static Point[] a(d var0, int var1) {
      float var2 = var0.c() / (float)var1;
      Point[] var3 = new Point[var1];

      for(int var4 = 0; var4 < var1; ++var4) {
         var3[var4] = new Point(var0.d(), var0.e());
         float var5 = var2 / var0.b();
         var0.a(var0.a() - var5);
      }

      return var3;
   }

   public static Point[] a(Point[] var0) {
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         Point var3 = var0[var2];
         var3.set(-var3.y, var3.x);
      }

      return var0;
   }

   public static Point[] b(Point[] var0) {
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         Point var3 = var0[var2];
         var3.set(var3.y, -var3.x);
      }

      return var0;
   }
}
