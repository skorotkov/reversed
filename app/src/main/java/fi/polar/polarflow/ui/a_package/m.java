package fi.polar.polarflow.ui.a_package;

import android.view.View;
import android.widget.TextView;

public abstract class m extends c {
   private TextView c;
   private int d = 0;

   public void a(View var1) {
      super.a(var1);
      this.c = (TextView)var1.findViewById(2131755244);
      if (this.c != null) {
         this.c.setVisibility(0);
      }

   }

   protected void b(int var1) {
      this.d = var1;
      if (var1 > 0) {
         a(var1, this.c);
      } else if (this.c != null) {
         this.c.setText(2131231103);
      }

   }

   protected int e() {
      return this.d;
   }
}
