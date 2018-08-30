package fi.polar.polarflow.service.bluetooth;

class g implements Runnable {
   // $FF: synthetic field
   final BluetoothAdaptationService a;

   g(BluetoothAdaptationService var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c(BluetoothAdaptationService.a(), "mHostDiscoveryTimeoutTask(Scan timeout)");
      this.a.stopSelf();
   }
}
