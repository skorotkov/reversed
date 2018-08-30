package android.support.v4.widget;

import android.support.v4.view.bz;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

class aa implements ac {
   private static Method a;
   private static boolean b;

   public void a(PopupWindow var1, int var2) {
      if (!b) {
         try {
            a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
            a.setAccessible(true);
         } catch (Exception var5) {
         }

         b = true;
      }

      if (a != null) {
         try {
            a.invoke(var1, var2);
         } catch (Exception var4) {
         }
      }

   }

   public void a(PopupWindow var1, View var2, int var3, int var4, int var5) {
      int var6 = var3;
      if ((android.support.v4.view.y.a(var5, bz.g(var2)) & 7) == 5) {
         var6 = var3 - (var1.getWidth() - var2.getWidth());
      }

      var1.showAsDropDown(var2, var6, var4);
   }

   public void a(PopupWindow var1, boolean var2) {
   }
}
