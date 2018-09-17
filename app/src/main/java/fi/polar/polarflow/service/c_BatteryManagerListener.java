package fi.polar.polarflow.service;

public interface c_BatteryManagerListener {
   void a_onBatteryLow();

   void b_onBatterySafeForOperations();

   void c_BatteryNotSafeForOperations();
}
