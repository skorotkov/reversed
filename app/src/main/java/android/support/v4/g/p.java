package android.support.v4.g;

public class p {
   public final Object a;
   public final Object b;

   private static boolean a(Object var0, Object var1) {
      boolean var2;
      if (var0 != var1 && (var0 == null || !var0.equals(var1))) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public boolean equals(Object var1) {
      boolean var2 = false;
      boolean var3;
      if (!(var1 instanceof p)) {
         var3 = var2;
      } else {
         p var4 = (p)var1;
         var3 = var2;
         if (a(var4.a, this.a)) {
            var3 = var2;
            if (a(var4.b, this.b)) {
               var3 = true;
            }
         }
      }

      return var3;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.a == null) {
         var2 = 0;
      } else {
         var2 = this.a.hashCode();
      }

      if (this.b != null) {
         var1 = this.b.hashCode();
      }

      return var2 ^ var1;
   }

   public String toString() {
      return "Pair{" + String.valueOf(this.a) + " " + this.b + "}";
   }
}
