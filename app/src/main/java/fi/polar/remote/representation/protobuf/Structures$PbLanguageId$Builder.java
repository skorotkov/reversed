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

public final class Structures$PbLanguageId$Builder extends Builder implements Structures$PbLanguageIdOrBuilder {
   private int bitField0_;
   private Object language_;

   private Structures$PbLanguageId$Builder() {
      this.language_ = "";
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbLanguageId$Builder(BuilderParent var1) {
      super(var1);
      this.language_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbLanguageId$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbLanguageId$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.E();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbLanguageId.b()) {
      }

   }

   public Structures$PbLanguageId$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbLanguageId$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbLanguageId build() {
      Structures$PbLanguageId var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbLanguageId buildPartial() {
      byte var1 = 1;
      Structures$PbLanguageId var2 = new Structures$PbLanguageId(this, (Structures$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Structures$PbLanguageId.a(var2, this.language_);
      Structures$PbLanguageId.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbLanguageId$Builder clear() {
      super.clear();
      this.language_ = "";
      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbLanguageId$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbLanguageId$Builder)super.clearField(var1);
   }

   public Structures$PbLanguageId$Builder clearLanguage() {
      this.bitField0_ &= -2;
      this.language_ = Structures$PbLanguageId.getDefaultInstance().getLanguage();
      this.onChanged();
      return this;
   }

   public Structures$PbLanguageId$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbLanguageId$Builder)super.clearOneof(var1);
   }

   public Structures$PbLanguageId$Builder clone() {
      return (Structures$PbLanguageId$Builder)super.clone();
   }

   public Structures$PbLanguageId getDefaultInstanceForType() {
      return Structures$PbLanguageId.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.E();
   }

   public String getLanguage() {
      Object var1 = this.language_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.language_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getLanguageBytes() {
      Object var1 = this.language_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.language_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public boolean hasLanguage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.F().ensureFieldAccessorsInitialized(Structures$PbLanguageId.class, Structures$PbLanguageId$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasLanguage()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbLanguageId$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbLanguageId var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbLanguageId var14;
         try {
            var13 = (Structures$PbLanguageId)Structures$PbLanguageId.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbLanguageId)var10.getUnfinishedMessage();
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

   public Structures$PbLanguageId$Builder mergeFrom(Message var1) {
      Structures$PbLanguageId$Builder var2;
      if (var1 instanceof Structures$PbLanguageId) {
         var2 = this.mergeFrom((Structures$PbLanguageId)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbLanguageId$Builder mergeFrom(Structures$PbLanguageId var1) {
      if (var1 != Structures$PbLanguageId.getDefaultInstance()) {
         if (var1.hasLanguage()) {
            this.bitField0_ |= 1;
            this.language_ = Structures$PbLanguageId.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(Structures$PbLanguageId.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbLanguageId$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbLanguageId$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbLanguageId$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbLanguageId$Builder)super.setField(var1, var2);
   }

   public Structures$PbLanguageId$Builder setLanguage(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.language_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbLanguageId$Builder setLanguageBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.language_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbLanguageId$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbLanguageId$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbLanguageId$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbLanguageId$Builder)super.setUnknownFields(var1);
   }
}
