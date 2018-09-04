package fi.polar.polarflow.ui.exewait;

import fi.polar.polarflow.c_sensor_package.m_SENSOR_STATE;

// $FF: synthetic class
class ac {
   // $FF: synthetic field
   static final int[] a = new int[m_SENSOR_STATE.values().length];

   static {
      try {
         a[m_SENSOR_STATE.d_READY.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[m_SENSOR_STATE.b_NOT_READY.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[m_SENSOR_STATE.c_SEARCHING.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[m_SENSOR_STATE.a_DISABLED.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }

   }
}
