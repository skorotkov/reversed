package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

class k implements OnClickListener {
   // $FF: synthetic field
   final GpsSensorView a;

   k(GpsSensorView var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      boolean var2 = false;
      if (GpsSensorView.a(this.a) != null) {
         var2 = GpsSensorView.a(this.a).a(var1);
      }

      if (!var2) {
         Context var3 = var1.getContext();
         if (this.a.getState() == 2 && GpsSensorView.b(this.a).a()) {
            this.a.a(var3).show();
         }
      }

   }
}
