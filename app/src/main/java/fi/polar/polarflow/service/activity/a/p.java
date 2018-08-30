package fi.polar.polarflow.service.activity.a;

import org.joda.time.DateTime;

public class p extends o {
   public final long d;
   public final int e;
   public final boolean f;

   public p(DateTime var1, float var2, long var3, int var5) {
      this(var1, var2, var3, var5, false);
   }

   public p(DateTime var1, float var2, long var3, int var5, boolean var6) {
      super(v.a, var1, var2);
      this.d = var3;
      this.e = var5;
      this.f = var6;
   }
}
