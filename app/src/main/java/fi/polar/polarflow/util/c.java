package fi.polar.polarflow.util;

import android.os.Build;
import android.os.Build.VERSION;
import fi.polar.polarflow.data.DeviceInfo;

public class c {
   private static a a = new a();

   public static int a(byte[] var0, int var1) {
      int var2 = var1 * 3;
      int var3 = var0.length;

      for(var1 = 0; var1 < var3; ++var1) {
         byte var4 = var0[var1];
         var2 += (var4 & 15) + (var4 >> 4 & 15) * 3;
      }

      return var2 % 16;
   }

   public static String a() {
      String var0 = b();
      String var1 = var0;
      if (var0 == null) {
         var1 = c();
         d.e("DeviceUtils", "Could not extract Device ID from HW serial no. \"" + Build.SERIAL + "\" -> using fake value \"" + var1 + "\" instead");
      }

      return var1;
   }

   public static String a(String var0) {
      if (var0 != null && var0.startsWith("Polar")) {
         String[] var1 = var0.split(" ");
         if (var1.length == 3) {
            var0 = var1[2];
            if (!c(var0)) {
               var0 = null;
            }

            return var0;
         }
      }

      var0 = null;
      return var0;
   }

   public static String a(byte[] var0, boolean var1) {
      String var7;
      if (var0.length != 6) {
         d.c("DeviceUtils", "", new NumberFormatException("Expecting six bytes (48-bit BT_ADDR)"));
         var7 = "";
      } else {
         char[] var2 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
         StringBuilder var3 = new StringBuilder();
         int var4 = var0.length - 1;

         for(int var5 = 0; var5 < var0.length; ++var5) {
            int var8;
            if (var1) {
               byte var6 = var0[var4];
               --var4;
               var8 = var6 & 255;
            } else {
               var8 = var0[var5] & 255;
            }

            if (var5 > 0) {
               var3.append(':');
            }

            var3.append(var2[var8 >>> 4]);
            var3.append(var2[var8 & 15]);
         }

         var7 = var3.toString();
      }

      return var7;
   }

   private static boolean a(byte[] var0) {
      boolean var1 = true;
      if (var0 != null && var0.length == 4) {
         byte var2 = var0[0];
         byte var3 = var0[1];
         byte var4 = var0[2];
         byte var5 = var0[3];
         byte var6 = var0[3];
         if (a(new byte[]{var2, var3, var4}, var5 >>> 4) == (var6 & 15)) {
            return var1;
         }
      }

      var1 = false;
      return var1;
   }

   public static byte[] a(String var0, boolean var1) {
      byte[] var2 = new byte[6];
      String[] var6 = var0.split("\\:");
      if (var6.length != 6) {
         d.c("DeviceUtils", "", new NumberFormatException("Expecting six groups of hex digits"));
      } else {
         int var3 = var6.length - 1;

         for(int var4 = 0; var4 < var6.length; ++var4) {
            int var5 = Integer.parseInt(var6[var4], 16);
            if (var5 < 0 || var5 > 255) {
               d.c("DeviceUtils", "", new NumberFormatException("Value outside range (0x00 - 0xFF)"));
               break;
            }

            if (var1) {
               var2[var3] = (byte)((byte)var5);
               --var3;
            } else {
               var2[var4] = (byte)((byte)var5);
            }
         }
      }

      return var2;
   }

   public static String b() {
      String var0 = null;
      if (Build.SERIAL.length() == 16) {
         String[] var1 = b(Build.SERIAL);
         if (var1.length == 2) {
            var0 = var1[1];
         }
      } else if (c(Build.SERIAL)) {
         var0 = Build.SERIAL;
      }

      return var0;
   }

   public static String[] b(String var0) {
      String[] var1 = new String[0];
      String[] var2 = var1;
      if (var0 != null) {
         var2 = var1;
         if (var0.length() == 16) {
            String var3 = var0.substring(0, 8);
            var0 = var0.substring(8);
            var2 = var1;
            if (var3.matches("[0-9]{8}")) {
               var2 = var1;
               if (c(var0)) {
                  String var5 = var3.substring(0, 6);
                  String var4 = var3.substring(6);
                  var4 = "00" + var5 + "." + var4;
                  var2 = new String[]{var4, var0};
               }
            }
         }
      }

      return var2;
   }

   public static String c() {
      return "F4909610";
   }

   public static boolean c(String var0) {
      boolean var1 = false;
      boolean var2 = var1;
      if (var0 != null) {
         var2 = var1;
         if (var0.length() == 8) {
            try {
               var2 = a(d(var0));
            } catch (NumberFormatException var3) {
               var2 = var1;
            }
         }
      }

      return var2;
   }

   public static String d() {
      return "Polar M600";
   }

   public static byte[] d(String var0) {
      byte[] var1 = new byte[var0.length() / 2];
      if (var0.length() >= 2 && var0.length() % 2 == 0) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (byte)((byte)Integer.parseInt(var0.substring(var2 * 2, var2 * 2 + 2), 16));
         }
      } else {
         d.c("DeviceUtils", "", new NumberFormatException("Expecting non-null string with length divisible by 2"));
      }

      return var1;
   }

   public static String e() {
      String[] var0 = b(Build.SERIAL);
      String var1;
      if (var0.length == 2) {
         var1 = var0[0];
      } else {
         d.e("DeviceUtils", "Could not extract HW Code from HW serial no. \"" + Build.SERIAL + "\" -> using fake value \"" + "00756756.00" + "\" instead");
         var1 = "00756756.00";
      }

      return var1;
   }

   public static DeviceInfo f() {
      return new DeviceInfo(a(), d(), e(), "Black", "Unisex", VERSION.RELEASE, Build.ID, g());
   }

   private static String g() {
      String var0 = String.valueOf(a.a());
      int var1 = var0.length();
      if (var1 != 7) {
         d.f("DeviceUtils", "getPolarAppVersion(Invalid versionCode length. Must be 7 but actually is " + var1 + ")");
         var0 = null;
      } else {
         var0 = var0.substring(var1 - 4, var1 - 3) + "." + var0.substring(var1 - 3, var1 - 2) + "." + var0.substring(var1 - 2, var1);
      }

      return var0;
   }
}
