package fi.polar.polarflow.ui.exeview;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class af extends ViewOutlineProvider {
   // $FF: synthetic field
   final ab a;

   af(ab var1) {
      this.a = var1;
   }

   public void getOutline(View var1, Outline var2) {
      int var3 = this.a.getResources().getDimensionPixelSize(2131362205);
      var2.setOval(0, 0, var3, var3);
      var2.offset(-3, -3);
   }
}
