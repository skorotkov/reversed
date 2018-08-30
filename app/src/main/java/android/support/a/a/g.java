package android.support.a.a;

import java.util.ArrayList;

class g {
   private static int a(String var0, int var1) {
      while(var1 < var0.length()) {
         char var2 = var0.charAt(var1);
         if (((var2 - 65) * (var2 - 90) <= 0 || (var2 - 97) * (var2 - 122) <= 0) && var2 != 'e' && var2 != 'E') {
            break;
         }

         ++var1;
      }

      return var1;
   }

   private static void a(String var0, int var1, h var2) {
      var2.b = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;

      int var6;
      for(var6 = var1; var6 < var0.length(); ++var6) {
         switch(var0.charAt(var6)) {
         case ' ':
         case ',':
            var3 = false;
            var5 = true;
            break;
         case '-':
            if (var6 != var1 && !var3) {
               var2.b = true;
               var3 = false;
               var5 = true;
               break;
            }
         default:
            var3 = false;
            break;
         case '.':
            if (!var4) {
               var3 = false;
               var4 = true;
            } else {
               var2.b = true;
               var3 = false;
               var5 = true;
            }
            break;
         case 'E':
         case 'e':
            var3 = true;
         }

         if (var5) {
            break;
         }
      }

      var2.a = var6;
   }

   private static void a(ArrayList var0, char var1, float[] var2) {
      var0.add(new i(var1, var2));
   }

   public static boolean a(i[] var0, i[] var1) {
      boolean var2 = false;
      boolean var3 = var2;
      if (var0 != null) {
         if (var1 == null) {
            var3 = var2;
         } else {
            var3 = var2;
            if (var0.length == var1.length) {
               int var4 = 0;

               while(true) {
                  if (var4 >= var0.length) {
                     var3 = true;
                     break;
                  }

                  var3 = var2;
                  if (var0[var4].a != var1[var4].a) {
                     break;
                  }

                  var3 = var2;
                  if (var0[var4].b.length != var1[var4].b.length) {
                     break;
                  }

                  ++var4;
               }
            }
         }
      }

      return var3;
   }

   static float[] a(float[] var0, int var1, int var2) {
      if (var1 > var2) {
         throw new IllegalArgumentException();
      } else {
         int var3 = var0.length;
         if (var1 >= 0 && var1 <= var3) {
            var2 -= var1;
            var3 = Math.min(var2, var3 - var1);
            float[] var4 = new float[var2];
            System.arraycopy(var0, var1, var4, 0, var3);
            return var4;
         } else {
            throw new ArrayIndexOutOfBoundsException();
         }
      }
   }

   public static i[] a(String var0) {
      i[] var7;
      if (var0 == null) {
         var7 = null;
      } else {
         ArrayList var1 = new ArrayList();
         int var2 = 1;

         int var3;
         int var4;
         for(var3 = 0; var2 < var0.length(); var3 = var4) {
            var4 = a(var0, var2);
            String var5 = var0.substring(var3, var4).trim();
            if (var5.length() > 0) {
               float[] var6 = b(var5);
               a(var1, var5.charAt(0), var6);
            }

            var2 = var4 + 1;
         }

         if (var2 - var3 == 1 && var3 < var0.length()) {
            a(var1, var0.charAt(var3), new float[0]);
         }

         var7 = (i[])var1.toArray(new i[var1.size()]);
      }

      return var7;
   }

   public static i[] a(i[] var0) {
      if (var0 == null) {
         var0 = null;
      } else {
         i[] var1 = new i[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = new i(var0[var2]);
         }

         var0 = var1;
      }

      return var0;
   }

   public static void b(i[] var0, i[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         var0[var2].a = (char)var1[var2].a;

         for(int var3 = 0; var3 < var1[var2].b.length; ++var3) {
            var0[var2].b[var3] = var1[var2].b[var3];
         }
      }

   }

   private static float[] b(String param0) {
      // $FF: Couldn't be decompiled
   }
}
