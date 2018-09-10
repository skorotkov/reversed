package fi.polar.polarflow.ui.exeview;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.wearable.view.DotsPageIndicator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import fi.polar.polarflow.data.Lap;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.ExercisePhase;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.ui.exeview.laps.LapNotificationView;
import fi.polar.polarflow.ui.exeview.shader.ShaderContainerView;
import fi.polar.polarflow.ui.exeview.shader.ShaderGridPager;
import fi.polar.polarflow.util.aa_TimeUtils;
import fi.polar.polarflow.util.n_PowerManagerHelper;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExeViewActivity extends android.support.wearable.activity.a implements am, d, e, fi.polar.polarflow.ui.exeview.shader.o, fi.polar.polarflow.ui.exeview.summary.f {
   private static final String[] a = new String[]{"target_done_dialog", "next_phase_dialog", "training_done_dialog", "gps_is_off_dialog", "touch_event_absorber_dialog"};
   private static final long y;
   private PendingIntent A;
   private long B;
   private aa_TimeUtils C;
   private n_PowerManagerHelper D;
   private boolean E;
   private Training F;
   private final BroadcastReceiver G;
   private final fi.polar.polarflow.util.a_package.e H;
   private LapNotificationView b;
   private LapNotificationView c;
   private ExeViewGridPager d;
   private aa e;
   private ShaderGridPager f;
   private fi.polar.polarflow.ui.exeview.shader.q g;
   private IntentFilter h;
   private View i;
   private View j;
   private int k = -1;
   private boolean l = false;
   private boolean m = false;
   private boolean n = false;
   private boolean o = false;
   private long p = 0L;
   private boolean q = false;
   private boolean r = false;
   private ak s;
   private ShaderContainerView t;
   private fi.polar.polarflow.util.a_package.b u;
   private final f v;
   private SportProfile w;
   private float x;
   private AlarmManager z;

   static {
      y = TimeUnit.SECONDS.toMillis(10L);
   }

   public ExeViewActivity() {
      this.s = ak.b;
      this.v = new f();
      this.x = 60.0F;
      this.E = false;
      this.F = Training.getInstance();
      this.G = new k(this);
      this.H = new s(this);
   }

   private SportProfile A() {
      if (this.w == null) {
         this.w = this.F.getSportProfile();
      }

      return this.w;
   }

   // $FF: synthetic method
   static float a(ExeViewActivity var0, float var1) {
      var0.x = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExeViewActivity var0, int var1) {
      var0.k = var1;
      return var1;
   }

   // $FF: synthetic method
   static ak a(ExeViewActivity var0, ak var1) {
      var0.s = var1;
      return var1;
   }

   private static fi.polar.polarflow.ui.exeview.screenlock.c a(FragmentManager var0) {
      return (fi.polar.polarflow.ui.exeview.screenlock.c)var0.findFragmentByTag("touch_event_absorber_dialog");
   }

   // $FF: synthetic method
   static List a(ExeViewActivity var0, boolean var1) {
      return var0.e(var1);
   }

   private void a(int var1, boolean var2) {
      if (this.F.getExercisePhase(var1) != null) {
         fi.polar.polarflow.ui.exeview.target.a var3 = (fi.polar.polarflow.ui.exeview.target.a)this.getFragmentManager().findFragmentByTag("next_phase_dialog");
         if (var3 != null) {
            var3.dismiss();
         }

         fi.polar.polarflow.ui.exeview.target.a.a(var1, var2).show(this.getFragmentManager(), "next_phase_dialog");
      }

   }

   private void a(Lap var1, int var2) {
      this.a(var1, var2, false);
   }

   private void a(Lap var1, int var2, boolean var3) {
      int var4 = 0;
      boolean var5;
      if (var1.getAutoLapType() != -1) {
         var5 = true;
      } else {
         var5 = false;
      }

      aa var6 = this.e;
      ak var7;
      if (var5) {
         var7 = ak.e;
      } else {
         var7 = ak.d;
      }

      fi.polar.polarflow.ui.exeview.laps.a var8 = (fi.polar.polarflow.ui.exeview.laps.a)var6.a(var7);
      if (var8 != null) {
         var4 = var8.i();
      }

      LapNotificationView var9 = this.d(var5);
      if (var4 == 0) {
         var9.a(var1, var2, var3);
      } else {
         var9.a(var1);
      }

   }

   // $FF: synthetic method
   static void a(ExeViewActivity var0, int var1, boolean var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(ExeViewActivity var0, Lap var1, int var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(ExeViewActivity var0, Lap var1, int var2, boolean var3) {
      var0.a(var1, var2, var3);
   }

   private static void a(a var0, FragmentManager var1) {
      FragmentTransaction var2 = var1.beginTransaction();
      var2.detach(var0);
      var2.attach(var0);
      var2.commitAllowingStateLoss();
   }

   private boolean a(TrainingSessionTarget var1) {
      boolean var2 = false;
      boolean var3 = var2;
      if (var1 != null) {
         var3 = var2;
         if (var1.getExerciseTarget() != null) {
            int var4 = var1.getExerciseTarget().getTargetType();
            if (var4 != 1) {
               var3 = var2;
               if (var4 != 2) {
                  return var3;
               }
            }

            var3 = true;
         }
      }

      return var3;
   }

   // $FF: synthetic method
   static boolean a(ExeViewActivity var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static aa b(ExeViewActivity var0) {
      return var0.e;
   }

   private void b(Bundle var1) {
      this.e = new aa(this.getFragmentManager(), this.e(this.q), this.A());
      this.d = (ExeViewGridPager)this.findViewById(2131755166);
      this.d.setAdapter(this.e);
      this.d.setOffscreenPageCount(ak.values().length - 1);
      this.g = new fi.polar.polarflow.ui.exeview.shader.q(this.getFragmentManager(), this.z());
      this.g.f(0, 0);
      this.t = (ShaderContainerView)this.findViewById(2131755193);
      this.f = (ShaderGridPager)this.findViewById(2131755194);
      this.f.setAdapter(this.g);
      this.f.setOffscreenPageCount(this.g.a(0));
      this.f.a(0, 0);
      ((DotsPageIndicator)this.findViewById(2131755195)).setPager(this.f);
      ak var3;
      if (var1 != null) {
         var3 = (ak)var1.getSerializable("currentFragmentType");
      } else {
         var3 = null;
      }

      if (var3 == null) {
         ExeViewGridPager var2 = this.d;
         if (this.q) {
            var3 = ak.a;
         } else if (this.a(this.F.getTrainingSessionTarget())) {
            var3 = ak.c;
         } else {
            var3 = ak.b;
         }

         var2.a(var3, false);
      } else {
         this.d.a(var3, false);
      }

      this.d.setOnTouchListener(new w(this, (k)null));
      this.d.a((android.support.wearable.view.aj)(new u(this, (k)null)));
      this.d.setDotsPageIndicator((DotsPageIndicator)this.findViewById(2131755167));
      this.j = this.findViewById(2131755172);
      this.j.setOnTouchListener(new q(this));
      this.j.setOnClickListener(new r(this));
      this.j.setAlpha(0.0F);
   }

   // $FF: synthetic method
   static void b(ExeViewActivity var0, boolean var1) {
      var0.h(var1);
   }

   // $FF: synthetic method
   static void c(ExeViewActivity var0) {
      var0.m();
   }

   // $FF: synthetic method
   static void c(ExeViewActivity var0, boolean var1) {
      var0.f(var1);
   }

   // $FF: synthetic method
   static ExeViewGridPager d(ExeViewActivity var0) {
      return var0.d;
   }

   private LapNotificationView d(boolean var1) {
      LapNotificationView var2;
      if (var1) {
         var2 = this.c;
      } else {
         var2 = this.b;
      }

      LapNotificationView var3 = var2;
      if (var2 == null) {
         int var4;
         if (var1) {
            var4 = 2131755170;
         } else {
            var4 = 2131755168;
         }

         var3 = (LapNotificationView)((ViewStub)this.findViewById(var4)).inflate();
         var3.setSportProfileSettings(this.A().getSettings());
         var3.setOnClickListener(new o(this, var1));
         if (var1) {
            this.c = var3;
         } else {
            this.b = var3;
         }
      }

      return var3;
   }

   // $FF: synthetic method
   static boolean d(ExeViewActivity var0, boolean var1) {
      var0.r = var1;
      return var1;
   }

   private List e(boolean var1) {
      ArrayList var2 = new ArrayList();
      var2.add(ak.a);
      if (!var1) {
         var2.add(ak.b);
      }

      if (!var1 && this.a(this.F.getTrainingSessionTarget())) {
         var2.add(ak.c);
      }

      if (!var1 && v_StickyLocalBroadcastManager.a_getInstance().a_registerReceiver((BroadcastReceiver)null, (String)"ExerciseLapCalc.ACTION_MANUAL_LAP") != null) {
         var2.add(ak.d);
      }

      SportProfile var3 = this.A();
      if (!var1 && var3 != null && var3.getSettings().getAutomaticLap() != 1) {
         var2.add(ak.e);
      }

      var2.add(ak.f);
      return var2;
   }

   // $FF: synthetic method
   static void e(ExeViewActivity var0) {
      var0.k();
   }

   // $FF: synthetic method
   static void f(ExeViewActivity var0) {
      var0.l();
   }

   private void f(boolean var1) {
      ab var2 = (ab)this.e.a(ak.a);
      if (var2 != null) {
         if (var1) {
            var2.k();
         } else {
            var2.l();
         }
      }

   }

   // $FF: synthetic method
   static Training g(ExeViewActivity var0) {
      return var0.F;
   }

   private void g() {
      FragmentManager var1 = this.getFragmentManager();
      if (!this.E && var1.findFragmentByTag("gps_is_off_dialog") == null) {
         fi.polar.polarflow.util.d.c("ExeViewActivity", "showGpsRecordingIsOffDialog: ");
         (new al()).show(var1, "gps_is_off_dialog");
      }

      this.E = true;
   }

   private void g(boolean var1) {
      fi.polar.polarflow.util.d.d("ExeViewActivity", "setPauseStopAnimationState isRunning:" + var1);
      ab var2 = (ab)this.e.a(ak.a);
      if (var2 != null) {
         if (var1) {
            var2.i();
         } else {
            var2.j();
         }
      }

   }

   private void h() {
      Fragment var1 = this.getFragmentManager().findFragmentByTag("gps_is_off_dialog");
      this.E = false;
      if (var1 != null) {
         fi.polar.polarflow.util.d.c("ExeViewActivity", "dismissGpsRecordingIsOffDialog: ");
         ((DialogFragment)var1).dismissAllowingStateLoss();
      }

   }

   // $FF: synthetic method
   static void h(ExeViewActivity var0) {
      var0.j();
   }

   private void h(boolean var1) {
      fi.polar.polarflow.ui.exeview.target.d var2 = (fi.polar.polarflow.ui.exeview.target.d)this.getFragmentManager().findFragmentByTag("target_done_dialog");
      if (var2 != null) {
         var2.dismiss();
      }

      fi.polar.polarflow.ui.exeview.target.d.a(this.F.getTrainingSessionTarget().getPath(), this.F.getUserUnitSystem(), var1).show(this.getFragmentManager(), "target_done_dialog");
   }

   // $FF: synthetic method
   static n_PowerManagerHelper i(ExeViewActivity var0) {
      return var0.D;
   }

   private void i() {
      ab var1 = (ab)this.e.a(ak.a);
      if (var1 != null) {
         View var2;
         if (var1.getView() != null) {
            var2 = var1.getView().findViewById(2131755186);
         } else {
            var2 = null;
         }

         this.i = var2;
      }

   }

   private void i(boolean var1) {
      FragmentManager var2 = this.getFragmentManager();
      if (a(var2) == null) {
         fi.polar.polarflow.ui.exeview.screenlock.c.a(var1).show(var2, "touch_event_absorber_dialog");
      }

   }

   private void j() {
      fi.polar.polarflow.ui.exeview.target.n var1 = (fi.polar.polarflow.ui.exeview.target.n)this.getFragmentManager().findFragmentByTag("training_done_dialog");
      if (var1 != null) {
         var1.dismiss();
      }

      fi.polar.polarflow.ui.exeview.target.n.a(this.F.getTrainingSessionTarget().getName()).show(this.getFragmentManager(), "training_done_dialog");
   }

   // $FF: synthetic method
   static void j(ExeViewActivity var0) {
      var0.g();
   }

   private void k() {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onSessionPaused()");
      this.q = true;
      this.n = true;
      this.v.a(false);
      this.e.a(this.e(this.q));
      this.f(true);
      if (this.c != null) {
         this.c.a(0L);
      }

   }

   // $FF: synthetic method
   static void k(ExeViewActivity var0) {
      var0.h();
   }

   // $FF: synthetic method
   static int l(ExeViewActivity var0) {
      return var0.k;
   }

   private void l() {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onSessionResumed()");
      this.q = false;
      this.n = true;
      this.v.a(true);
      this.j.setVisibility(8);
      if (this.k <= 0 && ak.a.equals(this.e.e())) {
         this.d.setSlideAnimationDuration(0);
         this.e.a(this.e(this.q));
         if (this.k == 1) {
            this.d.setCurrentItem(ak.f);
            this.d.invalidate();
         }

         this.d.setSlideAnimationDuration(1500);
         this.f(false);
         this.d.animate().setDuration(50L).withEndAction(new n(this)).start();
      } else if (this.i != null) {
         this.i.animate().cancel();
         this.i.animate().setDuration(150L).setStartDelay(0L).x(this.i.getX() - 30.0F).withEndAction(new l(this)).start();
      }

   }

   // $FF: synthetic method
   static ak m(ExeViewActivity var0) {
      return var0.s;
   }

   private void m() {
      this.finishAfterTransition();
   }

   // $FF: synthetic method
   static float n(ExeViewActivity var0) {
      return var0.x;
   }

   private void n() {
      Iterator var1 = this.e.c().iterator();

      while(var1.hasNext()) {
         ((a)var1.next()).c();
      }

   }

   // $FF: synthetic method
   static View o(ExeViewActivity var0) {
      return var0.i;
   }

   private void o() {
      if (this.i != null) {
         this.i.setVisibility(0);
         this.j.setX(-95.0F);
         this.i.animate().cancel();
         this.i.animate().setStartDelay(0L).x(this.x).withEndAction(new p(this)).start();
      }

   }

   // $FF: synthetic method
   static View p(ExeViewActivity var0) {
      return var0.j;
   }

   private void p() {
      if (!ak.a.equals(this.e.e())) {
         this.j.setVisibility(8);
         this.d.setCurrentItem(ak.a);
      }

   }

   private List q() {
      ArrayList var1 = new ArrayList();
      String[] var2 = a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2[var4];
         fi.polar.polarflow.ui.g var6 = (fi.polar.polarflow.ui.g)this.getFragmentManager().findFragmentByTag(var5);
         if (var6 != null) {
            var1.add(var6);
         }
      }

      return var1;
   }

   // $FF: synthetic method
   static void q(ExeViewActivity var0) {
      var0.p();
   }

   private void r() {
      this.B = this.C.b_elapsedRealtime() + y;
      if (this.b()) {
         this.z.setExact(2, this.B, this.A);
      }

   }

   // $FF: synthetic method
   static boolean r(ExeViewActivity var0) {
      return var0.o;
   }

   private void s() {
      this.B = 0L;
      if (this.z != null) {
         this.z.cancel(this.A);
      }

   }

   // $FF: synthetic method
   static boolean s(ExeViewActivity var0) {
      return var0.r;
   }

   private fi.polar.polarflow.ui.exeview.screenlock.c t() {
      return a(this.getFragmentManager());
   }

   // $FF: synthetic method
   static ShaderContainerView t(ExeViewActivity var0) {
      return var0.t;
   }

   private void u() {
      fi.polar.polarflow.ui.exeview.screenlock.c var1 = this.t();
      if (var1 != null) {
         var1.dismiss();
      }

   }

   // $FF: synthetic method
   static void u(ExeViewActivity var0) {
      var0.i();
   }

   private void v() {
      fi.polar.polarflow.ui.exeview.shader.j var1 = (fi.polar.polarflow.ui.exeview.shader.j)this.g.b(fi.polar.polarflow.ui.exeview.shader.p.c);
      if (var1 != null) {
         var1.i();
      }

   }

   // $FF: synthetic method
   static void v(ExeViewActivity var0) {
      var0.o();
   }

   private void w() {
      if (this.e_()) {
         this.c(false);
         this.u();
         this.v();
      }

   }

   // $FF: synthetic method
   static void w(ExeViewActivity var0) {
      var0.y();
   }

   // $FF: synthetic method
   static fi.polar.polarflow.ui.exeview.shader.q x(ExeViewActivity var0) {
      return var0.g;
   }

   private void x() {
      if (!this.e_()) {
         this.c(true);
         this.i(true);
         this.f.setCurrentItem(fi.polar.polarflow.ui.exeview.shader.p.c);
         this.v();
      }

   }

   private void y() {
      fi.polar.polarflow.ui.exeview.shader.p var1 = (fi.polar.polarflow.ui.exeview.shader.p)this.g.e();
      List var2 = this.z();
      this.g.a((List)var2);
      if (var2.contains(var1)) {
         this.f.a(var1, false);
      }

      if (!this.t.c()) {
         this.t.a();
      }

   }

   private List z() {
      ArrayList var1 = new ArrayList();
      if (this.u != null && this.u.h()) {
         var1.add(fi.polar.polarflow.ui.exeview.shader.p.b);
      }

      var1.add(fi.polar.polarflow.ui.exeview.shader.p.a);
      var1.add(fi.polar.polarflow.ui.exeview.shader.p.c);
      return var1;
   }

   public void a(Bundle var1) {
      super.a(var1);
      if (this.t != null && !this.t.c()) {
         this.t.d();
      }

      if (this.e != null) {
         a var2 = this.e.d();
         if (var2 == null) {
            fi.polar.polarflow.util.d.b("ExeViewActivity", "Current fragment is null -> do nothing");
            return;
         }

         if (this.c != null) {
            this.c.a(this.b());
         }

         if (this.b != null) {
            this.b.a(this.b());
         }

         if (var2.e() != ak.a) {
            a(var2, this.getFragmentManager());
         } else {
            var2.a_(var1);
         }

         Iterator var3 = this.e.c().iterator();

         while(var3.hasNext()) {
            a var4 = (a)var3.next();
            if (!var4.equals(var2)) {
               var4.a_(var1);
            }
         }

         this.r();
      }

      Iterator var5 = this.q().iterator();

      while(var5.hasNext()) {
         fi.polar.polarflow.ui.g var6 = (fi.polar.polarflow.ui.g)var5.next();
         if (var6 instanceof h) {
            ((h)var6).a_(var1);
         }
      }

      if (this.u != null) {
         this.u.a();
      }

   }

   public void a(fi.polar.polarflow.ui.exeview.shader.p var1, boolean var2) {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onSettingChanged(" + var1 + ", " + var2 + ")");
      switch(fi.polar.polarflow.ui.exeview.t.a[var1.ordinal()]) {
      case 1:
         this.t.d();
         break;
      case 2:
         fi.polar.polarflow.ui.exeview.screenlock.c var3 = this.t();
         if (var3 != null) {
            var3.a(var1, var2);
            this.v();
         } else {
            this.t.d();
            if (var2) {
               this.i(false);
            }
         }
         break;
      default:
         fi.polar.polarflow.util.d.f("ExeViewActivity", "did not expect onSettingChanged() with fragmentType=" + var1);
      }

   }

   public void a(boolean var1) {
      if (var1) {
         this.t.setShaderAccessLimit(61.0F);
      } else {
         this.t.setShaderAccessLimit(20.0F);
      }

   }

   public boolean a() {
      return this.l;
   }

   public void b(boolean var1) {
      this.l = var1;
      if (var1) {
         this.getWindow().addFlags(128);
      } else {
         this.getWindow().clearFlags(128);
      }

   }

   public void c() {
      super.c();
   }

   public void c(boolean var1) {
      this.m = var1;
   }

   public void d() {
      super.d();
      this.s();
      if (this.e != null) {
         if (this.c != null) {
            this.c.a(this.b());
         }

         if (this.b != null) {
            this.b.a(this.b());
         }

         a var1 = this.e.d();
         if (var1.e() != ak.a) {
            a(var1, this.getFragmentManager());
         } else {
            var1.d_();
         }

         Iterator var2 = this.e.c().iterator();

         while(var2.hasNext()) {
            a var3 = (a)var2.next();
            if (!var3.equals(var1)) {
               var3.a();
               var3.d_();
            }
         }
      }

      Iterator var5 = this.q().iterator();

      while(var5.hasNext()) {
         fi.polar.polarflow.ui.g var4 = (fi.polar.polarflow.ui.g)var5.next();
         if (var4 instanceof h) {
            ((h)var4).d_();
         }
      }

      if (this.u != null) {
         this.u.a(this.H);
      }

   }

   public boolean dispatchKeyEvent(KeyEvent var1) {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "dispatchKeyEvent KeyEvent: " + var1.toString());
      a var2 = this.e.d();
      boolean var3;
      if ((var2 == null || !var2.a(var1)) && !super.dispatchKeyEvent(var1)) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   public void e() {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "SummaryFragment onTouchDown:");
      if (this.q && !this.r) {
         this.o();
      }

   }

   public boolean e_() {
      return this.m;
   }

   public fi.polar.polarflow.util.a_package.b f() {
      return this.u;
   }

   protected void onCreate(Bundle var1) {
      boolean var2 = true;
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onCreate: savedInstanceState: " + var1);
      super.onCreate(var1);
      boolean var3;
      if (this.getIntent() != null && "ExeWaitActivity".equals(this.getIntent().getStringExtra("fi.polar.polarflow.extra.SENDER_CLASS_SIMPLE_NAME"))) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var5;
      if (var1 != null) {
         this.n = var1.getBoolean("allowBtnPress");
         this.b(var1.getBoolean("keepScreenOn"));
         this.c(var1.getBoolean("screenLockOn"));
      } else {
         if (this.F.getCurrentPhase() != null && var3) {
            this.a(0, true);
         }

         boolean var6;
         if (this.getIntent() != null && this.getIntent().getBooleanExtra("fi.polar.polarflow.extra.STARTED_FROM_POLAR_BUTTON", false)) {
            var6 = true;
         } else {
            var6 = false;
         }

         if (var3 && var6) {
            var5 = false;
         } else {
            var5 = true;
         }

         this.n = var5;
      }

      this.f_();
      this.z = (AlarmManager)this.getSystemService("alarm");
      Intent var4 = new Intent(this.getApplicationContext(), ExeViewActivity.class);
      var4.setAction("ExeViewActivity.action.AMBIENT_UPDATE");
      this.A = PendingIntent.getActivity(this.getApplicationContext(), 0, var4, 134217728);
      this.h = new IntentFilter();
      this.h.addAction("ExerciseLapCalc.ACTION_AUTO_LAP");
      this.h.addAction("ExerciseLapCalc.ACTION_MANUAL_LAP");
      this.h.addAction("ExercisePhaseCalc.ACTION_PHASE_FINISHED");
      this.h.addAction("TrainingService.action.TRAINING_PAUSED");
      this.h.addAction("TrainingService.action.TRAINING_RESUMED");
      this.h.addAction("TrainingService.action.TRAINING_STOPPED");
      this.h.addAction("ExerciseVolumeTargetCalc.action.TARGET_REACHED");
      this.h.addAction("ExercisePhaseCalc.ACTION_PHASE_ABOUT_TO_FINISH");
      this.h.addAction("ExercisePhaseCalc.ACTION_PHASE_FINISHED");
      this.h.addAction("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
      this.q = this.F.isPaused();
      f var8 = this.v;
      if (!this.q) {
         var5 = var2;
      } else {
         var5 = false;
      }

      var8.a((Activity)this, var5);
      this.setContentView(2130968619);
      this.b(var1);
      this.D = new n_PowerManagerHelper(this.getApplicationContext());
      this.u = fi.polar.polarflow.util.a_package.b.a((Context)this, (fi.polar.polarflow.ui.p)(new fi.polar.polarflow.ui.p()));
      this.C = new aa_TimeUtils();
      SportProfileSettings var7;
      if (this.A() != null) {
         var7 = this.A().getSettings();
      } else {
         var7 = null;
      }

      if (var3 && var7 != null && var7.isSwimmingSport()) {
         this.x();
      }

   }

   protected void onDestroy() {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "OnDestroy");
      this.s();
      super.onDestroy();
   }

   public void onEnterAnimationComplete() {
      super.onEnterAnimationComplete();
      fi.polar.polarflow.ui.o.b(this, "ExeViewActivity.action.ENTER_ANIMATION_COMPLETE");
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      fi.polar.polarflow.util.d.d("ExeViewActivity", "onKeyDown keyCode: " + KeyEvent.keyCodeToString(var1) + " event:" + var2.getAction());
      boolean var4;
      if (var1 == 265) {
         if (!this.t.c()) {
            this.t.d();
         }

         this.v.a(var2.getRepeatCount());
         if (var2.getRepeatCount() != 0) {
            var4 = var3;
            if (var2.getRepeatCount() <= 0) {
               return var4;
            }

            var4 = var3;
            if (!this.n) {
               return var4;
            }
         }

         if (this.p == 0L) {
            this.p = var2.getEventTime();
            fi.polar.polarflow.ui.o.a((Context)this.getApplicationContext(), 30);
         }

         long var5 = var2.getEventTime();
         long var7 = this.p;
         if (!this.q) {
            var4 = var3;
            if (var5 - var7 >= 1000L) {
               this.w();
               fi.polar.polarflow.ui.o.a((Context)this.getApplicationContext(), 30);
               this.o = true;
               this.s = this.e.e();
               fi.polar.polarflow.ui.o.c(this.getApplicationContext(), "TrainingService.action.PAUSE_SESSION");
               var4 = var3;
            }
         } else {
            this.w();
            this.p();
            this.g(true);
            var4 = var3;
         }
      } else {
         var4 = super.onKeyDown(var1, var2);
      }

      return var4;
   }

   public boolean onKeyUp(int var1, KeyEvent var2) {
      boolean var3 = true;
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onKeyUp keyCode: " + KeyEvent.keyCodeToString(var1) + " event:" + var2.getAction());
      if (var1 == 265) {
         this.p = 0L;
         if (this.q) {
            this.g(false);
         }

         this.v.a();
         this.n = true;
         this.o = false;
      } else {
         var3 = super.onKeyUp(var1, var2);
      }

      return var3;
   }

   public void onNewIntent(Intent var1) {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onNewIntent: " + var1.toString());
      super.onNewIntent(var1);
      this.setIntent(var1);
      if ("ExeViewActivity.action.AMBIENT_UPDATE".equals(var1.getAction())) {
         a var2 = this.e.d();
         if (var2 != null) {
            this.r();
            var2.a();
         }
      } else {
         this.v.a(var1);
      }

   }

   public void onPause() {
      super.onPause();
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onPause");
      android.support.v4.c.g.a(this.getApplicationContext()).a(this.G);
      if (this.u != null) {
         this.u.a();
      }

   }

   protected void onPostResume() {
      super.onPostResume();
      if (this.D.a_isPowerSaveMode() && this.F.isSensorEnabled(4)) {
         this.g();
      } else {
         this.h();
      }

   }

   protected void onRestart() {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onRestart()");
      super.onRestart();
      DialogFragment var1 = (DialogFragment)this.getFragmentManager().findFragmentByTag("gps_is_off_dialog");
      if (var1 != null) {
         fi.polar.polarflow.util.d.c("ExeViewActivity", "recreate GpsIsOffDialogFragment: ");
         var1.dismiss();
         (new al()).show(this.getFragmentManager(), "gps_is_off_dialog");
      }

      this.n();
   }

   protected void onRestoreInstanceState(Bundle var1) {
      super.onRestoreInstanceState(var1);
      this.q = var1.getBoolean("sessionPaused");
      if (this.q) {
         this.i();
         if (ak.f == this.d.getCurrentItemType()) {
            this.j.setX(178.0F);
            this.j.setVisibility(0);
         }
      } else {
         this.j.setVisibility(8);
      }

   }

   public void onResume() {
      super.onResume();
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onResume");
      if (this.F.isRunning()) {
         android.support.v4.c.g.a(this.getApplicationContext()).a(this.G, this.h);
         boolean var1 = this.F.isPaused();
         boolean var2;
         if (this.e.b(ak.b) == -1) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (var1 != var2) {
            if (var1) {
               this.d.setCurrentItem(ak.a);
               this.k();
            } else {
               this.l();
            }
         }

         if (!var1) {
            ExercisePhase var3 = this.F.getCurrentPhase();
            if (var3 != null && var3.getStartTime() == -1L) {
               this.a(this.F.getTrainingPhase().getNumber() - 1, true);
            }
         }

         if (this.u != null && !this.b()) {
            this.u.a(this.H);
         }
      } else {
         this.finish();
      }

   }

   protected void onSaveInstanceState(Bundle var1) {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onSaveInstanceState()");
      var1.putSerializable("currentFragmentType", this.d.getCurrentItemType());
      var1.putBoolean("allowBtnPress", this.n);
      var1.putBoolean("sessionPaused", this.q);
      var1.putBoolean("keepScreenOn", this.l);
      var1.putBoolean("screenLockOn", this.m);
      super.onSaveInstanceState(var1);
   }

   protected void onStop() {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onStop");
      this.s();
      this.t.b();
      super.onStop();
   }
}
