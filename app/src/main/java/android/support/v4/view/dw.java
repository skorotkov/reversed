package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class dw implements dt {
   public void a(ViewParent var1, View var2) {
      if (var1 instanceof bo) {
         ((bo)var1).onStopNestedScroll(var2);
      }

   }

   public void a(ViewParent var1, View var2, int var3, int var4, int var5, int var6) {
      if (var1 instanceof bo) {
         ((bo)var1).onNestedScroll(var2, var3, var4, var5, var6);
      }

   }

   public void a(ViewParent var1, View var2, int var3, int var4, int[] var5) {
      if (var1 instanceof bo) {
         ((bo)var1).onNestedPreScroll(var2, var3, var4, var5);
      }

   }

   public boolean a(ViewParent var1, View var2, float var3, float var4) {
      boolean var5;
      if (var1 instanceof bo) {
         var5 = ((bo)var1).onNestedPreFling(var2, var3, var4);
      } else {
         var5 = false;
      }

      return var5;
   }

   public boolean a(ViewParent var1, View var2, float var3, float var4, boolean var5) {
      if (var1 instanceof bo) {
         var5 = ((bo)var1).onNestedFling(var2, var3, var4, var5);
      } else {
         var5 = false;
      }

      return var5;
   }

   public boolean a(ViewParent var1, View var2, View var3, int var4) {
      boolean var5;
      if (var1 instanceof bo) {
         var5 = ((bo)var1).onStartNestedScroll(var2, var3, var4);
      } else {
         var5 = false;
      }

      return var5;
   }

   public void b(ViewParent var1, View var2, View var3, int var4) {
      if (var1 instanceof bo) {
         ((bo)var1).onNestedScrollAccepted(var2, var3, var4);
      }

   }
}
