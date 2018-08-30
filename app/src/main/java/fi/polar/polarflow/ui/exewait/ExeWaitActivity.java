package fi.polar.polarflow.ui.exewait;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.wearable.view.DotsPageIndicator;
import android.view.KeyEvent;
import android.view.View;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.ui.exeview.ExeViewActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExeWaitActivity extends Activity implements ad, n, p, fi.polar.polarflow.ui.u {
   private String a = null;
   private long b = -1L;
   private boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private boolean f = false;
   private boolean g = false;
   private q h = null;
   private ae i = null;
   private ExeWaitGridPager j;
   private android.support.v4.c.g k;
   private IntentFilter l;
   private List m;
   private List n;
   private final long o;
   private final Handler p;
   private final Runnable q;
   private final BroadcastReceiver r;
   private final BroadcastReceiver s;

   public ExeWaitActivity() {
      this.o = TimeUnit.MINUTES.toMillis(30L);
      this.p = new Handler();
      this.q = new c(this);
      this.r = new d(this);
      this.s = new f(this);
   }

   // $FF: synthetic method
   static String a(ExeWaitActivity var0, String var1) {
      var0.a = var1;
      return var1;
   }

   private void a(long var1) {
      Intent var3 = new Intent("TrainingService.action.START_SESSION");
      var3.putExtra(SportProfile.KEY_SPORT_ID, var1);
      if (this.i != null) {
         this.i.a(var3);
      }

      this.k.b(var3);
   }

   private void a(long var1, boolean var3) {
      if (!fi.polar.polarflow.util.y.f(this) && fi.polar.polarflow.util.r.a.a()) {
         this.b = var1;
         this.c = var3;
         this.s();
      } else {
         this.b(var1, var3);
      }

   }

   private void a(Fragment var1) {
      FragmentTransaction var2 = this.getFragmentManager().beginTransaction();
      var2.detach(var1);
      var2.attach(var1);
      var2.commitAllowingStateLoss();
   }

   private void a(String var1) {
      var1 = this.getString(2131230796, new Object[]{var1});
      fi.polar.polarflow.ui.q var2 = (new fi.polar.polarflow.ui.t()).b(var1).a(true).a();
      var2.a((fi.polar.polarflow.ui.u)this);
      var2.show(this.getFragmentManager(), "pairing_confirmation_dialog");
   }

   private void a(boolean var1) {
      Intent var2 = new Intent(this, ExeViewActivity.class);
      var2.putExtra("fi.polar.polarflow.extra.STARTED_FROM_POLAR_BUTTON", var1);
      var2.putExtra("fi.polar.polarflow.extra.SENDER_CLASS_SIMPLE_NAME", "ExeWaitActivity");
      this.startActivity(var2);
   }

   // $FF: synthetic method
   static boolean a(ExeWaitActivity var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static boolean a(ExeWaitActivity var0, boolean var1) {
      var0.f = var1;
      return var1;
   }

   // $FF: synthetic method
   static ae b(ExeWaitActivity var0) {
      return var0.i;
   }

   private void b(long var1, boolean var3) {
      if (!fi.polar.polarflow.util.r.a.f()) {
         if (!this.e) {
            this.e = true;
            this.a(var1);
            this.a(var3);
         }
      } else {
         fi.polar.polarflow.util.d.e("ExeWaitActivity", "startSession not reacted to (journaling ongoing)");
      }

   }

   // $FF: synthetic method
   static void b(ExeWaitActivity var0, String var1) {
      var0.a(var1);
   }

   private void b(String var1) {
      DialogFragment var2 = (DialogFragment)this.getFragmentManager().findFragmentByTag(var1);
      if (var2 != null) {
         var2.dismiss();
      }

   }

   // $FF: synthetic method
   static boolean b(ExeWaitActivity var0, boolean var1) {
      var0.d = var1;
      return var1;
   }

   // $FF: synthetic method
   static void c(ExeWaitActivity var0) {
      var0.l();
   }

   // $FF: synthetic method
   static ExeWaitGridPager d(ExeWaitActivity var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static void e(ExeWaitActivity var0) {
      var0.t();
   }

   private void f() {
      String var1 = this.i.d().getPath();
      List var2 = v.d();
      var2.addAll(fi.polar.polarflow.ui.exewait.m.d());
      Iterator var4 = var2.iterator();

      boolean var3;
      while(true) {
         if (var4.hasNext()) {
            if (!var1.equals(((TrainingSessionTarget)var4.next()).getPath())) {
               continue;
            }

            var3 = false;
            break;
         }

         var3 = true;
         break;
      }

      if (var3) {
         this.i.a((String)null);
         if (this.i.b("show_target_details_dialog") != null) {
            this.i.b();
         }
      }

   }

   // $FF: synthetic method
   static void f(ExeWaitActivity var0) {
      var0.f();
   }

   private void g() {
      fi.polar.polarflow.ui.q var1 = (fi.polar.polarflow.ui.q)this.i.b("enable_target_mode_dialog");
      this.i.e(var1);
   }

   // $FF: synthetic method
   static void g(ExeWaitActivity var0) {
      var0.g();
   }

   private void h() {
      boolean var1 = true;
      if (this.i.a()) {
         this.m = new ArrayList();
         this.n = new ArrayList();
      } else {
         this.m = v.d();
         this.n = fi.polar.polarflow.ui.exewait.m.d();
      }

      h var2 = (h)this.j.getAdapter();
      o var3 = (o)((a)var2.d()).a();
      boolean var4 = this.i.a();
      boolean var5;
      if (!this.m.isEmpty()) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (this.n.isEmpty()) {
         var1 = false;
      }

      var5 = var2.a(var4, var5, var1);
      o var6 = var3;
      if (var2.c(var3) == -1) {
         fi.polar.polarflow.util.d.e("ExeWaitActivity", "Fragment type " + var3.name() + " was deleted on sync.");
         var6 = fi.polar.polarflow.ui.exewait.o.a;
      }

      this.j.setCurrentItem(var6);
      if (!var5) {
         this.i();
      }

   }

   // $FF: synthetic method
   static void h(ExeWaitActivity var0) {
      var0.h();
   }

   private void i() {
      Iterator var1 = ((h)this.j.getAdapter()).c().iterator();

      while(var1.hasNext()) {
         ((a)var1.next()).b();
      }

   }

   private void j() {
      boolean var1 = true;
      this.j = (ExeWaitGridPager)this.findViewById(2131755166);
      ExeWaitGridPager var2 = this.j;
      FragmentManager var3 = this.getFragmentManager();
      boolean var4 = this.i.a();
      boolean var5;
      if (!this.d().isEmpty()) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (this.e().isEmpty()) {
         var1 = false;
      }

      var2.setAdapter(new h(var3, var4, var5, var1));
      DotsPageIndicator var6 = (DotsPageIndicator)this.findViewById(2131755167);
      var6.setPager(this.j);
      var6.setOnPageChangeListener(this.j.getOnPageChangeListener());
   }

   private void k() {
      if (this.j.getCurrentFragment().a() != fi.polar.polarflow.ui.exewait.o.a) {
         this.j.setCurrentItem(fi.polar.polarflow.ui.exewait.o.a);
      } else {
         this.a(this.q().c(), true);
      }

   }

   private void l() {
      this.j.setCurrentItem(fi.polar.polarflow.ui.exewait.o.a);
      ((h)this.j.getAdapter()).a(true, false, false);
   }

   private void m() {
      this.p.removeCallbacks(this.q);
      this.p.postDelayed(this.q, this.o);
   }

   private void n() {
      this.p.removeCallbacks(this.q);
   }

   private void o() {
      fi.polar.polarflow.util.d.c("ExeWaitActivity", "startSensorUpdates()");
      this.k.a(new Intent(fi.polar.polarflow.c.o.a));
   }

   private void p() {
      this.b("pairing_confirmation_dialog");
   }

   private x q() {
      return (x)this.j.a(fi.polar.polarflow.ui.exewait.o.a);
   }

   private void r() {
      if (this.e && !this.d) {
         this.finishAffinity();
      }

   }

   private void s() {
      String var1 = this.getString(2131230991);
      fi.polar.polarflow.ui.q var2 = (new fi.polar.polarflow.ui.t()).b(var1).a(true).a();
      var2.a((fi.polar.polarflow.ui.u)this);
      var2.show(this.getFragmentManager(), "stop_sync_dialog");
   }

   private void t() {
      this.b("stop_sync_dialog");
      this.u();
   }

   private void u() {
      this.c = false;
      this.b = -1L;
   }

   public q a() {
      return this.h;
   }

   public void a(fi.polar.polarflow.ui.q var1) {
      if ("pairing_confirmation_dialog".equals(var1.a())) {
         Intent var2 = new Intent("fi.polar.polarflow.ACTION_SENSOR_PAIRING_CONFIRMED");
         var2.putExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_ADDRESS", this.a);
         this.k.a(var2);
      } else if ("stop_sync_dialog".equals(var1.a())) {
         this.b(this.b, this.c);
         this.u();
      }

   }

   public ae b() {
      return this.i;
   }

   public void b(fi.polar.polarflow.ui.q var1) {
      if ("pairing_confirmation_dialog".equals(var1.a())) {
         Intent var2 = new Intent("fi.polar.polarflow.ACTION_SENSOR_PAIRING_DECLINED");
         var2.putExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_ADDRESS", this.a);
         this.k.a(var2);
      } else if ("stop_sync_dialog".equals(var1.a())) {
         this.u();
      }

   }

   public int c() {
      return this.j.getAdapter().a(0);
   }

   public void c(fi.polar.polarflow.ui.q var1) {
      if ("pairing_confirmation_dialog".equals(var1.a())) {
         Intent var2 = new Intent("fi.polar.polarflow.ACTION_SENSOR_PAIRING_DECLINED");
         var2.putExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_ADDRESS", this.a);
         this.k.a(var2);
      } else if ("stop_sync_dialog".equals(var1.a())) {
         this.u();
      }

   }

   public List d() {
      if (this.m == null) {
         this.m = v.d();
      }

      return this.m;
   }

   public void d(fi.polar.polarflow.ui.q var1) {
   }

   public List e() {
      if (this.n == null) {
         this.n = fi.polar.polarflow.ui.exewait.m.d();
      }

      return this.n;
   }

   public void exeWaitOnClick(View var1) {
      this.a((Long)var1.getTag(), false);
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      fi.polar.polarflow.util.d.c("ExeWaitActivity", "onCreate");
      this.setContentView(2130968630);
      this.getWindow().addFlags(128);
      this.h = new q(this);
      this.i = new ae(this);
      this.i.a((ag)(new e(this)));
      if (this.getIntent() != null && this.getIntent().hasExtra(fi.polar.polarflow.ui.myday.item.e.c)) {
         this.i.a(this.getIntent().getStringExtra(fi.polar.polarflow.ui.myday.item.e.c));
         if (this.i.a()) {
            this.m = new ArrayList();
            this.n = new ArrayList();
         }
      }

      this.j();
      if (this.k == null) {
         this.k = android.support.v4.c.g.a(this);
      }

      this.l = new IntentFilter();
      this.l.addAction("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
      this.l.addAction("fi.polar.polarflow.ACTION_SENSOR_PAIRING_CONFIRMATION_NEEDED");
      this.l.addAction("ExeWaitActivity.ACTION_ENABLE_TARGET_MODE");
      this.l.addAction("ExeWaitActivity.ACTION_COLUMN_PEEK");
      this.l.addAction("SyncJournalingService.action.JOURNALING_STARTED");
      this.l.addAction("SyncJournalingService.action.JOURNALING_COMPLETED");
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      fi.polar.polarflow.util.d.c("ExeWaitActivity", "onKeyDown " + KeyEvent.keyCodeToString(var1));
      switch(var1) {
      case 262:
         this.k();
         break;
      case 263:
         this.finishAfterTransition();
         this.overridePendingTransition(0, 2131034140);
         break;
      case 264:
      default:
         var3 = super.onKeyDown(var1, var2);
         break;
      case 265:
         fi.polar.polarflow.ui.o.a((Context)this.getApplicationContext(), 30);
         this.k();
      }

      return var3;
   }

   public void onPause() {
      super.onPause();
      fi.polar.polarflow.util.d.c("ExeWaitActivity", "onPause");
      this.n();
      this.k.a(new Intent(fi.polar.polarflow.c.o.b));
      this.h.d();
   }

   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      this.h.a(var1, var2, var3);
   }

   protected void onRestart() {
      super.onRestart();
      fi.polar.polarflow.util.d.c("ExeWaitActivity", "onRestart()");
      this.a((Fragment)this.q());
      this.p();
      this.t();
      this.h.a();
      this.i.b();
      this.h();
   }

   public void onResume() {
      super.onResume();
      fi.polar.polarflow.util.d.c("ExeWaitActivity", "onResume");
      if (this.getIntent() != null && this.getIntent().hasExtra(fi.polar.polarflow.ui.myday.item.e.c)) {
         this.i.a(this.getIntent().getStringExtra(fi.polar.polarflow.ui.myday.item.e.c));
      }

      if (!this.g) {
         this.g = true;
         this.i.a(this.d());
         if (this.i.a()) {
            this.l();
         }
      }

      if (this.h.c()) {
         this.o();
      }

      this.m();
   }

   protected void onStart() {
      super.onStart();
      fi.polar.polarflow.util.d.c("ExeWaitActivity", "onStart()");
      this.d = false;
      this.k.a(this.s, new IntentFilter("ExeViewActivity.action.ENTER_ANIMATION_COMPLETE"));
      this.k.a(this.r, this.l);
      this.e = false;
   }

   public void onStop() {
      fi.polar.polarflow.util.d.c("ExeWaitActivity", "onStop()");
      this.k.a(this.r);
      this.k.a(this.s);
      this.r();
      this.i.a((String)null);
      this.m = null;
      this.n = null;
      super.onStop();
   }

   public void onWindowFocusChanged(boolean var1) {
      super.onWindowFocusChanged(var1);
      fi.polar.polarflow.util.d.c("ExeWaitActivity", "onWindowFocusChanged(" + var1 + ")");
      this.q().a(var1);
   }
}
