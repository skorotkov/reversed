package fi.polar.polarflow.c.c;

class p implements Runnable {
   // $FF: synthetic field
   final j a;
   private final String b;

   public p(j var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      if (j.n(this.a) != null && j.n(this.a).q().equals(this.b)) {
         j.o(this.a).a();
         j.a((fi.polar.polarflow.c.a)j.n(this.a), (fi.polar.polarflow.c.l)j.p(this.a));
      }

   }
}
