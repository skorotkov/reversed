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

public final class Types$PbSampleSource$Builder extends Builder implements Types$PbSampleSourceOrBuilder {
   private int bitField0_;
   private int sampleSourceType_;
   private int startIndex_;
   private int stopIndex_;

   private Types$PbSampleSource$Builder() {
      this.sampleSourceType_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Types$PbSampleSource$Builder(BuilderParent var1) {
      super(var1);
      this.sampleSourceType_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbSampleSource$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbSampleSource$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.w();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbSampleSource.b()) {
      }

   }

   public Types$PbSampleSource$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbSampleSource$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbSampleSource build() {
      Types$PbSampleSource var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbSampleSource buildPartial() {
      byte var1 = 1;
      Types$PbSampleSource var2 = new Types$PbSampleSource(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbSampleSource.a(var2, this.sampleSourceType_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbSampleSource.b(var2, this.startIndex_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      Types$PbSampleSource.c(var2, this.stopIndex_);
      Types$PbSampleSource.d(var2, var5);
      this.onBuilt();
      return var2;
   }

   public Types$PbSampleSource$Builder clear() {
      super.clear();
      this.sampleSourceType_ = 0;
      this.bitField0_ &= -2;
      this.startIndex_ = 0;
      this.bitField0_ &= -3;
      this.stopIndex_ = 0;
      this.bitField0_ &= -5;
      return this;
   }

   public Types$PbSampleSource$Builder clearField(FieldDescriptor var1) {
      return (Types$PbSampleSource$Builder)super.clearField(var1);
   }

   public Types$PbSampleSource$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbSampleSource$Builder)super.clearOneof(var1);
   }

   public Types$PbSampleSource$Builder clearSampleSourceType() {
      this.bitField0_ &= -2;
      this.sampleSourceType_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbSampleSource$Builder clearStartIndex() {
      this.bitField0_ &= -3;
      this.startIndex_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbSampleSource$Builder clearStopIndex() {
      this.bitField0_ &= -5;
      this.stopIndex_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbSampleSource$Builder clone() {
      return (Types$PbSampleSource$Builder)super.clone();
   }

   public Types$PbSampleSource getDefaultInstanceForType() {
      return Types$PbSampleSource.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.w();
   }

   public Types$PbSampleSourceType getSampleSourceType() {
      Types$PbSampleSourceType var1 = Types$PbSampleSourceType.valueOf(this.sampleSourceType_);
      Types$PbSampleSourceType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSampleSourceType.SAMPLE_SOURCE_TYPE_UNDEFINED;
      }

      return var2;
   }

   public int getStartIndex() {
      return this.startIndex_;
   }

   public int getStopIndex() {
      return this.stopIndex_;
   }

   public boolean hasSampleSourceType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartIndex() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStopIndex() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.x().ensureFieldAccessorsInitialized(Types$PbSampleSource.class, Types$PbSampleSource$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasSampleSourceType()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasStartIndex()) {
            var2 = var1;
            if (this.hasStopIndex()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public Types$PbSampleSource$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbSampleSource var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (Types$PbSampleSource)Types$PbSampleSource.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (Types$PbSampleSource)var11.getUnfinishedMessage();
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

   public Types$PbSampleSource$Builder mergeFrom(Message var1) {
      Types$PbSampleSource$Builder var2;
      if (var1 instanceof Types$PbSampleSource) {
         var2 = this.mergeFrom((Types$PbSampleSource)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbSampleSource$Builder mergeFrom(Types$PbSampleSource var1) {
      if (var1 != Types$PbSampleSource.getDefaultInstance()) {
         if (var1.hasSampleSourceType()) {
            this.setSampleSourceType(var1.getSampleSourceType());
         }

         if (var1.hasStartIndex()) {
            this.setStartIndex(var1.getStartIndex());
         }

         if (var1.hasStopIndex()) {
            this.setStopIndex(var1.getStopIndex());
         }

         this.mergeUnknownFields(Types$PbSampleSource.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbSampleSource$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbSampleSource$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbSampleSource$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbSampleSource$Builder)super.setField(var1, var2);
   }

   public Types$PbSampleSource$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbSampleSource$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbSampleSource$Builder setSampleSourceType(Types$PbSampleSourceType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.sampleSourceType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Types$PbSampleSource$Builder setStartIndex(int var1) {
      this.bitField0_ |= 2;
      this.startIndex_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbSampleSource$Builder setStopIndex(int var1) {
      this.bitField0_ |= 4;
      this.stopIndex_ = var1;
      this.onChanged();
      return this;
   }

   public final Types$PbSampleSource$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbSampleSource$Builder)super.setUnknownFields(var1);
   }
}
