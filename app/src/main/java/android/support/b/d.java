package android.support.b;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.ZipFile;

final class d {
   // $FF: synthetic method
   static void a(ClassLoader var0, List var1) {
      b(var0, var1);
   }

   private static void b(ClassLoader var0, List var1) {
      int var2 = var1.size();
      Field var3 = a.a(var0, "path");
      StringBuilder var4 = new StringBuilder((String)var3.get(var0));
      String[] var5 = new String[var2];
      File[] var6 = new File[var2];
      ZipFile[] var7 = new ZipFile[var2];
      DexFile[] var8 = new DexFile[var2];

      String var10;
      for(ListIterator var9 = var1.listIterator(); var9.hasNext(); var8[var2] = DexFile.loadDex(var10, var10 + ".dex", 0)) {
         File var11 = (File)var9.next();
         var10 = var11.getAbsolutePath();
         var4.append(':').append(var10);
         var2 = var9.previousIndex();
         var5[var2] = var10;
         var6[var2] = var11;
         var7[var2] = new ZipFile(var11);
      }

      var3.set(var0, var4.toString());
      a.a((Object)var0, (String)"mPaths", (Object[])var5);
      a.a((Object)var0, (String)"mFiles", (Object[])var6);
      a.a((Object)var0, (String)"mZips", (Object[])var7);
      a.a((Object)var0, (String)"mDexs", (Object[])var8);
   }
}
