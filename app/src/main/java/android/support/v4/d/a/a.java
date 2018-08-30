package android.support.v4.d.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public final class a {
   static final c a;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 >= 23) {
         a = new h();
      } else if (var0 >= 21) {
         a = new g();
      } else if (var0 >= 19) {
         a = new f();
      } else if (var0 >= 17) {
         a = new e();
      } else if (var0 >= 11) {
         a = new d();
      } else {
         a = new b();
      }

   }

   public static void a(Drawable var0) {
      a.a(var0);
   }

   public static void a(Drawable var0, float var1, float var2) {
      a.a(var0, var1, var2);
   }

   public static void a(Drawable var0, int var1) {
      a.a(var0, var1);
   }

   public static void a(Drawable var0, int var1, int var2, int var3, int var4) {
      a.a(var0, var1, var2, var3, var4);
   }

   public static void a(Drawable var0, ColorStateList var1) {
      a.a(var0, var1);
   }

   public static void a(Drawable var0, Theme var1) {
      a.a(var0, var1);
   }

   public static void a(Drawable var0, Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      a.a(var0, var1, var2, var3, var4);
   }

   public static void a(Drawable var0, Mode var1) {
      a.a(var0, var1);
   }

   public static void a(Drawable var0, boolean var1) {
      a.a(var0, var1);
   }

   public static boolean b(Drawable var0) {
      return a.b(var0);
   }

   public static int c(Drawable var0) {
      return a.d(var0);
   }

   public static boolean d(Drawable var0) {
      return a.e(var0);
   }

   public static ColorFilter e(Drawable var0) {
      return a.f(var0);
   }

   public static Drawable f(Drawable var0) {
      return a.c(var0);
   }
}
