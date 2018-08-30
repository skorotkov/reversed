package fi.polar.polarflow.ui.exeview.shader;

import android.view.View;
import android.view.View.OnClickListener;

class t implements OnClickListener {
   // $FF: synthetic field
   final s a;

   t(s var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      s var3 = this.a;
      boolean var2;
      if (!this.a.h()) {
         var2 = true;
      } else {
         var2 = false;
      }

      var3.b(var2);
   }
}
