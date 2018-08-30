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

public final class Structures$PbOneLineText$Builder extends Builder implements Structures$PbOneLineTextOrBuilder {
   private int bitField0_;
   private Object text_;

   private Structures$PbOneLineText$Builder() {
      this.text_ = "";
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbOneLineText$Builder(BuilderParent var1) {
      super(var1);
      this.text_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbOneLineText$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbOneLineText$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.A();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbOneLineText.b()) {
      }

   }

   public Structures$PbOneLineText$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbOneLineText$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbOneLineText build() {
      Structures$PbOneLineText var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbOneLineText buildPartial() {
      byte var1 = 1;
      Structures$PbOneLineText var2 = new Structures$PbOneLineText(this, (Structures$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Structures$PbOneLineText.a(var2, this.text_);
      Structures$PbOneLineText.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbOneLineText$Builder clear() {
      super.clear();
      this.text_ = "";
      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbOneLineText$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbOneLineText$Builder)super.clearField(var1);
   }

   public Structures$PbOneLineText$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbOneLineText$Builder)super.clearOneof(var1);
   }

   public Structures$PbOneLineText$Builder clearText() {
      this.bitField0_ &= -2;
      this.text_ = Structures$PbOneLineText.getDefaultInstance().getText();
      this.onChanged();
      return this;
   }

   public Structures$PbOneLineText$Builder clone() {
      return (Structures$PbOneLineText$Builder)super.clone();
   }

   public Structures$PbOneLineText getDefaultInstanceForType() {
      return Structures$PbOneLineText.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.A();
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
      return Structures.B().ensureFieldAccessorsInitialized(Structures$PbOneLineText.class, Structures$PbOneLineText$Builder.class);
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

   public Structures$PbOneLineText$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbOneLineText var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbOneLineText)Structures$PbOneLineText.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbOneLineText)var10.getUnfinishedMessage();
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

   public Structures$PbOneLineText$Builder mergeFrom(Message var1) {
      Structures$PbOneLineText$Builder var2;
      if (var1 instanceof Structures$PbOneLineText) {
         var2 = this.mergeFrom((Structures$PbOneLineText)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbOneLineText$Builder mergeFrom(Structures$PbOneLineText var1) {
      if (var1 != Structures$PbOneLineText.getDefaultInstance()) {
         if (var1.hasText()) {
            this.bitField0_ |= 1;
            this.text_ = Structures$PbOneLineText.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(Structures$PbOneLineText.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbOneLineText$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbOneLineText$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbOneLineText$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbOneLineText$Builder)super.setField(var1, var2);
   }

   public Structures$PbOneLineText$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbOneLineText$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbOneLineText$Builder setText(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.text_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbOneLineText$Builder setTextBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.text_ = var1;
         this.onChanged();
         return this;
      }
   }

   public final Structures$PbOneLineText$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbOneLineText$Builder)super.setUnknownFields(var1);
   }
}
