package fi.polar.polarflow.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class z implements OnTouchListener {
   // $FF: synthetic field
   final v a;

   z(v var1) {
      this.a = var1;
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      v.a(this.a);
      if (var2.getAction() == 1) {
         var1.performClick();
      }

      return true;
   }
}
