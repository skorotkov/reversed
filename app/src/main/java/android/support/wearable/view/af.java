package android.support.wearable.view;

import android.view.animation.Interpolator;

final class af implements Interpolator {
   private final float a;

   public af() {
      this(4.0F);
   }

   public af(float var1) {
      this.a = var1;
   }

   public float getInterpolation(float var1) {
      double var2 = Math.exp((double)(2.0F * var1 * this.a));
      return (float)((var2 - 1.0D) / (var2 + 1.0D)) * (1.0F / this.a);
   }
}
