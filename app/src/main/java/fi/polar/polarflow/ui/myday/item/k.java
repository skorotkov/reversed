package fi.polar.polarflow.ui.myday.item;

class k implements Runnable {
   // $FF: synthetic field
   final j a;

   k(j var1) {
      this.a = var1;
   }

   public void run() {
      j.a(this.a, false);
      fi.polar.polarflow.util.d.c(j.j(), "Releasing click.");
   }
}
