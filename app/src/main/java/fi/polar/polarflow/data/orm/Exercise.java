package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.dsl.Unique;
import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.Structures$PbRunningIndex;
import fi.polar.remote.representation.protobuf.Structures$PbRunningIndex$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbSportIdentifier;
import fi.polar.remote.representation.protobuf.Structures$PbTrainingLoad;
import fi.polar.remote.representation.protobuf.Structures$PbTrainingLoad$Builder;
import fi.polar.remote.representation.protobuf.Training$PbExerciseBase;
import fi.polar.remote.representation.protobuf.Training$PbExerciseBase$Builder;
import java.io.InputStream;
import java.util.List;

public class Exercise extends ProtoPublishableEntity implements Mergeable {
   private static final String TAG = Exercise.class.getSimpleName();
   private float ascent;
   private int calories;
   private float descent;
   private float distance;
   private long duration;
   private int exerciseIndex;
   private int fatConsumption;
   private long recoveryTime;
   private int runningIndex;
   private long runningIndexTime;
   private long sport;
   @Unique
   private long startTime;
   private int trainingLoad;
   public TrainingSession trainingSession;

   public Exercise() {
      this.startTime = 0L;
      this.duration = 0L;
      this.sport = -2L;
      this.distance = -1.0F;
      this.calories = -1;
      this.trainingLoad = -1;
      this.recoveryTime = -1L;
      this.fatConsumption = -1;
      this.runningIndex = -1;
      this.runningIndexTime = 0L;
      this.exerciseIndex = 0;
      this.ascent = -1.0F;
      this.descent = -1.0F;
   }

   public Exercise(long var1) {
      this.startTime = 0L;
      this.duration = 0L;
      this.sport = -2L;
      this.distance = -1.0F;
      this.calories = -1;
      this.trainingLoad = -1;
      this.recoveryTime = -1L;
      this.fatConsumption = -1;
      this.runningIndex = -1;
      this.runningIndexTime = 0L;
      this.exerciseIndex = 0;
      this.ascent = -1.0F;
      this.descent = -1.0F;
      this.startTime = var1;
   }

   public Exercise(long var1, long var3) {
      this.startTime = 0L;
      this.duration = 0L;
      this.sport = -2L;
      this.distance = -1.0F;
      this.calories = -1;
      this.trainingLoad = -1;
      this.recoveryTime = -1L;
      this.fatConsumption = -1;
      this.runningIndex = -1;
      this.runningIndexTime = 0L;
      this.exerciseIndex = 0;
      this.ascent = -1.0F;
      this.descent = -1.0F;
      this.startTime = var1;
      this.sport = var3;
   }

   public Exercise(Training$PbExerciseBase var1) {
      this();
      if (var1.hasStart()) {
         this.startTime = q.b(var1.getStart());
      }

      if (var1.hasDuration()) {
         this.duration = q.a(var1.getDuration());
      }

      if (var1.hasSport()) {
         Structures$PbSportIdentifier var2 = var1.getSport();
         if (var2.hasValue()) {
            this.sport = var2.getValue();
         }
      }

      if (var1.hasDistance()) {
         this.distance = var1.getDistance();
      }

      if (var1.hasCalories()) {
         this.calories = var1.getCalories();
      }

      if (var1.hasTrainingLoad()) {
         Structures$PbTrainingLoad var3 = var1.getTrainingLoad();
         if (var3.hasTrainingLoadVal()) {
            this.trainingLoad = var3.getTrainingLoadVal();
         }

         if (var3.hasRecoveryTime()) {
            this.recoveryTime = q.a(var3.getRecoveryTime());
         }

         if (var3.hasFatConsumption()) {
            this.fatConsumption = var3.getFatConsumption();
         }
      }

      if (var1.hasRunningIndex()) {
         Structures$PbRunningIndex var4 = var1.getRunningIndex();
         this.runningIndex = var4.getValue();
         if (var4.hasCalculationTime()) {
            this.runningIndexTime = q.a(var4.getCalculationTime());
         }
      }

      if (var1.hasAscent()) {
         this.ascent = var1.getAscent();
      }

      if (var1.hasDescent()) {
         this.descent = var1.getDescent();
      }

   }

   public Exercise(InputStream var1) {
      this(Training$PbExerciseBase.parseFrom(var1));
   }

   private Structures$PbTrainingLoad buildPbTrainingLoad() {
      Structures$PbTrainingLoad$Builder var1 = Structures$PbTrainingLoad.newBuilder();
      if (this.trainingLoad != -1) {
         var1.setTrainingLoadVal(this.trainingLoad);
      }

      if (this.recoveryTime != -1L) {
         var1.setRecoveryTime(q.c(this.recoveryTime, 22));
      }

      if (this.fatConsumption != -1 && this.calories > 0) {
         var1.setFatConsumption(this.fatConsumption);
      }

      return var1.build();
   }

   private void updatePath() {
      long var1 = this.getStartTime();
      if (var1 == 0L) {
         d.c(TAG, "", new IllegalStateException("Exercise doesn't have valid start time, cannot create path."));
      } else {
         int var3 = this.getExerciseIndex();
         StringBuilder var4 = new StringBuilder();
         var4.append("/U/0/");
         var4.append(q.c(var1));
         var4.append('/');
         var4.append("E");
         var4.append('/');
         var4.append(q.d(var1));
         var4.append('/');
         var4.append(q.a(var3));
         var4.append('/');
         this.path = var4.toString();
      }

   }

   public float getAscent() {
      return this.ascent;
   }

   public String getBasename() {
      return "BASE";
   }

   public int getCalories() {
      return this.calories;
   }

   public float getDescent() {
      return this.descent;
   }

   public float getDistance() {
      return this.distance;
   }

   public long getDuration() {
      return this.duration;
   }

   public int getExerciseIndex() {
      return this.exerciseIndex;
   }

   public ExerciseSamples getExerciseSamples() {
      ExerciseSamples var2;
      if (this.getId() != null) {
         List var1 = ExerciseSamples.find(ExerciseSamples.class, "EXERCISE = ?", new String[]{String.valueOf(this.getId())});
         if (!var1.isEmpty()) {
            var2 = (ExerciseSamples)var1.get(0);
            return var2;
         }
      }

      var2 = null;
      return var2;
   }

   public ExerciseStatistics getExerciseStatistics() {
      ExerciseStatistics var2;
      if (this.getId() != null) {
         List var1 = ExerciseStatistics.find(ExerciseStatistics.class, "EXERCISE = ?", new String[]{String.valueOf(this.getId())});
         if (!var1.isEmpty()) {
            var2 = (ExerciseStatistics)var1.get(0);
            return var2;
         }
      }

      var2 = null;
      return var2;
   }

   public int getFatConsumption() {
      return this.fatConsumption;
   }

   public String getPath() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      return this.path;
   }

   public long getRecoveryTime() {
      return this.recoveryTime;
   }

   public int getRunningIndex() {
      return this.runningIndex;
   }

   public long getSport() {
      return this.sport;
   }

   public long getStartTime() {
      return this.startTime;
   }

   public int getTrainingLoad() {
      return this.trainingLoad;
   }

   public boolean isSwimmingSport() {
      boolean var1;
      if (this.sport != 23L && this.sport != 103L) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void merge(Exercise var1) {
      this.startTime = var1.startTime;
      this.duration = var1.duration;
      this.sport = var1.sport;
      this.distance = var1.distance;
      this.calories = var1.calories;
      this.trainingLoad = var1.trainingLoad;
      this.recoveryTime = var1.recoveryTime;
      this.fatConsumption = var1.fatConsumption;
      this.runningIndex = var1.runningIndex;
      this.runningIndexTime = var1.runningIndexTime;
   }

   public long save() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      if (this.calories <= 0) {
         this.fatConsumption = -1;
      }

      return super.save();
   }

   public void setAscent(float var1) {
      this.ascent = var1;
   }

   public void setCalories(int var1) {
      this.calories = var1;
   }

   public void setDescent(float var1) {
      this.descent = var1;
   }

   public void setDistance(float var1) {
      this.distance = var1;
   }

   public void setDuration(long var1) {
      this.duration = var1;
   }

   public void setFatConsumption(int var1) {
      this.fatConsumption = var1;
   }

   public void setRecoveryTime(long var1) {
      this.recoveryTime = var1;
   }

   public void setRunningIndex(int var1, long var2) {
      this.runningIndex = var1;
      this.runningIndexTime = var2;
   }

   public void setSport(long var1) {
      this.sport = var1;
   }

   public void setTrainingLoad(int var1) {
      this.trainingLoad = var1;
   }

   public Training$PbExerciseBase toPbObject() {
      Training$PbExerciseBase$Builder var1 = Training$PbExerciseBase.newBuilder();
      var1.setStart(q.a(this.getStartTime()));
      var1.setDuration(q.b(this.getDuration()));
      var1.setSport(Structures$PbSportIdentifier.newBuilder().setValue(this.sport));
      if (this.distance != -1.0F) {
         var1.setDistance(this.distance);
      }

      if (this.calories != -1) {
         var1.setCalories(this.calories);
      }

      if (this.trainingLoad != -1 || this.recoveryTime != -1L || this.fatConsumption != -1 && this.calories > 0) {
         var1.setTrainingLoad(this.buildPbTrainingLoad());
      }

      if (this.runningIndex != -1) {
         Structures$PbRunningIndex$Builder var2 = Structures$PbRunningIndex.newBuilder();
         var2.setValue(this.runningIndex);
         if (this.runningIndexTime != 0L) {
            var2.setCalculationTime(q.b(this.runningIndexTime));
         }

         var1.setRunningIndex(var2);
      }

      if (this.ascent != -1.0F) {
         var1.setAscent(this.ascent);
      }

      if (this.descent != -1.0F) {
         var1.setDescent(this.descent);
      }

      return var1.build();
   }

   public String toString() {
      String var1;
      if (this.trainingSession != null) {
         var1 = "Exercise [trainingSession=" + this.trainingSession.toString() + ", startTime=" + this.startTime + ", sport=" + this.sport + "]";
      } else {
         var1 = "Exercise [trainingSession=null, startTime=" + this.startTime + ", sport=" + this.sport + "]";
      }

      return var1;
   }
}
