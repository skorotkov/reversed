package fi.polar.polarflow.calculators;

import java.util.List;

import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.m_SENSOR_STATE;

class bc implements e_PolarSensorListenerEx {
   // $FF: synthetic field
   final bb a;

   bc(bb var1) {
      this.a = var1;
   }

   public void a(int var1) {
   }

   public void a(m_SENSOR_STATE var1) {
   }

   public void a_onPolarSensorEvents(List var1) {
      bb.a(this.a, var1);
   }
}
