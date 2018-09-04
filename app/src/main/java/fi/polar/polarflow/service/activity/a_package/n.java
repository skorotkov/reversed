package fi.polar.polarflow.service.activity.a_package;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;

class n extends k {
   private final a b = new a();
   private int c = Integer.MAX_VALUE;
   private DateTime d = null;
   private boolean e;

   public n() {
      super(v.a);
   }

   private void a(DateTime var1, int var2) {
      if (this.e) {
         this.d = var1.withTimeAtStartOfDay();
         this.e = false;
      }

      if (this.c != Integer.MAX_VALUE && this.d != null) {
         long var3 = (new Duration(this.d, var1)).getMillis();
         if (var3 > 0L) {
            this.b.a(var2, var3);
         } else {
            fi.polar.polarflow.util.d.e("CumulativeTimes", "eventTime" + DateTimeFormat.forPattern(" (HH:mm:ss)").print((ReadableInstant)var1) + " - mLastEventTime" + DateTimeFormat.forPattern(" (HH:mm:ss)").print((ReadableInstant)this.d) + " is negative or zero (" + var3 + ")");
         }
      }

      this.c = var2;
      this.d = var1;
   }

   public long a(int var1) {
      return this.b.a(var1);
   }

   public void a() {
      super.a();
      this.b.a();
   }

   public void a(o var1) {
      if (var1 instanceof p) {
         p var2 = (p)var1;
         if (!var2.f) {
            this.a(var2.b, var2.e);
         } else {
            this.d = null;
         }
      } else {
         fi.polar.polarflow.util.d.c("CumulativeTimes", "", new IllegalArgumentException("Expecting SummarizerInputMet"));
      }

   }

   public void b_() {
      super.b_();
      this.e = true;
      this.d = null;
   }

   public float c_() {
      fi.polar.polarflow.util.d.c("CumulativeTimes", "", new UnsupportedOperationException("getTotal() without activityClass not supported"));
      return 0.0F;
   }
}
