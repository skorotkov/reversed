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

public final class Types$PbAutoLapSettings$Builder extends Builder implements Types$PbAutoLapSettingsOrBuilder {
   private float automaticLapDistance_;
   private SingleFieldBuilderV3 automaticLapDurationBuilder_;
   private Types$PbDuration automaticLapDuration_;
   private int automaticLap_;
   private int bitField0_;

   private Types$PbAutoLapSettings$Builder() {
      this.automaticLap_ = 1;
      this.automaticLapDuration_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Types$PbAutoLapSettings$Builder(BuilderParent var1) {
      super(var1);
      this.automaticLap_ = 1;
      this.automaticLapDuration_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbAutoLapSettings$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbAutoLapSettings$Builder(Types$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getAutomaticLapDurationFieldBuilder() {
      if (this.automaticLapDurationBuilder_ == null) {
         this.automaticLapDurationBuilder_ = new SingleFieldBuilderV3(this.getAutomaticLapDuration(), this.getParentForChildren(), this.isClean());
         this.automaticLapDuration_ = null;
      }

      return this.automaticLapDurationBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return Types.G();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbAutoLapSettings.b()) {
         this.getAutomaticLapDurationFieldBuilder();
      }

   }

   public Types$PbAutoLapSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbAutoLapSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbAutoLapSettings build() {
      Types$PbAutoLapSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbAutoLapSettings buildPartial() {
      byte var1 = 1;
      Types$PbAutoLapSettings var2 = new Types$PbAutoLapSettings(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbAutoLapSettings.a(var2, this.automaticLap_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbAutoLapSettings.a(var2, this.automaticLapDistance_);
      int var5;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      } else {
         var5 = var4;
      }

      if (this.automaticLapDurationBuilder_ == null) {
         Types$PbAutoLapSettings.a(var2, this.automaticLapDuration_);
      } else {
         Types$PbAutoLapSettings.a(var2, (Types$PbDuration)this.automaticLapDurationBuilder_.build());
      }

      Types$PbAutoLapSettings.b(var2, var5);
      this.onBuilt();
      return var2;
   }

   public Types$PbAutoLapSettings$Builder clear() {
      super.clear();
      this.automaticLap_ = 1;
      this.bitField0_ &= -2;
      this.automaticLapDistance_ = 0.0F;
      this.bitField0_ &= -3;
      if (this.automaticLapDurationBuilder_ == null) {
         this.automaticLapDuration_ = null;
      } else {
         this.automaticLapDurationBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Types$PbAutoLapSettings$Builder clearAutomaticLap() {
      this.bitField0_ &= -2;
      this.automaticLap_ = 1;
      this.onChanged();
      return this;
   }

   public Types$PbAutoLapSettings$Builder clearAutomaticLapDistance() {
      this.bitField0_ &= -3;
      this.automaticLapDistance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Types$PbAutoLapSettings$Builder clearAutomaticLapDuration() {
      if (this.automaticLapDurationBuilder_ == null) {
         this.automaticLapDuration_ = null;
         this.onChanged();
      } else {
         this.automaticLapDurationBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Types$PbAutoLapSettings$Builder clearField(FieldDescriptor var1) {
      return (Types$PbAutoLapSettings$Builder)super.clearField(var1);
   }

   public Types$PbAutoLapSettings$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbAutoLapSettings$Builder)super.clearOneof(var1);
   }

   public Types$PbAutoLapSettings$Builder clone() {
      return (Types$PbAutoLapSettings$Builder)super.clone();
   }

   public Types$PbAutoLapSettings$PbAutomaticLap getAutomaticLap() {
      Types$PbAutoLapSettings$PbAutomaticLap var1 = Types$PbAutoLapSettings$PbAutomaticLap.valueOf(this.automaticLap_);
      Types$PbAutoLapSettings$PbAutomaticLap var2 = var1;
      if (var1 == null) {
         var2 = Types$PbAutoLapSettings$PbAutomaticLap.AUTOMATIC_LAP_OFF;
      }

      return var2;
   }

   public float getAutomaticLapDistance() {
      return this.automaticLapDistance_;
   }

   public Types$PbDuration getAutomaticLapDuration() {
      Types$PbDuration var1;
      if (this.automaticLapDurationBuilder_ == null) {
         if (this.automaticLapDuration_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.automaticLapDuration_;
         }
      } else {
         var1 = (Types$PbDuration)this.automaticLapDurationBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getAutomaticLapDurationBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getAutomaticLapDurationFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getAutomaticLapDurationOrBuilder() {
      Object var1;
      if (this.automaticLapDurationBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.automaticLapDurationBuilder_.getMessageOrBuilder();
      } else if (this.automaticLapDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.automaticLapDuration_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbAutoLapSettings getDefaultInstanceForType() {
      return Types$PbAutoLapSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.G();
   }

   public boolean hasAutomaticLap() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutomaticLapDistance() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutomaticLapDuration() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.H().ensureFieldAccessorsInitialized(Types$PbAutoLapSettings.class, Types$PbAutoLapSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasAutomaticLap()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Types$PbAutoLapSettings$Builder mergeAutomaticLapDuration(Types$PbDuration var1) {
      if (this.automaticLapDurationBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.automaticLapDuration_ != null && this.automaticLapDuration_ != Types$PbDuration.getDefaultInstance()) {
            this.automaticLapDuration_ = Types$PbDuration.newBuilder(this.automaticLapDuration_).mergeFrom(var1).buildPartial();
         } else {
            this.automaticLapDuration_ = var1;
         }

         this.onChanged();
      } else {
         this.automaticLapDurationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Types$PbAutoLapSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbAutoLapSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         Types$PbAutoLapSettings var14;
         try {
            var13 = (Types$PbAutoLapSettings)Types$PbAutoLapSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Types$PbAutoLapSettings)var10.getUnfinishedMessage();
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

   public Types$PbAutoLapSettings$Builder mergeFrom(Message var1) {
      Types$PbAutoLapSettings$Builder var2;
      if (var1 instanceof Types$PbAutoLapSettings) {
         var2 = this.mergeFrom((Types$PbAutoLapSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbAutoLapSettings$Builder mergeFrom(Types$PbAutoLapSettings var1) {
      if (var1 != Types$PbAutoLapSettings.getDefaultInstance()) {
         if (var1.hasAutomaticLap()) {
            this.setAutomaticLap(var1.getAutomaticLap());
         }

         if (var1.hasAutomaticLapDistance()) {
            this.setAutomaticLapDistance(var1.getAutomaticLapDistance());
         }

         if (var1.hasAutomaticLapDuration()) {
            this.mergeAutomaticLapDuration(var1.getAutomaticLapDuration());
         }

         this.mergeUnknownFields(Types$PbAutoLapSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbAutoLapSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbAutoLapSettings$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbAutoLapSettings$Builder setAutomaticLap(Types$PbAutoLapSettings$PbAutomaticLap var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.automaticLap_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Types$PbAutoLapSettings$Builder setAutomaticLapDistance(float var1) {
      this.bitField0_ |= 2;
      this.automaticLapDistance_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbAutoLapSettings$Builder setAutomaticLapDuration(Types$PbDuration$Builder var1) {
      if (this.automaticLapDurationBuilder_ == null) {
         this.automaticLapDuration_ = var1.build();
         this.onChanged();
      } else {
         this.automaticLapDurationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Types$PbAutoLapSettings$Builder setAutomaticLapDuration(Types$PbDuration var1) {
      if (this.automaticLapDurationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.automaticLapDuration_ = var1;
         this.onChanged();
      } else {
         this.automaticLapDurationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Types$PbAutoLapSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbAutoLapSettings$Builder)super.setField(var1, var2);
   }

   public Types$PbAutoLapSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbAutoLapSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Types$PbAutoLapSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbAutoLapSettings$Builder)super.setUnknownFields(var1);
   }
}
