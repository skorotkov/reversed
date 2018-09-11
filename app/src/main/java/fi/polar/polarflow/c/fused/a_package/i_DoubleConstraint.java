package fi.polar.polarflow.c.fused.a_package;

abstract class i_DoubleConstraint {
   protected final String a;

   protected i_DoubleConstraint(String var1) {
      this.a = var1;
   }

   public abstract double a_adjust(double var1);
}
