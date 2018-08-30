package fi.polar.polarflow.ui.custom;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;

public class q extends Drawable {
   private final Paint[] a;
   private final float[] b;
   private final float c;
   private RectF d;

   public q(float[] var1, int[] var2, float var3) {
      this.b = this.a(var1);
      this.a = new Paint[var2.length];
      this.c = var3;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         this.a[var4] = new Paint();
         this.a[var4].setColor(var2[var4]);
         this.a[var4].setFlags(1);
         this.a[var4].setStyle(Style.STROKE);
         this.a[var4].setStrokeWidth(var3);
      }

   }

   private RectF a(Rect var1) {
      int var2 = var1.width();
      int var3 = var1.height();
      float var4 = (float)(var2 / 2);
      float var5 = (float)(var3 / 2);
      float var6 = var5 - this.c / 2.0F;
      return new RectF(var4 - var6, var5 - var6, var4 + var6, var5 + var6);
   }

   private void a(Canvas var1) {
      if (this.b != null) {
         int var2 = 0;

         for(float var3 = -90.0F; var2 < this.b.length; ++var2) {
            if (this.b[var2] > 0.0F) {
               var1.drawArc(this.d, var3 - 0.5F, this.b[var2] + 0.5F, false, this.a[var2]);
               var3 += this.b[var2];
            }
         }
      }

   }

   private float[] a(float[] var1) {
      byte var2 = 0;
      float[] var3 = new float[var1.length];
      int var4 = var1.length;
      float var5 = 0.0F;
      int var6 = 0;

      while(true) {
         int var7 = var2;
         if (var6 >= var4) {
            while(var7 < var1.length) {
               var3[var7] = var1[var7] / var5 * 360.0F;
               ++var7;
            }

            return var3;
         }

         var5 += var1[var6];
         ++var6;
      }
   }

   public void draw(Canvas var1) {
      var1.save();
      if (this.d == null) {
         this.d = this.a(this.getBounds());
      }

      this.a(var1);
   }

   public int getOpacity() {
      return 0;
   }

   protected void onBoundsChange(Rect var1) {
      super.onBoundsChange(var1);
      this.d = this.a(var1);
   }

   public void setAlpha(int var1) {
   }

   public void setColorFilter(ColorFilter var1) {
   }
}
