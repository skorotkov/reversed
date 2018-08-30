package android.support.v4.view;

import android.view.View;
import java.util.WeakHashMap;

class dz implements eh {
   WeakHashMap a = null;

   private void a(View var1) {
      if (this.a != null) {
         Runnable var2 = (Runnable)this.a.get(var1);
         if (var2 != null) {
            var1.removeCallbacks(var2);
         }
      }

   }

   private void d(dy var1, View var2) {
      Runnable var3 = null;
      if (this.a != null) {
         var3 = (Runnable)this.a.get(var2);
      }

      Object var4 = var3;
      if (var3 == null) {
         var4 = new ea(this, var1, var2);
         if (this.a == null) {
            this.a = new WeakHashMap();
         }

         this.a.put(var2, var4);
      }

      var2.removeCallbacks((Runnable)var4);
      var2.post((Runnable)var4);
   }

   public void a(dy var1, View var2) {
      this.d(var1, var2);
   }

   public void a(dy var1, View var2, float var3) {
      this.d(var1, var2);
   }

   public void a(dy var1, View var2, long var3) {
   }

   public void a(dy var1, View var2, em var3) {
      var2.setTag(2113929216, var3);
   }

   public void b(dy var1, View var2) {
      this.a(var2);
      this.c(var1, var2);
   }

   public void b(dy var1, View var2, float var3) {
      this.d(var1, var2);
   }

   void c(dy var1, View var2) {
      Object var3 = var2.getTag(2113929216);
      em var6;
      if (var3 instanceof em) {
         var6 = (em)var3;
      } else {
         var6 = null;
      }

      Runnable var4 = var1.a;
      Runnable var5 = var1.b;
      var1.a = null;
      var1.b = null;
      if (var4 != null) {
         var4.run();
      }

      if (var6 != null) {
         var6.a(var2);
         var6.b(var2);
      }

      if (var5 != null) {
         var5.run();
      }

      if (this.a != null) {
         this.a.remove(var2);
      }

   }

   public void c(dy var1, View var2, float var3) {
      this.d(var1, var2);
   }
}
