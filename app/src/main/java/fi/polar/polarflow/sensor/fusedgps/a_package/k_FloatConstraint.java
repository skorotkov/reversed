package fi.polar.polarflow.sensor.fusedgps.a_package;

abstract class k_FloatConstraint {
   protected final String a;

   protected k_FloatConstraint(String var1) {
      this.a = var1;
   }

   public abstract float a_adjust(float var1);

   public abstract boolean b_isSatisfy(float var1);
}
