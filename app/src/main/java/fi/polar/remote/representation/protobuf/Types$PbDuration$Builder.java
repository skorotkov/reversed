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

public final class Types$PbDuration$Builder extends Builder implements Types$PbDurationOrBuilder {
   private int bitField0_;
   private int hours_;
   private int millis_;
   private int minutes_;
   private int seconds_;

   private Types$PbDuration$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Types$PbDuration$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbDuration$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbDuration$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.k();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbDuration.b()) {
      }

   }

   public Types$PbDuration$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbDuration$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbDuration build() {
      Types$PbDuration var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbDuration buildPartial() {
      byte var1 = 1;
      Types$PbDuration var2 = new Types$PbDuration(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbDuration.a(var2, this.hours_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbDuration.b(var2, this.minutes_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      Types$PbDuration.c(var2, this.seconds_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      Types$PbDuration.d(var2, this.millis_);
      Types$PbDuration.e(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Types$PbDuration$Builder clear() {
      super.clear();
      this.hours_ = 0;
      this.bitField0_ &= -2;
      this.minutes_ = 0;
      this.bitField0_ &= -3;
      this.seconds_ = 0;
      this.bitField0_ &= -5;
      this.millis_ = 0;
      this.bitField0_ &= -9;
      return this;
   }

   public Types$PbDuration$Builder clearField(FieldDescriptor var1) {
      return (Types$PbDuration$Builder)super.clearField(var1);
   }

   public Types$PbDuration$Builder clearHours() {
      this.bitField0_ &= -2;
      this.hours_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbDuration$Builder clearMillis() {
      this.bitField0_ &= -9;
      this.millis_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbDuration$Builder clearMinutes() {
      this.bitField0_ &= -3;
      this.minutes_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbDuration$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbDuration$Builder)super.clearOneof(var1);
   }

   public Types$PbDuration$Builder clearSeconds() {
      this.bitField0_ &= -5;
      this.seconds_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbDuration$Builder clone() {
      return (Types$PbDuration$Builder)super.clone();
   }

   public Types$PbDuration getDefaultInstanceForType() {
      return Types$PbDuration.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.k();
   }

   public int getHours() {
      return this.hours_;
   }

   public int getMillis() {
      return this.millis_;
   }

   public int getMinutes() {
      return this.minutes_;
   }

   public int getSeconds() {
      return this.seconds_;
   }

   public boolean hasHours() {
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

   public boolean hasMinutes() {
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
      return Types.l().ensureFieldAccessorsInitialized(Types$PbDuration.class, Types$PbDuration$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public Types$PbDuration$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbDuration var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Types$PbDuration)Types$PbDuration.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Types$PbDuration)var10.getUnfinishedMessage();
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

   public Types$PbDuration$Builder mergeFrom(Message var1) {
      Types$PbDuration$Builder var2;
      if (var1 instanceof Types$PbDuration) {
         var2 = this.mergeFrom((Types$PbDuration)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbDuration$Builder mergeFrom(Types$PbDuration var1) {
      if (var1 != Types$PbDuration.getDefaultInstance()) {
         if (var1.hasHours()) {
            this.setHours(var1.getHours());
         }

         if (var1.hasMinutes()) {
            this.setMinutes(var1.getMinutes());
         }

         if (var1.hasSeconds()) {
            this.setSeconds(var1.getSeconds());
         }

         if (var1.hasMillis()) {
            this.setMillis(var1.getMillis());
         }

         this.mergeUnknownFields(Types$PbDuration.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbDuration$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbDuration$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbDuration$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbDuration$Builder)super.setField(var1, var2);
   }

   public Types$PbDuration$Builder setHours(int var1) {
      this.bitField0_ |= 1;
      this.hours_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbDuration$Builder setMillis(int var1) {
      this.bitField0_ |= 8;
      this.millis_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbDuration$Builder setMinutes(int var1) {
      this.bitField0_ |= 2;
      this.minutes_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbDuration$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbDuration$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbDuration$Builder setSeconds(int var1) {
      this.bitField0_ |= 4;
      this.seconds_ = var1;
      this.onChanged();
      return this;
   }

   public final Types$PbDuration$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbDuration$Builder)super.setUnknownFields(var1);
   }
}
