package android.support.v4.view;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;

@TargetApi(16)
class cq {
   public static void a(View var0, int var1) {
      var0.setImportantForAccessibility(var1);
   }

   public static void a(View var0, Drawable var1) {
      var0.setBackground(var1);
   }

   public static void a(View var0, Runnable var1) {
      var0.postOnAnimation(var1);
   }

   public static void a(View var0, Runnable var1, long var2) {
      var0.postOnAnimationDelayed(var1, var2);
   }

   public static boolean a(View var0) {
      return var0.hasTransientState();
   }

   public static void b(View var0) {
      var0.postInvalidateOnAnimation();
   }

   public static int c(View var0) {
      return var0.getImportantForAccessibility();
   }

   public static int d(View var0) {
      return var0.getMinimumWidth();
   }

   public static int e(View var0) {
      return var0.getMinimumHeight();
   }

   public static void f(View var0) {
      var0.requestFitSystemWindows();
   }

   public static boolean g(View var0) {
      return var0.hasOverlappingRendering();
   }
}
