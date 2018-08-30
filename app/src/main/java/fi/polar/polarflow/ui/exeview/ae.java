package fi.polar.polarflow.ui.exeview;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class ae implements OnTouchListener {
   // $FF: synthetic field
   final ab a;

   ae(ab var1) {
      this.a = var1;
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      boolean var3 = true;
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "stopButton onTouch " + var2.getAction());
      boolean var4;
      switch(var2.getAction()) {
      case 0:
         this.a.i();
         break;
      case 1:
         this.a.j();
         break;
      default:
         var4 = false;
         return var4;
      }

      var4 = var3;
      if (var2.getAction() == 1) {
         var1.performClick();
         var4 = var3;
      }

      return var4;
   }
}
