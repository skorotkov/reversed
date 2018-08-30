package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Zones$PbRecordedFatFitZones$Builder extends Builder implements Zones$PbRecordedFatFitZonesOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 fatTimeBuilder_;
   private Types$PbDuration fatTime_;
   private int fatfitLimit_;
   private SingleFieldBuilderV3 fitTimeBuilder_;
   private Types$PbDuration fitTime_;

   private Zones$PbRecordedFatFitZones$Builder() {
      this.fatTime_ = null;
      this.fitTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Zones$PbRecordedFatFitZones$Builder(BuilderParent var1) {
      super(var1);
      this.fatTime_ = null;
      this.fitTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Zones$PbRecordedFatFitZones$Builder(BuilderParent var1, Zones$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Zones$PbRecordedFatFitZones$Builder(Zones$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Zones.e();
   }

   private SingleFieldBuilderV3 getFatTimeFieldBuilder() {
      if (this.fatTimeBuilder_ == null) {
         this.fatTimeBuilder_ = new SingleFieldBuilderV3(this.getFatTime(), this.getParentForChildren(), this.isClean());
         this.fatTime_ = null;
      }

      return this.fatTimeBuilder_;
   }

   private SingleFieldBuilderV3 getFitTimeFieldBuilder() {
      if (this.fitTimeBuilder_ == null) {
         this.fitTimeBuilder_ = new SingleFieldBuilderV3(this.getFitTime(), this.getParentForChildren(), this.isClean());
         this.fitTime_ = null;
      }

      return this.fitTimeBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Zones$PbRecordedFatFitZones.b()) {
         this.getFatTimeFieldBuilder();
         this.getFitTimeFieldBuilder();
      }

   }

   public Zones$PbRecordedFatFitZones$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Zones$PbRecordedFatFitZones$Builder)super.addRepeatedField(var1, var2);
   }

   public Zones$PbRecordedFatFitZones build() {
      Zones$PbRecordedFatFitZones var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Zones$PbRecordedFatFitZones buildPartial() {
      int var1 = 1;
      Zones$PbRecordedFatFitZones var2 = new Zones$PbRecordedFatFitZones(this, (Zones$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Zones$PbRecordedFatFitZones.a(var2, this.fatfitLimit_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.fatTimeBuilder_ == null) {
         Zones$PbRecordedFatFitZones.a(var2, this.fatTime_);
      } else {
         Zones$PbRecordedFatFitZones.a(var2, (Types$PbDuration)this.fatTimeBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      if (this.fitTimeBuilder_ == null) {
         Zones$PbRecordedFatFitZones.b(var2, this.fitTime_);
      } else {
         Zones$PbRecordedFatFitZones.b(var2, (Types$PbDuration)this.fitTimeBuilder_.build());
      }

      Zones$PbRecordedFatFitZones.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Zones$PbRecordedFatFitZones$Builder clear() {
      super.clear();
      this.fatfitLimit_ = 0;
      this.bitField0_ &= -2;
      if (this.fatTimeBuilder_ == null) {
         this.fatTime_ = null;
      } else {
         this.fatTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.fitTimeBuilder_ == null) {
         this.fitTime_ = null;
      } else {
         this.fitTimeBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder clearFatTime() {
      if (this.fatTimeBuilder_ == null) {
         this.fatTime_ = null;
         this.onChanged();
      } else {
         this.fatTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder clearFatfitLimit() {
      this.bitField0_ &= -2;
      this.fatfitLimit_ = 0;
      this.onChanged();
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder clearField(FieldDescriptor var1) {
      return (Zones$PbRecordedFatFitZones$Builder)super.clearField(var1);
   }

   public Zones$PbRecordedFatFitZones$Builder clearFitTime() {
      if (this.fitTimeBuilder_ == null) {
         this.fitTime_ = null;
         this.onChanged();
      } else {
         this.fitTimeBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder clearOneof(OneofDescriptor var1) {
      return (Zones$PbRecordedFatFitZones$Builder)super.clearOneof(var1);
   }

   public Zones$PbRecordedFatFitZones$Builder clone() {
      return (Zones$PbRecordedFatFitZones$Builder)super.clone();
   }

   public Zones$PbRecordedFatFitZones getDefaultInstanceForType() {
      return Zones$PbRecordedFatFitZones.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Zones.e();
   }

   public Types$PbDuration getFatTime() {
      Types$PbDuration var1;
      if (this.fatTimeBuilder_ == null) {
         if (this.fatTime_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.fatTime_;
         }
      } else {
         var1 = (Types$PbDuration)this.fatTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getFatTimeBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getFatTimeFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getFatTimeOrBuilder() {
      Object var1;
      if (this.fatTimeBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.fatTimeBuilder_.getMessageOrBuilder();
      } else if (this.fatTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.fatTime_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public int getFatfitLimit() {
      return this.fatfitLimit_;
   }

   public Types$PbDuration getFitTime() {
      Types$PbDuration var1;
      if (this.fitTimeBuilder_ == null) {
         if (this.fitTime_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.fitTime_;
         }
      } else {
         var1 = (Types$PbDuration)this.fitTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getFitTimeBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getFitTimeFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getFitTimeOrBuilder() {
      Object var1;
      if (this.fitTimeBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.fitTimeBuilder_.getMessageOrBuilder();
      } else if (this.fitTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.fitTime_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public boolean hasFatTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFatfitLimit() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFitTime() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Zones.f().ensureFieldAccessorsInitialized(Zones$PbRecordedFatFitZones.class, Zones$PbRecordedFatFitZones$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasFatfitLimit()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasFatTime()) {
            var2 = var1;
            if (this.hasFitTime()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public Zones$PbRecordedFatFitZones$Builder mergeFatTime(Types$PbDuration var1) {
      if (this.fatTimeBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.fatTime_ != null && this.fatTime_ != Types$PbDuration.getDefaultInstance()) {
            this.fatTime_ = Types$PbDuration.newBuilder(this.fatTime_).mergeFrom(var1).buildPartial();
         } else {
            this.fatTime_ = var1;
         }

         this.onChanged();
      } else {
         this.fatTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder mergeFitTime(Types$PbDuration var1) {
      if (this.fitTimeBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.fitTime_ != null && this.fitTime_ != Types$PbDuration.getDefaultInstance()) {
            this.fitTime_ = Types$PbDuration.newBuilder(this.fitTime_).mergeFrom(var1).buildPartial();
         } else {
            this.fitTime_ = var1;
         }

         this.onChanged();
      } else {
         this.fitTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Zones$PbRecordedFatFitZones var13;
      label96: {
         InvalidProtocolBufferException var12;
         Zones$PbRecordedFatFitZones var14;
         try {
            var13 = (Zones$PbRecordedFatFitZones)Zones$PbRecordedFatFitZones.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Zones$PbRecordedFatFitZones)var10.getUnfinishedMessage();
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

   public Zones$PbRecordedFatFitZones$Builder mergeFrom(Message var1) {
      Zones$PbRecordedFatFitZones$Builder var2;
      if (var1 instanceof Zones$PbRecordedFatFitZones) {
         var2 = this.mergeFrom((Zones$PbRecordedFatFitZones)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Zones$PbRecordedFatFitZones$Builder mergeFrom(Zones$PbRecordedFatFitZones var1) {
      if (var1 != Zones$PbRecordedFatFitZones.getDefaultInstance()) {
         if (var1.hasFatfitLimit()) {
            this.setFatfitLimit(var1.getFatfitLimit());
         }

         if (var1.hasFatTime()) {
            this.mergeFatTime(var1.getFatTime());
         }

         if (var1.hasFitTime()) {
            this.mergeFitTime(var1.getFitTime());
         }

         this.mergeUnknownFields(Zones$PbRecordedFatFitZones.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Zones$PbRecordedFatFitZones$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Zones$PbRecordedFatFitZones$Builder)super.mergeUnknownFields(var1);
   }

   public Zones$PbRecordedFatFitZones$Builder setFatTime(Types$PbDuration$Builder var1) {
      if (this.fatTimeBuilder_ == null) {
         this.fatTime_ = var1.build();
         this.onChanged();
      } else {
         this.fatTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder setFatTime(Types$PbDuration var1) {
      if (this.fatTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.fatTime_ = var1;
         this.onChanged();
      } else {
         this.fatTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder setFatfitLimit(int var1) {
      this.bitField0_ |= 1;
      this.fatfitLimit_ = var1;
      this.onChanged();
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder setField(FieldDescriptor var1, Object var2) {
      return (Zones$PbRecordedFatFitZones$Builder)super.setField(var1, var2);
   }

   public Zones$PbRecordedFatFitZones$Builder setFitTime(Types$PbDuration$Builder var1) {
      if (this.fitTimeBuilder_ == null) {
         this.fitTime_ = var1.build();
         this.onChanged();
      } else {
         this.fitTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder setFitTime(Types$PbDuration var1) {
      if (this.fitTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.fitTime_ = var1;
         this.onChanged();
      } else {
         this.fitTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Zones$PbRecordedFatFitZones$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Zones$PbRecordedFatFitZones$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Zones$PbRecordedFatFitZones$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Zones$PbRecordedFatFitZones$Builder)super.setUnknownFields(var1);
   }
}
