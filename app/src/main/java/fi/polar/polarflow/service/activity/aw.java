package fi.polar.polarflow.service.activity;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public abstract class aw extends Service {
   private final String a = super.getClass().getSimpleName();
   private fi.polar.polarflow.util.n_PowerManagerHelper b;
   private az c;
   private final BroadcastReceiver d = new ax(this);

   // $FF: synthetic method
   static String a(aw var0) {
      return var0.a;
   }

   private void a() {
      fi.polar.polarflow.util.d.c(this.a, "onEnterDeviceIdleMode()");
      if (this.c.equals(az.c)) {
         if (this.g()) {
            fi.polar.polarflow.util.d.c(this.a, "reschedule job");
            this.a(az.b);
         } else {
            this.a(az.a);
         }
      }

   }

   private void a(az var1) {
      if (var1 != this.c) {
         this.c = var1;
      }

   }

   private void b() {
      fi.polar.polarflow.util.d.c(this.a, "onExitDeviceIdleMode()");
      if (this.c.equals(az.b)) {
         this.a(az.c);
         this.f();
      }

   }

   // $FF: synthetic method
   static void b(aw var0) {
      var0.a();
   }

   // $FF: synthetic method
   static void c(aw var0) {
      var0.b();
   }

   protected abstract void f();

   protected abstract boolean g();

   protected final void k() {
      switch(ay.a[this.c.ordinal()]) {
      case 1:
         if (this.m()) {
            fi.polar.polarflow.util.d.c(super.getClass().getSimpleName(), "scheduleJob(): success, in device idle mode");
            this.a(az.b);
         } else {
            this.a(az.c);
            this.f();
         }
         break;
      case 2:
         fi.polar.polarflow.util.d.c(this.a, "scheduleJob(): already pending");
         break;
      case 3:
         fi.polar.polarflow.util.d.c(this.a, "scheduleJob(): already running");
      }

   }

   protected void l() {
      if (this.c.equals(az.c)) {
         this.a(az.a);
      }

   }

   protected boolean m() {
      return this.b.b_isDeviceIdleMode();
   }

   public void onCreate() {
      super.onCreate();
      if (this.b == null) {
         this.b = new fi.polar.polarflow.util.n_PowerManagerHelper(this);
      }

      this.registerReceiver(this.d, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
      this.c = az.a;
   }

   public void onDestroy() {
      this.unregisterReceiver(this.d);
      super.onDestroy();
   }
}
