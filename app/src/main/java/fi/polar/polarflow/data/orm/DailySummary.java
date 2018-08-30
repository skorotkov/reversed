package fi.polar.polarflow.data.orm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.orm.dsl.NotNull;
import com.orm.dsl.Unique;
import fi.polar.polarflow.a_package.a;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.DailySummary$PbActivityClassTimes;
import fi.polar.remote.representation.protobuf.DailySummary$PbActivityClassTimes$Builder;
import fi.polar.remote.representation.protobuf.DailySummary$PbActivityGoalSummary;
import fi.polar.remote.representation.protobuf.DailySummary$PbActivityGoalSummary$Builder;
import fi.polar.remote.representation.protobuf.DailySummary$PbDailySummary;
import fi.polar.remote.representation.protobuf.DailySummary$PbDailySummary$Builder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.format.ISODateTimeFormat;

public class DailySummary extends ProtoPublishableEntity implements Parcelable {
   public static final Creator CREATOR = new DailySummary$1();
   private static final String TAG = DailySummary.class.getSimpleName();
   private float achievedActivity;
   private int activityCalories;
   private float activityDistance;
   private float activityGoal;
   private int bmrCalories;
   @NotNull
   @Unique
   private String date;
   private int steps;
   private long timeContinuousModerate;
   private long timeContinuousVigorous;
   private long timeIntermittentModerate;
   private long timeIntermittentVigorous;
   private long timeLightActivity;
   private long timeNonWear;
   private long timeSedentary;
   private long timeSleep;
   private long timeToGoJog;
   private long timeToGoUp;
   private long timeToGoWalk;
   private int trainingCalories;

   public DailySummary() {
      this.date = null;
      this.steps = -1;
      this.activityCalories = -1;
      this.trainingCalories = -1;
      this.bmrCalories = -1;
      this.activityGoal = -1.0F;
      this.achievedActivity = -1.0F;
      this.timeToGoUp = -1L;
      this.timeToGoWalk = -1L;
      this.timeToGoJog = -1L;
      this.timeNonWear = -1L;
      this.timeSleep = -1L;
      this.timeSedentary = -1L;
      this.timeLightActivity = -1L;
      this.timeContinuousModerate = -1L;
      this.timeIntermittentModerate = -1L;
      this.timeContinuousVigorous = -1L;
      this.timeIntermittentVigorous = -1L;
      this.activityDistance = -1.0F;
   }

   public DailySummary(Parcel var1) {
      this((InputStream)(new ByteArrayInputStream(var1.createByteArray())));
   }

   public DailySummary(DailySummary$PbDailySummary var1) {
      this();
      if (var1.hasDate()) {
         this.date = q.a(var1.getDate());
      }

      if (var1.hasSteps()) {
         this.steps = var1.getSteps();
      }

      if (var1.hasActivityCalories()) {
         this.activityCalories = var1.getActivityCalories();
      }

      if (var1.hasTrainingCalories()) {
         this.trainingCalories = var1.getTrainingCalories();
      }

      if (var1.hasBmrCalories()) {
         this.bmrCalories = var1.getBmrCalories();
      }

      if (var1.hasActivityGoalSummary()) {
         DailySummary$PbActivityGoalSummary var2 = var1.getActivityGoalSummary();
         if (var2.hasActivityGoal()) {
            this.activityGoal = var2.getActivityGoal();
         }

         if (var2.hasAchievedActivity()) {
            this.achievedActivity = var2.getAchievedActivity();
         }

         if (var2.hasTimeToGoUp()) {
            this.timeToGoUp = q.a(var2.getTimeToGoUp());
         }

         if (var2.hasTimeToGoWalk()) {
            this.timeToGoWalk = q.a(var2.getTimeToGoWalk());
         }

         if (var2.hasTimeToGoJog()) {
            this.timeToGoJog = q.a(var2.getTimeToGoJog());
         }
      }

      if (var1.hasActivityClassTimes()) {
         DailySummary$PbActivityClassTimes var3 = var1.getActivityClassTimes();
         if (var3.hasTimeNonWear()) {
            this.timeNonWear = q.a(var3.getTimeNonWear());
         }

         if (var3.hasTimeSleep()) {
            this.timeSleep = q.a(var3.getTimeSleep());
         }

         if (var3.hasTimeSedentary()) {
            this.timeSedentary = q.a(var3.getTimeSedentary());
         }

         if (var3.hasTimeLightActivity()) {
            this.timeLightActivity = q.a(var3.getTimeLightActivity());
         }

         if (var3.hasTimeContinuousModerate()) {
            this.timeContinuousModerate = q.a(var3.getTimeContinuousModerate());
         }

         if (var3.hasTimeIntermittentModerate()) {
            this.timeIntermittentModerate = q.a(var3.getTimeIntermittentModerate());
         }

         if (var3.hasTimeContinuousVigorous()) {
            this.timeContinuousVigorous = q.a(var3.getTimeContinuousVigorous());
         }

         if (var3.hasTimeIntermittentVigorous()) {
            this.timeIntermittentVigorous = q.a(var3.getTimeIntermittentVigorous());
         }
      }

      if (var1.hasActivityDistance()) {
         this.activityDistance = var1.getActivityDistance();
      }

   }

   public DailySummary(InputStream var1) {
      this(DailySummary$PbDailySummary.parseFrom(var1));
   }

   // $FF: synthetic method
   static String access$000() {
      return TAG;
   }

   private DailySummary$PbActivityClassTimes buildPbActivityClassTimes() {
      DailySummary$PbActivityClassTimes$Builder var1 = DailySummary$PbActivityClassTimes.newBuilder();
      if (this.timeNonWear != -1L) {
         var1.setTimeNonWear(q.b(this.timeNonWear));
      }

      if (this.timeSleep != -1L) {
         var1.setTimeSleep(q.b(this.timeSleep));
      }

      if (this.timeSedentary != -1L) {
         var1.setTimeSedentary(q.b(this.timeSedentary));
      }

      if (this.timeLightActivity != -1L) {
         var1.setTimeLightActivity(q.b(this.timeLightActivity));
      }

      if (this.timeContinuousModerate != -1L) {
         var1.setTimeContinuousModerate(q.b(this.timeContinuousModerate));
      }

      if (this.timeIntermittentModerate != -1L) {
         var1.setTimeIntermittentModerate(q.b(this.timeIntermittentModerate));
      }

      if (this.timeContinuousVigorous != -1L) {
         var1.setTimeContinuousVigorous(q.b(this.timeContinuousVigorous));
      }

      if (this.timeIntermittentVigorous != -1L) {
         var1.setTimeIntermittentVigorous(q.b(this.timeIntermittentVigorous));
      }

      return var1.build();
   }

   private DailySummary$PbActivityGoalSummary buildPbActivityGoalSummary() {
      DailySummary$PbActivityGoalSummary$Builder var1 = DailySummary$PbActivityGoalSummary.newBuilder();
      if (this.activityGoal != -1.0F) {
         var1.setActivityGoal(this.activityGoal);
      }

      if (this.achievedActivity != -1.0F) {
         var1.setAchievedActivity(this.achievedActivity);
      }

      if (this.timeToGoUp != -1L) {
         var1.setTimeToGoUp(q.b(this.timeToGoUp));
      }

      if (this.timeToGoWalk != -1L) {
         var1.setTimeToGoWalk(q.b(this.timeToGoWalk));
      }

      if (this.timeToGoJog != -1L) {
         var1.setTimeToGoJog(q.b(this.timeToGoJog));
      }

      return var1.build();
   }

   private void generatePathIfEmpty() {
      if (TextUtils.isEmpty(this.path)) {
         this.path = "/U/0/" + this.date + '/' + "DSUM" + '/';
      }

   }

   public static DailySummary getDailySummary() {
      return getDailySummary(new LocalDate());
   }

   public static DailySummary getDailySummary(String var0) {
      List var1 = find(DailySummary.class, "DATE = ?", new String[]{var0});
      DailySummary var2;
      switch(var1.size()) {
      case 0:
         var2 = null;
         break;
      case 1:
         var2 = (DailySummary)var1.get(0);
         break;
      default:
         d.c(TAG, "", new IllegalStateException("More than one DailySummary objects with same date (" + var0 + ")"));
         var2 = (DailySummary)var1.get(0);
      }

      return var2;
   }

   public static DailySummary getDailySummary(LocalDate var0) {
      return getDailySummary(var0.toString(ISODateTimeFormat.basicDate()));
   }

   public void addActivityDistance(float var1) {
      if (this.activityDistance == -1.0F) {
         this.activityDistance = 0.0F;
      }

      this.activityDistance = a.a(1, this.activityDistance + var1);
   }

   public void addTimeContinuousModerate(long var1) {
      if (this.timeContinuousModerate == -1L) {
         this.timeContinuousModerate = 0L;
      }

      this.timeContinuousModerate += var1;
   }

   public void addTimeContinuousVigorous(long var1) {
      if (this.timeContinuousVigorous == -1L) {
         this.timeContinuousVigorous = 0L;
      }

      this.timeContinuousVigorous += var1;
   }

   public void addTimeIntermittentModerate(long var1) {
      if (this.timeIntermittentModerate == -1L) {
         this.timeIntermittentModerate = 0L;
      }

      this.timeIntermittentModerate += var1;
   }

   public void addTimeIntermittentVigorous(long var1) {
      if (this.timeIntermittentVigorous == -1L) {
         this.timeIntermittentVigorous = 0L;
      }

      this.timeIntermittentVigorous += var1;
   }

   public void addTimeLightActivity(long var1) {
      if (this.timeLightActivity == -1L) {
         this.timeLightActivity = 0L;
      }

      this.timeLightActivity += var1;
   }

   public void addTimeNonWear(long var1) {
      if (this.timeNonWear == -1L) {
         this.timeNonWear = 0L;
      }

      this.timeNonWear += var1;
   }

   public void addTimeSedentary(long var1) {
      if (this.timeSedentary == -1L) {
         this.timeSedentary = 0L;
      }

      this.timeSedentary += var1;
   }

   public void addTimeSleep(long var1) {
      if (this.timeSleep == -1L) {
         this.timeSleep = 0L;
      }

      this.timeSleep += var1;
   }

   public int describeContents() {
      return 0;
   }

   public float getAchievedActivity() {
      return this.achievedActivity;
   }

   public float getAchievedPercentage() {
      float var1 = -1.0F;
      float var2 = var1;
      if (this.activityGoal > 0.0F) {
         var2 = var1;
         if (this.achievedActivity != -1.0F) {
            var2 = this.achievedActivity / this.activityGoal * 100.0F;
         }
      }

      return var2;
   }

   public int getActivityCalories() {
      return this.activityCalories;
   }

   public float getActivityDistance() {
      return this.activityDistance;
   }

   public float getActivityGoal() {
      return this.activityGoal;
   }

   public String getBasename() {
      return "DSUM";
   }

   public int getBmrCalories() {
      return this.bmrCalories;
   }

   public LocalDate getDate() {
      LocalDate var1;
      if (!TextUtils.isEmpty(this.date)) {
         var1 = LocalDate.parse(this.date, ISODateTimeFormat.basicDate());
      } else {
         var1 = null;
      }

      return var1;
   }

   public String getPath() {
      this.generatePathIfEmpty();
      return this.path;
   }

   public int getSteps() {
      return this.steps;
   }

   public long getTimeContinuousModerate() {
      return this.timeContinuousModerate;
   }

   public long getTimeContinuousVigorous() {
      return this.timeContinuousVigorous;
   }

   public long getTimeIntermittentModerate() {
      return this.timeIntermittentModerate;
   }

   public long getTimeIntermittentVigorous() {
      return this.timeIntermittentVigorous;
   }

   public long getTimeLightActivity() {
      return this.timeLightActivity;
   }

   public long getTimeNonWear() {
      return this.timeNonWear;
   }

   public long getTimeSedentary() {
      return this.timeSedentary;
   }

   public long getTimeSleep() {
      return this.timeSleep;
   }

   public long getTimeToGoJog() {
      return this.timeToGoJog;
   }

   public long getTimeToGoUp() {
      return this.timeToGoUp;
   }

   public long getTimeToGoWalk() {
      return this.timeToGoWalk;
   }

   public int getTrainingCalories() {
      return this.trainingCalories;
   }

   public boolean isActivityGoalReached() {
      float var1 = this.getAchievedPercentage();
      boolean var2;
      if (var1 != -1.0F && var1 >= 100.0F) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public long save() {
      this.generatePathIfEmpty();
      return super.save();
   }

   public void setAchievedActivity(float var1) {
      this.achievedActivity = var1;
   }

   public void setActivityCalories(int var1) {
      this.activityCalories = var1;
   }

   public void setActivityDistance(float var1) {
      this.activityDistance = a.a(1, var1);
   }

   public void setActivityGoal(float var1) {
      this.activityGoal = var1;
   }

   public void setBmrCalories(int var1) {
      this.bmrCalories = var1;
   }

   public void setDate(LocalDate var1) {
      String var2;
      if (var1 != null) {
         var2 = var1.toString(ISODateTimeFormat.basicDate());
      } else {
         var2 = null;
      }

      this.date = var2;
      this.path = null;
   }

   public void setSteps(int var1) {
      this.steps = var1;
   }

   public void setTimeContinuousModerate(long var1) {
      this.timeContinuousModerate = var1;
   }

   public void setTimeContinuousVigorous(long var1) {
      this.timeContinuousVigorous = var1;
   }

   public void setTimeIntermittentModerate(long var1) {
      this.timeIntermittentModerate = var1;
   }

   public void setTimeIntermittentVigorous(long var1) {
      this.timeIntermittentVigorous = var1;
   }

   public void setTimeLightActivity(long var1) {
      this.timeLightActivity = var1;
   }

   public void setTimeNonWear(long var1) {
      this.timeNonWear = var1;
   }

   public void setTimeSedentary(long var1) {
      this.timeSedentary = var1;
   }

   public void setTimeSleep(long var1) {
      this.timeSleep = var1;
   }

   public void setTimeToGoJog(long var1) {
      this.timeToGoJog = var1;
   }

   public void setTimeToGoUp(long var1) {
      this.timeToGoUp = var1;
   }

   public void setTimeToGoWalk(long var1) {
      this.timeToGoWalk = var1;
   }

   public void setTrainingCalories(int var1) {
      this.trainingCalories = var1;
   }

   public DailySummary$PbDailySummary toPbObject() {
      DailySummary$PbDailySummary$Builder var1 = DailySummary$PbDailySummary.newBuilder();
      if (!TextUtils.isEmpty(this.date)) {
         var1.setDate(q.a(this.date));
      }

      if (this.steps != -1) {
         var1.setSteps(this.steps);
      }

      if (this.activityCalories != -1) {
         var1.setActivityCalories(this.activityCalories);
      }

      if (this.trainingCalories != -1) {
         var1.setTrainingCalories(this.trainingCalories);
      }

      if (this.bmrCalories != -1) {
         var1.setBmrCalories(this.bmrCalories);
      }

      if (this.activityGoal != -1.0F) {
         var1.setActivityGoalSummary(this.buildPbActivityGoalSummary());
      }

      if (this.timeNonWear != -1L || this.timeSleep != -1L || this.timeSedentary != -1L || this.timeLightActivity != -1L || this.timeContinuousModerate != -1L || this.timeIntermittentModerate != -1L || this.timeContinuousVigorous != -1L || this.timeIntermittentVigorous != -1L) {
         var1.setActivityClassTimes(this.buildPbActivityClassTimes());
      }

      if (this.activityDistance != -1.0F) {
         var1.setActivityDistance(this.activityDistance);
      }

      return var1.build();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeByteArray(this.toByteArray());
   }
}
