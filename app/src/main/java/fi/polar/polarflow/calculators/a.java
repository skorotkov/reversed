package fi.polar.polarflow.calculators;

public class a extends at {
   public a() {
      super(-550.0F, 9000.0F);
      this.b(Float.NaN);
   }

   public void a() {
      super.a();
      this.b(Float.NaN);
   }

   public void b() {
      super.b();
      this.b(Float.NaN);
   }

   public float c() {
      float var1;
      if (this.d == 0) {
         var1 = Float.NaN;
      } else {
         var1 = (float)(this.c / (double)this.d);
      }

      return var1;
   }

   public float d() {
      float var1;
      if (this.a == Float.MAX_VALUE) {
         var1 = Float.NaN;
      } else {
         var1 = this.a;
      }

      return var1;
   }

   public float e() {
      float var1;
      if (this.b == -3.4028235E38F) {
         var1 = Float.NaN;
      } else {
         var1 = this.b;
      }

      return var1;
   }
}
