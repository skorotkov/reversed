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

public final class Structures$PbVersion extends GeneratedMessageV3 implements Structures$PbVersionOrBuilder {
   private static final Structures$PbVersion DEFAULT_INSTANCE = new Structures$PbVersion();
   public static final int MAJOR_FIELD_NUMBER = 1;
   public static final int MINOR_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Structures$PbVersion$1();
   public static final int PATCH_FIELD_NUMBER = 3;
   public static final int SPECIFIER_FIELD_NUMBER = 4;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int major_;
   private byte memoizedIsInitialized;
   private int minor_;
   private int patch_;
   private volatile Object specifier_;

   private Structures$PbVersion() {
      this.memoizedIsInitialized = (byte)-1;
      this.major_ = 0;
      this.minor_ = 0;
      this.patch_ = 0;
      this.specifier_ = "";
   }

   private Structures$PbVersion(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbVersion(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbVersion(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbVersion(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbVersion var0, int var1) {
      var0.major_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(Structures$PbVersion var0) {
      return var0.specifier_;
   }

   // $FF: synthetic method
   static Object a(Structures$PbVersion var0, Object var1) {
      var0.specifier_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Structures$PbVersion var0, int var1) {
      var0.minor_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(Structures$PbVersion var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Structures$PbVersion var0, int var1) {
      var0.patch_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(Structures$PbVersion var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Structures$PbVersion getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.W();
   }

   public static Structures$PbVersion$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbVersion$Builder newBuilder(Structures$PbVersion var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbVersion parseDelimitedFrom(InputStream var0) {
      return (Structures$PbVersion)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbVersion parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbVersion)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbVersion parseFrom(ByteString var0) {
      return (Structures$PbVersion)PARSER.parseFrom(var0);
   }

   public static Structures$PbVersion parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbVersion)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbVersion parseFrom(CodedInputStream var0) {
      return (Structures$PbVersion)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbVersion parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbVersion)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbVersion parseFrom(InputStream var0) {
      return (Structures$PbVersion)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbVersion parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbVersion)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbVersion parseFrom(byte[] var0) {
      return (Structures$PbVersion)PARSER.parseFrom(var0);
   }

   public static Structures$PbVersion parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbVersion)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbVersion)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbVersion var5 = (Structures$PbVersion)var1;
            boolean var3;
            if (this.hasMajor() == var5.hasMajor()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasMajor()) {
               if (var3 && this.getMajor() == var5.getMajor()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMinor() == var5.hasMinor()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMinor()) {
               if (var3 && this.getMinor() == var5.getMinor()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPatch() == var5.hasPatch()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPatch()) {
               if (var4 && this.getPatch() == var5.getPatch()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSpecifier() == var5.hasSpecifier()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSpecifier()) {
               if (var3 && this.getSpecifier().equals(var5.getSpecifier())) {
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

   public Structures$PbVersion getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getMajor() {
      return this.major_;
   }

   public int getMinor() {
      return this.minor_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getPatch() {
      return this.patch_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.major_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.minor_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.patch_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + GeneratedMessageV3.computeStringSize(4, this.specifier_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public String getSpecifier() {
      Object var1 = this.specifier_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.specifier_ = var3;
         }
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

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasMajor()) {
            var1 = (var2 * 37 + 1) * 53 + this.getMajor();
         }

         var2 = var1;
         if (this.hasMinor()) {
            var2 = (var1 * 37 + 2) * 53 + this.getMinor();
         }

         var1 = var2;
         if (this.hasPatch()) {
            var1 = (var2 * 37 + 3) * 53 + this.getPatch();
         }

         var2 = var1;
         if (this.hasSpecifier()) {
            var2 = (var1 * 37 + 4) * 53 + this.getSpecifier().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.X().ensureFieldAccessorsInitialized(Structures$PbVersion.class, Structures$PbVersion$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasMajor()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasMinor()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasPatch()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbVersion$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbVersion$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbVersion$Builder(var1, (Structures$1)null);
   }

   public Structures$PbVersion$Builder toBuilder() {
      Structures$PbVersion$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbVersion$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbVersion$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.major_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.minor_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.patch_);
      }

      if ((this.bitField0_ & 8) == 8) {
         GeneratedMessageV3.writeString(var1, 4, this.specifier_);
      }

      this.unknownFields.writeTo(var1);
   }
}
