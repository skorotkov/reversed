package android.support.v7.widget;

import android.annotation.TargetApi;
import android.os.SystemClock;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.View.OnTouchListener;

public abstract class by implements OnTouchListener {
   private final float a;
   private final int b;
   final View c;
   private final int d;
   private Runnable e;
   private Runnable f;
   private boolean g;
   private int h;
   private final int[] i = new int[2];

   public by(View var1) {
      this.c = var1;
      var1.setLongClickable(true);
      if (VERSION.SDK_INT >= 12) {
         this.a(var1);
      } else {
         this.b(var1);
      }

      this.a = (float)ViewConfiguration.get(var1.getContext()).getScaledTouchSlop();
      this.b = ViewConfiguration.getTapTimeout();
      this.d = (this.b + ViewConfiguration.getLongPressTimeout()) / 2;
   }

   // $FF: synthetic method
   static void a(by var0) {
      var0.e();
   }

   @TargetApi(12)
   private void a(View var1) {
      var1.addOnAttachStateChangeListener(new bz(this));
   }

   private boolean a(MotionEvent var1) {
      boolean var2 = false;
      View var3 = this.c;
      boolean var4;
      if (!var3.isEnabled()) {
         var4 = var2;
      } else {
         switch(android.support.v4.view.bg.a(var1)) {
         case 0:
            this.h = var1.getPointerId(0);
            if (this.e == null) {
               this.e = new cb(this);
            }

            var3.postDelayed(this.e, (long)this.b);
            if (this.f == null) {
               this.f = new cc(this);
            }

            var3.postDelayed(this.f, (long)this.d);
            var4 = var2;
            break;
         case 1:
         case 3:
            this.f();
            var4 = var2;
            break;
         case 2:
            int var5 = var1.findPointerIndex(this.h);
            var4 = var2;
            if (var5 >= 0) {
               var4 = var2;
               if (!a(var3, var1.getX(var5), var1.getY(var5), this.a)) {
                  this.f();
                  var3.getParent().requestDisallowInterceptTouchEvent(true);
                  var4 = true;
               }
            }
            break;
         default:
            var4 = var2;
         }
      }

      return var4;
   }

   private static boolean a(View var0, float var1, float var2, float var3) {
      boolean var4;
      if (var1 >= -var3 && var2 >= -var3 && var1 < (float)(var0.getRight() - var0.getLeft()) + var3 && var2 < (float)(var0.getBottom() - var0.getTop()) + var3) {
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   private boolean a(View var1, MotionEvent var2) {
      int[] var3 = this.i;
      var1.getLocationOnScreen(var3);
      var2.offsetLocation((float)(-var3[0]), (float)(-var3[1]));
      return true;
   }

   private void b(View var1) {
      var1.getViewTreeObserver().addOnGlobalLayoutListener(new ca(this));
   }

   private boolean b(MotionEvent var1) {
      boolean var2 = false;
      View var3 = this.c;
      android.support.v7.view.menu.ah var4 = this.a();
      boolean var5 = var2;
      if (var4 != null) {
         if (!var4.d()) {
            var5 = var2;
         } else {
            bv var8 = (bv)var4.e();
            var5 = var2;
            if (var8 != null) {
               var5 = var2;
               if (var8.isShown()) {
                  MotionEvent var6 = MotionEvent.obtainNoHistory(var1);
                  this.b(var3, var6);
                  this.a(var8, var6);
                  var5 = var8.a(var6, this.h);
                  var6.recycle();
                  int var7 = android.support.v4.view.bg.a(var1);
                  boolean var9;
                  if (var7 != 1 && var7 != 3) {
                     var9 = true;
                  } else {
                     var9 = false;
                  }

                  if (var5 && var9) {
                     var5 = true;
                  } else {
                     var5 = false;
                  }
               }
            }
         }
      }

      return var5;
   }

   private boolean b(View var1, MotionEvent var2) {
      int[] var3 = this.i;
      var1.getLocationOnScreen(var3);
      var2.offsetLocation((float)var3[0], (float)var3[1]);
      return true;
   }

   private void e() {
      this.g = false;
      this.h = -1;
      if (this.e != null) {
         this.c.removeCallbacks(this.e);
      }

   }

   private void f() {
      if (this.f != null) {
         this.c.removeCallbacks(this.f);
      }

      if (this.e != null) {
         this.c.removeCallbacks(this.e);
      }

   }

   public abstract android.support.v7.view.menu.ah a();

   protected boolean b() {
      android.support.v7.view.menu.ah var1 = this.a();
      if (var1 != null && !var1.d()) {
         var1.a();
      }

      return true;
   }

   protected boolean c() {
      android.support.v7.view.menu.ah var1 = this.a();
      if (var1 != null && var1.d()) {
         var1.c();
      }

      return true;
   }

   void d() {
      this.f();
      View var1 = this.c;
      if (var1.isEnabled() && !var1.isLongClickable() && this.b()) {
         var1.getParent().requestDisallowInterceptTouchEvent(true);
         long var2 = SystemClock.uptimeMillis();
         MotionEvent var4 = MotionEvent.obtain(var2, var2, 3, 0.0F, 0.0F, 0);
         var1.onTouchEvent(var4);
         var4.recycle();
         this.g = true;
      }

   }

   public boolean onTouch(View var1, MotionEvent var2) {
      boolean var3 = false;
      boolean var4 = this.g;
      boolean var5;
      if (var4) {
         if (!this.b(var2) && this.c()) {
            var5 = false;
         } else {
            var5 = true;
         }
      } else {
         if (this.a(var2) && this.b()) {
            var5 = true;
         } else {
            var5 = false;
         }

         if (var5) {
            long var6 = SystemClock.uptimeMillis();
            MotionEvent var8 = MotionEvent.obtain(var6, var6, 3, 0.0F, 0.0F, 0);
            this.c.onTouchEvent(var8);
            var8.recycle();
         }
      }

      this.g = var5;
      if (!var5) {
         var5 = var3;
         if (!var4) {
            return var5;
         }
      }

      var5 = true;
      return var5;
   }
}
