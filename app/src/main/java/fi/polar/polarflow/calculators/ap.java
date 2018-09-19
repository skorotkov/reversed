package fi.polar.polarflow.calculators;

import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.c.m_SENSOR_STATE;

class ap implements l_PolarSensorListener {
   // $FF: synthetic field
   final am_SessionCalculators a;

   ap(am_SessionCalculators var1) {
      this.a = var1;
   }

   public void a(int var1) {
      // $FF: Couldn't be decompiled
      am_SessionCalculators.c_getMaxSampleIndex(this.a);
      am_SessionCalculators.b(this.a, am_SessionCalculators.q(this.a));
      am_SessionCalculators.c(this.a, var1);
   }

   public void a(m_SENSOR_STATE var1) {
   }
}
