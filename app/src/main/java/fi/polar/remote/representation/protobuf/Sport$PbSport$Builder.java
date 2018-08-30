package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Sport$PbSport$Builder extends Builder implements Sport$PbSportOrBuilder {
   private RepeatedFieldBuilderV3 accelerationMetricsBuilder_;
   private List accelerationMetrics_;
   private int bitField0_;
   private SingleFieldBuilderV3 createdBuilder_;
   private Types$PbSystemDateTime created_;
   private float factor_;
   private SingleFieldBuilderV3 identifierBuilder_;
   private Structures$PbSportIdentifier identifier_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private SingleFieldBuilderV3 parentIdentifierBuilder_;
   private Structures$PbSportIdentifier parentIdentifier_;
   private boolean runningMetricMeasurementsSupported_;
   private boolean speedZonesEnabled_;
   private int sportType_;
   private RepeatedFieldBuilderV3 stagesBuilder_;
   private List stages_;
   private RepeatedFieldBuilderV3 translationBuilder_;
   private List translation_;

   private Sport$PbSport$Builder() {
      this.identifier_ = null;
      this.parentIdentifier_ = null;
      this.translation_ = Collections.emptyList();
      this.stages_ = Collections.emptyList();
      this.sportType_ = 1;
      this.runningMetricMeasurementsSupported_ = true;
      this.accelerationMetrics_ = Collections.emptyList();
      this.created_ = null;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Sport$PbSport$Builder(BuilderParent var1) {
      super(var1);
      this.identifier_ = null;
      this.parentIdentifier_ = null;
      this.translation_ = Collections.emptyList();
      this.stages_ = Collections.emptyList();
      this.sportType_ = 1;
      this.runningMetricMeasurementsSupported_ = true;
      this.accelerationMetrics_ = Collections.emptyList();
      this.created_ = null;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Sport$PbSport$Builder(BuilderParent var1, Sport$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Sport$PbSport$Builder(Sport$1 var1) {
      this();
   }

   private void ensureAccelerationMetricsIsMutable() {
      if ((this.bitField0_ & 256) != 256) {
         this.accelerationMetrics_ = new ArrayList(this.accelerationMetrics_);
         this.bitField0_ |= 256;
      }

   }

   private void ensureStagesIsMutable() {
      if ((this.bitField0_ & 16) != 16) {
         this.stages_ = new ArrayList(this.stages_);
         this.bitField0_ |= 16;
      }

   }

   private void ensureTranslationIsMutable() {
      if ((this.bitField0_ & 4) != 4) {
         this.translation_ = new ArrayList(this.translation_);
         this.bitField0_ |= 4;
      }

   }

   private RepeatedFieldBuilderV3 getAccelerationMetricsFieldBuilder() {
      if (this.accelerationMetricsBuilder_ == null) {
         List var1 = this.accelerationMetrics_;
         boolean var2;
         if ((this.bitField0_ & 256) == 256) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.accelerationMetricsBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.accelerationMetrics_ = null;
      }

      return this.accelerationMetricsBuilder_;
   }

   private SingleFieldBuilderV3 getCreatedFieldBuilder() {
      if (this.createdBuilder_ == null) {
         this.createdBuilder_ = new SingleFieldBuilderV3(this.getCreated(), this.getParentForChildren(), this.isClean());
         this.created_ = null;
      }

      return this.createdBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return Sport.c();
   }

   private SingleFieldBuilderV3 getIdentifierFieldBuilder() {
      if (this.identifierBuilder_ == null) {
         this.identifierBuilder_ = new SingleFieldBuilderV3(this.getIdentifier(), this.getParentForChildren(), this.isClean());
         this.identifier_ = null;
      }

      return this.identifierBuilder_;
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private SingleFieldBuilderV3 getParentIdentifierFieldBuilder() {
      if (this.parentIdentifierBuilder_ == null) {
         this.parentIdentifierBuilder_ = new SingleFieldBuilderV3(this.getParentIdentifier(), this.getParentForChildren(), this.isClean());
         this.parentIdentifier_ = null;
      }

      return this.parentIdentifierBuilder_;
   }

   private RepeatedFieldBuilderV3 getStagesFieldBuilder() {
      if (this.stagesBuilder_ == null) {
         List var1 = this.stages_;
         boolean var2;
         if ((this.bitField0_ & 16) == 16) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.stagesBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.stages_ = null;
      }

      return this.stagesBuilder_;
   }

   private RepeatedFieldBuilderV3 getTranslationFieldBuilder() {
      if (this.translationBuilder_ == null) {
         List var1 = this.translation_;
         boolean var2;
         if ((this.bitField0_ & 4) == 4) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.translationBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.translation_ = null;
      }

      return this.translationBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Sport$PbSport.b()) {
         this.getIdentifierFieldBuilder();
         this.getParentIdentifierFieldBuilder();
         this.getTranslationFieldBuilder();
         this.getStagesFieldBuilder();
         this.getAccelerationMetricsFieldBuilder();
         this.getCreatedFieldBuilder();
         this.getLastModifiedFieldBuilder();
      }

   }

   public Sport$PbSport$Builder addAccelerationMetrics(int var1, Types$PbAccelerationMetrics$Builder var2) {
      if (this.accelerationMetricsBuilder_ == null) {
         this.ensureAccelerationMetricsIsMutable();
         this.accelerationMetrics_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.accelerationMetricsBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Sport$PbSport$Builder addAccelerationMetrics(int var1, Types$PbAccelerationMetrics var2) {
      if (this.accelerationMetricsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAccelerationMetricsIsMutable();
         this.accelerationMetrics_.add(var1, var2);
         this.onChanged();
      } else {
         this.accelerationMetricsBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public Sport$PbSport$Builder addAccelerationMetrics(Types$PbAccelerationMetrics$Builder var1) {
      if (this.accelerationMetricsBuilder_ == null) {
         this.ensureAccelerationMetricsIsMutable();
         this.accelerationMetrics_.add(var1.build());
         this.onChanged();
      } else {
         this.accelerationMetricsBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Sport$PbSport$Builder addAccelerationMetrics(Types$PbAccelerationMetrics var1) {
      if (this.accelerationMetricsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAccelerationMetricsIsMutable();
         this.accelerationMetrics_.add(var1);
         this.onChanged();
      } else {
         this.accelerationMetricsBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder addAccelerationMetricsBuilder() {
      return (Types$PbAccelerationMetrics$Builder)this.getAccelerationMetricsFieldBuilder().addBuilder(Types$PbAccelerationMetrics.getDefaultInstance());
   }

   public Types$PbAccelerationMetrics$Builder addAccelerationMetricsBuilder(int var1) {
      return (Types$PbAccelerationMetrics$Builder)this.getAccelerationMetricsFieldBuilder().addBuilder(var1, Types$PbAccelerationMetrics.getDefaultInstance());
   }

   public Sport$PbSport$Builder addAllAccelerationMetrics(Iterable var1) {
      if (this.accelerationMetricsBuilder_ == null) {
         this.ensureAccelerationMetricsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.accelerationMetrics_);
         this.onChanged();
      } else {
         this.accelerationMetricsBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Sport$PbSport$Builder addAllStages(Iterable var1) {
      if (this.stagesBuilder_ == null) {
         this.ensureStagesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.stages_);
         this.onChanged();
      } else {
         this.stagesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Sport$PbSport$Builder addAllTranslation(Iterable var1) {
      if (this.translationBuilder_ == null) {
         this.ensureTranslationIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.translation_);
         this.onChanged();
      } else {
         this.translationBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Sport$PbSport$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Sport$PbSport$Builder)super.addRepeatedField(var1, var2);
   }

   public Sport$PbSport$Builder addStages(int var1, Structures$PbSportIdentifier$Builder var2) {
      if (this.stagesBuilder_ == null) {
         this.ensureStagesIsMutable();
         this.stages_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.stagesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Sport$PbSport$Builder addStages(int var1, Structures$PbSportIdentifier var2) {
      if (this.stagesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStagesIsMutable();
         this.stages_.add(var1, var2);
         this.onChanged();
      } else {
         this.stagesBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public Sport$PbSport$Builder addStages(Structures$PbSportIdentifier$Builder var1) {
      if (this.stagesBuilder_ == null) {
         this.ensureStagesIsMutable();
         this.stages_.add(var1.build());
         this.onChanged();
      } else {
         this.stagesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Sport$PbSport$Builder addStages(Structures$PbSportIdentifier var1) {
      if (this.stagesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureStagesIsMutable();
         this.stages_.add(var1);
         this.onChanged();
      } else {
         this.stagesBuilder_.addMessage(var1);
      }

      return this;
   }

   public Structures$PbSportIdentifier$Builder addStagesBuilder() {
      return (Structures$PbSportIdentifier$Builder)this.getStagesFieldBuilder().addBuilder(Structures$PbSportIdentifier.getDefaultInstance());
   }

   public Structures$PbSportIdentifier$Builder addStagesBuilder(int var1) {
      return (Structures$PbSportIdentifier$Builder)this.getStagesFieldBuilder().addBuilder(var1, Structures$PbSportIdentifier.getDefaultInstance());
   }

   public Sport$PbSport$Builder addTranslation(int var1, Sport$PbSportTranslation$Builder var2) {
      if (this.translationBuilder_ == null) {
         this.ensureTranslationIsMutable();
         this.translation_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.translationBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Sport$PbSport$Builder addTranslation(int var1, Sport$PbSportTranslation var2) {
      if (this.translationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureTranslationIsMutable();
         this.translation_.add(var1, var2);
         this.onChanged();
      } else {
         this.translationBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public Sport$PbSport$Builder addTranslation(Sport$PbSportTranslation$Builder var1) {
      if (this.translationBuilder_ == null) {
         this.ensureTranslationIsMutable();
         this.translation_.add(var1.build());
         this.onChanged();
      } else {
         this.translationBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Sport$PbSport$Builder addTranslation(Sport$PbSportTranslation var1) {
      if (this.translationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureTranslationIsMutable();
         this.translation_.add(var1);
         this.onChanged();
      } else {
         this.translationBuilder_.addMessage(var1);
      }

      return this;
   }

   public Sport$PbSportTranslation$Builder addTranslationBuilder() {
      return (Sport$PbSportTranslation$Builder)this.getTranslationFieldBuilder().addBuilder(Sport$PbSportTranslation.getDefaultInstance());
   }

   public Sport$PbSportTranslation$Builder addTranslationBuilder(int var1) {
      return (Sport$PbSportTranslation$Builder)this.getTranslationFieldBuilder().addBuilder(var1, Sport$PbSportTranslation.getDefaultInstance());
   }

   public Sport$PbSport build() {
      Sport$PbSport var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Sport$PbSport buildPartial() {
      Sport$PbSport var1 = new Sport$PbSport(this, (Sport$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.identifierBuilder_ == null) {
         Sport$PbSport.a(var1, this.identifier_);
      } else {
         Sport$PbSport.a(var1, (Structures$PbSportIdentifier)this.identifierBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.parentIdentifierBuilder_ == null) {
         Sport$PbSport.b(var1, this.parentIdentifier_);
      } else {
         Sport$PbSport.b(var1, (Structures$PbSportIdentifier)this.parentIdentifierBuilder_.build());
      }

      if (this.translationBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4) {
            this.translation_ = Collections.unmodifiableList(this.translation_);
            this.bitField0_ &= -5;
         }

         Sport$PbSport.a(var1, this.translation_);
      } else {
         Sport$PbSport.a(var1, this.translationBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 8) == 8) {
         var5 = var4 | 4;
      }

      Sport$PbSport.a(var1, this.factor_);
      if (this.stagesBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16) {
            this.stages_ = Collections.unmodifiableList(this.stages_);
            this.bitField0_ &= -17;
         }

         Sport$PbSport.b(var1, this.stages_);
      } else {
         Sport$PbSport.b(var1, this.stagesBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 32) == 32) {
         var4 = var5 | 8;
      }

      Sport$PbSport.a(var1, this.sportType_);
      var5 = var4;
      if ((var2 & 64) == 64) {
         var5 = var4 | 16;
      }

      Sport$PbSport.a(var1, this.speedZonesEnabled_);
      var4 = var5;
      if ((var2 & 128) == 128) {
         var4 = var5 | 32;
      }

      Sport$PbSport.b(var1, this.runningMetricMeasurementsSupported_);
      if (this.accelerationMetricsBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256) {
            this.accelerationMetrics_ = Collections.unmodifiableList(this.accelerationMetrics_);
            this.bitField0_ &= -257;
         }

         Sport$PbSport.c(var1, this.accelerationMetrics_);
      } else {
         Sport$PbSport.c(var1, this.accelerationMetricsBuilder_.build());
      }

      var5 = var4;
      if ((var2 & 512) == 512) {
         var5 = var4 | 64;
      }

      if (this.createdBuilder_ == null) {
         Sport$PbSport.a(var1, this.created_);
      } else {
         Sport$PbSport.a(var1, (Types$PbSystemDateTime)this.createdBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 1024) == 1024) {
         var4 = var5 | 128;
      }

      if (this.lastModifiedBuilder_ == null) {
         Sport$PbSport.b(var1, this.lastModified_);
      } else {
         Sport$PbSport.b(var1, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      Sport$PbSport.b(var1, var4);
      this.onBuilt();
      return var1;
   }

   public Sport$PbSport$Builder clear() {
      super.clear();
      if (this.identifierBuilder_ == null) {
         this.identifier_ = null;
      } else {
         this.identifierBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.parentIdentifierBuilder_ == null) {
         this.parentIdentifier_ = null;
      } else {
         this.parentIdentifierBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.translationBuilder_ == null) {
         this.translation_ = Collections.emptyList();
         this.bitField0_ &= -5;
      } else {
         this.translationBuilder_.clear();
      }

      this.factor_ = 0.0F;
      this.bitField0_ &= -9;
      if (this.stagesBuilder_ == null) {
         this.stages_ = Collections.emptyList();
         this.bitField0_ &= -17;
      } else {
         this.stagesBuilder_.clear();
      }

      this.sportType_ = 1;
      this.bitField0_ &= -33;
      this.speedZonesEnabled_ = false;
      this.bitField0_ &= -65;
      this.runningMetricMeasurementsSupported_ = true;
      this.bitField0_ &= -129;
      if (this.accelerationMetricsBuilder_ == null) {
         this.accelerationMetrics_ = Collections.emptyList();
         this.bitField0_ &= -257;
      } else {
         this.accelerationMetricsBuilder_.clear();
      }

      if (this.createdBuilder_ == null) {
         this.created_ = null;
      } else {
         this.createdBuilder_.clear();
      }

      this.bitField0_ &= -513;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      return this;
   }

   public Sport$PbSport$Builder clearAccelerationMetrics() {
      if (this.accelerationMetricsBuilder_ == null) {
         this.accelerationMetrics_ = Collections.emptyList();
         this.bitField0_ &= -257;
         this.onChanged();
      } else {
         this.accelerationMetricsBuilder_.clear();
      }

      return this;
   }

   public Sport$PbSport$Builder clearCreated() {
      if (this.createdBuilder_ == null) {
         this.created_ = null;
         this.onChanged();
      } else {
         this.createdBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public Sport$PbSport$Builder clearFactor() {
      this.bitField0_ &= -9;
      this.factor_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Sport$PbSport$Builder clearField(FieldDescriptor var1) {
      return (Sport$PbSport$Builder)super.clearField(var1);
   }

   public Sport$PbSport$Builder clearIdentifier() {
      if (this.identifierBuilder_ == null) {
         this.identifier_ = null;
         this.onChanged();
      } else {
         this.identifierBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Sport$PbSport$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      return this;
   }

   public Sport$PbSport$Builder clearOneof(OneofDescriptor var1) {
      return (Sport$PbSport$Builder)super.clearOneof(var1);
   }

   public Sport$PbSport$Builder clearParentIdentifier() {
      if (this.parentIdentifierBuilder_ == null) {
         this.parentIdentifier_ = null;
         this.onChanged();
      } else {
         this.parentIdentifierBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Sport$PbSport$Builder clearRunningMetricMeasurementsSupported() {
      this.bitField0_ &= -129;
      this.runningMetricMeasurementsSupported_ = true;
      this.onChanged();
      return this;
   }

   public Sport$PbSport$Builder clearSpeedZonesEnabled() {
      this.bitField0_ &= -65;
      this.speedZonesEnabled_ = false;
      this.onChanged();
      return this;
   }

   public Sport$PbSport$Builder clearSportType() {
      this.bitField0_ &= -33;
      this.sportType_ = 1;
      this.onChanged();
      return this;
   }

   public Sport$PbSport$Builder clearStages() {
      if (this.stagesBuilder_ == null) {
         this.stages_ = Collections.emptyList();
         this.bitField0_ &= -17;
         this.onChanged();
      } else {
         this.stagesBuilder_.clear();
      }

      return this;
   }

   public Sport$PbSport$Builder clearTranslation() {
      if (this.translationBuilder_ == null) {
         this.translation_ = Collections.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
      } else {
         this.translationBuilder_.clear();
      }

      return this;
   }

   public Sport$PbSport$Builder clone() {
      return (Sport$PbSport$Builder)super.clone();
   }

   public Types$PbAccelerationMetrics getAccelerationMetrics(int var1) {
      Types$PbAccelerationMetrics var2;
      if (this.accelerationMetricsBuilder_ == null) {
         var2 = (Types$PbAccelerationMetrics)this.accelerationMetrics_.get(var1);
      } else {
         var2 = (Types$PbAccelerationMetrics)this.accelerationMetricsBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbAccelerationMetrics$Builder getAccelerationMetricsBuilder(int var1) {
      return (Types$PbAccelerationMetrics$Builder)this.getAccelerationMetricsFieldBuilder().getBuilder(var1);
   }

   public List getAccelerationMetricsBuilderList() {
      return this.getAccelerationMetricsFieldBuilder().getBuilderList();
   }

   public int getAccelerationMetricsCount() {
      int var1;
      if (this.accelerationMetricsBuilder_ == null) {
         var1 = this.accelerationMetrics_.size();
      } else {
         var1 = this.accelerationMetricsBuilder_.getCount();
      }

      return var1;
   }

   public List getAccelerationMetricsList() {
      List var1;
      if (this.accelerationMetricsBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.accelerationMetrics_);
      } else {
         var1 = this.accelerationMetricsBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbAccelerationMetricsOrBuilder getAccelerationMetricsOrBuilder(int var1) {
      Types$PbAccelerationMetricsOrBuilder var2;
      if (this.accelerationMetricsBuilder_ == null) {
         var2 = (Types$PbAccelerationMetricsOrBuilder)this.accelerationMetrics_.get(var1);
      } else {
         var2 = (Types$PbAccelerationMetricsOrBuilder)this.accelerationMetricsBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getAccelerationMetricsOrBuilderList() {
      List var1;
      if (this.accelerationMetricsBuilder_ != null) {
         var1 = this.accelerationMetricsBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.accelerationMetrics_);
      }

      return var1;
   }

   public Types$PbSystemDateTime getCreated() {
      Types$PbSystemDateTime var1;
      if (this.createdBuilder_ == null) {
         if (this.created_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.created_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.createdBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getCreatedBuilder() {
      this.bitField0_ |= 512;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getCreatedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getCreatedOrBuilder() {
      Object var1;
      if (this.createdBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.createdBuilder_.getMessageOrBuilder();
      } else if (this.created_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.created_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public Sport$PbSport getDefaultInstanceForType() {
      return Sport$PbSport.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Sport.c();
   }

   public float getFactor() {
      return this.factor_;
   }

   public Structures$PbSportIdentifier getIdentifier() {
      Structures$PbSportIdentifier var1;
      if (this.identifierBuilder_ == null) {
         if (this.identifier_ == null) {
            var1 = Structures$PbSportIdentifier.getDefaultInstance();
         } else {
            var1 = this.identifier_;
         }
      } else {
         var1 = (Structures$PbSportIdentifier)this.identifierBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbSportIdentifier$Builder getIdentifierBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Structures$PbSportIdentifier$Builder)this.getIdentifierFieldBuilder().getBuilder();
   }

   public Structures$PbSportIdentifierOrBuilder getIdentifierOrBuilder() {
      Object var1;
      if (this.identifierBuilder_ != null) {
         var1 = (Structures$PbSportIdentifierOrBuilder)this.identifierBuilder_.getMessageOrBuilder();
      } else if (this.identifier_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.identifier_;
      }

      return (Structures$PbSportIdentifierOrBuilder)var1;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModifiedBuilder_ == null) {
         if (this.lastModified_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.lastModified_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.lastModifiedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getLastModifiedBuilder() {
      this.bitField0_ |= 1024;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getLastModifiedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Object var1;
      if (this.lastModifiedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.lastModifiedBuilder_.getMessageOrBuilder();
      } else if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public Structures$PbSportIdentifier getParentIdentifier() {
      Structures$PbSportIdentifier var1;
      if (this.parentIdentifierBuilder_ == null) {
         if (this.parentIdentifier_ == null) {
            var1 = Structures$PbSportIdentifier.getDefaultInstance();
         } else {
            var1 = this.parentIdentifier_;
         }
      } else {
         var1 = (Structures$PbSportIdentifier)this.parentIdentifierBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbSportIdentifier$Builder getParentIdentifierBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Structures$PbSportIdentifier$Builder)this.getParentIdentifierFieldBuilder().getBuilder();
   }

   public Structures$PbSportIdentifierOrBuilder getParentIdentifierOrBuilder() {
      Object var1;
      if (this.parentIdentifierBuilder_ != null) {
         var1 = (Structures$PbSportIdentifierOrBuilder)this.parentIdentifierBuilder_.getMessageOrBuilder();
      } else if (this.parentIdentifier_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.parentIdentifier_;
      }

      return (Structures$PbSportIdentifierOrBuilder)var1;
   }

   public boolean getRunningMetricMeasurementsSupported() {
      return this.runningMetricMeasurementsSupported_;
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
      Structures$PbSportIdentifier var2;
      if (this.stagesBuilder_ == null) {
         var2 = (Structures$PbSportIdentifier)this.stages_.get(var1);
      } else {
         var2 = (Structures$PbSportIdentifier)this.stagesBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Structures$PbSportIdentifier$Builder getStagesBuilder(int var1) {
      return (Structures$PbSportIdentifier$Builder)this.getStagesFieldBuilder().getBuilder(var1);
   }

   public List getStagesBuilderList() {
      return this.getStagesFieldBuilder().getBuilderList();
   }

   public int getStagesCount() {
      int var1;
      if (this.stagesBuilder_ == null) {
         var1 = this.stages_.size();
      } else {
         var1 = this.stagesBuilder_.getCount();
      }

      return var1;
   }

   public List getStagesList() {
      List var1;
      if (this.stagesBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.stages_);
      } else {
         var1 = this.stagesBuilder_.getMessageList();
      }

      return var1;
   }

   public Structures$PbSportIdentifierOrBuilder getStagesOrBuilder(int var1) {
      Structures$PbSportIdentifierOrBuilder var2;
      if (this.stagesBuilder_ == null) {
         var2 = (Structures$PbSportIdentifierOrBuilder)this.stages_.get(var1);
      } else {
         var2 = (Structures$PbSportIdentifierOrBuilder)this.stagesBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getStagesOrBuilderList() {
      List var1;
      if (this.stagesBuilder_ != null) {
         var1 = this.stagesBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.stages_);
      }

      return var1;
   }

   public Sport$PbSportTranslation getTranslation(int var1) {
      Sport$PbSportTranslation var2;
      if (this.translationBuilder_ == null) {
         var2 = (Sport$PbSportTranslation)this.translation_.get(var1);
      } else {
         var2 = (Sport$PbSportTranslation)this.translationBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Sport$PbSportTranslation$Builder getTranslationBuilder(int var1) {
      return (Sport$PbSportTranslation$Builder)this.getTranslationFieldBuilder().getBuilder(var1);
   }

   public List getTranslationBuilderList() {
      return this.getTranslationFieldBuilder().getBuilderList();
   }

   public int getTranslationCount() {
      int var1;
      if (this.translationBuilder_ == null) {
         var1 = this.translation_.size();
      } else {
         var1 = this.translationBuilder_.getCount();
      }

      return var1;
   }

   public List getTranslationList() {
      List var1;
      if (this.translationBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.translation_);
      } else {
         var1 = this.translationBuilder_.getMessageList();
      }

      return var1;
   }

   public Sport$PbSportTranslationOrBuilder getTranslationOrBuilder(int var1) {
      Sport$PbSportTranslationOrBuilder var2;
      if (this.translationBuilder_ == null) {
         var2 = (Sport$PbSportTranslationOrBuilder)this.translation_.get(var1);
      } else {
         var2 = (Sport$PbSportTranslationOrBuilder)this.translationBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getTranslationOrBuilderList() {
      List var1;
      if (this.translationBuilder_ != null) {
         var1 = this.translationBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.translation_);
      }

      return var1;
   }

   public boolean hasCreated() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFactor() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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
      if ((this.bitField0_ & 1024) == 1024) {
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
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedZonesEnabled() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSportType() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Sport.d().ensureFieldAccessorsInitialized(Sport$PbSport.class, Sport$PbSport$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasIdentifier()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasParentIdentifier()) {
            var2 = var1;
            if (this.getIdentifier().isInitialized()) {
               var2 = var1;
               if (this.getParentIdentifier().isInitialized()) {
                  int var3 = 0;

                  while(true) {
                     if (var3 >= this.getTranslationCount()) {
                        for(var3 = 0; var3 < this.getStagesCount(); ++var3) {
                           var2 = var1;
                           if (!this.getStages(var3).isInitialized()) {
                              return var2;
                           }
                        }

                        for(var3 = 0; var3 < this.getAccelerationMetricsCount(); ++var3) {
                           var2 = var1;
                           if (!this.getAccelerationMetrics(var3).isInitialized()) {
                              return var2;
                           }
                        }

                        if (this.hasCreated()) {
                           var2 = var1;
                           if (!this.getCreated().isInitialized()) {
                              break;
                           }
                        }

                        if (this.hasLastModified()) {
                           var2 = var1;
                           if (!this.getLastModified().isInitialized()) {
                              break;
                           }
                        }

                        var2 = true;
                        break;
                     }

                     var2 = var1;
                     if (!this.getTranslation(var3).isInitialized()) {
                        break;
                     }

                     ++var3;
                  }
               }
            }
         }
      }

      return var2;
   }

   public Sport$PbSport$Builder mergeCreated(Types$PbSystemDateTime var1) {
      if (this.createdBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512 && this.created_ != null && this.created_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.created_ = Types$PbSystemDateTime.newBuilder(this.created_).mergeFrom(var1).buildPartial();
         } else {
            this.created_ = var1;
         }

         this.onChanged();
      } else {
         this.createdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public Sport$PbSport$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Sport$PbSport var13;
      label96: {
         InvalidProtocolBufferException var12;
         Sport$PbSport var14;
         try {
            var13 = (Sport$PbSport)Sport$PbSport.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Sport$PbSport)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public Sport$PbSport$Builder mergeFrom(Message var1) {
      Sport$PbSport$Builder var2;
      if (var1 instanceof Sport$PbSport) {
         var2 = this.mergeFrom((Sport$PbSport)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Sport$PbSport$Builder mergeFrom(Sport$PbSport var1) {
      Object var2 = null;
      if (var1 != Sport$PbSport.getDefaultInstance()) {
         if (var1.hasIdentifier()) {
            this.mergeIdentifier(var1.getIdentifier());
         }

         if (var1.hasParentIdentifier()) {
            this.mergeParentIdentifier(var1.getParentIdentifier());
         }

         RepeatedFieldBuilderV3 var3;
         if (this.translationBuilder_ == null) {
            if (!Sport$PbSport.a(var1).isEmpty()) {
               if (this.translation_.isEmpty()) {
                  this.translation_ = Sport$PbSport.a(var1);
                  this.bitField0_ &= -5;
               } else {
                  this.ensureTranslationIsMutable();
                  this.translation_.addAll(Sport$PbSport.a(var1));
               }

               this.onChanged();
            }
         } else if (!Sport$PbSport.a(var1).isEmpty()) {
            if (this.translationBuilder_.isEmpty()) {
               this.translationBuilder_.dispose();
               this.translationBuilder_ = null;
               this.translation_ = Sport$PbSport.a(var1);
               this.bitField0_ &= -5;
               if (Sport$PbSport.c()) {
                  var3 = this.getTranslationFieldBuilder();
               } else {
                  var3 = null;
               }

               this.translationBuilder_ = var3;
            } else {
               this.translationBuilder_.addAllMessages(Sport$PbSport.a(var1));
            }
         }

         if (var1.hasFactor()) {
            this.setFactor(var1.getFactor());
         }

         if (this.stagesBuilder_ == null) {
            if (!Sport$PbSport.b(var1).isEmpty()) {
               if (this.stages_.isEmpty()) {
                  this.stages_ = Sport$PbSport.b(var1);
                  this.bitField0_ &= -17;
               } else {
                  this.ensureStagesIsMutable();
                  this.stages_.addAll(Sport$PbSport.b(var1));
               }

               this.onChanged();
            }
         } else if (!Sport$PbSport.b(var1).isEmpty()) {
            if (this.stagesBuilder_.isEmpty()) {
               this.stagesBuilder_.dispose();
               this.stagesBuilder_ = null;
               this.stages_ = Sport$PbSport.b(var1);
               this.bitField0_ &= -17;
               if (Sport$PbSport.d()) {
                  var3 = this.getStagesFieldBuilder();
               } else {
                  var3 = null;
               }

               this.stagesBuilder_ = var3;
            } else {
               this.stagesBuilder_.addAllMessages(Sport$PbSport.b(var1));
            }
         }

         if (var1.hasSportType()) {
            this.setSportType(var1.getSportType());
         }

         if (var1.hasSpeedZonesEnabled()) {
            this.setSpeedZonesEnabled(var1.getSpeedZonesEnabled());
         }

         if (var1.hasRunningMetricMeasurementsSupported()) {
            this.setRunningMetricMeasurementsSupported(var1.getRunningMetricMeasurementsSupported());
         }

         if (this.accelerationMetricsBuilder_ == null) {
            if (!Sport$PbSport.c(var1).isEmpty()) {
               if (this.accelerationMetrics_.isEmpty()) {
                  this.accelerationMetrics_ = Sport$PbSport.c(var1);
                  this.bitField0_ &= -257;
               } else {
                  this.ensureAccelerationMetricsIsMutable();
                  this.accelerationMetrics_.addAll(Sport$PbSport.c(var1));
               }

               this.onChanged();
            }
         } else if (!Sport$PbSport.c(var1).isEmpty()) {
            if (this.accelerationMetricsBuilder_.isEmpty()) {
               this.accelerationMetricsBuilder_.dispose();
               this.accelerationMetricsBuilder_ = null;
               this.accelerationMetrics_ = Sport$PbSport.c(var1);
               this.bitField0_ &= -257;
               var3 = (RepeatedFieldBuilderV3)var2;
               if (Sport$PbSport.e()) {
                  var3 = this.getAccelerationMetricsFieldBuilder();
               }

               this.accelerationMetricsBuilder_ = var3;
            } else {
               this.accelerationMetricsBuilder_.addAllMessages(Sport$PbSport.c(var1));
            }
         }

         if (var1.hasCreated()) {
            this.mergeCreated(var1.getCreated());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         this.mergeUnknownFields(Sport$PbSport.d(var1));
         this.onChanged();
      }

      return this;
   }

   public Sport$PbSport$Builder mergeIdentifier(Structures$PbSportIdentifier var1) {
      if (this.identifierBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.identifier_ != null && this.identifier_ != Structures$PbSportIdentifier.getDefaultInstance()) {
            this.identifier_ = Structures$PbSportIdentifier.newBuilder(this.identifier_).mergeFrom(var1).buildPartial();
         } else {
            this.identifier_ = var1;
         }

         this.onChanged();
      } else {
         this.identifierBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Sport$PbSport$Builder mergeLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 1024) == 1024 && this.lastModified_ != null && this.lastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastModified_ = Types$PbSystemDateTime.newBuilder(this.lastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.lastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.lastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public Sport$PbSport$Builder mergeParentIdentifier(Structures$PbSportIdentifier var1) {
      if (this.parentIdentifierBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.parentIdentifier_ != null && this.parentIdentifier_ != Structures$PbSportIdentifier.getDefaultInstance()) {
            this.parentIdentifier_ = Structures$PbSportIdentifier.newBuilder(this.parentIdentifier_).mergeFrom(var1).buildPartial();
         } else {
            this.parentIdentifier_ = var1;
         }

         this.onChanged();
      } else {
         this.parentIdentifierBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Sport$PbSport$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Sport$PbSport$Builder)super.mergeUnknownFields(var1);
   }

   public Sport$PbSport$Builder removeAccelerationMetrics(int var1) {
      if (this.accelerationMetricsBuilder_ == null) {
         this.ensureAccelerationMetricsIsMutable();
         this.accelerationMetrics_.remove(var1);
         this.onChanged();
      } else {
         this.accelerationMetricsBuilder_.remove(var1);
      }

      return this;
   }

   public Sport$PbSport$Builder removeStages(int var1) {
      if (this.stagesBuilder_ == null) {
         this.ensureStagesIsMutable();
         this.stages_.remove(var1);
         this.onChanged();
      } else {
         this.stagesBuilder_.remove(var1);
      }

      return this;
   }

   public Sport$PbSport$Builder removeTranslation(int var1) {
      if (this.translationBuilder_ == null) {
         this.ensureTranslationIsMutable();
         this.translation_.remove(var1);
         this.onChanged();
      } else {
         this.translationBuilder_.remove(var1);
      }

      return this;
   }

   public Sport$PbSport$Builder setAccelerationMetrics(int var1, Types$PbAccelerationMetrics$Builder var2) {
      if (this.accelerationMetricsBuilder_ == null) {
         this.ensureAccelerationMetricsIsMutable();
         this.accelerationMetrics_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.accelerationMetricsBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Sport$PbSport$Builder setAccelerationMetrics(int var1, Types$PbAccelerationMetrics var2) {
      if (this.accelerationMetricsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAccelerationMetricsIsMutable();
         this.accelerationMetrics_.set(var1, var2);
         this.onChanged();
      } else {
         this.accelerationMetricsBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public Sport$PbSport$Builder setCreated(Types$PbSystemDateTime$Builder var1) {
      if (this.createdBuilder_ == null) {
         this.created_ = var1.build();
         this.onChanged();
      } else {
         this.createdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 512;
      return this;
   }

   public Sport$PbSport$Builder setCreated(Types$PbSystemDateTime var1) {
      if (this.createdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.created_ = var1;
         this.onChanged();
      } else {
         this.createdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public Sport$PbSport$Builder setFactor(float var1) {
      this.bitField0_ |= 8;
      this.factor_ = var1;
      this.onChanged();
      return this;
   }

   public Sport$PbSport$Builder setField(FieldDescriptor var1, Object var2) {
      return (Sport$PbSport$Builder)super.setField(var1, var2);
   }

   public Sport$PbSport$Builder setIdentifier(Structures$PbSportIdentifier$Builder var1) {
      if (this.identifierBuilder_ == null) {
         this.identifier_ = var1.build();
         this.onChanged();
      } else {
         this.identifierBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Sport$PbSport$Builder setIdentifier(Structures$PbSportIdentifier var1) {
      if (this.identifierBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.identifier_ = var1;
         this.onChanged();
      } else {
         this.identifierBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Sport$PbSport$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public Sport$PbSport$Builder setLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastModified_ = var1;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public Sport$PbSport$Builder setParentIdentifier(Structures$PbSportIdentifier$Builder var1) {
      if (this.parentIdentifierBuilder_ == null) {
         this.parentIdentifier_ = var1.build();
         this.onChanged();
      } else {
         this.parentIdentifierBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Sport$PbSport$Builder setParentIdentifier(Structures$PbSportIdentifier var1) {
      if (this.parentIdentifierBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.parentIdentifier_ = var1;
         this.onChanged();
      } else {
         this.parentIdentifierBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Sport$PbSport$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Sport$PbSport$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Sport$PbSport$Builder setRunningMetricMeasurementsSupported(boolean var1) {
      this.bitField0_ |= 128;
      this.runningMetricMeasurementsSupported_ = var1;
      this.onChanged();
      return this;
   }

   public Sport$PbSport$Builder setSpeedZonesEnabled(boolean var1) {
      this.bitField0_ |= 64;
      this.speedZonesEnabled_ = var1;
      this.onChanged();
      return this;
   }

   public Sport$PbSport$Builder setSportType(Sport$PbSport$PbSportType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.sportType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Sport$PbSport$Builder setStages(int var1, Structures$PbSportIdentifier$Builder var2) {
      if (this.stagesBuilder_ == null) {
         this.ensureStagesIsMutable();
         this.stages_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.stagesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Sport$PbSport$Builder setStages(int var1, Structures$PbSportIdentifier var2) {
      if (this.stagesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStagesIsMutable();
         this.stages_.set(var1, var2);
         this.onChanged();
      } else {
         this.stagesBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public Sport$PbSport$Builder setTranslation(int var1, Sport$PbSportTranslation$Builder var2) {
      if (this.translationBuilder_ == null) {
         this.ensureTranslationIsMutable();
         this.translation_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.translationBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Sport$PbSport$Builder setTranslation(int var1, Sport$PbSportTranslation var2) {
      if (this.translationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureTranslationIsMutable();
         this.translation_.set(var1, var2);
         this.onChanged();
      } else {
         this.translationBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public final Sport$PbSport$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Sport$PbSport$Builder)super.setUnknownFields(var1);
   }
}
