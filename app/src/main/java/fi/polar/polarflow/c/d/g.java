package fi.polar.polarflow.c.d;

import android.location.GnssStatus.Callback;
import fi.polar.polarflow.c.m;
import java.lang.ref.WeakReference;

class g extends Callback {
   private final WeakReference a;

   g(b var1) {
      this.a = new WeakReference(var1);
   }

   public void onFirstFix(int var1) {
      b var2 = (b)this.a.get();
      if (var2 != null) {
         fi.polar.polarflow.util.d.c(b.s(), "GnssStatus first fix, mLocationCalc.getFix():" + b.h(var2).getFix());
         var2.a(m.d);
      }

   }

   public void onStarted() {
      fi.polar.polarflow.util.d.c(b.s(), "onStarted()");
      b var1 = (b)this.a.get();
      if (var1 != null) {
         var1.a(m.c);
      }

   }

   public void onStopped() {
      fi.polar.polarflow.util.d.c(b.s(), "onStopped()");
      b var1 = (b)this.a.get();
      if (var1 != null && b.s(var1) != m.a) {
         var1.a(m.b);
      }

   }
}
