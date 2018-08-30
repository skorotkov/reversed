package fi.polar.polarflow.util;

import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.Duration;

public class ab {
   private static final int a;
   private static final int b;

   static {
      a = (int)TimeUnit.MINUTES.toMillis(1L);
      b = (int)TimeUnit.SECONDS.toMillis(30L);
   }

   public static long a(long var0) {
      return (long)a * (((long)b + var0) / (long)a);
   }

   public static DateTime a(DateTime var0) {
      DateTime var1 = var0.minuteOfDay().roundFloorCopy();
      return var1.plusMillis(Math.round((float)((int)(new Duration(var1, var0)).getMillis()) / (float)b) * b);
   }

   public static boolean a(DateTime var0, DateTime var1) {
      boolean var2;
      if (var0.getYear() == var1.getYear() && var0.getDayOfYear() == var1.getDayOfYear()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public static DateTime b(DateTime var0) {
      DateTime var1 = var0.minuteOfDay().roundFloorCopy();
      return var1.plusMillis(Math.round((float)((int)(new Duration(var1, var0)).getMillis()) / (float)a) * a);
   }

   public static boolean b(DateTime var0, DateTime var1) {
      boolean var2;
      if (d(var0) == d(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public static DateTime c(DateTime var0) {
      int var1 = (int)Math.floor((double)var0.getMinuteOfHour() / 30.0D);
      return var0.withTime(var0.getHourOfDay(), var1 * 30, 0, 0);
   }

   public static int d(DateTime var0) {
      int var1 = var0.getZone().getOffset(var0.getMillis());
      return (int)TimeUnit.MILLISECONDS.toMinutes((long)var1);
   }
}
