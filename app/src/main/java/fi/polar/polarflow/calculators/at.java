package fi.polar.polarflow.calculators;

import java.util.List;

public class at {
   float a = Float.MAX_VALUE;
   float b = -3.4028235E38F;
   double c = 0.0D;
   int d = 0;
   private float e = -3.4028235E38F;
   private float f = Float.MAX_VALUE;
   private float g = -1.0F;
   private final List h = new au(this);

   public at() {
   }

   public at(float var1, float var2) {
      this.e = var1;
      this.f = var2;
   }

   public float a(int var1) {
      float var9;
      if (var1 > 0 && var1 <= this.h.size()) {
         int var2 = this.h.size();
         double var3 = 0.0D;
         byte var5 = 0;
         var2 -= var1;
         var1 = var5;

         double var7;
         for(int var10 = var2; var10 < this.h.size(); var3 = var7) {
            Float var6 = (Float)this.h.get(var10);
            var2 = var1;
            var7 = var3;
            if (var6 != null) {
               var7 = var3 + (double)var6;
               var2 = var1 + 1;
            }

            ++var10;
            var1 = var2;
         }

         if (var1 > 0) {
            var9 = (float)(var3 / (double)var1);
            return var9;
         }
      }

      var9 = 0.0F;
      return var9;
   }

   public void a() {
      this.c = 0.0D;
      this.d = 0;
      this.a = Float.MAX_VALUE;
      this.b = -3.4028235E38F;
      this.g = -1.0F;
      this.h.clear();
   }

   public void a(float var1) {
      float var2 = var1;
      if (var1 < this.e) {
         var2 = this.e;
      }

      var1 = var2;
      if (var2 > this.f) {
         var1 = this.f;
      }

      this.h.add(var1);
      if (var1 < this.a) {
         this.a = var1;
      }

      if (var1 > this.b) {
         this.b = var1;
      }

      this.c += (double)var1;
      ++this.d;
      this.g = var1;
   }

   public void b() {
      this.h.add((Object)null);
      this.g = -1.0F;
   }

   public void b(float var1) {
      this.g = var1;
   }

   public float c() {
      float var1;
      if (this.d == 0) {
         var1 = 0.0F;
      } else {
         var1 = (float)(this.c / (double)this.d);
      }

      return var1;
   }

   public float d() {
      float var1;
      if (this.a == Float.MAX_VALUE) {
         var1 = 0.0F;
      } else {
         var1 = this.a;
      }

      return var1;
   }

   public float e() {
      float var1;
      if (this.b == -3.4028235E38F) {
         var1 = 0.0F;
      } else {
         var1 = this.b;
      }

      return var1;
   }

   public int f() {
      return this.d;
   }

   public boolean g() {
      boolean var1;
      if (this.f() > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public double h() {
      return this.c;
   }

   public float i() {
      return this.g;
   }
}
