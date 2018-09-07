package fi.polar.polarflow.util;

import android.os.SystemClock;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class aa_TimeUtils {
   public long a_currentTimeMillis() {
      return System.currentTimeMillis();
   }

   public long b_elapsedRealtime() {
      return SystemClock.elapsedRealtime();
   }

   public long c_elapsedRealtimeNanos() {
      return SystemClock.elapsedRealtimeNanos();
   }

   public TimeZone d_getgetDefaultTimeZone() {
      return TimeZone.getDefault();
   }

   public DateTime e_newDateTime() {
      return new DateTime();
   }

   public LocalDate f_newLocalDate() {
      return new LocalDate();
   }
}
