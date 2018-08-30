package fi.polar.polarflow.util;

class t implements Runnable {
   // $FF: synthetic field
   final Runnable a;
   // $FF: synthetic field
   final s b;

   t(s var1, Runnable var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         this.a.run();
      } finally {
         this.b.a();
      }

   }
}
