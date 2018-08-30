package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;

class v implements u {
   private static final int j = ViewConfiguration.getLongPressTimeout();
   private static final int k = ViewConfiguration.getTapTimeout();
   private static final int l = ViewConfiguration.getDoubleTapTimeout();
   final OnGestureListener a;
   OnDoubleTapListener b;
   boolean c;
   boolean d;
   MotionEvent e;
   private int f;
   private int g;
   private int h;
   private int i;
   private final Handler m;
   private boolean n;
   private boolean o;
   private boolean p;
   private MotionEvent q;
   private boolean r;
   private float s;
   private float t;
   private float u;
   private float v;
   private boolean w;
   private VelocityTracker x;

   public v(Context var1, OnGestureListener var2, Handler var3) {
      if (var3 != null) {
         this.m = new w(this, var3);
      } else {
         this.m = new w(this);
      }

      this.a = var2;
      if (var2 instanceof OnDoubleTapListener) {
         this.a((OnDoubleTapListener)var2);
      }

      this.a(var1);
   }

   private void a(Context var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Context must not be null");
      } else if (this.a == null) {
         throw new IllegalArgumentException("OnGestureListener must not be null");
      } else {
         this.w = true;
         ViewConfiguration var4 = ViewConfiguration.get(var1);
         int var2 = var4.getScaledTouchSlop();
         int var3 = var4.getScaledDoubleTapSlop();
         this.h = var4.getScaledMinimumFlingVelocity();
         this.i = var4.getScaledMaximumFlingVelocity();
         this.f = var2 * var2;
         this.g = var3 * var3;
      }
   }

   private boolean a(MotionEvent var1, MotionEvent var2, MotionEvent var3) {
      boolean var4 = false;
      boolean var5;
      if (!this.p) {
         var5 = var4;
      } else {
         var5 = var4;
         if (var3.getEventTime() - var2.getEventTime() <= (long)l) {
            int var6 = (int)var1.getX() - (int)var3.getX();
            int var7 = (int)var1.getY() - (int)var3.getY();
            var5 = var4;
            if (var6 * var6 + var7 * var7 < this.g) {
               var5 = true;
            }
         }
      }

      return var5;
   }

   private void b() {
      this.m.removeMessages(1);
      this.m.removeMessages(2);
      this.m.removeMessages(3);
      this.x.recycle();
      this.x = null;
      this.r = false;
      this.c = false;
      this.o = false;
      this.p = false;
      this.d = false;
      if (this.n) {
         this.n = false;
      }

   }

   private void c() {
      this.m.removeMessages(1);
      this.m.removeMessages(2);
      this.m.removeMessages(3);
      this.r = false;
      this.o = false;
      this.p = false;
      this.d = false;
      if (this.n) {
         this.n = false;
      }

   }

   void a() {
      this.m.removeMessages(3);
      this.d = false;
      this.n = true;
      this.a.onLongPress(this.e);
   }

   public void a(OnDoubleTapListener var1) {
      this.b = var1;
   }

   public boolean a(MotionEvent var1) {
      boolean var2 = false;
      int var3 = var1.getAction();
      if (this.x == null) {
         this.x = VelocityTracker.obtain();
      }

      this.x.addMovement(var1);
      boolean var4;
      if ((var3 & 255) == 6) {
         var4 = true;
      } else {
         var4 = false;
      }

      int var5;
      if (var4) {
         var5 = bg.b(var1);
      } else {
         var5 = -1;
      }

      int var6 = var1.getPointerCount();
      int var7 = 0;
      float var8 = 0.0F;

      float var9;
      for(var9 = 0.0F; var7 < var6; ++var7) {
         if (var5 != var7) {
            var9 += var1.getX(var7);
            var8 += var1.getY(var7);
         }
      }

      int var15;
      if (var4) {
         var15 = var6 - 1;
      } else {
         var15 = var6;
      }

      var9 /= (float)var15;
      float var10 = var8 / (float)var15;
      boolean var11 = var2;
      float var12;
      switch(var3 & 255) {
      case 0:
         label107: {
            if (this.b != null) {
               var11 = this.m.hasMessages(3);
               if (var11) {
                  this.m.removeMessages(3);
               }

               if (this.e != null && this.q != null && var11 && this.a(this.e, this.q, var1)) {
                  this.r = true;
                  var4 = this.b.onDoubleTap(this.e) | false | this.b.onDoubleTapEvent(var1);
                  break label107;
               }

               this.m.sendEmptyMessageDelayed(3, (long)l);
            }

            var4 = false;
         }

         this.s = var9;
         this.u = var9;
         this.t = var10;
         this.v = var10;
         if (this.e != null) {
            this.e.recycle();
         }

         this.e = MotionEvent.obtain(var1);
         this.o = true;
         this.p = true;
         this.c = true;
         this.n = false;
         this.d = false;
         if (this.w) {
            this.m.removeMessages(2);
            this.m.sendEmptyMessageAtTime(2, this.e.getDownTime() + (long)k + (long)j);
         }

         this.m.sendEmptyMessageAtTime(1, this.e.getDownTime() + (long)k);
         var11 = var4 | this.a.onDown(var1);
         break;
      case 1:
         this.c = false;
         MotionEvent var13 = MotionEvent.obtain(var1);
         if (this.r) {
            var11 = this.b.onDoubleTapEvent(var1) | false;
         } else if (this.n) {
            this.m.removeMessages(3);
            this.n = false;
            var11 = false;
         } else if (this.o) {
            var2 = this.a.onSingleTapUp(var1);
            var11 = var2;
            if (this.d) {
               var11 = var2;
               if (this.b != null) {
                  this.b.onSingleTapConfirmed(var1);
                  var11 = var2;
               }
            }
         } else {
            VelocityTracker var14 = this.x;
            var15 = var1.getPointerId(0);
            var14.computeCurrentVelocity(1000, (float)this.i);
            var8 = bu.b(var14, var15);
            var9 = bu.a(var14, var15);
            if (Math.abs(var8) <= (float)this.h && Math.abs(var9) <= (float)this.h) {
               var11 = false;
            } else {
               var11 = this.a.onFling(this.e, var1, var9, var8);
            }
         }

         if (this.q != null) {
            this.q.recycle();
         }

         this.q = var13;
         if (this.x != null) {
            this.x.recycle();
            this.x = null;
         }

         this.r = false;
         this.d = false;
         this.m.removeMessages(1);
         this.m.removeMessages(2);
         break;
      case 2:
         var11 = var2;
         if (!this.n) {
            var12 = this.s - var9;
            var8 = this.t - var10;
            if (this.r) {
               var11 = false | this.b.onDoubleTapEvent(var1);
            } else if (this.o) {
               var15 = (int)(var9 - this.u);
               var5 = (int)(var10 - this.v);
               var15 = var15 * var15 + var5 * var5;
               if (var15 > this.f) {
                  var11 = this.a.onScroll(this.e, var1, var12, var8);
                  this.s = var9;
                  this.t = var10;
                  this.o = false;
                  this.m.removeMessages(3);
                  this.m.removeMessages(1);
                  this.m.removeMessages(2);
               } else {
                  var11 = false;
               }

               if (var15 > this.f) {
                  this.p = false;
               }
            } else {
               if (Math.abs(var12) < 1.0F) {
                  var11 = var2;
                  if (Math.abs(var8) < 1.0F) {
                     return var11;
                  }
               }

               var11 = this.a.onScroll(this.e, var1, var12, var8);
               this.s = var9;
               this.t = var10;
            }
         }
         break;
      case 3:
         this.b();
         var11 = var2;
      case 4:
         break;
      case 5:
         this.s = var9;
         this.u = var9;
         this.t = var10;
         this.v = var10;
         this.c();
         var11 = var2;
         break;
      case 6:
         this.s = var9;
         this.u = var9;
         this.t = var10;
         this.v = var10;
         this.x.computeCurrentVelocity(1000, (float)this.i);
         var5 = bg.b(var1);
         var15 = var1.getPointerId(var5);
         var9 = bu.a(this.x, var15);
         var8 = bu.b(this.x, var15);
         var15 = 0;

         while(true) {
            var11 = var2;
            if (var15 >= var6) {
               return var11;
            }

            if (var15 != var5) {
               var7 = var1.getPointerId(var15);
               var12 = bu.a(this.x, var7);
               if (bu.b(this.x, var7) * var8 + var12 * var9 < 0.0F) {
                  this.x.clear();
                  var11 = var2;
                  return var11;
               }
            }

            ++var15;
         }
      default:
         var11 = var2;
      }

      return var11;
   }
}
