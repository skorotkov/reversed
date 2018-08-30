package android.support.v4.a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.View;

@TargetApi(12)
class d implements b {
   private TimeInterpolator a;

   public void a(View var1) {
      if (this.a == null) {
         this.a = (new ValueAnimator()).getInterpolator();
      }

      var1.animate().setInterpolator(this.a);
   }
}
