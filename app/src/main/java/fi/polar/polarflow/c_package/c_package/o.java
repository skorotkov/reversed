package fi.polar.polarflow.c_package.c_package;

import fi.polar.polarflow.data.Training;

class o implements fi.polar.polarflow.c_package.b_package.h {
   // $FF: synthetic field
   final j a;

   o(j var1) {
      this.a = var1;
   }

   public void a(fi.polar.polarflow.c_package.b_package.a var1) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onNewDeviceAtCloseRange(" + var1.a().getName() + ")");
      if (j.n(this.a) == null && !Training.getInstance().isRunning() && j.c(this.a) && !j.a(this.a, var1.a().getAddress())) {
         j.a(this.a, j.a(this.a, var1));
         j.q(this.a);
      }

   }

   public void b(fi.polar.polarflow.c_package.b_package.a var1) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onPairedDeviceFound(" + var1.a().getName() + ")");
      if (j.n(this.a) == null && !j.a(this.a, var1.a().getAddress()) && j.c(this.a)) {
         j.o(this.a).a();
         j.a(this.a, j.a(this.a, var1));
         j.a((fi.polar.polarflow.c_package.a)j.n(this.a), (fi.polar.polarflow.c_package.l)j.p(this.a));
      }

   }
}
