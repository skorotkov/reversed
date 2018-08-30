package fi.polar.polarflow.ui.custom.ballswirl;

class d {
   private final float a;
   private final float b;
   private float c;
   private float d;

   public d(float var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.a(var3);
   }

   public d(d var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.a(var1.a());
   }

   private float b(float var1) {
      return (float)((double)this.a * Math.exp((double)(this.b * var1)));
   }

   private float c(float var1) {
      return (float)((double)this.a * Math.sqrt(1.0D + Math.pow((double)this.b, 2.0D)) * Math.exp((double)(this.b * var1)) / (double)this.b);
   }

   public float a() {
      return this.c;
   }

   public void a(float var1) {
      this.c = var1;
      this.d = this.b(this.c);
   }

   public float b() {
      return this.d;
   }

   public float c() {
      return this.c(this.c);
   }

   public int d() {
      return (int)((double)this.d * Math.cos((double)this.c));
   }

   public int e() {
      return (int)(-((double)this.d * Math.sin((double)this.c)));
   }
}
