package fi.polar.polarflow.ui;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class aa implements OnGlobalLayoutListener {
   // $FF: synthetic field
   final View a;
   // $FF: synthetic field
   final v b;

   aa(v var1, View var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onGlobalLayout() {
      this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
      v.a(this.b);
   }
}
