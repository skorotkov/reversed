package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class cs extends es {
   protected final LinearInterpolator a = new LinearInterpolator();
   protected final DecelerateInterpolator b = new DecelerateInterpolator();
   protected PointF c;
   protected int d = 0;
   protected int e = 0;
   private final float f;

   public cs(Context var1) {
      this.f = this.a(var1.getResources().getDisplayMetrics());
   }

   private int a(int var1, int var2) {
      int var3 = var1 - var2;
      var2 = var3;
      if (var1 * var3 <= 0) {
         var2 = 0;
      }

      return var2;
   }

   protected float a(DisplayMetrics var1) {
      return 25.0F / (float)var1.densityDpi;
   }

   protected int a(int var1) {
      return (int)Math.ceil((double)this.b(var1) / 0.3356D);
   }

   public int a(int var1, int var2, int var3, int var4, int var5) {
      switch(var5) {
      case -1:
         var1 = var3 - var1;
         break;
      case 0:
         var3 -= var1;
         var1 = var3;
         if (var3 <= 0) {
            var2 = var4 - var2;
            var1 = var2;
            if (var2 >= 0) {
               var1 = 0;
            }
         }
         break;
      case 1:
         var1 = var4 - var2;
         break;
      default:
         throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
      }

      return var1;
   }

   public int a(View var1, int var2) {
      ec var3 = this.e();
      if (var3 != null && var3.e()) {
         ef var4 = (ef)var1.getLayoutParams();
         var2 = this.a(var3.i(var1) - var4.topMargin, var3.k(var1) + var4.bottomMargin, var3.E(), var3.C() - var3.G(), var2);
      } else {
         var2 = 0;
      }

      return var2;
   }

   protected void a() {
   }

   protected void a(int var1, int var2, ev var3, et var4) {
      if (this.j() == 0) {
         this.f();
      } else {
         this.d = this.a(this.d, var1);
         this.e = this.a(this.e, var2);
         if (this.d == 0 && this.e == 0) {
            this.a(var4);
         }
      }

   }

   protected void a(et var1) {
      PointF var2 = this.c(this.i());
      if (var2 != null && (var2.x != 0.0F || var2.y != 0.0F)) {
         this.a((PointF)var2);
         this.c = var2;
         this.d = (int)(var2.x * 10000.0F);
         this.e = (int)(var2.y * 10000.0F);
         int var3 = this.b(10000);
         var1.a((int)((float)this.d * 1.2F), (int)((float)this.e * 1.2F), (int)((float)var3 * 1.2F), this.a);
      } else {
         var1.a(this.i());
         this.f();
      }

   }

   protected void a(View var1, ev var2, et var3) {
      int var4 = this.b(var1, this.c());
      int var5 = this.a(var1, this.d());
      int var6 = this.a((int)Math.sqrt((double)(var4 * var4 + var5 * var5)));
      if (var6 > 0) {
         var3.a(-var4, -var5, var6, this.b);
      }

   }

   protected int b(int var1) {
      return (int)Math.ceil((double)((float)Math.abs(var1) * this.f));
   }

   public int b(View var1, int var2) {
      ec var3 = this.e();
      if (var3 != null && var3.d()) {
         ef var4 = (ef)var1.getLayoutParams();
         var2 = this.a(var3.h(var1) - var4.leftMargin, var3.j(var1) + var4.rightMargin, var3.D(), var3.B() - var3.F(), var2);
      } else {
         var2 = 0;
      }

      return var2;
   }

   protected void b() {
      this.e = 0;
      this.d = 0;
      this.c = null;
   }

   protected int c() {
      byte var1;
      if (this.c != null && this.c.x != 0.0F) {
         if (this.c.x > 0.0F) {
            var1 = 1;
         } else {
            var1 = -1;
         }
      } else {
         var1 = 0;
      }

      return var1;
   }

   public PointF c(int var1) {
      ec var2 = this.e();
      PointF var3;
      if (var2 instanceof eu) {
         var3 = ((eu)var2).d(var1);
      } else {
         Log.w("LinearSmoothScroller", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + eu.class.getCanonicalName());
         var3 = null;
      }

      return var3;
   }

   protected int d() {
      byte var1;
      if (this.c != null && this.c.y != 0.0F) {
         if (this.c.y > 0.0F) {
            var1 = 1;
         } else {
            var1 = -1;
         }
      } else {
         var1 = 0;
      }

      return var1;
   }
}
