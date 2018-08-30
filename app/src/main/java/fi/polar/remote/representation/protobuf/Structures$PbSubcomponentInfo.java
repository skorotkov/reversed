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

public final class Structures$PbSubcomponentInfo extends GeneratedMessageV3 implements Structures$PbSubcomponentInfoOrBuilder {
   private static final Structures$PbSubcomponentInfo DEFAULT_INSTANCE = new Structures$PbSubcomponentInfo();
   public static final int NAME_FIELD_NUMBER = 1;
   public static final int OBSOLETE_REQUIRED_VERSION_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Structures$PbSubcomponentInfo$1();
   public static final int VERSION_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private volatile Object name_;
   private Structures$PbVersion oBSOLETERequiredVersion_;
   private Structures$PbVersion version_;

   private Structures$PbSubcomponentInfo() {
      this.memoizedIsInitialized = (byte)-1;
      this.name_ = "";
   }

   private Structures$PbSubcomponentInfo(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbSubcomponentInfo(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbSubcomponentInfo(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbSubcomponentInfo(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbSubcomponentInfo var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbVersion a(Structures$PbSubcomponentInfo var0, Structures$PbVersion var1) {
      var0.oBSOLETERequiredVersion_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(Structures$PbSubcomponentInfo var0) {
      return var0.name_;
   }

   // $FF: synthetic method
   static Object a(Structures$PbSubcomponentInfo var0, Object var1) {
      var0.name_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(Structures$PbSubcomponentInfo var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Structures$PbVersion b(Structures$PbSubcomponentInfo var0, Structures$PbVersion var1) {
      var0.version_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbSubcomponentInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.Y();
   }

   public static Structures$PbSubcomponentInfo$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbSubcomponentInfo$Builder newBuilder(Structures$PbSubcomponentInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbSubcomponentInfo parseDelimitedFrom(InputStream var0) {
      return (Structures$PbSubcomponentInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbSubcomponentInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbSubcomponentInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbSubcomponentInfo parseFrom(ByteString var0) {
      return (Structures$PbSubcomponentInfo)PARSER.parseFrom(var0);
   }

   public static Structures$PbSubcomponentInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbSubcomponentInfo)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbSubcomponentInfo parseFrom(CodedInputStream var0) {
      return (Structures$PbSubcomponentInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbSubcomponentInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbSubcomponentInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbSubcomponentInfo parseFrom(InputStream var0) {
      return (Structures$PbSubcomponentInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbSubcomponentInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbSubcomponentInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbSubcomponentInfo parseFrom(byte[] var0) {
      return (Structures$PbSubcomponentInfo)PARSER.parseFrom(var0);
   }

   public static Structures$PbSubcomponentInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbSubcomponentInfo)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbSubcomponentInfo)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbSubcomponentInfo var5 = (Structures$PbSubcomponentInfo)var1;
            boolean var3;
            if (this.hasName() == var5.hasName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasName()) {
               if (var3 && this.getName().equals(var5.getName())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasOBSOLETERequiredVersion() == var5.hasOBSOLETERequiredVersion()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasOBSOLETERequiredVersion()) {
               if (var4 && this.getOBSOLETERequiredVersion().equals(var5.getOBSOLETERequiredVersion())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasVersion() == var5.hasVersion()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasVersion()) {
               if (var4 && this.getVersion().equals(var5.getVersion())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public Structures$PbSubcomponentInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public String getName() {
      Object var1 = this.name_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.name_ = var3;
         }
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
      if (this.oBSOLETERequiredVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.oBSOLETERequiredVersion_;
      }

      return var1;
   }

   public Structures$PbVersionOrBuilder getOBSOLETERequiredVersionOrBuilder() {
      Structures$PbVersion var1;
      if (this.oBSOLETERequiredVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.oBSOLETERequiredVersion_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getOBSOLETERequiredVersion());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getVersion());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public Structures$PbVersion getVersion() {
      Structures$PbVersion var1;
      if (this.version_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.version_;
      }

      return var1;
   }

   public Structures$PbVersionOrBuilder getVersionOrBuilder() {
      Structures$PbVersion var1;
      if (this.version_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.version_;
      }

      return var1;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasName()) {
            var2 = (var1 * 37 + 1) * 53 + this.getName().hashCode();
         }

         var1 = var2;
         if (this.hasOBSOLETERequiredVersion()) {
            var1 = (var2 * 37 + 2) * 53 + this.getOBSOLETERequiredVersion().hashCode();
         }

         var2 = var1;
         if (this.hasVersion()) {
            var2 = (var1 * 37 + 3) * 53 + this.getVersion().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.Z().ensureFieldAccessorsInitialized(Structures$PbSubcomponentInfo.class, Structures$PbSubcomponentInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasOBSOLETERequiredVersion() && !this.getOBSOLETERequiredVersion().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasVersion() && !this.getVersion().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbSubcomponentInfo$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbSubcomponentInfo$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbSubcomponentInfo$Builder(var1, (Structures$1)null);
   }

   public Structures$PbSubcomponentInfo$Builder toBuilder() {
      Structures$PbSubcomponentInfo$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbSubcomponentInfo$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbSubcomponentInfo$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getOBSOLETERequiredVersion());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getVersion());
      }

      this.unknownFields.writeTo(var1);
   }
}
