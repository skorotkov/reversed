package android.support.wearable.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;

class k {
   private final int[] a = new int[]{-16777216, 0};
   private final float[] b = new float[]{0.6F, 1.0F};
   private final RectF c = new RectF();
   private final float d;
   private final Paint e = new Paint();
   private float f;
   private float g;
   private float h;
   private float i;

   k(float var1, float var2, float var3, float var4) {
      this.d = var1;
      this.g = var2;
      this.h = var3;
      this.i = var4;
      this.f = this.h + this.i + this.d * this.g;
      this.e.setColor(-16777216);
      this.e.setStyle(Style.FILL);
      this.e.setAntiAlias(true);
      this.a();
   }

   // $FF: synthetic method
   static float a(k var0) {
      return var0.d;
   }

   private void a() {
      this.f = this.h + this.i + this.d * this.g;
      if (this.f > 0.0F) {
         this.e.setShader(new RadialGradient(this.c.centerX(), this.c.centerY(), this.f, this.a, this.b, TileMode.MIRROR));
      }

   }

   // $FF: synthetic method
   static float b(k var0) {
      return var0.g;
   }

   void a(float var1) {
      this.h = var1;
      this.a();
   }

   void a(int var1, int var2, int var3, int var4) {
      this.c.set((float)var1, (float)var2, (float)var3, (float)var4);
      this.a();
   }

   void a(Canvas var1, float var2) {
      if (this.d > 0.0F && this.g > 0.0F) {
         this.e.setAlpha(Math.round((float)this.e.getAlpha() * var2));
         var1.drawCircle(this.c.centerX(), this.c.centerY(), this.f, this.e);
      }

   }

   void b(float var1) {
      this.i = var1;
      this.a();
   }

   void c(float var1) {
      this.g = var1;
      this.a();
   }
}
