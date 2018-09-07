package fi.polar.polarflow.service.activity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import fi.polar.polarflow.util.aa_TimeUtils;

public class ae {
   private static final String a = ae.class.getSimpleName();
   private AlarmManager b;
   private boolean c;
   private aa_TimeUtils d;
   private final Context e;
   private final ag f;
   private final BroadcastReceiver g = new af(this);

   public ae(Context var1, ag var2) {
      this.e = var1;
      this.f = var2;
      this.b = (AlarmManager)this.e.getSystemService("alarm");
      this.d = new aa_TimeUtils();
   }

   private PendingIntent a(Context var1) {
      Intent var2 = new Intent(var1, FlushAlarmReceiver.class);
      var2.setAction("fi.polar.polarflow.action.FLUSH_SENSOR_ALARM");
      return PendingIntent.getBroadcast(var1, 0, var2, 0);
   }

   // $FF: synthetic method
   static void a(ae var0) {
      var0.c();
   }

   private void c() {
      fi.polar.polarflow.util.d.c(a, "handleAlarm()");
      this.c = false;
      this.f.a();
   }

   public void a() {
      android.support.v4.c.g.a(this.e).a(this.g);
      this.b.cancel(this.a(this.e));
      this.c = false;
   }

   public void a(long var1) {
      this.a();
      android.support.v4.c.g.a(this.e).a(this.g, new IntentFilter("fi.polar.polarflow.action.FLUSH_SENSOR_ALARM"));
      long var3 = this.d.b_elapsedRealtime();
      this.b.setExact(2, var3 + var1, this.a(this.e));
      this.c = true;
      fi.polar.polarflow.util.d.c(a, "Trigger flush alarm " + var1 / 1000L + " seconds from now.");
   }

   public boolean b() {
      return this.c;
   }
}
