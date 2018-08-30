package android.support.wearable.view;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class n extends ViewOutlineProvider {
   // $FF: synthetic field
   final l a;

   private n(l var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   n(l var1, m var2) {
      this(var1);
   }

   public void getOutline(View var1, Outline var2) {
      var2.setOval(0, 0, l.a(this.a), l.a(this.a));
   }
}
