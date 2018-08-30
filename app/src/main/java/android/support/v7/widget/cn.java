package android.support.v7.widget;

import android.view.View;

class cn {
   int a;
   int b;
   boolean c;
   boolean d;
   // $FF: synthetic field
   final LinearLayoutManager e;

   cn(LinearLayoutManager var1) {
      this.e = var1;
      this.a();
   }

   void a() {
      this.a = -1;
      this.b = Integer.MIN_VALUE;
      this.c = false;
      this.d = false;
   }

   public void a(View var1) {
      int var2 = this.e.j.b();
      if (var2 >= 0) {
         this.b(var1);
      } else {
         this.a = this.e.d(var1);
         int var3;
         int var4;
         int var5;
         int var6;
         if (this.c) {
            var3 = this.e.j.d() - var2 - this.e.j.b(var1);
            this.b = this.e.j.d() - var3;
            if (var3 > 0) {
               var4 = this.e.j.e(var1);
               var5 = this.b;
               var6 = this.e.j.c();
               var6 = var5 - var4 - (var6 + Math.min(this.e.j.a(var1) - var6, 0));
               if (var6 < 0) {
                  var4 = this.b;
                  this.b = Math.min(var3, -var6) + var4;
               }
            }
         } else {
            int var7 = this.e.j.a(var1);
            var3 = var7 - this.e.j.c();
            this.b = var7;
            if (var3 > 0) {
               var6 = this.e.j.e(var1);
               var5 = this.e.j.d();
               var4 = this.e.j.b(var1);
               var6 = this.e.j.d() - Math.min(0, var5 - var2 - var4) - (var7 + var6);
               if (var6 < 0) {
                  this.b -= Math.min(var3, -var6);
               }
            }
         }
      }

   }

   boolean a(View var1, ev var2) {
      ef var4 = (ef)var1.getLayoutParams();
      boolean var3;
      if (!var4.d() && var4.f() >= 0 && var4.f() < var2.e()) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   void b() {
      int var1;
      if (this.c) {
         var1 = this.e.j.d();
      } else {
         var1 = this.e.j.c();
      }

      this.b = var1;
   }

   public void b(View var1) {
      if (this.c) {
         this.b = this.e.j.b(var1) + this.e.j.b();
      } else {
         this.b = this.e.j.a(var1);
      }

      this.a = this.e.d(var1);
   }

   public String toString() {
      return "AnchorInfo{mPosition=" + this.a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
   }
}
