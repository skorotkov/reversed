package fi.polar.polarflow.c_package.b_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

public class j {
   private final Handler a;
   private m b;
   private Context c;
   private boolean d;
   private final BroadcastReceiver e;
   private final Runnable f;

   public j(Context var1) {
      this(var1, new Handler());
   }

   public j(Context var1, Handler var2) {
      this.e = new k(this);
      this.f = new l(this);
      this.a = var2;
      this.c = var1;
   }

   // $FF: synthetic method
   static m a(j var0) {
      return var0.b;
   }

   private void a(long var1) {
      this.a.removeCallbacks(this.f);
      this.a.postDelayed(this.f, var1);
   }

   // $FF: synthetic method
   static void a(j var0, long var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static boolean a(j var0, boolean var1) {
      var0.d = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b(j var0) {
      return var0.d;
   }

   public void a() {
      fi.polar.polarflow.util.d.c("BluetoothStatusHandler", "stopListening()");
      if (this.b != null) {
         this.c.unregisterReceiver(this.e);
      }

      this.b = null;
      this.a.removeCallbacks(this.f);
   }

   public void a(m var1) {
      fi.polar.polarflow.util.d.c("BluetoothStatusHandler", "startListening()");
      this.b = var1;
      if (this.b != null) {
         this.c.registerReceiver(this.e, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
      }

   }
}
