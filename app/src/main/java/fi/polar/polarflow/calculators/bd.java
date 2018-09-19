package fi.polar.polarflow.calculators;

import fi.polar.polarflow.a_package.a_DataTypes;

public class bd {
   private float a = -1.0F;
   private float b = -1.0F;
   private float c = -1.0F;
   private float d = -1.0F;
   private float e = -1.0F;
   private float f = -1.0F;
   private float g = -1.0F;
   private boolean h = false;

   private float a(float var1) {
      if (Float.isInfinite(var1)) {
         var1 = -1.0F;
      } else {
         var1 = a_DataTypes.a_adjust(2, var1);
      }

      return var1;
   }

   private float a(float var1, float var2) {
      return Math.max(var2, a_DataTypes.a_adjust(2, var1));
   }

   public float a() {
      return this.a(this.a);
   }

   public void a(ag_PoolSwimmingSample var1) {
      this.a = var1.b();
      this.b = var1.i();
      this.c = var1.j();
      this.d = var1.f();
      this.e = var1.g();
      this.f = var1.c();
      this.g = var1.d();
      this.h = true;
   }

   public float b() {
      return this.a(this.b);
   }

   public float c() {
      return this.a(this.c, this.b());
   }

   public float d() {
      return this.a(this.d);
   }

   public float e() {
      return this.a(this.e, this.d());
   }

   public float f() {
      return this.a(this.f);
   }

   public float g() {
      return this.a(this.g, this.f());
   }

   public boolean h() {
      return this.h;
   }
}
