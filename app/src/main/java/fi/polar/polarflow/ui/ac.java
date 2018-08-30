package fi.polar.polarflow.ui;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class ac extends Animation {
   // $FF: synthetic field
   final float a;
   // $FF: synthetic field
   final float b;
   // $FF: synthetic field
   final v c;

   ac(v var1, float var2, float var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   protected void applyTransformation(float var1, Transformation var2) {
      v.d(this.c).setY((this.a - this.b) * var1 + this.b);
   }
}
