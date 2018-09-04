package fi.polar.polarflow.ui.a_package;

import android.content.Intent;
import android.widget.TextView;
import java.util.Collection;

class af implements ab {
   private int a;
   // $FF: synthetic field
   final z b;

   public af(z var1) {
      this.b = var1;
      if (z.a(var1) != null) {
         this.a = z.b(var1).getInt(fi.polar.polarflow.ui.exeview.a_package.a_package.ah.O, 0);
      } else {
         this.a = fi.polar.polarflow.util.u.a().k();
      }

   }

   private float b(float var1) {
      if (Float.isInfinite(var1)) {
         var1 = -1.0F;
      } else {
         var1 = fi.polar.polarflow.a_package.a.a(2, var1);
      }

      return var1;
   }

   private float b(Intent var1) {
      return this.b(var1.getFloatExtra(z.g(this.b).i, z.g(this.b).j));
   }

   public String a(float var1) {
      String var2;
      if (this.a == 1) {
         var2 = fi.polar.polarflow.ui.o.b(z.f(this.b), var1);
      } else {
         var2 = fi.polar.polarflow.ui.o.a(z.f(this.b), var1);
      }

      return var2;
   }

   public void a() {
      this.b.b(this.b.a(z.c(this.b).getSwimmingSpeedStatistics()));
   }

   public void a(Intent var1) {
      if (var1 != null && "SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA".equals(var1.getAction())) {
         this.b.b(this.b(var1));
      }

   }

   public void a(Collection var1) {
      this.a(z.c(var1, "SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA"));
   }

   public boolean b() {
      return true;
   }

   public void c() {
      z.d(this.b).setVisibility(8);
      z.e(this.b).setVisibility(0);
      TextView var1 = (TextView)z.e(this.b).findViewById(2131755331);
      z.e(this.b).findViewById(2131755330).setBackgroundColor(var1.getCurrentTextColor());
      String var2;
      if (this.a == 1) {
         var2 = "100" + z.f(this.b).getString(2131230943);
      } else {
         var2 = "100" + z.f(this.b).getString(2131230861);
      }

      var1.setText(var2);
   }
}
