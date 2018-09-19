package fi.polar.polarflow.calculators;

import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.data.Training;
import java.util.ArrayList;

public class o_RunningCadenceCalc extends aj_CalcBase {
   private static final ArrayList a = new ArrayList(1);
   private Training b = Training.getInstance();

   static {
      a.add(n_SENSOR_TYPE.e_RUNNING_CADENCE);
   }

   public o_RunningCadenceCalc() {
      super(a);
      this.a_setCurrentSample(new b_RunningCadenceSample());
   }

   public void a_handleCurrentSample() {
      int var1 = ((b_RunningCadenceSample)this.o_getCurrentSample()).a_getCadence();
      this.b.getSamples().addCadenceSample(var1);
   }
}
