package fi.polar.polarflow.ui.exewait;

import android.view.View;
import android.view.View.OnClickListener;

class ab implements OnClickListener {
   // $FF: synthetic field
   final x a;

   ab(x var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      fi.polar.polarflow.ui.exewait.a_package.e var2 = fi.polar.polarflow.ui.exewait.a_package.e.d();
      var2.a(this.a);
      var2.show(this.a.getChildFragmentManager(), "pool_selection_dialog");
   }
}
