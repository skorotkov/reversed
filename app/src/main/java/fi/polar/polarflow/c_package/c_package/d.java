package fi.polar.polarflow.c_package.c_package;

class d implements Runnable {
   // $FF: synthetic field
   final b a;

   d(b var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.e("BleHeartRateSensor", "connectGatt() taking longer than " + b.b(this.a) + " ms -> disconnect");
      b.a(this.a, fi.polar.polarflow.c_package.m.a);
      b.c(this.a);
   }
}
