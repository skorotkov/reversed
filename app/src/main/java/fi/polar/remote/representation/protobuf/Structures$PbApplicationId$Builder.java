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

public final class Structures$PbApplicationId$Builder extends Builder implements Structures$PbApplicationIdOrBuilder {
   private int bitField0_;
   private long value_;

   private Structures$PbApplicationId$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbApplicationId$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbApplicationId$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbApplicationId$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.U();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbApplicationId.b()) {
      }

   }

   public Structures$PbApplicationId$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbApplicationId$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbApplicationId build() {
      Structures$PbApplicationId var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbApplicationId buildPartial() {
      byte var1 = 1;
      Structures$PbApplicationId var2 = new Structures$PbApplicationId(this, (Structures$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Structures$PbApplicationId.a(var2, this.value_);
      Structures$PbApplicationId.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbApplicationId$Builder clear() {
      super.clear();
      this.value_ = 0L;
      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbApplicationId$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbApplicationId$Builder)super.clearField(var1);
   }

   public Structures$PbApplicationId$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbApplicationId$Builder)super.clearOneof(var1);
   }

   public Structures$PbApplicationId$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 0L;
      this.onChanged();
      return this;
   }

   public Structures$PbApplicationId$Builder clone() {
      return (Structures$PbApplicationId$Builder)super.clone();
   }

   public Structures$PbApplicationId getDefaultInstanceForType() {
      return Structures$PbApplicationId.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.U();
   }

   public long getValue() {
      return this.value_;
   }

   public boolean hasValue() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.V().ensureFieldAccessorsInitialized(Structures$PbApplicationId.class, Structures$PbApplicationId$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasValue()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbApplicationId$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbApplicationId var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbApplicationId)Structures$PbApplicationId.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbApplicationId)var10.getUnfinishedMessage();
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

   public Structures$PbApplicationId$Builder mergeFrom(Message var1) {
      Structures$PbApplicationId$Builder var2;
      if (var1 instanceof Structures$PbApplicationId) {
         var2 = this.mergeFrom((Structures$PbApplicationId)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbApplicationId$Builder mergeFrom(Structures$PbApplicationId var1) {
      if (var1 != Structures$PbApplicationId.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         this.mergeUnknownFields(Structures$PbApplicationId.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbApplicationId$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbApplicationId$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbApplicationId$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbApplicationId$Builder)super.setField(var1, var2);
   }

   public Structures$PbApplicationId$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbApplicationId$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbApplicationId$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbApplicationId$Builder)super.setUnknownFields(var1);
   }

   public Structures$PbApplicationId$Builder setValue(long var1) {
      this.bitField0_ |= 1;
      this.value_ = var1;
      this.onChanged();
      return this;
   }
}
