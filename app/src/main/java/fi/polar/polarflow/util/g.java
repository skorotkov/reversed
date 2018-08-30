package fi.polar.polarflow.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class g {
   private static final String a = g.class.getSimpleName();

   private g() {
   }

   public static InputStream a(File var0, String var1) {
      var0 = new File(var0, var1);
      BufferedInputStream var2;
      if (var0.exists()) {
         var2 = new BufferedInputStream(new FileInputStream(var0));
      } else {
         var2 = null;
      }

      return var2;
   }

   public static void a(File var0, String var1, List var2) {
      File var3 = new File(var0, var1);
      if (var3.isDirectory()) {
         File[] var6 = var3.listFiles();
         int var4 = var6.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            a(var0, var6[var5].getAbsolutePath().replace(var0.getAbsolutePath(), ""), var2);
         }
      }

      b(var0, var1, var2);
   }

   public static boolean a(File param0, String param1, byte[] param2) {
      // $FF: Couldn't be decompiled
   }

   public static byte[] a(InputStream var0) {
      byte[] var1 = new byte[16384];
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();

      while(true) {
         int var3 = var0.read(var1, 0, var1.length);
         if (var3 == -1) {
            var2.flush();
            return var2.toByteArray();
         }

         var2.write(var1, 0, var3);
      }
   }

   public static void b(File var0, String var1, List var2) {
      File var3 = new File(var0, var1);
      if (var3.delete()) {
         if (var2 != null) {
            var2.add(var3.getAbsolutePath().replace(var0.getAbsolutePath(), ""));
         }

      } else {
         throw new FileNotFoundException("Failed to delete file: " + var3);
      }
   }

   public static boolean b(File var0, String var1) {
      return (new File(var0, var1)).exists();
   }

   public static File[] c(File var0, String var1) {
      File var2 = new File(var0, var1);
      File[] var4 = var2.listFiles();
      File[] var3 = var4;
      if (var4 == null) {
         d.e(a, "Cannot get file list for " + var2.getAbsolutePath());
         var3 = new File[0];
      }

      return var3;
   }

   public static boolean d(File var0, String var1) {
      var0 = new File(var0, var1);
      boolean var2;
      if (!var0.exists() && var0.mkdirs()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }
}
