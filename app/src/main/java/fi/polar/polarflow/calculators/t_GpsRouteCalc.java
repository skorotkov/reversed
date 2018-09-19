package fi.polar.polarflow.calculators;

import android.os.SystemClock;

import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.data.Training;
import java.util.ArrayList;

public class t_GpsRouteCalc extends aj_CalcBase {
   private static final String a_TAG = t_GpsRouteCalc.class.getSimpleName();
   private static final ArrayList b_sensorTypes = new ArrayList(1);
   private long d_mFirstLocationTime = 0L;

   static {
      b_sensorTypes.add(n_SENSOR_TYPE.b_IN_DEVICE_GPS);
   }

   public t_GpsRouteCalc() {
      super(b_sensorTypes);
      this.a_setCurrentSample(new v_GpsRouteSample((u)null));
   }

   public void a_handleCurrentSample() {
      v_GpsRouteSample var1 = (v_GpsRouteSample)this.o_getCurrentSample();
      if (var1.n_isTrusted()) {
         if (v_GpsRouteSample.a_getLatitude(var1) != 0.0D && v_GpsRouteSample.b_getLongitude(var1) != 0.0D) {
            int var2 = (int)((long)var1.l_getSampleIndex() * 1000L);
            if (this.d_mFirstLocationTime == 0L) {
               long var3 = ((v_GpsRouteSample)this.o_getCurrentSample()).m_getSampleTimeFromBoot() - SystemClock.elapsedRealtime();
               this.d_mFirstLocationTime = System.currentTimeMillis() - var3;
               fi.polar.polarflow.util.d.c(a_TAG, "mFirstLocationTime set to (timestampDiff:" + var3 + "):" + this.d_mFirstLocationTime);
               Training.getInstance().getSamples().setExerciseFirstLocationTime(this.d_mFirstLocationTime);
            }

            Training.getInstance().getSamples().addExerciseRouteSample(v_GpsRouteSample.a_getLatitude(var1), v_GpsRouteSample.b_getLongitude(var1), v_GpsRouteSample.c_getAltitudeInMeters(var1), v_GpsRouteSample.d_getNumberOfSatellites(var1), var2);
         } else {
            fi.polar.polarflow.util.d.c(a_TAG, "mLocation == null");
         }
      }

   }
}
