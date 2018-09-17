package fi.polar.polarflow.ui.exeview;

import fi.polar.polarflow.data.Training;

class aj implements fi.polar.polarflow.ui.custom.j {
   // $FF: synthetic field
   final ab a;

   aj(ab var1) {
      this.a = var1;
   }

   public void a() {
   }

   public void b() {
      ab.a(this.a, true);
      ab.b(this.a, false);
      if (Training.getInstance().getDurationMs() < fi.polar.polarflow.util.b.l_10minutesInMs) {
         ab.i(this.a);
      } else {
         ab.j(this.a);
      }

   }

   public void c() {
      ab.k(this.a);
      ab.b(this.a, false);
   }
}
