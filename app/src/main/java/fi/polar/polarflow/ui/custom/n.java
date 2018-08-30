package fi.polar.polarflow.ui.custom;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

class n implements OnLayoutChangeListener {
   // $FF: synthetic field
   final m a;

   n(m var1) {
      this.a = var1;
   }

   public void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (m.a(this.a) != null) {
         this.a.a(m.a(this.a), false);
      }

      this.a.removeOnLayoutChangeListener(m.b(this.a));
   }
}
