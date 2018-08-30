package fi.polar.polarflow.ui.custom;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;

public class ab extends Drawable {
   private final int a;
   private final Paint b;
   private final int c;
   private float d;
   private float e;
   private float f;
   private int[] g;
   private float[] h;

   public ab(int var1, int var2, int var3, float var4) {
      this.a = var3;
      this.b = new Paint();
      this.b.setAntiAlias(true);
      this.b.setStyle(Style.STROKE);
      this.b.setStrokeWidth((float)var2);
      this.b.setColor(var1);
      this.c = var2 / 2;
      this.d = var4;
      this.a();
   }

   private void a() {
      this.e = (360.0F - (float)this.a * this.d) / (float)this.a;
      this.f = -90.0F - this.d / 2.0F;
   }

   public void a(int var1, int var2) {
      this.g = new int[this.a * 4];
      this.h = new float[this.a * 4];

      for(int var3 = 0; var3 < this.a * 4; var3 += 4) {
         this.g[var3] = var1;
         this.g[var3 + 1] = var2;
         this.g[var3 + 2] = 0;
         this.g[var3 + 3] = 0;
         float[] var4 = this.h;
         float var5;
         if (var3 == 0) {
            var5 = 0.0F;
         } else {
            var5 = this.h[var3 - 1];
         }

         var4[var3] = var5;
         this.h[var3 + 1] = this.h[var3] + this.d / 360.0F;
         this.h[var3 + 2] = this.h[var3 + 1];
         this.h[var3 + 3] = this.h[var3 + 2] + this.e / 360.0F;
      }

      this.invalidateSelf();
   }

   public void draw(Canvas var1) {
      float var2 = (float)var1.getWidth();
      float var3 = (float)var1.getHeight();
      float var4 = var2 / 2.0F;
      float var5 = var3 / 2.0F;
      if (this.g != null) {
         this.b.setShader(new SweepGradient(var4, var5, this.g, this.h));
      }

      var5 = (float)this.c;
      var4 = (float)this.c;

      for(int var6 = 0; var6 < this.a; ++var6) {
         var1.drawArc((float)this.c, (float)this.c, var2 - var5, var3 - var4, this.f - (float)var6 * (this.d + this.e), this.d, false, this.b);
      }

   }

   public int getOpacity() {
      return -3;
   }

   public void setAlpha(int var1) {
      this.b.setAlpha(var1);
   }

   public void setColorFilter(ColorFilter var1) {
      this.b.setColorFilter(var1);
   }
}
