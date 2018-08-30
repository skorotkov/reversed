package fi.polar.polarflow.ui.custom;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.SweepGradient;
import android.graphics.Paint.Style;
import android.graphics.Path.FillType;
import android.graphics.drawable.Drawable;

public class ah extends Drawable {
   private static final float[] a = new float[]{0.2F, 0.4F, 0.4F};
   private Paint b;
   private Paint c;
   private int d;
   private int e;
   private int f;
   private int g = -1;
   private float[] h;
   private boolean i;
   private float[] j;
   private int[] k;
   private float[] l;
   private boolean m;

   public ah(int var1, int var2, int var3, int var4) {
      this.d = var2;
      this.e = var3;
      this.f = var1;
      this.h = new float[2];
      this.j = new float[3];
      this.a(a[0], a[1], a[2]);
      this.a(4.0F, 5.0F);
      this.a(var4);
      this.a(false);
      this.b = new Paint();
      this.b.setColor(this.e);
      this.b.setStrokeWidth((float)this.f);
      this.b.setStyle(Style.STROKE);
      this.b.setAntiAlias(true);
      this.c = new Paint();
      this.c.setColor(this.e);
      this.c.setStyle(Style.FILL);
      this.c.setAntiAlias(true);
   }

   private void a(Canvas var1, float var2, float var3, float var4, float var5, boolean var6) {
      Path var7 = new Path();
      var7.setFillType(FillType.EVEN_ODD);
      var7.moveTo(var2 - var4 / 2.0F, var3);
      if (var6) {
         var5 = var3 - var5;
      } else {
         var5 += var3;
      }

      var7.lineTo(var2, var5);
      var7.lineTo(var4 / 2.0F + var2, var3);
      var7.lineTo(var2 - var4 / 2.0F, var3);
      var7.close();
      var1.drawPath(var7, this.c);
   }

   public void a(float var1, float var2) {
      if (var1 >= 1.0F && var2 >= 1.0F) {
         this.h[0] = (float)this.f * var1;
         this.h[1] = (float)this.f * var2;
      } else {
         throw new IllegalArgumentException("Arrow weights must be greater than 1.0f");
      }
   }

   public void a(float var1, float var2, float var3) {
      if (var1 + var2 + var3 != 1.0F) {
         throw new IllegalArgumentException("Weights must total 1.0f");
      } else {
         this.j[0] = var1;
         this.j[1] = var2;
         this.j[2] = var3;
      }
   }

   public void a(int var1) {
      if (var1 != 0 && var1 != 1) {
         throw new IllegalArgumentException("Unrecognized mode " + var1);
      } else {
         if (var1 != this.g) {
            this.m = true;
            this.g = var1;
            switch(this.g) {
            case 0:
               this.k = new int[6];
               this.l = new float[6];
               this.k[0] = this.d;
               this.k[1] = this.d;
               this.k[2] = this.d;
               this.k[3] = this.e;
               this.k[4] = this.e;
               this.k[5] = this.e;
               this.l[0] = 0.0F;
               this.l[1] = this.j[0] / 2.0F;
               this.l[2] = this.l[1];
               this.l[3] = (this.j[0] + this.j[1]) / 2.0F;
               this.l[4] = this.l[3] - 0.01F;
               this.l[5] = (this.j[0] + this.j[1] + this.j[2]) / 2.0F;
               break;
            case 1:
               this.k = new int[12];
               this.l = new float[12];
               this.k[0] = this.d;
               this.k[1] = this.d;
               this.k[2] = this.d;
               this.k[3] = this.e;
               this.k[4] = this.e;
               this.k[5] = this.e;
               this.k[6] = this.d;
               this.k[7] = this.d;
               this.k[8] = this.d;
               this.k[9] = this.e;
               this.k[10] = this.e;
               this.k[11] = this.e;
               this.l[0] = 0.0F;
               this.l[1] = this.j[0] / 2.0F;
               this.l[2] = this.l[1];
               this.l[3] = (this.j[0] + this.j[1]) / 2.0F + 0.01F;
               this.l[4] = this.l[3] - 0.01F;
               this.l[5] = (this.j[0] + this.j[1] + this.j[2]) / 2.0F;
               this.l[6] = 0.5F;
               this.l[7] = 0.5F + this.j[0] / 2.0F;
               this.l[8] = this.l[7];
               this.l[9] = 0.5F + this.j[0] / 2.0F + this.j[1] / 2.0F;
               this.l[10] = this.l[9] - 0.01F;
               this.l[11] = 0.5F + this.j[0] / 2.0F + this.j[1] / 2.0F + this.j[2] / 2.0F;
               break;
            default:
               throw new IllegalArgumentException("Unknown shader mode");
            }
         }

      }
   }

   public void a(boolean var1) {
      this.i = var1;
   }

   public void draw(Canvas var1) {
      var1.save();
      Rect var2 = this.getBounds();
      int var3 = var2.width();
      int var4 = var2.height();
      float var5 = (float)(var3 / 2);
      float var6 = (float)(var4 / 2);
      if (this.m) {
         this.b.setShader(new SweepGradient(var5, var6, this.k, this.l));
         this.m = false;
      }

      float var7;
      if (this.h != null) {
         var7 = (this.h[0] - (float)this.f) / 2.0F;
      } else {
         var7 = 0.0F;
      }

      var1.drawCircle(var5, var6, var6 - (float)(this.f / 2) - var7, this.b);
      if (this.i) {
         switch(this.g) {
         case 0:
            this.a(var1, (float)var2.right - this.h[0] / 2.0F, (float)var2.centerY() - 1.0F, this.h[0], this.h[1], false);
            break;
         case 1:
            this.a(var1, (float)var2.right - this.h[0] / 2.0F, (float)var2.centerY() - 1.0F, this.h[0], this.h[1], false);
            this.a(var1, (float)var2.left + this.h[0] / 2.0F, (float)var2.centerY() + 1.0F, this.h[0], this.h[1], true);
         }
      }

   }

   public int getOpacity() {
      return 0;
   }

   public void setAlpha(int var1) {
   }

   public void setColorFilter(ColorFilter var1) {
   }
}
