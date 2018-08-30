package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
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

public final class ExerciseSamples$PbExerciseIntervalledSampleList extends GeneratedMessageV3 implements ExerciseSamples$PbExerciseIntervalledSampleListOrBuilder {
   public static final int ACCELERATION_MAD_SAMPLES_FIELD_NUMBER = 20;
   public static final int ALTITUDE_CALIBRATION_FIELD_NUMBER = 11;
   public static final int ALTITUDE_SAMPLES_FIELD_NUMBER = 10;
   public static final int CADENCE_SAMPLES_FIELD_NUMBER = 5;
   private static final ExerciseSamples$PbExerciseIntervalledSampleList DEFAULT_INSTANCE = new ExerciseSamples$PbExerciseIntervalledSampleList();
   public static final int DISTANCE_SAMPLES_FIELD_NUMBER = 7;
   public static final int FORWARD_ACCELERATION_FIELD_NUMBER = 8;
   public static final int HEART_RATE_SAMPLES_FIELD_NUMBER = 4;
   public static final int LEFT_PEDAL_POWER_SAMPLES_FIELD_NUMBER = 15;
   public static final int LEFT_POWER_CALIBRATION_FIELD_NUMBER = 17;
   public static final int MOVING_TYPE_SAMPLES_FIELD_NUMBER = 9;
   @Deprecated
   public static final Parser PARSER = new ExerciseSamples$PbExerciseIntervalledSampleList$2();
   public static final int RECORDING_INTERVAL_MS_FIELD_NUMBER = 2;
   public static final int RIGHT_PEDAL_POWER_SAMPLES_FIELD_NUMBER = 16;
   public static final int RIGHT_POWER_CALIBRATION_FIELD_NUMBER = 18;
   public static final int RR_SAMPLES_FIELD_NUMBER = 19;
   public static final int SAMPLE_SOURCE_FIELD_NUMBER = 3;
   public static final int SAMPLE_TYPE_FIELD_NUMBER = 1;
   public static final int SPEED_SAMPLES_FIELD_NUMBER = 6;
   public static final int STRIDE_CALIBRATION_FIELD_NUMBER = 14;
   public static final int STRIDE_LENGTH_SAMPLES_FIELD_NUMBER = 13;
   public static final int TEMPERATURE_SAMPLES_FIELD_NUMBER = 12;
   private static final Converter movingTypeSamples_converter_ = new ExerciseSamples$PbExerciseIntervalledSampleList$1();
   private static final long serialVersionUID = 0L;
   private List accelerationMadSamples_;
   private List altitudeCalibration_;
   private int altitudeSamplesMemoizedSerializedSize;
   private List altitudeSamples_;
   private int bitField0_;
   private int cadenceSamplesMemoizedSerializedSize;
   private List cadenceSamples_;
   private int distanceSamplesMemoizedSerializedSize;
   private List distanceSamples_;
   private List forwardAcceleration_;
   private int heartRateSamplesMemoizedSerializedSize;
   private List heartRateSamples_;
   private List leftPedalPowerSamples_;
   private List leftPowerCalibration_;
   private byte memoizedIsInitialized;
   private List movingTypeSamples_;
   private int recordingIntervalMs_;
   private List rightPedalPowerSamples_;
   private List rightPowerCalibration_;
   private ExerciseRRSamples$PbExerciseRRIntervals rrSamples_;
   private List sampleSource_;
   private int sampleType_;
   private int speedSamplesMemoizedSerializedSize;
   private List speedSamples_;
   private List strideCalibration_;
   private int strideLengthSamplesMemoizedSerializedSize;
   private List strideLengthSamples_;
   private int temperatureSamplesMemoizedSerializedSize;
   private List temperatureSamples_;

   private ExerciseSamples$PbExerciseIntervalledSampleList() {
      this.heartRateSamplesMemoizedSerializedSize = -1;
      this.cadenceSamplesMemoizedSerializedSize = -1;
      this.speedSamplesMemoizedSerializedSize = -1;
      this.distanceSamplesMemoizedSerializedSize = -1;
      this.altitudeSamplesMemoizedSerializedSize = -1;
      this.temperatureSamplesMemoizedSerializedSize = -1;
      this.strideLengthSamplesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = (byte)-1;
      this.sampleType_ = 0;
      this.recordingIntervalMs_ = 0;
      this.sampleSource_ = Collections.emptyList();
      this.heartRateSamples_ = Collections.emptyList();
      this.cadenceSamples_ = Collections.emptyList();
      this.speedSamples_ = Collections.emptyList();
      this.distanceSamples_ = Collections.emptyList();
      this.forwardAcceleration_ = Collections.emptyList();
      this.movingTypeSamples_ = Collections.emptyList();
      this.altitudeSamples_ = Collections.emptyList();
      this.altitudeCalibration_ = Collections.emptyList();
      this.temperatureSamples_ = Collections.emptyList();
      this.strideLengthSamples_ = Collections.emptyList();
      this.strideCalibration_ = Collections.emptyList();
      this.leftPedalPowerSamples_ = Collections.emptyList();
      this.rightPedalPowerSamples_ = Collections.emptyList();
      this.leftPowerCalibration_ = Collections.emptyList();
      this.rightPowerCalibration_ = Collections.emptyList();
      this.accelerationMadSamples_ = Collections.emptyList();
   }

   private ExerciseSamples$PbExerciseIntervalledSampleList(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseSamples$PbExerciseIntervalledSampleList(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseSamples$1 var3) {
      this(var1, var2);
   }

   private ExerciseSamples$PbExerciseIntervalledSampleList(Builder var1) {
      super(var1);
      this.heartRateSamplesMemoizedSerializedSize = -1;
      this.cadenceSamplesMemoizedSerializedSize = -1;
      this.speedSamplesMemoizedSerializedSize = -1;
      this.distanceSamplesMemoizedSerializedSize = -1;
      this.altitudeSamplesMemoizedSerializedSize = -1;
      this.temperatureSamplesMemoizedSerializedSize = -1;
      this.strideLengthSamplesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseSamples$PbExerciseIntervalledSampleList(Builder var1, ExerciseSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseSamples$PbExerciseIntervalledSampleList var0, int var1) {
      var0.sampleType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseRRSamples$PbExerciseRRIntervals a(ExerciseSamples$PbExerciseIntervalledSampleList var0, ExerciseRRSamples$PbExerciseRRIntervals var1) {
      var0.rrSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.sampleSource_;
   }

   // $FF: synthetic method
   static List a(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.sampleSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExerciseSamples$PbExerciseIntervalledSampleList var0, int var1) {
      var0.recordingIntervalMs_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List b(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.heartRateSamples_;
   }

   // $FF: synthetic method
   static List b(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.heartRateSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExerciseSamples$PbExerciseIntervalledSampleList var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List c(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.cadenceSamples_;
   }

   // $FF: synthetic method
   static List c(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.cadenceSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List d(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.speedSamples_;
   }

   // $FF: synthetic method
   static List d(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.speedSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean d() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List e(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.distanceSamples_;
   }

   // $FF: synthetic method
   static List e(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.distanceSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean e() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List f(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.forwardAcceleration_;
   }

   // $FF: synthetic method
   static List f(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.forwardAcceleration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean f() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List g(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.movingTypeSamples_;
   }

   // $FF: synthetic method
   static List g(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.movingTypeSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean g() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSamples.e();
   }

   // $FF: synthetic method
   static List h(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.altitudeSamples_;
   }

   // $FF: synthetic method
   static List h(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.altitudeSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean h() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List i(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.altitudeCalibration_;
   }

   // $FF: synthetic method
   static List i(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.altitudeCalibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean i() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static Converter j() {
      return movingTypeSamples_converter_;
   }

   // $FF: synthetic method
   static List j(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.temperatureSamples_;
   }

   // $FF: synthetic method
   static List j(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.temperatureSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List k(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.strideLengthSamples_;
   }

   // $FF: synthetic method
   static List k(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.strideLengthSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List l(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.strideCalibration_;
   }

   // $FF: synthetic method
   static List l(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.strideCalibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List m(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.leftPedalPowerSamples_;
   }

   // $FF: synthetic method
   static List m(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.leftPedalPowerSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List n(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.rightPedalPowerSamples_;
   }

   // $FF: synthetic method
   static List n(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.rightPedalPowerSamples_ = var1;
      return var1;
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList$Builder newBuilder(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   // $FF: synthetic method
   static List o(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.leftPowerCalibration_;
   }

   // $FF: synthetic method
   static List o(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.leftPowerCalibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List p(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.rightPowerCalibration_;
   }

   // $FF: synthetic method
   static List p(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.rightPowerCalibration_ = var1;
      return var1;
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList parseDelimitedFrom(InputStream var0) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList parseFrom(ByteString var0) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)PARSER.parseFrom(var0);
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList parseFrom(CodedInputStream var0) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList parseFrom(InputStream var0) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList parseFrom(byte[] var0) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)PARSER.parseFrom(var0);
   }

   public static ExerciseSamples$PbExerciseIntervalledSampleList parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   // $FF: synthetic method
   static List q(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.accelerationMadSamples_;
   }

   // $FF: synthetic method
   static List q(ExerciseSamples$PbExerciseIntervalledSampleList var0, List var1) {
      var0.accelerationMadSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet r(ExerciseSamples$PbExerciseIntervalledSampleList var0) {
      return var0.unknownFields;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseSamples$PbExerciseIntervalledSampleList)) {
            var2 = super.equals(var1);
         } else {
            ExerciseSamples$PbExerciseIntervalledSampleList var5 = (ExerciseSamples$PbExerciseIntervalledSampleList)var1;
            boolean var3;
            if (this.hasSampleType() == var5.hasSampleType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSampleType()) {
               if (var3 && this.sampleType_ == var5.sampleType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasRecordingIntervalMs() == var5.hasRecordingIntervalMs()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasRecordingIntervalMs()) {
               if (var3 && this.getRecordingIntervalMs() == var5.getRecordingIntervalMs()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getSampleSourceList().equals(var5.getSampleSourceList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getHeartRateSamplesList().equals(var5.getHeartRateSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getCadenceSamplesList().equals(var5.getCadenceSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getSpeedSamplesList().equals(var5.getSpeedSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getDistanceSamplesList().equals(var5.getDistanceSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getForwardAccelerationList().equals(var5.getForwardAccelerationList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.movingTypeSamples_.equals(var5.movingTypeSamples_)) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getAltitudeSamplesList().equals(var5.getAltitudeSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getAltitudeCalibrationList().equals(var5.getAltitudeCalibrationList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getTemperatureSamplesList().equals(var5.getTemperatureSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getStrideLengthSamplesList().equals(var5.getStrideLengthSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getStrideCalibrationList().equals(var5.getStrideCalibrationList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getLeftPedalPowerSamplesList().equals(var5.getLeftPedalPowerSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getRightPedalPowerSamplesList().equals(var5.getRightPedalPowerSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getLeftPowerCalibrationList().equals(var5.getLeftPowerCalibrationList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getRightPowerCalibrationList().equals(var5.getRightPowerCalibrationList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasRrSamples() == var5.hasRrSamples()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasRrSamples()) {
               if (var4 && this.getRrSamples().equals(var5.getRrSamples())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.getAccelerationMadSamplesList().equals(var5.getAccelerationMadSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public float getAccelerationMadSamples(int var1) {
      return (Float)this.accelerationMadSamples_.get(var1);
   }

   public int getAccelerationMadSamplesCount() {
      return this.accelerationMadSamples_.size();
   }

   public List getAccelerationMadSamplesList() {
      return this.accelerationMadSamples_;
   }

   public ExerciseSamples$PbCalibrationValue getAltitudeCalibration(int var1) {
      return (ExerciseSamples$PbCalibrationValue)this.altitudeCalibration_.get(var1);
   }

   public int getAltitudeCalibrationCount() {
      return this.altitudeCalibration_.size();
   }

   public List getAltitudeCalibrationList() {
      return this.altitudeCalibration_;
   }

   public ExerciseSamples$PbCalibrationValueOrBuilder getAltitudeCalibrationOrBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValueOrBuilder)this.altitudeCalibration_.get(var1);
   }

   public List getAltitudeCalibrationOrBuilderList() {
      return this.altitudeCalibration_;
   }

   public float getAltitudeSamples(int var1) {
      return (Float)this.altitudeSamples_.get(var1);
   }

   public int getAltitudeSamplesCount() {
      return this.altitudeSamples_.size();
   }

   public List getAltitudeSamplesList() {
      return this.altitudeSamples_;
   }

   public int getCadenceSamples(int var1) {
      return (Integer)this.cadenceSamples_.get(var1);
   }

   public int getCadenceSamplesCount() {
      return this.cadenceSamples_.size();
   }

   public List getCadenceSamplesList() {
      return this.cadenceSamples_;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getDistanceSamples(int var1) {
      return (Float)this.distanceSamples_.get(var1);
   }

   public int getDistanceSamplesCount() {
      return this.distanceSamples_.size();
   }

   public List getDistanceSamplesList() {
      return this.distanceSamples_;
   }

   public float getForwardAcceleration(int var1) {
      return (Float)this.forwardAcceleration_.get(var1);
   }

   public int getForwardAccelerationCount() {
      return this.forwardAcceleration_.size();
   }

   public List getForwardAccelerationList() {
      return this.forwardAcceleration_;
   }

   public int getHeartRateSamples(int var1) {
      return (Integer)this.heartRateSamples_.get(var1);
   }

   public int getHeartRateSamplesCount() {
      return this.heartRateSamples_.size();
   }

   public List getHeartRateSamplesList() {
      return this.heartRateSamples_;
   }

   public ExerciseSamples$PbPowerMeasurements getLeftPedalPowerSamples(int var1) {
      return (ExerciseSamples$PbPowerMeasurements)this.leftPedalPowerSamples_.get(var1);
   }

   public int getLeftPedalPowerSamplesCount() {
      return this.leftPedalPowerSamples_.size();
   }

   public List getLeftPedalPowerSamplesList() {
      return this.leftPedalPowerSamples_;
   }

   public ExerciseSamples$PbPowerMeasurementsOrBuilder getLeftPedalPowerSamplesOrBuilder(int var1) {
      return (ExerciseSamples$PbPowerMeasurementsOrBuilder)this.leftPedalPowerSamples_.get(var1);
   }

   public List getLeftPedalPowerSamplesOrBuilderList() {
      return this.leftPedalPowerSamples_;
   }

   public ExerciseSamples$PbCalibrationValue getLeftPowerCalibration(int var1) {
      return (ExerciseSamples$PbCalibrationValue)this.leftPowerCalibration_.get(var1);
   }

   public int getLeftPowerCalibrationCount() {
      return this.leftPowerCalibration_.size();
   }

   public List getLeftPowerCalibrationList() {
      return this.leftPowerCalibration_;
   }

   public ExerciseSamples$PbCalibrationValueOrBuilder getLeftPowerCalibrationOrBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValueOrBuilder)this.leftPowerCalibration_.get(var1);
   }

   public List getLeftPowerCalibrationOrBuilderList() {
      return this.leftPowerCalibration_;
   }

   public Types$PbMovingType getMovingTypeSamples(int var1) {
      return (Types$PbMovingType)movingTypeSamples_converter_.convert(this.movingTypeSamples_.get(var1));
   }

   public int getMovingTypeSamplesCount() {
      return this.movingTypeSamples_.size();
   }

   public List getMovingTypeSamplesList() {
      return new ListAdapter(this.movingTypeSamples_, movingTypeSamples_converter_);
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getRecordingIntervalMs() {
      return this.recordingIntervalMs_;
   }

   public ExerciseSamples$PbPowerMeasurements getRightPedalPowerSamples(int var1) {
      return (ExerciseSamples$PbPowerMeasurements)this.rightPedalPowerSamples_.get(var1);
   }

   public int getRightPedalPowerSamplesCount() {
      return this.rightPedalPowerSamples_.size();
   }

   public List getRightPedalPowerSamplesList() {
      return this.rightPedalPowerSamples_;
   }

   public ExerciseSamples$PbPowerMeasurementsOrBuilder getRightPedalPowerSamplesOrBuilder(int var1) {
      return (ExerciseSamples$PbPowerMeasurementsOrBuilder)this.rightPedalPowerSamples_.get(var1);
   }

   public List getRightPedalPowerSamplesOrBuilderList() {
      return this.rightPedalPowerSamples_;
   }

   public ExerciseSamples$PbCalibrationValue getRightPowerCalibration(int var1) {
      return (ExerciseSamples$PbCalibrationValue)this.rightPowerCalibration_.get(var1);
   }

   public int getRightPowerCalibrationCount() {
      return this.rightPowerCalibration_.size();
   }

   public List getRightPowerCalibrationList() {
      return this.rightPowerCalibration_;
   }

   public ExerciseSamples$PbCalibrationValueOrBuilder getRightPowerCalibrationOrBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValueOrBuilder)this.rightPowerCalibration_.get(var1);
   }

   public List getRightPowerCalibrationOrBuilderList() {
      return this.rightPowerCalibration_;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals getRrSamples() {
      ExerciseRRSamples$PbExerciseRRIntervals var1;
      if (this.rrSamples_ == null) {
         var1 = ExerciseRRSamples$PbExerciseRRIntervals.getDefaultInstance();
      } else {
         var1 = this.rrSamples_;
      }

      return var1;
   }

   public ExerciseRRSamples$PbExerciseRRIntervalsOrBuilder getRrSamplesOrBuilder() {
      ExerciseRRSamples$PbExerciseRRIntervals var1;
      if (this.rrSamples_ == null) {
         var1 = ExerciseRRSamples$PbExerciseRRIntervals.getDefaultInstance();
      } else {
         var1 = this.rrSamples_;
      }

      return var1;
   }

   public Types$PbSampleSource getSampleSource(int var1) {
      return (Types$PbSampleSource)this.sampleSource_.get(var1);
   }

   public int getSampleSourceCount() {
      return this.sampleSource_.size();
   }

   public List getSampleSourceList() {
      return this.sampleSource_;
   }

   public Types$PbSampleSourceOrBuilder getSampleSourceOrBuilder(int var1) {
      return (Types$PbSampleSourceOrBuilder)this.sampleSource_.get(var1);
   }

   public List getSampleSourceOrBuilderList() {
      return this.sampleSource_;
   }

   public Types$PbSampleType getSampleType() {
      Types$PbSampleType var1 = Types$PbSampleType.valueOf(this.sampleType_);
      Types$PbSampleType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSampleType.SAMPLE_TYPE_UNDEFINED;
      }

      return var2;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         int var3;
         if ((this.bitField0_ & 1) == 1) {
            var3 = CodedOutputStream.computeEnumSize(1, this.sampleType_) + 0;
         } else {
            var3 = 0;
         }

         var2 = var3;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var3 + CodedOutputStream.computeUInt32Size(2, this.recordingIntervalMs_);
         }

         for(var3 = 0; var3 < this.sampleSource_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(3, (MessageLite)this.sampleSource_.get(var3));
         }

         int var4 = 0;

         for(var3 = 0; var4 < this.heartRateSamples_.size(); ++var4) {
            var3 += CodedOutputStream.computeUInt32SizeNoTag((Integer)this.heartRateSamples_.get(var4));
         }

         var2 += var3;
         if (!this.getHeartRateSamplesList().isEmpty()) {
            var2 = var2 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.heartRateSamplesMemoizedSerializedSize = var3;
         var4 = 0;

         for(var3 = 0; var4 < this.cadenceSamples_.size(); ++var4) {
            var3 += CodedOutputStream.computeUInt32SizeNoTag((Integer)this.cadenceSamples_.get(var4));
         }

         var4 = var2 + var3;
         var2 = var4;
         if (!this.getCadenceSamplesList().isEmpty()) {
            var2 = var4 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.cadenceSamplesMemoizedSerializedSize = var3;
         var4 = this.getSpeedSamplesList().size() * 4;
         var3 = var2 + var4;
         var2 = var3;
         if (!this.getSpeedSamplesList().isEmpty()) {
            var2 = var3 + 1 + CodedOutputStream.computeInt32SizeNoTag(var4);
         }

         this.speedSamplesMemoizedSerializedSize = var4;
         var4 = this.getDistanceSamplesList().size() * 4;
         var3 = var2 + var4;
         var2 = var3;
         if (!this.getDistanceSamplesList().isEmpty()) {
            var2 = var3 + 1 + CodedOutputStream.computeInt32SizeNoTag(var4);
         }

         this.distanceSamplesMemoizedSerializedSize = var4;
         int var5 = this.getForwardAccelerationList().size();
         int var6 = this.getForwardAccelerationList().size();
         var4 = 0;

         for(var3 = 0; var4 < this.movingTypeSamples_.size(); ++var4) {
            var3 += CodedOutputStream.computeEnumSizeNoTag((Integer)this.movingTypeSamples_.get(var4));
         }

         int var7 = this.movingTypeSamples_.size();
         var4 = this.getAltitudeSamplesList().size() * 4;
         var3 = var2 + var5 * 4 + var6 * 1 + var3 + var7 * 1 + var4;
         var2 = var3;
         if (!this.getAltitudeSamplesList().isEmpty()) {
            var2 = var3 + 1 + CodedOutputStream.computeInt32SizeNoTag(var4);
         }

         this.altitudeSamplesMemoizedSerializedSize = var4;

         for(var3 = 0; var3 < this.altitudeCalibration_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(11, (MessageLite)this.altitudeCalibration_.get(var3));
         }

         var3 = this.getTemperatureSamplesList().size() * 4;
         var2 += var3;
         if (!this.getTemperatureSamplesList().isEmpty()) {
            var2 = var2 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.temperatureSamplesMemoizedSerializedSize = var3;
         var4 = 0;

         for(var3 = 0; var4 < this.strideLengthSamples_.size(); ++var4) {
            var3 += CodedOutputStream.computeUInt32SizeNoTag((Integer)this.strideLengthSamples_.get(var4));
         }

         var4 = var2 + var3;
         var2 = var4;
         if (!this.getStrideLengthSamplesList().isEmpty()) {
            var2 = var4 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.strideLengthSamplesMemoizedSerializedSize = var3;

         for(var3 = 0; var3 < this.strideCalibration_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(14, (MessageLite)this.strideCalibration_.get(var3));
         }

         for(var3 = 0; var3 < this.leftPedalPowerSamples_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(15, (MessageLite)this.leftPedalPowerSamples_.get(var3));
         }

         for(var3 = 0; var3 < this.rightPedalPowerSamples_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(16, (MessageLite)this.rightPedalPowerSamples_.get(var3));
         }

         var4 = 0;
         var3 = var2;

         while(true) {
            var6 = var1;
            var2 = var3;
            if (var4 >= this.leftPowerCalibration_.size()) {
               while(var6 < this.rightPowerCalibration_.size()) {
                  var2 += CodedOutputStream.computeMessageSize(18, (MessageLite)this.rightPowerCalibration_.get(var6));
                  ++var6;
               }

               var3 = var2;
               if ((this.bitField0_ & 4) == 4) {
                  var3 = var2 + CodedOutputStream.computeMessageSize(19, this.getRrSamples());
               }

               var2 = this.getAccelerationMadSamplesList().size() * 4 + var3 + this.getAccelerationMadSamplesList().size() * 2 + this.unknownFields.getSerializedSize();
               this.memoizedSize = var2;
               break;
            }

            var3 += CodedOutputStream.computeMessageSize(17, (MessageLite)this.leftPowerCalibration_.get(var4));
            ++var4;
         }
      }

      return var2;
   }

   public float getSpeedSamples(int var1) {
      return (Float)this.speedSamples_.get(var1);
   }

   public int getSpeedSamplesCount() {
      return this.speedSamples_.size();
   }

   public List getSpeedSamplesList() {
      return this.speedSamples_;
   }

   public ExerciseSamples$PbCalibrationValue getStrideCalibration(int var1) {
      return (ExerciseSamples$PbCalibrationValue)this.strideCalibration_.get(var1);
   }

   public int getStrideCalibrationCount() {
      return this.strideCalibration_.size();
   }

   public List getStrideCalibrationList() {
      return this.strideCalibration_;
   }

   public ExerciseSamples$PbCalibrationValueOrBuilder getStrideCalibrationOrBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValueOrBuilder)this.strideCalibration_.get(var1);
   }

   public List getStrideCalibrationOrBuilderList() {
      return this.strideCalibration_;
   }

   public int getStrideLengthSamples(int var1) {
      return (Integer)this.strideLengthSamples_.get(var1);
   }

   public int getStrideLengthSamplesCount() {
      return this.strideLengthSamples_.size();
   }

   public List getStrideLengthSamplesList() {
      return this.strideLengthSamples_;
   }

   public float getTemperatureSamples(int var1) {
      return (Float)this.temperatureSamples_.get(var1);
   }

   public int getTemperatureSamplesCount() {
      return this.temperatureSamples_.size();
   }

   public List getTemperatureSamplesList() {
      return this.temperatureSamples_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasRecordingIntervalMs() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRrSamples() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSampleType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
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
         if (this.hasSampleType()) {
            var1 = (var2 * 37 + 1) * 53 + this.sampleType_;
         }

         var2 = var1;
         if (this.hasRecordingIntervalMs()) {
            var2 = (var1 * 37 + 2) * 53 + this.getRecordingIntervalMs();
         }

         var1 = var2;
         if (this.getSampleSourceCount() > 0) {
            var1 = (var2 * 37 + 3) * 53 + this.getSampleSourceList().hashCode();
         }

         var2 = var1;
         if (this.getHeartRateSamplesCount() > 0) {
            var2 = (var1 * 37 + 4) * 53 + this.getHeartRateSamplesList().hashCode();
         }

         var1 = var2;
         if (this.getCadenceSamplesCount() > 0) {
            var1 = (var2 * 37 + 5) * 53 + this.getCadenceSamplesList().hashCode();
         }

         var2 = var1;
         if (this.getSpeedSamplesCount() > 0) {
            var2 = (var1 * 37 + 6) * 53 + this.getSpeedSamplesList().hashCode();
         }

         var1 = var2;
         if (this.getDistanceSamplesCount() > 0) {
            var1 = (var2 * 37 + 7) * 53 + this.getDistanceSamplesList().hashCode();
         }

         var2 = var1;
         if (this.getForwardAccelerationCount() > 0) {
            var2 = (var1 * 37 + 8) * 53 + this.getForwardAccelerationList().hashCode();
         }

         var1 = var2;
         if (this.getMovingTypeSamplesCount() > 0) {
            var1 = (var2 * 37 + 9) * 53 + this.movingTypeSamples_.hashCode();
         }

         var2 = var1;
         if (this.getAltitudeSamplesCount() > 0) {
            var2 = (var1 * 37 + 10) * 53 + this.getAltitudeSamplesList().hashCode();
         }

         int var3 = var2;
         if (this.getAltitudeCalibrationCount() > 0) {
            var3 = (var2 * 37 + 11) * 53 + this.getAltitudeCalibrationList().hashCode();
         }

         var1 = var3;
         if (this.getTemperatureSamplesCount() > 0) {
            var1 = (var3 * 37 + 12) * 53 + this.getTemperatureSamplesList().hashCode();
         }

         var2 = var1;
         if (this.getStrideLengthSamplesCount() > 0) {
            var2 = (var1 * 37 + 13) * 53 + this.getStrideLengthSamplesList().hashCode();
         }

         var1 = var2;
         if (this.getStrideCalibrationCount() > 0) {
            var1 = (var2 * 37 + 14) * 53 + this.getStrideCalibrationList().hashCode();
         }

         var3 = var1;
         if (this.getLeftPedalPowerSamplesCount() > 0) {
            var3 = (var1 * 37 + 15) * 53 + this.getLeftPedalPowerSamplesList().hashCode();
         }

         var2 = var3;
         if (this.getRightPedalPowerSamplesCount() > 0) {
            var2 = (var3 * 37 + 16) * 53 + this.getRightPedalPowerSamplesList().hashCode();
         }

         var1 = var2;
         if (this.getLeftPowerCalibrationCount() > 0) {
            var1 = (var2 * 37 + 17) * 53 + this.getLeftPowerCalibrationList().hashCode();
         }

         var2 = var1;
         if (this.getRightPowerCalibrationCount() > 0) {
            var2 = (var1 * 37 + 18) * 53 + this.getRightPowerCalibrationList().hashCode();
         }

         var1 = var2;
         if (this.hasRrSamples()) {
            var1 = (var2 * 37 + 19) * 53 + this.getRrSamples().hashCode();
         }

         var2 = var1;
         if (this.getAccelerationMadSamplesCount() > 0) {
            var2 = (var1 * 37 + 20) * 53 + this.getAccelerationMadSamplesList().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSamples.f().ensureFieldAccessorsInitialized(ExerciseSamples$PbExerciseIntervalledSampleList.class, ExerciseSamples$PbExerciseIntervalledSampleList$Builder.class);
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
            if (!this.hasSampleType()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getSampleSourceCount()) {
                     for(var4 = 0; var4 < this.getAltitudeCalibrationCount(); ++var4) {
                        if (!this.getAltitudeCalibration(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getStrideCalibrationCount(); ++var4) {
                        if (!this.getStrideCalibration(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getLeftPedalPowerSamplesCount(); ++var4) {
                        if (!this.getLeftPedalPowerSamples(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getRightPedalPowerSamplesCount(); ++var4) {
                        if (!this.getRightPedalPowerSamples(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getLeftPowerCalibrationCount(); ++var4) {
                        if (!this.getLeftPowerCalibration(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getRightPowerCalibrationCount(); ++var4) {
                        if (!this.getRightPowerCalibration(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     if (this.hasRrSamples() && !this.getRrSamples().isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                     } else {
                        this.memoizedIsInitialized = (byte)1;
                        var3 = true;
                     }
                     break;
                  }

                  if (!this.getSampleSource(var4).isInitialized()) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseSamples$PbExerciseIntervalledSampleList$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseSamples$PbExerciseIntervalledSampleList$Builder(var1, (ExerciseSamples$1)null);
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder toBuilder() {
      ExerciseSamples$PbExerciseIntervalledSampleList$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseSamples$PbExerciseIntervalledSampleList$Builder((ExerciseSamples$1)null);
      } else {
         var1 = (new ExerciseSamples$PbExerciseIntervalledSampleList$Builder((ExerciseSamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;
      this.getSerializedSize();
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.sampleType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.recordingIntervalMs_);
      }

      int var3;
      for(var3 = 0; var3 < this.sampleSource_.size(); ++var3) {
         var1.writeMessage(3, (MessageLite)this.sampleSource_.get(var3));
      }

      if (this.getHeartRateSamplesList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.heartRateSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.heartRateSamples_.size(); ++var3) {
         var1.writeUInt32NoTag((Integer)this.heartRateSamples_.get(var3));
      }

      if (this.getCadenceSamplesList().size() > 0) {
         var1.writeUInt32NoTag(42);
         var1.writeUInt32NoTag(this.cadenceSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.cadenceSamples_.size(); ++var3) {
         var1.writeUInt32NoTag((Integer)this.cadenceSamples_.get(var3));
      }

      if (this.getSpeedSamplesList().size() > 0) {
         var1.writeUInt32NoTag(50);
         var1.writeUInt32NoTag(this.speedSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.speedSamples_.size(); ++var3) {
         var1.writeFloatNoTag((Float)this.speedSamples_.get(var3));
      }

      if (this.getDistanceSamplesList().size() > 0) {
         var1.writeUInt32NoTag(58);
         var1.writeUInt32NoTag(this.distanceSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.distanceSamples_.size(); ++var3) {
         var1.writeFloatNoTag((Float)this.distanceSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.forwardAcceleration_.size(); ++var3) {
         var1.writeFloat(8, (Float)this.forwardAcceleration_.get(var3));
      }

      for(var3 = 0; var3 < this.movingTypeSamples_.size(); ++var3) {
         var1.writeEnum(9, (Integer)this.movingTypeSamples_.get(var3));
      }

      if (this.getAltitudeSamplesList().size() > 0) {
         var1.writeUInt32NoTag(82);
         var1.writeUInt32NoTag(this.altitudeSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.altitudeSamples_.size(); ++var3) {
         var1.writeFloatNoTag((Float)this.altitudeSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.altitudeCalibration_.size(); ++var3) {
         var1.writeMessage(11, (MessageLite)this.altitudeCalibration_.get(var3));
      }

      if (this.getTemperatureSamplesList().size() > 0) {
         var1.writeUInt32NoTag(98);
         var1.writeUInt32NoTag(this.temperatureSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.temperatureSamples_.size(); ++var3) {
         var1.writeFloatNoTag((Float)this.temperatureSamples_.get(var3));
      }

      if (this.getStrideLengthSamplesList().size() > 0) {
         var1.writeUInt32NoTag(106);
         var1.writeUInt32NoTag(this.strideLengthSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.strideLengthSamples_.size(); ++var3) {
         var1.writeUInt32NoTag((Integer)this.strideLengthSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.strideCalibration_.size(); ++var3) {
         var1.writeMessage(14, (MessageLite)this.strideCalibration_.get(var3));
      }

      for(var3 = 0; var3 < this.leftPedalPowerSamples_.size(); ++var3) {
         var1.writeMessage(15, (MessageLite)this.leftPedalPowerSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.rightPedalPowerSamples_.size(); ++var3) {
         var1.writeMessage(16, (MessageLite)this.rightPedalPowerSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.leftPowerCalibration_.size(); ++var3) {
         var1.writeMessage(17, (MessageLite)this.leftPowerCalibration_.get(var3));
      }

      for(var3 = 0; var3 < this.rightPowerCalibration_.size(); ++var3) {
         var1.writeMessage(18, (MessageLite)this.rightPowerCalibration_.get(var3));
      }

      var3 = var2;
      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(19, this.getRrSamples());
         var3 = var2;
      }

      while(var3 < this.accelerationMadSamples_.size()) {
         var1.writeFloat(20, (Float)this.accelerationMadSamples_.get(var3));
         ++var3;
      }

      this.unknownFields.writeTo(var1);
   }
}
