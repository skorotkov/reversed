package fi.polar.polarflow.calculators;

import fi.polar.polarflow.data.Training;
import java.util.ArrayList;

public class o extends aj {
   private static final ArrayList a = new ArrayList(1);
   private Training b = Training.getInstance();

   static {
      a.add(fi.polar.polarflow.c_package.n.e);
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
