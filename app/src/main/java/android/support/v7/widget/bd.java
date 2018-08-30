package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

class bd {
   final bf a;
   final be b;
   final List c;

   bd(bf var1) {
      this.a = var1;
      this.b = new be();
      this.c = new ArrayList();
   }

   private int f(int var1) {
      if (var1 < 0) {
         var1 = -1;
      } else {
         int var2 = this.a.a();
         int var3 = var1;

         while(true) {
            if (var3 >= var2) {
               var1 = -1;
               break;
            }

            int var4 = var1 - (var3 - this.b.e(var3));
            if (var4 == 0) {
               while(true) {
                  var1 = var3;
                  if (!this.b.c(var3)) {
                     return var1;
                  }

                  ++var3;
               }
            }

            var3 += var4;
         }
      }

      return var1;
   }

   private void g(View var1) {
      this.c.add(var1);
      this.a.c(var1);
   }

   private boolean h(View var1) {
      boolean var2;
      if (this.c.remove(var1)) {
         this.a.d(var1);
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   void a() {
      this.b.a();

      for(int var1 = this.c.size() - 1; var1 >= 0; --var1) {
         this.a.d((View)this.c.get(var1));
         this.c.remove(var1);
      }

      this.a.b();
   }

   void a(int var1) {
      var1 = this.f(var1);
      View var2 = this.a.b(var1);
      if (var2 != null) {
         if (this.b.d(var1)) {
            this.h(var2);
         }

         this.a.a(var1);
      }

   }

   void a(View var1) {
      int var2 = this.a.a(var1);
      if (var2 >= 0) {
         if (this.b.d(var2)) {
            this.h(var1);
         }

         this.a.a(var2);
      }

   }

   void a(View var1, int var2, LayoutParams var3, boolean var4) {
      if (var2 < 0) {
         var2 = this.a.a();
      } else {
         var2 = this.f(var2);
      }

      this.b.a(var2, var4);
      if (var4) {
         this.g(var1);
      }

      this.a.a(var1, var2, var3);
   }

   void a(View var1, int var2, boolean var3) {
      if (var2 < 0) {
         var2 = this.a.a();
      } else {
         var2 = this.f(var2);
      }

      this.b.a(var2, var3);
      if (var3) {
         this.g(var1);
      }

      this.a.a(var1, var2);
   }

   void a(View var1, boolean var2) {
      this.a(var1, -1, var2);
   }

   int b() {
      return this.a.a() - this.c.size();
   }

   int b(View var1) {
      int var2 = -1;
      int var3 = this.a.a(var1);
      if (var3 != -1 && !this.b.c(var3)) {
         var2 = var3 - this.b.e(var3);
      }

      return var2;
   }

   View b(int var1) {
      var1 = this.f(var1);
      return this.a.b(var1);
   }

   int c() {
      return this.a.a();
   }

   View c(int var1) {
      int var2 = this.c.size();
      int var3 = 0;

      View var4;
      while(true) {
         if (var3 >= var2) {
            var4 = null;
            break;
         }

         var4 = (View)this.c.get(var3);
         ey var5 = this.a.b(var4);
         if (var5.e() == var1 && !var5.o() && !var5.r()) {
            break;
         }

         ++var3;
      }

      return var4;
   }

   boolean c(View var1) {
      return this.c.contains(var1);
   }

   View d(int var1) {
      return this.a.b(var1);
   }

   void d(View var1) {
      int var2 = this.a.a(var1);
      if (var2 < 0) {
         throw new IllegalArgumentException("view is not a child, cannot hide " + var1);
      } else {
         this.b.a(var2);
         this.g(var1);
      }
   }

   void e(int var1) {
      var1 = this.f(var1);
      this.b.d(var1);
      this.a.c(var1);
   }

   void e(View var1) {
      int var2 = this.a.a(var1);
      if (var2 < 0) {
         throw new IllegalArgumentException("view is not a child, cannot hide " + var1);
      } else if (!this.b.c(var2)) {
         throw new RuntimeException("trying to unhide a view that was not hidden" + var1);
      } else {
         this.b.b(var2);
         this.h(var1);
      }
   }

   boolean f(View var1) {
      boolean var2 = true;
      int var3 = this.a.a(var1);
      if (var3 == -1) {
         if (this.h(var1)) {
         }
      } else if (this.b.c(var3)) {
         this.b.d(var3);
         if (!this.h(var1)) {
         }

         this.a.a(var3);
      } else {
         var2 = false;
      }

      return var2;
   }

   public String toString() {
      return this.b.toString() + ", hidden list:" + this.c.size();
   }
}
