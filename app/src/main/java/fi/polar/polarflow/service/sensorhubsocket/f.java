package fi.polar.polarflow.service.sensorhubsocket;

class f {
   private final String a;
   private final StringBuilder b;
   private final StringBuilder c;

   public f(long var1) {
      this.a = "APP_ID" + String.format("=0x%s;", Long.toHexString(var1));
      this.b = new StringBuilder();
      this.c = new StringBuilder();
   }

   private void a(String var1, int var2) {
      if (this.b.length() > 0) {
         this.b.append(",");
      }

      this.b.append(var1);
      this.c.append(var1).append("=0x").append(Integer.toHexString(var2)).append(";");
   }

   public f a(int var1) {
      if (var1 > 0) {
         this.a("2", var1);
      }

      return this;
   }

   public f a(long var1) {
      int var3 = (int)(var1 >>> 32);
      int var4 = (int)(-1L & var1);
      this.a("4", var3);
      this.a("3", var4);
      return this;
   }

   public f a(a var1) {
      if (var1 != null) {
         this.a("7", var1.a());
      }

      return this;
   }

   public f a(c var1) {
      if (var1 != null) {
         this.a("1", var1.a());
      }

      return this;
   }

   public String a() {
      return this.a + "PARAMS_ID" + "=" + this.b + ";" + this.c;
   }

   public f b(int var1) {
      if (var1 > 0) {
         this.a("5", var1);
      }

      return this;
   }

   public f c(int var1) {
      if (var1 > 0) {
         this.a("6", var1);
      }

      return this;
   }
}
