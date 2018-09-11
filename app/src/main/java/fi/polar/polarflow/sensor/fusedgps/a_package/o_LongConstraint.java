package fi.polar.polarflow.sensor.fusedgps.a_package;

abstract class o_LongConstraint {
   protected final String a;

   protected o_LongConstraint(String var1) {
      this.a = var1;
   }

   public abstract long a_adjust(long var1);
}
