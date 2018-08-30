package fi.polar.polarflow.service.activity.a;

import fi.polar.polarflow.data.orm.ActivitySamples;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.Seconds;

class c {
   private static final int a;

   static {
      a = (int)TimeUnit.MICROSECONDS.toSeconds(30000000L);
   }

   public static int a(DateTime var0, DateTime var1, int var2) {
      if (var0 == null) {
         var0 = var1.withTimeAtStartOfDay();
      }

      int var3 = Seconds.secondsBetween((ReadableInstant)var0, (ReadableInstant)var1).getSeconds();
      if (var3 > var2) {
         var2 = var3 / var2 - 1;
      } else {
         var2 = 0;
      }

      return var2;
   }

   public static p a(DateTime var0) {
      return new p(var0, 0.875F, -1L, 1, true);
   }

   public static List a(ActivitySamples var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = (new t(var0)).iterator();

      while(var2.hasNext()) {
         var1.add((s)var2.next());
      }

      return var1;
   }

   public static List a(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         var1.addAll(a((ActivitySamples)var2.next()));
      }

      return var1;
   }

   public static List a(List var0, DateTime var1) {
      ArrayList var2 = new ArrayList();
      DateTime var3 = var1.withTimeAtStartOfDay().minusSeconds(a);
      Iterator var4 = var0.iterator();
      DateTime var7 = var3;

      int var6;
      while(var4.hasNext()) {
         ActivitySamples var5 = (ActivitySamples)var4.next();
         if (a(var5, var7, var1)) {
            var6 = a(var7, var5.getStartTime(), a);
            var3 = var7;
            if (var6 > 0) {
               var2.addAll(a(var7.plusSeconds(a), var6));
               var3 = b(var2, var7);
            }

            var2.addAll(b(var5, var3, var1));
            var7 = b(var2, var3);
         }

         if (a(var7, var1, a) == 0) {
            break;
         }
      }

      var6 = a(var7, var1, a);
      if (var6 > 0) {
         var2.addAll(a(var7.plusSeconds(a), var6));
      }

      return var2;
   }

   public static List a(DateTime var0, int var1) {
      ArrayList var2;
      for(var2 = new ArrayList(); var1 > 0; --var1) {
         var2.add(a(var0));
         var0 = var0.plusSeconds(a);
      }

      return var2;
   }

   public static boolean a(ActivitySamples var0, DateTime var1, DateTime var2) {
      boolean var3;
      if (var1 != null && !var0.getEndTime().isAfter(var1) || var2 != null && var0.getStartTime().isAfter(var2)) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   public static boolean a(o var0, DateTime var1, DateTime var2) {
      boolean var3;
      if (var1 != null && !var0.b.isAfter(var1) || var2 != null && var0.b.isAfter(var2)) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   public static List b(ActivitySamples var0, DateTime var1, DateTime var2) {
      ArrayList var3 = new ArrayList();
      Iterator var5 = (new q(var0)).iterator();

      while(var5.hasNext()) {
         p var4 = (p)var5.next();
         if (a((o)var4, var1, var2)) {
            var3.add(var4);
         }
      }

      return var3;
   }

   public static DateTime b(List var0, DateTime var1) {
      if (!var0.isEmpty()) {
         var1 = ((o)var0.get(var0.size() - 1)).b;
      }

      return var1;
   }
}
