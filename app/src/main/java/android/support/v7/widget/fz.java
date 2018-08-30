package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

class fz {
   ArrayList a;
   int b;
   int c;
   int d;
   final int e;
   // $FF: synthetic field
   final StaggeredGridLayoutManager f;

   fz(StaggeredGridLayoutManager var1, int var2) {
      this.f = var1;
      this.a = new ArrayList();
      this.b = Integer.MIN_VALUE;
      this.c = Integer.MIN_VALUE;
      this.d = 0;
      this.e = var2;
   }

   int a(int var1) {
      if (this.b != Integer.MIN_VALUE) {
         var1 = this.b;
      } else if (this.a.size() != 0) {
         this.a();
         var1 = this.b;
      }

      return var1;
   }

   public View a(int var1, int var2) {
      View var3 = null;
      View var4 = null;
      if (var2 == -1) {
         int var5 = this.a.size();

         for(var2 = 0; var2 < var5; var4 = var3) {
            var3 = (View)this.a.get(var2);
            if (!var3.isFocusable()) {
               break;
            }

            boolean var6;
            if (this.f.d(var3) > var1) {
               var6 = true;
            } else {
               var6 = false;
            }

            if (var6 != this.f.d) {
               break;
            }

            ++var2;
         }
      } else {
         var2 = this.a.size() - 1;

         for(var4 = var3; var2 >= 0; var4 = var3) {
            var3 = (View)this.a.get(var2);
            if (!var3.isFocusable()) {
               break;
            }

            boolean var8;
            if (this.f.d(var3) > var1) {
               var8 = true;
            } else {
               var8 = false;
            }

            boolean var7;
            if (!this.f.d) {
               var7 = true;
            } else {
               var7 = false;
            }

            if (var8 != var7) {
               break;
            }

            --var2;
         }
      }

      return var4;
   }

   void a() {
      View var1 = (View)this.a.get(0);
      ft var2 = this.c(var1);
      this.b = this.f.b.a(var1);
      if (var2.b) {
         fv var3 = this.f.h.f(var2.f());
         if (var3 != null && var3.b == -1) {
            this.b -= var3.a(this.e);
         }
      }

   }

   void a(View var1) {
      ft var2 = this.c(var1);
      var2.a = this;
      this.a.add(0, var1);
      this.b = Integer.MIN_VALUE;
      if (this.a.size() == 1) {
         this.c = Integer.MIN_VALUE;
      }

      if (var2.d() || var2.e()) {
         this.d += this.f.b.e(var1);
      }

   }

   void a(boolean var1, int var2) {
      int var3;
      if (var1) {
         var3 = this.b(Integer.MIN_VALUE);
      } else {
         var3 = this.a(Integer.MIN_VALUE);
      }

      this.e();
      if (var3 != Integer.MIN_VALUE && (!var1 || var3 >= this.f.b.d()) && (var1 || var3 <= this.f.b.c())) {
         int var4 = var3;
         if (var2 != Integer.MIN_VALUE) {
            var4 = var3 + var2;
         }

         this.c = var4;
         this.b = var4;
      }

   }

   int b() {
      int var1;
      if (this.b != Integer.MIN_VALUE) {
         var1 = this.b;
      } else {
         this.a();
         var1 = this.b;
      }

      return var1;
   }

   int b(int var1) {
      if (this.c != Integer.MIN_VALUE) {
         var1 = this.c;
      } else if (this.a.size() != 0) {
         this.c();
         var1 = this.c;
      }

      return var1;
   }

   void b(View var1) {
      ft var2 = this.c(var1);
      var2.a = this;
      this.a.add(var1);
      this.c = Integer.MIN_VALUE;
      if (this.a.size() == 1) {
         this.b = Integer.MIN_VALUE;
      }

      if (var2.d() || var2.e()) {
         this.d += this.f.b.e(var1);
      }

   }

   ft c(View var1) {
      return (ft)var1.getLayoutParams();
   }

   void c() {
      View var1 = (View)this.a.get(this.a.size() - 1);
      ft var2 = this.c(var1);
      this.c = this.f.b.b(var1);
      if (var2.b) {
         fv var4 = this.f.h.f(var2.f());
         if (var4 != null && var4.b == 1) {
            int var3 = this.c;
            this.c = var4.a(this.e) + var3;
         }
      }

   }

   void c(int var1) {
      this.b = var1;
      this.c = var1;
   }

   int d() {
      int var1;
      if (this.c != Integer.MIN_VALUE) {
         var1 = this.c;
      } else {
         this.c();
         var1 = this.c;
      }

      return var1;
   }

   void d(int var1) {
      if (this.b != Integer.MIN_VALUE) {
         this.b += var1;
      }

      if (this.c != Integer.MIN_VALUE) {
         this.c += var1;
      }

   }

   void e() {
      this.a.clear();
      this.f();
      this.d = 0;
   }

   void f() {
      this.b = Integer.MIN_VALUE;
      this.c = Integer.MIN_VALUE;
   }

   void g() {
      int var1 = this.a.size();
      View var2 = (View)this.a.remove(var1 - 1);
      ft var3 = this.c(var2);
      var3.a = null;
      if (var3.d() || var3.e()) {
         this.d -= this.f.b.e(var2);
      }

      if (var1 == 1) {
         this.b = Integer.MIN_VALUE;
      }

      this.c = Integer.MIN_VALUE;
   }

   void h() {
      View var1 = (View)this.a.remove(0);
      ft var2 = this.c(var1);
      var2.a = null;
      if (this.a.size() == 0) {
         this.c = Integer.MIN_VALUE;
      }

      if (var2.d() || var2.e()) {
         this.d -= this.f.b.e(var1);
      }

      this.b = Integer.MIN_VALUE;
   }

   public int i() {
      return this.d;
   }
}
