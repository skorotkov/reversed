package fi.polar.polarflow.ui.myday.a_package;

import android.view.View;
import android.view.View.OnClickListener;

class b implements OnClickListener {
   // $FF: synthetic field
   final a a;

   b(a var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      Object var2 = var1.getTag();
      if (var2 instanceof Integer && fi.polar.polarflow.ui.myday.a_package.a.a(this.a) != null) {
         fi.polar.polarflow.ui.myday.a_package.a.a(this.a).a(this.a, (Integer)var2);
      }

      this.a.dismiss();
   }
}
