package fi.polar.polarflow.ui.a_package;

import android.view.View;
import android.widget.TextView;

public abstract class p extends ag {
   protected TextView g;
   protected TextView h;

   public int a() {
      int var1;
      switch(fi.polar.polarflow.ui.a_package.q.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968672;
         break;
      case 2:
         var1 = 2130968671;
         break;
      case 3:
         var1 = 2130968670;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   protected void a(int var1) {
      if (this.h != null) {
         this.h.setText(var1);
      }

   }

   public void a(View var1) {
      this.g = (TextView)var1.findViewById(2131755244);
      this.h = (TextView)var1.findViewById(2131755299);
      super.a(var1);
   }

   protected void b(int var1) {
      if (var1 > 0) {
         a(var1, this.g);
      } else if (this.g != null) {
         this.g.setText(2131231103);
      }

   }
}
