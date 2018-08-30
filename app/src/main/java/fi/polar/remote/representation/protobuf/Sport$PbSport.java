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

public final class Sport$PbSport extends GeneratedMessageV3 implements Sport$PbSportOrBuilder {
   public static final int ACCELERATION_METRICS_FIELD_NUMBER = 9;
   public static final int CREATED_FIELD_NUMBER = 100;
   private static final Sport$PbSport DEFAULT_INSTANCE = new Sport$PbSport();
   public static final int FACTOR_FIELD_NUMBER = 4;
   public static final int IDENTIFIER_FIELD_NUMBER = 1;
   public static final int LAST_MODIFIED_FIELD_NUMBER = 101;
   public static final int PARENT_IDENTIFIER_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Sport$PbSport$1();
   public static final int RUNNING_METRIC_MEASUREMENTS_SUPPORTED_FIELD_NUMBER = 8;
   public static final int SPEED_ZONES_ENABLED_FIELD_NUMBER = 7;
   public static final int SPORT_TYPE_FIELD_NUMBER = 6;
   public static final int STAGES_FIELD_NUMBER = 5;
   public static final int TRANSLATION_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private List accelerationMetrics_;
   private int bitField0_;
   private Types$PbSystemDateTime created_;
   private float factor_;
   private Structures$PbSportIdentifier identifier_;
   private Types$PbSystemDateTime lastModified_;
   private byte memoizedIsInitialized;
   private Structures$PbSportIdentifier parentIdentifier_;
   private boolean runningMetricMeasurementsSupported_;
   private boolean speedZonesEnabled_;
   private int sportType_;
   private List stages_;
   private List translation_;

   private Sport$PbSport() {
      this.memoizedIsInitialized = (byte)-1;
      this.translation_ = Collections.emptyList();
      this.factor_ = 0.0F;
      this.stages_ = Collections.emptyList();
      this.sportType_ = 1;
      this.speedZonesEnabled_ = false;
      this.runningMetricMeasurementsSupported_ = true;
      this.accelerationMetrics_ = Collections.emptyList();
   }

   private Sport$PbSport(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Sport$PbSport(CodedInputStream var1, ExtensionRegistryLite var2, Sport$1 var3) {
      this(var1, var2);
   }

   private Sport$PbSport(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Sport$PbSport(Builder var1, Sport$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(Sport$PbSport var0, float var1) {
      var0.factor_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Sport$PbSport var0, int var1) {
      var0.sportType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbSportIdentifier a(Sport$PbSport var0, Structures$PbSportIdentifier var1) {
      var0.identifier_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(Sport$PbSport var0, Types$PbSystemDateTime var1) {
      var0.created_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(Sport$PbSport var0) {
      return var0.translation_;
   }

   // $FF: synthetic method
   static List a(Sport$PbSport var0, List var1) {
      var0.translation_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(Sport$PbSport var0, boolean var1) {
      var0.speedZonesEnabled_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Sport$PbSport var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbSportIdentifier b(Sport$PbSport var0, Structures$PbSportIdentifier var1) {
      var0.parentIdentifier_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime b(Sport$PbSport var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List b(Sport$PbSport var0) {
      return var0.stages_;
   }

   // $FF: synthetic method
   static List b(Sport$PbSport var0, List var1) {
      var0.stages_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(Sport$PbSport var0, boolean var1) {
      var0.runningMetricMeasurementsSupported_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List c(Sport$PbSport var0) {
      return var0.accelerationMetrics_;
   }

   // $FF: synthetic method
   static List c(Sport$PbSport var0, List var1) {
      var0.accelerationMetrics_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static UnknownFieldSet d(Sport$PbSport var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean d() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean e() {
      return alwaysUseFieldBuilders;
   }

   public static Sport$PbSport getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Sport.c();
   }

   public static Sport$PbSport$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Sport$PbSport$Builder newBuilder(Sport$PbSport var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Sport$PbSport parseDelimitedFrom(InputStream var0) {
      return (Sport$PbSport)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Sport$PbSport parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Sport$PbSport)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Sport$PbSport parseFrom(ByteString var0) {
      return (Sport$PbSport)PARSER.parseFrom(var0);
   }

   public static Sport$PbSport parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Sport$PbSport)PARSER.parseFrom(var0, var1);
   }

   public static Sport$PbSport parseFrom(CodedInputStream var0) {
      return (Sport$PbSport)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Sport$PbSport parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Sport$PbSport)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Sport$PbSport parseFrom(InputStream var0) {
      return (Sport$PbSport)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Sport$PbSport parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Sport$PbSport)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Sport$PbSport parseFrom(byte[] var0) {
      return (Sport$PbSport)PARSER.parseFrom(var0);
   }

   public static Sport$PbSport parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Sport$PbSport)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Sport$PbSport)) {
            var2 = super.equals(var1);
         } else {
            Sport$PbSport var5 = (Sport$PbSport)var1;
            boolean var3;
            if (this.hasIdentifier() == var5.hasIdentifier()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasIdentifier()) {
               if (var3 && this.getIdentifier().equals(var5.getIdentifier())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasParentIdentifier() == var5.hasParentIdentifier()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasParentIdentifier()) {
               if (var3 && this.getParentIdentifier().equals(var5.getParentIdentifier())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getTranslationList().equals(var5.getTranslationList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasFactor() == var5.hasFactor()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasFactor()) {
               if (var3 && Float.floatToIntBits(this.getFactor()) == Float.floatToIntBits(var5.getFactor())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getStagesList().equals(var5.getStagesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasSportType() == var5.hasSportType()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSportType()) {
               if (var4 && this.sportType_ == var5.sportType_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSpeedZonesEnabled() == var5.hasSpeedZonesEnabled()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSpeedZonesEnabled()) {
               if (var4 && this.getSpeedZonesEnabled() == var5.getSpeedZonesEnabled()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasRunningMetricMeasurementsSupported() == var5.hasRunningMetricMeasurementsSupported()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasRunningMetricMeasurementsSupported()) {
               if (var3 && this.getRunningMetricMeasurementsSupported() == var5.getRunningMetricMeasurementsSupported()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getAccelerationMetricsList().equals(var5.getAccelerationMetricsList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasCreated() == var5.hasCreated()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasCreated()) {
               if (var4 && this.getCreated().equals(var5.getCreated())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasLastModified() == var5.hasLastModified()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLastModified()) {
               if (var3 && this.getLastModified().equals(var5.getLastModified())) {
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

   public Types$PbAccelerationMetrics getAccelerationMetrics(int var1) {
      return (Types$PbAccelerationMetrics)this.accelerationMetrics_.get(var1);
   }

   public int getAccelerationMetricsCount() {
      return this.accelerationMetrics_.size();
   }

   public List getAccelerationMetricsList() {
      return this.accelerationMetrics_;
   }

   public Types$PbAccelerationMetricsOrBuilder getAccelerationMetricsOrBuilder(int var1) {
      return (Types$PbAccelerationMetricsOrBuilder)this.accelerationMetrics_.get(var1);
   }

   public List getAccelerationMetricsOrBuilderList() {
      return this.accelerationMetrics_;
   }

   public Types$PbSystemDateTime getCreated() {
      Types$PbSystemDateTime var1;
      if (this.created_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.created_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getCreatedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.created_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.created_;
      }

      return var1;
   }

   public Sport$PbSport getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getFactor() {
      return this.factor_;
   }

   public Structures$PbSportIdentifier getIdentifier() {
      Structures$PbSportIdentifier var1;
      if (this.identifier_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.identifier_;
      }

      return var1;
   }

   public Structures$PbSportIdentifierOrBuilder getIdentifierOrBuilder() {
      Structures$PbSportIdentifier var1;
      if (this.identifier_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.identifier_;
      }

      return var1;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Structures$PbSportIdentifier getParentIdentifier() {
      Structures$PbSportIdentifier var1;
      if (this.parentIdentifier_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.parentIdentifier_;
      }

      return var1;
   }

   public Structures$PbSportIdentifierOrBuilder getParentIdentifierOrBuilder() {
      Structures$PbSportIdentifier var1;
      if (this.parentIdentifier_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.parentIdentifier_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public boolean getRunningMetricMeasurementsSupported() {
      return this.runningMetricMeasurementsSupported_;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         int var3;
         if ((this.bitField0_ & 1) == 1) {
            var3 = CodedOutputStream.computeMessageSize(1, this.getIdentifier()) + 0;
         } else {
            var3 = 0;
         }

         var2 = var3;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var3 + CodedOutputStream.computeMessageSize(2, this.getParentIdentifier());
         }

         for(var3 = 0; var3 < this.translation_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(3, (MessageLite)this.translation_.get(var3));
         }

         var3 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var3 = var2 + CodedOutputStream.computeFloatSize(4, this.factor_);
         }

         byte var4 = 0;
         var2 = var3;

         for(var3 = var4; var3 < this.stages_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(5, (MessageLite)this.stages_.get(var3));
         }

         int var5 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var5 = var2 + CodedOutputStream.computeEnumSize(6, this.sportType_);
         }

         var3 = var5;
         if ((this.bitField0_ & 16) == 16) {
            var3 = var5 + CodedOutputStream.computeBoolSize(7, this.speedZonesEnabled_);
         }

         var5 = var1;
         var2 = var3;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var3 + CodedOutputStream.computeBoolSize(8, this.runningMetricMeasurementsSupported_);
            var5 = var1;
         }

         while(var5 < this.accelerationMetrics_.size()) {
            var2 += CodedOutputStream.computeMessageSize(9, (MessageLite)this.accelerationMetrics_.get(var5));
            ++var5;
         }

         var3 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var3 = var2 + CodedOutputStream.computeMessageSize(100, this.getCreated());
         }

         var2 = var3;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var3 + CodedOutputStream.computeMessageSize(101, this.getLastModified());
         }

         var2 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var2;
      }

      return var2;
   }

   public boolean getSpeedZonesEnabled() {
      return this.speedZonesEnabled_;
   }

   public Sport$PbSport$PbSportType getSportType() {
      Sport$PbSport$PbSportType var1 = Sport$PbSport$PbSportType.valueOf(this.sportType_);
      Sport$PbSport$PbSportType var2 = var1;
      if (var1 == null) {
         var2 = Sport$PbSport$PbSportType.SPORT_TYPE_SINGLE_SPORT;
      }

      return var2;
   }

   public Structures$PbSportIdentifier getStages(int var1) {
      return (Structures$PbSportIdentifier)this.stages_.get(var1);
   }

   public int getStagesCount() {
      return this.stages_.size();
   }

   public List getStagesList() {
      return this.stages_;
   }

   public Structures$PbSportIdentifierOrBuilder getStagesOrBuilder(int var1) {
      return (Structures$PbSportIdentifierOrBuilder)this.stages_.get(var1);
   }

   public List getStagesOrBuilderList() {
      return this.stages_;
   }

   public Sport$PbSportTranslation getTranslation(int var1) {
      return (Sport$PbSportTranslation)this.translation_.get(var1);
   }

   public int getTranslationCount() {
      return this.translation_.size();
   }

   public List getTranslationList() {
      return this.translation_;
   }

   public Sport$PbSportTranslationOrBuilder getTranslationOrBuilder(int var1) {
      return (Sport$PbSportTranslationOrBuilder)this.translation_.get(var1);
   }

   public List getTranslationOrBuilderList() {
      return this.translation_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCreated() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFactor() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIdentifier() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasParentIdentifier() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRunningMetricMeasurementsSupported() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedZonesEnabled() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSportType() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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
         if (this.hasIdentifier()) {
            var1 = (var2 * 37 + 1) * 53 + this.getIdentifier().hashCode();
         }

         var2 = var1;
         if (this.hasParentIdentifier()) {
            var2 = (var1 * 37 + 2) * 53 + this.getParentIdentifier().hashCode();
         }

         var1 = var2;
         if (this.getTranslationCount() > 0) {
            var1 = (var2 * 37 + 3) * 53 + this.getTranslationList().hashCode();
         }

         var2 = var1;
         if (this.hasFactor()) {
            var2 = (var1 * 37 + 4) * 53 + Float.floatToIntBits(this.getFactor());
         }

         var1 = var2;
         if (this.getStagesCount() > 0) {
            var1 = (var2 * 37 + 5) * 53 + this.getStagesList().hashCode();
         }

         int var3 = var1;
         if (this.hasSportType()) {
            var3 = (var1 * 37 + 6) * 53 + this.sportType_;
         }

         var2 = var3;
         if (this.hasSpeedZonesEnabled()) {
            var2 = (var3 * 37 + 7) * 53 + Internal.hashBoolean(this.getSpeedZonesEnabled());
         }

         var1 = var2;
         if (this.hasRunningMetricMeasurementsSupported()) {
            var1 = (var2 * 37 + 8) * 53 + Internal.hashBoolean(this.getRunningMetricMeasurementsSupported());
         }

         var2 = var1;
         if (this.getAccelerationMetricsCount() > 0) {
            var2 = (var1 * 37 + 9) * 53 + this.getAccelerationMetricsList().hashCode();
         }

         var1 = var2;
         if (this.hasCreated()) {
            var1 = (var2 * 37 + 100) * 53 + this.getCreated().hashCode();
         }

         var2 = var1;
         if (this.hasLastModified()) {
            var2 = (var1 * 37 + 101) * 53 + this.getLastModified().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Sport.d().ensureFieldAccessorsInitialized(Sport$PbSport.class, Sport$PbSport$Builder.class);
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
            if (!this.hasIdentifier()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasParentIdentifier()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getIdentifier().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getParentIdentifier().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getTranslationCount()) {
                     for(var4 = 0; var4 < this.getStagesCount(); ++var4) {
                        if (!this.getStages(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getAccelerationMetricsCount(); ++var4) {
                        if (!this.getAccelerationMetrics(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     if (this.hasCreated() && !this.getCreated().isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                     } else if (this.hasLastModified() && !this.getLastModified().isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                     } else {
                        this.memoizedIsInitialized = (byte)1;
                        var3 = true;
                     }
                     break;
                  }

                  if (!this.getTranslation(var4).isInitialized()) {
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

   public Sport$PbSport$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Sport$PbSport$Builder newBuilderForType(BuilderParent var1) {
      return new Sport$PbSport$Builder(var1, (Sport$1)null);
   }

   public Sport$PbSport$Builder toBuilder() {
      Sport$PbSport$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Sport$PbSport$Builder((Sport$1)null);
      } else {
         var1 = (new Sport$PbSport$Builder((Sport$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getIdentifier());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getParentIdentifier());
      }

      int var3;
      for(var3 = 0; var3 < this.translation_.size(); ++var3) {
         var1.writeMessage(3, (MessageLite)this.translation_.get(var3));
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(4, this.factor_);
      }

      for(var3 = 0; var3 < this.stages_.size(); ++var3) {
         var1.writeMessage(5, (MessageLite)this.stages_.get(var3));
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeEnum(6, this.sportType_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeBool(7, this.speedZonesEnabled_);
      }

      var3 = var2;
      if ((this.bitField0_ & 32) == 32) {
         var1.writeBool(8, this.runningMetricMeasurementsSupported_);
         var3 = var2;
      }

      while(var3 < this.accelerationMetrics_.size()) {
         var1.writeMessage(9, (MessageLite)this.accelerationMetrics_.get(var3));
         ++var3;
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(100, this.getCreated());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(101, this.getLastModified());
      }

      this.unknownFields.writeTo(var1);
   }
}
