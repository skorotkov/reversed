package fi.polar.a;

public class m {
   private final int a;
   private final byte[] b;

   public m(int var1, byte[] var2) {
      this.a = var1;
      if (var2 != null) {
         var2 = (byte[])var2.clone();
      } else {
         var2 = null;
      }

      this.b = var2;
   }

   public int a() {
      return this.a;
   }

   public byte[] b() {
      byte[] var1;
      if (this.b != null) {
         var1 = (byte[])this.b.clone();
      } else {
         var1 = null;
      }

      return var1;
   }
}
