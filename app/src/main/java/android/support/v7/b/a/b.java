package android.support.v7.b.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.aj;
import android.util.Log;
import android.util.TypedValue;
import java.util.WeakHashMap;

public final class b {
   private static final ThreadLocal a = new ThreadLocal();
   private static final WeakHashMap b = new WeakHashMap(0);
   private static final Object c = new Object();

   public static ColorStateList a(Context var0, int var1) {
      ColorStateList var2;
      if (VERSION.SDK_INT >= 23) {
         var2 = var0.getColorStateList(var1);
      } else {
         ColorStateList var3 = d(var0, var1);
         var2 = var3;
         if (var3 == null) {
            var2 = c(var0, var1);
            if (var2 != null) {
               a(var0, var1, var2);
            } else {
               var2 = android.support.v4.c.a.b(var0, var1);
            }
         }
      }

      return var2;
   }

   private static TypedValue a() {
      TypedValue var0 = (TypedValue)a.get();
      TypedValue var1 = var0;
      if (var0 == null) {
         var1 = new TypedValue();
         a.set(var1);
      }

      return var1;
   }

   private static void a(Context param0, int param1, ColorStateList param2) {
      // $FF: Couldn't be decompiled
   }

   public static Drawable b(Context var0, int var1) {
      return aj.a().a(var0, var1);
   }

   private static ColorStateList c(Context var0, int var1) {
      Object var2 = null;
      ColorStateList var6;
      if (e(var0, var1)) {
         var6 = (ColorStateList)var2;
      } else {
         Resources var3 = var0.getResources();
         XmlResourceParser var4 = var3.getXml(var1);

         try {
            var6 = android.support.v7.b.a.a.a(var3, var4, var0.getTheme());
         } catch (Exception var5) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", var5);
            var6 = (ColorStateList)var2;
         }
      }

      return var6;
   }

   private static ColorStateList d(Context param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean e(Context var0, int var1) {
      boolean var2 = true;
      Resources var4 = var0.getResources();
      TypedValue var3 = a();
      var4.getValue(var1, var3, true);
      if (var3.type < 28 || var3.type > 31) {
         var2 = false;
      }

      return var2;
   }
}
