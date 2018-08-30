package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;

public final class x {
   static final ac a;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 >= 23) {
         a = new z();
      } else if (var0 >= 21) {
         a = new y();
      } else if (var0 >= 19) {
         a = new ab();
      } else {
         a = new aa();
      }

   }

   public static void a(PopupWindow var0, int var1) {
      a.a(var0, var1);
   }

   public static void a(PopupWindow var0, View var1, int var2, int var3, int var4) {
      a.a(var0, var1, var2, var3, var4);
   }

   public static void a(PopupWindow var0, boolean var1) {
      a.a(var0, var1);
   }
}
