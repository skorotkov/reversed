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

public final class Structures$PbPowerZone$Builder extends Builder implements Structures$PbPowerZoneOrBuilder {
   private int bitField0_;
   private int higherLimit_;
   private int lowerLimit_;

   private Structures$PbPowerZone$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbPowerZone$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbPowerZone$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbPowerZone$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.m();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbPowerZone.b()) {
      }

   }

   public Structures$PbPowerZone$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbPowerZone$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbPowerZone build() {
      Structures$PbPowerZone var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbPowerZone buildPartial() {
      byte var1 = 1;
      Structures$PbPowerZone var2 = new Structures$PbPowerZone(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbPowerZone.a(var2, this.lowerLimit_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Structures$PbPowerZone.b(var2, this.higherLimit_);
      Structures$PbPowerZone.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Structures$PbPowerZone$Builder clear() {
      super.clear();
      this.lowerLimit_ = 0;
      this.bitField0_ &= -2;
      this.higherLimit_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbPowerZone$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbPowerZone$Builder)super.clearField(var1);
   }

   public Structures$PbPowerZone$Builder clearHigherLimit() {
      this.bitField0_ &= -3;
      this.higherLimit_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbPowerZone$Builder clearLowerLimit() {
      this.bitField0_ &= -2;
      this.lowerLimit_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbPowerZone$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbPowerZone$Builder)super.clearOneof(var1);
   }

   public Structures$PbPowerZone$Builder clone() {
      return (Structures$PbPowerZone$Builder)super.clone();
   }

   public Structures$PbPowerZone getDefaultInstanceForType() {
      return Structures$PbPowerZone.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.m();
   }

   public int getHigherLimit() {
      return this.higherLimit_;
   }

   public int getLowerLimit() {
      return this.lowerLimit_;
   }

   public boolean hasHigherLimit() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLowerLimit() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.n().ensureFieldAccessorsInitialized(Structures$PbPowerZone.class, Structures$PbPowerZone$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasLowerLimit() && this.hasHigherLimit()) {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbPowerZone$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbPowerZone var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbPowerZone var14;
         try {
            var13 = (Structures$PbPowerZone)Structures$PbPowerZone.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbPowerZone)var10.getUnfinishedMessage();
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

   public Structures$PbPowerZone$Builder mergeFrom(Message var1) {
      Structures$PbPowerZone$Builder var2;
      if (var1 instanceof Structures$PbPowerZone) {
         var2 = this.mergeFrom((Structures$PbPowerZone)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbPowerZone$Builder mergeFrom(Structures$PbPowerZone var1) {
      if (var1 != Structures$PbPowerZone.getDefaultInstance()) {
         if (var1.hasLowerLimit()) {
            this.setLowerLimit(var1.getLowerLimit());
         }

         if (var1.hasHigherLimit()) {
            this.setHigherLimit(var1.getHigherLimit());
         }

         this.mergeUnknownFields(Structures$PbPowerZone.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbPowerZone$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbPowerZone$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbPowerZone$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbPowerZone$Builder)super.setField(var1, var2);
   }

   public Structures$PbPowerZone$Builder setHigherLimit(int var1) {
      this.bitField0_ |= 2;
      this.higherLimit_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbPowerZone$Builder setLowerLimit(int var1) {
      this.bitField0_ |= 1;
      this.lowerLimit_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbPowerZone$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbPowerZone$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbPowerZone$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbPowerZone$Builder)super.setUnknownFields(var1);
   }
}
