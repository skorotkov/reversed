package fi.polar.polarflow.ui.exeview.a_package.a_package;

import fi.polar.polarflow.data.Lap;

class bf extends fi.polar.polarflow.ui.a_package.y {
   private static final fi.polar.polarflow.ui.a_package.ae a = (new fi.polar.polarflow.ui.a_package.ae()).a(2131230888).b(2131230888).c(2131230893);

   public bf() {
      super((new fi.polar.polarflow.ui.a_package.w()).a(a.a()).a("ExerciseLapCalc.ACTION_MANUAL_LAP").b("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS").a());
   }

   public float a(Lap var1) {
      return var1.getMaxSpeed();
   }
}
