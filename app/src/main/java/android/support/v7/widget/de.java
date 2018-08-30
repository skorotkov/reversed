package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class de extends ct implements dd {
   private static Method a;
   private dd b;

   static {
      try {
         a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
      } catch (NoSuchMethodException var1) {
         Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
      }

   }

   public de(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   bv a(Context var1, boolean var2) {
      df var3 = new df(var1, var2);
      var3.setHoverListener(this);
      return var3;
   }

   public void a(android.support.v7.view.menu.m var1, MenuItem var2) {
      if (this.b != null) {
         this.b.a(var1, var2);
      }

   }

   public void a(dd var1) {
      this.b = var1;
   }

   public void a(Object var1) {
      if (VERSION.SDK_INT >= 23) {
         this.g.setEnterTransition((Transition)var1);
      }

   }

   public void b(android.support.v7.view.menu.m var1, MenuItem var2) {
      if (this.b != null) {
         this.b.b(var1, var2);
      }

   }

   public void b(Object var1) {
      if (VERSION.SDK_INT >= 23) {
         this.g.setExitTransition((Transition)var1);
      }

   }

   public void b(boolean var1) {
      if (a != null) {
         try {
            a.invoke(this.g, var1);
         } catch (Exception var3) {
            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
         }
      }

   }
}
