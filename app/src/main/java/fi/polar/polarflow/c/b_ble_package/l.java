package fi.polar.polarflow.c.b_ble_package;

class l implements Runnable {
   // $FF: synthetic field
   final j_BluetoothStatusHandler a;

   l(j_BluetoothStatusHandler var1) {
      this.a = var1;
   }

   public void run() {
      if (j_BluetoothStatusHandler.a(this.a) != null) {
         j_BluetoothStatusHandler.a(this.a).a(j_BluetoothStatusHandler.b(this.a));
      }

   }
}
