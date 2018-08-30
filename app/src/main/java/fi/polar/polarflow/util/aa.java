package fi.polar.polarflow.util;

import android.os.SystemClock;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class aa {
   public long a() {
      return System.currentTimeMillis();
   }

   public long b() {
      return SystemClock.elapsedRealtime();
   }

   public long c() {
      return SystemClock.elapsedRealtimeNanos();
   }

   public TimeZone d() {
      return TimeZone.getDefault();
   }

   public DateTime e() {
      return new DateTime();
   }

   public LocalDate f() {
      return new LocalDate();
   }
}
