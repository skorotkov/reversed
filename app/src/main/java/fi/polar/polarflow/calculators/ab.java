package fi.polar.polarflow.calculators;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

class ab extends h implements y {
   private final Handler d;
   private boolean e;
   private final BroadcastReceiver f;
   private final Runnable g;

   ab(Context var1, long var2) {
      this(var1, var2, (Handler)null, (v_StickyLocalBroadcastManager)null);
   }

   ab(Context var1, long var2, Handler var4, v_StickyLocalBroadcastManager var5) {
      super(var1, var2, var5);
      this.e = false;
      this.f = new ac(this);
      this.g = new ad(this);
      if (var4 == null) {
         this.d = new Handler();
      } else {
         this.d = var4;
      }

      this.b.a_registerReceiver(this.f, new IntentFilter("fi.polar.polarflow.action.ADD_MANUAL_LAP"));
   }

   // $FF: synthetic method
   static Handler a(ab var0) {
      return var0.d;
   }

   public void d() {
      if (this.h()) {
         this.b(-1, this.i(), this.k());
      }

      this.e();
   }

   protected void e() {
      this.b.a_unregisterReceiver(this.f);
   }

   protected Runnable f() {
      return this.g;
   }

   protected void g() {
      this.e = true;
   }

   protected boolean h() {
      return this.e;
   }

   int n() {
      return 998;
   }
}
