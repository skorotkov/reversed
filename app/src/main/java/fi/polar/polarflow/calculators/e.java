package fi.polar.polarflow.calculators;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;

import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

class e extends h implements y {
   private AlarmManager d;
   private PendingIntent e;
   private final long f;
   private final Handler g;
   private final BroadcastReceiver h;
   private final Runnable i;

   e(Context var1, long var2, long var4) {
      this(var1, (Handler)null, (AlarmManager)null, var2, var4);
   }

   e(Context var1, Handler var2, AlarmManager var3, long var4, long var6) {
      this(var1, var2, var3, var4, var6, (v_StickyLocalBroadcastManager)null);
   }

   e(Context var1, Handler var2, AlarmManager var3, long var4, long var6, v_StickyLocalBroadcastManager var8) {
      super(var1, var6);
      this.h = new f(this);
      this.i = new g(this);
      if (var8 != null) {
         this.a((v_StickyLocalBroadcastManager)var8);
      }

      var6 = var4;
      if (var4 < 1000L) {
         fi.polar.polarflow.util.d.f("DurationLapCalc", "Minimal lap duration should be >= 1 second");
         var6 = 1000L;
      }

      this.f = var6;
      if (var2 == null) {
         this.g = new Handler();
      } else {
         this.g = var2;
      }

      if (var3 != null) {
         this.d = var3;
      } else {
         this.d = (AlarmManager)var1.getApplicationContext().getSystemService("alarm");
      }

      this.a(var1);
      this.f();
      IntentFilter var9 = new IntentFilter();
      var9.addAction("fi.polar.polarflow.action.AUTO_LAP_ALARM_TRIGGERED");
      this.b.a_registerReceiver(this.h, var9);
   }

   // $FF: synthetic method
   static Handler a(e var0) {
      return var0.g;
   }

   private void a(long var1) {
      fi.polar.polarflow.util.d.c("DurationLapCalc", "setNextAutoLapAlarm() " + var1 + " ms from now.");
      this.d.setExact(2, SystemClock.elapsedRealtime() + var1, this.e);
   }

   private void a(Context var1) {
      Intent var2 = new Intent(var1.getApplicationContext(), AlarmReceiver.class);
      var2.setAction("fi.polar.polarflow.action.CALCULATOR_ALARM");
      var2.putExtra("fi.polar.polarflow.extra.LOCAL_ACTION", "fi.polar.polarflow.action.AUTO_LAP_ALARM_TRIGGERED");
      this.e = PendingIntent.getBroadcast(var1.getApplicationContext(), 5, var2, 268435456);
   }

   // $FF: synthetic method
   static long b(e var0) {
      return var0.f;
   }

   private void q() {
      this.h();
      this.d.cancel(this.e);
   }

   public void b() {
      super.b();
      this.q();
   }

   public void c() {
      super.c();
      this.f();
   }

   public void d() {
      this.q();
      this.b.a_unregisterReceiver(this.h);
   }

   protected long e() {
      return this.f;
   }

   protected void f() {
      this.a(this.f * (long)this.a - this.j());
   }

   protected Runnable g() {
      return this.i;
   }

   void h() {
      this.g.removeCallbacks(this.g());
   }
}
