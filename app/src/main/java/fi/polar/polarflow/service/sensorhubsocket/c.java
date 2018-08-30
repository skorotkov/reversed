package fi.polar.polarflow.service.sensorhubsocket;

enum c {
   a(1),
   b(2);

   private final int c;

   private c(int var3) {
      this.c = var3;
   }

   public static c a(int var0) {
      c var1;
      switch(var0) {
      case 1:
         var1 = a;
         break;
      case 2:
         var1 = b;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public int a() {
      return this.c;
   }
}
