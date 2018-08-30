package android.support.a.a;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

class j {
   public static float a(TypedArray var0, XmlPullParser var1, String var2, int var3, float var4) {
      if (a(var1, var2)) {
         var4 = var0.getFloat(var3, var4);
      }

      return var4;
   }

   public static int a(TypedArray var0, XmlPullParser var1, String var2, int var3, int var4) {
      if (a(var1, var2)) {
         var4 = var0.getInt(var3, var4);
      }

      return var4;
   }

   public static boolean a(TypedArray var0, XmlPullParser var1, String var2, int var3, boolean var4) {
      if (a(var1, var2)) {
         var4 = var0.getBoolean(var3, var4);
      }

      return var4;
   }

   public static boolean a(XmlPullParser var0, String var1) {
      boolean var2;
      if (var0.getAttributeValue("http://schemas.android.com/apk/res/android", var1) != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public static int b(TypedArray var0, XmlPullParser var1, String var2, int var3, int var4) {
      if (a(var1, var2)) {
         var4 = var0.getColor(var3, var4);
      }

      return var4;
   }
}
