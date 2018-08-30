package fi.polar.polarflow.ui.exeview.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.bd;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.ExerciseTarget;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import fi.polar.polarflow.ui.exeview.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class g extends fi.polar.polarflow.ui.exeview.a implements bd {
   private static final String e = g.class.getSimpleName();
   private fi.polar.polarflow.ui.exeview.d f;
   private i g;
   private final List h = new ArrayList();
   private Training i = Training.getInstance();
   private int j = 0;

   public g() {
      super(ak.c);
   }

   private void h() {
      h var1 = ((fi.polar.polarflow.ui.exeview.target.a.n)this.h.get(0)).f();
      if (var1 == fi.polar.polarflow.ui.exeview.target.h.d || var1 == fi.polar.polarflow.ui.exeview.target.h.e) {
         if (this.i.getCurrentPhase() != null) {
            int var2 = this.i.getCurrentPhase().getGoalType();
            h var3 = fi.polar.polarflow.ui.exeview.target.h.h;
            h var4;
            if (var2 == 1 && var1 == fi.polar.polarflow.ui.exeview.target.h.e) {
               var4 = fi.polar.polarflow.ui.exeview.target.h.d;
            } else {
               var4 = var3;
               if (var2 == 2) {
                  var4 = var3;
                  if (var1 == fi.polar.polarflow.ui.exeview.target.h.d) {
                     var4 = fi.polar.polarflow.ui.exeview.target.h.e;
                  }
               }
            }

            if (var4 != fi.polar.polarflow.ui.exeview.target.h.h) {
               this.g.a(0, k.a(this.i, var4, (List)null, 0));
            }
         } else {
            this.g.e(0);
         }
      }

   }

   private ExerciseTarget i() {
      TrainingSessionTarget var1 = this.i.getTrainingSessionTarget();
      ExerciseTarget var2;
      if (var1 == null) {
         fi.polar.polarflow.util.d.f(e, "Training instance has no TrainingSessionTarget!");
         var2 = null;
      } else {
         var2 = var1.getExerciseTarget();
      }

      return var2;
   }

   public void a(int var1) {
      if (var1 == 0) {
         if (this.f != null) {
            this.f.a(true);
         }
      } else if (this.j == 0 && this.f != null) {
         this.f.a(false);
      }

      this.j = var1;
   }

   protected void a(Intent var1) {
      if ("ExercisePhaseCalc.ACTION_PHASE_FINISHED".equals(var1.getAction())) {
         this.h();
      }

      Iterator var2 = this.h.iterator();

      while(var2.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.target.a.n)var2.next()).a((Intent)var1);
      }

   }

   protected void a(fi.polar.polarflow.ui.exeview.c var1) {
      var1.a("fi.polar.polarflow.ACTION_LOCATION_DATA", false);
      var1.a("DailyActivityService.action.TRAINING_LOAD_DATA", false);
      var1.a("ExerciseVolumeTargetCalc.action.TARGET_REACHED", false);
      var1.a("fi.polar.polarflow.ACTION_HR_DATA", false);
      var1.a("ExercisePhaseCalc.ACTION_PHASE_CURRENT_DATA", false);
      var1.a("ExercisePhaseCalc.ACTION_PHASE_FINISHED", true);
      var1.addAction("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA");
   }

   public void a(Collection var1) {
      Iterator var2 = this.h.iterator();

      while(var2.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.target.a.n)var2.next()).a((Collection)var1);
      }

   }

   public void a_(Bundle var1) {
      Iterator var2 = this.h.iterator();

      while(var2.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.target.a.n)var2.next()).a_(var1);
      }

      super.a_(var1);
   }

   public void c() {
      super.c();
      Iterator var1 = this.h.iterator();

      while(var1.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.target.a.n)var1.next()).d();
      }

   }

   public void d_() {
      Iterator var1 = this.h.iterator();

      while(var1.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.target.a.n)var1.next()).d_();
      }

      super.d_();
   }

   public void onAttach(Context var1) {
      super.onAttach(var1);
      Activity var4 = this.getActivity();

      try {
         this.f = (fi.polar.polarflow.ui.exeview.d)var4;
      } catch (ClassCastException var3) {
         throw new ClassCastException(var4.toString() + " must implement OnTopViewCenteredListener");
      }
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      fi.polar.polarflow.util.d.c(e, "onCreateView()");
      boolean var4 = ((android.support.wearable.activity.a)this.getActivity()).b();
      Activity var6 = this.getActivity();
      int var5;
      if (var4) {
         var5 = 2131427623;
      } else {
         var5 = 2131427622;
      }

      return var1.cloneInContext(new ContextThemeWrapper(var6, var5)).inflate(2130968629, var2, false);
   }

   public void onDestroyView() {
      fi.polar.polarflow.util.d.c(e, "onDestroyView()");
      Iterator var1 = this.h.iterator();

      while(var1.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.target.a.n)var1.next()).b();
      }

      super.onDestroyView();
   }

   public void onDetach() {
      super.onDetach();
      fi.polar.polarflow.util.d.c(e, "onDetach()");
      this.f = null;
   }

   public void onResume() {
      super.onResume();
      this.a.a_(this.j);
      this.h();
   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      fi.polar.polarflow.util.d.c(e, "onViewCreated");
      this.h.clear();
      this.h.addAll(k.a(this.i, this.i(), this.i.getCurrentPhase()));
      this.a = (BetterWearableListView)var1.findViewById(2131755173);
      this.a.setGreedyTouchMode(true);
      this.g = new i(var1.getContext(), this.h);
      this.a.setAdapter(this.g);
      this.a.a((bd)this);
   }

   public void setUserVisibleHint(boolean var1) {
      super.setUserVisibleHint(var1);
      if (!var1 && this.a != null) {
         this.a.a_(0);
      }

   }
}
