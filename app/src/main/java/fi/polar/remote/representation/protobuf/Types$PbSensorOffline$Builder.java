package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Types$PbSensorOffline$Builder extends Builder implements Types$PbSensorOfflineOrBuilder {
   private int bitField0_;
   private int startIndex_;
   private int stopIndex_;

   private Types$PbSensorOffline$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Types$PbSensorOffline$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbSensorOffline$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbSensorOffline$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.o();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbSensorOffline.b()) {
      }

   }

   public Types$PbSensorOffline$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbSensorOffline$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbSensorOffline build() {
      Types$PbSensorOffline var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbSensorOffline buildPartial() {
      byte var1 = 1;
      Types$PbSensorOffline var2 = new Types$PbSensorOffline(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbSensorOffline.a(var2, this.startIndex_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbSensorOffline.b(var2, this.stopIndex_);
      Types$PbSensorOffline.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Types$PbSensorOffline$Builder clear() {
      super.clear();
      this.startIndex_ = 0;
      this.bitField0_ &= -2;
      this.stopIndex_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public Types$PbSensorOffline$Builder clearField(FieldDescriptor var1) {
      return (Types$PbSensorOffline$Builder)super.clearField(var1);
   }

   public Types$PbSensorOffline$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbSensorOffline$Builder)super.clearOneof(var1);
   }

   public Types$PbSensorOffline$Builder clearStartIndex() {
      this.bitField0_ &= -2;
      this.startIndex_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbSensorOffline$Builder clearStopIndex() {
      this.bitField0_ &= -3;
      this.stopIndex_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbSensorOffline$Builder clone() {
      return (Types$PbSensorOffline$Builder)super.clone();
   }

   public Types$PbSensorOffline getDefaultInstanceForType() {
      return Types$PbSensorOffline.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.o();
   }

   public int getStartIndex() {
      return this.startIndex_;
   }

   public int getStopIndex() {
      return this.stopIndex_;
   }

   public boolean hasStartIndex() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStopIndex() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.p().ensureFieldAccessorsInitialized(Types$PbSensorOffline.class, Types$PbSensorOffline$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasStartIndex() && this.hasStopIndex()) {
         var1 = true;
      }

      return var1;
   }

   public Types$PbSensorOffline$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbSensorOffline var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Types$PbSensorOffline)Types$PbSensorOffline.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Types$PbSensorOffline)var10.getUnfinishedMessage();
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

   public Types$PbSensorOffline$Builder mergeFrom(Message var1) {
      Types$PbSensorOffline$Builder var2;
      if (var1 instanceof Types$PbSensorOffline) {
         var2 = this.mergeFrom((Types$PbSensorOffline)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder mergeFrom(Types$PbSensorOffline var1) {
      if (var1 != Types$PbSensorOffline.getDefaultInstance()) {
         if (var1.hasStartIndex()) {
            this.setStartIndex(var1.getStartIndex());
         }

         if (var1.hasStopIndex()) {
            this.setStopIndex(var1.getStopIndex());
         }

         this.mergeUnknownFields(Types$PbSensorOffline.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbSensorOffline$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbSensorOffline$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbSensorOffline$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbSensorOffline$Builder)super.setField(var1, var2);
   }

   public Types$PbSensorOffline$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbSensorOffline$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbSensorOffline$Builder setStartIndex(int var1) {
      this.bitField0_ |= 1;
      this.startIndex_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbSensorOffline$Builder setStopIndex(int var1) {
      this.bitField0_ |= 2;
      this.stopIndex_ = var1;
      this.onChanged();
      return this;
   }

   public final Types$PbSensorOffline$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbSensorOffline$Builder)super.setUnknownFields(var1);
   }
}
