package android.support.v4.view;

import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.view.View;

@TargetApi(14)
class ei {
   public static void a(View var0) {
      var0.animate().cancel();
   }

   public static void a(View var0, float var1) {
      var0.animate().alpha(var1);
   }

   public static void a(View var0, long var1) {
      var0.animate().setDuration(var1);
   }

   public static void a(View var0, em var1) {
      if (var1 != null) {
         var0.animate().setListener(new ej(var1, var0));
      } else {
         var0.animate().setListener((AnimatorListener)null);
      }

   }

   public static void b(View var0) {
      var0.animate().start();
   }

   public static void b(View var0, float var1) {
      var0.animate().translationX(var1);
   }

   public static void c(View var0, float var1) {
      var0.animate().translationY(var1);
   }
}
