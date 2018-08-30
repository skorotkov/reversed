package fi.polar.polarflow.service.bluetooth;

class c implements Runnable {
   // $FF: synthetic field
   final a a;

   c(a var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.service.bluetooth.a.h(this.a).clear();
      fi.polar.polarflow.service.bluetooth.a.h(this.a).addAll(fi.polar.polarflow.service.bluetooth.a.i(this.a).a(7));
      fi.polar.polarflow.util.d.c(fi.polar.polarflow.service.bluetooth.a.d(), "queryDevicesTask(devices to query=" + fi.polar.polarflow.service.bluetooth.a.h(this.a).size() + ")");
      if (fi.polar.polarflow.service.bluetooth.a.j(this.a)) {
         fi.polar.polarflow.service.bluetooth.a.l(this.a).removeCallbacks(fi.polar.polarflow.service.bluetooth.a.k(this.a));
      } else {
         fi.polar.polarflow.service.bluetooth.a.l(this.a).postDelayed(this, (long)fi.polar.polarflow.service.bluetooth.a.m(this.a));
      }

   }
}
