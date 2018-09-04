package fi.polar.polarflow.ui.exeview.summary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.ei;
import android.support.wearable.view.bd;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import fi.polar.polarflow.ui.exeview.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class d extends fi.polar.polarflow.ui.exeview.a implements bd {
   private final List e = new ArrayList();
   private f f;
   private fi.polar.polarflow.ui.exeview.d g;
   private int h = 0;

   public d() {
      super(ak.f);
   }

   // $FF: synthetic method
   static f a(d var0) {
      return var0.f;
   }

   public void a(int var1) {
      if (var1 == 0) {
         if (this.g != null) {
            this.g.a(true);
         }
      } else if (this.h == 0 && this.g != null) {
         this.g.a(false);
      }

      this.h = var1;
   }

   protected void a(Intent var1) {
      Iterator var2 = this.e.iterator();

      while(var2.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.summary.a_package.d)var2.next()).a((Intent)var1);
      }

   }

   protected void a(fi.polar.polarflow.ui.exeview.c var1) {
      var1.a("TrainingService.action.TRAINING_STARTED", true);
      var1.a("TrainingService.action.TRAINING_STOPPED", true);
      var1.a("TrainingService.action.TRAINING_PAUSED", true);
      var1.a("TrainingService.action.TRAINING_RESUMED", true);
      var1.a("fi.polar.polarflow.ACTION_LOCATION_DATA", false);
      var1.a("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED", false);
      var1.a("fi.polar.polarflow.ACTION_HR_DATA", false);
      var1.a("fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA", false);
      var1.a("DailyActivityService.action.TRAINING_LOAD_DATA", false);
      var1.a("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA", false);
   }

   public void a(Collection var1) {
      Iterator var2 = this.e.iterator();

      while(var2.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.summary.a_package.d)var2.next()).a((Collection)var1);
      }

   }

   public void a_(Bundle var1) {
      super.a_(var1);
      Iterator var2 = this.e.iterator();

      while(var2.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.summary.a_package.d)var2.next()).a_(var1);
      }

   }

   public void c() {
      super.c();
      Iterator var1 = this.e.iterator();

      while(var1.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.summary.a_package.d)var1.next()).d();
      }

   }

   public void d_() {
      Iterator var1 = this.e.iterator();

      while(var1.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.summary.a_package.d)var1.next()).d_();
      }

      super.d_();
   }

   public void onAttach(Context var1) {
      super.onAttach(var1);
      Activity var2 = this.getActivity();

      try {
         this.f = (f)var2;
         this.g = (fi.polar.polarflow.ui.exeview.d)var2;
      } catch (ClassCastException var3) {
         throw new ClassCastException(var2.toString() + " must implement OnTouchDownListener and OnTopViewCenteredListener");
      }
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      fi.polar.polarflow.util.d.c("SummaryFragment", "onCreateView()");
      ContextThemeWrapper var4;
      if (((android.support.wearable.activity.a)this.getActivity()).b()) {
         var4 = new ContextThemeWrapper(this.getActivity(), 2131427623);
      } else {
         var4 = new ContextThemeWrapper(this.getActivity(), 2131427636);
      }

      return var1.cloneInContext(var4).inflate(2130968627, var2, false);
   }

   public void onDestroyView() {
      fi.polar.polarflow.util.d.c("SummaryFragment", "onDestroyView()");
      Iterator var1 = this.e.iterator();

      while(var1.hasNext()) {
         ((fi.polar.polarflow.ui.exeview.summary.a_package.d)var1.next()).b();
      }

      super.onDestroyView();
   }

   public void onDetach() {
      super.onDetach();
      fi.polar.polarflow.util.d.c("SummaryFragment", "onDetach()");
      this.f = null;
      this.g = null;
   }

   public void onViewCreated(View var1, Bundle var2) {
      fi.polar.polarflow.util.d.c("SummaryFragment", "onViewCreated()");
      super.onViewCreated(var1, var2);
      this.e.clear();
      this.e.addAll(fi.polar.polarflow.ui.exeview.summary.h.a(this.f(), var1.getContext()));
      this.a = (BetterWearableListView)var1.findViewById(2131755173);
      this.a.setAdapter(new b(var1.getContext(), this.e));
      this.a.a((bd)this);
      this.a.a((ei)(new e(this)));
   }
}
