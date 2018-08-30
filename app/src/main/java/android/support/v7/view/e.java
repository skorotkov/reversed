package android.support.v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

class e implements OnMenuItemClickListener {
   private static final Class[] a = new Class[]{MenuItem.class};
   private Object b;
   private Method c;

   public e(Object var1, String var2) {
      this.b = var1;
      Class var3 = var1.getClass();

      try {
         this.c = var3.getMethod(var2, a);
      } catch (Exception var4) {
         InflateException var5 = new InflateException("Couldn't resolve menu item onClick handler " + var2 + " in class " + var3.getName());
         var5.initCause(var4);
         throw var5;
      }
   }

   public boolean onMenuItemClick(MenuItem var1) {
      boolean var2 = true;

      try {
         if (this.c.getReturnType() == Boolean.TYPE) {
            var2 = (Boolean)this.c.invoke(this.b, var1);
         } else {
            this.c.invoke(this.b, var1);
         }

         return var2;
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }
}
