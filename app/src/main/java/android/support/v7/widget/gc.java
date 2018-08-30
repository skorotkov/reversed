package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

class gc {
   static final int[] a = new int[]{-16842910};
   static final int[] b = new int[]{16842908};
   static final int[] c = new int[]{16843518};
   static final int[] d = new int[]{16842919};
   static final int[] e = new int[]{16842912};
   static final int[] f = new int[]{16842913};
   static final int[] g = new int[]{-16842919, -16842908};
   static final int[] h = new int[0];
   private static final ThreadLocal i = new ThreadLocal();
   private static final int[] j = new int[1];

   public static int a(Context var0, int var1) {
      j[0] = var1;
      gh var5 = gh.a(var0, (AttributeSet)null, j);

      try {
         var1 = var5.b(0, 0);
      } finally {
         var5.a();
      }

      return var1;
   }

   static int a(Context var0, int var1, float var2) {
      var1 = a(var0, var1);
      return android.support.v4.d.a.b(var1, Math.round((float)Color.alpha(var1) * var2));
   }

   private static TypedValue a() {
      TypedValue var0 = (TypedValue)i.get();
      TypedValue var1 = var0;
      if (var0 == null) {
         var1 = new TypedValue();
         i.set(var1);
      }

      return var1;
   }

   public static ColorStateList b(Context var0, int var1) {
      j[0] = var1;
      gh var5 = gh.a(var0, (AttributeSet)null, j);

      ColorStateList var2;
      try {
         var2 = var5.d(0);
      } finally {
         var5.a();
      }

      return var2;
   }

   public static int c(Context var0, int var1) {
      ColorStateList var2 = b(var0, var1);
      if (var2 != null && var2.isStateful()) {
         var1 = var2.getColorForState(a, var2.getDefaultColor());
      } else {
         TypedValue var3 = a();
         var0.getTheme().resolveAttribute(16842803, var3, true);
         var1 = a(var0, var1, var3.getFloat());
      }

      return var1;
   }
}
