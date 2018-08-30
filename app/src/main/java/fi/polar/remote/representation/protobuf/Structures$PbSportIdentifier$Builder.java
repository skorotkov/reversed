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

public final class Structures$PbSportIdentifier$Builder extends Builder implements Structures$PbSportIdentifierOrBuilder {
   private int bitField0_;
   private long value_;

   private Structures$PbSportIdentifier$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbSportIdentifier$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbSportIdentifier$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbSportIdentifier$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.y();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbSportIdentifier.b()) {
      }

   }

   public Structures$PbSportIdentifier$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbSportIdentifier$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbSportIdentifier build() {
      Structures$PbSportIdentifier var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbSportIdentifier buildPartial() {
      byte var1 = 1;
      Structures$PbSportIdentifier var2 = new Structures$PbSportIdentifier(this, (Structures$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Structures$PbSportIdentifier.a(var2, this.value_);
      Structures$PbSportIdentifier.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbSportIdentifier$Builder clear() {
      super.clear();
      this.value_ = 0L;
      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbSportIdentifier$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbSportIdentifier$Builder)super.clearField(var1);
   }

   public Structures$PbSportIdentifier$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbSportIdentifier$Builder)super.clearOneof(var1);
   }

   public Structures$PbSportIdentifier$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 0L;
      this.onChanged();
      return this;
   }

   public Structures$PbSportIdentifier$Builder clone() {
      return (Structures$PbSportIdentifier$Builder)super.clone();
   }

   public Structures$PbSportIdentifier getDefaultInstanceForType() {
      return Structures$PbSportIdentifier.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.y();
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
      return Structures.z().ensureFieldAccessorsInitialized(Structures$PbSportIdentifier.class, Structures$PbSportIdentifier$Builder.class);
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

   public Structures$PbSportIdentifier$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbSportIdentifier var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbSportIdentifier var14;
         try {
            var13 = (Structures$PbSportIdentifier)Structures$PbSportIdentifier.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbSportIdentifier)var10.getUnfinishedMessage();
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

   public Structures$PbSportIdentifier$Builder mergeFrom(Message var1) {
      Structures$PbSportIdentifier$Builder var2;
      if (var1 instanceof Structures$PbSportIdentifier) {
         var2 = this.mergeFrom((Structures$PbSportIdentifier)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbSportIdentifier$Builder mergeFrom(Structures$PbSportIdentifier var1) {
      if (var1 != Structures$PbSportIdentifier.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         this.mergeUnknownFields(Structures$PbSportIdentifier.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbSportIdentifier$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbSportIdentifier$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbSportIdentifier$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbSportIdentifier$Builder)super.setField(var1, var2);
   }

   public Structures$PbSportIdentifier$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbSportIdentifier$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbSportIdentifier$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbSportIdentifier$Builder)super.setUnknownFields(var1);
   }

   public Structures$PbSportIdentifier$Builder setValue(long var1) {
      this.bitField0_ |= 1;
      this.value_ = var1;
      this.onChanged();
      return this;
   }
}
