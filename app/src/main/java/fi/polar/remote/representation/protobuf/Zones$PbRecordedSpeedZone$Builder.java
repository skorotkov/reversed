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

public final class Zones$PbRecordedSpeedZone$Builder extends Builder implements Zones$PbRecordedSpeedZoneOrBuilder {
   private int bitField0_;
   private float distanceInZone_;
   private SingleFieldBuilderV3 timeInZoneBuilder_;
   private Types$PbDuration timeInZone_;
   private SingleFieldBuilderV3 zoneLimitsBuilder_;
   private Structures$PbSpeedZone zoneLimits_;

   private Zones$PbRecordedSpeedZone$Builder() {
      this.zoneLimits_ = null;
      this.timeInZone_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Zones$PbRecordedSpeedZone$Builder(BuilderParent var1) {
      super(var1);
      this.zoneLimits_ = null;
      this.timeInZone_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Zones$PbRecordedSpeedZone$Builder(BuilderParent var1, Zones$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Zones$PbRecordedSpeedZone$Builder(Zones$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Zones.g();
   }

   private SingleFieldBuilderV3 getTimeInZoneFieldBuilder() {
      if (this.timeInZoneBuilder_ == null) {
         this.timeInZoneBuilder_ = new SingleFieldBuilderV3(this.getTimeInZone(), this.getParentForChildren(), this.isClean());
         this.timeInZone_ = null;
      }

      return this.timeInZoneBuilder_;
   }

   private SingleFieldBuilderV3 getZoneLimitsFieldBuilder() {
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimitsBuilder_ = new SingleFieldBuilderV3(this.getZoneLimits(), this.getParentForChildren(), this.isClean());
         this.zoneLimits_ = null;
      }

      return this.zoneLimitsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Zones$PbRecordedSpeedZone.b()) {
         this.getZoneLimitsFieldBuilder();
         this.getTimeInZoneFieldBuilder();
      }

   }

   public Zones$PbRecordedSpeedZone$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Zones$PbRecordedSpeedZone$Builder)super.addRepeatedField(var1, var2);
   }

   public Zones$PbRecordedSpeedZone build() {
      Zones$PbRecordedSpeedZone var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Zones$PbRecordedSpeedZone buildPartial() {
      Zones$PbRecordedSpeedZone var1 = new Zones$PbRecordedSpeedZone(this, (Zones$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.zoneLimitsBuilder_ == null) {
         Zones$PbRecordedSpeedZone.a(var1, this.zoneLimits_);
      } else {
         Zones$PbRecordedSpeedZone.a(var1, (Structures$PbSpeedZone)this.zoneLimitsBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.timeInZoneBuilder_ == null) {
         Zones$PbRecordedSpeedZone.a(var1, this.timeInZone_);
      } else {
         Zones$PbRecordedSpeedZone.a(var1, (Types$PbDuration)this.timeInZoneBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      Zones$PbRecordedSpeedZone.a(var1, this.distanceInZone_);
      Zones$PbRecordedSpeedZone.a(var1, var5);
      this.onBuilt();
      return var1;
   }

   public Zones$PbRecordedSpeedZone$Builder clear() {
      super.clear();
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimits_ = null;
      } else {
         this.zoneLimitsBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.timeInZoneBuilder_ == null) {
         this.timeInZone_ = null;
      } else {
         this.timeInZoneBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.distanceInZone_ = 0.0F;
      this.bitField0_ &= -5;
      return this;
   }

   public Zones$PbRecordedSpeedZone$Builder clearDistanceInZone() {
      this.bitField0_ &= -5;
      this.distanceInZone_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Zones$PbRecordedSpeedZone$Builder clearField(FieldDescriptor var1) {
      return (Zones$PbRecordedSpeedZone$Builder)super.clearField(var1);
   }

   public Zones$PbRecordedSpeedZone$Builder clearOneof(OneofDescriptor var1) {
      return (Zones$PbRecordedSpeedZone$Builder)super.clearOneof(var1);
   }

   public Zones$PbRecordedSpeedZone$Builder clearTimeInZone() {
      if (this.timeInZoneBuilder_ == null) {
         this.timeInZone_ = null;
         this.onChanged();
      } else {
         this.timeInZoneBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Zones$PbRecordedSpeedZone$Builder clearZoneLimits() {
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimits_ = null;
         this.onChanged();
      } else {
         this.zoneLimitsBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Zones$PbRecordedSpeedZone$Builder clone() {
      return (Zones$PbRecordedSpeedZone$Builder)super.clone();
   }

   public Zones$PbRecordedSpeedZone getDefaultInstanceForType() {
      return Zones$PbRecordedSpeedZone.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Zones.g();
   }

   public float getDistanceInZone() {
      return this.distanceInZone_;
   }

   public Types$PbDuration getTimeInZone() {
      Types$PbDuration var1;
      if (this.timeInZoneBuilder_ == null) {
         if (this.timeInZone_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeInZone_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeInZoneBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeInZoneBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeInZoneFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeInZoneOrBuilder() {
      Object var1;
      if (this.timeInZoneBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeInZoneBuilder_.getMessageOrBuilder();
      } else if (this.timeInZone_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeInZone_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Structures$PbSpeedZone getZoneLimits() {
      Structures$PbSpeedZone var1;
      if (this.zoneLimitsBuilder_ == null) {
         if (this.zoneLimits_ == null) {
            var1 = Structures$PbSpeedZone.getDefaultInstance();
         } else {
            var1 = this.zoneLimits_;
         }
      } else {
         var1 = (Structures$PbSpeedZone)this.zoneLimitsBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbSpeedZone$Builder getZoneLimitsBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Structures$PbSpeedZone$Builder)this.getZoneLimitsFieldBuilder().getBuilder();
   }

   public Structures$PbSpeedZoneOrBuilder getZoneLimitsOrBuilder() {
      Object var1;
      if (this.zoneLimitsBuilder_ != null) {
         var1 = (Structures$PbSpeedZoneOrBuilder)this.zoneLimitsBuilder_.getMessageOrBuilder();
      } else if (this.zoneLimits_ == null) {
         var1 = Structures$PbSpeedZone.getDefaultInstance();
      } else {
         var1 = this.zoneLimits_;
      }

      return (Structures$PbSpeedZoneOrBuilder)var1;
   }

   public boolean hasDistanceInZone() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeInZone() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasZoneLimits() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Zones.h().ensureFieldAccessorsInitialized(Zones$PbRecordedSpeedZone.class, Zones$PbRecordedSpeedZone$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasZoneLimits() && this.getZoneLimits().isInitialized()) {
         var1 = true;
      }

      return var1;
   }

   public Zones$PbRecordedSpeedZone$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Zones$PbRecordedSpeedZone var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (Zones$PbRecordedSpeedZone)Zones$PbRecordedSpeedZone.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (Zones$PbRecordedSpeedZone)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public Zones$PbRecordedSpeedZone$Builder mergeFrom(Message var1) {
      Zones$PbRecordedSpeedZone$Builder var2;
      if (var1 instanceof Zones$PbRecordedSpeedZone) {
         var2 = this.mergeFrom((Zones$PbRecordedSpeedZone)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Zones$PbRecordedSpeedZone$Builder mergeFrom(Zones$PbRecordedSpeedZone var1) {
      if (var1 != Zones$PbRecordedSpeedZone.getDefaultInstance()) {
         if (var1.hasZoneLimits()) {
            this.mergeZoneLimits(var1.getZoneLimits());
         }

         if (var1.hasTimeInZone()) {
            this.mergeTimeInZone(var1.getTimeInZone());
         }

         if (var1.hasDistanceInZone()) {
            this.setDistanceInZone(var1.getDistanceInZone());
         }

         this.mergeUnknownFields(Zones$PbRecordedSpeedZone.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Zones$PbRecordedSpeedZone$Builder mergeTimeInZone(Types$PbDuration var1) {
      if (this.timeInZoneBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.timeInZone_ != null && this.timeInZone_ != Types$PbDuration.getDefaultInstance()) {
            this.timeInZone_ = Types$PbDuration.newBuilder(this.timeInZone_).mergeFrom(var1).buildPartial();
         } else {
            this.timeInZone_ = var1;
         }

         this.onChanged();
      } else {
         this.timeInZoneBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Zones$PbRecordedSpeedZone$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Zones$PbRecordedSpeedZone$Builder)super.mergeUnknownFields(var1);
   }

   public Zones$PbRecordedSpeedZone$Builder mergeZoneLimits(Structures$PbSpeedZone var1) {
      if (this.zoneLimitsBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.zoneLimits_ != null && this.zoneLimits_ != Structures$PbSpeedZone.getDefaultInstance()) {
            this.zoneLimits_ = Structures$PbSpeedZone.newBuilder(this.zoneLimits_).mergeFrom(var1).buildPartial();
         } else {
            this.zoneLimits_ = var1;
         }

         this.onChanged();
      } else {
         this.zoneLimitsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Zones$PbRecordedSpeedZone$Builder setDistanceInZone(float var1) {
      this.bitField0_ |= 4;
      this.distanceInZone_ = var1;
      this.onChanged();
      return this;
   }

   public Zones$PbRecordedSpeedZone$Builder setField(FieldDescriptor var1, Object var2) {
      return (Zones$PbRecordedSpeedZone$Builder)super.setField(var1, var2);
   }

   public Zones$PbRecordedSpeedZone$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Zones$PbRecordedSpeedZone$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Zones$PbRecordedSpeedZone$Builder setTimeInZone(Types$PbDuration$Builder var1) {
      if (this.timeInZoneBuilder_ == null) {
         this.timeInZone_ = var1.build();
         this.onChanged();
      } else {
         this.timeInZoneBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Zones$PbRecordedSpeedZone$Builder setTimeInZone(Types$PbDuration var1) {
      if (this.timeInZoneBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeInZone_ = var1;
         this.onChanged();
      } else {
         this.timeInZoneBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Zones$PbRecordedSpeedZone$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Zones$PbRecordedSpeedZone$Builder)super.setUnknownFields(var1);
   }

   public Zones$PbRecordedSpeedZone$Builder setZoneLimits(Structures$PbSpeedZone$Builder var1) {
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimits_ = var1.build();
         this.onChanged();
      } else {
         this.zoneLimitsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Zones$PbRecordedSpeedZone$Builder setZoneLimits(Structures$PbSpeedZone var1) {
      if (this.zoneLimitsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.zoneLimits_ = var1;
         this.onChanged();
      } else {
         this.zoneLimitsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }
}
