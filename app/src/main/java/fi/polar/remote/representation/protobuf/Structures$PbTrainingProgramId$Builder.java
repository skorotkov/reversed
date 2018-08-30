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

public final class Structures$PbTrainingProgramId$Builder extends Builder implements Structures$PbTrainingProgramIdOrBuilder {
   private int bitField0_;
   private long value_;

   private Structures$PbTrainingProgramId$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbTrainingProgramId$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbTrainingProgramId$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbTrainingProgramId$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.O();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbTrainingProgramId.b()) {
      }

   }

   public Structures$PbTrainingProgramId$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbTrainingProgramId$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbTrainingProgramId build() {
      Structures$PbTrainingProgramId var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbTrainingProgramId buildPartial() {
      byte var1 = 1;
      Structures$PbTrainingProgramId var2 = new Structures$PbTrainingProgramId(this, (Structures$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Structures$PbTrainingProgramId.a(var2, this.value_);
      Structures$PbTrainingProgramId.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbTrainingProgramId$Builder clear() {
      super.clear();
      this.value_ = 0L;
      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbTrainingProgramId$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbTrainingProgramId$Builder)super.clearField(var1);
   }

   public Structures$PbTrainingProgramId$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbTrainingProgramId$Builder)super.clearOneof(var1);
   }

   public Structures$PbTrainingProgramId$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 0L;
      this.onChanged();
      return this;
   }

   public Structures$PbTrainingProgramId$Builder clone() {
      return (Structures$PbTrainingProgramId$Builder)super.clone();
   }

   public Structures$PbTrainingProgramId getDefaultInstanceForType() {
      return Structures$PbTrainingProgramId.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.O();
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
      return Structures.P().ensureFieldAccessorsInitialized(Structures$PbTrainingProgramId.class, Structures$PbTrainingProgramId$Builder.class);
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

   public Structures$PbTrainingProgramId$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbTrainingProgramId var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbTrainingProgramId var14;
         try {
            var13 = (Structures$PbTrainingProgramId)Structures$PbTrainingProgramId.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbTrainingProgramId)var10.getUnfinishedMessage();
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

   public Structures$PbTrainingProgramId$Builder mergeFrom(Message var1) {
      Structures$PbTrainingProgramId$Builder var2;
      if (var1 instanceof Structures$PbTrainingProgramId) {
         var2 = this.mergeFrom((Structures$PbTrainingProgramId)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbTrainingProgramId$Builder mergeFrom(Structures$PbTrainingProgramId var1) {
      if (var1 != Structures$PbTrainingProgramId.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         this.mergeUnknownFields(Structures$PbTrainingProgramId.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbTrainingProgramId$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbTrainingProgramId$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbTrainingProgramId$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbTrainingProgramId$Builder)super.setField(var1, var2);
   }

   public Structures$PbTrainingProgramId$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbTrainingProgramId$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbTrainingProgramId$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbTrainingProgramId$Builder)super.setUnknownFields(var1);
   }

   public Structures$PbTrainingProgramId$Builder setValue(long var1) {
      this.bitField0_ |= 1;
      this.value_ = var1;
      this.onChanged();
      return this;
   }
}
