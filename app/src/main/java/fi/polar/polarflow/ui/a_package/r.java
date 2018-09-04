package fi.polar.polarflow.ui.a_package;

import android.view.View;
import android.widget.TextView;

public abstract class r extends k {
   private TextView d;
   private int e = 0;

   public void a(View var1) {
      super.a(var1);
      this.d = (TextView)var1.findViewById(2131755244);
      if (this.d != null) {
         this.d.setVisibility(0);
      }

   }

   protected void b(int var1) {
      this.e = var1;
      if (var1 > 0) {
         a(var1, this.d);
      } else if (this.d != null) {
         this.d.setText(2131231103);
      }

   }

   protected int e() {
      return this.e;
   }
}
