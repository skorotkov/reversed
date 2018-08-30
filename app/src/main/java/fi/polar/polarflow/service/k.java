package fi.polar.polarflow.service;

import android.content.Intent;
import fi.polar.polarflow.service.bluetooth.BluetoothSyncReceiver;
import fi.polar.polarflow.service.datalayer.ar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class k implements Runnable {
   // $FF: synthetic field
   final PresyncService a;
   private final String b;
   private final fi.polar.polarflow.service.datalayer.u c;
   private final ExecutorService d;
   private int e;

   public k(PresyncService var1, fi.polar.polarflow.service.datalayer.u var2, ExecutorService var3, String var4) {
      this.a = var1;
      this.b = var4;
      this.c = var2;
      this.d = var3;
   }

   public k(PresyncService var1, String var2) {
      this(var1, new fi.polar.polarflow.service.datalayer.u(), Executors.newFixedThreadPool(5), var2);
   }

   private void a() {
      fi.polar.polarflow.util.d.c(PresyncService.a(), "preSyncTask signalHost(syncEnabled=" + fi.polar.polarflow.util.r.a.b() + ", journalingOngoing=" + fi.polar.polarflow.util.r.a.f() + ")");
      ar var1;
      if (fi.polar.polarflow.util.r.a.b() && !fi.polar.polarflow.util.r.a.f()) {
         if (fi.polar.polarflow.util.y.f(this.a)) {
            var1 = new ar("/MESSAGE/SYNC_RESPONSE", fi.polar.polarflow.service.datalayer.v.a(true));
            var1.a(this.b);
            this.c.b(this.a).execute(new ar[]{var1});
         } else {
            Intent var2 = new Intent();
            var2.setAction("fi.polar.polarflow.action.TRIGGER_SYNC");
            var2.setClass(this.a, BluetoothSyncReceiver.class);
            this.a.sendBroadcast(var2);
         }
      } else if (fi.polar.polarflow.util.y.f(this.a)) {
         var1 = new ar("/MESSAGE/SYNC_RESPONSE", fi.polar.polarflow.service.datalayer.v.a(false));
         var1.a(this.b);
         this.c.b(this.a).execute(new ar[]{var1});
      }

   }

   public void a(int var1) {
      this.e = var1;
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }
}
