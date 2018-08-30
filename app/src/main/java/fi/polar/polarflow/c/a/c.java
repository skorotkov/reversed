package fi.polar.polarflow.c.a;

import java.util.List;

class c implements Runnable {
   // $FF: synthetic field
   final a a;
   private final List b;

   c(a var1, List var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      this.a.a(this.b);
   }
}
