package fi.polar.polarflow.ui.myheartrate;

import android.view.View;
import fi.polar.polarflow.ui.custom.RotateImageView;

class c implements Runnable {
   // $FF: synthetic field
   final View a;
   // $FF: synthetic field
   final MyHeartRateActivity b;

   c(MyHeartRateActivity var1, View var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      if (this.a instanceof RotateImageView) {
         ((RotateImageView)this.a).b();
      }

   }
}
