package fi.polar.polarflow.c.c;

import android.hardware.Sensor;
import android.os.Handler;

class v extends fi.polar.polarflow.c.g {
   // $FF: synthetic field
   final s a;

   v(s var1, fi.polar.polarflow.c.j var2, Handler var3) {
      super(var2, var3);
      this.a = var1;
   }

   public void onAccuracyChanged(Sensor var1, int var2) {
      fi.polar.polarflow.util.d.c(s.p(), "onAccuracyChanged(" + (String)s.q().get(var2) + ")");
      if (var2 != 2 && var2 != 3 && var2 != 1 && var2 != 0) {
         s.b(this.a, fi.polar.polarflow.c.m.c);
      } else {
         s.a(this.a, fi.polar.polarflow.c.m.d);
      }

   }
}
