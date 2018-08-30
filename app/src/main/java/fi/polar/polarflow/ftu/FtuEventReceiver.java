package fi.polar.polarflow.ftu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.service.datalayer.ar;
import fi.polar.polarflow.service.datalayer.as;
import fi.polar.polarflow.service.datalayer.u;
import fi.polar.polarflow.util.r;
import fi.polar.polarflow.util.y;

public class FtuEventReceiver extends BroadcastReceiver {
   private static final String a = FtuEventReceiver.class.getSimpleName();
   private u b = new u();

   public static void a(Context var0) {
      if (y.f(var0)) {
         if (fi.polar.polarflow.util.u.a().d()) {
            ar var1 = new ar("/MESSAGE/AUTO_SYNC_NOTIFICATION", (byte[])null, (String)null);
            (new as(var0)).execute(new ar[]{var1});
         }
      } else {
         y.a(var0);
      }

   }

   private void b(Context var1) {
      o.b(false);
      r.a.a(0);
      if (o.a()) {
         o.a(false);
         var1.sendBroadcast(new Intent("fi.polar.polarflow.ACTION_FTU_FAILED"));
      }

   }

   private boolean c(Context var1) {
      int var2 = r.a.e();
      boolean var3;
      if (o.b() && var2 < 3) {
         a(var1);
         r.a.a(var2 + 1);
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   private void d(Context var1) {
      if (y.f(var1)) {
         ar var2 = new ar("/MESSAGE/USERID_RECEIVED_NOTIFICATION", (byte[])null, (String)null);
         this.b.b(var1).execute(new ar[]{var2});
      }

   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      fi.polar.polarflow.util.d.c(a, "onReceive(action=" + var3 + ")");
      if ("fi.polar.polarflow.action.USERID_RECEIVED".equals(var3) && !fi.polar.polarflow.util.u.a(var1).e()) {
         if (!o.a()) {
            var1.sendBroadcast(new Intent("fi.polar.polarflow.ACTION_FTU_STARTED"));
            o.a(true);
            this.d(var1);
         }
      } else if ("fi.polar.polarflow.action.SYNC_STARTED".equals(var3) && !fi.polar.polarflow.util.u.a(var1).e()) {
         o.b(true);
         if (fi.polar.polarflow.util.u.a().f() && !o.a()) {
            var1.sendBroadcast(new Intent("fi.polar.polarflow.ACTION_FTU_STARTED"));
            o.a(true);
         }
      } else if ("fi.polar.polarflow.action.SYNC_STOPPED".equals(var3) && !fi.polar.polarflow.util.u.a(var1).e()) {
         if (!fi.polar.polarflow.util.u.a().f()) {
            if (!this.c(var1)) {
               this.b(var1);
            }
         } else {
            o.b(false);
            r.a.a(0);
         }
      } else if ("fi.polar.polarflow.action.PROVISIONING_STATUS".equals(var3) && o.a()) {
         if (var2.getBooleanExtra("fi.polar.polarflow.extra.PROVISIONED", false)) {
            o.a(false);
            var1.sendBroadcast(new Intent("fi.polar.polarflow.ACTION_FTU_SUCCEEDED"));
         } else if (!this.c(var1)) {
            this.b(var1);
         }
      }

   }
}
