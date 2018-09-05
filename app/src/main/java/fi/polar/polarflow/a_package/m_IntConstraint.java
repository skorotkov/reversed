package fi.polar.polarflow.a_package;

abstract class m_IntConstraint {
   protected final String a;

   protected m_IntConstraint(String var1) {
      this.a = var1;
   }

   public abstract int a_adjust(int var1);
}
