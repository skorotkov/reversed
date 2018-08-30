package fi.polar.polarflow.c.c;

class q implements Runnable {
   // $FF: synthetic field
   final j a;
   private final String b;

   public q(j var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      if (j.n(this.a) != null && j.n(this.a).q().equals(this.b)) {
         j.a((j)this.a, (b)null);
         j.b(this.a, this.b);
         j.r(this.a);
      }

   }
}
