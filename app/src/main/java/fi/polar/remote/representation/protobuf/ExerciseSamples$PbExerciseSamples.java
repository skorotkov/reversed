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

public final class ExerciseSamples$PbExerciseSamples extends GeneratedMessageV3 implements ExerciseSamples$PbExerciseSamplesOrBuilder {
   public static final int ALTITUDE_CALIBRATION_FIELD_NUMBER = 7;
   public static final int ALTITUDE_OFFLINE_FIELD_NUMBER = 18;
   public static final int ALTITUDE_SAMPLES_FIELD_NUMBER = 6;
   public static final int CADENCE_OFFLINE_FIELD_NUMBER = 5;
   public static final int CADENCE_SAMPLES_FIELD_NUMBER = 4;
   private static final ExerciseSamples$PbExerciseSamples DEFAULT_INSTANCE = new ExerciseSamples$PbExerciseSamples();
   public static final int DISTANCE_OFFLINE_FIELD_NUMBER = 12;
   public static final int DISTANCE_SAMPLES_FIELD_NUMBER = 11;
   public static final int EXERCISE_INTERVALLED_SAMPLE_LIST_FIELD_NUMBER = 29;
   public static final int FORWARD_ACCELERATION_FIELD_NUMBER = 16;
   public static final int FORWARD_ACCELERATION_OFFLINE_FIELD_NUMBER = 20;
   public static final int HEART_RATE_OFFLINE_FIELD_NUMBER = 3;
   public static final int HEART_RATE_SAMPLES_FIELD_NUMBER = 2;
   public static final int LEFT_PEDAL_POWER_OFFLINE_FIELD_NUMBER = 23;
   public static final int LEFT_PEDAL_POWER_SAMPLES_FIELD_NUMBER = 22;
   public static final int LEFT_POWER_CALIBRATION_FIELD_NUMBER = 26;
   public static final int MOVING_TYPE_OFFLINE_FIELD_NUMBER = 21;
   public static final int MOVING_TYPE_SAMPLES_FIELD_NUMBER = 17;
   @Deprecated
   public static final Parser PARSER = new ExerciseSamples$PbExerciseSamples$2();
   public static final int PAUSE_TIMES_FIELD_NUMBER = 30;
   public static final int RECORDING_INTERVAL_FIELD_NUMBER = 1;
   public static final int RIGHT_PEDAL_POWER_OFFLINE_FIELD_NUMBER = 25;
   public static final int RIGHT_PEDAL_POWER_SAMPLES_FIELD_NUMBER = 24;
   public static final int RIGHT_POWER_CALIBRATION_FIELD_NUMBER = 27;
   public static final int RR_SAMPLES_FIELD_NUMBER = 28;
   public static final int SPEED_OFFLINE_FIELD_NUMBER = 10;
   public static final int SPEED_SAMPLES_FIELD_NUMBER = 9;
   public static final int STRIDE_CALIBRATION_FIELD_NUMBER = 15;
   public static final int STRIDE_LENGTH_OFFLINE_FIELD_NUMBER = 14;
   public static final int STRIDE_LENGTH_SAMPLES_FIELD_NUMBER = 13;
   public static final int TEMPERATURE_OFFLINE_FIELD_NUMBER = 19;
   public static final int TEMPERATURE_SAMPLES_FIELD_NUMBER = 8;
   private static final Converter movingTypeSamples_converter_ = new ExerciseSamples$PbExerciseSamples$1();
   private static final long serialVersionUID = 0L;
   private List altitudeCalibration_;
   private List altitudeOffline_;
   private int altitudeSamplesMemoizedSerializedSize;
   private List altitudeSamples_;
   private int bitField0_;
   private List cadenceOffline_;
   private int cadenceSamplesMemoizedSerializedSize;
   private List cadenceSamples_;
   private List distanceOffline_;
   private int distanceSamplesMemoizedSerializedSize;
   private List distanceSamples_;
   private List exerciseIntervalledSampleList_;
   private List forwardAccelerationOffline_;
   private List forwardAcceleration_;
   private List heartRateOffline_;
   private int heartRateSamplesMemoizedSerializedSize;
   private List heartRateSamples_;
   private List leftPedalPowerOffline_;
   private List leftPedalPowerSamples_;
   private List leftPowerCalibration_;
   private byte memoizedIsInitialized;
   private List movingTypeOffline_;
   private List movingTypeSamples_;
   private List pauseTimes_;
   private Types$PbDuration recordingInterval_;
   private List rightPedalPowerOffline_;
   private List rightPedalPowerSamples_;
   private List rightPowerCalibration_;
   private ExerciseRRSamples$PbExerciseRRIntervals rrSamples_;
   private List speedOffline_;
   private int speedSamplesMemoizedSerializedSize;
   private List speedSamples_;
   private List strideCalibration_;
   private List strideLengthOffline_;
   private int strideLengthSamplesMemoizedSerializedSize;
   private List strideLengthSamples_;
   private List temperatureOffline_;
   private int temperatureSamplesMemoizedSerializedSize;
   private List temperatureSamples_;

   private ExerciseSamples$PbExerciseSamples() {
      this.heartRateSamplesMemoizedSerializedSize = -1;
      this.cadenceSamplesMemoizedSerializedSize = -1;
      this.altitudeSamplesMemoizedSerializedSize = -1;
      this.temperatureSamplesMemoizedSerializedSize = -1;
      this.speedSamplesMemoizedSerializedSize = -1;
      this.distanceSamplesMemoizedSerializedSize = -1;
      this.strideLengthSamplesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = (byte)-1;
      this.heartRateSamples_ = Collections.emptyList();
      this.heartRateOffline_ = Collections.emptyList();
      this.cadenceSamples_ = Collections.emptyList();
      this.cadenceOffline_ = Collections.emptyList();
      this.altitudeSamples_ = Collections.emptyList();
      this.altitudeOffline_ = Collections.emptyList();
      this.altitudeCalibration_ = Collections.emptyList();
      this.temperatureSamples_ = Collections.emptyList();
      this.temperatureOffline_ = Collections.emptyList();
      this.speedSamples_ = Collections.emptyList();
      this.speedOffline_ = Collections.emptyList();
      this.distanceSamples_ = Collections.emptyList();
      this.distanceOffline_ = Collections.emptyList();
      this.strideLengthSamples_ = Collections.emptyList();
      this.strideLengthOffline_ = Collections.emptyList();
      this.strideCalibration_ = Collections.emptyList();
      this.forwardAcceleration_ = Collections.emptyList();
      this.forwardAccelerationOffline_ = Collections.emptyList();
      this.movingTypeSamples_ = Collections.emptyList();
      this.movingTypeOffline_ = Collections.emptyList();
      this.leftPedalPowerSamples_ = Collections.emptyList();
      this.leftPedalPowerOffline_ = Collections.emptyList();
      this.rightPedalPowerSamples_ = Collections.emptyList();
      this.rightPedalPowerOffline_ = Collections.emptyList();
      this.leftPowerCalibration_ = Collections.emptyList();
      this.rightPowerCalibration_ = Collections.emptyList();
      this.exerciseIntervalledSampleList_ = Collections.emptyList();
      this.pauseTimes_ = Collections.emptyList();
   }

   private ExerciseSamples$PbExerciseSamples(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseSamples$PbExerciseSamples(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseSamples$1 var3) {
      this(var1, var2);
   }

   private ExerciseSamples$PbExerciseSamples(Builder var1) {
      super(var1);
      this.heartRateSamplesMemoizedSerializedSize = -1;
      this.cadenceSamplesMemoizedSerializedSize = -1;
      this.altitudeSamplesMemoizedSerializedSize = -1;
      this.temperatureSamplesMemoizedSerializedSize = -1;
      this.speedSamplesMemoizedSerializedSize = -1;
      this.distanceSamplesMemoizedSerializedSize = -1;
      this.strideLengthSamplesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseSamples$PbExerciseSamples(Builder var1, ExerciseSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static List A(ExerciseSamples$PbExerciseSamples var0) {
      return var0.exerciseIntervalledSampleList_;
   }

   // $FF: synthetic method
   static List A(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.exerciseIntervalledSampleList_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List B(ExerciseSamples$PbExerciseSamples var0) {
      return var0.pauseTimes_;
   }

   // $FF: synthetic method
   static List B(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.pauseTimes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet C(ExerciseSamples$PbExerciseSamples var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int a(ExerciseSamples$PbExerciseSamples var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseRRSamples$PbExerciseRRIntervals a(ExerciseSamples$PbExerciseSamples var0, ExerciseRRSamples$PbExerciseRRIntervals var1) {
      var0.rrSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(ExerciseSamples$PbExerciseSamples var0, Types$PbDuration var1) {
      var0.recordingInterval_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(ExerciseSamples$PbExerciseSamples var0) {
      return var0.heartRateSamples_;
   }

   // $FF: synthetic method
   static List a(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.heartRateSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List b(ExerciseSamples$PbExerciseSamples var0) {
      return var0.heartRateOffline_;
   }

   // $FF: synthetic method
   static List b(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.heartRateOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List c(ExerciseSamples$PbExerciseSamples var0) {
      return var0.cadenceSamples_;
   }

   // $FF: synthetic method
   static List c(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.cadenceSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List d(ExerciseSamples$PbExerciseSamples var0) {
      return var0.cadenceOffline_;
   }

   // $FF: synthetic method
   static List d(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.cadenceOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean d() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List e(ExerciseSamples$PbExerciseSamples var0) {
      return var0.altitudeSamples_;
   }

   // $FF: synthetic method
   static List e(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.altitudeSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean e() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List f(ExerciseSamples$PbExerciseSamples var0) {
      return var0.altitudeOffline_;
   }

   // $FF: synthetic method
   static List f(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.altitudeOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean f() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List g(ExerciseSamples$PbExerciseSamples var0) {
      return var0.altitudeCalibration_;
   }

   // $FF: synthetic method
   static List g(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.altitudeCalibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean g() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseSamples$PbExerciseSamples getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSamples.g();
   }

   // $FF: synthetic method
   static List h(ExerciseSamples$PbExerciseSamples var0) {
      return var0.temperatureSamples_;
   }

   // $FF: synthetic method
   static List h(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.temperatureSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean h() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List i(ExerciseSamples$PbExerciseSamples var0) {
      return var0.temperatureOffline_;
   }

   // $FF: synthetic method
   static List i(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.temperatureOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean i() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List j(ExerciseSamples$PbExerciseSamples var0) {
      return var0.speedSamples_;
   }

   // $FF: synthetic method
   static List j(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.speedSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean j() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List k(ExerciseSamples$PbExerciseSamples var0) {
      return var0.speedOffline_;
   }

   // $FF: synthetic method
   static List k(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.speedOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean k() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List l(ExerciseSamples$PbExerciseSamples var0) {
      return var0.distanceSamples_;
   }

   // $FF: synthetic method
   static List l(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.distanceSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean l() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List m(ExerciseSamples$PbExerciseSamples var0) {
      return var0.distanceOffline_;
   }

   // $FF: synthetic method
   static List m(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.distanceOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean m() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List n(ExerciseSamples$PbExerciseSamples var0) {
      return var0.strideLengthSamples_;
   }

   // $FF: synthetic method
   static List n(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.strideLengthSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean n() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseSamples$PbExerciseSamples$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseSamples$PbExerciseSamples$Builder newBuilder(ExerciseSamples$PbExerciseSamples var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   // $FF: synthetic method
   static List o(ExerciseSamples$PbExerciseSamples var0) {
      return var0.strideLengthOffline_;
   }

   // $FF: synthetic method
   static List o(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.strideLengthOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean o() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List p(ExerciseSamples$PbExerciseSamples var0) {
      return var0.strideCalibration_;
   }

   // $FF: synthetic method
   static List p(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.strideCalibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean p() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseSamples$PbExerciseSamples parseDelimitedFrom(InputStream var0) {
      return (ExerciseSamples$PbExerciseSamples)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbExerciseSamples parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbExerciseSamples)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbExerciseSamples parseFrom(ByteString var0) {
      return (ExerciseSamples$PbExerciseSamples)PARSER.parseFrom(var0);
   }

   public static ExerciseSamples$PbExerciseSamples parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbExerciseSamples)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseSamples$PbExerciseSamples parseFrom(CodedInputStream var0) {
      return (ExerciseSamples$PbExerciseSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbExerciseSamples parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbExerciseSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbExerciseSamples parseFrom(InputStream var0) {
      return (ExerciseSamples$PbExerciseSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbExerciseSamples parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbExerciseSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbExerciseSamples parseFrom(byte[] var0) {
      return (ExerciseSamples$PbExerciseSamples)PARSER.parseFrom(var0);
   }

   public static ExerciseSamples$PbExerciseSamples parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbExerciseSamples)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   // $FF: synthetic method
   static List q(ExerciseSamples$PbExerciseSamples var0) {
      return var0.forwardAcceleration_;
   }

   // $FF: synthetic method
   static List q(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.forwardAcceleration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean q() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List r(ExerciseSamples$PbExerciseSamples var0) {
      return var0.forwardAccelerationOffline_;
   }

   // $FF: synthetic method
   static List r(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.forwardAccelerationOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean r() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List s(ExerciseSamples$PbExerciseSamples var0) {
      return var0.movingTypeSamples_;
   }

   // $FF: synthetic method
   static List s(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.movingTypeSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean s() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List t(ExerciseSamples$PbExerciseSamples var0) {
      return var0.movingTypeOffline_;
   }

   // $FF: synthetic method
   static List t(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.movingTypeOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean t() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List u(ExerciseSamples$PbExerciseSamples var0) {
      return var0.leftPedalPowerSamples_;
   }

   // $FF: synthetic method
   static List u(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.leftPedalPowerSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean u() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static Converter v() {
      return movingTypeSamples_converter_;
   }

   // $FF: synthetic method
   static List v(ExerciseSamples$PbExerciseSamples var0) {
      return var0.leftPedalPowerOffline_;
   }

   // $FF: synthetic method
   static List v(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.leftPedalPowerOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List w(ExerciseSamples$PbExerciseSamples var0) {
      return var0.rightPedalPowerSamples_;
   }

   // $FF: synthetic method
   static List w(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.rightPedalPowerSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List x(ExerciseSamples$PbExerciseSamples var0) {
      return var0.rightPedalPowerOffline_;
   }

   // $FF: synthetic method
   static List x(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.rightPedalPowerOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List y(ExerciseSamples$PbExerciseSamples var0) {
      return var0.leftPowerCalibration_;
   }

   // $FF: synthetic method
   static List y(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.leftPowerCalibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List z(ExerciseSamples$PbExerciseSamples var0) {
      return var0.rightPowerCalibration_;
   }

   // $FF: synthetic method
   static List z(ExerciseSamples$PbExerciseSamples var0, List var1) {
      var0.rightPowerCalibration_ = var1;
      return var1;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseSamples$PbExerciseSamples)) {
            var2 = super.equals(var1);
         } else {
            ExerciseSamples$PbExerciseSamples var5 = (ExerciseSamples$PbExerciseSamples)var1;
            boolean var3;
            if (this.hasRecordingInterval() == var5.hasRecordingInterval()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasRecordingInterval()) {
               if (var3 && this.getRecordingInterval().equals(var5.getRecordingInterval())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getHeartRateSamplesList().equals(var5.getHeartRateSamplesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getHeartRateOfflineList().equals(var5.getHeartRateOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getCadenceSamplesList().equals(var5.getCadenceSamplesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getCadenceOfflineList().equals(var5.getCadenceOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getAltitudeSamplesList().equals(var5.getAltitudeSamplesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getAltitudeOfflineList().equals(var5.getAltitudeOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getAltitudeCalibrationList().equals(var5.getAltitudeCalibrationList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getTemperatureSamplesList().equals(var5.getTemperatureSamplesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getTemperatureOfflineList().equals(var5.getTemperatureOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getSpeedSamplesList().equals(var5.getSpeedSamplesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getSpeedOfflineList().equals(var5.getSpeedOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getDistanceSamplesList().equals(var5.getDistanceSamplesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getDistanceOfflineList().equals(var5.getDistanceOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getStrideLengthSamplesList().equals(var5.getStrideLengthSamplesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getStrideLengthOfflineList().equals(var5.getStrideLengthOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getStrideCalibrationList().equals(var5.getStrideCalibrationList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getForwardAccelerationList().equals(var5.getForwardAccelerationList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getForwardAccelerationOfflineList().equals(var5.getForwardAccelerationOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.movingTypeSamples_.equals(var5.movingTypeSamples_)) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getMovingTypeOfflineList().equals(var5.getMovingTypeOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getLeftPedalPowerSamplesList().equals(var5.getLeftPedalPowerSamplesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getLeftPedalPowerOfflineList().equals(var5.getLeftPedalPowerOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getRightPedalPowerSamplesList().equals(var5.getRightPedalPowerSamplesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getRightPedalPowerOfflineList().equals(var5.getRightPedalPowerOfflineList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getLeftPowerCalibrationList().equals(var5.getLeftPowerCalibrationList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getRightPowerCalibrationList().equals(var5.getRightPowerCalibrationList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.hasRrSamples() == var5.hasRrSamples()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasRrSamples()) {
               if (var3 && this.getRrSamples().equals(var5.getRrSamples())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getExerciseIntervalledSampleListList().equals(var5.getExerciseIntervalledSampleListList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getPauseTimesList().equals(var5.getPauseTimesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
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

   public Types$PbSensorOffline getAltitudeOffline(int var1) {
      return (Types$PbSensorOffline)this.altitudeOffline_.get(var1);
   }

   public int getAltitudeOfflineCount() {
      return this.altitudeOffline_.size();
   }

   public List getAltitudeOfflineList() {
      return this.altitudeOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getAltitudeOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.altitudeOffline_.get(var1);
   }

   public List getAltitudeOfflineOrBuilderList() {
      return this.altitudeOffline_;
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

   public Types$PbSensorOffline getCadenceOffline(int var1) {
      return (Types$PbSensorOffline)this.cadenceOffline_.get(var1);
   }

   public int getCadenceOfflineCount() {
      return this.cadenceOffline_.size();
   }

   public List getCadenceOfflineList() {
      return this.cadenceOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getCadenceOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.cadenceOffline_.get(var1);
   }

   public List getCadenceOfflineOrBuilderList() {
      return this.cadenceOffline_;
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

   public ExerciseSamples$PbExerciseSamples getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbSensorOffline getDistanceOffline(int var1) {
      return (Types$PbSensorOffline)this.distanceOffline_.get(var1);
   }

   public int getDistanceOfflineCount() {
      return this.distanceOffline_.size();
   }

   public List getDistanceOfflineList() {
      return this.distanceOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getDistanceOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.distanceOffline_.get(var1);
   }

   public List getDistanceOfflineOrBuilderList() {
      return this.distanceOffline_;
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

   public ExerciseSamples$PbExerciseIntervalledSampleList getExerciseIntervalledSampleList(int var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList)this.exerciseIntervalledSampleList_.get(var1);
   }

   public int getExerciseIntervalledSampleListCount() {
      return this.exerciseIntervalledSampleList_.size();
   }

   public List getExerciseIntervalledSampleListList() {
      return this.exerciseIntervalledSampleList_;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleListOrBuilder getExerciseIntervalledSampleListOrBuilder(int var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleListOrBuilder)this.exerciseIntervalledSampleList_.get(var1);
   }

   public List getExerciseIntervalledSampleListOrBuilderList() {
      return this.exerciseIntervalledSampleList_;
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

   public Types$PbSensorOffline getForwardAccelerationOffline(int var1) {
      return (Types$PbSensorOffline)this.forwardAccelerationOffline_.get(var1);
   }

   public int getForwardAccelerationOfflineCount() {
      return this.forwardAccelerationOffline_.size();
   }

   public List getForwardAccelerationOfflineList() {
      return this.forwardAccelerationOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getForwardAccelerationOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.forwardAccelerationOffline_.get(var1);
   }

   public List getForwardAccelerationOfflineOrBuilderList() {
      return this.forwardAccelerationOffline_;
   }

   public Types$PbSensorOffline getHeartRateOffline(int var1) {
      return (Types$PbSensorOffline)this.heartRateOffline_.get(var1);
   }

   public int getHeartRateOfflineCount() {
      return this.heartRateOffline_.size();
   }

   public List getHeartRateOfflineList() {
      return this.heartRateOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getHeartRateOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.heartRateOffline_.get(var1);
   }

   public List getHeartRateOfflineOrBuilderList() {
      return this.heartRateOffline_;
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

   public Types$PbSensorOffline getLeftPedalPowerOffline(int var1) {
      return (Types$PbSensorOffline)this.leftPedalPowerOffline_.get(var1);
   }

   public int getLeftPedalPowerOfflineCount() {
      return this.leftPedalPowerOffline_.size();
   }

   public List getLeftPedalPowerOfflineList() {
      return this.leftPedalPowerOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getLeftPedalPowerOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.leftPedalPowerOffline_.get(var1);
   }

   public List getLeftPedalPowerOfflineOrBuilderList() {
      return this.leftPedalPowerOffline_;
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

   public Types$PbSensorOffline getMovingTypeOffline(int var1) {
      return (Types$PbSensorOffline)this.movingTypeOffline_.get(var1);
   }

   public int getMovingTypeOfflineCount() {
      return this.movingTypeOffline_.size();
   }

   public List getMovingTypeOfflineList() {
      return this.movingTypeOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getMovingTypeOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.movingTypeOffline_.get(var1);
   }

   public List getMovingTypeOfflineOrBuilderList() {
      return this.movingTypeOffline_;
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

   public Structures$PbPauseTime getPauseTimes(int var1) {
      return (Structures$PbPauseTime)this.pauseTimes_.get(var1);
   }

   public int getPauseTimesCount() {
      return this.pauseTimes_.size();
   }

   public List getPauseTimesList() {
      return this.pauseTimes_;
   }

   public Structures$PbPauseTimeOrBuilder getPauseTimesOrBuilder(int var1) {
      return (Structures$PbPauseTimeOrBuilder)this.pauseTimes_.get(var1);
   }

   public List getPauseTimesOrBuilderList() {
      return this.pauseTimes_;
   }

   public Types$PbDuration getRecordingInterval() {
      Types$PbDuration var1;
      if (this.recordingInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.recordingInterval_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getRecordingIntervalOrBuilder() {
      Types$PbDuration var1;
      if (this.recordingInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.recordingInterval_;
      }

      return var1;
   }

   public Types$PbSensorOffline getRightPedalPowerOffline(int var1) {
      return (Types$PbSensorOffline)this.rightPedalPowerOffline_.get(var1);
   }

   public int getRightPedalPowerOfflineCount() {
      return this.rightPedalPowerOffline_.size();
   }

   public List getRightPedalPowerOfflineList() {
      return this.rightPedalPowerOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getRightPedalPowerOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.rightPedalPowerOffline_.get(var1);
   }

   public List getRightPedalPowerOfflineOrBuilderList() {
      return this.rightPedalPowerOffline_;
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

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         if ((this.bitField0_ & 1) == 1) {
            var2 = CodedOutputStream.computeMessageSize(1, this.getRecordingInterval()) + 0;
         } else {
            var2 = 0;
         }

         int var3 = 0;

         int var4;
         for(var4 = 0; var3 < this.heartRateSamples_.size(); ++var3) {
            var4 += CodedOutputStream.computeUInt32SizeNoTag((Integer)this.heartRateSamples_.get(var3));
         }

         var3 = var2 + var4;
         var2 = var3;
         if (!this.getHeartRateSamplesList().isEmpty()) {
            var2 = var3 + 1 + CodedOutputStream.computeInt32SizeNoTag(var4);
         }

         this.heartRateSamplesMemoizedSerializedSize = var4;

         for(var4 = 0; var4 < this.heartRateOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(3, (MessageLite)this.heartRateOffline_.get(var4));
         }

         var3 = 0;

         for(var4 = 0; var3 < this.cadenceSamples_.size(); ++var3) {
            var4 += CodedOutputStream.computeUInt32SizeNoTag((Integer)this.cadenceSamples_.get(var3));
         }

         var3 = var2 + var4;
         var2 = var3;
         if (!this.getCadenceSamplesList().isEmpty()) {
            var2 = var3 + 1 + CodedOutputStream.computeInt32SizeNoTag(var4);
         }

         this.cadenceSamplesMemoizedSerializedSize = var4;

         for(var4 = 0; var4 < this.cadenceOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(5, (MessageLite)this.cadenceOffline_.get(var4));
         }

         var3 = this.getAltitudeSamplesList().size() * 4;
         var4 = var2 + var3;
         var2 = var4;
         if (!this.getAltitudeSamplesList().isEmpty()) {
            var2 = var4 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.altitudeSamplesMemoizedSerializedSize = var3;

         for(var4 = 0; var4 < this.altitudeCalibration_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(7, (MessageLite)this.altitudeCalibration_.get(var4));
         }

         var3 = this.getTemperatureSamplesList().size() * 4;
         var4 = var2 + var3;
         var2 = var4;
         if (!this.getTemperatureSamplesList().isEmpty()) {
            var2 = var4 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.temperatureSamplesMemoizedSerializedSize = var3;
         var3 = this.getSpeedSamplesList().size() * 4;
         var4 = var2 + var3;
         var2 = var4;
         if (!this.getSpeedSamplesList().isEmpty()) {
            var2 = var4 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.speedSamplesMemoizedSerializedSize = var3;

         for(var4 = 0; var4 < this.speedOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(10, (MessageLite)this.speedOffline_.get(var4));
         }

         var3 = this.getDistanceSamplesList().size() * 4;
         var4 = var2 + var3;
         var2 = var4;
         if (!this.getDistanceSamplesList().isEmpty()) {
            var2 = var4 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.distanceSamplesMemoizedSerializedSize = var3;

         for(var4 = 0; var4 < this.distanceOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(12, (MessageLite)this.distanceOffline_.get(var4));
         }

         var3 = 0;

         for(var4 = 0; var3 < this.strideLengthSamples_.size(); ++var3) {
            var4 += CodedOutputStream.computeUInt32SizeNoTag((Integer)this.strideLengthSamples_.get(var3));
         }

         var3 = var2 + var4;
         var2 = var3;
         if (!this.getStrideLengthSamplesList().isEmpty()) {
            var2 = var3 + 1 + CodedOutputStream.computeInt32SizeNoTag(var4);
         }

         this.strideLengthSamplesMemoizedSerializedSize = var4;

         for(var4 = 0; var4 < this.strideLengthOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(14, (MessageLite)this.strideLengthOffline_.get(var4));
         }

         for(var4 = 0; var4 < this.strideCalibration_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(15, (MessageLite)this.strideCalibration_.get(var4));
         }

         int var5 = this.getForwardAccelerationList().size();
         int var6 = this.getForwardAccelerationList().size();
         var3 = 0;

         for(var4 = 0; var3 < this.movingTypeSamples_.size(); ++var3) {
            var4 += CodedOutputStream.computeEnumSizeNoTag((Integer)this.movingTypeSamples_.get(var3));
         }

         int var7 = this.movingTypeSamples_.size();
         byte var8 = 0;
         var2 = var5 * 4 + var2 + var6 * 2 + var4 + var7 * 2;

         for(var4 = var8; var4 < this.altitudeOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(18, (MessageLite)this.altitudeOffline_.get(var4));
         }

         for(var4 = 0; var4 < this.temperatureOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(19, (MessageLite)this.temperatureOffline_.get(var4));
         }

         for(var4 = 0; var4 < this.forwardAccelerationOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(20, (MessageLite)this.forwardAccelerationOffline_.get(var4));
         }

         for(var4 = 0; var4 < this.movingTypeOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(21, (MessageLite)this.movingTypeOffline_.get(var4));
         }

         for(var4 = 0; var4 < this.leftPedalPowerSamples_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(22, (MessageLite)this.leftPedalPowerSamples_.get(var4));
         }

         for(var4 = 0; var4 < this.leftPedalPowerOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(23, (MessageLite)this.leftPedalPowerOffline_.get(var4));
         }

         for(var4 = 0; var4 < this.rightPedalPowerSamples_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(24, (MessageLite)this.rightPedalPowerSamples_.get(var4));
         }

         for(var4 = 0; var4 < this.rightPedalPowerOffline_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(25, (MessageLite)this.rightPedalPowerOffline_.get(var4));
         }

         for(var4 = 0; var4 < this.leftPowerCalibration_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(26, (MessageLite)this.leftPowerCalibration_.get(var4));
         }

         for(var4 = 0; var4 < this.rightPowerCalibration_.size(); ++var4) {
            var2 += CodedOutputStream.computeMessageSize(27, (MessageLite)this.rightPowerCalibration_.get(var4));
         }

         var4 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var4 = var2 + CodedOutputStream.computeMessageSize(28, this.getRrSamples());
         }

         var8 = 0;
         var2 = var4;
         var4 = var8;

         while(true) {
            var3 = var1;
            var6 = var2;
            if (var4 >= this.exerciseIntervalledSampleList_.size()) {
               while(var3 < this.pauseTimes_.size()) {
                  var6 += CodedOutputStream.computeMessageSize(30, (MessageLite)this.pauseTimes_.get(var3));
                  ++var3;
               }

               var2 = this.unknownFields.getSerializedSize() + var6;
               this.memoizedSize = var2;
               break;
            }

            var2 += CodedOutputStream.computeMessageSize(29, (MessageLite)this.exerciseIntervalledSampleList_.get(var4));
            ++var4;
         }
      }

      return var2;
   }

   public Types$PbSensorOffline getSpeedOffline(int var1) {
      return (Types$PbSensorOffline)this.speedOffline_.get(var1);
   }

   public int getSpeedOfflineCount() {
      return this.speedOffline_.size();
   }

   public List getSpeedOfflineList() {
      return this.speedOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getSpeedOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.speedOffline_.get(var1);
   }

   public List getSpeedOfflineOrBuilderList() {
      return this.speedOffline_;
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

   public Types$PbSensorOffline getStrideLengthOffline(int var1) {
      return (Types$PbSensorOffline)this.strideLengthOffline_.get(var1);
   }

   public int getStrideLengthOfflineCount() {
      return this.strideLengthOffline_.size();
   }

   public List getStrideLengthOfflineList() {
      return this.strideLengthOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getStrideLengthOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.strideLengthOffline_.get(var1);
   }

   public List getStrideLengthOfflineOrBuilderList() {
      return this.strideLengthOffline_;
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

   public Types$PbSensorOffline getTemperatureOffline(int var1) {
      return (Types$PbSensorOffline)this.temperatureOffline_.get(var1);
   }

   public int getTemperatureOfflineCount() {
      return this.temperatureOffline_.size();
   }

   public List getTemperatureOfflineList() {
      return this.temperatureOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getTemperatureOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.temperatureOffline_.get(var1);
   }

   public List getTemperatureOfflineOrBuilderList() {
      return this.temperatureOffline_;
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

   public boolean hasRecordingInterval() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRrSamples() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
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
         if (this.hasRecordingInterval()) {
            var1 = (var2 * 37 + 1) * 53 + this.getRecordingInterval().hashCode();
         }

         var2 = var1;
         if (this.getHeartRateSamplesCount() > 0) {
            var2 = (var1 * 37 + 2) * 53 + this.getHeartRateSamplesList().hashCode();
         }

         var1 = var2;
         if (this.getHeartRateOfflineCount() > 0) {
            var1 = (var2 * 37 + 3) * 53 + this.getHeartRateOfflineList().hashCode();
         }

         int var3 = var1;
         if (this.getCadenceSamplesCount() > 0) {
            var3 = (var1 * 37 + 4) * 53 + this.getCadenceSamplesList().hashCode();
         }

         var2 = var3;
         if (this.getCadenceOfflineCount() > 0) {
            var2 = (var3 * 37 + 5) * 53 + this.getCadenceOfflineList().hashCode();
         }

         var1 = var2;
         if (this.getAltitudeSamplesCount() > 0) {
            var1 = (var2 * 37 + 6) * 53 + this.getAltitudeSamplesList().hashCode();
         }

         var3 = var1;
         if (this.getAltitudeOfflineCount() > 0) {
            var3 = (var1 * 37 + 18) * 53 + this.getAltitudeOfflineList().hashCode();
         }

         var2 = var3;
         if (this.getAltitudeCalibrationCount() > 0) {
            var2 = (var3 * 37 + 7) * 53 + this.getAltitudeCalibrationList().hashCode();
         }

         var1 = var2;
         if (this.getTemperatureSamplesCount() > 0) {
            var1 = (var2 * 37 + 8) * 53 + this.getTemperatureSamplesList().hashCode();
         }

         var2 = var1;
         if (this.getTemperatureOfflineCount() > 0) {
            var2 = (var1 * 37 + 19) * 53 + this.getTemperatureOfflineList().hashCode();
         }

         var1 = var2;
         if (this.getSpeedSamplesCount() > 0) {
            var1 = (var2 * 37 + 9) * 53 + this.getSpeedSamplesList().hashCode();
         }

         var2 = var1;
         if (this.getSpeedOfflineCount() > 0) {
            var2 = (var1 * 37 + 10) * 53 + this.getSpeedOfflineList().hashCode();
         }

         var3 = var2;
         if (this.getDistanceSamplesCount() > 0) {
            var3 = (var2 * 37 + 11) * 53 + this.getDistanceSamplesList().hashCode();
         }

         var1 = var3;
         if (this.getDistanceOfflineCount() > 0) {
            var1 = (var3 * 37 + 12) * 53 + this.getDistanceOfflineList().hashCode();
         }

         var2 = var1;
         if (this.getStrideLengthSamplesCount() > 0) {
            var2 = (var1 * 37 + 13) * 53 + this.getStrideLengthSamplesList().hashCode();
         }

         var1 = var2;
         if (this.getStrideLengthOfflineCount() > 0) {
            var1 = (var2 * 37 + 14) * 53 + this.getStrideLengthOfflineList().hashCode();
         }

         var2 = var1;
         if (this.getStrideCalibrationCount() > 0) {
            var2 = (var1 * 37 + 15) * 53 + this.getStrideCalibrationList().hashCode();
         }

         var1 = var2;
         if (this.getForwardAccelerationCount() > 0) {
            var1 = (var2 * 37 + 16) * 53 + this.getForwardAccelerationList().hashCode();
         }

         var2 = var1;
         if (this.getForwardAccelerationOfflineCount() > 0) {
            var2 = (var1 * 37 + 20) * 53 + this.getForwardAccelerationOfflineList().hashCode();
         }

         var1 = var2;
         if (this.getMovingTypeSamplesCount() > 0) {
            var1 = (var2 * 37 + 17) * 53 + this.movingTypeSamples_.hashCode();
         }

         var2 = var1;
         if (this.getMovingTypeOfflineCount() > 0) {
            var2 = (var1 * 37 + 21) * 53 + this.getMovingTypeOfflineList().hashCode();
         }

         var1 = var2;
         if (this.getLeftPedalPowerSamplesCount() > 0) {
            var1 = (var2 * 37 + 22) * 53 + this.getLeftPedalPowerSamplesList().hashCode();
         }

         var2 = var1;
         if (this.getLeftPedalPowerOfflineCount() > 0) {
            var2 = (var1 * 37 + 23) * 53 + this.getLeftPedalPowerOfflineList().hashCode();
         }

         var1 = var2;
         if (this.getRightPedalPowerSamplesCount() > 0) {
            var1 = (var2 * 37 + 24) * 53 + this.getRightPedalPowerSamplesList().hashCode();
         }

         var2 = var1;
         if (this.getRightPedalPowerOfflineCount() > 0) {
            var2 = (var1 * 37 + 25) * 53 + this.getRightPedalPowerOfflineList().hashCode();
         }

         var1 = var2;
         if (this.getLeftPowerCalibrationCount() > 0) {
            var1 = (var2 * 37 + 26) * 53 + this.getLeftPowerCalibrationList().hashCode();
         }

         var2 = var1;
         if (this.getRightPowerCalibrationCount() > 0) {
            var2 = (var1 * 37 + 27) * 53 + this.getRightPowerCalibrationList().hashCode();
         }

         var1 = var2;
         if (this.hasRrSamples()) {
            var1 = (var2 * 37 + 28) * 53 + this.getRrSamples().hashCode();
         }

         var2 = var1;
         if (this.getExerciseIntervalledSampleListCount() > 0) {
            var2 = (var1 * 37 + 29) * 53 + this.getExerciseIntervalledSampleListList().hashCode();
         }

         var1 = var2;
         if (this.getPauseTimesCount() > 0) {
            var1 = (var2 * 37 + 30) * 53 + this.getPauseTimesList().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSamples.h().ensureFieldAccessorsInitialized(ExerciseSamples$PbExerciseSamples.class, ExerciseSamples$PbExerciseSamples$Builder.class);
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
            if (!this.hasRecordingInterval()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getHeartRateOfflineCount()) {
                     for(var4 = 0; var4 < this.getCadenceOfflineCount(); ++var4) {
                        if (!this.getCadenceOffline(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getAltitudeOfflineCount(); ++var4) {
                        if (!this.getAltitudeOffline(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getAltitudeCalibrationCount(); ++var4) {
                        if (!this.getAltitudeCalibration(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getTemperatureOfflineCount(); ++var4) {
                        if (!this.getTemperatureOffline(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getSpeedOfflineCount(); ++var4) {
                        if (!this.getSpeedOffline(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getDistanceOfflineCount(); ++var4) {
                        if (!this.getDistanceOffline(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getStrideLengthOfflineCount(); ++var4) {
                        if (!this.getStrideLengthOffline(var4).isInitialized()) {
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

                     for(var4 = 0; var4 < this.getForwardAccelerationOfflineCount(); ++var4) {
                        if (!this.getForwardAccelerationOffline(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getMovingTypeOfflineCount(); ++var4) {
                        if (!this.getMovingTypeOffline(var4).isInitialized()) {
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

                     for(var4 = 0; var4 < this.getLeftPedalPowerOfflineCount(); ++var4) {
                        if (!this.getLeftPedalPowerOffline(var4).isInitialized()) {
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

                     for(var4 = 0; var4 < this.getRightPedalPowerOfflineCount(); ++var4) {
                        if (!this.getRightPedalPowerOffline(var4).isInitialized()) {
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

                     if (!this.hasRrSamples() || this.getRrSamples().isInitialized()) {
                        for(var4 = 0; var4 < this.getExerciseIntervalledSampleListCount(); ++var4) {
                           if (!this.getExerciseIntervalledSampleList(var4).isInitialized()) {
                              this.memoizedIsInitialized = (byte)0;
                              var3 = var1;
                              return var3;
                           }
                        }

                        for(var4 = 0; var4 < this.getPauseTimesCount(); ++var4) {
                           if (!this.getPauseTimes(var4).isInitialized()) {
                              this.memoizedIsInitialized = (byte)0;
                              var3 = var1;
                              return var3;
                           }
                        }

                        this.memoizedIsInitialized = (byte)1;
                        var3 = true;
                        break;
                     }

                     this.memoizedIsInitialized = (byte)0;
                     var3 = var1;
                     break;
                  }

                  if (!this.getHeartRateOffline(var4).isInitialized()) {
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

   public ExerciseSamples$PbExerciseSamples$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseSamples$PbExerciseSamples$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseSamples$PbExerciseSamples$Builder(var1, (ExerciseSamples$1)null);
   }

   public ExerciseSamples$PbExerciseSamples$Builder toBuilder() {
      ExerciseSamples$PbExerciseSamples$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseSamples$PbExerciseSamples$Builder((ExerciseSamples$1)null);
      } else {
         var1 = (new ExerciseSamples$PbExerciseSamples$Builder((ExerciseSamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;
      this.getSerializedSize();
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getRecordingInterval());
      }

      if (this.getHeartRateSamplesList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.heartRateSamplesMemoizedSerializedSize);
      }

      int var3;
      for(var3 = 0; var3 < this.heartRateSamples_.size(); ++var3) {
         var1.writeUInt32NoTag((Integer)this.heartRateSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.heartRateOffline_.size(); ++var3) {
         var1.writeMessage(3, (MessageLite)this.heartRateOffline_.get(var3));
      }

      if (this.getCadenceSamplesList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.cadenceSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.cadenceSamples_.size(); ++var3) {
         var1.writeUInt32NoTag((Integer)this.cadenceSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.cadenceOffline_.size(); ++var3) {
         var1.writeMessage(5, (MessageLite)this.cadenceOffline_.get(var3));
      }

      if (this.getAltitudeSamplesList().size() > 0) {
         var1.writeUInt32NoTag(50);
         var1.writeUInt32NoTag(this.altitudeSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.altitudeSamples_.size(); ++var3) {
         var1.writeFloatNoTag((Float)this.altitudeSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.altitudeCalibration_.size(); ++var3) {
         var1.writeMessage(7, (MessageLite)this.altitudeCalibration_.get(var3));
      }

      if (this.getTemperatureSamplesList().size() > 0) {
         var1.writeUInt32NoTag(66);
         var1.writeUInt32NoTag(this.temperatureSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.temperatureSamples_.size(); ++var3) {
         var1.writeFloatNoTag((Float)this.temperatureSamples_.get(var3));
      }

      if (this.getSpeedSamplesList().size() > 0) {
         var1.writeUInt32NoTag(74);
         var1.writeUInt32NoTag(this.speedSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.speedSamples_.size(); ++var3) {
         var1.writeFloatNoTag((Float)this.speedSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.speedOffline_.size(); ++var3) {
         var1.writeMessage(10, (MessageLite)this.speedOffline_.get(var3));
      }

      if (this.getDistanceSamplesList().size() > 0) {
         var1.writeUInt32NoTag(90);
         var1.writeUInt32NoTag(this.distanceSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.distanceSamples_.size(); ++var3) {
         var1.writeFloatNoTag((Float)this.distanceSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.distanceOffline_.size(); ++var3) {
         var1.writeMessage(12, (MessageLite)this.distanceOffline_.get(var3));
      }

      if (this.getStrideLengthSamplesList().size() > 0) {
         var1.writeUInt32NoTag(106);
         var1.writeUInt32NoTag(this.strideLengthSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.strideLengthSamples_.size(); ++var3) {
         var1.writeUInt32NoTag((Integer)this.strideLengthSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.strideLengthOffline_.size(); ++var3) {
         var1.writeMessage(14, (MessageLite)this.strideLengthOffline_.get(var3));
      }

      for(var3 = 0; var3 < this.strideCalibration_.size(); ++var3) {
         var1.writeMessage(15, (MessageLite)this.strideCalibration_.get(var3));
      }

      for(var3 = 0; var3 < this.forwardAcceleration_.size(); ++var3) {
         var1.writeFloat(16, (Float)this.forwardAcceleration_.get(var3));
      }

      for(var3 = 0; var3 < this.movingTypeSamples_.size(); ++var3) {
         var1.writeEnum(17, (Integer)this.movingTypeSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.altitudeOffline_.size(); ++var3) {
         var1.writeMessage(18, (MessageLite)this.altitudeOffline_.get(var3));
      }

      for(var3 = 0; var3 < this.temperatureOffline_.size(); ++var3) {
         var1.writeMessage(19, (MessageLite)this.temperatureOffline_.get(var3));
      }

      for(var3 = 0; var3 < this.forwardAccelerationOffline_.size(); ++var3) {
         var1.writeMessage(20, (MessageLite)this.forwardAccelerationOffline_.get(var3));
      }

      for(var3 = 0; var3 < this.movingTypeOffline_.size(); ++var3) {
         var1.writeMessage(21, (MessageLite)this.movingTypeOffline_.get(var3));
      }

      for(var3 = 0; var3 < this.leftPedalPowerSamples_.size(); ++var3) {
         var1.writeMessage(22, (MessageLite)this.leftPedalPowerSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.leftPedalPowerOffline_.size(); ++var3) {
         var1.writeMessage(23, (MessageLite)this.leftPedalPowerOffline_.get(var3));
      }

      for(var3 = 0; var3 < this.rightPedalPowerSamples_.size(); ++var3) {
         var1.writeMessage(24, (MessageLite)this.rightPedalPowerSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.rightPedalPowerOffline_.size(); ++var3) {
         var1.writeMessage(25, (MessageLite)this.rightPedalPowerOffline_.get(var3));
      }

      for(var3 = 0; var3 < this.leftPowerCalibration_.size(); ++var3) {
         var1.writeMessage(26, (MessageLite)this.leftPowerCalibration_.get(var3));
      }

      for(var3 = 0; var3 < this.rightPowerCalibration_.size(); ++var3) {
         var1.writeMessage(27, (MessageLite)this.rightPowerCalibration_.get(var3));
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(28, this.getRrSamples());
      }

      int var4 = 0;

      while(true) {
         var3 = var2;
         if (var4 >= this.exerciseIntervalledSampleList_.size()) {
            while(var3 < this.pauseTimes_.size()) {
               var1.writeMessage(30, (MessageLite)this.pauseTimes_.get(var3));
               ++var3;
            }

            this.unknownFields.writeTo(var1);
            return;
         }

         var1.writeMessage(29, (MessageLite)this.exerciseIntervalledSampleList_.get(var4));
         ++var4;
      }
   }
}
