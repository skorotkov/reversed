package android.support.b;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class c {
   // $FF: synthetic method
   static void a(ClassLoader var0, List var1, File var2) {
      b(var0, var1, var2);
   }

   private static Object[] a(Object var0, ArrayList var1, File var2, ArrayList var3) {
      return (Object[])a.a(var0, "makeDexElements", new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(var0, var1, var2, var3);
   }

   private static void b(ClassLoader var0, List var1, File var2) {
      Object var3 = a.a(var0, "pathList").get(var0);
      ArrayList var4 = new ArrayList();
      a.a(var3, "dexElements", a(var3, new ArrayList(var1), var2, var4));
      if (var4.size() > 0) {
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            Log.w("MultiDex", "Exception in makeDexElement", (IOException)var5.next());
         }

         Field var7 = a.a(var0, "dexElementsSuppressedExceptions");
         IOException[] var8 = (IOException[])var7.get(var0);
         IOException[] var6;
         if (var8 == null) {
            var6 = (IOException[])var4.toArray(new IOException[var4.size()]);
         } else {
            var6 = new IOException[var4.size() + var8.length];
            var4.toArray(var6);
            System.arraycopy(var8, 0, var6, var4.size(), var8.length);
         }

         var7.set(var0, var6);
      }

   }
}
