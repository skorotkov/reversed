package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.Internal.ListAdapter;
import com.google.protobuf.Internal.ListAdapter.Converter;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class Training$PbExerciseBase extends GeneratedMessageV3 implements Training$PbExerciseBaseOrBuilder {
   public static final int ACCUMULATED_TORQUE_FIELD_NUMBER = 20;
   public static final int ASCENT_FIELD_NUMBER = 10;
   public static final int AVAILABLE_SENSOR_FEATURES_FIELD_NUMBER = 7;
   public static final int CALORIES_FIELD_NUMBER = 5;
   public static final int CYCLING_POWER_ENERGY_FIELD_NUMBER = 21;
   private static final Training$PbExerciseBase DEFAULT_INSTANCE = new Training$PbExerciseBase();
   public static final int DESCENT_FIELD_NUMBER = 11;
   public static final int DEVICE_LOCATION_FIELD_NUMBER = 23;
   public static final int DISTANCE_FIELD_NUMBER = 4;
   public static final int DURATION_FIELD_NUMBER = 2;
   public static final int EXERCISE_COUNTERS_FIELD_NUMBER = 16;
   public static final int LATITUDE_FIELD_NUMBER = 12;
   public static final int LONGITUDE_FIELD_NUMBER = 13;
   public static final int OBSOLETE_SPEED_CALIBRATION_OFFSET_FIELD_NUMBER = 17;
   @Deprecated
   public static final Parser PARSER = new Training$PbExerciseBase$2();
   public static final int PLACE_FIELD_NUMBER = 14;
   public static final int RUNNING_INDEX_FIELD_NUMBER = 9;
   public static final int SENSOR_CALIBRATION_OFFSET_FIELD_NUMBER = 22;
   public static final int SPORT_FIELD_NUMBER = 3;
   public static final int START_FIELD_NUMBER = 1;
   public static final int TRAINING_LOAD_FIELD_NUMBER = 6;
   public static final int WALKING_DISTANCE_FIELD_NUMBER = 18;
   public static final int WALKING_DURATION_FIELD_NUMBER = 19;
   private static final Converter availableSensorFeatures_converter_ = new Training$PbExerciseBase$1();
   private static final long serialVersionUID = 0L;
   private int accumulatedTorque_;
   private float ascent_;
   private List availableSensorFeatures_;
   private int bitField0_;
   private int calories_;
   private int cyclingPowerEnergy_;
   private float descent_;
   private int deviceLocation_;
   private float distance_;
   private Types$PbDuration duration_;
   private Training$PbExerciseCounters exerciseCounters_;
   private double latitude_;
   private double longitude_;
   private byte memoizedIsInitialized;
   private float oBSOLETESpeedCalibrationOffset_;
   private volatile Object place_;
   private Structures$PbRunningIndex runningIndex_;
   private List sensorCalibrationOffset_;
   private Structures$PbSportIdentifier sport_;
   private Types$PbLocalDateTime start_;
   private Structures$PbTrainingLoad trainingLoad_;
   private float walkingDistance_;
   private Types$PbDuration walkingDuration_;

   private Training$PbExerciseBase() {
      this.memoizedIsInitialized = (byte)-1;
      this.distance_ = 0.0F;
      this.calories_ = 0;
      this.availableSensorFeatures_ = Collections.emptyList();
      this.ascent_ = 0.0F;
      this.descent_ = 0.0F;
      this.latitude_ = 0.0D;
      this.longitude_ = 0.0D;
      this.place_ = "";
      this.oBSOLETESpeedCalibrationOffset_ = 0.0F;
      this.walkingDistance_ = 0.0F;
      this.accumulatedTorque_ = 0;
      this.cyclingPowerEnergy_ = 0;
      this.sensorCalibrationOffset_ = Collections.emptyList();
      this.deviceLocation_ = 0;
   }

   private Training$PbExerciseBase(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Training$PbExerciseBase(CodedInputStream var1, ExtensionRegistryLite var2, Training$1 var3) {
      this(var1, var2);
   }

   private Training$PbExerciseBase(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Training$PbExerciseBase(Builder var1, Training$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static double a(Training$PbExerciseBase var0, double var1) {
      var0.latitude_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float a(Training$PbExerciseBase var0, float var1) {
      var0.distance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Training$PbExerciseBase var0, int var1) {
      var0.calories_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbRunningIndex a(Training$PbExerciseBase var0, Structures$PbRunningIndex var1) {
      var0.runningIndex_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbSportIdentifier a(Training$PbExerciseBase var0, Structures$PbSportIdentifier var1) {
      var0.sport_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbTrainingLoad a(Training$PbExerciseBase var0, Structures$PbTrainingLoad var1) {
      var0.trainingLoad_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Training$PbExerciseCounters a(Training$PbExerciseBase var0, Training$PbExerciseCounters var1) {
      var0.exerciseCounters_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Training$PbExerciseBase var0, Types$PbDuration var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(Training$PbExerciseBase var0, Types$PbLocalDateTime var1) {
      var0.start_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(Training$PbExerciseBase var0, Object var1) {
      var0.place_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(Training$PbExerciseBase var0) {
      return var0.availableSensorFeatures_;
   }

   // $FF: synthetic method
   static List a(Training$PbExerciseBase var0, List var1) {
      var0.availableSensorFeatures_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static double b(Training$PbExerciseBase var0, double var1) {
      var0.longitude_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float b(Training$PbExerciseBase var0, float var1) {
      var0.ascent_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Training$PbExerciseBase var0, int var1) {
      var0.accumulatedTorque_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(Training$PbExerciseBase var0, Types$PbDuration var1) {
      var0.walkingDuration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object b(Training$PbExerciseBase var0) {
      return var0.place_;
   }

   // $FF: synthetic method
   static List b(Training$PbExerciseBase var0, List var1) {
      var0.sensorCalibrationOffset_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static float c(Training$PbExerciseBase var0, float var1) {
      var0.descent_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(Training$PbExerciseBase var0, int var1) {
      var0.cyclingPowerEnergy_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List c(Training$PbExerciseBase var0) {
      return var0.sensorCalibrationOffset_;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static float d(Training$PbExerciseBase var0, float var1) {
      var0.oBSOLETESpeedCalibrationOffset_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(Training$PbExerciseBase var0, int var1) {
      var0.deviceLocation_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Converter d() {
      return availableSensorFeatures_converter_;
   }

   // $FF: synthetic method
   static UnknownFieldSet d(Training$PbExerciseBase var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static float e(Training$PbExerciseBase var0, float var1) {
      var0.walkingDistance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(Training$PbExerciseBase var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Training$PbExerciseBase getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Training.c();
   }

   public static Training$PbExerciseBase$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Training$PbExerciseBase$Builder newBuilder(Training$PbExerciseBase var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Training$PbExerciseBase parseDelimitedFrom(InputStream var0) {
      return (Training$PbExerciseBase)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Training$PbExerciseBase parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Training$PbExerciseBase)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Training$PbExerciseBase parseFrom(ByteString var0) {
      return (Training$PbExerciseBase)PARSER.parseFrom(var0);
   }

   public static Training$PbExerciseBase parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Training$PbExerciseBase)PARSER.parseFrom(var0, var1);
   }

   public static Training$PbExerciseBase parseFrom(CodedInputStream var0) {
      return (Training$PbExerciseBase)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Training$PbExerciseBase parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Training$PbExerciseBase)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Training$PbExerciseBase parseFrom(InputStream var0) {
      return (Training$PbExerciseBase)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Training$PbExerciseBase parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Training$PbExerciseBase)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Training$PbExerciseBase parseFrom(byte[] var0) {
      return (Training$PbExerciseBase)PARSER.parseFrom(var0);
   }

   public static Training$PbExerciseBase parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Training$PbExerciseBase)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Training$PbExerciseBase)) {
            var2 = super.equals(var1);
         } else {
            Training$PbExerciseBase var5 = (Training$PbExerciseBase)var1;
            boolean var3;
            if (this.hasStart() == var5.hasStart()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStart()) {
               if (var3 && this.getStart().equals(var5.getStart())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDuration() == var5.hasDuration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDuration()) {
               if (var3 && this.getDuration().equals(var5.getDuration())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSport() == var5.hasSport()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSport()) {
               if (var4 && this.getSport().equals(var5.getSport())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDistance() == var5.hasDistance()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDistance()) {
               if (var4 && Float.floatToIntBits(this.getDistance()) == Float.floatToIntBits(var5.getDistance())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasCalories() == var5.hasCalories()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasCalories()) {
               if (var4 && this.getCalories() == var5.getCalories()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasTrainingLoad() == var5.hasTrainingLoad()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTrainingLoad()) {
               if (var4 && this.getTrainingLoad().equals(var5.getTrainingLoad())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.availableSensorFeatures_.equals(var5.availableSensorFeatures_)) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.hasRunningIndex() == var5.hasRunningIndex()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasRunningIndex()) {
               if (var3 && this.getRunningIndex().equals(var5.getRunningIndex())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAscent() == var5.hasAscent()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAscent()) {
               if (var3 && Float.floatToIntBits(this.getAscent()) == Float.floatToIntBits(var5.getAscent())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDescent() == var5.hasDescent()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDescent()) {
               if (var4 && Float.floatToIntBits(this.getDescent()) == Float.floatToIntBits(var5.getDescent())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasLatitude() == var5.hasLatitude()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLatitude()) {
               if (var4 && Double.doubleToLongBits(this.getLatitude()) == Double.doubleToLongBits(var5.getLatitude())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasLongitude() == var5.hasLongitude()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLongitude()) {
               if (var4 && Double.doubleToLongBits(this.getLongitude()) == Double.doubleToLongBits(var5.getLongitude())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPlace() == var5.hasPlace()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPlace()) {
               if (var4 && this.getPlace().equals(var5.getPlace())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasExerciseCounters() == var5.hasExerciseCounters()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasExerciseCounters()) {
               if (var4 && this.getExerciseCounters().equals(var5.getExerciseCounters())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasOBSOLETESpeedCalibrationOffset() == var5.hasOBSOLETESpeedCalibrationOffset()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasOBSOLETESpeedCalibrationOffset()) {
               if (var3 && Float.floatToIntBits(this.getOBSOLETESpeedCalibrationOffset()) == Float.floatToIntBits(var5.getOBSOLETESpeedCalibrationOffset())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasWalkingDistance() == var5.hasWalkingDistance()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasWalkingDistance()) {
               if (var3 && Float.floatToIntBits(this.getWalkingDistance()) == Float.floatToIntBits(var5.getWalkingDistance())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasWalkingDuration() == var5.hasWalkingDuration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasWalkingDuration()) {
               if (var3 && this.getWalkingDuration().equals(var5.getWalkingDuration())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAccumulatedTorque() == var5.hasAccumulatedTorque()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAccumulatedTorque()) {
               if (var4 && this.getAccumulatedTorque() == var5.getAccumulatedTorque()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasCyclingPowerEnergy() == var5.hasCyclingPowerEnergy()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasCyclingPowerEnergy()) {
               if (var3 && this.getCyclingPowerEnergy() == var5.getCyclingPowerEnergy()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getSensorCalibrationOffsetList().equals(var5.getSensorCalibrationOffsetList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.hasDeviceLocation() == var5.hasDeviceLocation()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDeviceLocation()) {
               if (var4 && this.deviceLocation_ == var5.deviceLocation_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public int getAccumulatedTorque() {
      return this.accumulatedTorque_;
   }

   public float getAscent() {
      return this.ascent_;
   }

   public Types$PbFeatureType getAvailableSensorFeatures(int var1) {
      return (Types$PbFeatureType)availableSensorFeatures_converter_.convert(this.availableSensorFeatures_.get(var1));
   }

   public int getAvailableSensorFeaturesCount() {
      return this.availableSensorFeatures_.size();
   }

   public List getAvailableSensorFeaturesList() {
      return new ListAdapter(this.availableSensorFeatures_, availableSensorFeatures_converter_);
   }

   public int getCalories() {
      return this.calories_;
   }

   public int getCyclingPowerEnergy() {
      return this.cyclingPowerEnergy_;
   }

   public Training$PbExerciseBase getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getDescent() {
      return this.descent_;
   }

   public Types$PbDeviceLocation getDeviceLocation() {
      Types$PbDeviceLocation var1 = Types$PbDeviceLocation.valueOf(this.deviceLocation_);
      Types$PbDeviceLocation var2 = var1;
      if (var1 == null) {
         var2 = Types$PbDeviceLocation.DEVICE_LOCATION_UNDEFINED;
      }

      return var2;
   }

   public float getDistance() {
      return this.distance_;
   }

   public Types$PbDuration getDuration() {
      Types$PbDuration var1;
      if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return var1;
   }

   public Training$PbExerciseCounters getExerciseCounters() {
      Training$PbExerciseCounters var1;
      if (this.exerciseCounters_ == null) {
         var1 = Training$PbExerciseCounters.getDefaultInstance();
      } else {
         var1 = this.exerciseCounters_;
      }

      return var1;
   }

   public Training$PbExerciseCountersOrBuilder getExerciseCountersOrBuilder() {
      Training$PbExerciseCounters var1;
      if (this.exerciseCounters_ == null) {
         var1 = Training$PbExerciseCounters.getDefaultInstance();
      } else {
         var1 = this.exerciseCounters_;
      }

      return var1;
   }

   public double getLatitude() {
      return this.latitude_;
   }

   public double getLongitude() {
      return this.longitude_;
   }

   public float getOBSOLETESpeedCalibrationOffset() {
      return this.oBSOLETESpeedCalibrationOffset_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public String getPlace() {
      Object var1 = this.place_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.place_ = var3;
         }
      }

      return var3;
   }

   public ByteString getPlaceBytes() {
      Object var1 = this.place_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.place_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Structures$PbRunningIndex getRunningIndex() {
      Structures$PbRunningIndex var1;
      if (this.runningIndex_ == null) {
         var1 = Structures$PbRunningIndex.getDefaultInstance();
      } else {
         var1 = this.runningIndex_;
      }

      return var1;
   }

   public Structures$PbRunningIndexOrBuilder getRunningIndexOrBuilder() {
      Structures$PbRunningIndex var1;
      if (this.runningIndex_ == null) {
         var1 = Structures$PbRunningIndex.getDefaultInstance();
      } else {
         var1 = this.runningIndex_;
      }

      return var1;
   }

   public Types$PbSensorCalibrationOffset getSensorCalibrationOffset(int var1) {
      return (Types$PbSensorCalibrationOffset)this.sensorCalibrationOffset_.get(var1);
   }

   public int getSensorCalibrationOffsetCount() {
      return this.sensorCalibrationOffset_.size();
   }

   public List getSensorCalibrationOffsetList() {
      return this.sensorCalibrationOffset_;
   }

   public Types$PbSensorCalibrationOffsetOrBuilder getSensorCalibrationOffsetOrBuilder(int var1) {
      return (Types$PbSensorCalibrationOffsetOrBuilder)this.sensorCalibrationOffset_.get(var1);
   }

   public List getSensorCalibrationOffsetOrBuilderList() {
      return this.sensorCalibrationOffset_;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         int var3;
         if ((this.bitField0_ & 1) == 1) {
            var3 = CodedOutputStream.computeMessageSize(1, this.getStart()) + 0;
         } else {
            var3 = 0;
         }

         var2 = var3;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var3 + CodedOutputStream.computeMessageSize(2, this.getDuration());
         }

         var3 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var3 = var2 + CodedOutputStream.computeMessageSize(3, this.getSport());
         }

         var2 = var3;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var3 + CodedOutputStream.computeFloatSize(4, this.distance_);
         }

         var3 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var3 = var2 + CodedOutputStream.computeUInt32Size(5, this.calories_);
         }

         if ((this.bitField0_ & 32) == 32) {
            var2 = var3 + CodedOutputStream.computeMessageSize(6, this.getTrainingLoad());
         } else {
            var2 = var3;
         }

         int var4 = 0;

         for(var3 = 0; var4 < this.availableSensorFeatures_.size(); ++var4) {
            var3 += CodedOutputStream.computeEnumSizeNoTag((Integer)this.availableSensorFeatures_.get(var4));
         }

         var3 = var2 + var3 + this.availableSensorFeatures_.size() * 1;
         var2 = var3;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var3 + CodedOutputStream.computeMessageSize(9, this.getRunningIndex());
         }

         var3 = var2;
         if ((this.bitField0_ & 128) == 128) {
            var3 = var2 + CodedOutputStream.computeFloatSize(10, this.ascent_);
         }

         var4 = var3;
         if ((this.bitField0_ & 256) == 256) {
            var4 = var3 + CodedOutputStream.computeFloatSize(11, this.descent_);
         }

         var2 = var4;
         if ((this.bitField0_ & 512) == 512) {
            var2 = var4 + CodedOutputStream.computeDoubleSize(12, this.latitude_);
         }

         var3 = var2;
         if ((this.bitField0_ & 1024) == 1024) {
            var3 = var2 + CodedOutputStream.computeDoubleSize(13, this.longitude_);
         }

         var2 = var3;
         if ((this.bitField0_ & 2048) == 2048) {
            var2 = var3 + GeneratedMessageV3.computeStringSize(14, this.place_);
         }

         var4 = var2;
         if ((this.bitField0_ & 4096) == 4096) {
            var4 = var2 + CodedOutputStream.computeMessageSize(16, this.getExerciseCounters());
         }

         var3 = var4;
         if ((this.bitField0_ & 8192) == 8192) {
            var3 = var4 + CodedOutputStream.computeFloatSize(17, this.oBSOLETESpeedCalibrationOffset_);
         }

         var2 = var3;
         if ((this.bitField0_ & 16384) == 16384) {
            var2 = var3 + CodedOutputStream.computeFloatSize(18, this.walkingDistance_);
         }

         var3 = var2;
         if ((this.bitField0_ & '耀') == 32768) {
            var3 = var2 + CodedOutputStream.computeMessageSize(19, this.getWalkingDuration());
         }

         var2 = var3;
         if ((this.bitField0_ & 65536) == 65536) {
            var2 = var3 + CodedOutputStream.computeUInt32Size(20, this.accumulatedTorque_);
         }

         var3 = var2;
         if ((this.bitField0_ & 131072) == 131072) {
            var3 = var2 + CodedOutputStream.computeUInt32Size(21, this.cyclingPowerEnergy_);
         }

         var2 = var3;

         for(var3 = var1; var3 < this.sensorCalibrationOffset_.size(); var2 += var4) {
            var4 = CodedOutputStream.computeMessageSize(22, (MessageLite)this.sensorCalibrationOffset_.get(var3));
            ++var3;
         }

         var3 = var2;
         if ((this.bitField0_ & 262144) == 262144) {
            var3 = var2 + CodedOutputStream.computeEnumSize(23, this.deviceLocation_);
         }

         var2 = this.unknownFields.getSerializedSize() + var3;
         this.memoizedSize = var2;
      }

      return var2;
   }

   public Structures$PbSportIdentifier getSport() {
      Structures$PbSportIdentifier var1;
      if (this.sport_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sport_;
      }

      return var1;
   }

   public Structures$PbSportIdentifierOrBuilder getSportOrBuilder() {
      Structures$PbSportIdentifier var1;
      if (this.sport_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sport_;
      }

      return var1;
   }

   public Types$PbLocalDateTime getStart() {
      Types$PbLocalDateTime var1;
      if (this.start_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.start_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getStartOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.start_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.start_;
      }

      return var1;
   }

   public Structures$PbTrainingLoad getTrainingLoad() {
      Structures$PbTrainingLoad var1;
      if (this.trainingLoad_ == null) {
         var1 = Structures$PbTrainingLoad.getDefaultInstance();
      } else {
         var1 = this.trainingLoad_;
      }

      return var1;
   }

   public Structures$PbTrainingLoadOrBuilder getTrainingLoadOrBuilder() {
      Structures$PbTrainingLoad var1;
      if (this.trainingLoad_ == null) {
         var1 = Structures$PbTrainingLoad.getDefaultInstance();
      } else {
         var1 = this.trainingLoad_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public float getWalkingDistance() {
      return this.walkingDistance_;
   }

   public Types$PbDuration getWalkingDuration() {
      Types$PbDuration var1;
      if (this.walkingDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.walkingDuration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getWalkingDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.walkingDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.walkingDuration_;
      }

      return var1;
   }

   public boolean hasAccumulatedTorque() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAscent() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCalories() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCyclingPowerEnergy() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDescent() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceLocation() {
      boolean var1;
      if ((this.bitField0_ & 262144) == 262144) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasExerciseCounters() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLatitude() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLongitude() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETESpeedCalibrationOffset() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPlace() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRunningIndex() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSport() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStart() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingLoad() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWalkingDistance() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWalkingDuration() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasStart()) {
            var1 = (var2 * 37 + 1) * 53 + this.getStart().hashCode();
         }

         int var3 = var1;
         if (this.hasDuration()) {
            var3 = (var1 * 37 + 2) * 53 + this.getDuration().hashCode();
         }

         var2 = var3;
         if (this.hasSport()) {
            var2 = (var3 * 37 + 3) * 53 + this.getSport().hashCode();
         }

         var1 = var2;
         if (this.hasDistance()) {
            var1 = (var2 * 37 + 4) * 53 + Float.floatToIntBits(this.getDistance());
         }

         var2 = var1;
         if (this.hasCalories()) {
            var2 = (var1 * 37 + 5) * 53 + this.getCalories();
         }

         var1 = var2;
         if (this.hasTrainingLoad()) {
            var1 = (var2 * 37 + 6) * 53 + this.getTrainingLoad().hashCode();
         }

         var2 = var1;
         if (this.getAvailableSensorFeaturesCount() > 0) {
            var2 = (var1 * 37 + 7) * 53 + this.availableSensorFeatures_.hashCode();
         }

         var1 = var2;
         if (this.hasRunningIndex()) {
            var1 = (var2 * 37 + 9) * 53 + this.getRunningIndex().hashCode();
         }

         var2 = var1;
         if (this.hasAscent()) {
            var2 = (var1 * 37 + 10) * 53 + Float.floatToIntBits(this.getAscent());
         }

         var1 = var2;
         if (this.hasDescent()) {
            var1 = (var2 * 37 + 11) * 53 + Float.floatToIntBits(this.getDescent());
         }

         var2 = var1;
         if (this.hasLatitude()) {
            var2 = (var1 * 37 + 12) * 53 + Internal.hashLong(Double.doubleToLongBits(this.getLatitude()));
         }

         var1 = var2;
         if (this.hasLongitude()) {
            var1 = (var2 * 37 + 13) * 53 + Internal.hashLong(Double.doubleToLongBits(this.getLongitude()));
         }

         var2 = var1;
         if (this.hasPlace()) {
            var2 = (var1 * 37 + 14) * 53 + this.getPlace().hashCode();
         }

         var1 = var2;
         if (this.hasExerciseCounters()) {
            var1 = (var2 * 37 + 16) * 53 + this.getExerciseCounters().hashCode();
         }

         var2 = var1;
         if (this.hasOBSOLETESpeedCalibrationOffset()) {
            var2 = (var1 * 37 + 17) * 53 + Float.floatToIntBits(this.getOBSOLETESpeedCalibrationOffset());
         }

         var1 = var2;
         if (this.hasWalkingDistance()) {
            var1 = (var2 * 37 + 18) * 53 + Float.floatToIntBits(this.getWalkingDistance());
         }

         var2 = var1;
         if (this.hasWalkingDuration()) {
            var2 = (var1 * 37 + 19) * 53 + this.getWalkingDuration().hashCode();
         }

         var1 = var2;
         if (this.hasAccumulatedTorque()) {
            var1 = (var2 * 37 + 20) * 53 + this.getAccumulatedTorque();
         }

         var2 = var1;
         if (this.hasCyclingPowerEnergy()) {
            var2 = (var1 * 37 + 21) * 53 + this.getCyclingPowerEnergy();
         }

         var1 = var2;
         if (this.getSensorCalibrationOffsetCount() > 0) {
            var1 = (var2 * 37 + 22) * 53 + this.getSensorCalibrationOffsetList().hashCode();
         }

         var2 = var1;
         if (this.hasDeviceLocation()) {
            var2 = (var1 * 37 + 23) * 53 + this.deviceLocation_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Training.d().ensureFieldAccessorsInitialized(Training$PbExerciseBase.class, Training$PbExerciseBase$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      byte var2 = this.memoizedIsInitialized;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = var1;
         if (var2 != 0) {
            if (!this.hasStart()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasDuration()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasSport()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getStart().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getSport().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasRunningIndex() && !this.getRunningIndex().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getSensorCalibrationOffsetCount()) {
                     this.memoizedIsInitialized = (byte)1;
                     var3 = true;
                     break;
                  }

                  if (!this.getSensorCalibrationOffset(var4).isInitialized()) {
                     this.memoizedIsInitialized = (byte)0;
                     var3 = var1;
                     break;
                  }

                  ++var4;
               }
            }
         }
      }

      return var3;
   }

   public Training$PbExerciseBase$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Training$PbExerciseBase$Builder newBuilderForType(BuilderParent var1) {
      return new Training$PbExerciseBase$Builder(var1, (Training$1)null);
   }

   public Training$PbExerciseBase$Builder toBuilder() {
      Training$PbExerciseBase$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Training$PbExerciseBase$Builder((Training$1)null);
      } else {
         var1 = (new Training$PbExerciseBase$Builder((Training$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getStart());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getDuration());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getSport());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeFloat(4, this.distance_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeUInt32(5, this.calories_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getTrainingLoad());
      }

      int var3;
      for(var3 = 0; var3 < this.availableSensorFeatures_.size(); ++var3) {
         var1.writeEnum(7, (Integer)this.availableSensorFeatures_.get(var3));
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(9, this.getRunningIndex());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeFloat(10, this.ascent_);
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeFloat(11, this.descent_);
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeDouble(12, this.latitude_);
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeDouble(13, this.longitude_);
      }

      if ((this.bitField0_ & 2048) == 2048) {
         GeneratedMessageV3.writeString(var1, 14, this.place_);
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeMessage(16, this.getExerciseCounters());
      }

      if ((this.bitField0_ & 8192) == 8192) {
         var1.writeFloat(17, this.oBSOLETESpeedCalibrationOffset_);
      }

      if ((this.bitField0_ & 16384) == 16384) {
         var1.writeFloat(18, this.walkingDistance_);
      }

      if ((this.bitField0_ & '耀') == 32768) {
         var1.writeMessage(19, this.getWalkingDuration());
      }

      if ((this.bitField0_ & 65536) == 65536) {
         var1.writeUInt32(20, this.accumulatedTorque_);
      }

      var3 = var2;
      if ((this.bitField0_ & 131072) == 131072) {
         var1.writeUInt32(21, this.cyclingPowerEnergy_);
         var3 = var2;
      }

      while(var3 < this.sensorCalibrationOffset_.size()) {
         var1.writeMessage(22, (MessageLite)this.sensorCalibrationOffset_.get(var3));
         ++var3;
      }

      if ((this.bitField0_ & 262144) == 262144) {
         var1.writeEnum(23, this.deviceLocation_);
      }

      this.unknownFields.writeTo(var1);
   }
}
