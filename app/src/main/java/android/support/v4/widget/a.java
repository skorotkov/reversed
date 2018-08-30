package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.bg;
import android.support.v4.view.bz;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.View.OnTouchListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

public abstract class a implements OnTouchListener {
   private static final int r = ViewConfiguration.getTapTimeout();
   final b a = new b();
   final View b;
   boolean c;
   boolean d;
   boolean e;
   private final Interpolator f = new AccelerateInterpolator();
   private Runnable g;
   private float[] h = new float[]{0.0F, 0.0F};
   private float[] i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
   private int j;
   private int k;
   private float[] l = new float[]{0.0F, 0.0F};
   private float[] m = new float[]{0.0F, 0.0F};
   private float[] n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
   private boolean o;
   private boolean p;
   private boolean q;

   public a(View var1) {
      this.b = var1;
      DisplayMetrics var4 = Resources.getSystem().getDisplayMetrics();
      int var2 = (int)(1575.0F * var4.density + 0.5F);
      int var3 = (int)(var4.density * 315.0F + 0.5F);
      this.a((float)var2, (float)var2);
      this.b((float)var3, (float)var3);
      this.a(1);
      this.e(Float.MAX_VALUE, Float.MAX_VALUE);
      this.d(0.2F, 0.2F);
      this.c(1.0F, 1.0F);
      this.b(r);
      this.c(500);
      this.d(500);
   }

   static float a(float var0, float var1, float var2) {
      if (var0 <= var2) {
         if (var0 < var1) {
            var2 = var1;
         } else {
            var2 = var0;
         }
      }

      return var2;
   }

   private float a(float var1, float var2, float var3, float var4) {
      float var5 = 0.0F;
      var3 = a(var1 * var2, 0.0F, var3);
      var1 = this.f(var4, var3);
      var2 = this.f(var2 - var4, var3) - var1;
      if (var2 < 0.0F) {
         var1 = -this.f.getInterpolation(-var2);
      } else {
         var1 = var5;
         if (var2 <= 0.0F) {
            return var1;
         }

         var1 = this.f.getInterpolation(var2);
      }

      var1 = a(var1, -1.0F, 1.0F);
      return var1;
   }

   private float a(int var1, float var2, float var3, float var4) {
      float var5 = 0.0F;
      var2 = this.a(this.h[var1], var3, this.i[var1], var2);
      if (var2 == 0.0F) {
         var2 = var5;
      } else {
         float var6 = this.l[var1];
         var3 = this.m[var1];
         var5 = this.n[var1];
         var4 = var6 * var4;
         if (var2 > 0.0F) {
            var2 = a(var2 * var4, var3, var5);
         } else {
            var2 = -a(-var2 * var4, var3, var5);
         }
      }

      return var2;
   }

   static int a(int var0, int var1, int var2) {
      if (var0 <= var2) {
         if (var0 < var1) {
            var2 = var1;
         } else {
            var2 = var0;
         }
      }

      return var2;
   }

   private void c() {
      if (this.g == null) {
         this.g = new c(this);
      }

      this.e = true;
      this.c = true;
      if (!this.o && this.k > 0) {
         bz.a(this.b, this.g, (long)this.k);
      } else {
         this.g.run();
      }

      this.o = true;
   }

   private void d() {
      if (this.c) {
         this.e = false;
      } else {
         this.a.b();
      }

   }

   private float f(float var1, float var2) {
      float var3 = 0.0F;
      float var4;
      if (var2 == 0.0F) {
         var4 = var3;
      } else {
         switch(this.j) {
         case 0:
         case 1:
            var4 = var3;
            if (var1 < var2) {
               if (var1 >= 0.0F) {
                  var4 = 1.0F - var1 / var2;
               } else {
                  var4 = var3;
                  if (this.e) {
                     var4 = var3;
                     if (this.j == 1) {
                        var4 = 1.0F;
                     }
                  }
               }
            }
            break;
         case 2:
            var4 = var3;
            if (var1 < 0.0F) {
               var4 = var1 / -var2;
            }
            break;
         default:
            var4 = var3;
         }
      }

      return var4;
   }

   public a a(float var1, float var2) {
      this.n[0] = var1 / 1000.0F;
      this.n[1] = var2 / 1000.0F;
      return this;
   }

   public a a(int var1) {
      this.j = var1;
      return this;
   }

   public a a(boolean var1) {
      if (this.p && !var1) {
         this.d();
      }

      this.p = var1;
      return this;
   }

   public abstract void a(int var1, int var2);

   boolean a() {
      b var1 = this.a;
      int var2 = var1.f();
      int var3 = var1.e();
      boolean var4;
      if ((var2 == 0 || !this.f(var2)) && (var3 == 0 || !this.e(var3))) {
         var4 = false;
      } else {
         var4 = true;
      }

      return var4;
   }

   public a b(float var1, float var2) {
      this.m[0] = var1 / 1000.0F;
      this.m[1] = var2 / 1000.0F;
      return this;
   }

   public a b(int var1) {
      this.k = var1;
      return this;
   }

   void b() {
      long var1 = SystemClock.uptimeMillis();
      MotionEvent var3 = MotionEvent.obtain(var1, var1, 3, 0.0F, 0.0F, 0);
      this.b.onTouchEvent(var3);
      var3.recycle();
   }

   public a c(float var1, float var2) {
      this.l[0] = var1 / 1000.0F;
      this.l[1] = var2 / 1000.0F;
      return this;
   }

   public a c(int var1) {
      this.a.a(var1);
      return this;
   }

   public a d(float var1, float var2) {
      this.h[0] = var1;
      this.h[1] = var2;
      return this;
   }

   public a d(int var1) {
      this.a.b(var1);
      return this;
   }

   public a e(float var1, float var2) {
      this.i[0] = var1;
      this.i[1] = var2;
      return this;
   }

   public abstract boolean e(int var1);

   public abstract boolean f(int var1);

   public boolean onTouch(View var1, MotionEvent var2) {
      boolean var3 = true;
      boolean var4 = false;
      if (!this.p) {
         var3 = var4;
      } else {
         switch(bg.a(var2)) {
         case 0:
            this.d = true;
            this.o = false;
         case 2:
            float var5 = this.a(0, var2.getX(), (float)var1.getWidth(), (float)this.b.getWidth());
            float var6 = this.a(1, var2.getY(), (float)var1.getHeight(), (float)this.b.getHeight());
            this.a.a(var5, var6);
            if (!this.e && this.a()) {
               this.c();
            }
            break;
         case 1:
         case 3:
            this.d();
         }

         if (!this.q || !this.e) {
            var3 = false;
         }
      }

      return var3;
   }
}
