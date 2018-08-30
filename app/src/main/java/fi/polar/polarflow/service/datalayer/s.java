package fi.polar.polarflow.service.datalayer;

public class s {
   private int a;
   private String b;
   private byte[] c;
   private int d;

   public s(int var1, String var2) {
      this(var1, var2, (byte[])null);
   }

   public s(int var1, String var2, byte[] var3) {
      this.a = var1;
      this.b = var2;
      byte[] var4;
      if (var3 != null) {
         var4 = (byte[])var3.clone();
      } else {
         var4 = null;
      }

      this.c = var4;
      this.d = 0;
   }

   public int a() {
      return this.a;
   }

   public void a(int var1) {
      this.d = var1;
   }

   public String b() {
      return this.b;
   }

   public byte[] c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public String toString() {
      StringBuilder var1 = (new StringBuilder()).append(this.getClass().getSimpleName()).append("@").append(Integer.toHexString(this.hashCode())).append("[path=").append(this.b).append(",type=");
      int var2 = this.a;
      return var1.append((new String[]{"TYPE_PUT", "TYPE_GET", "TYPE_DELETED", "TYPE_MESSAGE", "TYPE_ADD_CAPABILITY", "TYPE_REMOVE_CAPABILITY"})[var2]).append(",filterType=").append(this.d).append("]").toString();
   }
}
