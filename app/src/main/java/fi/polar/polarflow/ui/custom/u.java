package fi.polar.polarflow.ui.custom;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

class u implements OnClickListener {
   // $FF: synthetic field
   final t a;

   u(t var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      RadioButton var2 = (RadioButton)var1;
      this.a.a((Integer)var2.getTag(), true);
   }
}
