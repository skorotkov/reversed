package fi.polar.polarflow.ui.myday;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import fi.polar.polarflow.service.activity.SleepTrackingService;
import fi.polar.polarflow.service.activity.bo;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;
import fi.polar.polarflow.util.z;

public class StopSleepActivity extends Activity {
   private z a;
   private fi.polar.polarflow.service.datalayer.u b;
   private v_StickyLocalBroadcastManager c;
   private SleepTrackingService d;
   private View e;
   private String f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final bo j = new p(this);
   private final fi.polar.polarflow.ui.u k = new q(this);
   private final fi.polar.polarflow.ui.myday.a_package.c l = new r(this);
   private final ServiceConnection m = new s(this);

   // $FF: synthetic method
   static View a(StopSleepActivity var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static SleepTrackingService a(StopSleepActivity var0, SleepTrackingService var1) {
      var0.d = var1;
      return var1;
   }

   // $FF: synthetic method
   static String a(StopSleepActivity var0, String var1) {
      var0.f = var1;
      return var1;
   }

   private void a() {
      fi.polar.polarflow.ui.o.a((Context)this.getApplicationContext(), 30);
      this.setResult(-1, (new fi.polar.polarflow.ui.b()).a(true).a());
      this.finishAfterTransition();
      this.overridePendingTransition(0, 2131034140);
   }

   // $FF: synthetic method
   static boolean a(StopSleepActivity var0, boolean var1) {
      var0.i = var1;
      return var1;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.ui.myday.a_package.c b(StopSleepActivity var0) {
      return var0.l;
   }

   private void b() {
      if (this.i) {
         this.i = false;
         this.a.a(this);
      }

   }

   // $FF: synthetic method
   static boolean b(StopSleepActivity var0, boolean var1) {
      var0.h = var1;
      return var1;
   }

   // $FF: synthetic method
   static SleepTrackingService c(StopSleepActivity var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static bo d(StopSleepActivity var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static z e(StopSleepActivity var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.service.datalayer.u f(StopSleepActivity var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static v_StickyLocalBroadcastManager g(StopSleepActivity var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static String h(StopSleepActivity var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static void i(StopSleepActivity var0) {
      var0.b();
   }

   // $FF: synthetic method
   static boolean j(StopSleepActivity var0) {
      return var0.h;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968784);
      this.e = this.findViewById(2131755521);
      fi.polar.polarflow.ui.v var2 = (new fi.polar.polarflow.ui.t()).a(this.getString(2131231035)).b(this.getString(2131231034)).b(true).c();
      var2.a(this.k);
      this.getFragmentManager().beginTransaction().add(2131755520, var2).commit();
      this.getFragmentManager().executePendingTransactions();
      if (this.a == null) {
         this.a = new z();
      }

      if (this.b == null) {
         this.b = new fi.polar.polarflow.service.datalayer.u();
      }

      if (this.c == null) {
         this.c = v_StickyLocalBroadcastManager.a_getInstance();
      }

   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      boolean var4;
      switch(var1) {
      case 263:
         this.finishAfterTransition();
         this.overridePendingTransition(0, 2131034140);
         var4 = var3;
         break;
      case 264:
      default:
         var4 = super.onKeyDown(var1, var2);
         break;
      case 265:
         var4 = var3;
         if (var2.getRepeatCount() == 0) {
            this.a();
            var4 = var3;
         }
      }

      return var4;
   }

   protected void onStart() {
      super.onStart();
      this.g = this.bindService(new Intent(this, SleepTrackingService.class), this.m, 1);
   }

   protected void onStop() {
      this.b();
      if (this.d != null) {
         this.d.a(this.j);
         this.d = null;
      }

      if (this.g) {
         this.unbindService(this.m);
         this.g = false;
      }

      super.onStop();
   }
}
