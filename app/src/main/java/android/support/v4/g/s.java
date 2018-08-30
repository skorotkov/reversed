package android.support.v4.g;

public class s implements r {
   private final Object[] a;
   private int b;

   public s(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("The max pool size must be > 0");
      } else {
         this.a = new Object[var1];
      }
   }

   private boolean b(Object var1) {
      boolean var2 = false;
      int var3 = 0;

      boolean var4;
      while(true) {
         var4 = var2;
         if (var3 >= this.b) {
            break;
         }

         if (this.a[var3] == var1) {
            var4 = true;
            break;
         }

         ++var3;
      }

      return var4;
   }

   public Object a() {
      Object var2;
      if (this.b > 0) {
         int var1 = this.b - 1;
         var2 = this.a[var1];
         this.a[var1] = null;
         --this.b;
      } else {
         var2 = null;
      }

      return var2;
   }

   public boolean a(Object var1) {
      if (this.b(var1)) {
         throw new IllegalStateException("Already in the pool!");
      } else {
         boolean var2;
         if (this.b < this.a.length) {
            this.a[this.b] = var1;
            ++this.b;
            var2 = true;
         } else {
            var2 = false;
         }

         return var2;
      }
   }
}
