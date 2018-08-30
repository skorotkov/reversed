package android.support.wearable.view;

import android.support.v7.widget.ey;
import android.view.View;

public class bj extends ey {
   public bj(View var1) {
      super(var1);
   }

   protected void a(boolean var1, boolean var2) {
      if (this.a instanceof bc) {
         bc var3 = (bc)this.a;
         if (var1) {
            var3.a(var2);
         } else {
            var3.b(var2);
         }
      }

   }
}
