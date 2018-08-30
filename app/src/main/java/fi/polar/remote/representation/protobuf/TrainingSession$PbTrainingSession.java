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
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class TrainingSession$PbTrainingSession extends GeneratedMessageV3 implements TrainingSession$PbTrainingSessionOrBuilder {
   public static final int BENEFIT_FIELD_NUMBER = 17;
   public static final int CALORIES_FIELD_NUMBER = 7;
   private static final TrainingSession$PbTrainingSession DEFAULT_INSTANCE = new TrainingSession$PbTrainingSession();
   public static final int DEVICE_ID_FIELD_NUMBER = 3;
   public static final int DISTANCE_FIELD_NUMBER = 6;
   public static final int DURATION_FIELD_NUMBER = 5;
   public static final int END_FIELD_NUMBER = 20;
   public static final int EXERCISE_COUNT_FIELD_NUMBER = 2;
   public static final int FEELING_FIELD_NUMBER = 12;
   public static final int HEART_RATE_FIELD_NUMBER = 8;
   public static final int HEART_RATE_ZONE_DURATION_FIELD_NUMBER = 9;
   public static final int LATITUDE_FIELD_NUMBER = 15;
   public static final int LONGITUDE_FIELD_NUMBER = 16;
   public static final int MODEL_NAME_FIELD_NUMBER = 4;
   public static final int NOTE_FIELD_NUMBER = 13;
   @Deprecated
   public static final Parser PARSER = new TrainingSession$PbTrainingSession$1();
   public static final int PLACE_FIELD_NUMBER = 14;
   public static final int SESSION_NAME_FIELD_NUMBER = 11;
   public static final int SPORT_FIELD_NUMBER = 18;
   public static final int START_FIELD_NUMBER = 1;
   public static final int TRAINING_LOAD_FIELD_NUMBER = 10;
   public static final int TRAINING_SESSION_FAVORITE_ID_FIELD_NUMBER = 21;
   public static final int TRAINING_SESSION_TARGET_ID_FIELD_NUMBER = 19;
   private static final long serialVersionUID = 0L;
   private int benefit_;
   private int bitField0_;
   private int calories_;
   private volatile Object deviceId_;
   private float distance_;
   private Types$PbDuration duration_;
   private Types$PbLocalDateTime end_;
   private int exerciseCount_;
   private float feeling_;
   private List heartRateZoneDuration_;
   private TrainingSession$PbSessionHeartRateStatistics heartRate_;
   private double latitude_;
   private double longitude_;
   private byte memoizedIsInitialized;
   private volatile Object modelName_;
   private Structures$PbMultiLineText note_;
   private Structures$PbOneLineText place_;
   private Structures$PbOneLineText sessionName_;
   private Structures$PbSportIdentifier sport_;
   private Types$PbLocalDateTime start_;
   private Structures$PbTrainingLoad trainingLoad_;
   private Structures$PbTrainingSessionFavoriteId trainingSessionFavoriteId_;
   private Structures$PbTrainingSessionTargetId trainingSessionTargetId_;

   private TrainingSession$PbTrainingSession() {
      this.memoizedIsInitialized = (byte)-1;
      this.exerciseCount_ = 0;
      this.deviceId_ = "";
      this.modelName_ = "";
      this.distance_ = 0.0F;
      this.calories_ = 0;
      this.heartRateZoneDuration_ = Collections.emptyList();
      this.feeling_ = 0.0F;
      this.latitude_ = 0.0D;
      this.longitude_ = 0.0D;
      this.benefit_ = 1;
   }

   private TrainingSession$PbTrainingSession(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   TrainingSession$PbTrainingSession(CodedInputStream var1, ExtensionRegistryLite var2, TrainingSession$1 var3) {
      this(var1, var2);
   }

   private TrainingSession$PbTrainingSession(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   TrainingSession$PbTrainingSession(Builder var1, TrainingSession$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static double a(TrainingSession$PbTrainingSession var0, double var1) {
      var0.latitude_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float a(TrainingSession$PbTrainingSession var0, float var1) {
      var0.distance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(TrainingSession$PbTrainingSession var0, int var1) {
      var0.exerciseCount_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbMultiLineText a(TrainingSession$PbTrainingSession var0, Structures$PbMultiLineText var1) {
      var0.note_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbOneLineText a(TrainingSession$PbTrainingSession var0, Structures$PbOneLineText var1) {
      var0.sessionName_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbSportIdentifier a(TrainingSession$PbTrainingSession var0, Structures$PbSportIdentifier var1) {
      var0.sport_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbTrainingLoad a(TrainingSession$PbTrainingSession var0, Structures$PbTrainingLoad var1) {
      var0.trainingLoad_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbTrainingSessionFavoriteId a(TrainingSession$PbTrainingSession var0, Structures$PbTrainingSessionFavoriteId var1) {
      var0.trainingSessionFavoriteId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbTrainingSessionTargetId a(TrainingSession$PbTrainingSession var0, Structures$PbTrainingSessionTargetId var1) {
      var0.trainingSessionTargetId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static TrainingSession$PbSessionHeartRateStatistics a(TrainingSession$PbTrainingSession var0, TrainingSession$PbSessionHeartRateStatistics var1) {
      var0.heartRate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(TrainingSession$PbTrainingSession var0, Types$PbDuration var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(TrainingSession$PbTrainingSession var0, Types$PbLocalDateTime var1) {
      var0.start_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(TrainingSession$PbTrainingSession var0) {
      return var0.deviceId_;
   }

   // $FF: synthetic method
   static Object a(TrainingSession$PbTrainingSession var0, Object var1) {
      var0.deviceId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(TrainingSession$PbTrainingSession var0, List var1) {
      var0.heartRateZoneDuration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static double b(TrainingSession$PbTrainingSession var0, double var1) {
      var0.longitude_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float b(TrainingSession$PbTrainingSession var0, float var1) {
      var0.feeling_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(TrainingSession$PbTrainingSession var0, int var1) {
      var0.calories_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbOneLineText b(TrainingSession$PbTrainingSession var0, Structures$PbOneLineText var1) {
      var0.place_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime b(TrainingSession$PbTrainingSession var0, Types$PbLocalDateTime var1) {
      var0.end_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object b(TrainingSession$PbTrainingSession var0) {
      return var0.modelName_;
   }

   // $FF: synthetic method
   static Object b(TrainingSession$PbTrainingSession var0, Object var1) {
      var0.modelName_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(TrainingSession$PbTrainingSession var0, int var1) {
      var0.benefit_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List c(TrainingSession$PbTrainingSession var0) {
      return var0.heartRateZoneDuration_;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int d(TrainingSession$PbTrainingSession var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet d(TrainingSession$PbTrainingSession var0) {
      return var0.unknownFields;
   }

   public static TrainingSession$PbTrainingSession getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return TrainingSession.c();
   }

   public static TrainingSession$PbTrainingSession$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TrainingSession$PbTrainingSession$Builder newBuilder(TrainingSession$PbTrainingSession var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static TrainingSession$PbTrainingSession parseDelimitedFrom(InputStream var0) {
      return (TrainingSession$PbTrainingSession)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TrainingSession$PbTrainingSession parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSession$PbTrainingSession)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TrainingSession$PbTrainingSession parseFrom(ByteString var0) {
      return (TrainingSession$PbTrainingSession)PARSER.parseFrom(var0);
   }

   public static TrainingSession$PbTrainingSession parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (TrainingSession$PbTrainingSession)PARSER.parseFrom(var0, var1);
   }

   public static TrainingSession$PbTrainingSession parseFrom(CodedInputStream var0) {
      return (TrainingSession$PbTrainingSession)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrainingSession$PbTrainingSession parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSession$PbTrainingSession)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrainingSession$PbTrainingSession parseFrom(InputStream var0) {
      return (TrainingSession$PbTrainingSession)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrainingSession$PbTrainingSession parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSession$PbTrainingSession)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrainingSession$PbTrainingSession parseFrom(byte[] var0) {
      return (TrainingSession$PbTrainingSession)PARSER.parseFrom(var0);
   }

   public static TrainingSession$PbTrainingSession parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (TrainingSession$PbTrainingSession)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof TrainingSession$PbTrainingSession)) {
            var2 = super.equals(var1);
         } else {
            TrainingSession$PbTrainingSession var5 = (TrainingSession$PbTrainingSession)var1;
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

            if (var4 && this.hasEnd() == var5.hasEnd()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasEnd()) {
               if (var3 && this.getEnd().equals(var5.getEnd())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasExerciseCount() == var5.hasExerciseCount()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasExerciseCount()) {
               if (var4 && this.getExerciseCount() == var5.getExerciseCount()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDeviceId() == var5.hasDeviceId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDeviceId()) {
               if (var3 && this.getDeviceId().equals(var5.getDeviceId())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasModelName() == var5.hasModelName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasModelName()) {
               if (var3 && this.getModelName().equals(var5.getModelName())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDuration() == var5.hasDuration()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDuration()) {
               if (var4 && this.getDuration().equals(var5.getDuration())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDistance() == var5.hasDistance()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDistance()) {
               if (var3 && Float.floatToIntBits(this.getDistance()) == Float.floatToIntBits(var5.getDistance())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCalories() == var5.hasCalories()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasCalories()) {
               if (var3 && this.getCalories() == var5.getCalories()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasHeartRate() == var5.hasHeartRate()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasHeartRate()) {
               if (var4 && this.getHeartRate().equals(var5.getHeartRate())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.getHeartRateZoneDurationList().equals(var5.getHeartRateZoneDurationList())) {
               var3 = true;
            } else {
               var3 = false;
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

            if (var3 && this.hasSessionName() == var5.hasSessionName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSessionName()) {
               if (var3 && this.getSessionName().equals(var5.getSessionName())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasFeeling() == var5.hasFeeling()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFeeling()) {
               if (var4 && Float.floatToIntBits(this.getFeeling()) == Float.floatToIntBits(var5.getFeeling())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasNote() == var5.hasNote()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasNote()) {
               if (var4 && this.getNote().equals(var5.getNote())) {
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
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLongitude()) {
               if (var3 && Double.doubleToLongBits(this.getLongitude()) == Double.doubleToLongBits(var5.getLongitude())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasBenefit() == var5.hasBenefit()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasBenefit()) {
               if (var3 && this.benefit_ == var5.benefit_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSport() == var5.hasSport()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSport()) {
               if (var3 && this.getSport().equals(var5.getSport())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTrainingSessionTargetId() == var5.hasTrainingSessionTargetId()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTrainingSessionTargetId()) {
               if (var4 && this.getTrainingSessionTargetId().equals(var5.getTrainingSessionTargetId())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasTrainingSessionFavoriteId() == var5.hasTrainingSessionFavoriteId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTrainingSessionFavoriteId()) {
               if (var3 && this.getTrainingSessionFavoriteId().equals(var5.getTrainingSessionFavoriteId())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public Types$PbExerciseFeedback getBenefit() {
      Types$PbExerciseFeedback var1 = Types$PbExerciseFeedback.valueOf(this.benefit_);
      Types$PbExerciseFeedback var2 = var1;
      if (var1 == null) {
         var2 = Types$PbExerciseFeedback.FEEDBACK_NONE;
      }

      return var2;
   }

   public int getCalories() {
      return this.calories_;
   }

   public TrainingSession$PbTrainingSession getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public String getDeviceId() {
      Object var1 = this.deviceId_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.deviceId_ = var3;
         }
      }

      return var3;
   }

   public ByteString getDeviceIdBytes() {
      Object var1 = this.deviceId_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.deviceId_ = var2;
      } else {
         var2 = (ByteString)var1;
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

   public Types$PbLocalDateTime getEnd() {
      Types$PbLocalDateTime var1;
      if (this.end_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.end_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getEndOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.end_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.end_;
      }

      return var1;
   }

   public int getExerciseCount() {
      return this.exerciseCount_;
   }

   public float getFeeling() {
      return this.feeling_;
   }

   public TrainingSession$PbSessionHeartRateStatistics getHeartRate() {
      TrainingSession$PbSessionHeartRateStatistics var1;
      if (this.heartRate_ == null) {
         var1 = TrainingSession$PbSessionHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return var1;
   }

   public TrainingSession$PbSessionHeartRateStatisticsOrBuilder getHeartRateOrBuilder() {
      TrainingSession$PbSessionHeartRateStatistics var1;
      if (this.heartRate_ == null) {
         var1 = TrainingSession$PbSessionHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return var1;
   }

   public Types$PbDuration getHeartRateZoneDuration(int var1) {
      return (Types$PbDuration)this.heartRateZoneDuration_.get(var1);
   }

   public int getHeartRateZoneDurationCount() {
      return this.heartRateZoneDuration_.size();
   }

   public List getHeartRateZoneDurationList() {
      return this.heartRateZoneDuration_;
   }

   public Types$PbDurationOrBuilder getHeartRateZoneDurationOrBuilder(int var1) {
      return (Types$PbDurationOrBuilder)this.heartRateZoneDuration_.get(var1);
   }

   public List getHeartRateZoneDurationOrBuilderList() {
      return this.heartRateZoneDuration_;
   }

   public double getLatitude() {
      return this.latitude_;
   }

   public double getLongitude() {
      return this.longitude_;
   }

   public String getModelName() {
      Object var1 = this.modelName_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.modelName_ = var3;
         }
      }

      return var3;
   }

   public ByteString getModelNameBytes() {
      Object var1 = this.modelName_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.modelName_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Structures$PbMultiLineText getNote() {
      Structures$PbMultiLineText var1;
      if (this.note_ == null) {
         var1 = Structures$PbMultiLineText.getDefaultInstance();
      } else {
         var1 = this.note_;
      }

      return var1;
   }

   public Structures$PbMultiLineTextOrBuilder getNoteOrBuilder() {
      Structures$PbMultiLineText var1;
      if (this.note_ == null) {
         var1 = Structures$PbMultiLineText.getDefaultInstance();
      } else {
         var1 = this.note_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public Structures$PbOneLineText getPlace() {
      Structures$PbOneLineText var1;
      if (this.place_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.place_;
      }

      return var1;
   }

   public Structures$PbOneLineTextOrBuilder getPlaceOrBuilder() {
      Structures$PbOneLineText var1;
      if (this.place_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.place_;
      }

      return var1;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         if ((this.bitField0_ & 1) == 1) {
            var2 = CodedOutputStream.computeMessageSize(1, this.getStart()) + 0;
         } else {
            var2 = 0;
         }

         int var3 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var3 = var2 + CodedOutputStream.computeUInt32Size(2, this.exerciseCount_);
         }

         var2 = var3;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var3 + GeneratedMessageV3.computeStringSize(3, this.deviceId_);
         }

         var3 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var3 = var2 + GeneratedMessageV3.computeStringSize(4, this.modelName_);
         }

         var2 = var3;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var3 + CodedOutputStream.computeMessageSize(5, this.getDuration());
         }

         var3 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var3 = var2 + CodedOutputStream.computeFloatSize(6, this.distance_);
         }

         var2 = var3;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var3 + CodedOutputStream.computeUInt32Size(7, this.calories_);
         }

         var3 = var2;
         if ((this.bitField0_ & 256) == 256) {
            var3 = var2 + CodedOutputStream.computeMessageSize(8, this.getHeartRate());
         }

         var2 = var3;

         int var4;
         for(var3 = var1; var3 < this.heartRateZoneDuration_.size(); var2 += var4) {
            var4 = CodedOutputStream.computeMessageSize(9, (MessageLite)this.heartRateZoneDuration_.get(var3));
            ++var3;
         }

         var3 = var2;
         if ((this.bitField0_ & 512) == 512) {
            var3 = var2 + CodedOutputStream.computeMessageSize(10, this.getTrainingLoad());
         }

         var2 = var3;
         if ((this.bitField0_ & 1024) == 1024) {
            var2 = var3 + CodedOutputStream.computeMessageSize(11, this.getSessionName());
         }

         var4 = var2;
         if ((this.bitField0_ & 2048) == 2048) {
            var4 = var2 + CodedOutputStream.computeFloatSize(12, this.feeling_);
         }

         var3 = var4;
         if ((this.bitField0_ & 4096) == 4096) {
            var3 = var4 + CodedOutputStream.computeMessageSize(13, this.getNote());
         }

         var2 = var3;
         if ((this.bitField0_ & 8192) == 8192) {
            var2 = var3 + CodedOutputStream.computeMessageSize(14, this.getPlace());
         }

         var3 = var2;
         if ((this.bitField0_ & 16384) == 16384) {
            var3 = var2 + CodedOutputStream.computeDoubleSize(15, this.latitude_);
         }

         var2 = var3;
         if ((this.bitField0_ & '耀') == 32768) {
            var2 = var3 + CodedOutputStream.computeDoubleSize(16, this.longitude_);
         }

         var3 = var2;
         if ((this.bitField0_ & 65536) == 65536) {
            var3 = var2 + CodedOutputStream.computeEnumSize(17, this.benefit_);
         }

         var2 = var3;
         if ((this.bitField0_ & 131072) == 131072) {
            var2 = var3 + CodedOutputStream.computeMessageSize(18, this.getSport());
         }

         var3 = var2;
         if ((this.bitField0_ & 262144) == 262144) {
            var3 = var2 + CodedOutputStream.computeMessageSize(19, this.getTrainingSessionTargetId());
         }

         var2 = var3;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var3 + CodedOutputStream.computeMessageSize(20, this.getEnd());
         }

         var3 = var2;
         if ((this.bitField0_ & 524288) == 524288) {
            var3 = var2 + CodedOutputStream.computeMessageSize(21, this.getTrainingSessionFavoriteId());
         }

         var2 = this.unknownFields.getSerializedSize() + var3;
         this.memoizedSize = var2;
      }

      return var2;
   }

   public Structures$PbOneLineText getSessionName() {
      Structures$PbOneLineText var1;
      if (this.sessionName_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.sessionName_;
      }

      return var1;
   }

   public Structures$PbOneLineTextOrBuilder getSessionNameOrBuilder() {
      Structures$PbOneLineText var1;
      if (this.sessionName_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.sessionName_;
      }

      return var1;
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

   public Structures$PbTrainingSessionFavoriteId getTrainingSessionFavoriteId() {
      Structures$PbTrainingSessionFavoriteId var1;
      if (this.trainingSessionFavoriteId_ == null) {
         var1 = Structures$PbTrainingSessionFavoriteId.getDefaultInstance();
      } else {
         var1 = this.trainingSessionFavoriteId_;
      }

      return var1;
   }

   public Structures$PbTrainingSessionFavoriteIdOrBuilder getTrainingSessionFavoriteIdOrBuilder() {
      Structures$PbTrainingSessionFavoriteId var1;
      if (this.trainingSessionFavoriteId_ == null) {
         var1 = Structures$PbTrainingSessionFavoriteId.getDefaultInstance();
      } else {
         var1 = this.trainingSessionFavoriteId_;
      }

      return var1;
   }

   public Structures$PbTrainingSessionTargetId getTrainingSessionTargetId() {
      Structures$PbTrainingSessionTargetId var1;
      if (this.trainingSessionTargetId_ == null) {
         var1 = Structures$PbTrainingSessionTargetId.getDefaultInstance();
      } else {
         var1 = this.trainingSessionTargetId_;
      }

      return var1;
   }

   public Structures$PbTrainingSessionTargetIdOrBuilder getTrainingSessionTargetIdOrBuilder() {
      Structures$PbTrainingSessionTargetId var1;
      if (this.trainingSessionTargetId_ == null) {
         var1 = Structures$PbTrainingSessionTargetId.getDefaultInstance();
      } else {
         var1 = this.trainingSessionTargetId_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasBenefit() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCalories() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceId() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEnd() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasExerciseCount() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFeeling() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRate() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLatitude() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLongitude() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasModelName() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasNote() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPlace() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSessionName() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSport() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
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
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingSessionFavoriteId() {
      boolean var1;
      if ((this.bitField0_ & 524288) == 524288) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingSessionTargetId() {
      boolean var1;
      if ((this.bitField0_ & 262144) == 262144) {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasStart()) {
            var2 = (var1 * 37 + 1) * 53 + this.getStart().hashCode();
         }

         var1 = var2;
         if (this.hasEnd()) {
            var1 = (var2 * 37 + 20) * 53 + this.getEnd().hashCode();
         }

         var2 = var1;
         if (this.hasExerciseCount()) {
            var2 = (var1 * 37 + 2) * 53 + this.getExerciseCount();
         }

         var1 = var2;
         if (this.hasDeviceId()) {
            var1 = (var2 * 37 + 3) * 53 + this.getDeviceId().hashCode();
         }

         var2 = var1;
         if (this.hasModelName()) {
            var2 = (var1 * 37 + 4) * 53 + this.getModelName().hashCode();
         }

         var1 = var2;
         if (this.hasDuration()) {
            var1 = (var2 * 37 + 5) * 53 + this.getDuration().hashCode();
         }

         var2 = var1;
         if (this.hasDistance()) {
            var2 = (var1 * 37 + 6) * 53 + Float.floatToIntBits(this.getDistance());
         }

         var1 = var2;
         if (this.hasCalories()) {
            var1 = (var2 * 37 + 7) * 53 + this.getCalories();
         }

         var2 = var1;
         if (this.hasHeartRate()) {
            var2 = (var1 * 37 + 8) * 53 + this.getHeartRate().hashCode();
         }

         var1 = var2;
         if (this.getHeartRateZoneDurationCount() > 0) {
            var1 = (var2 * 37 + 9) * 53 + this.getHeartRateZoneDurationList().hashCode();
         }

         var2 = var1;
         if (this.hasTrainingLoad()) {
            var2 = (var1 * 37 + 10) * 53 + this.getTrainingLoad().hashCode();
         }

         var1 = var2;
         if (this.hasSessionName()) {
            var1 = (var2 * 37 + 11) * 53 + this.getSessionName().hashCode();
         }

         var2 = var1;
         if (this.hasFeeling()) {
            var2 = (var1 * 37 + 12) * 53 + Float.floatToIntBits(this.getFeeling());
         }

         var1 = var2;
         if (this.hasNote()) {
            var1 = (var2 * 37 + 13) * 53 + this.getNote().hashCode();
         }

         var2 = var1;
         if (this.hasPlace()) {
            var2 = (var1 * 37 + 14) * 53 + this.getPlace().hashCode();
         }

         var1 = var2;
         if (this.hasLatitude()) {
            var1 = (var2 * 37 + 15) * 53 + Internal.hashLong(Double.doubleToLongBits(this.getLatitude()));
         }

         var2 = var1;
         if (this.hasLongitude()) {
            var2 = (var1 * 37 + 16) * 53 + Internal.hashLong(Double.doubleToLongBits(this.getLongitude()));
         }

         var1 = var2;
         if (this.hasBenefit()) {
            var1 = (var2 * 37 + 17) * 53 + this.benefit_;
         }

         var2 = var1;
         if (this.hasSport()) {
            var2 = (var1 * 37 + 18) * 53 + this.getSport().hashCode();
         }

         var1 = var2;
         if (this.hasTrainingSessionTargetId()) {
            var1 = (var2 * 37 + 19) * 53 + this.getTrainingSessionTargetId().hashCode();
         }

         var2 = var1;
         if (this.hasTrainingSessionFavoriteId()) {
            var2 = (var1 * 37 + 21) * 53 + this.getTrainingSessionFavoriteId().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return TrainingSession.d().ensureFieldAccessorsInitialized(TrainingSession$PbTrainingSession.class, TrainingSession$PbTrainingSession$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasStart()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasExerciseCount()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getStart().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasEnd() && !this.getEnd().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSessionName() && !this.getSessionName().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasNote() && !this.getNote().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasPlace() && !this.getPlace().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSport() && !this.getSport().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasTrainingSessionTargetId() && !this.getTrainingSessionTargetId().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasTrainingSessionFavoriteId() && !this.getTrainingSessionFavoriteId().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public TrainingSession$PbTrainingSession$Builder newBuilderForType() {
      return newBuilder();
   }

   protected TrainingSession$PbTrainingSession$Builder newBuilderForType(BuilderParent var1) {
      return new TrainingSession$PbTrainingSession$Builder(var1, (TrainingSession$1)null);
   }

   public TrainingSession$PbTrainingSession$Builder toBuilder() {
      TrainingSession$PbTrainingSession$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new TrainingSession$PbTrainingSession$Builder((TrainingSession$1)null);
      } else {
         var1 = (new TrainingSession$PbTrainingSession$Builder((TrainingSession$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getStart());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(2, this.exerciseCount_);
      }

      if ((this.bitField0_ & 8) == 8) {
         GeneratedMessageV3.writeString(var1, 3, this.deviceId_);
      }

      if ((this.bitField0_ & 16) == 16) {
         GeneratedMessageV3.writeString(var1, 4, this.modelName_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(5, this.getDuration());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeFloat(6, this.distance_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeUInt32(7, this.calories_);
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeMessage(8, this.getHeartRate());
      }

      for(int var2 = 0; var2 < this.heartRateZoneDuration_.size(); ++var2) {
         var1.writeMessage(9, (MessageLite)this.heartRateZoneDuration_.get(var2));
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeMessage(10, this.getTrainingLoad());
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeMessage(11, this.getSessionName());
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeFloat(12, this.feeling_);
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeMessage(13, this.getNote());
      }

      if ((this.bitField0_ & 8192) == 8192) {
         var1.writeMessage(14, this.getPlace());
      }

      if ((this.bitField0_ & 16384) == 16384) {
         var1.writeDouble(15, this.latitude_);
      }

      if ((this.bitField0_ & '耀') == 32768) {
         var1.writeDouble(16, this.longitude_);
      }

      if ((this.bitField0_ & 65536) == 65536) {
         var1.writeEnum(17, this.benefit_);
      }

      if ((this.bitField0_ & 131072) == 131072) {
         var1.writeMessage(18, this.getSport());
      }

      if ((this.bitField0_ & 262144) == 262144) {
         var1.writeMessage(19, this.getTrainingSessionTargetId());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(20, this.getEnd());
      }

      if ((this.bitField0_ & 524288) == 524288) {
         var1.writeMessage(21, this.getTrainingSessionFavoriteId());
      }

      this.unknownFields.writeTo(var1);
   }
}
