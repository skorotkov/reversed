package fi.polar.polarflow.ui.exeview.a_package.a_package;

import fi.polar.polarflow.calculators.as_SpeedRangeStatistics;

class bk extends fi.polar.polarflow.ui.a_package.z {
   public bk() {
      super((new fi.polar.polarflow.ui.a_package.ae()).a(2131230911).b(2131230898).a("fi.polar.polarflow.KEY_SENSOR_LOCATION_CURRENT_SPEED_VALUE").b("SwimmingMetricsProvider.KEY_POOL_SWIMMING_CURRENT_SPEED").a(0.0F).a());
   }

   public float a(as_SpeedRangeStatistics var1) {
      return var1.i_getMostResentSample();
   }

   public float a(fi.polar.polarflow.calculators.bd var1) {
      return var1.a();
   }
}
