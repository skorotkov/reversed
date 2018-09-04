package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import java.util.Collection;

public class q extends fi.polar.polarflow.ui.a_package.d {
   private void b(Intent var1) {
      if (var1 != null && "fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA".equals(var1.getAction())) {
         this.b(var1.getIntExtra("fi.polar.polarflow.KEY_SENSOR_RUNNING_CADENCE_VALUE", -1));
      }

   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(Collection var1) {
      this.b(e(var1, "fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA"));
   }

   public void d() {
      this.b(this.a((String)"fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA"));
   }
}
