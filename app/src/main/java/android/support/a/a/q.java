package android.support.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Paint.Style;

class q {
   private static final Matrix k = new Matrix();
   final o a;
   float b = 0.0F;
   float c = 0.0F;
   float d = 0.0F;
   float e = 0.0F;
   int f = 255;
   String g = null;
   final android.support.v4.g.a h = new android.support.v4.g.a();
   private final Path i;
   private final Path j;
   private final Matrix l = new Matrix();
   private Paint m;
   private Paint n;
   private PathMeasure o;
   private int p;

   public q() {
      this.a = new o();
      this.i = new Path();
      this.j = new Path();
   }

   public q(q var1) {
      this.a = new o(var1.a, this.h);
      this.i = new Path(var1.i);
      this.j = new Path(var1.j);
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.p = var1.p;
      this.f = var1.f;
      this.g = var1.g;
      if (var1.g != null) {
         this.h.put(var1.g, this);
      }

   }

   private static float a(float var0, float var1, float var2, float var3) {
      return var0 * var3 - var1 * var2;
   }

   private float a(Matrix var1) {
      float var2 = 0.0F;
      float[] var3 = new float[]{0.0F, 1.0F, 1.0F, 0.0F};
      var1.mapVectors(var3);
      float var4 = (float)Math.hypot((double)var3[0], (double)var3[1]);
      float var5 = (float)Math.hypot((double)var3[2], (double)var3[3]);
      float var6 = a(var3[0], var3[1], var3[2], var3[3]);
      var4 = Math.max(var4, var5);
      if (var4 > 0.0F) {
         var2 = Math.abs(var6) / var4;
      }

      return var2;
   }

   // $FF: synthetic method
   static Paint a(q var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static Paint a(q var0, Paint var1) {
      var0.n = var1;
      return var1;
   }

   private void a(o var1, Matrix var2, Canvas var3, int var4, int var5, ColorFilter var6) {
      android.support.a.a.o.a(var1).set(var2);
      android.support.a.a.o.a(var1).preConcat(android.support.a.a.o.b(var1));
      var3.save();

      for(int var7 = 0; var7 < var1.a.size(); ++var7) {
         Object var8 = var1.a.get(var7);
         if (var8 instanceof o) {
            this.a((o)var8, android.support.a.a.o.a(var1), var3, var4, var5, var6);
         } else if (var8 instanceof p) {
            this.a(var1, (p)var8, var3, var4, var5, var6);
         }
      }

      var3.restore();
   }

   private void a(o var1, p var2, Canvas var3, int var4, int var5, ColorFilter var6) {
      float var7 = (float)var4 / this.d;
      float var8 = (float)var5 / this.e;
      float var9 = Math.min(var7, var8);
      Matrix var15 = android.support.a.a.o.a(var1);
      this.l.set(var15);
      this.l.postScale(var7, var8);
      var8 = this.a(var15);
      if (var8 != 0.0F) {
         var2.a(this.i);
         Path var10 = this.i;
         this.j.reset();
         if (var2.a()) {
            this.j.addPath(var10, this.l);
            var3.clipPath(this.j);
         } else {
            n var16 = (n)var2;
            if (var16.g != 0.0F || var16.h != 1.0F) {
               float var11 = var16.g;
               float var12 = var16.i;
               float var13 = var16.h;
               float var14 = var16.i;
               if (this.o == null) {
                  this.o = new PathMeasure();
               }

               this.o.setPath(this.i, false);
               var7 = this.o.getLength();
               var12 = (var11 + var12) % 1.0F * var7;
               var13 = (var13 + var14) % 1.0F * var7;
               var10.reset();
               if (var12 > var13) {
                  this.o.getSegment(var12, var7, var10, true);
                  this.o.getSegment(0.0F, var13, var10, true);
               } else {
                  this.o.getSegment(var12, var13, var10, true);
               }

               var10.rLineTo(0.0F, 0.0F);
            }

            this.j.addPath(var10, this.l);
            Paint var17;
            if (var16.c != 0) {
               if (this.n == null) {
                  this.n = new Paint();
                  this.n.setStyle(Style.FILL);
                  this.n.setAntiAlias(true);
               }

               var17 = this.n;
               var17.setColor(android.support.a.a.l.a(var16.c, var16.f));
               var17.setColorFilter(var6);
               var3.drawPath(this.j, var17);
            }

            if (var16.a != 0) {
               if (this.m == null) {
                  this.m = new Paint();
                  this.m.setStyle(Style.STROKE);
                  this.m.setAntiAlias(true);
               }

               var17 = this.m;
               if (var16.k != null) {
                  var17.setStrokeJoin(var16.k);
               }

               if (var16.j != null) {
                  var17.setStrokeCap(var16.j);
               }

               var17.setStrokeMiter(var16.l);
               var17.setColor(android.support.a.a.l.a(var16.a, var16.d));
               var17.setColorFilter(var6);
               var17.setStrokeWidth(var8 * var9 * var16.b);
               var3.drawPath(this.j, var17);
            }
         }
      }

   }

   // $FF: synthetic method
   static Paint b(q var0) {
      return var0.m;
   }

   // $FF: synthetic method
   static Paint b(q var0, Paint var1) {
      var0.m = var1;
      return var1;
   }

   public void a(Canvas var1, int var2, int var3, ColorFilter var4) {
      this.a(this.a, k, var1, var2, var3, var4);
   }

   public float getAlpha() {
      return (float)this.getRootAlpha() / 255.0F;
   }

   public int getRootAlpha() {
      return this.f;
   }

   public void setAlpha(float var1) {
      this.setRootAlpha((int)(255.0F * var1));
   }

   public void setRootAlpha(int var1) {
      this.f = var1;
   }
}
