package android.support.v4.view.a_package;

import android.os.Build.VERSION;

public class am {
   private static final ap a;
   private final Object b;

   static {
      if (VERSION.SDK_INT >= 16) {
         a = new aq();
      } else if (VERSION.SDK_INT >= 15) {
         a = new ao();
      } else if (VERSION.SDK_INT >= 14) {
         a = new an();
      } else {
         a = new ar();
      }

   }

   @Deprecated
   public am(Object var1) {
      this.b = var1;
   }

   public void a(int var1) {
      a.b(this.b, var1);
   }

   public void a(boolean var1) {
      a.a(this.b, var1);
   }

   public void b(int var1) {
      a.a(this.b, var1);
   }

   public void c(int var1) {
      a.e(this.b, var1);
   }

   public void d(int var1) {
      a.c(this.b, var1);
   }

   public void e(int var1) {
      a.d(this.b, var1);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 == null) {
            var2 = false;
         } else if (this.getClass() != var1.getClass()) {
            var2 = false;
         } else {
            am var3 = (am)var1;
            if (this.b == null) {
               if (var3.b != null) {
                  var2 = false;
               }
            } else if (!this.b.equals(var3.b)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public void f(int var1) {
      a.f(this.b, var1);
   }

   public void g(int var1) {
      a.g(this.b, var1);
   }

   public int hashCode() {
      int var1;
      if (this.b == null) {
         var1 = 0;
      } else {
         var1 = this.b.hashCode();
      }

      return var1;
   }
}
