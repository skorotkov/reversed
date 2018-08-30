package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class PhysData$PbUserBirthday extends GeneratedMessageV3 implements PhysData$PbUserBirthdayOrBuilder {
   private static final PhysData$PbUserBirthday DEFAULT_INSTANCE = new PhysData$PbUserBirthday();
   public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new PhysData$PbUserBirthday$1();
   public static final int VALUE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbSystemDateTime lastModified_;
   private byte memoizedIsInitialized;
   private Types$PbDate value_;

   private PhysData$PbUserBirthday() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private PhysData$PbUserBirthday(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PhysData$PbUserBirthday(CodedInputStream var1, ExtensionRegistryLite var2, PhysData$1 var3) {
      this(var1, var2);
   }

   private PhysData$PbUserBirthday(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PhysData$PbUserBirthday(Builder var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PhysData$PbUserBirthday var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PhysData$PbUserBirthday var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDate a(PhysData$PbUserBirthday var0, Types$PbDate var1) {
      var0.value_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(PhysData$PbUserBirthday var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PhysData$PbUserBirthday getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PhysData.a();
   }

   public static PhysData$PbUserBirthday$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PhysData$PbUserBirthday$Builder newBuilder(PhysData$PbUserBirthday var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PhysData$PbUserBirthday parseDelimitedFrom(InputStream var0) {
      return (PhysData$PbUserBirthday)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserBirthday parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserBirthday)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserBirthday parseFrom(ByteString var0) {
      return (PhysData$PbUserBirthday)PARSER.parseFrom(var0);
   }

   public static PhysData$PbUserBirthday parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserBirthday)PARSER.parseFrom(var0, var1);
   }

   public static PhysData$PbUserBirthday parseFrom(CodedInputStream var0) {
      return (PhysData$PbUserBirthday)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserBirthday parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserBirthday)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserBirthday parseFrom(InputStream var0) {
      return (PhysData$PbUserBirthday)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserBirthday parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserBirthday)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserBirthday parseFrom(byte[] var0) {
      return (PhysData$PbUserBirthday)PARSER.parseFrom(var0);
   }

   public static PhysData$PbUserBirthday parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserBirthday)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PhysData$PbUserBirthday)) {
            var2 = super.equals(var1);
         } else {
            PhysData$PbUserBirthday var5 = (PhysData$PbUserBirthday)var1;
            boolean var3;
            if (this.hasValue() == var5.hasValue()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasValue()) {
               if (var3 && this.getValue().equals(var5.getValue())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastModified() == var5.hasLastModified()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLastModified()) {
               if (var3 && this.getLastModified().equals(var5.getLastModified())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public PhysData$PbUserBirthday getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getValue());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getLastModified());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public Types$PbDate getValue() {
      Types$PbDate var1;
      if (this.value_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.value_;
      }

      return var1;
   }

   public Types$PbDateOrBuilder getValueOrBuilder() {
      Types$PbDate var1;
      if (this.value_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.value_;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasValue() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasValue()) {
            var1 = (var2 * 37 + 1) * 53 + this.getValue().hashCode();
         }

         var2 = var1;
         if (this.hasLastModified()) {
            var2 = (var1 * 37 + 2) * 53 + this.getLastModified().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PhysData.b().ensureFieldAccessorsInitialized(PhysData$PbUserBirthday.class, PhysData$PbUserBirthday$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasValue()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasLastModified()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getValue().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getLastModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PhysData$PbUserBirthday$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PhysData$PbUserBirthday$Builder newBuilderForType(BuilderParent var1) {
      return new PhysData$PbUserBirthday$Builder(var1, (PhysData$1)null);
   }

   public PhysData$PbUserBirthday$Builder toBuilder() {
      PhysData$PbUserBirthday$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PhysData$PbUserBirthday$Builder((PhysData$1)null);
      } else {
         var1 = (new PhysData$PbUserBirthday$Builder((PhysData$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getValue());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getLastModified());
      }

      this.unknownFields.writeTo(var1);
   }
}
