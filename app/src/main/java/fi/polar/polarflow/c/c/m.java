package fi.polar.polarflow.c.c;

class m implements fi.polar.polarflow.c.l {
   // $FF: synthetic field
   final j a;

   m(j var1) {
      this.a = var1;
   }

   public void a(int var1) {
      if (j.c(this.a) && j.d(this.a)) {
         if (this.a.n() != var1) {
            this.a.a(var1);
            this.a.l();
         }

         if (j.h(this.a) != null) {
            j.h(this.a).a(var1);
         }
      }

   }

   public void a(fi.polar.polarflow.c.m var1) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "mBleSensorObserver.onStateChanged(" + var1 + ")");
      if (j.c(this.a)) {
         if (j.d(this.a)) {
            if (var1 == fi.polar.polarflow.c.m.a) {
               j.i(this.a);
            } else if (var1 == fi.polar.polarflow.c.m.c) {
               j.j(this.a);
            } else if (var1 == fi.polar.polarflow.c.m.d) {
               j.k(this.a);
            }
         } else if (var1 == fi.polar.polarflow.c.m.a) {
            j.l(this.a);
         } else if (var1 == fi.polar.polarflow.c.m.d) {
            j.k(this.a);
         }
      }

   }
}
