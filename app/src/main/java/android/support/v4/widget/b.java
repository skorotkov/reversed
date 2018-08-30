package android.support.v4.widget;

import android.view.animation.AnimationUtils;

class b {
   private int a;
   private int b;
   private float c;
   private float d;
   private long e = Long.MIN_VALUE;
   private long f = 0L;
   private int g = 0;
   private int h = 0;
   private long i = -1L;
   private float j;
   private int k;

   private float a(float var1) {
      return -4.0F * var1 * var1 + 4.0F * var1;
   }

   private float a(long var1) {
      float var3 = 0.0F;
      if (var1 >= this.e) {
         if (this.i >= 0L && var1 >= this.i) {
            long var4 = this.i;
            float var6 = this.j;
            var3 = this.j;
            var3 = android.support.v4.widget.a.a((float)(var1 - var4) / (float)this.k, 0.0F, 1.0F) * var3 + (1.0F - var6);
         } else {
            var3 = android.support.v4.widget.a.a((float)(var1 - this.e) / (float)this.a, 0.0F, 1.0F) * 0.5F;
         }
      }

      return var3;
   }

   public void a() {
      this.e = AnimationUtils.currentAnimationTimeMillis();
      this.i = -1L;
      this.f = this.e;
      this.j = 0.5F;
      this.g = 0;
      this.h = 0;
   }

   public void a(float var1, float var2) {
      this.c = var1;
      this.d = var2;
   }

   public void a(int var1) {
      this.a = var1;
   }

   public void b() {
      long var1 = AnimationUtils.currentAnimationTimeMillis();
      this.k = android.support.v4.widget.a.a((int)(var1 - this.e), 0, this.b);
      this.j = this.a(var1);
      this.i = var1;
   }

   public void b(int var1) {
      this.b = var1;
   }

   public boolean c() {
      boolean var1;
      if (this.i > 0L && AnimationUtils.currentAnimationTimeMillis() > this.i + (long)this.k) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void d() {
      if (this.f == 0L) {
         throw new RuntimeException("Cannot compute scroll delta before calling start()");
      } else {
         long var1 = AnimationUtils.currentAnimationTimeMillis();
         float var3 = this.a(this.a(var1));
         long var4 = var1 - this.f;
         this.f = var1;
         this.g = (int)((float)var4 * var3 * this.c);
         this.h = (int)((float)var4 * var3 * this.d);
      }
   }

   public int e() {
      return (int)(this.c / Math.abs(this.c));
   }

   public int f() {
      return (int)(this.d / Math.abs(this.d));
   }

   public int g() {
      return this.g;
   }

   public int h() {
      return this.h;
   }
}
