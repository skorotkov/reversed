package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Structures$PbSubcomponentInfo$Builder extends Builder implements Structures$PbSubcomponentInfoOrBuilder {
   private int bitField0_;
   private Object name_;
   private SingleFieldBuilderV3 oBSOLETERequiredVersionBuilder_;
   private Structures$PbVersion oBSOLETERequiredVersion_;
   private SingleFieldBuilderV3 versionBuilder_;
   private Structures$PbVersion version_;

   private Structures$PbSubcomponentInfo$Builder() {
      this.name_ = "";
      this.oBSOLETERequiredVersion_ = null;
      this.version_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbSubcomponentInfo$Builder(BuilderParent var1) {
      super(var1);
      this.name_ = "";
      this.oBSOLETERequiredVersion_ = null;
      this.version_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbSubcomponentInfo$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbSubcomponentInfo$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.Y();
   }

   private SingleFieldBuilderV3 getOBSOLETERequiredVersionFieldBuilder() {
      if (this.oBSOLETERequiredVersionBuilder_ == null) {
         this.oBSOLETERequiredVersionBuilder_ = new SingleFieldBuilderV3(this.getOBSOLETERequiredVersion(), this.getParentForChildren(), this.isClean());
         this.oBSOLETERequiredVersion_ = null;
      }

      return this.oBSOLETERequiredVersionBuilder_;
   }

   private SingleFieldBuilderV3 getVersionFieldBuilder() {
      if (this.versionBuilder_ == null) {
         this.versionBuilder_ = new SingleFieldBuilderV3(this.getVersion(), this.getParentForChildren(), this.isClean());
         this.version_ = null;
      }

      return this.versionBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbSubcomponentInfo.b()) {
         this.getOBSOLETERequiredVersionFieldBuilder();
         this.getVersionFieldBuilder();
      }

   }

   public Structures$PbSubcomponentInfo$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbSubcomponentInfo$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbSubcomponentInfo build() {
      Structures$PbSubcomponentInfo var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbSubcomponentInfo buildPartial() {
      int var1 = 1;
      Structures$PbSubcomponentInfo var2 = new Structures$PbSubcomponentInfo(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbSubcomponentInfo.a(var2, this.name_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.oBSOLETERequiredVersionBuilder_ == null) {
         Structures$PbSubcomponentInfo.a(var2, this.oBSOLETERequiredVersion_);
      } else {
         Structures$PbSubcomponentInfo.a(var2, (Structures$PbVersion)this.oBSOLETERequiredVersionBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      if (this.versionBuilder_ == null) {
         Structures$PbSubcomponentInfo.b(var2, this.version_);
      } else {
         Structures$PbSubcomponentInfo.b(var2, (Structures$PbVersion)this.versionBuilder_.build());
      }

      Structures$PbSubcomponentInfo.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Structures$PbSubcomponentInfo$Builder clear() {
      super.clear();
      this.name_ = "";
      this.bitField0_ &= -2;
      if (this.oBSOLETERequiredVersionBuilder_ == null) {
         this.oBSOLETERequiredVersion_ = null;
      } else {
         this.oBSOLETERequiredVersionBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.versionBuilder_ == null) {
         this.version_ = null;
      } else {
         this.versionBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Structures$PbSubcomponentInfo$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbSubcomponentInfo$Builder)super.clearField(var1);
   }

   public Structures$PbSubcomponentInfo$Builder clearName() {
      this.bitField0_ &= -2;
      this.name_ = Structures$PbSubcomponentInfo.getDefaultInstance().getName();
      this.onChanged();
      return this;
   }

   public Structures$PbSubcomponentInfo$Builder clearOBSOLETERequiredVersion() {
      if (this.oBSOLETERequiredVersionBuilder_ == null) {
         this.oBSOLETERequiredVersion_ = null;
         this.onChanged();
      } else {
         this.oBSOLETERequiredVersionBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbSubcomponentInfo$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbSubcomponentInfo$Builder)super.clearOneof(var1);
   }

   public Structures$PbSubcomponentInfo$Builder clearVersion() {
      if (this.versionBuilder_ == null) {
         this.version_ = null;
         this.onChanged();
      } else {
         this.versionBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Structures$PbSubcomponentInfo$Builder clone() {
      return (Structures$PbSubcomponentInfo$Builder)super.clone();
   }

   public Structures$PbSubcomponentInfo getDefaultInstanceForType() {
      return Structures$PbSubcomponentInfo.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.Y();
   }

   public String getName() {
      Object var1 = this.name_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.name_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getNameBytes() {
      Object var1 = this.name_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Structures$PbVersion getOBSOLETERequiredVersion() {
      Structures$PbVersion var1;
      if (this.oBSOLETERequiredVersionBuilder_ == null) {
         if (this.oBSOLETERequiredVersion_ == null) {
            var1 = Structures$PbVersion.getDefaultInstance();
         } else {
            var1 = this.oBSOLETERequiredVersion_;
         }
      } else {
         var1 = (Structures$PbVersion)this.oBSOLETERequiredVersionBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbVersion$Builder getOBSOLETERequiredVersionBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Structures$PbVersion$Builder)this.getOBSOLETERequiredVersionFieldBuilder().getBuilder();
   }

   public Structures$PbVersionOrBuilder getOBSOLETERequiredVersionOrBuilder() {
      Object var1;
      if (this.oBSOLETERequiredVersionBuilder_ != null) {
         var1 = (Structures$PbVersionOrBuilder)this.oBSOLETERequiredVersionBuilder_.getMessageOrBuilder();
      } else if (this.oBSOLETERequiredVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.oBSOLETERequiredVersion_;
      }

      return (Structures$PbVersionOrBuilder)var1;
   }

   public Structures$PbVersion getVersion() {
      Structures$PbVersion var1;
      if (this.versionBuilder_ == null) {
         if (this.version_ == null) {
            var1 = Structures$PbVersion.getDefaultInstance();
         } else {
            var1 = this.version_;
         }
      } else {
         var1 = (Structures$PbVersion)this.versionBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbVersion$Builder getVersionBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Structures$PbVersion$Builder)this.getVersionFieldBuilder().getBuilder();
   }

   public Structures$PbVersionOrBuilder getVersionOrBuilder() {
      Object var1;
      if (this.versionBuilder_ != null) {
         var1 = (Structures$PbVersionOrBuilder)this.versionBuilder_.getMessageOrBuilder();
      } else if (this.version_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.version_;
      }

      return (Structures$PbVersionOrBuilder)var1;
   }

   public boolean hasName() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETERequiredVersion() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVersion() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.Z().ensureFieldAccessorsInitialized(Structures$PbSubcomponentInfo.class, Structures$PbSubcomponentInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasName()) {
         var2 = var1;
      } else {
         if (this.hasOBSOLETERequiredVersion()) {
            var2 = var1;
            if (!this.getOBSOLETERequiredVersion().isInitialized()) {
               return var2;
            }
         }

         if (this.hasVersion()) {
            var2 = var1;
            if (!this.getVersion().isInitialized()) {
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   public Structures$PbSubcomponentInfo$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbSubcomponentInfo var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (Structures$PbSubcomponentInfo)Structures$PbSubcomponentInfo.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (Structures$PbSubcomponentInfo)var11.getUnfinishedMessage();
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

   public Structures$PbSubcomponentInfo$Builder mergeFrom(Message var1) {
      Structures$PbSubcomponentInfo$Builder var2;
      if (var1 instanceof Structures$PbSubcomponentInfo) {
         var2 = this.mergeFrom((Structures$PbSubcomponentInfo)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbSubcomponentInfo$Builder mergeFrom(Structures$PbSubcomponentInfo var1) {
      if (var1 != Structures$PbSubcomponentInfo.getDefaultInstance()) {
         if (var1.hasName()) {
            this.bitField0_ |= 1;
            this.name_ = Structures$PbSubcomponentInfo.a(var1);
            this.onChanged();
         }

         if (var1.hasOBSOLETERequiredVersion()) {
            this.mergeOBSOLETERequiredVersion(var1.getOBSOLETERequiredVersion());
         }

         if (var1.hasVersion()) {
            this.mergeVersion(var1.getVersion());
         }

         this.mergeUnknownFields(Structures$PbSubcomponentInfo.b(var1));
         this.onChanged();
      }

      return this;
   }

   public Structures$PbSubcomponentInfo$Builder mergeOBSOLETERequiredVersion(Structures$PbVersion var1) {
      if (this.oBSOLETERequiredVersionBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.oBSOLETERequiredVersion_ != null && this.oBSOLETERequiredVersion_ != Structures$PbVersion.getDefaultInstance()) {
            this.oBSOLETERequiredVersion_ = Structures$PbVersion.newBuilder(this.oBSOLETERequiredVersion_).mergeFrom(var1).buildPartial();
         } else {
            this.oBSOLETERequiredVersion_ = var1;
         }

         this.onChanged();
      } else {
         this.oBSOLETERequiredVersionBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Structures$PbSubcomponentInfo$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbSubcomponentInfo$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbSubcomponentInfo$Builder mergeVersion(Structures$PbVersion var1) {
      if (this.versionBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.version_ != null && this.version_ != Structures$PbVersion.getDefaultInstance()) {
            this.version_ = Structures$PbVersion.newBuilder(this.version_).mergeFrom(var1).buildPartial();
         } else {
            this.version_ = var1;
         }

         this.onChanged();
      } else {
         this.versionBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Structures$PbSubcomponentInfo$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbSubcomponentInfo$Builder)super.setField(var1, var2);
   }

   public Structures$PbSubcomponentInfo$Builder setName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.name_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbSubcomponentInfo$Builder setNameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.name_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbSubcomponentInfo$Builder setOBSOLETERequiredVersion(Structures$PbVersion$Builder var1) {
      if (this.oBSOLETERequiredVersionBuilder_ == null) {
         this.oBSOLETERequiredVersion_ = var1.build();
         this.onChanged();
      } else {
         this.oBSOLETERequiredVersionBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbSubcomponentInfo$Builder setOBSOLETERequiredVersion(Structures$PbVersion var1) {
      if (this.oBSOLETERequiredVersionBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.oBSOLETERequiredVersion_ = var1;
         this.onChanged();
      } else {
         this.oBSOLETERequiredVersionBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbSubcomponentInfo$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbSubcomponentInfo$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbSubcomponentInfo$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbSubcomponentInfo$Builder)super.setUnknownFields(var1);
   }

   public Structures$PbSubcomponentInfo$Builder setVersion(Structures$PbVersion$Builder var1) {
      if (this.versionBuilder_ == null) {
         this.version_ = var1.build();
         this.onChanged();
      } else {
         this.versionBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Structures$PbSubcomponentInfo$Builder setVersion(Structures$PbVersion var1) {
      if (this.versionBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.version_ = var1;
         this.onChanged();
      } else {
         this.versionBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }
}
