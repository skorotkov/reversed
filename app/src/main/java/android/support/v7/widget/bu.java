package android.support.v7.widget;

import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.os.Build.VERSION;

public class bu {
   public static final Rect a = new Rect();
   private static Class b;

   static {
      if (VERSION.SDK_INT >= 18) {
         try {
            b = Class.forName("android.graphics.Insets");
         } catch (ClassNotFoundException var1) {
         }
      }

   }

   static Mode a(int var0, Mode var1) {
      Mode var2 = var1;
      switch(var0) {
      case 3:
         var2 = Mode.SRC_OVER;
      case 4:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 12:
      case 13:
         break;
      case 5:
         var2 = Mode.SRC_IN;
         break;
      case 9:
         var2 = Mode.SRC_ATOP;
         break;
      case 14:
         var2 = Mode.MULTIPLY;
         break;
      case 15:
         var2 = Mode.SCREEN;
         break;
      case 16:
         var2 = var1;
         if (VERSION.SDK_INT >= 11) {
            var2 = Mode.valueOf("ADD");
         }
         break;
      default:
         var2 = var1;
      }

      return var2;
   }

   static void a(Drawable var0) {
      if (VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(var0.getClass().getName())) {
         c(var0);
      }

   }

   public static boolean b(Drawable var0) {
      boolean var1;
      if (VERSION.SDK_INT < 15 && var0 instanceof InsetDrawable) {
         var1 = false;
      } else if (VERSION.SDK_INT < 15 && var0 instanceof GradientDrawable) {
         var1 = false;
      } else if (VERSION.SDK_INT < 17 && var0 instanceof LayerDrawable) {
         var1 = false;
      } else {
         if (var0 instanceof DrawableContainer) {
            ConstantState var4 = var0.getConstantState();
            if (var4 instanceof DrawableContainerState) {
               Drawable[] var5 = ((DrawableContainerState)var4).getChildren();
               int var2 = var5.length;

               for(int var3 = 0; var3 < var2; ++var3) {
                  if (!b(var5[var3])) {
                     var1 = false;
                     return var1;
                  }
               }
            }
         } else {
            if (var0 instanceof android.support.v4.d.a.m) {
               var1 = b(((android.support.v4.d.a.m)var0).a());
               return var1;
            }

            if (var0 instanceof android.support.v7.c.a.a) {
               var1 = b(((android.support.v7.c.a.a)var0).a());
               return var1;
            }

            if (var0 instanceof ScaleDrawable) {
               var1 = b(((ScaleDrawable)var0).getDrawable());
               return var1;
            }
         }

         var1 = true;
      }

      return var1;
   }

   private static void c(Drawable var0) {
      int[] var1 = var0.getState();
      if (var1 != null && var1.length != 0) {
         var0.setState(gc.h);
      } else {
         var0.setState(gc.e);
      }

      var0.setState(var1);
   }
}
