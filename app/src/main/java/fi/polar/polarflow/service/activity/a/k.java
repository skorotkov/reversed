package fi.polar.polarflow.service.activity.a;

abstract class k {
   protected float a;
   private final v b;

   k(v var1) {
      this.b = var1;
   }

   public void a() {
      this.a = 0.0F;
   }

   public void a(o var1) {
      this.a += var1.c;
   }

   public v a_() {
      return this.b;
   }

   public void b_() {
      this.a();
   }

   public float c_() {
      return this.a;
   }
}
