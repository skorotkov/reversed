package fi.polar.polarflow.c.c;

import java.util.List;

class l implements fi.polar.polarflow.c.e {
   // $FF: synthetic field
   final j a;

   l(j var1) {
      this.a = var1;
   }

   public void a(int var1) {
   }

   public void a(fi.polar.polarflow.c.m var1) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "mInDeviceSensorObserver.onStateChanged(" + var1 + ")");
      if (j.c(this.a) && !j.d(this.a)) {
         if (var1 == fi.polar.polarflow.c.m.a) {
            j.e(this.a);
         } else if (var1 == fi.polar.polarflow.c.m.c) {
            j.f(this.a);
         } else if (var1 == fi.polar.polarflow.c.m.d) {
            j.g(this.a);
         }
      }

   }

   public void a(List var1) {
      if (j.c(this.a) && !j.d(this.a)) {
         fi.polar.polarflow.c.b var2 = (fi.polar.polarflow.c.b)var1.get(var1.size() - 1);
         this.a.a(Math.round(var2.a[0]));
         this.a.l();
         if (j.h(this.a) != null) {
            j.h(this.a).a(var1);
         }
      }

   }
}
