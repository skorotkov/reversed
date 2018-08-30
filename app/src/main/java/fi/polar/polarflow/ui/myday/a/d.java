package fi.polar.polarflow.ui.myday.a;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;

public class d {
   private static final int[] d = new int[]{0, 1, 2, 3, 4};
   private static final int[] e = new int[]{2131231156, 2131231157, 2131231158, 2131231159, 2131231160};
   private static final int[] f = new int[]{2131231044, 2131231043, 2131231042, 2131231041, 2131231040};
   public final int a;
   public final CharSequence b;
   public final CharSequence c;

   private d(int var1, CharSequence var2, CharSequence var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public static List a(Resources var0) {
      ArrayList var1 = new ArrayList(d.length);

      for(int var2 = d.length - 1; var2 >= 0; --var2) {
         var1.add(new d(d[var2], var0.getText(e[var2]), var0.getText(f[var2])));
      }

      return var1;
   }

   public static List b(Resources var0) {
      ArrayList var1 = new ArrayList(d.length);

      for(int var2 = 0; var2 < d.length; ++var2) {
         var1.add(new d(d[var2], var0.getText(e[var2]), var0.getText(f[var2])));
      }

      return var1;
   }
}
