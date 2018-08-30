package fi.polar.polarflow.service.datalayer;

public class ar {
   private String a;
   private byte[] b;
   private String c;

   public ar(String var1, byte[] var2) {
      this(var1, var2, (String)null);
   }

   public ar(String var1, byte[] var2, String var3) {
      this.a = var1;
      byte[] var4;
      if (var2 != null) {
         var4 = (byte[])var2.clone();
      } else {
         var4 = null;
      }

      this.b = var4;
      this.c = var3;
   }

   public String a() {
      return this.a;
   }

   public void a(String var1) {
      this.c = var1;
   }

   public byte[] b() {
      return this.b;
   }

   public String c() {
      return this.c;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.getClass().getSimpleName()).append("@").append(Integer.toHexString(this.hashCode())).append(this.a);
      if (this.c != null) {
         var1.append(",target=").append(this.c);
      }

      var1.append("]");
      return var1.toString();
   }
}
