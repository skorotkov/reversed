package fi.polar.polarflow.calculators;

import java.util.List;

import fi.polar.polarflow.c.b_PolarSensorEventBase;
import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.f_PolarSensorEvent;
import fi.polar.polarflow.c.m_SENSOR_STATE;

class ao_GpsPolarSensorListener implements e_PolarSensorListenerEx {
   // $FF: synthetic field
   final am_SessionCalculators a_sessCalcs;

   ao_GpsPolarSensorListener(am_SessionCalculators var1) {
      this.a_sessCalcs = var1;
   }

   public void a(int var1) {
   }

   public void a(m_SENSOR_STATE var1) {
   }

   public void a_onPolarSensorEvents(List var1_events) {
      // $FF: Couldn't be decompiled
      boolean var2_areThereFreeSampleSlots = false;
      am_SessionCalculators.c_getMaxSampleIndex(this.a_sessCalcs);
      am_SessionCalculators.k_getEvents(this.a_sessCalcs).addAll(var1_events);
      if (am_SessionCalculators.l_getFreeGpsSampleIndex(this.a_sessCalcs) < am_SessionCalculators.c_getMaxSampleIndex(this.a_sessCalcs)[0]) {
         var2_areThereFreeSampleSlots = true;
      }

      if (!var2_areThereFreeSampleSlots) {
         if (am_SessionCalculators.a_getIsPaused(this.a_sessCalcs) && am_SessionCalculators.k_getEvents(this.a_sessCalcs).size() > 5) {
            while(am_SessionCalculators.k_getEvents(this.a_sessCalcs).size() > 5) {
               am_SessionCalculators.k_getEvents(this.a_sessCalcs).remove(0);
            }
         }
      } else {
         for(; am_SessionCalculators.l_getFreeGpsSampleIndex(this.a_sessCalcs) < am_SessionCalculators.c_getMaxSampleIndex(this.a_sessCalcs)[0]; am_SessionCalculators.m_postIncFreeGpsSampleIndex(this.a_sessCalcs)) {
            if (am_SessionCalculators.k_getEvents(this.a_sessCalcs).isEmpty()) {
               fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "mGpsSensorObserver() all events removed!");
               break;
            }

            // get timestamp of free sample slot
            long var3_origGpsSearchTs = am_SessionCalculators.n_getGpsSamplesTimeFromBoot(this.a_sessCalcs).get(am_SessionCalculators.l_getFreeGpsSampleIndex(this.a_sessCalcs));
            // var3_origGpsSearchTs + gpsSampleDifference
            long var5_searchedTs =      am_SessionCalculators.n_getGpsSamplesTimeFromBoot(this.a_sessCalcs).get(am_SessionCalculators.l_getFreeGpsSampleIndex(this.a_sessCalcs)) + am_SessionCalculators.o_getGpsSampleDifference(this.a_sessCalcs);
            // find event closest to searchedTs
            fi.polar.polarflow.c.f_PolarSensorEvent var7 = (fi.polar.polarflow.c.f_PolarSensorEvent)fi.polar.polarflow.c.b_PolarSensorEventBase.a_searchClosestAroundTimestamp(var5_searchedTs, am_SessionCalculators.k_getEvents(this.a_sessCalcs), 500L);
            if (var7 != null) {
               if (am_SessionCalculators.o_getGpsSampleDifference(this.a_sessCalcs) == 0L) {
                  am_SessionCalculators.b_setAndReturnGpsSampleDifference(this.a_sessCalcs, var7.b_timestamp - var3_origGpsSearchTs);
                  fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "initial mGpsSampleDifference:" + am_SessionCalculators.o_getGpsSampleDifference(this.a_sessCalcs) + " event.timestamp:" + var7.b_timestamp + ", searchedTs:" + var5_searchedTs);
               } else if (var7.b_timestamp - var5_searchedTs != 0L) {
                  am_SessionCalculators.b_setAndReturnGpsSampleDifference(this.a_sessCalcs, var7.b_timestamp - var3_origGpsSearchTs);
                  fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "align mGpsSampleDifference:" + am_SessionCalculators.o_getGpsSampleDifference(this.a_sessCalcs) + " event.timestamp:" + var7.b_timestamp + ", searchedTs:" + var5_searchedTs + ", origGpsSearchTs:" + var3_origGpsSearchTs);
               }

               am_SessionCalculators.a_setRecentPolarGpsSensorEvent(this.a_sessCalcs, var7);
            } else if (am_SessionCalculators.l_getFreeGpsSampleIndex(this.a_sessCalcs) == 0) {
               var7 = am_SessionCalculators.p_getRecentPolarGpsSensorEvent(this.a_sessCalcs);
            } else {
               // if searchedTs > timestamp of last event in list + 500ms
               if (var5_searchedTs > ((b_PolarSensorEventBase)am_SessionCalculators.k_getEvents(this.a_sessCalcs).get(am_SessionCalculators.k_getEvents(this.a_sessCalcs).size() - 1)).b_timestamp + 500L) {
                  break;
               }

               var7 = (f_PolarSensorEvent)b_PolarSensorEventBase.a_searchClosestBeforeTimestamp(var5_searchedTs, am_SessionCalculators.k_getEvents(this.a_sessCalcs));
               if (var7.b_timestamp > var5_searchedTs + 500L) {
                  var7 = am_SessionCalculators.p_getRecentPolarGpsSensorEvent(this.a_sessCalcs);
               } else {
                  am_SessionCalculators.a_setRecentPolarGpsSensorEvent(this.a_sessCalcs, var7);
               }
            }

            if (var7 != null) {
               this.a_sessCalcs.a_handleGpsSensorEvent(am_SessionCalculators.l_getFreeGpsSampleIndex(this.a_sessCalcs), var7);
               fi.polar.polarflow.c.b_PolarSensorEventBase.a_removeAllBeforeTimestampWithMargin(am_SessionCalculators.k_getEvents(this.a_sessCalcs), var7.b_timestamp, 0L);
            }
         }

         if (am_SessionCalculators.k_getEvents(this.a_sessCalcs).size() > 0) {
            am_SessionCalculators.a_setRecentPolarGpsSensorEvent(this.a_sessCalcs, (f_PolarSensorEvent)am_SessionCalculators.k_getEvents(this.a_sessCalcs).get(am_SessionCalculators.k_getEvents(this.a_sessCalcs).size() - 1));
         }
      }

   }
}
