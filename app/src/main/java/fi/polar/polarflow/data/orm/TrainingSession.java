package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.dsl.Ignore;
import com.orm.dsl.Unique;
import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.aa;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.Structures$PbOneLineText;
import fi.polar.remote.representation.protobuf.Structures$PbTrainingLoad;
import fi.polar.remote.representation.protobuf.Structures$PbTrainingLoad$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbTrainingSessionFavoriteId;
import fi.polar.remote.representation.protobuf.Structures$PbTrainingSessionTargetId;
import fi.polar.remote.representation.protobuf.TrainingSession$PbSessionHeartRateStatistics;
import fi.polar.remote.representation.protobuf.TrainingSession$PbSessionHeartRateStatistics$Builder;
import fi.polar.remote.representation.protobuf.TrainingSession$PbTrainingSession;
import fi.polar.remote.representation.protobuf.TrainingSession$PbTrainingSession$Builder;
import fi.polar.remote.representation.protobuf.Types$PbDuration;
import fi.polar.remote.representation.protobuf.Types$PbExerciseFeedback;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class TrainingSession extends ProtoPublishableEntity implements Mergeable {
   private static final String TAG = TrainingSession.class.getSimpleName();
   private int averageHr;
   private int benefit;
   private int calories;
   private String deviceId;
   private float distance;
   private long duration;
   private long end;
   @Ignore
   private long endTimeFromBoot;
   private int exerciseCount;
   private int fatConsumption;
   private int maximumHr;
   private String modelName;
   private long recoveryTime;
   private String sessionName;
   @Unique
   private long startTime;
   @Ignore
   private long startTimeFromBoot;
   private long timeInHrZone1;
   private long timeInHrZone2;
   private long timeInHrZone3;
   private long timeInHrZone4;
   private long timeInHrZone5;
   private int trainingLoad;
   private long trainingSessionFavoriteId;
   private long trainingSessionTargetId;

   public TrainingSession() {
      this.startTime = 0L;
      this.startTimeFromBoot = 0L;
      this.end = 0L;
      this.endTimeFromBoot = 0L;
      this.exerciseCount = 1;
      this.modelName = "";
      this.deviceId = "";
      this.duration = 0L;
      this.distance = -1.0F;
      this.calories = -1;
      this.trainingLoad = -1;
      this.recoveryTime = -1L;
      this.fatConsumption = -1;
      this.benefit = -1;
      this.sessionName = "";
      this.trainingSessionTargetId = -1L;
      this.trainingSessionFavoriteId = -1L;
      this.timeInHrZone1 = -1L;
      this.timeInHrZone2 = -1L;
      this.timeInHrZone3 = -1L;
      this.timeInHrZone4 = -1L;
      this.timeInHrZone5 = -1L;
      this.averageHr = -1;
      this.maximumHr = -1;
   }

   public TrainingSession(long var1) {
      this.startTime = 0L;
      this.startTimeFromBoot = 0L;
      this.end = 0L;
      this.endTimeFromBoot = 0L;
      this.exerciseCount = 1;
      this.modelName = "";
      this.deviceId = "";
      this.duration = 0L;
      this.distance = -1.0F;
      this.calories = -1;
      this.trainingLoad = -1;
      this.recoveryTime = -1L;
      this.fatConsumption = -1;
      this.benefit = -1;
      this.sessionName = "";
      this.trainingSessionTargetId = -1L;
      this.trainingSessionFavoriteId = -1L;
      this.timeInHrZone1 = -1L;
      this.timeInHrZone2 = -1L;
      this.timeInHrZone3 = -1L;
      this.timeInHrZone4 = -1L;
      this.timeInHrZone5 = -1L;
      this.averageHr = -1;
      this.maximumHr = -1;
      this.startTime = var1;
   }

   public TrainingSession(long var1, long var3) {
      this.startTime = 0L;
      this.startTimeFromBoot = 0L;
      this.end = 0L;
      this.endTimeFromBoot = 0L;
      this.exerciseCount = 1;
      this.modelName = "";
      this.deviceId = "";
      this.duration = 0L;
      this.distance = -1.0F;
      this.calories = -1;
      this.trainingLoad = -1;
      this.recoveryTime = -1L;
      this.fatConsumption = -1;
      this.benefit = -1;
      this.sessionName = "";
      this.trainingSessionTargetId = -1L;
      this.trainingSessionFavoriteId = -1L;
      this.timeInHrZone1 = -1L;
      this.timeInHrZone2 = -1L;
      this.timeInHrZone3 = -1L;
      this.timeInHrZone4 = -1L;
      this.timeInHrZone5 = -1L;
      this.averageHr = -1;
      this.maximumHr = -1;
      this.startTime = var1;
      this.startTimeFromBoot = var3;
   }

   public TrainingSession(TrainingSession$PbTrainingSession var1) {
      this();
      if (var1.hasStart()) {
         this.startTime = q.b(var1.getStart());
      }

      if (var1.hasEnd()) {
         this.end = q.b(var1.getEnd());
      }

      if (var1.hasModelName()) {
         this.modelName = var1.getModelName();
      }

      if (var1.hasDeviceId()) {
         this.deviceId = var1.getDeviceId();
      }

      if (var1.hasDuration()) {
         this.duration = q.a(var1.getDuration());
      }

      if (var1.hasDistance()) {
         this.distance = var1.getDistance();
      }

      if (var1.hasCalories()) {
         this.calories = var1.getCalories();
      }

      if (var1.hasTrainingLoad()) {
         Structures$PbTrainingLoad var2 = var1.getTrainingLoad();
         if (var2.hasTrainingLoadVal()) {
            this.trainingLoad = var2.getTrainingLoadVal();
         }

         if (var2.hasRecoveryTime()) {
            this.recoveryTime = q.a(var2.getRecoveryTime());
         }

         if (var2.hasFatConsumption()) {
            this.fatConsumption = var2.getFatConsumption();
         }
      }

      if (var1.hasSessionName()) {
         this.sessionName = var1.getSessionName().getText();
      }

      if (var1.hasBenefit()) {
         this.benefit = var1.getBenefit().getNumber();
      }

      if (var1.hasTrainingSessionTargetId()) {
         this.trainingSessionTargetId = var1.getTrainingSessionTargetId().getValue();
      }

      if (var1.hasTrainingSessionFavoriteId()) {
         this.trainingSessionFavoriteId = var1.getTrainingSessionFavoriteId().getValue();
      }

      if (var1.hasHeartRate()) {
         this.averageHr = var1.getHeartRate().getAverage();
         this.maximumHr = var1.getHeartRate().getMaximum();
      }

      if (var1.getHeartRateZoneDurationCount() == 5) {
         this.timeInHrZone1 = q.a(var1.getHeartRateZoneDuration(0));
         this.timeInHrZone2 = q.a(var1.getHeartRateZoneDuration(1));
         this.timeInHrZone3 = q.a(var1.getHeartRateZoneDuration(2));
         this.timeInHrZone4 = q.a(var1.getHeartRateZoneDuration(3));
         this.timeInHrZone5 = q.a(var1.getHeartRateZoneDuration(4));
      }

      this.updatePath();
   }

   public TrainingSession(InputStream var1) {
      this(TrainingSession$PbTrainingSession.parseFrom(var1));
   }

   private void addZoneDurations(TrainingSession$PbTrainingSession$Builder var1) {
      var1.addHeartRateZoneDuration(0, (Types$PbDuration)q.b(this.timeInHrZone1));
      var1.addHeartRateZoneDuration(1, (Types$PbDuration)q.b(this.timeInHrZone2));
      var1.addHeartRateZoneDuration(2, (Types$PbDuration)q.b(this.timeInHrZone3));
      var1.addHeartRateZoneDuration(3, (Types$PbDuration)q.b(this.timeInHrZone4));
      var1.addHeartRateZoneDuration(4, (Types$PbDuration)q.b(this.timeInHrZone5));
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

   private Exercise createExercise(long var1) {
      Exercise var3 = new Exercise(var1);
      var3.trainingSession = this;
      return var3;
   }

   public static TrainingSession findByStartTime(long var0) {
      List var2 = find(TrainingSession.class, "START_TIME = ?", new String[]{String.valueOf(var0)});
      TrainingSession var3;
      if (var2.isEmpty()) {
         var3 = null;
      } else {
         var3 = (TrainingSession)var2.get(0);
      }

      return var3;
   }

   public static List getCurrentDayTrainings() {
      DateTime var0 = (new aa()).e().withTimeAtStartOfDay();
      return find(TrainingSession.class, "START_TIME>=? AND START_TIME<?", new String[]{String.valueOf(var0.getMillis()), String.valueOf(var0.plusDays(1).withTimeAtStartOfDay().getMillis())}, (String)null, "START_TIME ASC", (String)null);
   }

   private TrainingSession$PbSessionHeartRateStatistics$Builder getHeartRateStatisticsBuilder() {
      TrainingSession$PbSessionHeartRateStatistics$Builder var1 = TrainingSession$PbSessionHeartRateStatistics.newBuilder();
      var1.setAverage(this.averageHr);
      var1.setMaximum(this.maximumHr);
      return var1;
   }

   private void updatePath() {
      long var1 = this.getStartTime();
      if (var1 == 0L) {
         d.c(TAG, "", new IllegalStateException("TrainingSession doesn't have valid start time, cannot create path."));
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("/U/0/");
         var3.append(q.c(var1));
         var3.append('/');
         var3.append("E");
         var3.append('/');
         var3.append(q.d(var1));
         var3.append('/');
         this.path = var3.toString();
      }

   }

   public int getAverageHr() {
      return this.averageHr;
   }

   public String getBasename() {
      return "TSESS";
   }

   public int getBenefit() {
      return this.benefit;
   }

   public int getCalories() {
      return this.calories;
   }

   public String getDeviceId() {
      return this.deviceId;
   }

   public float getDistance() {
      return this.distance;
   }

   public long getDuration() {
      return this.duration;
   }

   public long getEnd() {
      return this.end;
   }

   public long getEndTimeFromBoot() {
      return this.endTimeFromBoot;
   }

   public int getExerciseCount() {
      return this.exerciseCount;
   }

   public int getFatConsumption() {
      return this.fatConsumption;
   }

   public int getMaximumHr() {
      return this.maximumHr;
   }

   public String getModelName() {
      return this.modelName;
   }

   public Exercise getOrCreateExercise(long var1) {
      Exercise var3;
      if (this.getId() == null) {
         var3 = this.createExercise(var1);
      } else {
         List var5 = Exercise.find(Exercise.class, "TRAINING_SESSION = ? AND START_TIME = ?", new String[]{String.valueOf(this.getId()), String.valueOf(var1)});
         if (var5.isEmpty()) {
            var3 = this.createExercise(var1);
         } else if (var5.size() == 1) {
            var3 = (Exercise)var5.get(0);
         } else {
            for(int var4 = 1; var4 < var5.size(); ++var4) {
               ((Exercise)var5.get(var4)).delete();
            }

            var3 = (Exercise)var5.get(0);
         }
      }

      return var3;
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

   public String getSessionName() {
      return this.sessionName;
   }

   public long getStartTime() {
      return this.startTime;
   }

   public long getStartTimeFromBoot() {
      return this.startTimeFromBoot;
   }

   public long getTargetOrFavoriteId() {
      long var1 = this.getTrainingSessionTargetId();
      long var3 = var1;
      if (var1 == -1L) {
         var3 = this.getTrainingSessionFavoriteId();
      }

      return var3;
   }

   public long[] getTimeInHrZones() {
      long[] var1 = null;
      if (this.timeInHrZone1 != -1L) {
         var1 = new long[]{this.timeInHrZone1, this.timeInHrZone2, this.timeInHrZone3, this.timeInHrZone4, this.timeInHrZone5};
      }

      return var1;
   }

   public int getTrainingLoad() {
      return this.trainingLoad;
   }

   public List getTrainingSessionExerciseList() {
      Object var1;
      if (this.getId() == null) {
         var1 = new ArrayList();
      } else {
         var1 = Exercise.find(Exercise.class, "TRAINING_SESSION = ?", new String[]{String.valueOf(this.getId())});
      }

      return (List)var1;
   }

   public long getTrainingSessionFavoriteId() {
      return this.trainingSessionFavoriteId;
   }

   public long getTrainingSessionTargetId() {
      return this.trainingSessionTargetId;
   }

   public void merge(TrainingSession var1) {
      this.startTime = var1.startTime;
      this.end = var1.end;
      this.exerciseCount = var1.exerciseCount;
      this.modelName = var1.modelName;
      this.deviceId = var1.deviceId;
      this.duration = var1.duration;
      this.distance = var1.distance;
      this.calories = var1.calories;
      this.trainingLoad = var1.trainingLoad;
      this.recoveryTime = var1.recoveryTime;
      this.fatConsumption = var1.fatConsumption;
      this.sessionName = var1.sessionName;
      this.benefit = var1.benefit;
      this.trainingSessionTargetId = var1.trainingSessionTargetId;
      this.trainingSessionFavoriteId = var1.trainingSessionFavoriteId;
      this.averageHr = var1.averageHr;
      this.maximumHr = var1.maximumHr;
      this.timeInHrZone1 = var1.timeInHrZone1;
      this.timeInHrZone2 = var1.timeInHrZone2;
      this.timeInHrZone3 = var1.timeInHrZone3;
      this.timeInHrZone4 = var1.timeInHrZone4;
      this.timeInHrZone5 = var1.timeInHrZone5;
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

   public void setAverageHr(int var1) {
      this.averageHr = var1;
   }

   public void setBenefit(int var1) {
      this.benefit = var1;
   }

   public void setCalories(int var1) {
      this.calories = var1;
   }

   public void setDeviceId(String var1) {
      this.deviceId = var1;
   }

   public void setDistance(float var1) {
      this.distance = var1;
   }

   public void setDuration(long var1) {
      this.duration = var1;
   }

   public void setEnd(long var1) {
      this.end = var1;
   }

   public void setEndTimeFromBoot(long var1) {
      this.endTimeFromBoot = var1;
   }

   public void setExerciseCount(int var1) {
      this.exerciseCount = var1;
   }

   public void setFatConsumption(int var1) {
      this.fatConsumption = var1;
   }

   public void setMaximumHr(int var1) {
      this.maximumHr = var1;
   }

   public void setModelName(String var1) {
      this.modelName = var1;
   }

   public void setRecoveryTime(long var1) {
      this.recoveryTime = var1;
   }

   public void setSessionName(String var1) {
      this.sessionName = var1;
   }

   public void setStartTime(long var1) {
      this.startTime = var1;
   }

   public void setStartTimeFromBoot(long var1) {
      this.startTimeFromBoot = var1;
   }

   public void setTimeInHrZones(long[] var1) {
      if (var1.length == 5) {
         this.timeInHrZone1 = var1[0];
         this.timeInHrZone2 = var1[1];
         this.timeInHrZone3 = var1[2];
         this.timeInHrZone4 = var1[3];
         this.timeInHrZone5 = var1[4];
      }

   }

   public void setTrainingLoad(int var1) {
      this.trainingLoad = var1;
   }

   public void setTrainingSessionFavoriteId(long var1) {
      this.trainingSessionFavoriteId = var1;
   }

   public void setTrainingSessionTargetId(long var1) {
      this.trainingSessionTargetId = var1;
   }

   public TrainingSession$PbTrainingSession toPbObject() {
      TrainingSession$PbTrainingSession$Builder var1 = TrainingSession$PbTrainingSession.newBuilder();
      var1.setStart(q.a(this.startTime));
      if (this.end != 0L) {
         var1.setEnd(q.a(this.end));
      }

      var1.setExerciseCount(this.exerciseCount);
      if (!TextUtils.isEmpty(this.deviceId)) {
         var1.setDeviceId(this.deviceId);
      }

      if (!TextUtils.isEmpty(this.modelName)) {
         var1.setModelName(this.modelName);
      }

      if (this.duration != 0L) {
         var1.setDuration(q.b(this.duration));
      }

      if (this.distance != -1.0F) {
         var1.setDistance(this.distance);
      }

      if (this.calories != -1) {
         var1.setCalories(this.calories);
      }

      if (this.trainingLoad != -1 || this.recoveryTime != -1L || this.fatConsumption != -1 && this.calories > 0) {
         var1.setTrainingLoad(this.buildPbTrainingLoad());
      }

      if (this.benefit != -1) {
         var1.setBenefit(Types$PbExerciseFeedback.forNumber(this.benefit));
      }

      if (this.trainingSessionTargetId != -1L) {
         var1.setTrainingSessionTargetId(Structures$PbTrainingSessionTargetId.newBuilder().setValue(this.trainingSessionTargetId));
      }

      if (this.trainingSessionFavoriteId != -1L) {
         var1.setTrainingSessionFavoriteId(Structures$PbTrainingSessionFavoriteId.newBuilder().setValue(this.trainingSessionFavoriteId));
      }

      if (this.averageHr != -1) {
         var1.setHeartRate(this.getHeartRateStatisticsBuilder());
      }

      if (this.timeInHrZone1 != -1L) {
         this.addZoneDurations(var1);
      }

      if (!TextUtils.isEmpty(this.sessionName)) {
         var1.setSessionName(Structures$PbOneLineText.newBuilder().setText(this.sessionName).build());
      }

      return var1.build();
   }

   public String toString() {
      return "TrainingSession [id=" + String.valueOf(this.getId()) + ", start=" + this.startTime + ", end=" + this.end + "]";
   }
}
