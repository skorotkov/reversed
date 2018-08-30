package fi.polar.polarflow.ui.myday.item;

import android.view.View;
import android.widget.TextView;

public class a extends c {
   private int c;

   public a() {
      super(Long.MAX_VALUE, 2, true);
   }

   public int a() {
      return 2130968716;
   }

   public void a(int var1) {
      this.c = var1;
   }

   public void a(View var1) {
      super.a(var1);
      ((TextView)var1.findViewById(2131755404)).setText(String.valueOf(this.c));
   }

   public int e() {
      return this.c;
   }
}
