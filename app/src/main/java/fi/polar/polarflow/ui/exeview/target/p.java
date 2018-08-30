package fi.polar.polarflow.ui.exeview.target;

import android.view.View;
import android.view.View.OnClickListener;

class p implements OnClickListener {
   // $FF: synthetic field
   final n a;

   p(n var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if (!n.a(this.a)) {
         this.a.dismiss();
      }

   }
}
