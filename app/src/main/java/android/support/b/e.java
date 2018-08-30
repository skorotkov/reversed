package android.support.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

final class e {
   private static Method a;

   static {
      try {
         a = Editor.class.getMethod("apply");
      } catch (NoSuchMethodException var1) {
         a = null;
      }

   }

   private static SharedPreferences a(Context var0) {
      byte var1;
      if (VERSION.SDK_INT < 11) {
         var1 = 0;
      } else {
         var1 = 4;
      }

      return var0.getSharedPreferences("multidex.version", var1);
   }

   static List a(Context var0, ApplicationInfo var1, File var2, boolean var3) {
      Log.i("MultiDex", "MultiDexExtractor.load(" + var1.sourceDir + ", " + var3 + ")");
      File var4 = new File(var1.sourceDir);
      long var5 = c(var4);
      List var8;
      List var9;
      if (!var3 && !a(var0, var4, var5)) {
         label15: {
            try {
               var9 = a(var0, var4, var2);
            } catch (IOException var7) {
               Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", var7);
               var9 = a(var4, var2);
               a(var0, b(var4), var5, var9.size() + 1);
               var8 = var9;
               break label15;
            }

            var8 = var9;
         }
      } else {
         Log.i("MultiDex", "Detected that extraction must be performed.");
         var9 = a(var4, var2);
         a(var0, b(var4), var5, var9.size() + 1);
         var8 = var9;
      }

      Log.i("MultiDex", "load found " + var8.size() + " secondary dex files");
      return var8;
   }

   private static List a(Context var0, File var1, File var2) {
      Log.i("MultiDex", "loading existing secondary dex files");
      String var7 = var1.getName() + ".classes";
      int var3 = a(var0).getInt("dex.number", 1);
      ArrayList var4 = new ArrayList(var3);

      for(int var5 = 2; var5 <= var3; ++var5) {
         File var6 = new File(var2, var7 + var5 + ".zip");
         if (!var6.isFile()) {
            throw new IOException("Missing extracted secondary dex file '" + var6.getPath() + "'");
         }

         var4.add(var6);
         if (!a(var6)) {
            Log.i("MultiDex", "Invalid zip file: " + var6);
            throw new IOException("Invalid ZIP file.");
         }
      }

      return var4;
   }

   private static List a(File param0, File param1) {
      // $FF: Couldn't be decompiled
   }

   private static void a(Context var0, long var1, long var3, int var5) {
      Editor var6 = a(var0).edit();
      var6.putLong("timestamp", var1);
      var6.putLong("crc", var3);
      var6.putInt("dex.number", var5);
      a(var6);
   }

   private static void a(Editor var0) {
      if (a != null) {
         try {
            a.invoke(var0);
            return;
         } catch (InvocationTargetException var2) {
         } catch (IllegalAccessException var3) {
         }
      }

      var0.commit();
   }

   private static void a(Closeable var0) {
      try {
         var0.close();
      } catch (IOException var1) {
         Log.w("MultiDex", "Failed to close resource", var1);
      }

   }

   private static void a(File var0, String var1) {
      d(var0.getParentFile());
      d(var0);
      File[] var4 = var0.listFiles(new f(var1));
      if (var4 == null) {
         Log.w("MultiDex", "Failed to list secondary dex dir content (" + var0.getPath() + ").");
      } else {
         int var2 = var4.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            var0 = var4[var3];
            Log.i("MultiDex", "Trying to delete old file " + var0.getPath() + " of size " + var0.length());
            if (!var0.delete()) {
               Log.w("MultiDex", "Failed to delete old file " + var0.getPath());
            } else {
               Log.i("MultiDex", "Deleted old file " + var0.getPath());
            }
         }
      }

   }

   private static void a(ZipFile param0, ZipEntry param1, File param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   private static boolean a(Context var0, File var1, long var2) {
      SharedPreferences var5 = a(var0);
      boolean var4;
      if (var5.getLong("timestamp", -1L) == b(var1) && var5.getLong("crc", -1L) == var2) {
         var4 = false;
      } else {
         var4 = true;
      }

      return var4;
   }

   static boolean a(File param0) {
      // $FF: Couldn't be decompiled
   }

   private static long b(File var0) {
      long var1 = var0.lastModified();
      long var3 = var1;
      if (var1 == -1L) {
         var3 = var1 - 1L;
      }

      return var3;
   }

   private static long c(File var0) {
      long var1 = g.a(var0);
      long var3 = var1;
      if (var1 == -1L) {
         var3 = var1 - 1L;
      }

      return var3;
   }

   private static void d(File var0) {
      var0.mkdir();
      if (!var0.isDirectory()) {
         File var1 = var0.getParentFile();
         if (var1 == null) {
            Log.e("MultiDex", "Failed to create dir " + var0.getPath() + ". Parent file is null.");
         } else {
            Log.e("MultiDex", "Failed to create dir " + var0.getPath() + ". parent file is a dir " + var1.isDirectory() + ", a file " + var1.isFile() + ", exists " + var1.exists() + ", readable " + var1.canRead() + ", writable " + var1.canWrite());
         }

         throw new IOException("Failed to create cache directory " + var0.getPath());
      }
   }
}
