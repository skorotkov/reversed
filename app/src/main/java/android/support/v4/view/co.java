package android.support.v4.view;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;

@TargetApi(11)
class co {
   public static float a(View var0) {
      return var0.getAlpha();
   }

   public static int a(int var0, int var1) {
      return View.combineMeasuredStates(var0, var1);
   }

   public static int a(int var0, int var1, int var2) {
      return View.resolveSizeAndState(var0, var1, var2);
   }

   static long a() {
      return ValueAnimator.getFrameDelay();
   }

   public static void a(View var0, float var1) {
      var0.setTranslationX(var1);
   }

   public static void a(View var0, int var1, Paint var2) {
      var0.setLayerType(var1, var2);
   }

   public static void a(View var0, boolean var1) {
      var0.setSaveFromParentEnabled(var1);
   }

   public static int b(View var0) {
      return var0.getLayerType();
   }

   public static void b(View var0, float var1) {
      var0.setTranslationY(var1);
   }

   public static void b(View var0, boolean var1) {
      var0.setActivated(var1);
   }

   public static int c(View var0) {
      return var0.getMeasuredWidthAndState();
   }

   public static void c(View var0, float var1) {
      var0.setAlpha(var1);
   }

   public static int d(View var0) {
      return var0.getMeasuredHeightAndState();
   }

   public static int e(View var0) {
      return var0.getMeasuredState();
   }

   public static float f(View var0) {
      return var0.getTranslationX();
   }

   public static float g(View var0) {
      return var0.getTranslationY();
   }

   public static Matrix h(View var0) {
      return var0.getMatrix();
   }

   public static void i(View var0) {
      var0.jumpDrawablesToCurrentState();
   }
}
