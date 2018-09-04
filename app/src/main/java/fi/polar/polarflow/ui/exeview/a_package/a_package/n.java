package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import java.util.Collection;

class n extends fi.polar.polarflow.ui.a_package.a {
   private void a(double var1) {
      String var3;
      if (Double.isNaN(var1)) {
         var3 = this.a.getContext().getResources().getString(2131231094);
      } else if (this.p() == 2) {
         var3 = fi.polar.polarflow.ui.o.a(var1);
      } else {
         var3 = fi.polar.polarflow.ui.o.b(var1);
      }

      this.a.setTextSize(0, this.a(this.l(), var3.length()));
      this.a.setText(var3);
   }

   private void b(Intent var1) {
      if (var1 != null && "fi.polar.polarflow.ACTION_LOCATION_DATA".equals(var1.getAction())) {
         this.a(var1.getDoubleExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ALTITUDE_VALUE", Double.NaN));
      }

   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(Collection var1) {
      this.b(e(var1, "fi.polar.polarflow.ACTION_LOCATION_DATA"));
   }

   public void d() {
      this.b(this.a((String)"fi.polar.polarflow.ACTION_LOCATION_DATA"));
   }
}
