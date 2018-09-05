package fi.polar.polarflow.a_package;

class n_MinMaxLongConstraint extends o_LongConstraint {
   private final long b;
   private final long c;

   public n_MinMaxLongConstraint(String var1, long var2, long var4) {
      super(var1);
      this.b = var2;
      this.c = var4;
   }

   public long a_adjust(long var1) {
      long var3;
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
