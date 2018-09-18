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
      this.a_setCurrentEvent(new v_GpsLocationEvent((u)null));
   }

   public void a_handleCurrentEvent() {
      v_GpsLocationEvent var1 = (v_GpsLocationEvent)this.o_getCurrentEvent();
      if (var1.n_isTrusted()) {
         if (v_GpsLocationEvent.a_getLatitude(var1) != 0.0D && v_GpsLocationEvent.b_getLongitude(var1) != 0.0D) {
            int var2 = (int)((long)var1.l() * 1000L);
            if (this.d == 0L) {
               long var3 = ((v_GpsLocationEvent)this.o_getCurrentEvent()).m_getSampleTimeFromBoot() - SystemClock.elapsedRealtime();
               this.d = System.currentTimeMillis() - var3;
               fi.polar.polarflow.util.d.c(a, "mFirstLocationTime set to (timestampDiff:" + var3 + "):" + this.d);
               Training.getInstance().getSamples().setExerciseFirstLocationTime(this.d);
            }

            Training.getInstance().getSamples().addExerciseRouteSample(v_GpsLocationEvent.a_getLatitude(var1), v_GpsLocationEvent.b_getLongitude(var1), v_GpsLocationEvent.c_getAltitudeInMeters(var1), v_GpsLocationEvent.d_getNumberOfSatellites(var1), var2);
         } else {
            fi.polar.polarflow.util.d.c(a, "mLocation == null");
         }
      }

   }
}
