package fi.polar.polarflow.ui.custom;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.dl;
import android.support.v7.widget.em;
import android.support.v7.widget.es;
import android.support.v7.widget.ev;
import android.view.View;

public class WearableLinearLayoutManager extends LinearLayoutManager {
   private final int a;
   private final int b;
   private final ao c;
   private final ObjectAnimator d;
   private int e;
   private int f;
   private int g = 0;
   private int h = 17;
   private es x;
   private int y;
   private boolean z = false;

   WearableLinearLayoutManager(Context var1) {
      super(var1);
      this.d(false);
      int var2 = var1.getResources().getDisplayMetrics().heightPixels;
      this.a = var2 / 2;
      this.b = var2 / 2;
      this.c = new ao(var1, this);
      this.f = var2;
      this.d = new ObjectAnimator();
      this.d.setTarget(this);
      this.d.setProperty(new an(this));
      this.d.setDuration(150L);
      this.d.addListener(new am(this));
   }

   private boolean V() {
      boolean var1 = true;
      if (this.y() > 1) {
         View var2 = this.i(this.y() - 1);
         if (var2.getBottom() <= this.U() && var2.getHeight() < this.U() / 2) {
            return var1;
         }
      }

      var1 = false;
      return var1;
   }

   // $FF: synthetic method
   static int a(WearableLinearLayoutManager var0) {
      return var0.y;
   }

   // $FF: synthetic method
   static void a(WearableLinearLayoutManager var0, int var1) {
      var0.p(var1);
   }

   private static int p(View var0) {
      return var0.getTop() + var0.getPaddingTop() + q(var0) / 2;
   }

   private void p(int var1) {
      this.k(var1 - this.y);
      this.y = var1;
   }

   private static int q(View var0) {
      return var0.getHeight() - var0.getPaddingBottom() - var0.getPaddingTop();
   }

   void O() {
      this.x = null;
   }

   public int P() {
      return this.h;
   }

   int Q() {
      int var1 = 0;
      if (this.P() == 17) {
         var1 = (this.U() - this.i(this.S()).getHeight()) / 2;
      }

      return var1;
   }

   int R() {
      return this.d(this.i(this.S()));
   }

   public int S() {
      int var1;
      if (this.z) {
         var1 = this.T();
      } else {
         int var2 = this.y();
         int var3 = Integer.MAX_VALUE;
         int var4 = this.C() / 2;
         int var5 = 0;
         int var6 = -1;

         while(true) {
            var1 = var6;
            if (var5 >= var2) {
               break;
            }

            var1 = Math.abs(var4 - p(this.i(var5)));
            if (var1 < var3) {
               var3 = var5;
               var6 = var1;
            } else {
               var1 = var6;
               var6 = var3;
               var3 = var1;
            }

            ++var5;
            var1 = var3;
            var3 = var6;
            var6 = var1;
         }
      }

      if (var1 == -1) {
         throw new IllegalStateException("Can't find central view.");
      } else {
         return var1;
      }
   }

   public int T() {
      int var1 = 0;
      int var2 = this.y();
      int var3;
      if (var2 == 0) {
         var3 = -1;
      } else {
         int var4 = (int)Math.abs(this.i(0).getY());
         int var5 = 1;

         while(true) {
            var3 = var1;
            if (var5 >= var2) {
               break;
            }

            var3 = var1;
            if (var4 == 0) {
               break;
            }

            var3 = (int)this.i(var5).getY();
            if (Math.abs(var3) < var4) {
               var4 = var5;
               var1 = var3;
            } else {
               var3 = var4;
               var4 = var1;
               var1 = var3;
            }

            ++var5;
            var3 = var4;
            var4 = var1;
            var1 = var3;
         }
      }

      return var3;
   }

   public int U() {
      return this.e + this.f;
   }

   public void a(int var1) {
      this.h = var1;
   }

   public void a(int var1, int var2) {
      this.e = var1;
      this.f = var2;
   }

   public void a(dl var1, ev var2, int var3) {
      Object var4;
      if (this.x == null) {
         var4 = this.c;
      } else {
         var4 = this.x;
      }

      ((es)var4).d(var3);
      this.a((es)var4);
   }

   public int b(int var1, em var2, ev var3) {
      int var4 = 0;
      View var5;
      if (var1 < 0) {
         var5 = this.i(0);
         if (this.d(var5) <= 0) {
            var4 = this.a;
            var1 = Math.min(-var1 + 0, var4 - var5.getTop());
            var4 = 0 - var1;
            this.k(var1);
         } else {
            var4 = super.b(var1, var2, var3);
         }
      } else if (var1 > 0) {
         var5 = this.i(this.y() - 1);
         if (this.d(var5) == this.I() - 1) {
            var4 = this.b;
            var1 = Math.max(-var1 + 0, var4 - var5.getBottom());
            var4 = 0 - var1;
            this.k(var1);
         } else {
            var4 = super.b(var1, var2, var3);
         }
      }

      return var4;
   }

   void b(es var1) {
      this.x = var1;
   }

   public void c(em var1, ev var2) {
      super.c(var1, var2);
      if (this.g == 0 && this.h == 17 && this.y() > 0 && !this.V()) {
         this.k(this.Q() - this.i(this.S()).getTop());
      }

   }

   public boolean d() {
      return false;
   }

   public void e(boolean var1) {
      this.z = var1;
   }

   public boolean e() {
      return true;
   }

   public void m(int var1) {
      if (var1 != 0 && var1 != 1) {
         throw new IllegalArgumentException("Unsupported gravity mode");
      } else {
         this.g = var1;
      }
   }

   void n(int var1) {
      int var2 = var1;
      if (var1 == 17) {
         var2 = var1;
         if (this.V()) {
            var2 = 8388613;
         }
      }

      label57: {
         View var4;
         switch(var2) {
         case 17:
            var4 = this.i(this.S());
            var1 = var4.getTop();
            if (var1 >= 0 || var4.getBottom() <= this.U()) {
               var1 = (this.U() - var4.getHeight()) / 2 - var1;
               break label57;
            }
            break;
         case 8388613:
            if (this.g == 0) {
               var4 = this.c(this.n());
            } else {
               var4 = this.i(this.S());
            }

            var1 = var4.getBottom();
            var2 = var4.getTop();
            if (var2 >= 0 && var1 - var2 > this.U()) {
               var1 = -var2;
               break label57;
            }

            if (var2 >= 0 || var1 <= this.U()) {
               var1 = this.U() - var1 - this.e;
               break label57;
            }
            break;
         default:
            int var3 = this.l();
            if (this.g == 0) {
               var4 = this.c(var3);
            } else {
               var4 = this.i(this.S());
            }

            int var5 = var4.getBottom();
            var2 = var4.getTop();
            if (var2 >= 0 || var5 <= this.U()) {
               var1 = var2;
               if (var2 <= (var2 - var5) / 2) {
                  var4 = this.c(var3 + 1);
                  var1 = var2;
                  if (var4 != null) {
                     var1 = var4.getTop();
                  }
               }

               var1 = -var1;
               break label57;
            }
         }

         var1 = 0;
      }

      this.o(var1);
   }

   protected void o(int var1) {
      this.d.cancel();
      this.y = 0;
      this.d.setIntValues(new int[]{0, var1});
      this.d.start();
   }
}
