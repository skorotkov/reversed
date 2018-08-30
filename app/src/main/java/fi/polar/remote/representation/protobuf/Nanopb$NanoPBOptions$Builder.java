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

public final class Nanopb$NanoPBOptions$Builder extends Builder implements Nanopb$NanoPBOptionsOrBuilder {
   private int bitField0_;
   private int maxCount_;
   private int maxSize_;

   private Nanopb$NanoPBOptions$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Nanopb$NanoPBOptions$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Nanopb$NanoPBOptions$Builder(BuilderParent var1, Nanopb$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Nanopb$NanoPBOptions$Builder(Nanopb$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Nanopb.a();
   }

   private void maybeForceBuilderInitialization() {
      if (Nanopb$NanoPBOptions.b()) {
      }

   }

   public Nanopb$NanoPBOptions$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Nanopb$NanoPBOptions$Builder)super.addRepeatedField(var1, var2);
   }

   public Nanopb$NanoPBOptions build() {
      Nanopb$NanoPBOptions var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Nanopb$NanoPBOptions buildPartial() {
      byte var1 = 1;
      Nanopb$NanoPBOptions var2 = new Nanopb$NanoPBOptions(this, (Nanopb$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Nanopb$NanoPBOptions.a(var2, this.maxSize_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Nanopb$NanoPBOptions.b(var2, this.maxCount_);
      Nanopb$NanoPBOptions.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Nanopb$NanoPBOptions$Builder clear() {
      super.clear();
      this.maxSize_ = 0;
      this.bitField0_ &= -2;
      this.maxCount_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public Nanopb$NanoPBOptions$Builder clearField(FieldDescriptor var1) {
      return (Nanopb$NanoPBOptions$Builder)super.clearField(var1);
   }

   public Nanopb$NanoPBOptions$Builder clearMaxCount() {
      this.bitField0_ &= -3;
      this.maxCount_ = 0;
      this.onChanged();
      return this;
   }

   public Nanopb$NanoPBOptions$Builder clearMaxSize() {
      this.bitField0_ &= -2;
      this.maxSize_ = 0;
      this.onChanged();
      return this;
   }

   public Nanopb$NanoPBOptions$Builder clearOneof(OneofDescriptor var1) {
      return (Nanopb$NanoPBOptions$Builder)super.clearOneof(var1);
   }

   public Nanopb$NanoPBOptions$Builder clone() {
      return (Nanopb$NanoPBOptions$Builder)super.clone();
   }

   public Nanopb$NanoPBOptions getDefaultInstanceForType() {
      return Nanopb$NanoPBOptions.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Nanopb.a();
   }

   public int getMaxCount() {
      return this.maxCount_;
   }

   public int getMaxSize() {
      return this.maxSize_;
   }

   public boolean hasMaxCount() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMaxSize() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Nanopb.b().ensureFieldAccessorsInitialized(Nanopb$NanoPBOptions.class, Nanopb$NanoPBOptions$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public Nanopb$NanoPBOptions$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Nanopb$NanoPBOptions var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (Nanopb$NanoPBOptions)Nanopb$NanoPBOptions.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (Nanopb$NanoPBOptions)var11.getUnfinishedMessage();
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

   public Nanopb$NanoPBOptions$Builder mergeFrom(Message var1) {
      Nanopb$NanoPBOptions$Builder var2;
      if (var1 instanceof Nanopb$NanoPBOptions) {
         var2 = this.mergeFrom((Nanopb$NanoPBOptions)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Nanopb$NanoPBOptions$Builder mergeFrom(Nanopb$NanoPBOptions var1) {
      if (var1 != Nanopb$NanoPBOptions.getDefaultInstance()) {
         if (var1.hasMaxSize()) {
            this.setMaxSize(var1.getMaxSize());
         }

         if (var1.hasMaxCount()) {
            this.setMaxCount(var1.getMaxCount());
         }

         this.mergeUnknownFields(Nanopb$NanoPBOptions.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Nanopb$NanoPBOptions$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Nanopb$NanoPBOptions$Builder)super.mergeUnknownFields(var1);
   }

   public Nanopb$NanoPBOptions$Builder setField(FieldDescriptor var1, Object var2) {
      return (Nanopb$NanoPBOptions$Builder)super.setField(var1, var2);
   }

   public Nanopb$NanoPBOptions$Builder setMaxCount(int var1) {
      this.bitField0_ |= 2;
      this.maxCount_ = var1;
      this.onChanged();
      return this;
   }

   public Nanopb$NanoPBOptions$Builder setMaxSize(int var1) {
      this.bitField0_ |= 1;
      this.maxSize_ = var1;
      this.onChanged();
      return this;
   }

   public Nanopb$NanoPBOptions$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Nanopb$NanoPBOptions$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Nanopb$NanoPBOptions$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Nanopb$NanoPBOptions$Builder)super.setUnknownFields(var1);
   }
}
