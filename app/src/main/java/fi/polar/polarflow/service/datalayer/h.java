package fi.polar.polarflow.service.datalayer;

import java.util.concurrent.Callable;

class h implements Callable {
   // $FF: synthetic field
   final g a;

   h(g var1) {
      this.a = var1;
   }

   public Object call() {
      return this.a.a();
   }
}
