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

public final class Types$PbVolume$Builder extends Builder implements Types$PbVolumeOrBuilder {
   private int bitField0_;
   private int volume_;

   private Types$PbVolume$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Types$PbVolume$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbVolume$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbVolume$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.q();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbVolume.b()) {
      }

   }

   public Types$PbVolume$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbVolume$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbVolume build() {
      Types$PbVolume var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbVolume buildPartial() {
      byte var1 = 1;
      Types$PbVolume var2 = new Types$PbVolume(this, (Types$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Types$PbVolume.a(var2, this.volume_);
      Types$PbVolume.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Types$PbVolume$Builder clear() {
      super.clear();
      this.volume_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public Types$PbVolume$Builder clearField(FieldDescriptor var1) {
      return (Types$PbVolume$Builder)super.clearField(var1);
   }

   public Types$PbVolume$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbVolume$Builder)super.clearOneof(var1);
   }

   public Types$PbVolume$Builder clearVolume() {
      this.bitField0_ &= -2;
      this.volume_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbVolume$Builder clone() {
      return (Types$PbVolume$Builder)super.clone();
   }

   public Types$PbVolume getDefaultInstanceForType() {
      return Types$PbVolume.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.q();
   }

   public int getVolume() {
      return this.volume_;
   }

   public boolean hasVolume() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.r().ensureFieldAccessorsInitialized(Types$PbVolume.class, Types$PbVolume$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasVolume()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Types$PbVolume$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbVolume var13;
      label96: {
         InvalidProtocolBufferException var12;
         Types$PbVolume var14;
         try {
            var13 = (Types$PbVolume)Types$PbVolume.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Types$PbVolume)var10.getUnfinishedMessage();
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

   public Types$PbVolume$Builder mergeFrom(Message var1) {
      Types$PbVolume$Builder var2;
      if (var1 instanceof Types$PbVolume) {
         var2 = this.mergeFrom((Types$PbVolume)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbVolume$Builder mergeFrom(Types$PbVolume var1) {
      if (var1 != Types$PbVolume.getDefaultInstance()) {
         if (var1.hasVolume()) {
            this.setVolume(var1.getVolume());
         }

         this.mergeUnknownFields(Types$PbVolume.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbVolume$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbVolume$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbVolume$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbVolume$Builder)super.setField(var1, var2);
   }

   public Types$PbVolume$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbVolume$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Types$PbVolume$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbVolume$Builder)super.setUnknownFields(var1);
   }

   public Types$PbVolume$Builder setVolume(int var1) {
      this.bitField0_ |= 1;
      this.volume_ = var1;
      this.onChanged();
      return this;
   }
}
