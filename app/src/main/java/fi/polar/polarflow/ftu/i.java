package fi.polar.polarflow.ftu;

import android.widget.ImageView;

class i implements Runnable {
   // $FF: synthetic field
   final ImageView a;
   // $FF: synthetic field
   final int b;
   // $FF: synthetic field
   final GridAnimationLayout c;

   i(GridAnimationLayout var1, ImageView var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      this.a.clearAnimation();
      GridAnimationLayout.a(this.c, this.b, false);
   }
}
