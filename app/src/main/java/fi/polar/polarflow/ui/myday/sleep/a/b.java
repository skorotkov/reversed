package fi.polar.polarflow.ui.myday.sleep.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.o;

public class b extends i {
   private final int a;
   private final int c;

   public b(int var1, int var2) {
      this.a = var1;
      this.c = var2;
   }

   public int a() {
      return 2130968773;
   }

   public void a(View var1) {
      super.a(var1);
      Context var2 = var1.getContext();
      ((TextView)var1.findViewById(2131755502)).setText(o.b(var2, this.a));
      ((TextView)var1.findViewById(2131755505)).setText(o.b(var2, this.c));
   }
}
