package fi.polar.polarflow.ui.exeview.a_package.a_package;

import fi.polar.polarflow.data.Lap;

class ay extends fi.polar.polarflow.ui.a_package.y {
   private static final fi.polar.polarflow.ui.a_package.ae a = (new fi.polar.polarflow.ui.a_package.ae()).a(2131230882).b(2131230882).c(2131230851);

   public ay() {
      super((new fi.polar.polarflow.ui.a_package.w()).a(a.a()).a("ExerciseLapCalc.ACTION_AUTO_LAP").b("ExerciseLapCalc.ACTION_AUTO_LAP_DATA_GPS").a());
   }

   public float a(Lap var1) {
      return var1.getAvgSpeed();
   }
}
