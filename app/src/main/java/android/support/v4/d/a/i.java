package android.support.v4.d.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

@TargetApi(9)
class i {
   public static Drawable a(Drawable var0) {
      Object var1 = var0;
      if (!(var0 instanceof w)) {
         var1 = new n(var0);
      }

      return (Drawable)var1;
   }

   public static void a(Drawable var0, int var1) {
      if (var0 instanceof w) {
         ((w)var0).setTint(var1);
      }

   }

   public static void a(Drawable var0, ColorStateList var1) {
      if (var0 instanceof w) {
         ((w)var0).setTintList(var1);
      }

   }

   public static void a(Drawable var0, Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      var0.inflate(var1, var2, var3);
   }

   public static void a(Drawable var0, Mode var1) {
      if (var0 instanceof w) {
         ((w)var0).setTintMode(var1);
      }

   }
}
