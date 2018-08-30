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

public final class Structures$PbMultiLineText$Builder extends Builder implements Structures$PbMultiLineTextOrBuilder {
   private int bitField0_;
   private Object text_;

   private Structures$PbMultiLineText$Builder() {
      this.text_ = "";
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbMultiLineText$Builder(BuilderParent var1) {
      super(var1);
      this.text_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbMultiLineText$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbMultiLineText$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.C();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbMultiLineText.b()) {
      }

   }

   public Structures$PbMultiLineText$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbMultiLineText$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbMultiLineText build() {
      Structures$PbMultiLineText var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbMultiLineText buildPartial() {
      byte var1 = 1;
      Structures$PbMultiLineText var2 = new Structures$PbMultiLineText(this, (Structures$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Structures$PbMultiLineText.a(var2, this.text_);
      Structures$PbMultiLineText.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbMultiLineText$Builder clear() {
      super.clear();
      this.text_ = "";
      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbMultiLineText$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbMultiLineText$Builder)super.clearField(var1);
   }

   public Structures$PbMultiLineText$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbMultiLineText$Builder)super.clearOneof(var1);
   }

   public Structures$PbMultiLineText$Builder clearText() {
      this.bitField0_ &= -2;
      this.text_ = Structures$PbMultiLineText.getDefaultInstance().getText();
      this.onChanged();
      return this;
   }

   public Structures$PbMultiLineText$Builder clone() {
      return (Structures$PbMultiLineText$Builder)super.clone();
   }

   public Structures$PbMultiLineText getDefaultInstanceForType() {
      return Structures$PbMultiLineText.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.C();
   }

   public String getText() {
      Object var1 = this.text_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.text_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getTextBytes() {
      Object var1 = this.text_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.text_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public boolean hasText() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.D().ensureFieldAccessorsInitialized(Structures$PbMultiLineText.class, Structures$PbMultiLineText$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasText()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbMultiLineText$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbMultiLineText var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbMultiLineText var14;
         try {
            var13 = (Structures$PbMultiLineText)Structures$PbMultiLineText.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbMultiLineText)var10.getUnfinishedMessage();
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

   public Structures$PbMultiLineText$Builder mergeFrom(Message var1) {
      Structures$PbMultiLineText$Builder var2;
      if (var1 instanceof Structures$PbMultiLineText) {
         var2 = this.mergeFrom((Structures$PbMultiLineText)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbMultiLineText$Builder mergeFrom(Structures$PbMultiLineText var1) {
      if (var1 != Structures$PbMultiLineText.getDefaultInstance()) {
         if (var1.hasText()) {
            this.bitField0_ |= 1;
            this.text_ = Structures$PbMultiLineText.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(Structures$PbMultiLineText.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbMultiLineText$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbMultiLineText$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbMultiLineText$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbMultiLineText$Builder)super.setField(var1, var2);
   }

   public Structures$PbMultiLineText$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbMultiLineText$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbMultiLineText$Builder setText(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.text_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbMultiLineText$Builder setTextBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.text_ = var1;
         this.onChanged();
         return this;
      }
   }

   public final Structures$PbMultiLineText$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbMultiLineText$Builder)super.setUnknownFields(var1);
   }
}
