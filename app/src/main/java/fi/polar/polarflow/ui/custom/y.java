package fi.polar.polarflow.ui.custom;

import android.view.animation.Interpolator;

class y implements Interpolator {
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final RotateImageView b;

   y(RotateImageView var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public float getInterpolation(float var1) {
      return (float)Math.floor((double)((float)this.a * var1)) / (float)this.a;
   }
}
