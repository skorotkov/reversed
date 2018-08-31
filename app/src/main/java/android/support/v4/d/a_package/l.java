package android.support.v4.d.a_package;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

@TargetApi(21)
class l {
   public static Drawable a(Drawable var0) {
      Object var1 = var0;
      if (!(var0 instanceof w)) {
         var1 = new u(var0);
      }

      return (Drawable)var1;
   }

   public static void a(Drawable var0, float var1, float var2) {
      var0.setHotspot(var1, var2);
   }

   public static void a(Drawable var0, int var1) {
      var0.setTint(var1);
   }

   public static void a(Drawable var0, int var1, int var2, int var3, int var4) {
      var0.setHotspotBounds(var1, var2, var3, var4);
   }

   public static void a(Drawable var0, ColorStateList var1) {
      var0.setTintList(var1);
   }

   public static void a(Drawable var0, Theme var1) {
      var0.applyTheme(var1);
   }

   public static void a(Drawable var0, Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      var0.inflate(var1, var2, var3, var4);
   }

   public static void a(Drawable var0, Mode var1) {
      var0.setTintMode(var1);
   }

   public static boolean b(Drawable var0) {
      return var0.canApplyTheme();
   }

   public static ColorFilter c(Drawable var0) {
      return var0.getColorFilter();
   }
}
