package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.d;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbAltitudeStatistics;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbAltitudeStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbCadenceStatistics;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbCadenceStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbExerciseStatistics;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbExerciseStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbHeartRateStatistics;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbHeartRateStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbSpeedStatistics;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbSpeedStatistics$Builder;
import java.io.InputStream;

public class ExerciseStatistics extends ProtoPublishableEntity implements Mergeable {
   private static final String TAG = ExerciseStatistics.class.getSimpleName();
   private float averageAltitude;
   private int averageCadence;
   private int averageHeartrate;
   private float averageSpeed;
   private Exercise exercise;
   private float maximumAltitude;
   private int maximumCadence;
   private int maximumHeartrate;
   private float maximumSpeed;
   private float minimumAltitude;
   private int minimumHeartrate;
   private SwimmingStatistics swimmingStatistics;

   public ExerciseStatistics() {
      this.maximumSpeed = -1.0F;
      this.averageSpeed = -1.0F;
      this.averageHeartrate = 0;
      this.maximumHeartrate = 0;
      this.minimumHeartrate = 0;
      this.averageAltitude = Float.NaN;
      this.maximumAltitude = Float.NaN;
      this.minimumAltitude = Float.NaN;
      this.maximumCadence = -1;
      this.averageCadence = -1;
      this.swimmingStatistics = null;
      this.path = "";
   }

   public ExerciseStatistics(ExerciseStatistics$PbExerciseStatistics var1) {
      this();
      if (var1.hasSpeed()) {
         ExerciseStatistics$PbSpeedStatistics var2 = var1.getSpeed();
         if (var2.hasAverage()) {
            this.setAverageSpeed(var2.getAverage());
         }

         if (var2.hasMaximum()) {
            this.setMaximumSpeed(var2.getMaximum());
         }
      }

      if (var1.hasHeartRate()) {
         ExerciseStatistics$PbHeartRateStatistics var3 = var1.getHeartRate();
         if (var3.hasMinimum()) {
            this.minimumHeartrate = var3.getMinimum();
         }

         if (var3.hasMaximum()) {
            this.maximumHeartrate = var3.getMaximum();
         }

         if (var3.hasAverage()) {
            this.averageHeartrate = var3.getAverage();
         }
      }

      if (var1.hasAltitude()) {
         ExerciseStatistics$PbAltitudeStatistics var4 = var1.getAltitude();
         if (var4.hasAverage()) {
            this.averageAltitude = var4.getAverage();
         }

         if (var4.hasMaximum()) {
            this.maximumAltitude = var4.getMaximum();
         }

         if (var4.hasMinimum()) {
            this.minimumAltitude = var4.getMinimum();
         }
      }

      if (var1.hasCadence()) {
         ExerciseStatistics$PbCadenceStatistics var5 = var1.getCadence();
         if (var5.hasAverage()) {
            this.averageCadence = var5.getAverage();
         }

         if (var5.hasMaximum()) {
            this.maximumCadence = var5.getMaximum();
         }
      }

      if (var1.hasSwimming()) {
         this.swimmingStatistics = new SwimmingStatistics(var1.getSwimming());
      }

   }

   public ExerciseStatistics(InputStream var1) {
      this(ExerciseStatistics$PbExerciseStatistics.parseFrom(var1));
   }

   public static int deleteAllByPath(String var0) {
      SwimmingStatistics.deleteAll(SwimmingStatistics.class, "PATH=?", new String[]{var0});
      SwimmingStyleStatistics.deleteAll(SwimmingStyleStatistics.class, "PATH=?", new String[]{var0});
      return deleteAll(ExerciseStatistics.class, "PATH=?", new String[]{var0});
   }

   private void updatePath() {
      if (this.getExercise() == null) {
         d.c(TAG, "", new IllegalStateException("No Exercise entity associated or loaded, cannot create path."));
      } else {
         this.path = this.getExercise().getPath();
      }

   }

   public float getAverageAltitude() {
      return this.averageAltitude;
   }

   public int getAverageCadence() {
      return this.averageCadence;
   }

   public int getAverageHeartrate() {
      return this.averageHeartrate;
   }

   public float getAverageSpeed() {
      return this.averageSpeed;
   }

   public String getBasename() {
      return "STATS";
   }

   public Exercise getExercise() {
      return this.exercise;
   }

   public float getMaximumAltitude() {
      return this.maximumAltitude;
   }

   public int getMaximumCadence() {
      return this.maximumCadence;
   }

   public int getMaximumHeartrate() {
      return this.maximumHeartrate;
   }

   public float getMaximumSpeed() {
      return this.maximumSpeed;
   }

   public float getMinimumAltitude() {
      return this.minimumAltitude;
   }

   public int getMinimumHeartrate() {
      return this.minimumHeartrate;
   }

   public String getPath() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      return this.path;
   }

   public SwimmingStatistics getSwimmingStatistics() {
      return this.swimmingStatistics;
   }

   public void merge(ExerciseStatistics var1) {
      this.averageSpeed = var1.averageSpeed;
      this.maximumSpeed = var1.maximumSpeed;
      this.averageHeartrate = var1.averageHeartrate;
      this.maximumHeartrate = var1.maximumHeartrate;
      this.minimumHeartrate = var1.minimumHeartrate;
      this.averageCadence = var1.averageCadence;
      this.maximumCadence = var1.maximumCadence;
   }

   public long save() {
      if (this.swimmingStatistics != null) {
         this.swimmingStatistics.setPath(this.getPath());
         this.swimmingStatistics.save();
      }

      return super.save();
   }

   public void setAverageAltitude(float var1) {
      this.averageAltitude = var1;
   }

   public void setAverageCadence(int var1) {
      this.averageCadence = var1;
   }

   public void setAverageHeartrate(int var1) {
      this.averageHeartrate = var1;
   }

   public void setAverageSpeed(float var1) {
      this.averageSpeed = var1;
   }

   public void setExercise(Exercise var1) {
      this.exercise = var1;
      this.updatePath();
   }

   public void setMaximumAltitude(float var1) {
      this.maximumAltitude = var1;
   }

   public void setMaximumCadence(int var1) {
      this.maximumCadence = var1;
   }

   public void setMaximumHeartrate(int var1) {
      this.maximumHeartrate = var1;
   }

   public void setMaximumSpeed(float var1) {
      this.maximumSpeed = var1;
   }

   public void setMinimumAltitude(float var1) {
      this.minimumAltitude = var1;
   }

   public void setMinimumHeartrate(int var1) {
      this.minimumHeartrate = var1;
   }

   public void setSwimmingStatistics(SwimmingStatistics var1) {
      this.swimmingStatistics = var1;
   }

   public ExerciseStatistics$PbExerciseStatistics toPbObject() {
      ExerciseStatistics$PbExerciseStatistics$Builder var1 = ExerciseStatistics$PbExerciseStatistics.newBuilder();
      if (this.getAverageSpeed() != -1.0F || this.getMaximumSpeed() != -1.0F) {
         ExerciseStatistics$PbSpeedStatistics$Builder var2 = ExerciseStatistics$PbSpeedStatistics.newBuilder();
         if (this.getAverageSpeed() != -1.0F) {
            var2.setAverage(this.getAverageSpeed());
         }

         if (this.getMaximumSpeed() != -1.0F) {
            var2.setMaximum(this.getMaximumSpeed());
         }

         var1.setSpeed(var2.build());
      }

      if (this.getAverageHeartrate() != 0 || this.getMaximumHeartrate() != 0 || this.getMinimumHeartrate() != 0) {
         ExerciseStatistics$PbHeartRateStatistics$Builder var3 = ExerciseStatistics$PbHeartRateStatistics.newBuilder();
         if (this.getAverageHeartrate() != 0) {
            var3.setAverage(this.getAverageHeartrate());
         }

         if (this.getMaximumHeartrate() != 0) {
            var3.setMaximum(this.getMaximumHeartrate());
         }

         if (this.getMinimumHeartrate() != 0) {
            var3.setMinimum(this.getMinimumHeartrate());
         }

         var1.setHeartRate(var3.build());
      }

      if (!Float.isNaN(this.getAverageAltitude()) || !Float.isNaN(this.getMaximumAltitude()) || !Float.isNaN(this.getMinimumAltitude())) {
         ExerciseStatistics$PbAltitudeStatistics$Builder var4 = ExerciseStatistics$PbAltitudeStatistics.newBuilder();
         if (!Float.isNaN(this.getAverageAltitude())) {
            var4.setAverage(this.getAverageAltitude());
         }

         if (!Float.isNaN(this.getMaximumAltitude())) {
            var4.setMaximum(this.getMaximumAltitude());
         }

         if (!Float.isNaN(this.getMinimumAltitude())) {
            var4.setMinimum(this.getMinimumAltitude());
         }

         var1.setAltitude(var4.build());
      }

      if (this.getAverageCadence() != -1 || this.getMaximumCadence() != -1) {
         ExerciseStatistics$PbCadenceStatistics$Builder var5 = ExerciseStatistics$PbCadenceStatistics.newBuilder();
         if (this.getAverageCadence() != -1) {
            var5.setAverage(this.getAverageCadence());
         }

         if (this.getMaximumCadence() != -1) {
            var5.setMaximum(this.getMaximumCadence());
         }

         var1.setCadence(var5.build());
      }

      if (this.swimmingStatistics != null) {
         var1.setSwimming(this.swimmingStatistics.toPbObject());
      }

      return var1.build();
   }

   public String toString() {
      String var1 = System.getProperty("line.separator");
      StringBuilder var2 = new StringBuilder();
      var2.append(var1 + "------------------");
      var2.append(this.getClass().getSimpleName() + var1);
      var2.append("------------------");
      return var2.toString();
   }
}
