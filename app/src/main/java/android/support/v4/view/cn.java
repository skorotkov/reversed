package android.support.v4.view;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;

@TargetApi(9)
class cn {
   private static Field a;
   private static boolean b;
   private static Field c;
   private static boolean d;

   static ColorStateList a(View var0) {
      ColorStateList var1;
      if (var0 instanceof bt) {
         var1 = ((bt)var0).getSupportBackgroundTintList();
      } else {
         var1 = null;
      }

      return var1;
   }

   static void a(View var0, ColorStateList var1) {
      if (var0 instanceof bt) {
         ((bt)var0).setSupportBackgroundTintList(var1);
      }

   }

   static void a(View var0, Mode var1) {
      if (var0 instanceof bt) {
         ((bt)var0).setSupportBackgroundTintMode(var1);
      }

   }

   static Mode b(View var0) {
      Mode var1;
      if (var0 instanceof bt) {
         var1 = ((bt)var0).getSupportBackgroundTintMode();
      } else {
         var1 = null;
      }

      return var1;
   }

   static int c(View var0) {
      if (!b) {
         try {
            a = View.class.getDeclaredField("mMinWidth");
            a.setAccessible(true);
         } catch (NoSuchFieldException var3) {
         }

         b = true;
      }

      int var1;
      if (a != null) {
         try {
            var1 = (Integer)a.get(var0);
            return var1;
         } catch (Exception var4) {
         }
      }

      var1 = 0;
      return var1;
   }

   static int d(View var0) {
      if (!d) {
         try {
            c = View.class.getDeclaredField("mMinHeight");
            c.setAccessible(true);
         } catch (NoSuchFieldException var3) {
         }

         d = true;
      }

      int var1;
      if (c != null) {
         try {
            var1 = (Integer)c.get(var0);
            return var1;
         } catch (Exception var4) {
         }
      }

      var1 = 0;
      return var1;
   }

   static boolean e(View var0) {
      boolean var1;
      if (var0.getWindowToken() != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   static Display f(View var0) {
      Display var1;
      if (e(var0)) {
         var1 = ((WindowManager)var0.getContext().getSystemService("window")).getDefaultDisplay();
      } else {
         var1 = null;
      }

      return var1;
   }
}
