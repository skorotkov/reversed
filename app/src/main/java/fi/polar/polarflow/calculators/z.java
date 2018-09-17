package fi.polar.polarflow.calculators;

class z extends ai_Event {
   private final int a;

   z() {
      super(0, 0L);
      this.a = -1;
   }

   z(int var1, long var2, boolean var4, int var5) {
      super(var1, var2, var4);
      if (var5 < 0) {
         var1 = 0;
      } else {
         var1 = var5;
         if (var5 > 250) {
            var1 = 250;
         }
      }

      this.a = var1;
   }

   int a() {
      return this.a;
   }
}
