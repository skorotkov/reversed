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

public final class Types$PbVolume extends GeneratedMessageV3 implements Types$PbVolumeOrBuilder {
   private static final Types$PbVolume DEFAULT_INSTANCE = new Types$PbVolume();
   @Deprecated
   public static final Parser PARSER = new Types$PbVolume$1();
   public static final int VOLUME_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int volume_;

   private Types$PbVolume() {
      this.memoizedIsInitialized = (byte)-1;
      this.volume_ = 0;
   }

   private Types$PbVolume(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbVolume(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbVolume(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbVolume(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Types$PbVolume var0, int var1) {
      var0.volume_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbVolume var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Types$PbVolume var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Types$PbVolume getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.q();
   }

   public static Types$PbVolume$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbVolume$Builder newBuilder(Types$PbVolume var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbVolume parseDelimitedFrom(InputStream var0) {
      return (Types$PbVolume)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbVolume parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbVolume)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbVolume parseFrom(ByteString var0) {
      return (Types$PbVolume)PARSER.parseFrom(var0);
   }

   public static Types$PbVolume parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbVolume)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbVolume parseFrom(CodedInputStream var0) {
      return (Types$PbVolume)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbVolume parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbVolume)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbVolume parseFrom(InputStream var0) {
      return (Types$PbVolume)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbVolume parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbVolume)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbVolume parseFrom(byte[] var0) {
      return (Types$PbVolume)PARSER.parseFrom(var0);
   }

   public static Types$PbVolume parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbVolume)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbVolume)) {
            var2 = super.equals(var1);
         } else {
            Types$PbVolume var5 = (Types$PbVolume)var1;
            boolean var3;
            if (this.hasVolume() == var5.hasVolume()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasVolume()) {
               if (var3 && this.getVolume() == var5.getVolume()) {
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

   public Types$PbVolume getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.volume_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasVolume()) {
            var1 = (var2 * 37 + 1) * 53 + this.getVolume();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.r().ensureFieldAccessorsInitialized(Types$PbVolume.class, Types$PbVolume$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasVolume()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbVolume$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbVolume$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbVolume$Builder(var1, (Types$1)null);
   }

   public Types$PbVolume$Builder toBuilder() {
      Types$PbVolume$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbVolume$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbVolume$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.volume_);
      }

      this.unknownFields.writeTo(var1);
   }
}
