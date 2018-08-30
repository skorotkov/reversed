package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.data.Lap;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapSummary;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapSummary$Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

abstract class ExerciseLaps extends ProtoPublishableEntity {
   private static final String TAG = ExerciseLaps.class.getSimpleName();
   private long exercise;
   @Ignore
   private long mDurationSum = 0L;
   @Ignore
   private Exercise mExercise;
   @Ignore
   final List mLapDataList;
   @Ignore
   private boolean mLapDataListLoadedFromDb = false;
   private long summaryAvgLapDuration = -1L;
   private long summaryBestLapDuration = Long.MAX_VALUE;

   ExerciseLaps() {
      this.path = "";
      this.mLapDataList = Collections.synchronizedList(new ArrayList());
   }

   private Exercise getExercise() {
      return this.mExercise;
   }

   private void loadLapDataList() {
      if (!this.mLapDataListLoadedFromDb && this.getExerciseId() > 0L) {
         this.mLapDataList.addAll(LapData.find(LapData.class, this.getWhereClause(), new String[]{String.valueOf(this.getExerciseId())}));
         this.mLapDataListLoadedFromDb = true;
      }

   }

   private void updatePath() {
      if (this.getExercise() == null) {
         d.c(TAG, "", new IllegalStateException("No Exercise entity associated or loaded, cannot create path."));
      } else {
         this.path = this.getExercise().getPath();
      }

   }

   public void addAllLaps(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         this.addLap(new LapData((Lap)var2.next()));
      }

   }

   void addLap(LapData param1) {
      // $FF: Couldn't be decompiled
   }

   ExerciseLap$PbLapSummary buildLapSummary() {
      ExerciseLap$PbLapSummary$Builder var1 = ExerciseLap$PbLapSummary.newBuilder();
      if (this.summaryAvgLapDuration != -1L) {
         var1.setAverageLapDuration(q.b(this.summaryAvgLapDuration));
      }

      if (this.summaryBestLapDuration != Long.MAX_VALUE) {
         var1.setBestLapDuration(q.b(this.summaryBestLapDuration));
      }

      return var1.build();
   }

   List cloneLapDataList() {
      // $FF: Couldn't be decompiled
   }

   long getExerciseId() {
      return this.exercise;
   }

   public int getLapCount() {
      return this.getLapDataList().size();
   }

   List getLapDataList() {
      this.loadLapDataList();
      return this.mLapDataList;
   }

   public String getPath() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      return this.path;
   }

   public long getSummaryAvgLapDuration() {
      return this.summaryAvgLapDuration;
   }

   public long getSummaryBestLapDuration() {
      return this.summaryBestLapDuration;
   }

   abstract String getWhereClause();

   public long save() {
      // $FF: Couldn't be decompiled
   }

   public void setExercise(Exercise var1) {
      this.mExercise = var1;
      this.updatePath();
   }

   void setSummaryAvgLapDuration(long var1) {
      this.summaryAvgLapDuration = var1;
   }

   void setSummaryBestLapDuration(long var1) {
      this.summaryBestLapDuration = var1;
   }
}
