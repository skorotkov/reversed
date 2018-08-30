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

public final class Structures$PbSwimmingPoolInfo$Builder extends Builder implements Structures$PbSwimmingPoolInfoOrBuilder {
   private int bitField0_;
   private float poolLength_;
   private int swimmingPoolType_;

   private Structures$PbSwimmingPoolInfo$Builder() {
      this.swimmingPoolType_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbSwimmingPoolInfo$Builder(BuilderParent var1) {
      super(var1);
      this.swimmingPoolType_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbSwimmingPoolInfo$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbSwimmingPoolInfo$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.M();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbSwimmingPoolInfo.b()) {
      }

   }

   public Structures$PbSwimmingPoolInfo$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbSwimmingPoolInfo$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbSwimmingPoolInfo build() {
      Structures$PbSwimmingPoolInfo var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbSwimmingPoolInfo buildPartial() {
      byte var1 = 1;
      Structures$PbSwimmingPoolInfo var2 = new Structures$PbSwimmingPoolInfo(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbSwimmingPoolInfo.a(var2, this.poolLength_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Structures$PbSwimmingPoolInfo.a(var2, this.swimmingPoolType_);
      Structures$PbSwimmingPoolInfo.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Structures$PbSwimmingPoolInfo$Builder clear() {
      super.clear();
      this.poolLength_ = 0.0F;
      this.bitField0_ &= -2;
      this.swimmingPoolType_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbSwimmingPoolInfo$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbSwimmingPoolInfo$Builder)super.clearField(var1);
   }

   public Structures$PbSwimmingPoolInfo$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbSwimmingPoolInfo$Builder)super.clearOneof(var1);
   }

   public Structures$PbSwimmingPoolInfo$Builder clearPoolLength() {
      this.bitField0_ &= -2;
      this.poolLength_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Structures$PbSwimmingPoolInfo$Builder clearSwimmingPoolType() {
      this.bitField0_ &= -3;
      this.swimmingPoolType_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbSwimmingPoolInfo$Builder clone() {
      return (Structures$PbSwimmingPoolInfo$Builder)super.clone();
   }

   public Structures$PbSwimmingPoolInfo getDefaultInstanceForType() {
      return Structures$PbSwimmingPoolInfo.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.M();
   }

   public float getPoolLength() {
      return this.poolLength_;
   }

   public Types$PbSwimmingPoolUnits getSwimmingPoolType() {
      Types$PbSwimmingPoolUnits var1 = Types$PbSwimmingPoolUnits.valueOf(this.swimmingPoolType_);
      Types$PbSwimmingPoolUnits var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSwimmingPoolUnits.SWIMMING_POOL_METERS;
      }

      return var2;
   }

   public boolean hasPoolLength() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingPoolType() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.N().ensureFieldAccessorsInitialized(Structures$PbSwimmingPoolInfo.class, Structures$PbSwimmingPoolInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasSwimmingPoolType()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbSwimmingPoolInfo$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbSwimmingPoolInfo var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbSwimmingPoolInfo)Structures$PbSwimmingPoolInfo.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbSwimmingPoolInfo)var10.getUnfinishedMessage();
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

   public Structures$PbSwimmingPoolInfo$Builder mergeFrom(Message var1) {
      Structures$PbSwimmingPoolInfo$Builder var2;
      if (var1 instanceof Structures$PbSwimmingPoolInfo) {
         var2 = this.mergeFrom((Structures$PbSwimmingPoolInfo)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbSwimmingPoolInfo$Builder mergeFrom(Structures$PbSwimmingPoolInfo var1) {
      if (var1 != Structures$PbSwimmingPoolInfo.getDefaultInstance()) {
         if (var1.hasPoolLength()) {
            this.setPoolLength(var1.getPoolLength());
         }

         if (var1.hasSwimmingPoolType()) {
            this.setSwimmingPoolType(var1.getSwimmingPoolType());
         }

         this.mergeUnknownFields(Structures$PbSwimmingPoolInfo.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbSwimmingPoolInfo$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbSwimmingPoolInfo$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbSwimmingPoolInfo$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbSwimmingPoolInfo$Builder)super.setField(var1, var2);
   }

   public Structures$PbSwimmingPoolInfo$Builder setPoolLength(float var1) {
      this.bitField0_ |= 1;
      this.poolLength_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbSwimmingPoolInfo$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbSwimmingPoolInfo$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbSwimmingPoolInfo$Builder setSwimmingPoolType(Types$PbSwimmingPoolUnits var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.swimmingPoolType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final Structures$PbSwimmingPoolInfo$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbSwimmingPoolInfo$Builder)super.setUnknownFields(var1);
   }
}
