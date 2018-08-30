package fi.polar.polarflow.ui.exeview;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class q implements OnTouchListener {
   // $FF: synthetic field
   final ExeViewActivity a;

   q(ExeViewActivity var1) {
      this.a = var1;
   }

   @SuppressLint({"ClickableViewAccessibility"})
   public boolean onTouch(View var1, MotionEvent var2) {
      if (ExeViewActivity.o(this.a) != null) {
         ExeViewActivity.o(this.a).onTouchEvent(var2);
         switch(var2.getAction()) {
         case 0:
            ExeViewActivity.o(this.a).setPressed(true);
            break;
         case 1:
         case 2:
         case 3:
            ExeViewActivity.o(this.a).setPressed(false);
         }
      }

      return false;
   }
}
