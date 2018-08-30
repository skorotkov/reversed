package android.support.v7.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

class fp extends TouchDelegate {
   private final View a;
   private final Rect b;
   private final Rect c;
   private final Rect d;
   private final int e;
   private boolean f;

   public fp(Rect var1, Rect var2, View var3) {
      super(var1, var3);
      this.e = ViewConfiguration.get(var3.getContext()).getScaledTouchSlop();
      this.b = new Rect();
      this.d = new Rect();
      this.c = new Rect();
      this.a(var1, var2);
      this.a = var3;
   }

   public void a(Rect var1, Rect var2) {
      this.b.set(var1);
      this.d.set(var1);
      this.d.inset(-this.e, -this.e);
      this.c.set(var2);
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2 = true;
      boolean var3 = false;
      int var4 = (int)var1.getX();
      int var5 = (int)var1.getY();
      boolean var6;
      boolean var7;
      switch(var1.getAction()) {
      case 0:
         if (this.b.contains(var4, var5)) {
            this.f = true;
            var6 = true;
            var7 = var2;
            break;
         }
      default:
         var6 = false;
         var7 = var2;
         break;
      case 1:
      case 2:
         boolean var8 = this.f;
         var7 = var2;
         var6 = var8;
         if (var8) {
            var7 = var2;
            var6 = var8;
            if (!this.d.contains(var4, var5)) {
               var7 = false;
               var6 = var8;
            }
         }
         break;
      case 3:
         var6 = this.f;
         this.f = false;
         var7 = var2;
      }

      if (var6) {
         if (var7 && !this.c.contains(var4, var5)) {
            var1.setLocation((float)(this.a.getWidth() / 2), (float)(this.a.getHeight() / 2));
         } else {
            var1.setLocation((float)(var4 - this.c.left), (float)(var5 - this.c.top));
         }

         var3 = this.a.dispatchTouchEvent(var1);
      }

      return var3;
   }
}
