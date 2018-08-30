package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class Types$PbAccelerationMetrics$Builder extends Builder implements Types$PbAccelerationMetricsOrBuilder {
   private int bitField0_;
   private RepeatedFieldBuilderV3 calibrationSettingsBuilder_;
   private List calibrationSettings_;
   private int sampleSourceType_;

   private Types$PbAccelerationMetrics$Builder() {
      this.sampleSourceType_ = 0;
      this.calibrationSettings_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private Types$PbAccelerationMetrics$Builder(BuilderParent var1) {
      super(var1);
      this.sampleSourceType_ = 0;
      this.calibrationSettings_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbAccelerationMetrics$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbAccelerationMetrics$Builder(Types$1 var1) {
      this();
   }

   private void ensureCalibrationSettingsIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.calibrationSettings_ = new ArrayList(this.calibrationSettings_);
         this.bitField0_ |= 2;
      }

   }

   private RepeatedFieldBuilderV3 getCalibrationSettingsFieldBuilder() {
      if (this.calibrationSettingsBuilder_ == null) {
         List var1 = this.calibrationSettings_;
         boolean var2;
         if ((this.bitField0_ & 2) == 2) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.calibrationSettingsBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.calibrationSettings_ = null;
      }

      return this.calibrationSettingsBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return Types.C();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbAccelerationMetrics.b()) {
         this.getCalibrationSettingsFieldBuilder();
      }

   }

   public Types$PbAccelerationMetrics$Builder addAllCalibrationSettings(Iterable var1) {
      if (this.calibrationSettingsBuilder_ == null) {
         this.ensureCalibrationSettingsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.calibrationSettings_);
         this.onChanged();
      } else {
         this.calibrationSettingsBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder addCalibrationSettings(int var1, Types$PbCalibrationSettings$Builder var2) {
      if (this.calibrationSettingsBuilder_ == null) {
         this.ensureCalibrationSettingsIsMutable();
         this.calibrationSettings_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.calibrationSettingsBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder addCalibrationSettings(int var1, Types$PbCalibrationSettings var2) {
      if (this.calibrationSettingsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureCalibrationSettingsIsMutable();
         this.calibrationSettings_.add(var1, var2);
         this.onChanged();
      } else {
         this.calibrationSettingsBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder addCalibrationSettings(Types$PbCalibrationSettings$Builder var1) {
      if (this.calibrationSettingsBuilder_ == null) {
         this.ensureCalibrationSettingsIsMutable();
         this.calibrationSettings_.add(var1.build());
         this.onChanged();
      } else {
         this.calibrationSettingsBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder addCalibrationSettings(Types$PbCalibrationSettings var1) {
      if (this.calibrationSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureCalibrationSettingsIsMutable();
         this.calibrationSettings_.add(var1);
         this.onChanged();
      } else {
         this.calibrationSettingsBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbCalibrationSettings$Builder addCalibrationSettingsBuilder() {
      return (Types$PbCalibrationSettings$Builder)this.getCalibrationSettingsFieldBuilder().addBuilder(Types$PbCalibrationSettings.getDefaultInstance());
   }

   public Types$PbCalibrationSettings$Builder addCalibrationSettingsBuilder(int var1) {
      return (Types$PbCalibrationSettings$Builder)this.getCalibrationSettingsFieldBuilder().addBuilder(var1, Types$PbCalibrationSettings.getDefaultInstance());
   }

   public Types$PbAccelerationMetrics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbAccelerationMetrics$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbAccelerationMetrics build() {
      Types$PbAccelerationMetrics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbAccelerationMetrics buildPartial() {
      byte var1 = 1;
      Types$PbAccelerationMetrics var2 = new Types$PbAccelerationMetrics(this, (Types$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Types$PbAccelerationMetrics.a(var2, this.sampleSourceType_);
      if (this.calibrationSettingsBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2) {
            this.calibrationSettings_ = Collections.unmodifiableList(this.calibrationSettings_);
            this.bitField0_ &= -3;
         }

         Types$PbAccelerationMetrics.a(var2, this.calibrationSettings_);
      } else {
         Types$PbAccelerationMetrics.a(var2, this.calibrationSettingsBuilder_.build());
      }

      Types$PbAccelerationMetrics.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Types$PbAccelerationMetrics$Builder clear() {
      super.clear();
      this.sampleSourceType_ = 0;
      this.bitField0_ &= -2;
      if (this.calibrationSettingsBuilder_ == null) {
         this.calibrationSettings_ = Collections.emptyList();
         this.bitField0_ &= -3;
      } else {
         this.calibrationSettingsBuilder_.clear();
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder clearCalibrationSettings() {
      if (this.calibrationSettingsBuilder_ == null) {
         this.calibrationSettings_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
      } else {
         this.calibrationSettingsBuilder_.clear();
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder clearField(FieldDescriptor var1) {
      return (Types$PbAccelerationMetrics$Builder)super.clearField(var1);
   }

   public Types$PbAccelerationMetrics$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbAccelerationMetrics$Builder)super.clearOneof(var1);
   }

   public Types$PbAccelerationMetrics$Builder clearSampleSourceType() {
      this.bitField0_ &= -2;
      this.sampleSourceType_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbAccelerationMetrics$Builder clone() {
      return (Types$PbAccelerationMetrics$Builder)super.clone();
   }

   public Types$PbCalibrationSettings getCalibrationSettings(int var1) {
      Types$PbCalibrationSettings var2;
      if (this.calibrationSettingsBuilder_ == null) {
         var2 = (Types$PbCalibrationSettings)this.calibrationSettings_.get(var1);
      } else {
         var2 = (Types$PbCalibrationSettings)this.calibrationSettingsBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbCalibrationSettings$Builder getCalibrationSettingsBuilder(int var1) {
      return (Types$PbCalibrationSettings$Builder)this.getCalibrationSettingsFieldBuilder().getBuilder(var1);
   }

   public List getCalibrationSettingsBuilderList() {
      return this.getCalibrationSettingsFieldBuilder().getBuilderList();
   }

   public int getCalibrationSettingsCount() {
      int var1;
      if (this.calibrationSettingsBuilder_ == null) {
         var1 = this.calibrationSettings_.size();
      } else {
         var1 = this.calibrationSettingsBuilder_.getCount();
      }

      return var1;
   }

   public List getCalibrationSettingsList() {
      List var1;
      if (this.calibrationSettingsBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.calibrationSettings_);
      } else {
         var1 = this.calibrationSettingsBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbCalibrationSettingsOrBuilder getCalibrationSettingsOrBuilder(int var1) {
      Types$PbCalibrationSettingsOrBuilder var2;
      if (this.calibrationSettingsBuilder_ == null) {
         var2 = (Types$PbCalibrationSettingsOrBuilder)this.calibrationSettings_.get(var1);
      } else {
         var2 = (Types$PbCalibrationSettingsOrBuilder)this.calibrationSettingsBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getCalibrationSettingsOrBuilderList() {
      List var1;
      if (this.calibrationSettingsBuilder_ != null) {
         var1 = this.calibrationSettingsBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.calibrationSettings_);
      }

      return var1;
   }

   public Types$PbAccelerationMetrics getDefaultInstanceForType() {
      return Types$PbAccelerationMetrics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.C();
   }

   public Types$PbSampleSourceType getSampleSourceType() {
      Types$PbSampleSourceType var1 = Types$PbSampleSourceType.valueOf(this.sampleSourceType_);
      Types$PbSampleSourceType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSampleSourceType.SAMPLE_SOURCE_TYPE_UNDEFINED;
      }

      return var2;
   }

   public boolean hasSampleSourceType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.D().ensureFieldAccessorsInitialized(Types$PbAccelerationMetrics.class, Types$PbAccelerationMetrics$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasSampleSourceType()) {
         var2 = var1;
      } else {
         int var3 = 0;

         while(true) {
            if (var3 >= this.getCalibrationSettingsCount()) {
               var2 = true;
               break;
            }

            var2 = var1;
            if (!this.getCalibrationSettings(var3).isInitialized()) {
               break;
            }

            ++var3;
         }
      }

      return var2;
   }

   public Types$PbAccelerationMetrics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbAccelerationMetrics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Types$PbAccelerationMetrics)Types$PbAccelerationMetrics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Types$PbAccelerationMetrics)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var13.unwrapIOException();
         } finally {
            if (var12 != null) {
               this.mergeFrom(var12);
            }

            throw var13;
         }
      }

      if (var12 != null) {
         this.mergeFrom(var12);
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder mergeFrom(Message var1) {
      Types$PbAccelerationMetrics$Builder var2;
      if (var1 instanceof Types$PbAccelerationMetrics) {
         var2 = this.mergeFrom((Types$PbAccelerationMetrics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbAccelerationMetrics$Builder mergeFrom(Types$PbAccelerationMetrics var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != Types$PbAccelerationMetrics.getDefaultInstance()) {
         if (var1.hasSampleSourceType()) {
            this.setSampleSourceType(var1.getSampleSourceType());
         }

         if (this.calibrationSettingsBuilder_ == null) {
            if (!Types$PbAccelerationMetrics.a(var1).isEmpty()) {
               if (this.calibrationSettings_.isEmpty()) {
                  this.calibrationSettings_ = Types$PbAccelerationMetrics.a(var1);
                  this.bitField0_ &= -3;
               } else {
                  this.ensureCalibrationSettingsIsMutable();
                  this.calibrationSettings_.addAll(Types$PbAccelerationMetrics.a(var1));
               }

               this.onChanged();
            }
         } else if (!Types$PbAccelerationMetrics.a(var1).isEmpty()) {
            if (this.calibrationSettingsBuilder_.isEmpty()) {
               this.calibrationSettingsBuilder_.dispose();
               this.calibrationSettingsBuilder_ = null;
               this.calibrationSettings_ = Types$PbAccelerationMetrics.a(var1);
               this.bitField0_ &= -3;
               if (Types$PbAccelerationMetrics.c()) {
                  var2 = this.getCalibrationSettingsFieldBuilder();
               }

               this.calibrationSettingsBuilder_ = var2;
            } else {
               this.calibrationSettingsBuilder_.addAllMessages(Types$PbAccelerationMetrics.a(var1));
            }
         }

         this.mergeUnknownFields(Types$PbAccelerationMetrics.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbAccelerationMetrics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbAccelerationMetrics$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbAccelerationMetrics$Builder removeCalibrationSettings(int var1) {
      if (this.calibrationSettingsBuilder_ == null) {
         this.ensureCalibrationSettingsIsMutable();
         this.calibrationSettings_.remove(var1);
         this.onChanged();
      } else {
         this.calibrationSettingsBuilder_.remove(var1);
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder setCalibrationSettings(int var1, Types$PbCalibrationSettings$Builder var2) {
      if (this.calibrationSettingsBuilder_ == null) {
         this.ensureCalibrationSettingsIsMutable();
         this.calibrationSettings_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.calibrationSettingsBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder setCalibrationSettings(int var1, Types$PbCalibrationSettings var2) {
      if (this.calibrationSettingsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureCalibrationSettingsIsMutable();
         this.calibrationSettings_.set(var1, var2);
         this.onChanged();
      } else {
         this.calibrationSettingsBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public Types$PbAccelerationMetrics$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbAccelerationMetrics$Builder)super.setField(var1, var2);
   }

   public Types$PbAccelerationMetrics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbAccelerationMetrics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbAccelerationMetrics$Builder setSampleSourceType(Types$PbSampleSourceType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.sampleSourceType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final Types$PbAccelerationMetrics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbAccelerationMetrics$Builder)super.setUnknownFields(var1);
   }
}
