package android.support.v7.widget;

import android.view.View;
import java.util.List;

class cp {
   boolean a = true;
   int b;
   int c;
   int d;
   int e;
   int f;
   int g;
   int h = 0;
   boolean i = false;
   int j;
   List k = null;
   boolean l;

   private View b() {
      int var1 = this.k.size();
      int var2 = 0;

      View var3;
      while(true) {
         if (var2 >= var1) {
            var3 = null;
            break;
         }

         var3 = ((ey)this.k.get(var2)).a;
         ef var4 = (ef)var3.getLayoutParams();
         if (!var4.d() && this.d == var4.f()) {
            this.a(var3);
            break;
         }

         ++var2;
      }

      return var3;
   }

   View a(em var1) {
      View var2;
      if (this.k != null) {
         var2 = this.b();
      } else {
         var2 = var1.c(this.d);
         this.d += this.e;
      }

      return var2;
   }

   public void a() {
      this.a((View)null);
   }

   public void a(View var1) {
      var1 = this.b(var1);
      if (var1 == null) {
         this.d = -1;
      } else {
         this.d = ((ef)var1.getLayoutParams()).f();
      }

   }

   boolean a(ev var1) {
      boolean var2;
      if (this.d >= 0 && this.d < var1.e()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public View b(View var1) {
      int var2 = this.k.size();
      View var3 = null;
      int var4 = Integer.MAX_VALUE;

      for(int var5 = 0; var5 < var2; ++var5) {
         View var6 = ((ey)this.k.get(var5)).a;
         ef var7 = (ef)var6.getLayoutParams();
         if (var6 != var1 && !var7.d()) {
            int var8 = (var7.f() - this.d) * this.e;
            if (var8 >= 0 && var8 < var4) {
               if (var8 == 0) {
                  var3 = var6;
                  break;
               }

               var3 = var6;
               var4 = var8;
            }
         }
      }

      return var3;
   }
}
