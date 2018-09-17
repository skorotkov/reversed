package fi.polar.polarflow.util;

import java.util.concurrent.TimeUnit;

public class b {
   public static final long[] a = new long[]{0L, 100L, 60L, 100L, 60L, 100L};
   public static final long[] b = new long[]{0L, 500L, 200L, 500L};
   public static final long[] c = new long[]{0L, 280L, 60L, 280L, 60L, 440L};
   public static final long[] d = new long[]{0L, 200L, 60L, 200L, 220L, 200L, 60L, 200L};
   public static final long[] e = new long[]{0L, 160L, 40L, 160L, 40L, 160L, 40L, 160L};
   public static final long[] f = new long[]{0L, 400L, 600L, 400L, 600L, 400L, 600L, 400L};
   public static final long[] g = new long[]{0L, 1000L};
   public static final long[] h = new long[]{0L, 400L};
   public static final long[] i = new long[]{0L, 500L, 200L, 500L};
   public static final long[] j = new long[]{0L, 60L, 60L, 60L, 60L, 60L, 180L, 60L, 60L, 60L, 60L, 60L};
   public static final long[] k = new long[]{0L, 200L};
   public static final long l_10minutesInMs;
   public static final long m_5secsInMs;

   static {
      l_10minutesInMs = TimeUnit.MINUTES.toMillis(10L);
      m_5secsInMs = TimeUnit.SECONDS.toMillis(5L);
   }
}
