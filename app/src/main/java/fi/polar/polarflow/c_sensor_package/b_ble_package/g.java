package fi.polar.polarflow.c_sensor_package.b_ble_package;

class g implements Runnable {
   // $FF: synthetic field
   final b_BleScanner a;
   private final a b;

   g(b_BleScanner var1, a var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      if (this.a.b() && b_BleScanner.b(this.a) != null) {
         b_BleScanner.b(this.a).b(this.b);
      }

   }
}
