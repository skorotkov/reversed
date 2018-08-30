package fi.polar.polarflow.service.activity;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class br {
   fi.polar.polarflow.util.aa a;
   private DateTimeFormatter b;

   public br() {
      this(new fi.polar.polarflow.util.aa());
   }

   public br(fi.polar.polarflow.util.aa var1) {
      this.a = var1;
   }

   public long a() {
      return this.a.a();
   }

   public long a(DateTime var1, DateTime var2) {
      long var3 = 0L;
      long var5 = var3;
      if (var1 != null) {
         var5 = var3;
         if (var2 != null) {
            var5 = var3;
            if (var2.isAfter(var1)) {
               var5 = TimeUnit.MILLISECONDS.toNanos(var2.getMillis() - var1.getMillis());
            }
         }
      }

      return var5;
   }

   public DateTime a(DateTime var1, long var2) {
      return var1.plus(TimeUnit.NANOSECONDS.toMillis(var2));
   }

   public long b() {
      return this.a.b();
   }

   public String b(DateTime var1, long var2) {
      if (this.b == null) {
         this.b = DateTimeFormat.forPattern("HH:mm:ss");
      }

      return this.b.print((ReadableInstant)this.a(var1, var2));
   }

   public DateTime c() {
      return new DateTime(this.a.a(), this.f());
   }

   public LocalDate d() {
      return new LocalDate(this.a.a(), this.f());
   }

   public TimeZone e() {
      return this.a.d();
   }

   public DateTimeZone f() {
      return DateTimeZone.forTimeZone(this.e());
   }

   public DateTime g() {
      return this.c().minus(this.a.b());
   }
}
