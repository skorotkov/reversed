package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.ab;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.RecoveryTimes$PbRecoveryTimes;
import fi.polar.remote.representation.protobuf.RecoveryTimes$PbRecoveryTimes$Builder;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class RecoveryTimes extends ProtoPublishableEntity implements Mergeable {
   public static final int FROM_START_TIME_TO_CURRENT_TIME_IN_DAYS = 8;
   private static final String TAG = "RecoveryTimes";
   private float accumulatedActivity;
   private float activityCalories;
   private float bmrCalories;
   private float endCarboConsumption;
   private float endCumulativeMechanicalStimulus;
   private float endGlycogenLeftPercent;
   private float endProteinConsumption;
   private float exerciseCalories;
   private float lastHalfHourAvgMet;
   private Date startTime;
   private int startTimeZoneOffset;
   private int steps;

   public RecoveryTimes() {
      this.endGlycogenLeftPercent = -1.0F;
      this.endCarboConsumption = -1.0F;
      this.endProteinConsumption = -1.0F;
      this.endCumulativeMechanicalStimulus = -1.0F;
      this.lastHalfHourAvgMet = -1.0F;
      this.exerciseCalories = -1.0F;
      this.activityCalories = -1.0F;
      this.bmrCalories = -1.0F;
      this.steps = -1;
      this.accumulatedActivity = -1.0F;
      this.path = "/U/0/TL/";
   }

   public RecoveryTimes(RecoveryTimes$PbRecoveryTimes var1) {
      this();
      if (var1.hasStartOfTimes()) {
         DateTime var2 = q.c(var1.getStartOfTimes());
         this.startTime = new Date(var2.getMillis());
         this.startTimeZoneOffset = ab.d(var2);
      }

      if (var1.hasEndGlycogenLeftPercent()) {
         this.endGlycogenLeftPercent = var1.getEndGlycogenLeftPercent();
      }

      if (var1.hasEndCarboConsumption()) {
         this.endCarboConsumption = var1.getEndCarboConsumption();
      }

      if (var1.hasEndProteinConsumption()) {
         this.endProteinConsumption = var1.getEndProteinConsumption();
      }

      if (var1.hasEndCumulativeMechanicalStimulus()) {
         this.endCumulativeMechanicalStimulus = var1.getEndCumulativeMechanicalStimulus();
      }

      if (var1.hasLastHalfHourAvgMet()) {
         this.lastHalfHourAvgMet = var1.getLastHalfHourAvgMet();
      }

      if (var1.hasExerciseCalories()) {
         this.exerciseCalories = var1.getExerciseCalories();
      }

      if (var1.hasActivityCalories()) {
         this.activityCalories = var1.getActivityCalories();
      }

      if (var1.hasBmrCalories()) {
         this.bmrCalories = var1.getBmrCalories();
      }

      if (var1.hasSteps()) {
         this.steps = var1.getSteps();
      }

      if (var1.hasAccumulatedActivity()) {
         this.accumulatedActivity = var1.getAccumulatedActivity();
      }

   }

   public RecoveryTimes(InputStream var1) {
      this(RecoveryTimes$PbRecoveryTimes.parseFrom(var1));
   }

   public static DateTime calculateStartTime(DateTime var0) {
      return ab.c(var0).minusDays(8);
   }

   public static RecoveryTimes getRecoveryTimes() {
      List var0 = listAll(RecoveryTimes.class);
      RecoveryTimes var1;
      switch(var0.size()) {
      case 0:
         var1 = null;
         break;
      case 1:
         var1 = (RecoveryTimes)var0.get(0);
         break;
      default:
         d.c("RecoveryTimes", "", new IllegalStateException("More than one RecoveryTimes objects"));
         var1 = (RecoveryTimes)var0.get(0);
      }

      return var1;
   }

   public void addAccumulatedActivity(float var1) {
      if (this.accumulatedActivity == -1.0F) {
         this.accumulatedActivity = 0.0F;
      }

      this.accumulatedActivity += var1;
   }

   public void addActivityCalories(float var1) {
      if (this.activityCalories == -1.0F) {
         this.activityCalories = 0.0F;
      }

      this.activityCalories += var1;
   }

   public void addBmrCalories(float var1) {
      if (this.bmrCalories == -1.0F) {
         this.bmrCalories = 0.0F;
      }

      this.bmrCalories += var1;
   }

   public void addExerciseCalories(float var1) {
      if (this.exerciseCalories == -1.0F) {
         this.exerciseCalories = 0.0F;
      }

      this.exerciseCalories += var1;
   }

   public void addSteps(int var1) {
      if (this.steps == -1) {
         this.steps = 0;
      }

      this.steps += var1;
   }

   public float getAccumulatedActivity() {
      return this.accumulatedActivity;
   }

   public float getActivityCalories() {
      return this.activityCalories;
   }

   public String getBasename() {
      return "RECOVS";
   }

   public float getBmrCalories() {
      return this.bmrCalories;
   }

   public float getEndCarboConsumption() {
      return this.endCarboConsumption;
   }

   public float getEndCumulativeMechanicalStimulus() {
      return this.endCumulativeMechanicalStimulus;
   }

   public float getEndGlycogenLeftPercent() {
      return this.endGlycogenLeftPercent;
   }

   public float getEndProteinConsumption() {
      return this.endProteinConsumption;
   }

   public float getExerciseCalories() {
      return this.exerciseCalories;
   }

   public float getLastHalfHourAvgMet() {
      return this.lastHalfHourAvgMet;
   }

   public DateTime getStartTime() {
      DateTime var1;
      if (this.startTime != null) {
         var1 = q.b(this.startTime, this.startTimeZoneOffset);
      } else {
         var1 = null;
      }

      return var1;
   }

   public int getSteps() {
      return this.steps;
   }

   public void initializeAllFields() {
      this.endGlycogenLeftPercent = 100.0F;
      this.endCarboConsumption = 0.0F;
      this.endProteinConsumption = 0.0F;
      this.endCumulativeMechanicalStimulus = 0.0F;
      this.lastHalfHourAvgMet = 0.0F;
      this.exerciseCalories = 0.0F;
      this.activityCalories = 0.0F;
      this.bmrCalories = 0.0F;
      this.steps = 0;
      this.accumulatedActivity = 0.0F;
   }

   public void merge(RecoveryTimes var1) {
      LocalDateTime var2 = null;
      DateTime var3 = this.getStartTime();
      DateTime var4 = var1.getStartTime();
      LocalDateTime var5;
      if (var3 != null) {
         var5 = var3.toLocalDateTime();
      } else {
         var5 = null;
      }

      if (var4 != null) {
         var2 = var4.toLocalDateTime();
      }

      if (var2 != null && !var2.isEqual(var5)) {
         d.e("RecoveryTimes", "ignoring received RECOVS.BPB (local start=" + var5 + ", remote start=" + var2 + ")");
      } else if (this.accumulatedActivity > 0.0F && var1.accumulatedActivity <= 0.0F) {
         d.f("RecoveryTimes", "ignoring received RECOVS.BPB (local has activity but remote does not have any)");
      } else if (this.steps > 0 && var1.steps <= 0) {
         d.f("RecoveryTimes", "ignoring received RECOVS.BPB (local has steps but remote does not have any)");
      } else {
         this.endGlycogenLeftPercent = var1.endGlycogenLeftPercent;
         this.endCarboConsumption = var1.endCarboConsumption;
         this.endProteinConsumption = var1.endProteinConsumption;
         this.endCumulativeMechanicalStimulus = var1.endCumulativeMechanicalStimulus;
         this.lastHalfHourAvgMet = var1.lastHalfHourAvgMet;
         this.exerciseCalories = var1.exerciseCalories;
         this.activityCalories = var1.activityCalories;
         this.bmrCalories = var1.bmrCalories;
         this.steps = var1.steps;
         this.accumulatedActivity = var1.accumulatedActivity;
      }

   }

   public void setAccumulatedActivity(float var1) {
      this.accumulatedActivity = var1;
   }

   public void setActivityCalories(float var1) {
      this.activityCalories = var1;
   }

   public void setBmrCalories(float var1) {
      this.bmrCalories = var1;
   }

   public void setEndCarboConsumption(float var1) {
      this.endCarboConsumption = var1;
   }

   public void setEndCumulativeMechanicalStimulus(float var1) {
      this.endCumulativeMechanicalStimulus = var1;
   }

   public void setEndGlycogenLeftPercent(float var1) {
      this.endGlycogenLeftPercent = var1;
   }

   public void setEndProteinConsumption(float var1) {
      this.endProteinConsumption = var1;
   }

   public void setExerciseCalories(float var1) {
      this.exerciseCalories = var1;
   }

   public void setLastHalfHourAvgMet(float var1) {
      this.lastHalfHourAvgMet = var1;
   }

   public void setStartTime(DateTime var1) {
      this.startTime = new Date(var1.getMillis());
      this.startTimeZoneOffset = ab.d(var1);
   }

   public void setSteps(int var1) {
      this.steps = var1;
   }

   public RecoveryTimes$PbRecoveryTimes toPbObject() {
      RecoveryTimes$PbRecoveryTimes$Builder var1 = RecoveryTimes$PbRecoveryTimes.newBuilder();
      if (this.startTime != null) {
         var1.setStartOfTimes(q.a(this.startTime, this.startTimeZoneOffset));
      }

      if (this.endGlycogenLeftPercent != -1.0F) {
         var1.setEndGlycogenLeftPercent(this.endGlycogenLeftPercent);
      }

      if (this.endCarboConsumption != -1.0F) {
         var1.setEndCarboConsumption(this.endCarboConsumption);
      }

      if (this.endProteinConsumption != -1.0F) {
         var1.setEndProteinConsumption(this.endProteinConsumption);
      }

      if (this.endCumulativeMechanicalStimulus != -1.0F) {
         var1.setEndCumulativeMechanicalStimulus(this.endCumulativeMechanicalStimulus);
      }

      if (this.lastHalfHourAvgMet != -1.0F) {
         var1.setLastHalfHourAvgMet(this.lastHalfHourAvgMet);
      }

      if (this.exerciseCalories != -1.0F) {
         var1.setExerciseCalories(this.exerciseCalories);
      }

      if (this.activityCalories != -1.0F) {
         var1.setActivityCalories(this.activityCalories);
      }

      if (this.bmrCalories != -1.0F) {
         var1.setBmrCalories(this.bmrCalories);
      }

      if (this.steps != -1) {
         var1.setSteps(this.steps);
      }

      if (this.accumulatedActivity != -1.0F) {
         var1.setAccumulatedActivity(this.accumulatedActivity);
      }

      return var1.build();
   }

   public String toString() {
      String var1 = "RecoveryTimes@" + Integer.toHexString(this.hashCode()) + "[";
      String var2 = var1;
      if (this.startTime != null) {
         var2 = var1 + "startTime=" + this.getStartTime();
      }

      var1 = var2;
      if (this.endGlycogenLeftPercent != -1.0F) {
         var1 = var2 + ", endGlycogenLeftPercent=" + this.endGlycogenLeftPercent;
      }

      var2 = var1;
      if (this.endCarboConsumption != -1.0F) {
         var2 = var1 + ", endCarboConsumption=" + this.endCarboConsumption;
      }

      var1 = var2;
      if (this.endProteinConsumption != -1.0F) {
         var1 = var2 + ", endProteinConsumption=" + this.endProteinConsumption;
      }

      var2 = var1;
      if (this.endCumulativeMechanicalStimulus != -1.0F) {
         var2 = var1 + ", endCumulativeMechanicalStimulus=" + this.endCumulativeMechanicalStimulus;
      }

      var1 = var2;
      if (this.lastHalfHourAvgMet != -1.0F) {
         var1 = var2 + ", lastHalfHourAvgMet=" + this.lastHalfHourAvgMet;
      }

      var2 = var1;
      if (this.exerciseCalories != -1.0F) {
         var2 = var1 + ", exerciseCalories=" + this.exerciseCalories;
      }

      var1 = var2;
      if (this.activityCalories != -1.0F) {
         var1 = var2 + ", activityCalories=" + this.activityCalories;
      }

      var2 = var1;
      if (this.bmrCalories != -1.0F) {
         var2 = var1 + ", bmrCalories=" + this.bmrCalories;
      }

      var1 = var2;
      if (this.steps != -1) {
         var1 = var2 + ", steps=" + this.steps;
      }

      var2 = var1;
      if (this.accumulatedActivity != -1.0F) {
         var2 = var1 + ", accumulatedActivity=" + this.accumulatedActivity;
      }

      return var2 + "]";
   }
}
