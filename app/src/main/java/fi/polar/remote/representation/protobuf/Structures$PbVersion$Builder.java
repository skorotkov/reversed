package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
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

public final class Structures$PbVersion$Builder extends Builder implements Structures$PbVersionOrBuilder {
   private int bitField0_;
   private int major_;
   private int minor_;
   private int patch_;
   private Object specifier_;

   private Structures$PbVersion$Builder() {
      this.specifier_ = "";
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbVersion$Builder(BuilderParent var1) {
      super(var1);
      this.specifier_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbVersion$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbVersion$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.W();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbVersion.b()) {
      }

   }

   public Structures$PbVersion$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbVersion$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbVersion build() {
      Structures$PbVersion var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbVersion buildPartial() {
      byte var1 = 1;
      Structures$PbVersion var2 = new Structures$PbVersion(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbVersion.a(var2, this.major_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Structures$PbVersion.b(var2, this.minor_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      Structures$PbVersion.c(var2, this.patch_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      Structures$PbVersion.a(var2, this.specifier_);
      Structures$PbVersion.d(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Structures$PbVersion$Builder clear() {
      super.clear();
      this.major_ = 0;
      this.bitField0_ &= -2;
      this.minor_ = 0;
      this.bitField0_ &= -3;
      this.patch_ = 0;
      this.bitField0_ &= -5;
      this.specifier_ = "";
      this.bitField0_ &= -9;
      return this;
   }

   public Structures$PbVersion$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbVersion$Builder)super.clearField(var1);
   }

   public Structures$PbVersion$Builder clearMajor() {
      this.bitField0_ &= -2;
      this.major_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbVersion$Builder clearMinor() {
      this.bitField0_ &= -3;
      this.minor_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbVersion$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbVersion$Builder)super.clearOneof(var1);
   }

   public Structures$PbVersion$Builder clearPatch() {
      this.bitField0_ &= -5;
      this.patch_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbVersion$Builder clearSpecifier() {
      this.bitField0_ &= -9;
      this.specifier_ = Structures$PbVersion.getDefaultInstance().getSpecifier();
      this.onChanged();
      return this;
   }

   public Structures$PbVersion$Builder clone() {
      return (Structures$PbVersion$Builder)super.clone();
   }

   public Structures$PbVersion getDefaultInstanceForType() {
      return Structures$PbVersion.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.W();
   }

   public int getMajor() {
      return this.major_;
   }

   public int getMinor() {
      return this.minor_;
   }

   public int getPatch() {
      return this.patch_;
   }

   public String getSpecifier() {
      Object var1 = this.specifier_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.specifier_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getSpecifierBytes() {
      Object var1 = this.specifier_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.specifier_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public boolean hasMajor() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMinor() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPatch() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpecifier() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.X().ensureFieldAccessorsInitialized(Structures$PbVersion.class, Structures$PbVersion$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasMajor()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasMinor()) {
            var2 = var1;
            if (this.hasPatch()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public Structures$PbVersion$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbVersion var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbVersion var14;
         try {
            var13 = (Structures$PbVersion)Structures$PbVersion.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbVersion)var10.getUnfinishedMessage();
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

   public Structures$PbVersion$Builder mergeFrom(Message var1) {
      Structures$PbVersion$Builder var2;
      if (var1 instanceof Structures$PbVersion) {
         var2 = this.mergeFrom((Structures$PbVersion)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbVersion$Builder mergeFrom(Structures$PbVersion var1) {
      if (var1 != Structures$PbVersion.getDefaultInstance()) {
         if (var1.hasMajor()) {
            this.setMajor(var1.getMajor());
         }

         if (var1.hasMinor()) {
            this.setMinor(var1.getMinor());
         }

         if (var1.hasPatch()) {
            this.setPatch(var1.getPatch());
         }

         if (var1.hasSpecifier()) {
            this.bitField0_ |= 8;
            this.specifier_ = Structures$PbVersion.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(Structures$PbVersion.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbVersion$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbVersion$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbVersion$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbVersion$Builder)super.setField(var1, var2);
   }

   public Structures$PbVersion$Builder setMajor(int var1) {
      this.bitField0_ |= 1;
      this.major_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbVersion$Builder setMinor(int var1) {
      this.bitField0_ |= 2;
      this.minor_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbVersion$Builder setPatch(int var1) {
      this.bitField0_ |= 4;
      this.patch_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbVersion$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbVersion$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbVersion$Builder setSpecifier(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.specifier_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbVersion$Builder setSpecifierBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.specifier_ = var1;
         this.onChanged();
         return this;
      }
   }

   public final Structures$PbVersion$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbVersion$Builder)super.setUnknownFields(var1);
   }
}
