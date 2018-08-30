package fi.polar.a.a;

import android.util.SparseArray;

public class b {
   private static final SparseArray a = new c();
   private static final SparseArray b = new d();

   public static String a(int var0) {
      String var1 = (String)a.get(var0);
      if (var1 == null) {
         var1 = String.valueOf(var0);
      }

      return var1;
   }

   public static void a(String var0, String var1) {
   }

   public static void a(String var0, String var1, Throwable var2) {
   }

   public static String b(int var0) {
      String var1 = (String)b.get(var0);
      if (var1 == null) {
         var1 = String.valueOf(var0);
      }

      return var1;
   }

   public static void b(String var0, String var1) {
   }

   public static void c(String var0, String var1) {
   }

   public static void d(String var0, String var1) {
   }
}
