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

public final class Types$PbRangeOptions$Builder extends Builder implements Types$PbRangeOptionsOrBuilder {
   private int bitField0_;
   private int maxValue_;
   private int minValue_;

   private Types$PbRangeOptions$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Types$PbRangeOptions$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbRangeOptions$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbRangeOptions$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.a();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbRangeOptions.b()) {
      }

   }

   public Types$PbRangeOptions$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbRangeOptions$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbRangeOptions build() {
      Types$PbRangeOptions var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbRangeOptions buildPartial() {
      byte var1 = 1;
      Types$PbRangeOptions var2 = new Types$PbRangeOptions(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbRangeOptions.a(var2, this.minValue_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbRangeOptions.b(var2, this.maxValue_);
      Types$PbRangeOptions.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Types$PbRangeOptions$Builder clear() {
      super.clear();
      this.minValue_ = 0;
      this.bitField0_ &= -2;
      this.maxValue_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public Types$PbRangeOptions$Builder clearField(FieldDescriptor var1) {
      return (Types$PbRangeOptions$Builder)super.clearField(var1);
   }

   public Types$PbRangeOptions$Builder clearMaxValue() {
      this.bitField0_ &= -3;
      this.maxValue_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbRangeOptions$Builder clearMinValue() {
      this.bitField0_ &= -2;
      this.minValue_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbRangeOptions$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbRangeOptions$Builder)super.clearOneof(var1);
   }

   public Types$PbRangeOptions$Builder clone() {
      return (Types$PbRangeOptions$Builder)super.clone();
   }

   public Types$PbRangeOptions getDefaultInstanceForType() {
      return Types$PbRangeOptions.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.a();
   }

   public int getMaxValue() {
      return this.maxValue_;
   }

   public int getMinValue() {
      return this.minValue_;
   }

   public boolean hasMaxValue() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMinValue() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.b().ensureFieldAccessorsInitialized(Types$PbRangeOptions.class, Types$PbRangeOptions$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public Types$PbRangeOptions$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbRangeOptions var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (Types$PbRangeOptions)Types$PbRangeOptions.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (Types$PbRangeOptions)var11.getUnfinishedMessage();
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

   public Types$PbRangeOptions$Builder mergeFrom(Message var1) {
      Types$PbRangeOptions$Builder var2;
      if (var1 instanceof Types$PbRangeOptions) {
         var2 = this.mergeFrom((Types$PbRangeOptions)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbRangeOptions$Builder mergeFrom(Types$PbRangeOptions var1) {
      if (var1 != Types$PbRangeOptions.getDefaultInstance()) {
         if (var1.hasMinValue()) {
            this.setMinValue(var1.getMinValue());
         }

         if (var1.hasMaxValue()) {
            this.setMaxValue(var1.getMaxValue());
         }

         this.mergeUnknownFields(Types$PbRangeOptions.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbRangeOptions$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbRangeOptions$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbRangeOptions$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbRangeOptions$Builder)super.setField(var1, var2);
   }

   public Types$PbRangeOptions$Builder setMaxValue(int var1) {
      this.bitField0_ |= 2;
      this.maxValue_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbRangeOptions$Builder setMinValue(int var1) {
      this.bitField0_ |= 1;
      this.minValue_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbRangeOptions$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbRangeOptions$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Types$PbRangeOptions$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbRangeOptions$Builder)super.setUnknownFields(var1);
   }
}
