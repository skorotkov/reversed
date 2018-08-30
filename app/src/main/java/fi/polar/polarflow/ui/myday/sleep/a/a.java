package fi.polar.polarflow.ui.myday.sleep.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.ui.custom.q;
import java.util.concurrent.TimeUnit;

public class a extends i {
   private static final int[] a = new int[]{2131624109, 2131624111, 2131624110};
   private final fi.polar.polarflow.util.b.a c;

   public a(fi.polar.polarflow.util.b.a var1) {
      this.c = var1;
   }

   private static int[] a(Context var0) {
      int[] var1 = new int[a.length];

      for(int var2 = 0; var2 < a.length; ++var2) {
         var1[var2] = android.support.v4.c.a.c(var0, a[var2]);
      }

      return var1;
   }

   private float[] e() {
      int var1 = (int)TimeUnit.MINUTES.toSeconds((long)this.c.g);
      if (var1 > this.c.d) {
         var1 -= this.c.d;
      } else {
         var1 = 0;
      }

      return new float[]{(float)this.c.e, (float)this.c.f, (float)var1};
   }

   public int a() {
      return 2130968772;
   }

   public void a(View var1) {
      super.a(var1);
      Context var2 = var1.getContext();
      q var3 = new q(this.e(), a(var2), (float)var2.getResources().getDimensionPixelSize(2131362229));
      var1.findViewById(2131755498).setBackground(var3);
      ((TextView)var1.findViewById(2131755499)).setText(o.b(var2, this.c.d));
      ((TextView)var1.findViewById(2131755500)).setText(o.a(var2, this.c.g, 2131231038));
   }
}
