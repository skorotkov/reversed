package android.support.a.a;

import android.graphics.Path;
import android.util.Log;

public class i {
   char a;
   float[] b;

   i(char var1, float[] var2) {
      this.a = (char)var1;
      this.b = var2;
   }

   i(i var1) {
      this.a = (char)var1.a;
      this.b = g.a(var1.b, 0, var1.b.length);
   }

   private static void a(Path var0, double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17) {
      int var19 = (int)Math.ceil(Math.abs(4.0D * var17 / 3.141592653589793D));
      double var20 = Math.cos(var13);
      double var22 = Math.sin(var13);
      double var24 = Math.cos(var15);
      double var26 = Math.sin(var15);
      var13 = -var5;
      double var28 = -var5;
      double var30 = var17 / (double)var19;
      int var32 = 0;
      var28 = var26 * var28 * var22 + var24 * var7 * var20;
      var24 = var13 * var20 * var26 - var7 * var22 * var24;
      var17 = var15;
      var13 = var11;
      var15 = var9;
      var9 = var24;

      for(var11 = var28; var32 < var19; var11 = var26) {
         double var33 = var17 + var30;
         var26 = Math.sin(var33);
         double var35 = Math.cos(var33);
         var28 = var5 * var20 * var35 + var1 - var7 * var22 * var26;
         var24 = var7 * var20 * var26 + var5 * var22 * var35 + var3;
         double var37 = -var5 * var20 * var26 - var7 * var22 * var35;
         var26 = var35 * var7 * var20 + var26 * -var5 * var22;
         var35 = Math.tan((var33 - var17) / 2.0D);
         var17 = Math.sin(var33 - var17);
         var17 = (Math.sqrt(var35 * 3.0D * var35 + 4.0D) - 1.0D) * var17 / 3.0D;
         var0.rLineTo(0.0F, 0.0F);
         var0.cubicTo((float)(var9 * var17 + var15), (float)(var13 + var11 * var17), (float)(var28 - var17 * var37), (float)(var24 - var17 * var26), (float)var28, (float)var24);
         ++var32;
         var9 = var37;
         var17 = var33;
         var13 = var24;
         var15 = var28;
      }

   }

   private static void a(Path var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8, boolean var9) {
      double var10 = Math.toRadians((double)var7);
      double var12 = Math.cos(var10);
      double var14 = Math.sin(var10);
      double var16 = ((double)var1 * var12 + (double)var2 * var14) / (double)var5;
      double var18 = ((double)(-var1) * var14 + (double)var2 * var12) / (double)var6;
      double var20 = ((double)var3 * var12 + (double)var4 * var14) / (double)var5;
      double var22 = ((double)(-var3) * var14 + (double)var4 * var12) / (double)var6;
      double var24 = var16 - var20;
      double var26 = var18 - var22;
      double var28 = (var16 + var20) / 2.0D;
      double var30 = (var18 + var22) / 2.0D;
      double var32 = var24 * var24 + var26 * var26;
      if (var32 == 0.0D) {
         Log.w("PathParser", " Points are coincident");
      } else {
         double var34 = 1.0D / var32 - 0.25D;
         if (var34 < 0.0D) {
            Log.w("PathParser", "Points are too far apart " + var32);
            float var36 = (float)(Math.sqrt(var32) / 1.99999D);
            a(var0, var1, var2, var3, var4, var5 * var36, var6 * var36, var7, var8, var9);
         } else {
            var34 = Math.sqrt(var34);
            var24 *= var34;
            var26 *= var34;
            if (var8 == var9) {
               var28 -= var26;
               var30 += var24;
            } else {
               var28 += var26;
               var30 -= var24;
            }

            var18 = Math.atan2(var18 - var30, var16 - var28);
            var20 = Math.atan2(var22 - var30, var20 - var28) - var18;
            if (var20 >= 0.0D) {
               var8 = true;
            } else {
               var8 = false;
            }

            var22 = var20;
            if (var9 != var8) {
               if (var20 > 0.0D) {
                  var22 = var20 - 6.283185307179586D;
               } else {
                  var22 = var20 + 6.283185307179586D;
               }
            }

            var28 = (double)var5 * var28;
            var30 *= (double)var6;
            a(var0, var28 * var12 - var30 * var14, var28 * var14 + var30 * var12, (double)var5, (double)var6, (double)var1, (double)var2, var10, var18, var22);
         }
      }

   }

   private static void a(Path var0, float[] var1, char var2, char var3, float[] var4) {
      float var5 = var1[0];
      float var6 = var1[1];
      float var7 = var1[2];
      float var8 = var1[3];
      float var9 = var1[4];
      float var10 = var1[5];
      byte var11;
      switch(var3) {
      case 'A':
      case 'a':
         var11 = 7;
         break;
      case 'C':
      case 'c':
         var11 = 6;
         break;
      case 'H':
      case 'V':
      case 'h':
      case 'v':
         var11 = 1;
         break;
      case 'L':
      case 'M':
      case 'T':
      case 'l':
      case 'm':
      case 't':
         var11 = 2;
         break;
      case 'Q':
      case 'S':
      case 'q':
      case 's':
         var11 = 4;
         break;
      case 'Z':
      case 'z':
         var0.close();
         var0.moveTo(var9, var10);
         var8 = var10;
         var7 = var9;
         var6 = var10;
         var5 = var9;
         var11 = 2;
         break;
      default:
         var11 = 2;
      }

      float var13;
      for(int var12 = 0; var12 < var4.length; var9 = var13) {
         float var14;
         float var15;
         boolean var16;
         boolean var17;
         switch(var3) {
         case 'A':
            var14 = var4[var12 + 5];
            var8 = var4[var12 + 6];
            var15 = var4[var12 + 0];
            var7 = var4[var12 + 1];
            var13 = var4[var12 + 2];
            if (var4[var12 + 3] != 0.0F) {
               var16 = true;
            } else {
               var16 = false;
            }

            if (var4[var12 + 4] != 0.0F) {
               var17 = true;
            } else {
               var17 = false;
            }

            a(var0, var5, var6, var14, var8, var15, var7, var13, var16, var17);
            var5 = var4[var12 + 5];
            var13 = var4[var12 + 6];
            var8 = var9;
            var7 = var5;
            var6 = var13;
            var9 = var10;
            var10 = var13;
            break;
         case 'C':
            var0.cubicTo(var4[var12 + 0], var4[var12 + 1], var4[var12 + 2], var4[var12 + 3], var4[var12 + 4], var4[var12 + 5]);
            var5 = var4[var12 + 4];
            var6 = var4[var12 + 5];
            var7 = var4[var12 + 2];
            var13 = var4[var12 + 3];
            var8 = var9;
            var9 = var10;
            var10 = var13;
            break;
         case 'H':
            var0.lineTo(var4[var12 + 0], var6);
            var5 = var4[var12 + 0];
            var13 = var8;
            var8 = var9;
            var9 = var10;
            var10 = var13;
            break;
         case 'L':
            var0.lineTo(var4[var12 + 0], var4[var12 + 1]);
            var5 = var4[var12 + 0];
            var6 = var4[var12 + 1];
            var13 = var9;
            var9 = var10;
            var10 = var8;
            var8 = var13;
            break;
         case 'M':
            var6 = var4[var12 + 0];
            var5 = var4[var12 + 1];
            if (var12 > 0) {
               var0.lineTo(var4[var12 + 0], var4[var12 + 1]);
               var13 = var5;
               var5 = var6;
               var6 = var9;
               var9 = var10;
               var10 = var8;
               var8 = var6;
               var6 = var13;
            } else {
               var0.moveTo(var4[var12 + 0], var4[var12 + 1]);
               var13 = var6;
               var10 = var8;
               var9 = var5;
               var8 = var6;
               var6 = var5;
               var5 = var13;
            }
            break;
         case 'Q':
            var0.quadTo(var4[var12 + 0], var4[var12 + 1], var4[var12 + 2], var4[var12 + 3]);
            var7 = var4[var12 + 0];
            var13 = var4[var12 + 1];
            var5 = var4[var12 + 2];
            var6 = var4[var12 + 3];
            var8 = var9;
            var9 = var10;
            var10 = var13;
            break;
         case 'S':
            if (var2 != 'c' && var2 != 's' && var2 != 'C' && var2 != 'S') {
               var8 = var5;
            } else {
               var7 = 2.0F * var5 - var7;
               var6 = 2.0F * var6 - var8;
               var8 = var7;
            }

            var0.cubicTo(var8, var6, var4[var12 + 0], var4[var12 + 1], var4[var12 + 2], var4[var12 + 3]);
            var7 = var4[var12 + 0];
            var13 = var4[var12 + 1];
            var5 = var4[var12 + 2];
            var6 = var4[var12 + 3];
            var8 = var9;
            var9 = var10;
            var10 = var13;
            break;
         case 'T':
            label108: {
               if (var2 != 'q' && var2 != 't' && var2 != 'Q') {
                  var14 = var6;
                  var13 = var5;
                  if (var2 != 'T') {
                     break label108;
                  }
               }

               var13 = 2.0F * var5 - var7;
               var14 = 2.0F * var6 - var8;
            }

            var0.quadTo(var13, var14, var4[var12 + 0], var4[var12 + 1]);
            var5 = var4[var12 + 0];
            var6 = var4[var12 + 1];
            var7 = var13;
            var8 = var9;
            var9 = var10;
            var10 = var14;
            break;
         case 'V':
            var0.lineTo(var5, var4[var12 + 0]);
            var13 = var4[var12 + 0];
            var6 = var9;
            var9 = var10;
            var10 = var8;
            var8 = var6;
            var6 = var13;
            break;
         case 'a':
            var13 = var4[var12 + 5];
            var7 = var4[var12 + 6];
            var8 = var4[var12 + 0];
            var15 = var4[var12 + 1];
            var14 = var4[var12 + 2];
            if (var4[var12 + 3] != 0.0F) {
               var16 = true;
            } else {
               var16 = false;
            }

            if (var4[var12 + 4] != 0.0F) {
               var17 = true;
            } else {
               var17 = false;
            }

            a(var0, var5, var6, var13 + var5, var7 + var6, var8, var15, var14, var16, var17);
            var5 += var4[var12 + 5];
            var13 = var4[var12 + 6] + var6;
            var8 = var9;
            var7 = var5;
            var6 = var13;
            var9 = var10;
            var10 = var13;
            break;
         case 'c':
            var0.rCubicTo(var4[var12 + 0], var4[var12 + 1], var4[var12 + 2], var4[var12 + 3], var4[var12 + 4], var4[var12 + 5]);
            var7 = var4[var12 + 2];
            var14 = var4[var12 + 3];
            var8 = var4[var12 + 4];
            var13 = var4[var12 + 5];
            var7 += var5;
            var13 += var6;
            var5 += var8;
            var8 = var9;
            var6 += var14;
            var9 = var10;
            var10 = var6;
            var6 = var13;
            break;
         case 'h':
            var0.rLineTo(var4[var12 + 0], 0.0F);
            var13 = var4[var12 + 0];
            var13 += var5;
            var5 = var8;
            var8 = var9;
            var9 = var10;
            var10 = var5;
            var5 = var13;
            break;
         case 'l':
            var0.rLineTo(var4[var12 + 0], var4[var12 + 1]);
            var14 = var4[var12 + 0];
            var13 = var4[var12 + 1];
            var13 += var6;
            var5 += var14;
            var6 = var9;
            var9 = var10;
            var10 = var8;
            var8 = var6;
            var6 = var13;
            break;
         case 'm':
            var5 += var4[var12 + 0];
            var6 += var4[var12 + 1];
            if (var12 > 0) {
               var0.rLineTo(var4[var12 + 0], var4[var12 + 1]);
               var13 = var9;
               var9 = var10;
               var10 = var8;
               var8 = var13;
            } else {
               var0.rMoveTo(var4[var12 + 0], var4[var12 + 1]);
               var10 = var8;
               var9 = var6;
               var8 = var5;
               var6 = var6;
               var5 = var5;
            }
            break;
         case 'q':
            var0.rQuadTo(var4[var12 + 0], var4[var12 + 1], var4[var12 + 2], var4[var12 + 3]);
            var7 = var4[var12 + 0];
            var14 = var4[var12 + 1];
            var8 = var4[var12 + 2];
            var13 = var4[var12 + 3];
            var7 += var5;
            var13 += var6;
            var5 += var8;
            var8 = var9;
            var6 += var14;
            var9 = var10;
            var10 = var6;
            var6 = var13;
            break;
         case 's':
            if (var2 != 'c' && var2 != 's' && var2 != 'C' && var2 != 'S') {
               var8 = 0.0F;
               var7 = 0.0F;
            } else {
               var7 = var5 - var7;
               var8 = var6 - var8;
            }

            var0.rCubicTo(var7, var8, var4[var12 + 0], var4[var12 + 1], var4[var12 + 2], var4[var12 + 3]);
            var7 = var4[var12 + 0];
            var14 = var4[var12 + 1];
            var8 = var4[var12 + 2];
            var13 = var4[var12 + 3];
            var7 += var5;
            var13 += var6;
            var5 += var8;
            var8 = var9;
            var6 += var14;
            var9 = var10;
            var10 = var6;
            var6 = var13;
            break;
         case 't':
            if (var2 != 'q' && var2 != 't' && var2 != 'Q' && var2 != 'T') {
               var8 = 0.0F;
               var7 = 0.0F;
            } else {
               var7 = var5 - var7;
               var8 = var6 - var8;
            }

            var0.rQuadTo(var7, var8, var4[var12 + 0], var4[var12 + 1]);
            var15 = var4[var12 + 0];
            var14 = var4[var12 + 1];
            var13 = var5 + var7;
            var14 += var6;
            var5 += var15;
            var7 = var9;
            var8 += var6;
            var9 = var10;
            var10 = var8;
            var8 = var7;
            var7 = var13;
            var6 = var14;
            break;
         case 'v':
            var0.rLineTo(0.0F, var4[var12 + 0]);
            var14 = var4[var12 + 0];
            var13 = var9;
            var6 += var14;
            var9 = var10;
            var10 = var8;
            var8 = var13;
            break;
         default:
            var13 = var10;
            var10 = var8;
            var8 = var9;
            var9 = var13;
         }

         var12 += var11;
         var13 = var8;
         var2 = var3;
         var8 = var10;
         var10 = var9;
      }

      var1[0] = var5;
      var1[1] = var6;
      var1[2] = var7;
      var1[3] = var8;
      var1[4] = var9;
      var1[5] = var10;
   }

   public static void a(i[] var0, Path var1) {
      float[] var2 = new float[6];
      byte var3 = 109;
      int var4 = 0;

      char var6;
      for(char var5 = (char)var3; var4 < var0.length; var5 = var6) {
         a(var1, var2, var5, var0[var4].a, var0[var4].b);
         var6 = var0[var4].a;
         ++var4;
      }

   }
}
