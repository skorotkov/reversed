package fi.polar.polarflow.sensor.fusedgps.a_package;

class l_MinMaxIntConstraint extends m_IntConstraint {
   private final int b;
   private final int c;

   public l_MinMaxIntConstraint(String var1, int var2, int var3) {
      super(var1);
      this.b = var2;
      this.c = var3;
   }

   public int a_adjust(int var1) {
      int var2;
      if (var1 < this.b) {
         fi.polar.polarflow.util.d.e("DataTypes", this.a + " is below minimum: " + var1);
         var2 = this.b;
      } else {
         var2 = var1;
         if (var1 > this.c) {
            fi.polar.polarflow.util.d.e("DataTypes", this.a + " is above maximum: " + var1);
            var2 = this.c;
         }
      }

      return var2;
   }
}
