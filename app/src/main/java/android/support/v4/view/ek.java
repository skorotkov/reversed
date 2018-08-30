package android.support.v4.view;

import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.view.View;

@TargetApi(16)
class ek {
   public static void a(View var0, em var1) {
      if (var1 != null) {
         var0.animate().setListener(new el(var1, var0));
      } else {
         var0.animate().setListener((AnimatorListener)null);
      }

   }
}
