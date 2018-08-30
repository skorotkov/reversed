package fi.polar.polarflow.ui.myday;

import android.graphics.Rect;
import android.support.v7.widget.dl;
import android.support.v7.widget.eb;
import android.support.v7.widget.ev;
import android.view.View;

public class v extends eb {
   private final int a;

   public v(int var1) {
      this.a = var1;
   }

   public void a(Rect var1, View var2, dl var3, ev var4) {
      var1.bottom = this.a;
      if (var3.g(var2) == 0) {
         var1.top = this.a;
      }

   }
}
