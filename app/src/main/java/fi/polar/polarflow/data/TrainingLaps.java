package fi.polar.polarflow.data;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v4.c.g;
import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.ExerciseAutoLaps;
import fi.polar.polarflow.data.orm.ExerciseManualLaps;
import fi.polar.polarflow.util.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrainingLaps {
   private static final String[] LAP_ACTIONS = new String[]{"ExerciseLapCalc.ACTION_AUTO_LAP", "ExerciseLapCalc.ACTION_MANUAL_LAP", "ExerciseLapCalc.ACTION_AUTO_LAP_DATA_HR", "ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_HR", "ExerciseLapCalc.ACTION_AUTO_LAP_DATA_GPS", "ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS", "ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_RUNNING_CADENCE", "ExerciseLapCalc.ACTION_AUTO_LAP_DATA_RUNNING_CADENCE"};
   private static final String TAG = "TrainingLaps";
   private final List mAutoLaps;
   private Exercise mExercise;
   private ExerciseAutoLaps mExerciseAutoLaps;
   private ExerciseManualLaps mExerciseManualLaps;
   private g mLocalBroadcastManager = null;
   private final List mManualLaps;
   private final BroadcastReceiver mReceiver = new TrainingLaps$1(this);

   TrainingLaps(int var1) {
      if (var1 != 1) {
         this.mAutoLaps = Collections.synchronizedList(new ArrayList(999));
      } else {
         this.mAutoLaps = Collections.emptyList();
      }

      this.mManualLaps = Collections.synchronizedList(new ArrayList(999));
   }

   // $FF: synthetic method
   static List access$000(TrainingLaps var0) {
      return var0.mAutoLaps;
   }

   // $FF: synthetic method
   static List access$100(TrainingLaps var0) {
      return var0.mManualLaps;
   }

   public List createDataLayerRequests() {
      ArrayList var1 = new ArrayList();
      if (this.mExerciseAutoLaps != null) {
         var1.add(this.mExerciseAutoLaps.createDataLayerRequest());
      }

      if (this.mExerciseManualLaps != null) {
         var1.add(this.mExerciseManualLaps.createDataLayerRequest());
      }

      return var1;
   }

   List getAutoLaps() {
      return this.mAutoLaps;
   }

   List getManualLaps() {
      return this.mManualLaps;
   }

   public void save() {
      // $FF: Couldn't be decompiled
   }

   void setExercise(Exercise var1) {
      this.mExercise = var1;
   }

   void setLocalBroadcastManager(g var1) {
      if (this.mLocalBroadcastManager != null) {
         this.mLocalBroadcastManager.a(this.mReceiver);
      }

      this.mLocalBroadcastManager = var1;
      if (this.mLocalBroadcastManager != null) {
         IntentFilter var2 = new IntentFilter();
         var2.addAction("ExerciseLapCalc.ACTION_AUTO_LAP");
         var2.addAction("ExerciseLapCalc.ACTION_MANUAL_LAP");
         this.mLocalBroadcastManager.a(this.mReceiver, var2);
      }

   }

   void startSession() {
      v.a().a(LAP_ACTIONS);
   }

   void stopSession() {
      if (this.mLocalBroadcastManager != null) {
         this.mLocalBroadcastManager.a(this.mReceiver);
         this.mLocalBroadcastManager = null;
      }

   }
}
