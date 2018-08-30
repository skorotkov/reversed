package fi.polar.polarflow.ui.exeview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.ui.custom.CircularProgressBar;
import fi.polar.polarflow.ui.exeview.summary.SummaryActivity;
import java.util.Collection;

public class ab extends a implements fi.polar.polarflow.ui.u {
   private View e;
   private CircularProgressBar f;
   private FrameLayout g;
   private View h;
   private View i;
   private View j;
   private boolean k = false;
   private boolean l = false;
   private boolean m = false;
   private boolean n = false;
   private Activity o;
   private final ValueAnimator p = new ValueAnimator();
   private final ValueAnimator q = new ValueAnimator();
   private final AnimatorSet r = new AnimatorSet();
   private d s;
   private final AnimatorUpdateListener t = new ag(this);
   private final AnimatorUpdateListener u = new ah(this);
   private final AnimatorListener v = new ai(this);

   public ab() {
      super(ak.a);
      this.m();
   }

   // $FF: synthetic method
   static void a(ab var0) {
      var0.u();
   }

   // $FF: synthetic method
   static boolean a(ab var0, boolean var1) {
      var0.l = var1;
      return var1;
   }

   // $FF: synthetic method
   static View b(ab var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static boolean b(ab var0, boolean var1) {
      var0.m = var1;
      return var1;
   }

   // $FF: synthetic method
   static AnimatorSet c(ab var0) {
      return var0.r;
   }

   // $FF: synthetic method
   static void d(ab var0) {
      var0.t();
   }

   // $FF: synthetic method
   static View e(ab var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static View f(ab var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static View g(ab var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static boolean h(ab var0) {
      return var0.k;
   }

   // $FF: synthetic method
   static void i(ab var0) {
      var0.v();
   }

   // $FF: synthetic method
   static void j(ab var0) {
      var0.x();
   }

   // $FF: synthetic method
   static void k(ab var0) {
      var0.r();
   }

   private void m() {
      this.p.addListener(this.v);
      this.p.addUpdateListener(this.t);
      this.p.setDuration(600L);
      this.q.addListener(this.v);
      this.q.addUpdateListener(this.u);
      this.q.setDuration(600L);
      this.r.playTogether(new Animator[]{this.p, this.q});
   }

   private void n() {
      if (!this.r.isStarted()) {
         this.p.setFloatValues(new float[]{1.0F, 0.0F});
         this.q.setFloatValues(new float[]{0.0F, 1.0F});
         this.r.cancel();
         this.r.start();
      }

   }

   private void o() {
      if (!this.r.isStarted()) {
         this.p.setFloatValues(new float[]{0.0F, 1.0F});
         this.q.setFloatValues(new float[]{1.0F, 0.0F});
         this.r.cancel();
         this.r.start();
      }

   }

   private void p() {
      if (this.f == null && this.getView() != null) {
         this.f = (CircularProgressBar)((ViewStub)this.getView().findViewById(2131755188)).inflate();
         this.f.setAnimatorListener(new aj(this));
      }

   }

   private void q() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "startProgressAnimation");
      this.p();
      this.f.setVisibility(0);
      this.f.a();
   }

   private void r() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "stopProgressAnimation");
      this.p();
      this.f.setVisibility(8);
      this.f.b();
      this.m = false;
      this.e.animate().cancel();
      this.e.setClickable(true);
      this.e.setVisibility(0);
   }

   private void s() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "reverseProgressAnimation");
      this.p();
      this.f.c();
   }

   private void t() {
      this.k = false;
      this.h.setClickable(true);
      this.s.a(true);
      this.o();
   }

   private void u() {
      this.k = true;
      this.s.a(false);
      this.n();
   }

   private void v() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "queryShortSessionSave()");
      an var1 = (new fi.polar.polarflow.ui.t()).b(this.getString(2131230910)).b();
      var1.a(this);
      var1.show(this.getFragmentManager(), "short_session_save_dialog");
   }

   private void w() {
      Intent var1 = new Intent("TrainingService.action.STOP_SESSION");
      var1.putExtra("TrainingService.key.SKIP_SESSION_SAVE", true);
      fi.polar.polarflow.ui.o.a((Context)this.getActivity(), (Intent)var1);
      this.n = true;
   }

   private void x() {
      Activity var1 = this.y();
      Intent var2 = new Intent(var1.getApplicationContext(), SummaryActivity.class);
      var2.putExtra(SummaryActivity.a, Training.getInstance().getStartTime());
      var2.putExtra(SummaryActivity.b, true);
      var2.putExtra(SummaryActivity.c, fi.polar.polarflow.ui.exeview.summary.h.a(Training.getInstance()));
      var1.startActivity(var2);
      var1.overridePendingTransition(2131034134, 2131034128);
      var1.finishAfterTransition();
      fi.polar.polarflow.ui.o.b(var1, "TrainingService.action.STOP_SESSION");
      this.n = true;
   }

   private Activity y() {
      Activity var1;
      if (this.o != null) {
         var1 = this.o;
      } else {
         var1 = this.getActivity();
      }

      return var1;
   }

   protected void a(Intent var1) {
   }

   protected void a(c var1) {
   }

   public void a(fi.polar.polarflow.ui.q var1) {
      this.x();
   }

   public void a(Collection var1) {
   }

   public void a_(Bundle var1) {
      super.a_(var1);
      if (this.f != null) {
         this.j();
      }

   }

   public void b(fi.polar.polarflow.ui.q var1) {
      this.w();
   }

   public void c(fi.polar.polarflow.ui.q var1) {
      this.w();
   }

   public void d(fi.polar.polarflow.ui.q var1) {
   }

   public boolean g() {
      boolean var1;
      if (this.i.getVisibility() == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected void h() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "cancelStopButtonPress");
      if (this.g.isPressed()) {
         this.j();
      }

   }

   protected void i() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "startStopAnimation, mTrainingStopping:" + this.l);
      if (!this.l && !this.m) {
         this.g.setPressed(true);
         this.q();
         this.m = true;
         this.e.setVisibility(4);
         this.e.setClickable(false);
      }

   }

   protected void j() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "stopStopAnimation, mTrainingStopping:" + this.l);
      if (!this.l) {
         this.g.setPressed(false);
         this.m = false;
         this.s();
      }

   }

   protected void k() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "onPauseSession");
      if (!this.k) {
         this.u();
      }

   }

   protected void l() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "onResumeSession");
      if (this.k) {
         this.t();
      }

   }

   public void onAttach(Context var1) {
      super.onAttach(var1);
      Activity var4 = this.getActivity();

      try {
         this.s = (d)var4;
      } catch (ClassCastException var3) {
         throw new ClassCastException(var4.toString() + " must implement OnTopViewCenteredListener");
      }
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return var1.inflate(2130968624, var2, false);
   }

   public void onDetach() {
      super.onDetach();
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "onDetach()");
      this.s = null;
   }

   public void onPause() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "onPause()");
      super.onPause();
      if (this.f != null) {
         this.j();
      }

   }

   public void onSaveInstanceState(Bundle var1) {
      var1.putFloat("resumeStopLayoutX", this.j.getTranslationX());
      super.onSaveInstanceState(var1);
   }

   public void onStop() {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "onStop()");
      super.onStop();
      if (this.l) {
         if (!this.n) {
            this.w();
         }

         if (!this.getActivity().isFinishing()) {
            this.getActivity().finish();
         }
      }

   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "onViewCreated");
      var1.setZ(1000.0F);
      this.h = var1.findViewById(2131755184);
      this.h.setOnClickListener(new ac(this));
      this.e = var1.findViewById(2131755190);
      this.e.setOnClickListener(new ad(this));
      this.g = (FrameLayout)var1.findViewById(2131755191);
      this.g.setOnTouchListener(new ae(this));
      this.i = var1.findViewById(2131755183);
      this.j = var1.findViewById(2131755186);
      af var3 = new af(this);
      this.e.setOutlineProvider(var3);
      var1.findViewById(2131755192).setOutlineProvider(var3);
      if (Training.getInstance().isPaused()) {
         fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "Training is paused, resuming paused state.");
         this.k = true;
         this.j.animate().cancel();
         if (var2 != null) {
            this.j.setTranslationX(var2.getFloat("resumeStopLayoutX"));
         }

         this.j.setVisibility(0);
         this.i.setVisibility(4);
      } else {
         this.k = false;
         this.h.setClickable(true);
         this.j.setVisibility(4);
         this.i.setVisibility(0);
      }

   }
}
