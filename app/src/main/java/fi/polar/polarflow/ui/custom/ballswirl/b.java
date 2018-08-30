package fi.polar.polarflow.ui.custom.ballswirl;

import android.graphics.Color;
import android.graphics.Point;

class b {
   public static final int a = Color.argb(255, 0, 237, 255);
   private static final float b = (float)Math.toRadians(1790.0D);
   private static final d c;
   private static final Point[][] d;
   private static final int[] e;
   private static final int[] f;

   static {
      c = new d(1.6F, 0.14F, b);
      d = new Point[][]{fi.polar.polarflow.ui.custom.ballswirl.c.b(fi.polar.polarflow.ui.custom.ballswirl.c.a(new d(c), 50)), fi.polar.polarflow.ui.custom.ballswirl.c.a(fi.polar.polarflow.ui.custom.ballswirl.c.a(new d(c), 50))};
      e = new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
      f = new int[]{0, 20, 29, 37, 49, 61, 71, 6, 17, 26, 36, 44, 51};
   }

   public static a[] a() {
      a[] var0 = new a[f.length];

      for(int var1 = 0; var1 < f.length; ++var1) {
         var0[var1] = new a(d[e[var1]], f[var1]);
      }

      return var0;
   }
}
