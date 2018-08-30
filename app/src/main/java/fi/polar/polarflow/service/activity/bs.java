package fi.polar.polarflow.service.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormat;

public class bs extends br {
   private final Context b;
   private final IntentFilter c;
   private final Map d;
   private DateTime e;
   private boolean f;
   private final BroadcastReceiver g = new bt(this);

   public bs(Context var1) {
      this.b = var1;
      this.c = new IntentFilter();
      this.c.addAction("android.intent.action.TIME_SET");
      this.c.addAction("android.intent.action.TIMEZONE_CHANGED");
      this.d = new HashMap();
   }

   // $FF: synthetic method
   static void a(bs var0) {
      var0.l();
   }

   // $FF: synthetic method
   static void b(bs var0) {
      var0.m();
   }

   private void h() {
      if (!this.f) {
         this.b.registerReceiver(this.g, this.c);
         this.f = true;
      }

   }

   private void i() {
      if (this.f) {
         this.b.unregisterReceiver(this.g);
         this.f = false;
      }

   }

   private DateTime j() {
      this.e = this.g();
      return this.e;
   }

   private DateTime k() {
      if (this.e == null) {
         this.e = this.g();
      }

      return this.e;
   }

   private void l() {
      DateTime var1 = this.g();
      long var2 = (new Duration(this.e, var1)).getMillis();
      String var4 = PeriodFormat.getDefault().print(new Period(var2));
      fi.polar.polarflow.util.d.c("TimeHelper", "onTimeChanged(): \"" + var4 + "\"");
      Iterator var5 = this.d.entrySet().iterator();

      while(true) {
         bu var6;
         long var7;
         do {
            if (!var5.hasNext()) {
               this.e = var1;
               return;
            }

            Entry var9 = (Entry)var5.next();
            var6 = (bu)var9.getKey();
            var7 = (new Duration((DateTime)var9.getValue(), var1)).getMillis();
         } while(Math.abs(var2) <= 3600000L && Math.abs(var7) <= 3600000L);

         var6.c();
      }
   }

   private void m() {
      fi.polar.polarflow.util.d.c("TimeHelper", "onTimeZoneOffsetChange()");
      this.j();
   }

   public DateTime a(long var1) {
      return this.a(this.k(), var1);
   }

   public void a(bu var1) {
      this.h();
      this.d.put(var1, this.j());
   }

   public void b(bu var1) {
      this.d.remove(var1);
      if (this.d.isEmpty()) {
         this.i();
      }

   }
}
