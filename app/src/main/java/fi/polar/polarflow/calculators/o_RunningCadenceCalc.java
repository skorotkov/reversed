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
      this.a_setCurrentEvent(new b_RunningCadenceEvent());
   }

   public void a_handleCurrentEvent() {
      int var1 = ((b_RunningCadenceEvent)this.o_getCurrentEvent()).a_getCadence();
      this.b.getSamples().addCadenceSample(var1);
   }
}
