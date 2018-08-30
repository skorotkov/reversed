package fi.polar.polarflow.service.datalayer;

public class y implements Comparable {
   private static final String a = y.class.getSimpleName();
   private String b;
   private long c;

   public y(String var1, long var2) {
      this.b = var1;
      this.c = var2;
   }

   public int a(y var1) {
      byte var2 = 0;
      byte var3;
      if (this.b.endsWith("/") && !var1.a().endsWith("/")) {
         var3 = -1;
      } else {
         var3 = 0;
      }

      byte var4 = var3;
      if (var1.a().endsWith("/")) {
         var4 = var3;
         if (!this.b.endsWith("/")) {
            var4 = 1;
         }
      }

      int var7 = var4;
      int var8;
      if (var4 == 0) {
         var7 = var4;
         if (this.b.matches("[0-9]+/")) {
            var7 = var4;
            if (var1.a().matches("[0-9]+/")) {
               label32: {
                  try {
                     var7 = Integer.parseInt(this.b.substring(0, this.b.length() - 1));
                     var8 = Integer.parseInt(var1.a().substring(0, var1.a().length() - 1));
                  } catch (NumberFormatException var6) {
                     fi.polar.polarflow.util.d.b(a, "Cannot compare numerical entries ", var6);
                     var7 = var2;
                     break label32;
                  }

                  var7 -= var8;
               }
            }
         }
      }

      var8 = var7;
      if (var7 == 0) {
         var8 = String.CASE_INSENSITIVE_ORDER.compare(this.b, var1.a());
      }

      var7 = var8;
      if (var8 == 0) {
         var7 = this.b.compareTo(var1.a());
      }

      return var7;
   }

   public String a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((y)var1);
   }
}
