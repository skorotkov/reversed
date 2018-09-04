package fi.polar.polarflow.ui.a_package;

import android.content.Intent;
import java.util.Collection;

final class x extends af {
   // $FF: synthetic field
   final s a;

   private x(s var1) {
      super(var1);
      this.a = var1;
   }

   // $FF: synthetic method
   x(s var1, t var2) {
      this(var1);
   }

   private void b(Intent var1) {
      if (var1 != null && s.a(this.a) == var1.getIntExtra(s.b(this.a).b, -1)) {
         this.a.b(var1.getFloatExtra(s.b(this.a).i, s.b(this.a).j));
      }

   }

   public void a() {
      this.b(this.a.a((String)"SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA"));
   }

   public void a(Intent var1) {
      if (var1 != null && "SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA".equals(var1.getAction())) {
         this.b(var1);
      }

   }

   public void a(Collection var1) {
      this.b(s.a(var1, "SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA"));
   }
}
