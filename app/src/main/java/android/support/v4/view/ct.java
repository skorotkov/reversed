package android.support.v4.view;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsets;
import android.view.View.OnApplyWindowInsetsListener;

@TargetApi(21)
class ct {
   public static Object a(View var0, Object var1) {
      WindowInsets var2 = (WindowInsets)var1;
      WindowInsets var3 = var0.onApplyWindowInsets(var2);
      if (var3 != var2) {
         var1 = new WindowInsets(var3);
      }

      return var1;
   }

   public static String a(View var0) {
      return var0.getTransitionName();
   }

   static void a(View var0, ColorStateList var1) {
      var0.setBackgroundTintList(var1);
      if (VERSION.SDK_INT == 21) {
         Drawable var3 = var0.getBackground();
         boolean var2;
         if (var0.getBackgroundTintList() != null && var0.getBackgroundTintMode() != null) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (var3 != null && var2) {
            if (var3.isStateful()) {
               var3.setState(var0.getDrawableState());
            }

            var0.setBackground(var3);
         }
      }

   }

   static void a(View var0, Mode var1) {
      var0.setBackgroundTintMode(var1);
      if (VERSION.SDK_INT == 21) {
         Drawable var3 = var0.getBackground();
         boolean var2;
         if (var0.getBackgroundTintList() != null && var0.getBackgroundTintMode() != null) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (var3 != null && var2) {
            if (var3.isStateful()) {
               var3.setState(var0.getDrawableState());
            }

            var0.setBackground(var3);
         }
      }

   }

   public static void a(View var0, cv var1) {
      if (var1 == null) {
         var0.setOnApplyWindowInsetsListener((OnApplyWindowInsetsListener)null);
      } else {
         var0.setOnApplyWindowInsetsListener(new cu(var1));
      }

   }

   public static Object b(View var0, Object var1) {
      WindowInsets var2 = (WindowInsets)var1;
      WindowInsets var3 = var0.dispatchApplyWindowInsets(var2);
      if (var3 != var2) {
         var1 = new WindowInsets(var3);
      }

      return var1;
   }

   public static void b(View var0) {
      var0.requestApplyInsets();
   }

   static ColorStateList c(View var0) {
      return var0.getBackgroundTintList();
   }

   static Mode d(View var0) {
      return var0.getBackgroundTintMode();
   }

   public static void e(View var0) {
      var0.stopNestedScroll();
   }
}
