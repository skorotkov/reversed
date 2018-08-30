package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.view.View;
import java.util.Collection;

class bh extends fi.polar.polarflow.ui.a.ag {
   View g;
   View h;

   private void b(Intent var1) {
      if (var1 != null && var1.getAction().equals("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_REST_TIME_START")) {
         this.j = var1.getLongExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_REST_TIME_START", 0L);
         if (this.j > 0L) {
            this.g.setVisibility(0);
            this.a.setVisibility(0);
            this.h.setVisibility(8);
            this.f();
         } else if (this.j == 0L) {
            this.r();
         }

         this.e();
      }

   }

   public int a() {
      int var1;
      switch(bi.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968681;
         break;
      case 2:
         var1 = 2130968680;
         break;
      case 3:
         var1 = 2130968679;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   public void a(Intent var1) {
      if ("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_REST_TIME_START".equals(var1.getAction())) {
         this.b(var1);
      }

   }

   public void a(View var1) {
      this.g = var1.findViewById(2131755316);
      this.h = var1.findViewById(2131755317);
      super.a(var1);
      this.i = this.Q.getStartTimeFromBoot() + this.Q.getPausedTime();
      this.b(this.a((String)"SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_REST_TIME_START"));
   }

   public void a(Collection var1) {
      super.a(var1);
      this.b(e(var1, "SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_REST_TIME_START"));
   }

   public void d() {
      super.d();
      this.b(this.a((String)"SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_REST_TIME_START"));
   }

   public void e() {
      if (this.j > 0L) {
         this.a(this.i + this.j);
      } else {
         this.h.setVisibility(0);
         this.a.setVisibility(8);
         this.g.setVisibility(8);
      }

   }
}
