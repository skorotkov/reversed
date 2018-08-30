package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.view.View;
import java.util.Collection;

class v extends fi.polar.polarflow.ui.a.c {
   private void b(Intent var1) {
      if (var1 != null && "fi.polar.polarflow.ACTION_LOCATION_DATA".equals(var1.getAction())) {
         this.a(var1.getFloatExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DESCENT_VALUE", 0.0F));
      }

   }

   private void e() {
      this.a(this.P.getFloat(K, 0.0F));
   }

   public int a() {
      int var1;
      switch(fi.polar.polarflow.ui.exeview.a.a.w.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968655;
         break;
      default:
         var1 = super.a();
      }

      return var1;
   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.a(2131230858);
      this.a(0.0F);
   }

   public void a(Collection var1) {
      this.b(e(var1, "fi.polar.polarflow.ACTION_LOCATION_DATA"));
   }

   public void d() {
      if (this.P != null) {
         this.e();
      } else {
         this.b(this.a((String)"fi.polar.polarflow.ACTION_LOCATION_DATA"));
      }

   }
}
