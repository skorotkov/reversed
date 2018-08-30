package fi.polar.polarflow.ui.exeview.target;

import android.view.View;
import android.view.View.OnClickListener;

class f implements OnClickListener {
   // $FF: synthetic field
   final d a;

   f(d var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if (!d.a(this.a)) {
         this.a.dismiss();
      }

   }
}
