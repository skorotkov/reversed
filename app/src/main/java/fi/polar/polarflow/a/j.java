package fi.polar.polarflow.a;

class j extends k {
   private final float b;
   private final float c;

   public j(String var1, float var2, float var3) {
      super(var1);
      this.b = var2;
      this.c = var3;
   }

   public float a(float var1) {
      float var2;
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

   public boolean b(float var1) {
      boolean var2 = false;
      if (var1 >= this.b && var1 <= this.c) {
         var2 = true;
      }

      return var2;
   }
}
