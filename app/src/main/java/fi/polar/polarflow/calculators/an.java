package fi.polar.polarflow.calculators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.m_SENSOR_STATE;

class an implements e_PolarSensorListenerEx {
   // $FF: synthetic field
   final am_SessionCalculators a;

   an(am_SessionCalculators var1) {
      this.a = var1;
   }

   public void a(int var1) {
      // $FF: Couldn't be decompiled
      if (!am_SessionCalculators.a(this.a)) {
         am_SessionCalculators.a(this.a, am_SessionCalculators.b(this.a).c_elapsedRealtimeNanos());
         am_SessionCalculators.c(this.a);
         int var2 = am_SessionCalculators.c(this.a)[0] - 1;
         if (am_SessionCalculators.d(this.a).a != null && am_SessionCalculators.d(this.a).a[0] == 0.0F) {
            fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "HR onMeasurementChanged, fill previous OHR offline values.");
            am_SessionCalculators.a(this.a, 0, true, var2);
            am_SessionCalculators var3 = this.a;
            float var4 = (float)am_SessionCalculators.e(this.a);
            long var5 = am_SessionCalculators.f(this.a);
            am_SessionCalculators.a(var3, new fi.polar.polarflow.c.b_PolarSensorEventBase(new float[]{var4}, var5, 3));
         }

         if (am_SessionCalculators.g(this.a).size() > 0) {
            fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "HR onMeasurementChanged, fill previous OHR values.");
            am_SessionCalculators.a(this.a, am_SessionCalculators.g(this.a), var2);
            am_SessionCalculators.g(this.a).clear();
         }

         am_SessionCalculators.a(this.a, var1);
         am_SessionCalculators.a(this.a, am_SessionCalculators.e(this.a), true);
      }

   }

   public void a(m_SENSOR_STATE var1) {
   }

   public void a_onPolarSensorEvents(List var1) {
      // $FF: Couldn't be decompiled
      boolean var2 = true;
      am_SessionCalculators.c(this.a);
      long var5;
      if (am_SessionCalculators.e(this.a) != -1) {
         am_SessionCalculators var3 = this.a;
         float var4 = (float)am_SessionCalculators.e(this.a);
         var5 = am_SessionCalculators.f(this.a);
         am_SessionCalculators.a(var3, new fi.polar.polarflow.c.b_PolarSensorEventBase(new float[]{var4}, var5, 3));
         am_SessionCalculators.a((am_SessionCalculators) this.a, -1);
         am_SessionCalculators.a(this.a, 0L);
      }

      am_SessionCalculators.g(this.a).addAll(var1);
      if (am_SessionCalculators.h(this.a) >= am_SessionCalculators.c(this.a)[0]) {
         var2 = false;
      }

      if (!var2) {
         if (am_SessionCalculators.a(this.a) && am_SessionCalculators.g(this.a).size() > 5) {
            while(am_SessionCalculators.g(this.a).size() > 5) {
               am_SessionCalculators.g(this.a).remove(0);
            }
         }
      } else {
         for(; am_SessionCalculators.h(this.a) < am_SessionCalculators.c(this.a)[0]; am_SessionCalculators.i(this.a)) {
            if (am_SessionCalculators.g(this.a).isEmpty()) {
               fi.polar.polarflow.util.d.c(am_SessionCalculators.d(), "mHrSensorObserver() all events removed!");
               break;
            }

            var5 = TimeUnit.MILLISECONDS.toNanos(am_SessionCalculators.j(this.a).get(am_SessionCalculators.h(this.a)));
            fi.polar.polarflow.c.b_PolarSensorEventBase var7 = fi.polar.polarflow.c.b_PolarSensorEventBase.a(var5, am_SessionCalculators.g(this.a), am_SessionCalculators.e());
            if (var7 != null) {
               am_SessionCalculators.a(this.a, var7);
            } else if (am_SessionCalculators.h(this.a) == 0) {
               var7 = am_SessionCalculators.d(this.a);
            } else {
               if (var5 > ((fi.polar.polarflow.c.b_PolarSensorEventBase)am_SessionCalculators.g(this.a).get(am_SessionCalculators.g(this.a).size() - 1)).b + am_SessionCalculators.e()) {
                  break;
               }

               var7 = fi.polar.polarflow.c.b_PolarSensorEventBase.a(var5, am_SessionCalculators.g(this.a));
               if (var7.b > var5 + am_SessionCalculators.e()) {
                  var7 = am_SessionCalculators.d(this.a);
               } else {
                  am_SessionCalculators.a(this.a, var7);
               }
            }

            if (var7 != null && var7.a != null) {
               this.a.a(am_SessionCalculators.h(this.a), Math.round(var7.a[0]));
               fi.polar.polarflow.c.b_PolarSensorEventBase.a(am_SessionCalculators.g(this.a), var7.b, 0L);
            }
         }

         if (am_SessionCalculators.g(this.a).size() > 0) {
            am_SessionCalculators.a(this.a, (fi.polar.polarflow.c.b_PolarSensorEventBase)am_SessionCalculators.g(this.a).get(am_SessionCalculators.g(this.a).size() - 1));
         }
      }


   }
}
