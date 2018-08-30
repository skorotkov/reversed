package fi.polar.polarflow.c_package;

import java.util.ArrayList;

class h implements Runnable {
   // $FF: synthetic field
   final g a;

   h(g var1) {
      this.a = var1;
   }

   public void run() {
      if (!g.a(this.a).isEmpty()) {
         g.b(this.a).a(new ArrayList(g.a(this.a)));
         g.a(this.a).clear();
      }

   }
}
