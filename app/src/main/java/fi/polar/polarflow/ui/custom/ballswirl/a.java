package fi.polar.polarflow.ui.custom.ballswirl;

import android.graphics.Point;

class a {
   private final Point[] a;
   private final int b;
   private int c;

   public a(Point[] var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.c = 0;
   }

   public int a() {
      int var1;
      if (this.c < this.a.length) {
         var1 = this.a[this.c].x;
      } else {
         var1 = 0;
      }

      return var1;
   }

   public void a(int var1, int var2) {
      if (this.a(var1)) {
         this.c += var2;
      }

   }

   public boolean a(int var1) {
      boolean var2;
      if (var1 >= this.b && this.c < this.a.length) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public int b() {
      int var1;
      if (this.c < this.a.length) {
         var1 = this.a[this.c].y;
      } else {
         var1 = 0;
      }

      return var1;
   }

   public void c() {
      this.c = 0;
   }
}
