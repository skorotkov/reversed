package fi.polar.polarflow.ui.exeview.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.bd;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.data.SportProfileDisplaySettings;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import fi.polar.polarflow.ui.exeview.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class b extends fi.polar.polarflow.ui.exeview.a implements bd {
   private final List e = new ArrayList();
   private int f = 0;
   private fi.polar.polarflow.ui.exeview.d g;

   public b() {
      super(ak.b);
   }

   private SportProfileDisplaySettings h() {
      SportProfile var1 = this.f();
      SportProfileDisplaySettings var2;
      if (var1 == null) {
         var2 = null;
      } else {
         var2 = var1.getDisplaySettings();
      }

      return var2;
   }

   public void a(int var1) {
      if (var1 == 0) {
         if (this.g != null) {
            this.g.a(true);
         }
      } else if (this.f == 0 && this.g != null) {
         this.g.a(false);
      }

      this.f = var1;
   }

   protected void a(Intent var1) {
      Iterator var2 = this.e.iterator();

      while(var2.hasNext()) {
         ((a)var2.next()).a(var1);
      }

   }

   protected void a(fi.polar.polarflow.ui.exeview.c var1) {
      var1.a("TrainingService.action.TRAINING_STARTED", true);
      var1.a("TrainingService.action.TRAINING_STOPPED", true);
      var1.a("TrainingService.action.TRAINING_PAUSED", true);
      var1.a("TrainingService.action.TRAINING_RESUMED", true);
      var1.a("fi.polar.polarflow.ACTION_HR_DATA", false);
      var1.a("fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA", false);
      var1.a("fi.polar.polarflow.ACTION_LOCATION_DATA", false);
      var1.a("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED", false);
      var1.a("ExerciseLapCalc.ACTION_AUTO_LAP", false);
      var1.a("ExerciseLapCalc.ACTION_AUTO_LAP_DATA_HR", false);
      var1.a("ExerciseLapCalc.ACTION_AUTO_LAP_DATA_GPS", false);
      var1.a("ExerciseLapCalc.ACTION_AUTO_LAP_DATA_RUNNING_CADENCE", false);
      var1.a("DailyActivityService.action.TRAINING_LOAD_DATA", false);
      var1.a("ExerciseLapCalc.ACTION_MANUAL_LAP", false);
      var1.a("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS", false);
      var1.a("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_HR", false);
      var1.a("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_RUNNING_CADENCE", false);
      var1.a("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA", false);
      var1.a("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_REST_TIME_START", false);
   }

   public void a(Collection var1) {
      Iterator var2 = this.e.iterator();

      while(var2.hasNext()) {
         ((a)var2.next()).a(var1);
      }

   }

   public void a_(Bundle var1) {
      super.a_(var1);
      Iterator var2 = this.e.iterator();

      while(var2.hasNext()) {
         ((a)var2.next()).a_(var1);
      }

   }

   public void c() {
      super.c();
      Iterator var1 = this.e.iterator();

      while(var1.hasNext()) {
         ((a)var1.next()).d();
      }

   }

   public void d_() {
      Iterator var1 = this.e.iterator();

      while(var1.hasNext()) {
         ((a)var1.next()).d_();
      }

      super.d_();
   }

   public void onAttach(Context var1) {
      super.onAttach(var1);
      Activity var2 = this.getActivity();

      try {
         this.g = (fi.polar.polarflow.ui.exeview.d)var2;
      } catch (ClassCastException var3) {
         throw new ClassCastException(var2.toString() + " must implement OnTopViewCenteredListener");
      }
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      fi.polar.polarflow.util.d.c("DisplayFragment", "onCreateView()");
      ContextThemeWrapper var4;
      if (((android.support.wearable.activity.a)this.getActivity()).b()) {
         var4 = new ContextThemeWrapper(this.getActivity(), 2131427623);
      } else {
         var4 = new ContextThemeWrapper(this.getActivity(), 2131427622);
      }

      return var1.cloneInContext(var4).inflate(2130968620, var2, false);
   }

   public void onDestroyView() {
      Iterator var1 = this.e.iterator();

      while(var1.hasNext()) {
         ((a)var1.next()).b();
      }

      super.onDestroyView();
   }

   public void onDetach() {
      super.onDetach();
      fi.polar.polarflow.util.d.c("DisplayFragment", "onDetach()");
      this.g = null;
   }

   public void onResume() {
      super.onResume();
      this.a.a_(this.f);
   }

   public void onViewCreated(View var1, Bundle var2) {
      fi.polar.polarflow.util.d.c("DisplayFragment", "onViewCreated()");
      super.onViewCreated(var1, var2);
      this.e.clear();
      this.e.addAll(fi.polar.polarflow.ui.exeview.a.e.a(this.h()));
      this.a = (BetterWearableListView)var1.findViewById(2131755173);
      this.a.setGreedyTouchMode(true);
      this.a.a((bd)this);
      this.a.setAdapter(new c(var1.getContext(), this.e));
   }
}
