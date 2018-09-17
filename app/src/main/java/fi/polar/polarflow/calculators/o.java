package fi.polar.polarflow.calculators;

import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.data.Training;
import java.util.ArrayList;

public class o extends aj_CalcBase {
   private static final ArrayList a = new ArrayList(1);
   private Training b = Training.getInstance();

   static {
      a.add(n_SENSOR_TYPE.e_RUNNING_CADENCE);
   }

   public o() {
      super(a);
      this.a(new b());
   }

   public void a() {
      int var1 = ((b)this.o()).a();
      this.b.getSamples().addCadenceSample(var1);
   }
}
