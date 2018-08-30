package fi.polar.polarflow.ui.exeview.target;

import android.view.View;
import android.view.View.OnClickListener;

class c implements OnClickListener {
   // $FF: synthetic field
   final a a;

   c(a var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if ((fi.polar.polarflow.ui.exeview.target.a.a(this.a) == null || !fi.polar.polarflow.ui.exeview.target.a.a(this.a).isRunning()) && !fi.polar.polarflow.ui.exeview.target.a.b(this.a)) {
         fi.polar.polarflow.ui.exeview.target.a.c(this.a);
         this.a.dismiss();
      }

   }
}
