package fi.polar.polarflow.calculators;

import java.util.List;

import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.m_SENSOR_STATE;

class ao_GpsPolarSensorListener implements e_PolarSensorListenerEx {
   // $FF: synthetic field
   final am_SessionCalculators a;

   ao_GpsPolarSensorListener(am_SessionCalculators var1) {
      this.a = var1;
   }

   public void a(int var1) {
   }

   public void a(m_SENSOR_STATE var1) {
   }

   public void a_onPolarSensorEvents(List var1) {
      // $FF: Couldn't be decompiled
      boolean var2 = false;
      am_SessionCalculators.c(this.a);
      am_SessionCalculators.k(this.a).addAll(var1);
      if (am_SessionCalculators.l(this.a) < am_SessionCalculators.c(this.a)[0]) {
         var2 = true;
      }

      if (!var2) {
         if (am_SessionCalculators.a(this.a) && am_SessionCalculators.k(this.a).size() > 5) {
            while(am_SessionCalculators.k(this.a).size() > 5) {
               am_SessionCalculators.k(this.a).remove(0);
            }
         }
      } else {
         for(; am_SessionCalculators.l(this.a) < am_SessionCalculators.c(this.a)[0]; am_SessionCalculators.m(this.a)) {
            if (am_SessionCalculators.k(this.a).isEmpty()) {
               fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "mGpsSensorObserver() all events removed!");
               break;
            }

            long var3 = am_SessionCalculators.n(this.a).get(am_SessionCalculators.l(this.a));
            long var5 = am_SessionCalculators.n(this.a).get(am_SessionCalculators.l(this.a)) + am_SessionCalculators.o(this.a);
            fi.polar.polarflow.c.f_PolarSensorEvent var7 = (fi.polar.polarflow.c.f_PolarSensorEvent)fi.polar.polarflow.c.b_PolarSensorEventBase.a(var5, am_SessionCalculators.k(this.a), 500L);
            if (var7 != null) {
               if (am_SessionCalculators.o(this.a) == 0L) {
                  am_SessionCalculators.b(this.a, var7.b - var3);
                  fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "initial mGpsSampleDifference:" + am_SessionCalculators.o(this.a) + " event.timestamp:" + var7.b + ", searchedTs:" + var5);
               } else if (var7.b - var5 != 0L) {
                  am_SessionCalculators.b(this.a, var7.b - var3);
                  fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "align mGpsSampleDifference:" + am_SessionCalculators.o(this.a) + " event.timestamp:" + var7.b + ", searchedTs:" + var5 + ", origGpsSearchTs:" + var3);
               }

               am_SessionCalculators.a(this.a, var7);
            } else if (am_SessionCalculators.l(this.a) == 0) {
               var7 = am_SessionCalculators.p(this.a);
            } else {
               if (var5 > ((fi.polar.polarflow.c.b_PolarSensorEventBase)am_SessionCalculators.k(this.a).get(am_SessionCalculators.k(this.a).size() - 1)).b + 500L) {
                  break;
               }

               var7 = (fi.polar.polarflow.c.f_PolarSensorEvent)fi.polar.polarflow.c.b_PolarSensorEventBase.a(var5, am_SessionCalculators.k(this.a));
               if (var7.b > var5 + 500L) {
                  var7 = am_SessionCalculators.p(this.a);
               } else {
                  am_SessionCalculators.a(this.a, var7);
               }
            }

            if (var7 != null) {
               this.a.a(am_SessionCalculators.l(this.a), var7);
               fi.polar.polarflow.c.b_PolarSensorEventBase.a(am_SessionCalculators.k(this.a), var7.b, 0L);
            }
         }

         if (am_SessionCalculators.k(this.a).size() > 0) {
            am_SessionCalculators.a(this.a, (fi.polar.polarflow.c.f_PolarSensorEvent)am_SessionCalculators.k(this.a).get(am_SessionCalculators.k(this.a).size() - 1));
         }
      }

   }
}
