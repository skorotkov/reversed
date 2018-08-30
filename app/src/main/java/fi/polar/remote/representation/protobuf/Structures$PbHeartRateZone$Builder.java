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

public final class Structures$PbHeartRateZone$Builder extends Builder implements Structures$PbHeartRateZoneOrBuilder {
   private int bitField0_;
   private int higherLimit_;
   private int lowerLimit_;

   private Structures$PbHeartRateZone$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbHeartRateZone$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbHeartRateZone$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbHeartRateZone$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.i();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbHeartRateZone.b()) {
      }

   }

   public Structures$PbHeartRateZone$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbHeartRateZone$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbHeartRateZone build() {
      Structures$PbHeartRateZone var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbHeartRateZone buildPartial() {
      byte var1 = 1;
      Structures$PbHeartRateZone var2 = new Structures$PbHeartRateZone(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbHeartRateZone.a(var2, this.lowerLimit_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Structures$PbHeartRateZone.b(var2, this.higherLimit_);
      Structures$PbHeartRateZone.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Structures$PbHeartRateZone$Builder clear() {
      super.clear();
      this.lowerLimit_ = 0;
      this.bitField0_ &= -2;
      this.higherLimit_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbHeartRateZone$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbHeartRateZone$Builder)super.clearField(var1);
   }

   public Structures$PbHeartRateZone$Builder clearHigherLimit() {
      this.bitField0_ &= -3;
      this.higherLimit_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbHeartRateZone$Builder clearLowerLimit() {
      this.bitField0_ &= -2;
      this.lowerLimit_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbHeartRateZone$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbHeartRateZone$Builder)super.clearOneof(var1);
   }

   public Structures$PbHeartRateZone$Builder clone() {
      return (Structures$PbHeartRateZone$Builder)super.clone();
   }

   public Structures$PbHeartRateZone getDefaultInstanceForType() {
      return Structures$PbHeartRateZone.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.i();
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
      return Structures.j().ensureFieldAccessorsInitialized(Structures$PbHeartRateZone.class, Structures$PbHeartRateZone$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasLowerLimit() && this.hasHigherLimit()) {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbHeartRateZone$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbHeartRateZone var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbHeartRateZone)Structures$PbHeartRateZone.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbHeartRateZone)var10.getUnfinishedMessage();
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

   public Structures$PbHeartRateZone$Builder mergeFrom(Message var1) {
      Structures$PbHeartRateZone$Builder var2;
      if (var1 instanceof Structures$PbHeartRateZone) {
         var2 = this.mergeFrom((Structures$PbHeartRateZone)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbHeartRateZone$Builder mergeFrom(Structures$PbHeartRateZone var1) {
      if (var1 != Structures$PbHeartRateZone.getDefaultInstance()) {
         if (var1.hasLowerLimit()) {
            this.setLowerLimit(var1.getLowerLimit());
         }

         if (var1.hasHigherLimit()) {
            this.setHigherLimit(var1.getHigherLimit());
         }

         this.mergeUnknownFields(Structures$PbHeartRateZone.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbHeartRateZone$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbHeartRateZone$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbHeartRateZone$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbHeartRateZone$Builder)super.setField(var1, var2);
   }

   public Structures$PbHeartRateZone$Builder setHigherLimit(int var1) {
      this.bitField0_ |= 2;
      this.higherLimit_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbHeartRateZone$Builder setLowerLimit(int var1) {
      this.bitField0_ |= 1;
      this.lowerLimit_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbHeartRateZone$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbHeartRateZone$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbHeartRateZone$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbHeartRateZone$Builder)super.setUnknownFields(var1);
   }
}
