package android.support.b;

import java.io.File;
import java.io.FileFilter;

final class f implements FileFilter {
   // $FF: synthetic field
   final String a;

   f(String var1) {
      this.a = var1;
   }

   public boolean accept(File var1) {
      boolean var2;
      if (!var1.getName().startsWith(this.a)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }
}
