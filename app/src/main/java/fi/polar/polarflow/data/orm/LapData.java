package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.data.Lap;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLap;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLap$Builder;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapCadenceStatistics;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapCadenceStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapHeader;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapHeader$Builder;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapHeader$PbAutolapType;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapHeartRateStatistics;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapHeartRateStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapSpeedStatistics;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapSpeedStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapStatistics;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapStatistics$Builder;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapSwimmingStatistics;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLapSwimmingStatistics$Builder;

public class LapData extends ProtoEncodableEntity {
   private float ascent = -1.0F;
   private int autoLapType = -1;
   private int avgCadence = -1;
   private float avgDurationOfPool = -1.0F;
   private int avgHR = -1;
   private float avgSpeed = -1.0F;
   private float descent = -1.0F;
   private float distance = -1.0F;
   private long durationMillis = -1L;
   private long exercise;
   private int lapStrokes = -1;
   private int maxCadence = -1;
   private int maxHR = -1;
   private float maxSpeed = -1.0F;
   private int minHR = -1;
   private int poolCount = -1;
   private long splitTimeMillis = -1L;

   public LapData() {
   }

   LapData(Lap var1) {
      this.autoLapType = var1.getAutoLapType();
      this.durationMillis = var1.getDurationMillis();
      this.distance = var1.getDistance();
      this.splitTimeMillis = var1.getSplitTimeMillis();
      this.avgHR = var1.getAvgHR();
      this.maxHR = var1.getMaxHR();
      this.minHR = var1.getMinHR();
      this.avgSpeed = var1.getAvgSpeed();
      this.maxSpeed = var1.getMaxSpeed();
      this.ascent = var1.getAscent();
      this.descent = var1.getDescent();
      this.avgCadence = var1.getAvgCadence();
      this.maxCadence = var1.getMaxCadence();
      this.lapStrokes = var1.getLapStrokes();
      this.poolCount = var1.getPoolCount();
      this.avgDurationOfPool = var1.getAvgDurationOfPool();
   }

   LapData(LapData var1) {
      this.exercise = var1.exercise;
      this.splitTimeMillis = var1.splitTimeMillis;
      this.durationMillis = var1.durationMillis;
      this.distance = var1.distance;
      this.ascent = var1.ascent;
      this.descent = var1.descent;
      this.autoLapType = var1.autoLapType;
      this.avgSpeed = var1.avgSpeed;
      this.maxSpeed = var1.maxSpeed;
      this.avgHR = var1.avgHR;
      this.maxHR = var1.maxHR;
      this.minHR = var1.minHR;
      this.avgCadence = var1.avgCadence;
      this.maxCadence = var1.maxCadence;
      this.lapStrokes = var1.lapStrokes;
      this.poolCount = var1.poolCount;
      this.avgDurationOfPool = var1.avgDurationOfPool;
   }

   LapData(ExerciseLap$PbLap var1) {
      if (var1.hasHeader()) {
         this.setSplitTimeMillis(q.a(var1.getHeader().getSplitTime()));
         this.setDurationMillis(q.a(var1.getHeader().getDuration()));
         if (var1.getHeader().hasDistance()) {
            this.setDistance(var1.getHeader().getDistance());
         }

         if (var1.getHeader().hasAscent()) {
            this.setAscent(var1.getHeader().getAscent());
         }

         if (var1.getHeader().hasDescent()) {
            this.setDescent(var1.getHeader().getDescent());
         }

         if (var1.getHeader().hasAutolapType()) {
            this.setAutoLapType(var1.getHeader().getAutolapType().getNumber());
         }
      }

      if (var1.hasStatistics()) {
         if (var1.getStatistics().hasSpeed()) {
            if (var1.getStatistics().getSpeed().hasAverage()) {
               this.setAvgSpeed(var1.getStatistics().getSpeed().getAverage());
            }

            if (var1.getStatistics().getSpeed().hasMaximum()) {
               this.setMaxSpeed(var1.getStatistics().getSpeed().getMaximum());
            }
         }

         if (var1.getStatistics().hasHeartRate()) {
            if (var1.getStatistics().getHeartRate().hasAverage()) {
               this.setAvgHR(var1.getStatistics().getHeartRate().getAverage());
            }

            if (var1.getStatistics().getHeartRate().hasMaximum()) {
               this.setMaxHR(var1.getStatistics().getHeartRate().getMaximum());
            }

            if (var1.getStatistics().getHeartRate().hasMinimum()) {
               this.setMinHR(var1.getStatistics().getHeartRate().getMinimum());
            }
         }

         if (var1.getStatistics().hasCadence()) {
            if (var1.getStatistics().getCadence().hasAverage()) {
               this.setAvgCadence(var1.getStatistics().getCadence().getAverage());
            }

            if (var1.getStatistics().getCadence().hasMaximum()) {
               this.setMaxCadence(var1.getStatistics().getCadence().getMaximum());
            }
         }

         if (var1.getStatistics().hasSwimmingStatistics()) {
            ExerciseLap$PbLapSwimmingStatistics var2 = var1.getStatistics().getSwimmingStatistics();
            if (var2.hasLapStrokes()) {
               this.setLapStrokes(var2.getLapStrokes());
            }

            if (var2.hasPoolCount()) {
               this.setPoolCount(var2.getPoolCount());
            }

            if (var2.hasAvgDurationOfPool()) {
               this.setAvgDurationOfPool(var2.getAvgDurationOfPool());
            }
         }
      }

   }

   float getAscent() {
      return this.ascent;
   }

   int getAutoLapType() {
      return this.autoLapType;
   }

   public int getAvgCadence() {
      return this.avgCadence;
   }

   public float getAvgDurationOfPool() {
      return this.avgDurationOfPool;
   }

   int getAvgHR() {
      return this.avgHR;
   }

   float getAvgSpeed() {
      return this.avgSpeed;
   }

   float getDescent() {
      return this.descent;
   }

   float getDistance() {
      return this.distance;
   }

   long getDurationMillis() {
      return this.durationMillis;
   }

   public int getLapStrokes() {
      return this.lapStrokes;
   }

   public int getMaxCadence() {
      return this.maxCadence;
   }

   int getMaxHR() {
      return this.maxHR;
   }

   float getMaxSpeed() {
      return this.maxSpeed;
   }

   int getMinHR() {
      return this.minHR;
   }

   public int getPoolCount() {
      return this.poolCount;
   }

   long getSplitTimeMillis() {
      return this.splitTimeMillis;
   }

   void setAscent(float var1) {
      this.ascent = var1;
   }

   void setAutoLapType(int var1) {
      this.autoLapType = var1;
   }

   public void setAvgCadence(int var1) {
      this.avgCadence = var1;
   }

   public void setAvgDurationOfPool(float var1) {
      this.avgDurationOfPool = var1;
   }

   void setAvgHR(int var1) {
      this.avgHR = var1;
   }

   void setAvgSpeed(float var1) {
      this.avgSpeed = var1;
   }

   void setDescent(float var1) {
      this.descent = var1;
   }

   void setDistance(float var1) {
      this.distance = var1;
   }

   void setDurationMillis(long var1) {
      this.durationMillis = var1;
   }

   void setExerciseId(long var1) {
      this.exercise = var1;
   }

   public void setLapStrokes(int var1) {
      this.lapStrokes = var1;
   }

   public void setMaxCadence(int var1) {
      this.maxCadence = var1;
   }

   void setMaxHR(int var1) {
      this.maxHR = var1;
   }

   void setMaxSpeed(float var1) {
      this.maxSpeed = var1;
   }

   void setMinHR(int var1) {
      this.minHR = var1;
   }

   public void setPoolCount(int var1) {
      this.poolCount = var1;
   }

   void setSplitTimeMillis(long var1) {
      this.splitTimeMillis = var1;
   }

   public ExerciseLap$PbLap toPbObject() {
      ExerciseLap$PbLap$Builder var1 = ExerciseLap$PbLap.newBuilder();
      ExerciseLap$PbLapHeader$Builder var2 = ExerciseLap$PbLapHeader.newBuilder();
      var2.setSplitTime(q.b(this.getSplitTimeMillis()));
      var2.setDuration(q.b(this.getDurationMillis()));
      if (this.getDistance() != -1.0F) {
         var2.setDistance(this.getDistance());
      }

      if (this.getAscent() != -1.0F) {
         var2.setAscent(this.getAscent());
      }

      if (this.getDescent() != -1.0F) {
         var2.setDescent(this.getDescent());
      }

      if (this.getAutoLapType() != -1) {
         var2.setAutolapType(ExerciseLap$PbLapHeader$PbAutolapType.forNumber(this.getAutoLapType()));
      }

      ExerciseLap$PbLapStatistics$Builder var3 = ExerciseLap$PbLapStatistics.newBuilder();
      ExerciseLap$PbLapSpeedStatistics$Builder var4 = ExerciseLap$PbLapSpeedStatistics.newBuilder();
      if (this.getAvgSpeed() != -1.0F) {
         var4.setAverage(this.getAvgSpeed());
      }

      if (this.getMaxSpeed() != -1.0F) {
         var4.setMaximum(this.getMaxSpeed());
      }

      if (var4.hasAverage() || var4.hasMaximum()) {
         var3.setSpeed(var4);
      }

      ExerciseLap$PbLapHeartRateStatistics$Builder var5 = ExerciseLap$PbLapHeartRateStatistics.newBuilder();
      if (this.getAvgHR() != -1) {
         var5.setAverage(this.getAvgHR());
      }

      if (this.getMaxHR() != -1) {
         var5.setMaximum(this.getMaxHR());
      }

      if (this.getMinHR() != -1) {
         var5.setMinimum(this.getMinHR());
      }

      if (var5.hasAverage() || var5.hasMaximum() || var5.hasMinimum()) {
         var3.setHeartRate(var5);
      }

      ExerciseLap$PbLapCadenceStatistics$Builder var6 = ExerciseLap$PbLapCadenceStatistics.newBuilder();
      if (this.getAvgCadence() != -1) {
         var6.setAverage(this.getAvgCadence());
      }

      if (this.getMaxCadence() != -1) {
         var6.setMaximum(this.getMaxCadence());
      }

      if (var6.hasAverage() || var6.hasMaximum()) {
         var3.setCadence(var6);
      }

      ExerciseLap$PbLapSwimmingStatistics$Builder var7 = ExerciseLap$PbLapSwimmingStatistics.newBuilder();
      if (this.getLapStrokes() != -1) {
         var7.setLapStrokes(this.getLapStrokes());
      }

      if (this.getPoolCount() != -1) {
         var7.setPoolCount(this.getPoolCount());
      }

      if (this.getAvgDurationOfPool() != -1.0F) {
         var7.setAvgDurationOfPool(this.getAvgDurationOfPool());
      }

      if (var7.hasLapStrokes() || var7.hasPoolCount() || var7.hasAvgDurationOfPool()) {
         var3.setSwimmingStatistics(var7);
      }

      if (var3.hasSpeed() || var3.hasHeartRate() || var3.hasCadence() || var3.hasSwimmingStatistics()) {
         var1.setStatistics(var3);
      }

      var1.setHeader(var2);
      return var1.build();
   }
}
