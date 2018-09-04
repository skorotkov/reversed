package fi.polar.polarflow.c_package.c_package;

class h implements Runnable {
   // $FF: synthetic field
   final b a;
   private final fi.polar.polarflow.c_package.m b;

   h(b var1, fi.polar.polarflow.c_package.m var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      if (fi.polar.polarflow.c_package.c_package.b.p(this.a) != null) {
         fi.polar.polarflow.c_package.c_package.b.p(this.a).a(this.b);
      }

   }
}
