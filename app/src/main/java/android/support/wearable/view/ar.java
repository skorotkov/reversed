package android.support.wearable.view;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.support.v7.widget.dl;
import android.view.MotionEvent;
import android.view.VelocityTracker;

@TargetApi(23)
class ar {
   VelocityTracker a;
   private float b = 0.0F;
   private float c;
   private float d;
   private float e;
   private float f;
   private float g;
   private float h;
   private boolean i;
   private boolean j;
   private float k;
   private dl l;

   ar() {
      this.c = this.b * this.b;
      this.d = 180.0F;
      this.e = (float)Math.toRadians((double)this.d);
   }

   private static float c(float var0) {
      if ((double)var0 < -3.141592653589793D) {
         var0 = (float)((double)var0 + 6.283185307179586D);
      }

      float var1 = var0;
      if ((double)var0 > 3.141592653589793D) {
         var1 = (float)((double)var0 - 6.283185307179586D);
      }

      return var1;
   }

   void a() {
      this.l = null;
   }

   public void a(float var1) {
      this.d = var1;
      this.e = (float)Math.toRadians((double)this.d);
   }

   void a(dl var1) {
      this.l = var1;
      Point var2 = new Point();
      this.l.getDisplay().getSize(var2);
      this.f = (float)Math.max(var2.x, var2.y) / 2.0F;
      this.g = this.f * this.f;
      this.h = (float)var2.y / this.e;
      this.a = VelocityTracker.obtain();
   }

   boolean a(MotionEvent var1) {
      boolean var2 = true;
      float var3 = var1.getRawX() - this.f;
      float var4 = var1.getRawY() - this.f;
      float var5 = var3 * var3 + var4 * var4;
      MotionEvent var6 = MotionEvent.obtain(var1);
      this.a.addMovement(var6);
      var6.recycle();
      boolean var7;
      int var8;
      switch(var1.getActionMasked()) {
      case 0:
         if (var5 / this.g > this.c) {
            this.i = true;
            var7 = var2;
            return var7;
         }
         break;
      case 1:
         this.i = false;
         this.j = false;
         this.a.computeCurrentVelocity(1000, (float)this.l.getMaxFlingVelocity());
         int var9 = (int)this.a.getYVelocity();
         var8 = var9;
         if (var1.getX() < this.f * 1.5F) {
            var8 = -var9;
         }

         this.a.clear();
         if (Math.abs(var8) > this.l.getMinFlingVelocity()) {
            var7 = this.l.b(0, (int)((float)var8 * 1.5F));
            return var7;
         }
         break;
      case 2:
         if (this.j) {
            var8 = Math.round(c((float)Math.atan2((double)var4, (double)var3) - this.k) * this.h);
            var7 = var2;
            if (var8 != 0) {
               this.l.scrollBy(0, var8);
               this.k += (float)var8 / this.h;
               this.k = c(this.k);
               var7 = var2;
            }

            return var7;
         }

         if (this.i) {
            var4 = var1.getRawX() - this.f;
            var3 = var1.getRawY() - this.f;
            var5 = (float)Math.hypot((double)var4, (double)var3);
            var4 /= var5;
            var5 = var3 / var5;
            this.j = true;
            this.l.invalidate();
            this.k = (float)Math.atan2((double)var5, (double)var4);
            var7 = var2;
            return var7;
         }

         if (var5 / this.g > this.c) {
            this.i = true;
            var7 = var2;
            return var7;
         }
         break;
      case 3:
         if (this.i) {
            this.i = false;
            this.j = false;
            this.l.invalidate();
            var7 = var2;
            return var7;
         }
      }

      var7 = false;
      return var7;
   }

   public float b() {
      return this.d;
   }

   public void b(float var1) {
      this.b = 1.0F - var1;
      this.c = this.b * this.b;
   }

   public float c() {
      return 1.0F - this.b;
   }
}
