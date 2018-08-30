package android.support.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {
   private static final String a;
   private static final Set b;
   private static final boolean c;

   static {
      a = "code_cache" + File.separator + "secondary-dexes";
      b = new HashSet();
      c = a(System.getProperty("java.vm.version"));
   }

   // $FF: synthetic method
   static Field a(Object var0, String var1) {
      return b(var0, var1);
   }

   // $FF: synthetic method
   static Method a(Object var0, String var1, Class[] var2) {
      return b(var0, var1, var2);
   }

   public static void a(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private static void a(ClassLoader var0, File var1, List var2) {
      if (!var2.isEmpty()) {
         if (VERSION.SDK_INT >= 19) {
            android.support.b.c.a(var0, var2, var1);
         } else if (VERSION.SDK_INT >= 14) {
            android.support.b.b.a(var0, var2, var1);
         } else {
            d.a(var0, var2);
         }
      }

   }

   // $FF: synthetic method
   static void a(Object var0, String var1, Object[] var2) {
      b(var0, var1, var2);
   }

   static boolean a(String var0) {
      boolean var1 = false;
      boolean var2 = var1;
      if (var0 != null) {
         Matcher var3 = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(var0);
         var2 = var1;
         if (var3.matches()) {
            label33: {
               int var4;
               int var5;
               try {
                  var4 = Integer.parseInt(var3.group(1));
                  var5 = Integer.parseInt(var3.group(2));
               } catch (NumberFormatException var6) {
                  var2 = var1;
                  break label33;
               }

               if (var4 <= 2) {
                  var2 = var1;
                  if (var4 != 2) {
                     break label33;
                  }

                  var2 = var1;
                  if (var5 < 1) {
                     break label33;
                  }
               }

               var2 = true;
            }
         }
      }

      StringBuilder var7 = (new StringBuilder()).append("VM with version ").append(var0);
      if (var2) {
         var0 = " has multidex support";
      } else {
         var0 = " does not have multidex support";
      }

      Log.i("MultiDex", var7.append(var0).toString());
      return var2;
   }

   private static boolean a(List var0) {
      Iterator var2 = var0.iterator();

      boolean var1;
      while(true) {
         if (var2.hasNext()) {
            if (e.a((File)var2.next())) {
               continue;
            }

            var1 = false;
            break;
         }

         var1 = true;
         break;
      }

      return var1;
   }

   private static ApplicationInfo b(Context var0) {
      Object var1 = null;

      PackageManager var2;
      String var3;
      ApplicationInfo var5;
      try {
         var2 = var0.getPackageManager();
         var3 = var0.getPackageName();
      } catch (RuntimeException var4) {
         Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", var4);
         var5 = (ApplicationInfo)var1;
         return var5;
      }

      var5 = (ApplicationInfo)var1;
      if (var2 != null) {
         if (var3 == null) {
            var5 = (ApplicationInfo)var1;
         } else {
            var5 = var2.getApplicationInfo(var3, 128);
         }
      }

      return var5;
   }

   private static Field b(Object var0, String var1) {
      Class var2 = var0.getClass();

      while(var2 != null) {
         try {
            Field var3 = var2.getDeclaredField(var1);
            if (!var3.isAccessible()) {
               var3.setAccessible(true);
            }

            return var3;
         } catch (NoSuchFieldException var4) {
            var2 = var2.getSuperclass();
         }
      }

      throw new NoSuchFieldException("Field " + var1 + " not found in " + var0.getClass());
   }

   private static Method b(Object var0, String var1, Class... var2) {
      Class var3 = var0.getClass();

      while(var3 != null) {
         try {
            Method var4 = var3.getDeclaredMethod(var1, var2);
            if (!var4.isAccessible()) {
               var4.setAccessible(true);
            }

            return var4;
         } catch (NoSuchMethodException var5) {
            var3 = var3.getSuperclass();
         }
      }

      throw new NoSuchMethodException("Method " + var1 + " with parameters " + Arrays.asList(var2) + " not found in " + var0.getClass());
   }

   private static void b(Object var0, String var1, Object[] var2) {
      Field var3 = b(var0, var1);
      Object[] var5 = (Object[])var3.get(var0);
      Object[] var4 = (Object[])Array.newInstance(var5.getClass().getComponentType(), var5.length + var2.length);
      System.arraycopy(var5, 0, var4, 0, var5.length);
      System.arraycopy(var2, 0, var4, var5.length, var2.length);
      var3.set(var0, var4);
   }

   private static void c(Context var0) {
      File var1 = new File(var0.getFilesDir(), "secondary-dexes");
      if (var1.isDirectory()) {
         Log.i("MultiDex", "Clearing old secondary dex dir (" + var1.getPath() + ").");
         File[] var5 = var1.listFiles();
         if (var5 == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + var1.getPath() + ").");
         } else {
            int var2 = var5.length;

            for(int var3 = 0; var3 < var2; ++var3) {
               File var4 = var5[var3];
               Log.i("MultiDex", "Trying to delete old file " + var4.getPath() + " of size " + var4.length());
               if (!var4.delete()) {
                  Log.w("MultiDex", "Failed to delete old file " + var4.getPath());
               } else {
                  Log.i("MultiDex", "Deleted old file " + var4.getPath());
               }
            }

            if (!var1.delete()) {
               Log.w("MultiDex", "Failed to delete secondary dex dir " + var1.getPath());
            } else {
               Log.i("MultiDex", "Deleted old secondary dex dir " + var1.getPath());
            }
         }
      }

   }
}
