package fi.polar.a;

class f implements Runnable {
   // $FF: synthetic field
   final d a;

   f(d var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.a.a_package.b.b(d.d(), "reconnect(...retry timer elapsed, state=" + d.b(this.a) + ", try to reconnect)");
      if (d.b(this.a) != i.a) {
         d.m(this.a);
      } else {
         fi.polar.a.a_package.b.d(d.d(), "reconnect(...retry timer elapsed, unexpected state=" + d.b(this.a) + ")");
      }

   }
}
