package android.support.wearable.complications;

import android.annotation.TargetApi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

@TargetApi(24)
public class t implements k {
   private static final String[][] a = new String[][]{{"S", "s"}, {"m"}, {"H", "K", "h", "k"}, {"D", "E", "F", "c", "d", "W", "w", "M", "y"}};
   private static final long[] b;
   private final SimpleDateFormat c;
   private final int d;
   private final TimeZone e;
   private final Date f;
   private long g;

   static {
      b = new long[]{TimeUnit.SECONDS.toMillis(1L), TimeUnit.MINUTES.toMillis(1L), TimeUnit.HOURS.toMillis(1L), TimeUnit.DAYS.toMillis(1L)};
   }

   public t(String var1, int var2, TimeZone var3) {
      this.c = new SimpleDateFormat(var1);
      this.d = var2;
      this.g = -1L;
      if (var3 != null) {
         this.c.setTimeZone(var3);
         this.e = var3;
      } else {
         this.e = this.c.getTimeZone();
      }

      this.f = new Date();
   }

   public String a() {
      return this.c.toPattern();
   }

   public int b() {
      return this.d;
   }

   public TimeZone c() {
      return this.e;
   }
}
