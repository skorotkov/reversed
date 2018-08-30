package fi.polar.polarflow.ui.myday.item;

class i implements Runnable {
   // $FF: synthetic field
   final g a;

   i(g var1) {
      this.a = var1;
   }

   public void run() {
      g.a(this.a, false);
      fi.polar.polarflow.util.d.c(g.k(), "Releasing click.");
   }
}
