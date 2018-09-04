package fi.polar.polarflow.ui.exeview.summary.a_package;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

class h implements OnLayoutChangeListener {
   // $FF: synthetic field
   final View a;
   // $FF: synthetic field
   final g b;

   h(g var1, View var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.b.d();
      this.a.removeOnLayoutChangeListener(this);
   }
}
