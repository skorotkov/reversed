package fi.polar.polarflow.calculators;

import java.util.List;

import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.m_SENSOR_STATE;

class ao_GpsPolarSensorListener implements e_PolarSensorListenerEx {
   // $FF: synthetic field
   final am_SessionCalculators a_sessionCalculators;

   ao_GpsPolarSensorListener(am_SessionCalculators var1) {
      this.a_sessionCalculators = var1;
   }

   public void a(int var1) {
   }

   public void a(m_SENSOR_STATE var1) {
   }

   public void a_onPolarSensorEvents(List var1_events) {
      // $FF: Couldn't be decompiled
      boolean var2 = false;
      am_SessionCalculators.c(this.a_sessionCalculators);
      am_SessionCalculators.k_getEvents(this.a_sessionCalculators).addAll(var1_events);
      if (am_SessionCalculators.l(this.a_sessionCalculators) < am_SessionCalculators.c(this.a_sessionCalculators)[0]) {
         var2 = true;
      }

      if (!var2) {
         if (am_SessionCalculators.a(this.a_sessionCalculators) && am_SessionCalculators.k_getEvents(this.a_sessionCalculators).size() > 5) {
            while(am_SessionCalculators.k_getEvents(this.a_sessionCalculators).size() > 5) {
               am_SessionCalculators.k_getEvents(this.a_sessionCalculators).remove(0);
            }
         }
      } else {
         for(; am_SessionCalculators.l(this.a_sessionCalculators) < am_SessionCalculators.c(this.a_sessionCalculators)[0]; am_SessionCalculators.m(this.a_sessionCalculators)) {
            if (am_SessionCalculators.k_getEvents(this.a_sessionCalculators).isEmpty()) {
               fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "mGpsSensorObserver() all events removed!");
               break;
            }

            long var3_origGpsSearchTs = am_SessionCalculators.n_get_e_samplesTimeFromBoot(this.a_sessionCalculators).get(am_SessionCalculators.l(this.a_sessionCalculators));
            long var5_searchedTs = am_SessionCalculators.n_get_e_samplesTimeFromBoot(this.a_sessionCalculators).get(am_SessionCalculators.l(this.a_sessionCalculators)) + am_SessionCalculators.o_getGpsSampleDifference(this.a_sessionCalculators);
            fi.polar.polarflow.c.f_PolarSensorEvent var7 = (fi.polar.polarflow.c.f_PolarSensorEvent)fi.polar.polarflow.c.b_PolarSensorEventBase.a(var5_searchedTs, am_SessionCalculators.k_getEvents(this.a_sessionCalculators), 500L);
            if (var7 != null) {
               if (am_SessionCalculators.o_getGpsSampleDifference(this.a_sessionCalculators) == 0L) {
                  am_SessionCalculators.b_setAndReturnGpsSampleDifference(this.a_sessionCalculators, var7.b_timestamp - var3_origGpsSearchTs);
                  fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "initial mGpsSampleDifference:" + am_SessionCalculators.o_getGpsSampleDifference(this.a_sessionCalculators) + " event.timestamp:" + var7.b_timestamp + ", searchedTs:" + var5_searchedTs);
               } else if (var7.b_timestamp - var5_searchedTs != 0L) {
                  am_SessionCalculators.b_setAndReturnGpsSampleDifference(this.a_sessionCalculators, var7.b_timestamp - var3_origGpsSearchTs);
                  fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "align mGpsSampleDifference:" + am_SessionCalculators.o_getGpsSampleDifference(this.a_sessionCalculators) + " event.timestamp:" + var7.b_timestamp + ", searchedTs:" + var5_searchedTs + ", origGpsSearchTs:" + var3_origGpsSearchTs);
               }

               am_SessionCalculators.a(this.a_sessionCalculators, var7);
            } else if (am_SessionCalculators.l(this.a_sessionCalculators) == 0) {
               var7 = am_SessionCalculators.p_getPolarGpsSensorEvent(this.a_sessionCalculators);
            } else {
               if (var5_searchedTs > ((fi.polar.polarflow.c.b_PolarSensorEventBase)am_SessionCalculators.k_getEvents(this.a_sessionCalculators).get(am_SessionCalculators.k_getEvents(this.a_sessionCalculators).size() - 1)).b_timestamp + 500L) {
                  break;
               }

               var7 = (fi.polar.polarflow.c.f_PolarSensorEvent)fi.polar.polarflow.c.b_PolarSensorEventBase.a(var5_searchedTs, am_SessionCalculators.k_getEvents(this.a_sessionCalculators));
               if (var7.b_timestamp > var5_searchedTs + 500L) {
                  var7 = am_SessionCalculators.p_getPolarGpsSensorEvent(this.a_sessionCalculators);
               } else {
                  am_SessionCalculators.a(this.a_sessionCalculators, var7);
               }
            }

            if (var7 != null) {
               this.a_sessionCalculators.a(am_SessionCalculators.l(this.a_sessionCalculators), var7);
               fi.polar.polarflow.c.b_PolarSensorEventBase.a(am_SessionCalculators.k_getEvents(this.a_sessionCalculators), var7.b_timestamp, 0L);
            }
         }

         if (am_SessionCalculators.k_getEvents(this.a_sessionCalculators).size() > 0) {
            am_SessionCalculators.a(this.a_sessionCalculators, (fi.polar.polarflow.c.f_PolarSensorEvent)am_SessionCalculators.k_getEvents(this.a_sessionCalculators).get(am_SessionCalculators.k_getEvents(this.a_sessionCalculators).size() - 1));
         }
      }

   }
}
