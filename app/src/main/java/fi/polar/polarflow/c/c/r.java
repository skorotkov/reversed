package fi.polar.polarflow.c.c;

import fi.polar.polarflow.data.orm.BleDevice;
import java.util.concurrent.TimeUnit;

class r implements Runnable {
   // $FF: synthetic field
   final j a;

   private r(j var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   r(j var1, k var2) {
      this(var1);
   }

   public void run() {
      j.o(this.a).a();
      if (!j.d(this.a) && BleDevice.count(BleDevice.class) > 0L) {
         j.o(this.a).a(0);
         j.o(this.a).a(TimeUnit.MINUTES.toMillis(10L), j.s(this.a));
      }

   }
}
