package fi.polar.polarflow.calculators;

import android.os.SystemClock;

import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.data.Training;
import java.util.ArrayList;

public class t extends aj {
   private static final String a = t.class.getSimpleName();
   private static final ArrayList b = new ArrayList(1);
   private long d = 0L;

   static {
      b.add(n_SENSOR_TYPE.b_IN_DEVICE_GPS);
   }

   public t() {
      super(b);
      this.a(new v((u)null));
   }

   public void a() {
      v var1 = (v)this.o();
      if (var1.n()) {
         if (v.a(var1) != 0.0D && v.b(var1) != 0.0D) {
            int var2 = (int)((long)var1.l() * 1000L);
            if (this.d == 0L) {
               long var3 = ((v)this.o()).m() - SystemClock.elapsedRealtime();
               this.d = System.currentTimeMillis() - var3;
               fi.polar.polarflow.util.d.c(a, "mFirstLocationTime set to (timestampDiff:" + var3 + "):" + this.d);
               Training.getInstance().getSamples().setExerciseFirstLocationTime(this.d);
            }

            Training.getInstance().getSamples().addExerciseRouteSample(v.a(var1), v.b(var1), v.c(var1), v.d(var1), var2);
         } else {
            fi.polar.polarflow.util.d.c(a, "mLocation == null");
         }
      }

   }
}
