package android.support.v4.view;

import android.os.Build.VERSION;

public class eo {
   private static final es a;
   private final Object b;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 >= 21) {
         a = new eq();
      } else if (var0 >= 20) {
         a = new ep();
      } else {
         a = new er();
      }

   }

   eo(Object var1) {
      this.b = var1;
   }

   static eo a(Object var0) {
      eo var1;
      if (var0 == null) {
         var1 = null;
      } else {
         var1 = new eo(var0);
      }

      return var1;
   }

   static Object a(eo var0) {
      Object var1;
      if (var0 == null) {
         var1 = null;
      } else {
         var1 = var0.b;
      }

      return var1;
   }

   public int a() {
      return a.b(this.b);
   }

   public eo a(int var1, int var2, int var3, int var4) {
      return a.a(this.b, var1, var2, var3, var4);
   }

   public int b() {
      return a.d(this.b);
   }

   public int c() {
      return a.c(this.b);
   }

   public int d() {
      return a.a(this.b);
   }

   public boolean e() {
      return a.e(this.b);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            eo var3 = (eo)var1;
            if (this.b == null) {
               if (var3.b != null) {
                  var2 = false;
               }
            } else {
               var2 = this.b.equals(var3.b);
            }
         } else {
            var2 = false;
         }
      }

      return var2;
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
