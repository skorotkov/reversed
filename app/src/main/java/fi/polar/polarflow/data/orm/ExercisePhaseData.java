package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExercisePhaseStats$PbPhaseHeartRateStatistics;
import fi.polar.remote.representation.protobuf.ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExercisePhaseStats$PbPhaseRepetition;
import fi.polar.remote.representation.protobuf.ExercisePhaseStats$PbPhaseRepetition$Builder;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbCadenceStatistics;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbCadenceStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbPowerStatistics;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbPowerStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbSpeedStatistics;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbSpeedStatistics$Builder;
import java.io.InputStream;

public class ExercisePhaseData extends ProtoEncodableEntity {
   private float ascent;
   private int avgCadence;
   private int avgHR;
   private int avgPower;
   private float avgSpeed;
   private float descent;
   private float distance;
   private long duration;
   private long inTargetZone;
   private int maxCadence;
   private int maxHR;
   private int maxPower;
   private float maxSpeed;
   private int phaseFinished;
   private int phaseIndex;
   private ExercisePhaseStats phaseStats;
   private float splitDistance;
   private long splitTime;

   public ExercisePhaseData() {
      this.phaseIndex = -1;
      this.splitTime = -1L;
      this.duration = -1L;
      this.phaseFinished = -1;
      this.splitDistance = -1.0F;
      this.distance = -1.0F;
      this.inTargetZone = -1L;
      this.avgHR = -1;
      this.maxHR = -1;
      this.maxSpeed = -1.0F;
      this.avgSpeed = -1.0F;
      this.avgPower = -1;
      this.maxPower = -1;
      this.ascent = -1.0F;
      this.descent = -1.0F;
      this.maxCadence = -1;
      this.avgCadence = -1;
   }

   public ExercisePhaseData(ExercisePhaseData var1) {
      this.phaseIndex = -1;
      this.splitTime = -1L;
      this.duration = -1L;
      this.phaseFinished = -1;
      this.splitDistance = -1.0F;
      this.distance = -1.0F;
      this.inTargetZone = -1L;
      this.avgHR = -1;
      this.maxHR = -1;
      this.maxSpeed = -1.0F;
      this.avgSpeed = -1.0F;
      this.avgPower = -1;
      this.maxPower = -1;
      this.ascent = -1.0F;
      this.descent = -1.0F;
      this.maxCadence = -1;
      this.avgCadence = -1;
      this.phaseStats = var1.phaseStats;
      this.phaseIndex = var1.phaseIndex;
      this.splitTime = var1.splitTime;
      this.duration = var1.duration;
      this.phaseFinished = var1.phaseFinished;
      this.splitDistance = var1.splitDistance;
      this.distance = var1.distance;
      this.inTargetZone = var1.inTargetZone;
      this.avgHR = var1.avgHR;
      this.maxHR = var1.maxHR;
      this.avgSpeed = var1.avgSpeed;
      this.maxSpeed = var1.maxSpeed;
      this.avgPower = var1.avgPower;
      this.maxPower = var1.maxPower;
      this.ascent = var1.ascent;
      this.descent = var1.descent;
      this.avgCadence = var1.avgCadence;
      this.maxCadence = var1.maxCadence;
   }

   public ExercisePhaseData(ExercisePhaseStats$PbPhaseRepetition var1) {
      this();
      if (var1.hasIndex()) {
         this.phaseIndex = var1.getIndex();
      }

      if (var1.hasSplitTime()) {
         this.splitTime = q.a(var1.getSplitTime());
      }

      if (var1.hasDuration()) {
         this.duration = q.a(var1.getDuration());
      }

      if (var1.hasPhaseFinished()) {
         byte var2;
         if (var1.getPhaseFinished()) {
            var2 = 1;
         } else {
            var2 = 0;
         }

         this.phaseFinished = var2;
      }

      if (var1.hasSplitDistance()) {
         this.splitDistance = var1.getSplitDistance();
      }

      if (var1.hasDistance()) {
         this.distance = var1.getDistance();
      }

      if (var1.hasInTargetZone()) {
         this.inTargetZone = q.a(var1.getInTargetZone());
      }

      if (var1.hasHeartRate()) {
         ExercisePhaseStats$PbPhaseHeartRateStatistics var3 = var1.getHeartRate();
         if (var3.hasAverage()) {
            this.avgHR = var3.getAverage();
         }

         if (var3.hasMaximum()) {
            this.maxHR = var3.getMaximum();
         }
      }

      if (var1.hasSpeed()) {
         ExerciseStatistics$PbSpeedStatistics var5 = var1.getSpeed();
         if (var5.hasAverage()) {
            this.avgSpeed = var5.getAverage();
         }

         if (var5.hasMaximum()) {
            this.maxSpeed = var5.getMaximum();
         }
      }

      if (var1.hasPower()) {
         ExerciseStatistics$PbPowerStatistics var6 = var1.getPower();
         if (var6.hasAverage()) {
            this.avgPower = var6.getAverage();
         }

         if (var6.hasMaximum()) {
            this.maxPower = var6.getMaximum();
         }
      }

      if (var1.hasAscent()) {
         this.setAscent(var1.getAscent());
      }

      if (var1.hasDescent()) {
         this.setDescent(var1.getDescent());
      }

      if (var1.hasCadence()) {
         ExerciseStatistics$PbCadenceStatistics var4 = var1.getCadence();
         if (var4.hasAverage()) {
            this.avgCadence = var4.getAverage();
         }

         if (var4.hasMaximum()) {
            this.maxCadence = var4.getMaximum();
         }
      }

   }

   public ExercisePhaseData(InputStream var1) {
      this(ExercisePhaseStats$PbPhaseRepetition.parseFrom(var1));
   }

   public float getAscent() {
      return this.ascent;
   }

   public int getAvgCadence() {
      return this.avgCadence;
   }

   public int getAvgHR() {
      return this.avgHR;
   }

   public int getAvgPower() {
      return this.avgPower;
   }

   public float getAvgSpeed() {
      return this.avgSpeed;
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

   public long getInTargetZone() {
      return this.inTargetZone;
   }

   public int getIndex() {
      return this.phaseIndex;
   }

   public int getMaxCadence() {
      return this.maxCadence;
   }

   public int getMaxHR() {
      return this.maxHR;
   }

   public int getMaxPower() {
      return this.maxPower;
   }

   public float getMaxSpeed() {
      return this.maxSpeed;
   }

   public int getPhaseFinished() {
      return this.phaseFinished;
   }

   public ExercisePhaseStats getPhaseStats() {
      return this.phaseStats;
   }

   public float getSplitDistance() {
      return this.splitDistance;
   }

   public long getSplitTime() {
      return this.splitTime;
   }

   public void setAscent(float var1) {
      this.ascent = var1;
   }

   public void setAvgCadence(int var1) {
      this.avgCadence = var1;
   }

   public void setAvgHR(int var1) {
      this.avgHR = var1;
   }

   public void setAvgPower(int var1) {
      this.avgPower = var1;
   }

   public void setAvgSpeed(float var1) {
      this.avgSpeed = var1;
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

   public void setInTargetZone(long var1) {
      this.inTargetZone = var1;
   }

   public void setIndex(int var1) {
      this.phaseIndex = var1;
   }

   public void setMaxCadence(int var1) {
      this.maxCadence = var1;
   }

   public void setMaxHR(int var1) {
      this.maxHR = var1;
   }

   public void setMaxPower(int var1) {
      this.maxPower = var1;
   }

   public void setMaxSpeed(float var1) {
      this.maxSpeed = var1;
   }

   public void setPhaseFinished(int var1) {
      this.phaseFinished = var1;
   }

   public void setPhaseFinished(boolean var1) {
      byte var2;
      if (var1) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      this.phaseFinished = var2;
   }

   public void setPhaseStats(ExercisePhaseStats var1) {
      this.phaseStats = var1;
   }

   public void setSplitDistance(float var1) {
      this.splitDistance = var1;
   }

   public void setSplitTime(long var1) {
      this.splitTime = var1;
   }

   public ExercisePhaseStats$PbPhaseRepetition toPbObject() {
      boolean var1 = true;
      ExercisePhaseStats$PbPhaseRepetition$Builder var2 = ExercisePhaseStats$PbPhaseRepetition.newBuilder();
      if (this.getIndex() != -1) {
         var2.setIndex(this.getIndex());
      }

      if (this.getSplitTime() != -1L) {
         var2.setSplitTime(q.b(this.getSplitTime()));
      }

      if (this.getDuration() != -1L) {
         var2.setDuration(q.b(this.getDuration()));
      }

      if (this.getPhaseFinished() != -1) {
         if (this.getPhaseFinished() != 1) {
            var1 = false;
         }

         var2.setPhaseFinished(var1);
      }

      if (this.getSplitDistance() != -1.0F) {
         var2.setSplitDistance(this.getSplitDistance());
      }

      if (this.getDistance() != -1.0F) {
         var2.setDistance(this.getDistance());
      }

      if (this.getInTargetZone() != -1L) {
         var2.setInTargetZone(q.b(this.getInTargetZone()));
      }

      ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder var3 = ExercisePhaseStats$PbPhaseHeartRateStatistics.newBuilder();
      if (this.getAvgHR() != -1) {
         var3.setAverage(this.getAvgHR());
      }

      if (this.getMaxHR() != -1) {
         var3.setMaximum(this.getMaxHR());
      }

      if (var3.hasAverage() || var3.hasMaximum()) {
         var2.setHeartRate(var3);
      }

      ExerciseStatistics$PbSpeedStatistics$Builder var4 = ExerciseStatistics$PbSpeedStatistics.newBuilder();
      if (this.getAvgSpeed() != -1.0F) {
         var4.setAverage(this.getAvgSpeed());
      }

      if (this.getMaxSpeed() != -1.0F) {
         var4.setMaximum(this.getMaxSpeed());
      }

      if (var4.hasAverage() || var4.hasMaximum()) {
         var2.setSpeed(var4);
      }

      ExerciseStatistics$PbPowerStatistics$Builder var5 = ExerciseStatistics$PbPowerStatistics.newBuilder();
      if (this.getAvgPower() != -1) {
         var5.setAverage(this.getAvgPower());
      }

      if (this.getMaxPower() != -1) {
         var5.setMaximum(this.getMaxPower());
      }

      if (var5.hasAverage() || var5.hasMaximum()) {
         var2.setPower(var5);
      }

      if (this.getAscent() != -1.0F) {
         var2.setAscent(this.getAscent());
      }

      if (this.getDescent() != -1.0F) {
         var2.setDescent(this.getDescent());
      }

      ExerciseStatistics$PbCadenceStatistics$Builder var6 = ExerciseStatistics$PbCadenceStatistics.newBuilder();
      if (this.getAvgCadence() != -1) {
         var6.setAverage(this.getAvgCadence());
      }

      if (this.getMaxCadence() != -1) {
         var6.setMaximum(this.getMaxCadence());
      }

      if (var6.hasAverage() || var6.hasMaximum()) {
         var2.setCadence(var6);
      }

      return var2.build();
   }
}
