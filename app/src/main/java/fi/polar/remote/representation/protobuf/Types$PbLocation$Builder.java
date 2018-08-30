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

public final class Types$PbLocation$Builder extends Builder implements Types$PbLocationOrBuilder {
   private int bitField0_;
   private int fix_;
   private double latitude_;
   private double longitude_;
   private int satellites_;
   private SingleFieldBuilderV3 timestampBuilder_;
   private Types$PbSystemDateTime timestamp_;

   private Types$PbLocation$Builder() {
      this.timestamp_ = null;
      this.fix_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Types$PbLocation$Builder(BuilderParent var1) {
      super(var1);
      this.timestamp_ = null;
      this.fix_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbLocation$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbLocation$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.m();
   }

   private SingleFieldBuilderV3 getTimestampFieldBuilder() {
      if (this.timestampBuilder_ == null) {
         this.timestampBuilder_ = new SingleFieldBuilderV3(this.getTimestamp(), this.getParentForChildren(), this.isClean());
         this.timestamp_ = null;
      }

      return this.timestampBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbLocation.b()) {
         this.getTimestampFieldBuilder();
      }

   }

   public Types$PbLocation$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbLocation$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbLocation build() {
      Types$PbLocation var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbLocation buildPartial() {
      byte var1 = 1;
      Types$PbLocation var2 = new Types$PbLocation(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbLocation.a(var2, this.latitude_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbLocation.b(var2, this.longitude_);
      if ((var3 & 4) == 4) {
         var4 |= 4;
      }

      if (this.timestampBuilder_ == null) {
         Types$PbLocation.a(var2, this.timestamp_);
      } else {
         Types$PbLocation.a(var2, (Types$PbSystemDateTime)this.timestampBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 8) == 8) {
         var5 = var4 | 8;
      }

      Types$PbLocation.a(var2, this.fix_);
      var4 = var5;
      if ((var3 & 16) == 16) {
         var4 = var5 | 16;
      }

      Types$PbLocation.b(var2, this.satellites_);
      Types$PbLocation.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Types$PbLocation$Builder clear() {
      super.clear();
      this.latitude_ = 0.0D;
      this.bitField0_ &= -2;
      this.longitude_ = 0.0D;
      this.bitField0_ &= -3;
      if (this.timestampBuilder_ == null) {
         this.timestamp_ = null;
      } else {
         this.timestampBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.fix_ = 0;
      this.bitField0_ &= -9;
      this.satellites_ = 0;
      this.bitField0_ &= -17;
      return this;
   }

   public Types$PbLocation$Builder clearField(FieldDescriptor var1) {
      return (Types$PbLocation$Builder)super.clearField(var1);
   }

   public Types$PbLocation$Builder clearFix() {
      this.bitField0_ &= -9;
      this.fix_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbLocation$Builder clearLatitude() {
      this.bitField0_ &= -2;
      this.latitude_ = 0.0D;
      this.onChanged();
      return this;
   }

   public Types$PbLocation$Builder clearLongitude() {
      this.bitField0_ &= -3;
      this.longitude_ = 0.0D;
      this.onChanged();
      return this;
   }

   public Types$PbLocation$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbLocation$Builder)super.clearOneof(var1);
   }

   public Types$PbLocation$Builder clearSatellites() {
      this.bitField0_ &= -17;
      this.satellites_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbLocation$Builder clearTimestamp() {
      if (this.timestampBuilder_ == null) {
         this.timestamp_ = null;
         this.onChanged();
      } else {
         this.timestampBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Types$PbLocation$Builder clone() {
      return (Types$PbLocation$Builder)super.clone();
   }

   public Types$PbLocation getDefaultInstanceForType() {
      return Types$PbLocation.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.m();
   }

   public Types$PbLocation$Fix getFix() {
      Types$PbLocation$Fix var1 = Types$PbLocation$Fix.valueOf(this.fix_);
      Types$PbLocation$Fix var2 = var1;
      if (var1 == null) {
         var2 = Types$PbLocation$Fix.FIX_NONE;
      }

      return var2;
   }

   public double getLatitude() {
      return this.latitude_;
   }

   public double getLongitude() {
      return this.longitude_;
   }

   public int getSatellites() {
      return this.satellites_;
   }

   public Types$PbSystemDateTime getTimestamp() {
      Types$PbSystemDateTime var1;
      if (this.timestampBuilder_ == null) {
         if (this.timestamp_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.timestamp_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.timestampBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getTimestampBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getTimestampFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getTimestampOrBuilder() {
      Object var1;
      if (this.timestampBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.timestampBuilder_.getMessageOrBuilder();
      } else if (this.timestamp_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.timestamp_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public boolean hasFix() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLatitude() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLongitude() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSatellites() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimestamp() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.n().ensureFieldAccessorsInitialized(Types$PbLocation.class, Types$PbLocation$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasLatitude()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasLongitude()) {
            if (this.hasTimestamp()) {
               var2 = var1;
               if (!this.getTimestamp().isInitialized()) {
                  return var2;
               }
            }

            var2 = true;
         }
      }

      return var2;
   }

   public Types$PbLocation$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbLocation var13;
      label96: {
         InvalidProtocolBufferException var12;
         Types$PbLocation var14;
         try {
            var13 = (Types$PbLocation)Types$PbLocation.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Types$PbLocation)var10.getUnfinishedMessage();
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

   public Types$PbLocation$Builder mergeFrom(Message var1) {
      Types$PbLocation$Builder var2;
      if (var1 instanceof Types$PbLocation) {
         var2 = this.mergeFrom((Types$PbLocation)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbLocation$Builder mergeFrom(Types$PbLocation var1) {
      if (var1 != Types$PbLocation.getDefaultInstance()) {
         if (var1.hasLatitude()) {
            this.setLatitude(var1.getLatitude());
         }

         if (var1.hasLongitude()) {
            this.setLongitude(var1.getLongitude());
         }

         if (var1.hasTimestamp()) {
            this.mergeTimestamp(var1.getTimestamp());
         }

         if (var1.hasFix()) {
            this.setFix(var1.getFix());
         }

         if (var1.hasSatellites()) {
            this.setSatellites(var1.getSatellites());
         }

         this.mergeUnknownFields(Types$PbLocation.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Types$PbLocation$Builder mergeTimestamp(Types$PbSystemDateTime var1) {
      if (this.timestampBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.timestamp_ != null && this.timestamp_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.timestamp_ = Types$PbSystemDateTime.newBuilder(this.timestamp_).mergeFrom(var1).buildPartial();
         } else {
            this.timestamp_ = var1;
         }

         this.onChanged();
      } else {
         this.timestampBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final Types$PbLocation$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbLocation$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbLocation$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbLocation$Builder)super.setField(var1, var2);
   }

   public Types$PbLocation$Builder setFix(Types$PbLocation$Fix var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.fix_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Types$PbLocation$Builder setLatitude(double var1) {
      this.bitField0_ |= 1;
      this.latitude_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbLocation$Builder setLongitude(double var1) {
      this.bitField0_ |= 2;
      this.longitude_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbLocation$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbLocation$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbLocation$Builder setSatellites(int var1) {
      this.bitField0_ |= 16;
      this.satellites_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbLocation$Builder setTimestamp(Types$PbSystemDateTime$Builder var1) {
      if (this.timestampBuilder_ == null) {
         this.timestamp_ = var1.build();
         this.onChanged();
      } else {
         this.timestampBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Types$PbLocation$Builder setTimestamp(Types$PbSystemDateTime var1) {
      if (this.timestampBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timestamp_ = var1;
         this.onChanged();
      } else {
         this.timestampBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final Types$PbLocation$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbLocation$Builder)super.setUnknownFields(var1);
   }
}
