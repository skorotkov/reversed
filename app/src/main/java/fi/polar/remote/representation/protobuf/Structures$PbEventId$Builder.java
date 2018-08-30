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

public final class Structures$PbEventId$Builder extends Builder implements Structures$PbEventIdOrBuilder {
   private int bitField0_;
   private long value_;

   private Structures$PbEventId$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbEventId$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbEventId$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbEventId$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.Q();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbEventId.b()) {
      }

   }

   public Structures$PbEventId$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbEventId$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbEventId build() {
      Structures$PbEventId var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbEventId buildPartial() {
      byte var1 = 1;
      Structures$PbEventId var2 = new Structures$PbEventId(this, (Structures$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Structures$PbEventId.a(var2, this.value_);
      Structures$PbEventId.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbEventId$Builder clear() {
      super.clear();
      this.value_ = 0L;
      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbEventId$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbEventId$Builder)super.clearField(var1);
   }

   public Structures$PbEventId$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbEventId$Builder)super.clearOneof(var1);
   }

   public Structures$PbEventId$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 0L;
      this.onChanged();
      return this;
   }

   public Structures$PbEventId$Builder clone() {
      return (Structures$PbEventId$Builder)super.clone();
   }

   public Structures$PbEventId getDefaultInstanceForType() {
      return Structures$PbEventId.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.Q();
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
      return Structures.R().ensureFieldAccessorsInitialized(Structures$PbEventId.class, Structures$PbEventId$Builder.class);
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

   public Structures$PbEventId$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbEventId var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbEventId var14;
         try {
            var13 = (Structures$PbEventId)Structures$PbEventId.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbEventId)var10.getUnfinishedMessage();
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

   public Structures$PbEventId$Builder mergeFrom(Message var1) {
      Structures$PbEventId$Builder var2;
      if (var1 instanceof Structures$PbEventId) {
         var2 = this.mergeFrom((Structures$PbEventId)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbEventId$Builder mergeFrom(Structures$PbEventId var1) {
      if (var1 != Structures$PbEventId.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         this.mergeUnknownFields(Structures$PbEventId.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbEventId$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbEventId$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbEventId$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbEventId$Builder)super.setField(var1, var2);
   }

   public Structures$PbEventId$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbEventId$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbEventId$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbEventId$Builder)super.setUnknownFields(var1);
   }

   public Structures$PbEventId$Builder setValue(long var1) {
      this.bitField0_ |= 1;
      this.value_ = var1;
      this.onChanged();
      return this;
   }
}