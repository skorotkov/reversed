package fi.polar.polarflow.c_package.d_package;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import fi.polar.polarflow.c_package.m;
import java.lang.ref.WeakReference;

class f implements LocationListener {
   private final WeakReference a;

   f(b var1) {
      this.a = new WeakReference(var1);
   }

   private void a(m var1) {
      if (this.a.get() != null) {
         ((b)this.a.get()).a(var1);
      }

   }

   public void onLocationChanged(Location var1) {
   }

   public void onProviderDisabled(String var1) {
      fi.polar.polarflow.util.d.c(b.s(), "mLocationListener onProviderDisabled: " + var1);
      this.a(m.a);
   }

   public void onProviderEnabled(String var1) {
      fi.polar.polarflow.util.d.c(b.s(), "mLocationListener onProviderEnabled: " + var1);
      this.a(m.c);
   }

   public void onStatusChanged(String var1, int var2, Bundle var3) {
      fi.polar.polarflow.util.d.c(b.s(), "GnssLocationListener onStatusChanged, provider: " + var1);
      switch(var2) {
      case 0:
         fi.polar.polarflow.util.d.c(b.s(), "GnssLocationListener onStatusChanged: OUT_OF_SERVICE");
         this.a(m.a);
         break;
      case 1:
         fi.polar.polarflow.util.d.c(b.s(), "GnssLocationListener onStatusChanged: TEMPORARILY_UNAVAILABLE");
         this.a(m.c);
         break;
      case 2:
         fi.polar.polarflow.util.d.c(b.s(), "GnssLocationListener onStatusChanged: AVAILABLE");
         this.a(m.d);
      }

   }
}
