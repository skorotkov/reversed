package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

public abstract class dw {
   private dy a = null;
   private ArrayList b = new ArrayList();
   private long c = 120L;
   private long d = 120L;
   private long e = 250L;
   private long f = 250L;

   static int e(ey var0) {
      int var1 = ey.d(var0) & 14;
      int var2;
      if (var0.o()) {
         var2 = 4;
      } else {
         var2 = var1;
         if ((var1 & 4) == 0) {
            int var3 = var0.g();
            int var4 = var0.f();
            var2 = var1;
            if (var3 != -1) {
               var2 = var1;
               if (var4 != -1) {
                  var2 = var1;
                  if (var3 != var4) {
                     var2 = var1 | 2048;
                  }
               }
            }
         }
      }

      return var2;
   }

   public dz a(ev var1, ey var2) {
      return this.j().a(var2);
   }

   public dz a(ev var1, ey var2, int var3, List var4) {
      return this.j().a(var2);
   }

   public abstract void a();

   public void a(long var1) {
      this.e = var1;
   }

   void a(dy var1) {
      this.a = var1;
   }

   public abstract boolean a(ey var1, dz var2, dz var3);

   public abstract boolean a(ey var1, ey var2, dz var3, dz var4);

   public boolean a(ey var1, List var2) {
      return this.h(var1);
   }

   public void b(long var1) {
      this.c = var1;
   }

   public abstract boolean b();

   public abstract boolean b(ey var1, dz var2, dz var3);

   public void c(long var1) {
      this.f = var1;
   }

   public abstract boolean c(ey var1, dz var2, dz var3);

   public abstract void d();

   public abstract void d(ey var1);

   public long e() {
      return this.e;
   }

   public long f() {
      return this.c;
   }

   public final void f(ey var1) {
      this.g(var1);
      if (this.a != null) {
         this.a.a(var1);
      }

   }

   public long g() {
      return this.d;
   }

   public void g(ey var1) {
   }

   public long h() {
      return this.f;
   }

   public boolean h(ey var1) {
      return true;
   }

   public final void i() {
      int var1 = this.b.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         ((dx)this.b.get(var2)).a();
      }

      this.b.clear();
   }

   public dz j() {
      return new dz();
   }
}
