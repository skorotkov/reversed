package android.support.b;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

final class b {
   // $FF: synthetic method
   static void a(ClassLoader var0, List var1, File var2) {
      b(var0, var1, var2);
   }

   private static Object[] a(Object var0, ArrayList var1, File var2) {
      return (Object[])a.a(var0, "makeDexElements", new Class[]{ArrayList.class, File.class}).invoke(var0, var1, var2);
   }

   private static void b(ClassLoader var0, List var1, File var2) {
      Object var3 = a.a(var0, "pathList").get(var0);
      a.a(var3, "dexElements", a(var3, new ArrayList(var1), var2));
   }
}
