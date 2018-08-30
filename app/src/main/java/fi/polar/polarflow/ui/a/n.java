package fi.polar.polarflow.ui.a;

import android.view.View;
import android.widget.TextView;

public abstract class n extends d {
   private TextView a;
   private int c = 0;

   public void a(View var1) {
      super.a(var1);
      this.a = (TextView)var1.findViewById(2131755244);
      if (this.a != null) {
         this.a.setVisibility(0);
      }

   }

   protected void d(int var1) {
      this.c = var1;
      if (var1 > 0) {
         a(var1, this.a);
      } else if (this.a != null) {
         this.a.setText(2131231103);
      }

   }

   protected int e() {
      return this.c;
   }
}
