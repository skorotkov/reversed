package fi.polar.polarflow.ui.a;

import android.view.View;
import android.widget.TextView;

public abstract class o extends g {
   private TextView c;
   private TextView d;
   private int e = 0;

   protected void a(int var1) {
      if (this.d != null) {
         this.d.setText(var1);
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.c = (TextView)var1.findViewById(2131755244);
      this.d = (TextView)var1.findViewById(2131755263);
      if (this.c != null) {
         this.c.setVisibility(0);
      }

   }

   protected void b(int var1) {
      this.e = var1;
      if (var1 > 0) {
         a(var1, this.c);
      } else if (this.c != null) {
         this.c.setText(2131231103);
      }

   }

   protected int e() {
      return this.e;
   }
}
