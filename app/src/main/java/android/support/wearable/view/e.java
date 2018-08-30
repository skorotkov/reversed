package android.support.wearable.view;

enum e {
   a(-1, 0),
   b(0, -1),
   c(1, 0),
   d(0, 1),
   e(0, 0);

   private final int f;
   private final int g;

   private e(int var3, int var4) {
      this.f = var3;
      this.g = var4;
   }

   // $FF: synthetic method
   static int a(e var0) {
      return var0.f;
   }

   static e a(float var0, float var1) {
      e var2;
      if (var1 != 0.0F) {
         if (var1 > 0.0F) {
            var2 = d;
         } else {
            var2 = b;
         }
      } else if (var0 != 0.0F) {
         if (var0 > 0.0F) {
            var2 = c;
         } else {
            var2 = a;
         }
      } else {
         var2 = e;
      }

      return var2;
   }

   // $FF: synthetic method
   static int b(e var0) {
      return var0.g;
   }

   boolean a() {
      boolean var1;
      if (this.g != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   boolean b() {
      boolean var1;
      if (this.f != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
