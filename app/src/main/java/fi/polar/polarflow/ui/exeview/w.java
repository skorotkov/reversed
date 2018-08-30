package fi.polar.polarflow.ui.exeview;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class w implements OnTouchListener {
   // $FF: synthetic field
   final ExeViewActivity a;

   private w(ExeViewActivity var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   w(ExeViewActivity var1, k var2) {
      this(var1);
   }

   @SuppressLint({"ClickableViewAccessibility"})
   public boolean onTouch(View var1, MotionEvent var2) {
      if (ExeViewActivity.a(this.a) && var2.getActionMasked() == 1 && !ExeViewActivity.r(this.a)) {
         ab var3 = (ab)ExeViewActivity.b(this.a).a(ak.a);
         if (var3 != null) {
            var3.h();
         }
      }

      return false;
   }
}
