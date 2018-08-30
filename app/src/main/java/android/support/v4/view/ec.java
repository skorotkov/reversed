package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;

class ec implements em {
   dy a;
   boolean b;

   ec(dy var1) {
      this.a = var1;
   }

   public void a(View var1) {
      this.b = false;
      if (this.a.c >= 0) {
         bz.a(var1, 2, (Paint)null);
      }

      if (this.a.a != null) {
         Runnable var2 = this.a.a;
         this.a.a = null;
         var2.run();
      }

      Object var3 = var1.getTag(2113929216);
      em var4;
      if (var3 instanceof em) {
         var4 = (em)var3;
      } else {
         var4 = null;
      }

      if (var4 != null) {
         var4.a(var1);
      }

   }

   public void b(View var1) {
      if (this.a.c >= 0) {
         bz.a(var1, this.a.c, (Paint)null);
         this.a.c = -1;
      }

      if (VERSION.SDK_INT >= 16 || !this.b) {
         if (this.a.b != null) {
            Runnable var2 = this.a.b;
            this.a.b = null;
            var2.run();
         }

         Object var3 = var1.getTag(2113929216);
         em var4;
         if (var3 instanceof em) {
            var4 = (em)var3;
         } else {
            var4 = null;
         }

         if (var4 != null) {
            var4.b(var1);
         }

         this.b = true;
      }

   }

   public void c(View var1) {
      Object var2 = var1.getTag(2113929216);
      em var3;
      if (var2 instanceof em) {
         var3 = (em)var2;
      } else {
         var3 = null;
      }

      if (var3 != null) {
         var3.c(var1);
      }

   }
}
