package fi.polar.polarflow.a_package;

class h extends i {
   private final double b;
   private final double c;

   public h(String var1, double var2, double var4) {
      super(var1);
      this.b = var2;
      this.c = var4;
   }

   public double a(double var1) {
      double var3;
      if (var1 < this.b) {
         fi.polar.polarflow.util.d.e("DataTypes", this.a + " is below minimum: " + var1);
         var3 = this.b;
      } else {
         var3 = var1;
         if (var1 > this.c) {
            fi.polar.polarflow.util.d.e("DataTypes", this.a + " is above maximum: " + var1);
            var3 = this.c;
         }
      }

      return var3;
   }
}
