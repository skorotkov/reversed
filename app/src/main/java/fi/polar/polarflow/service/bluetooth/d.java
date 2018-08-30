package fi.polar.polarflow.service.bluetooth;

class d implements Runnable {
   // $FF: synthetic field
   final a a;

   d(a var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.e(fi.polar.polarflow.service.bluetooth.a.d(), "gattConnectTimeoutTask(timeout=" + fi.polar.polarflow.service.bluetooth.a.n(this.a) + " ms -> disconnect)");
      fi.polar.polarflow.service.bluetooth.a.a(this.a).b();
      fi.polar.polarflow.service.bluetooth.a.a(this.a).c();
      fi.polar.polarflow.service.bluetooth.a.c(this.a);
   }
}
