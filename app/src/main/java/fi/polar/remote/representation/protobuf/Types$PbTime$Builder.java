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

public final class Types$PbTime$Builder extends Builder implements Types$PbTimeOrBuilder {
   private int bitField0_;
   private int hour_;
   private int millis_;
   private int minute_;
   private int seconds_;

   private Types$PbTime$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Types$PbTime$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbTime$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbTime$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.e();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbTime.b()) {
      }

   }

   public Types$PbTime$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbTime$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbTime build() {
      Types$PbTime var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbTime buildPartial() {
      byte var1 = 1;
      Types$PbTime var2 = new Types$PbTime(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbTime.a(var2, this.hour_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbTime.b(var2, this.minute_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      Types$PbTime.c(var2, this.seconds_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      Types$PbTime.d(var2, this.millis_);
      Types$PbTime.e(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Types$PbTime$Builder clear() {
      super.clear();
      this.hour_ = 0;
      this.bitField0_ &= -2;
      this.minute_ = 0;
      this.bitField0_ &= -3;
      this.seconds_ = 0;
      this.bitField0_ &= -5;
      this.millis_ = 0;
      this.bitField0_ &= -9;
      return this;
   }

   public Types$PbTime$Builder clearField(FieldDescriptor var1) {
      return (Types$PbTime$Builder)super.clearField(var1);
   }

   public Types$PbTime$Builder clearHour() {
      this.bitField0_ &= -2;
      this.hour_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbTime$Builder clearMillis() {
      this.bitField0_ &= -9;
      this.millis_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbTime$Builder clearMinute() {
      this.bitField0_ &= -3;
      this.minute_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbTime$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbTime$Builder)super.clearOneof(var1);
   }

   public Types$PbTime$Builder clearSeconds() {
      this.bitField0_ &= -5;
      this.seconds_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbTime$Builder clone() {
      return (Types$PbTime$Builder)super.clone();
   }

   public Types$PbTime getDefaultInstanceForType() {
      return Types$PbTime.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.e();
   }

   public int getHour() {
      return this.hour_;
   }

   public int getMillis() {
      return this.millis_;
   }

   public int getMinute() {
      return this.minute_;
   }

   public int getSeconds() {
      return this.seconds_;
   }

   public boolean hasHour() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMillis() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMinute() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSeconds() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.f().ensureFieldAccessorsInitialized(Types$PbTime.class, Types$PbTime$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasHour()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasMinute()) {
            var2 = var1;
            if (this.hasSeconds()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public Types$PbTime$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbTime var13;
      label96: {
         InvalidProtocolBufferException var12;
         Types$PbTime var14;
         try {
            var13 = (Types$PbTime)Types$PbTime.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Types$PbTime)var10.getUnfinishedMessage();
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

   public Types$PbTime$Builder mergeFrom(Message var1) {
      Types$PbTime$Builder var2;
      if (var1 instanceof Types$PbTime) {
         var2 = this.mergeFrom((Types$PbTime)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbTime$Builder mergeFrom(Types$PbTime var1) {
      if (var1 != Types$PbTime.getDefaultInstance()) {
         if (var1.hasHour()) {
            this.setHour(var1.getHour());
         }

         if (var1.hasMinute()) {
            this.setMinute(var1.getMinute());
         }

         if (var1.hasSeconds()) {
            this.setSeconds(var1.getSeconds());
         }

         if (var1.hasMillis()) {
            this.setMillis(var1.getMillis());
         }

         this.mergeUnknownFields(Types$PbTime.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbTime$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbTime$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbTime$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbTime$Builder)super.setField(var1, var2);
   }

   public Types$PbTime$Builder setHour(int var1) {
      this.bitField0_ |= 1;
      this.hour_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbTime$Builder setMillis(int var1) {
      this.bitField0_ |= 8;
      this.millis_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbTime$Builder setMinute(int var1) {
      this.bitField0_ |= 2;
      this.minute_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbTime$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbTime$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbTime$Builder setSeconds(int var1) {
      this.bitField0_ |= 4;
      this.seconds_ = var1;
      this.onChanged();
      return this;
   }

   public final Types$PbTime$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbTime$Builder)super.setUnknownFields(var1);
   }
}
