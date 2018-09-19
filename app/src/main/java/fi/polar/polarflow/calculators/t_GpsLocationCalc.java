package fi.polar.polarflow.calculators;

import android.os.SystemClock;

import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.data.Training;
import java.util.ArrayList;

public class t_GpsLocationCalc extends aj_CalcBase {
   private static final String a = t_GpsLocationCalc.class.getSimpleName();
   private static final ArrayList b = new ArrayList(1);
   private long d = 0L;

   static {
      b.add(n_SENSOR_TYPE.b_IN_DEVICE_GPS);
   }

   public t_GpsLocationCalc() {
      super(b);
      this.a_setCurrentSample(new v_GpsLocationSample((u)null));
   }

   public void a_handleCurrentSample() {
      v_GpsLocationSample var1 = (v_GpsLocationSample)this.o_getCurrentSample();
      if (var1.n_isTrusted()) {
         if (v_GpsLocationSample.a_getLatitude(var1) != 0.0D && v_GpsLocationSample.b_getLongitude(var1) != 0.0D) {
            int var2 = (int)((long)var1.l_getSampleIndex() * 1000L);
            if (this.d == 0L) {
               long var3 = ((v_GpsLocationSample)this.o_getCurrentSample()).m_getSampleTimeFromBoot() - SystemClock.elapsedRealtime();
               this.d = System.currentTimeMillis() - var3;
               fi.polar.polarflow.util.d.c(a, "mFirstLocationTime set to (timestampDiff:" + var3 + "):" + this.d);
               Training.getInstance().getSamples().setExerciseFirstLocationTime(this.d);
            }

            Training.getInstance().getSamples().addExerciseRouteSample(v_GpsLocationSample.a_getLatitude(var1), v_GpsLocationSample.b_getLongitude(var1), v_GpsLocationSample.c_getAltitudeInMeters(var1), v_GpsLocationSample.d_getNumberOfSatellites(var1), var2);
         } else {
            fi.polar.polarflow.util.d.c(a, "mLocation == null");
         }
      }

   }
}
