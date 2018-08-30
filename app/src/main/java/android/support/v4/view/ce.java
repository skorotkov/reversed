package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class ce extends cc {
   static Field b;
   static boolean c = false;

   public void a(View var1, d var2) {
      Object var3;
      if (var2 == null) {
         var3 = null;
      } else {
         var3 = var2.a();
      }

      cp.a(var1, var3);
   }

   public boolean a(View var1) {
      boolean var2 = true;
      boolean var3 = false;
      if (c) {
         var2 = var3;
      } else {
         if (b == null) {
            try {
               b = View.class.getDeclaredField("mAccessibilityDelegate");
               b.setAccessible(true);
            } catch (Throwable var5) {
               c = true;
               var2 = var3;
               return var2;
            }
         }

         Object var6;
         try {
            var6 = b.get(var1);
         } catch (Throwable var4) {
            c = true;
            var2 = var3;
            return var2;
         }

         if (var6 == null) {
            var2 = false;
         }
      }

      return var2;
   }

   public boolean a(View var1, int var2) {
      return cp.a(var1, var2);
   }

   public boolean b(View var1, int var2) {
      return cp.b(var1, var2);
   }

   public dy q(View var1) {
      if (this.a == null) {
         this.a = new WeakHashMap();
      }

      dy var2 = (dy)this.a.get(var1);
      dy var3 = var2;
      if (var2 == null) {
         var3 = new dy(var1);
         this.a.put(var1, var3);
      }

      return var3;
   }
}
