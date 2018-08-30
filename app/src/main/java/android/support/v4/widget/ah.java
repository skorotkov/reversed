package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

public final class ah {
   OverScroller a;
   private final boolean b;

   ah(boolean var1, Context var2, Interpolator var3) {
      this.b = var1;
      OverScroller var4;
      if (var3 != null) {
         var4 = new OverScroller(var2, var3);
      } else {
         var4 = new OverScroller(var2);
      }

      this.a = var4;
   }

   public static ah a(Context var0) {
      return a(var0, (Interpolator)null);
   }

   public static ah a(Context var0, Interpolator var1) {
      boolean var2;
      if (VERSION.SDK_INT >= 14) {
         var2 = true;
      } else {
         var2 = false;
      }

      return new ah(var2, var0, var1);
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.a.startScroll(var1, var2, var3, var4);
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      this.a.startScroll(var1, var2, var3, var4, var5);
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.a.fling(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.a.fling(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public boolean a() {
      return this.a.isFinished();
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.a.springBack(var1, var2, var3, var4, var5, var6);
   }

   public int b() {
      return this.a.getCurrX();
   }

   public int c() {
      return this.a.getCurrY();
   }

   public int d() {
      return this.a.getFinalX();
   }

   public int e() {
      return this.a.getFinalY();
   }

   public float f() {
      float var1;
      if (this.b) {
         var1 = ai.a(this.a);
      } else {
         var1 = 0.0F;
      }

      return var1;
   }

   public boolean g() {
      return this.a.computeScrollOffset();
   }

   public void h() {
      this.a.abortAnimation();
   }
}
