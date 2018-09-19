package fi.polar.polarflow.calculators;

import fi.polar.polarflow.a_package.a_DataTypes;

public class aw {
   private float a = -1.0F;
   private float b = -1.0F;
   private float c = -1.0F;
   private boolean d = false;

   public float a() {
      return a_DataTypes.a_adjust(1, this.a);
   }

   public void a(ag_PoolSwimmingSample var1) {
      this.a = var1.h();
      this.b = var1.e();
      this.c = var1.a();
      this.d = true;
   }

   public float b() {
      return a_DataTypes.a_adjust(1, this.b);
   }

   public boolean c() {
      return this.d;
   }
}
