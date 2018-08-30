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

public final class Zones$PbRecordedHeartRateZone$Builder extends Builder implements Zones$PbRecordedHeartRateZoneOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 inZoneBuilder_;
   private Types$PbDuration inZone_;
   private SingleFieldBuilderV3 zoneLimitsBuilder_;
   private Structures$PbHeartRateZone zoneLimits_;

   private Zones$PbRecordedHeartRateZone$Builder() {
      this.zoneLimits_ = null;
      this.inZone_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Zones$PbRecordedHeartRateZone$Builder(BuilderParent var1) {
      super(var1);
      this.zoneLimits_ = null;
      this.inZone_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Zones$PbRecordedHeartRateZone$Builder(BuilderParent var1, Zones$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Zones$PbRecordedHeartRateZone$Builder(Zones$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Zones.a();
   }

   private SingleFieldBuilderV3 getInZoneFieldBuilder() {
      if (this.inZoneBuilder_ == null) {
         this.inZoneBuilder_ = new SingleFieldBuilderV3(this.getInZone(), this.getParentForChildren(), this.isClean());
         this.inZone_ = null;
      }

      return this.inZoneBuilder_;
   }

   private SingleFieldBuilderV3 getZoneLimitsFieldBuilder() {
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimitsBuilder_ = new SingleFieldBuilderV3(this.getZoneLimits(), this.getParentForChildren(), this.isClean());
         this.zoneLimits_ = null;
      }

      return this.zoneLimitsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Zones$PbRecordedHeartRateZone.b()) {
         this.getZoneLimitsFieldBuilder();
         this.getInZoneFieldBuilder();
      }

   }

   public Zones$PbRecordedHeartRateZone$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Zones$PbRecordedHeartRateZone$Builder)super.addRepeatedField(var1, var2);
   }

   public Zones$PbRecordedHeartRateZone build() {
      Zones$PbRecordedHeartRateZone var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Zones$PbRecordedHeartRateZone buildPartial() {
      Zones$PbRecordedHeartRateZone var1 = new Zones$PbRecordedHeartRateZone(this, (Zones$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.zoneLimitsBuilder_ == null) {
         Zones$PbRecordedHeartRateZone.a(var1, this.zoneLimits_);
      } else {
         Zones$PbRecordedHeartRateZone.a(var1, (Structures$PbHeartRateZone)this.zoneLimitsBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.inZoneBuilder_ == null) {
         Zones$PbRecordedHeartRateZone.a(var1, this.inZone_);
      } else {
         Zones$PbRecordedHeartRateZone.a(var1, (Types$PbDuration)this.inZoneBuilder_.build());
      }

      Zones$PbRecordedHeartRateZone.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public Zones$PbRecordedHeartRateZone$Builder clear() {
      super.clear();
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimits_ = null;
      } else {
         this.zoneLimitsBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.inZoneBuilder_ == null) {
         this.inZone_ = null;
      } else {
         this.inZoneBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Zones$PbRecordedHeartRateZone$Builder clearField(FieldDescriptor var1) {
      return (Zones$PbRecordedHeartRateZone$Builder)super.clearField(var1);
   }

   public Zones$PbRecordedHeartRateZone$Builder clearInZone() {
      if (this.inZoneBuilder_ == null) {
         this.inZone_ = null;
         this.onChanged();
      } else {
         this.inZoneBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Zones$PbRecordedHeartRateZone$Builder clearOneof(OneofDescriptor var1) {
      return (Zones$PbRecordedHeartRateZone$Builder)super.clearOneof(var1);
   }

   public Zones$PbRecordedHeartRateZone$Builder clearZoneLimits() {
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimits_ = null;
         this.onChanged();
      } else {
         this.zoneLimitsBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Zones$PbRecordedHeartRateZone$Builder clone() {
      return (Zones$PbRecordedHeartRateZone$Builder)super.clone();
   }

   public Zones$PbRecordedHeartRateZone getDefaultInstanceForType() {
      return Zones$PbRecordedHeartRateZone.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Zones.a();
   }

   public Types$PbDuration getInZone() {
      Types$PbDuration var1;
      if (this.inZoneBuilder_ == null) {
         if (this.inZone_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.inZone_;
         }
      } else {
         var1 = (Types$PbDuration)this.inZoneBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getInZoneBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getInZoneFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getInZoneOrBuilder() {
      Object var1;
      if (this.inZoneBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.inZoneBuilder_.getMessageOrBuilder();
      } else if (this.inZone_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.inZone_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Structures$PbHeartRateZone getZoneLimits() {
      Structures$PbHeartRateZone var1;
      if (this.zoneLimitsBuilder_ == null) {
         if (this.zoneLimits_ == null) {
            var1 = Structures$PbHeartRateZone.getDefaultInstance();
         } else {
            var1 = this.zoneLimits_;
         }
      } else {
         var1 = (Structures$PbHeartRateZone)this.zoneLimitsBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbHeartRateZone$Builder getZoneLimitsBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Structures$PbHeartRateZone$Builder)this.getZoneLimitsFieldBuilder().getBuilder();
   }

   public Structures$PbHeartRateZoneOrBuilder getZoneLimitsOrBuilder() {
      Object var1;
      if (this.zoneLimitsBuilder_ != null) {
         var1 = (Structures$PbHeartRateZoneOrBuilder)this.zoneLimitsBuilder_.getMessageOrBuilder();
      } else if (this.zoneLimits_ == null) {
         var1 = Structures$PbHeartRateZone.getDefaultInstance();
      } else {
         var1 = this.zoneLimits_;
      }

      return (Structures$PbHeartRateZoneOrBuilder)var1;
   }

   public boolean hasInZone() {
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
      return Zones.b().ensureFieldAccessorsInitialized(Zones$PbRecordedHeartRateZone.class, Zones$PbRecordedHeartRateZone$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasZoneLimits()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasInZone()) {
            var2 = var1;
            if (this.getZoneLimits().isInitialized()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public Zones$PbRecordedHeartRateZone$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Zones$PbRecordedHeartRateZone var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Zones$PbRecordedHeartRateZone)Zones$PbRecordedHeartRateZone.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Zones$PbRecordedHeartRateZone)var10.getUnfinishedMessage();
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

   public Zones$PbRecordedHeartRateZone$Builder mergeFrom(Message var1) {
      Zones$PbRecordedHeartRateZone$Builder var2;
      if (var1 instanceof Zones$PbRecordedHeartRateZone) {
         var2 = this.mergeFrom((Zones$PbRecordedHeartRateZone)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Zones$PbRecordedHeartRateZone$Builder mergeFrom(Zones$PbRecordedHeartRateZone var1) {
      if (var1 != Zones$PbRecordedHeartRateZone.getDefaultInstance()) {
         if (var1.hasZoneLimits()) {
            this.mergeZoneLimits(var1.getZoneLimits());
         }

         if (var1.hasInZone()) {
            this.mergeInZone(var1.getInZone());
         }

         this.mergeUnknownFields(Zones$PbRecordedHeartRateZone.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Zones$PbRecordedHeartRateZone$Builder mergeInZone(Types$PbDuration var1) {
      if (this.inZoneBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.inZone_ != null && this.inZone_ != Types$PbDuration.getDefaultInstance()) {
            this.inZone_ = Types$PbDuration.newBuilder(this.inZone_).mergeFrom(var1).buildPartial();
         } else {
            this.inZone_ = var1;
         }

         this.onChanged();
      } else {
         this.inZoneBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Zones$PbRecordedHeartRateZone$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Zones$PbRecordedHeartRateZone$Builder)super.mergeUnknownFields(var1);
   }

   public Zones$PbRecordedHeartRateZone$Builder mergeZoneLimits(Structures$PbHeartRateZone var1) {
      if (this.zoneLimitsBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.zoneLimits_ != null && this.zoneLimits_ != Structures$PbHeartRateZone.getDefaultInstance()) {
            this.zoneLimits_ = Structures$PbHeartRateZone.newBuilder(this.zoneLimits_).mergeFrom(var1).buildPartial();
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

   public Zones$PbRecordedHeartRateZone$Builder setField(FieldDescriptor var1, Object var2) {
      return (Zones$PbRecordedHeartRateZone$Builder)super.setField(var1, var2);
   }

   public Zones$PbRecordedHeartRateZone$Builder setInZone(Types$PbDuration$Builder var1) {
      if (this.inZoneBuilder_ == null) {
         this.inZone_ = var1.build();
         this.onChanged();
      } else {
         this.inZoneBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Zones$PbRecordedHeartRateZone$Builder setInZone(Types$PbDuration var1) {
      if (this.inZoneBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.inZone_ = var1;
         this.onChanged();
      } else {
         this.inZoneBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Zones$PbRecordedHeartRateZone$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Zones$PbRecordedHeartRateZone$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Zones$PbRecordedHeartRateZone$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Zones$PbRecordedHeartRateZone$Builder)super.setUnknownFields(var1);
   }

   public Zones$PbRecordedHeartRateZone$Builder setZoneLimits(Structures$PbHeartRateZone$Builder var1) {
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimits_ = var1.build();
         this.onChanged();
      } else {
         this.zoneLimitsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Zones$PbRecordedHeartRateZone$Builder setZoneLimits(Structures$PbHeartRateZone var1) {
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
