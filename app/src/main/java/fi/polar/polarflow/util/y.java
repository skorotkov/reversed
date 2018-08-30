package fi.polar.polarflow.util;

import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.orm.SyncInfo;
import fi.polar.polarflow.service.PresyncService;
import fi.polar.polarflow.service.bluetooth.BluetoothSyncReceiver;
import fi.polar.polarflow.service.datalayer.ar;
import fi.polar.polarflow.service.datalayer.as;
import java.util.Date;

public class y {
   public static void a(Context var0) {
      if (!f(var0)) {
         var0.startService(PresyncService.a(var0, u.a().c()));
      } else {
         ar var1 = new ar("/MESSAGE/AUTO_SYNC_NOTIFICATION", (byte[])null, (String)null);
         (new as(var0)).execute(new ar[]{var1});
      }

   }

   public static void a(Context var0, boolean var1) {
      if (a()) {
         a(false);
         Intent var2 = new Intent();
         var2.setAction("fi.polar.polarflow.action.SYNC_STOPPED");
         var2.putExtra("fi.polar.polarflow.extra.SYNC_SUCCESSFUL", var1);
         var0.sendBroadcast(var2);
      }

   }

   private static void a(boolean var0) {
      r.a.a(var0);
   }

   private static boolean a() {
      return r.a.a();
   }

   public static void b(Context var0) {
      if (!f(var0)) {
         Intent var1 = new Intent();
         var1.setAction("fi.polar.polarflow.action.CANCEL_SYNC");
         var1.setClass(var0, BluetoothSyncReceiver.class);
         var0.sendBroadcast(var1);
      }

   }

   public static void b(Context var0, boolean var1) {
      r.a.b(var1);
      c(var0, var1);
   }

   public static void c(Context var0) {
      if (!f(var0)) {
         Intent var1 = new Intent();
         var1.setAction("fi.polar.polarflow.action.ACTION_WEAR_CONNECTED");
         var1.setClass(var0, BluetoothSyncReceiver.class);
         var0.sendBroadcast(var1);
      }

   }

   private static void c(Context var0, boolean var1) {
      ar var2;
      if (var1) {
         if (f(var0)) {
            var2 = new ar("/MESSAGE/SYNC_AVAILABILITY_NOTIFICATION", fi.polar.polarflow.service.datalayer.v.a(true));
            (new as(var0)).execute(new ar[]{var2});
         }
      } else if (f(var0)) {
         var2 = new ar("/MESSAGE/SYNC_AVAILABILITY_NOTIFICATION", fi.polar.polarflow.service.datalayer.v.a(false));
         (new as(var0)).execute(new ar[]{var2});
      } else {
         b(var0);
      }

   }

   public static void d(Context var0) {
      if (!f(var0)) {
         Intent var1 = new Intent();
         var1.setAction("fi.polar.polarflow.action.ACTION_WEAR_DISCONNECTED");
         var1.setClass(var0, BluetoothSyncReceiver.class);
         var0.sendBroadcast(var1);
      }

   }

   public static void e(Context var0) {
      if (!a()) {
         a(true);
         Intent var1 = new Intent();
         var1.setAction("fi.polar.polarflow.action.SYNC_STARTED");
         var0.sendBroadcast(var1);
      }

   }

   public static boolean f(Context var0) {
      int var1 = u.a(var0).b();
      int var2 = var1;
      if (var1 == 0) {
         var2 = fi.polar.polarflow.service.f.a(var0);
      }

      boolean var3;
      if (var2 != 2) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public static boolean g(Context var0) {
      boolean var1;
      if (f(var0)) {
         var1 = w.b();
      } else if (u.a().g() != -1L) {
         SyncInfo var2 = w.a();
         var1 = (new Date(u.a().g())).before(var2.getLastModified());
      } else {
         var1 = true;
      }

      return var1;
   }
}
