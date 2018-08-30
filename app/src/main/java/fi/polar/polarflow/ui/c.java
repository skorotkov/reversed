package fi.polar.polarflow.ui;

import java.util.concurrent.TimeUnit;

public final class c {
   public static final long a;
   public static final long b;

   static {
      a = TimeUnit.HOURS.toMillis(99L) + TimeUnit.MINUTES.toMillis(59L) + TimeUnit.SECONDS.toMillis(59L);
      b = TimeUnit.HOURS.toMillis(10L);
   }

   public static long a(long var0) {
      long var2;
      if (var0 > a) {
         var2 = a;
      } else {
         var2 = var0;
         if (var0 < 0L) {
            var2 = 0L;
         }
      }

      return var2;
   }
}
