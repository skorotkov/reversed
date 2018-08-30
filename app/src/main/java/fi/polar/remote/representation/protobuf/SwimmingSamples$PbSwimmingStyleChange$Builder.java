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

public final class SwimmingSamples$PbSwimmingStyleChange$Builder extends Builder implements SwimmingSamples$PbSwimmingStyleChangeOrBuilder {
   private int bitField0_;
   private int style_;
   private SingleFieldBuilderV3 timestampBuilder_;
   private Types$PbDuration timestamp_;

   private SwimmingSamples$PbSwimmingStyleChange$Builder() {
      this.style_ = -1;
      this.timestamp_ = null;
      this.maybeForceBuilderInitialization();
   }

   private SwimmingSamples$PbSwimmingStyleChange$Builder(BuilderParent var1) {
      super(var1);
      this.style_ = -1;
      this.timestamp_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingStyleChange$Builder(BuilderParent var1, SwimmingSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingStyleChange$Builder(SwimmingSamples$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return SwimmingSamples.a();
   }

   private SingleFieldBuilderV3 getTimestampFieldBuilder() {
      if (this.timestampBuilder_ == null) {
         this.timestampBuilder_ = new SingleFieldBuilderV3(this.getTimestamp(), this.getParentForChildren(), this.isClean());
         this.timestamp_ = null;
      }

      return this.timestampBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SwimmingSamples$PbSwimmingStyleChange.b()) {
         this.getTimestampFieldBuilder();
      }

   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SwimmingSamples$PbSwimmingStyleChange$Builder)super.addRepeatedField(var1, var2);
   }

   public SwimmingSamples$PbSwimmingStyleChange build() {
      SwimmingSamples$PbSwimmingStyleChange var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SwimmingSamples$PbSwimmingStyleChange buildPartial() {
      int var1 = 1;
      SwimmingSamples$PbSwimmingStyleChange var2 = new SwimmingSamples$PbSwimmingStyleChange(this, (SwimmingSamples$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SwimmingSamples$PbSwimmingStyleChange.a(var2, this.style_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.timestampBuilder_ == null) {
         SwimmingSamples$PbSwimmingStyleChange.a(var2, this.timestamp_);
      } else {
         SwimmingSamples$PbSwimmingStyleChange.a(var2, (Types$PbDuration)this.timestampBuilder_.build());
      }

      SwimmingSamples$PbSwimmingStyleChange.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder clear() {
      super.clear();
      this.style_ = -1;
      this.bitField0_ &= -2;
      if (this.timestampBuilder_ == null) {
         this.timestamp_ = null;
      } else {
         this.timestampBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder clearField(FieldDescriptor var1) {
      return (SwimmingSamples$PbSwimmingStyleChange$Builder)super.clearField(var1);
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder clearOneof(OneofDescriptor var1) {
      return (SwimmingSamples$PbSwimmingStyleChange$Builder)super.clearOneof(var1);
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder clearStyle() {
      this.bitField0_ &= -2;
      this.style_ = -1;
      this.onChanged();
      return this;
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder clearTimestamp() {
      if (this.timestampBuilder_ == null) {
         this.timestamp_ = null;
         this.onChanged();
      } else {
         this.timestampBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder clone() {
      return (SwimmingSamples$PbSwimmingStyleChange$Builder)super.clone();
   }

   public SwimmingSamples$PbSwimmingStyleChange getDefaultInstanceForType() {
      return SwimmingSamples$PbSwimmingStyleChange.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SwimmingSamples.a();
   }

   public Types$PbSwimmingStyle getStyle() {
      Types$PbSwimmingStyle var1 = Types$PbSwimmingStyle.valueOf(this.style_);
      Types$PbSwimmingStyle var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSwimmingStyle.OTHER;
      }

      return var2;
   }

   public Types$PbDuration getTimestamp() {
      Types$PbDuration var1;
      if (this.timestampBuilder_ == null) {
         if (this.timestamp_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timestamp_;
         }
      } else {
         var1 = (Types$PbDuration)this.timestampBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimestampBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimestampFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimestampOrBuilder() {
      Object var1;
      if (this.timestampBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timestampBuilder_.getMessageOrBuilder();
      } else if (this.timestamp_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timestamp_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public boolean hasStyle() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimestamp() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SwimmingSamples.b().ensureFieldAccessorsInitialized(SwimmingSamples$PbSwimmingStyleChange.class, SwimmingSamples$PbSwimmingStyleChange$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasStyle() && this.hasTimestamp()) {
         var1 = true;
      }

      return var1;
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SwimmingSamples$PbSwimmingStyleChange var13;
      label96: {
         InvalidProtocolBufferException var12;
         SwimmingSamples$PbSwimmingStyleChange var14;
         try {
            var13 = (SwimmingSamples$PbSwimmingStyleChange)SwimmingSamples$PbSwimmingStyleChange.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SwimmingSamples$PbSwimmingStyleChange)var10.getUnfinishedMessage();
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

   public SwimmingSamples$PbSwimmingStyleChange$Builder mergeFrom(Message var1) {
      SwimmingSamples$PbSwimmingStyleChange$Builder var2;
      if (var1 instanceof SwimmingSamples$PbSwimmingStyleChange) {
         var2 = this.mergeFrom((SwimmingSamples$PbSwimmingStyleChange)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder mergeFrom(SwimmingSamples$PbSwimmingStyleChange var1) {
      if (var1 != SwimmingSamples$PbSwimmingStyleChange.getDefaultInstance()) {
         if (var1.hasStyle()) {
            this.setStyle(var1.getStyle());
         }

         if (var1.hasTimestamp()) {
            this.mergeTimestamp(var1.getTimestamp());
         }

         this.mergeUnknownFields(SwimmingSamples$PbSwimmingStyleChange.a(var1));
         this.onChanged();
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder mergeTimestamp(Types$PbDuration var1) {
      if (this.timestampBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.timestamp_ != null && this.timestamp_ != Types$PbDuration.getDefaultInstance()) {
            this.timestamp_ = Types$PbDuration.newBuilder(this.timestamp_).mergeFrom(var1).buildPartial();
         } else {
            this.timestamp_ = var1;
         }

         this.onChanged();
      } else {
         this.timestampBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final SwimmingSamples$PbSwimmingStyleChange$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SwimmingSamples$PbSwimmingStyleChange$Builder)super.mergeUnknownFields(var1);
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder setField(FieldDescriptor var1, Object var2) {
      return (SwimmingSamples$PbSwimmingStyleChange$Builder)super.setField(var1, var2);
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SwimmingSamples$PbSwimmingStyleChange$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder setStyle(Types$PbSwimmingStyle var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.style_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder setTimestamp(Types$PbDuration$Builder var1) {
      if (this.timestampBuilder_ == null) {
         this.timestamp_ = var1.build();
         this.onChanged();
      } else {
         this.timestampBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder setTimestamp(Types$PbDuration var1) {
      if (this.timestampBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timestamp_ = var1;
         this.onChanged();
      } else {
         this.timestampBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final SwimmingSamples$PbSwimmingStyleChange$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SwimmingSamples$PbSwimmingStyleChange$Builder)super.setUnknownFields(var1);
   }
}
