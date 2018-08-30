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

public final class Structures$PbSpeedZone$Builder extends Builder implements Structures$PbSpeedZoneOrBuilder {
   private int bitField0_;
   private float higherLimit_;
   private float lowerLimit_;

   private Structures$PbSpeedZone$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbSpeedZone$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbSpeedZone$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbSpeedZone$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.k();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbSpeedZone.b()) {
      }

   }

   public Structures$PbSpeedZone$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbSpeedZone$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbSpeedZone build() {
      Structures$PbSpeedZone var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbSpeedZone buildPartial() {
      byte var1 = 1;
      Structures$PbSpeedZone var2 = new Structures$PbSpeedZone(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbSpeedZone.a(var2, this.lowerLimit_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Structures$PbSpeedZone.b(var2, this.higherLimit_);
      Structures$PbSpeedZone.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Structures$PbSpeedZone$Builder clear() {
      super.clear();
      this.lowerLimit_ = 0.0F;
      this.bitField0_ &= -2;
      this.higherLimit_ = 0.0F;
      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbSpeedZone$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbSpeedZone$Builder)super.clearField(var1);
   }

   public Structures$PbSpeedZone$Builder clearHigherLimit() {
      this.bitField0_ &= -3;
      this.higherLimit_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Structures$PbSpeedZone$Builder clearLowerLimit() {
      this.bitField0_ &= -2;
      this.lowerLimit_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Structures$PbSpeedZone$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbSpeedZone$Builder)super.clearOneof(var1);
   }

   public Structures$PbSpeedZone$Builder clone() {
      return (Structures$PbSpeedZone$Builder)super.clone();
   }

   public Structures$PbSpeedZone getDefaultInstanceForType() {
      return Structures$PbSpeedZone.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.k();
   }

   public float getHigherLimit() {
      return this.higherLimit_;
   }

   public float getLowerLimit() {
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
      return Structures.l().ensureFieldAccessorsInitialized(Structures$PbSpeedZone.class, Structures$PbSpeedZone$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasLowerLimit() && this.hasHigherLimit()) {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbSpeedZone$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbSpeedZone var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbSpeedZone)Structures$PbSpeedZone.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbSpeedZone)var10.getUnfinishedMessage();
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

   public Structures$PbSpeedZone$Builder mergeFrom(Message var1) {
      Structures$PbSpeedZone$Builder var2;
      if (var1 instanceof Structures$PbSpeedZone) {
         var2 = this.mergeFrom((Structures$PbSpeedZone)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbSpeedZone$Builder mergeFrom(Structures$PbSpeedZone var1) {
      if (var1 != Structures$PbSpeedZone.getDefaultInstance()) {
         if (var1.hasLowerLimit()) {
            this.setLowerLimit(var1.getLowerLimit());
         }

         if (var1.hasHigherLimit()) {
            this.setHigherLimit(var1.getHigherLimit());
         }

         this.mergeUnknownFields(Structures$PbSpeedZone.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbSpeedZone$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbSpeedZone$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbSpeedZone$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbSpeedZone$Builder)super.setField(var1, var2);
   }

   public Structures$PbSpeedZone$Builder setHigherLimit(float var1) {
      this.bitField0_ |= 2;
      this.higherLimit_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbSpeedZone$Builder setLowerLimit(float var1) {
      this.bitField0_ |= 1;
      this.lowerLimit_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbSpeedZone$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbSpeedZone$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbSpeedZone$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbSpeedZone$Builder)super.setUnknownFields(var1);
   }
}
