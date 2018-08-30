package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class Identifier$PbIdentifier extends GeneratedMessageV3 implements Identifier$PbIdentifierOrBuilder {
   public static final int CREATED_FIELD_NUMBER = 2;
   private static final Identifier$PbIdentifier DEFAULT_INSTANCE = new Identifier$PbIdentifier();
   public static final int DELETED_FIELD_NUMBER = 4;
   public static final int ECOSYSTEM_ID_FIELD_NUMBER = 1;
   public static final int LAST_MODIFIED_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new Identifier$PbIdentifier$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbSystemDateTime created_;
   private boolean deleted_;
   private long ecosystemId_;
   private Types$PbSystemDateTime lastModified_;
   private byte memoizedIsInitialized;

   private Identifier$PbIdentifier() {
      this.memoizedIsInitialized = (byte)-1;
      this.ecosystemId_ = 0L;
      this.deleted_ = false;
   }

   private Identifier$PbIdentifier(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Identifier$PbIdentifier(CodedInputStream var1, ExtensionRegistryLite var2, Identifier$1 var3) {
      this(var1, var2);
   }

   private Identifier$PbIdentifier(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Identifier$PbIdentifier(Builder var1, Identifier$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Identifier$PbIdentifier var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(Identifier$PbIdentifier var0, long var1) {
      var0.ecosystemId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Identifier$PbIdentifier var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(Identifier$PbIdentifier var0, Types$PbSystemDateTime var1) {
      var0.created_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(Identifier$PbIdentifier var0, boolean var1) {
      var0.deleted_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime b(Identifier$PbIdentifier var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Identifier$PbIdentifier getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Identifier.a();
   }

   public static Identifier$PbIdentifier$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Identifier$PbIdentifier$Builder newBuilder(Identifier$PbIdentifier var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Identifier$PbIdentifier parseDelimitedFrom(InputStream var0) {
      return (Identifier$PbIdentifier)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Identifier$PbIdentifier parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Identifier$PbIdentifier)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Identifier$PbIdentifier parseFrom(ByteString var0) {
      return (Identifier$PbIdentifier)PARSER.parseFrom(var0);
   }

   public static Identifier$PbIdentifier parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Identifier$PbIdentifier)PARSER.parseFrom(var0, var1);
   }

   public static Identifier$PbIdentifier parseFrom(CodedInputStream var0) {
      return (Identifier$PbIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Identifier$PbIdentifier parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Identifier$PbIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Identifier$PbIdentifier parseFrom(InputStream var0) {
      return (Identifier$PbIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Identifier$PbIdentifier parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Identifier$PbIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Identifier$PbIdentifier parseFrom(byte[] var0) {
      return (Identifier$PbIdentifier)PARSER.parseFrom(var0);
   }

   public static Identifier$PbIdentifier parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Identifier$PbIdentifier)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Identifier$PbIdentifier)) {
            var2 = super.equals(var1);
         } else {
            Identifier$PbIdentifier var5 = (Identifier$PbIdentifier)var1;
            boolean var3;
            if (this.hasEcosystemId() == var5.hasEcosystemId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasEcosystemId()) {
               if (var3 && this.getEcosystemId() == var5.getEcosystemId()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCreated() == var5.hasCreated()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasCreated()) {
               if (var3 && this.getCreated().equals(var5.getCreated())) {
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

            if (var4 && this.hasDeleted() == var5.hasDeleted()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDeleted()) {
               if (var4 && this.getDeleted() == var5.getDeleted()) {
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

   public Types$PbSystemDateTime getCreated() {
      Types$PbSystemDateTime var1;
      if (this.created_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.created_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getCreatedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.created_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.created_;
      }

      return var1;
   }

   public Identifier$PbIdentifier getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getDeleted() {
      return this.deleted_;
   }

   public long getEcosystemId() {
      return this.ecosystemId_;
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
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt64Size(1, this.ecosystemId_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getCreated());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getLastModified());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeBoolSize(4, this.deleted_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCreated() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeleted() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEcosystemId() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
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
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasEcosystemId()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashLong(this.getEcosystemId());
         }

         var2 = var1;
         if (this.hasCreated()) {
            var2 = (var1 * 37 + 2) * 53 + this.getCreated().hashCode();
         }

         var1 = var2;
         if (this.hasLastModified()) {
            var1 = (var2 * 37 + 3) * 53 + this.getLastModified().hashCode();
         }

         var2 = var1;
         if (this.hasDeleted()) {
            var2 = (var1 * 37 + 4) * 53 + Internal.hashBoolean(this.getDeleted());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Identifier.b().ensureFieldAccessorsInitialized(Identifier$PbIdentifier.class, Identifier$PbIdentifier$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasEcosystemId()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasCreated()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasLastModified()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getCreated().isInitialized()) {
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

   public Identifier$PbIdentifier$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Identifier$PbIdentifier$Builder newBuilderForType(BuilderParent var1) {
      return new Identifier$PbIdentifier$Builder(var1, (Identifier$1)null);
   }

   public Identifier$PbIdentifier$Builder toBuilder() {
      Identifier$PbIdentifier$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Identifier$PbIdentifier$Builder((Identifier$1)null);
      } else {
         var1 = (new Identifier$PbIdentifier$Builder((Identifier$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt64(1, this.ecosystemId_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getCreated());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getLastModified());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeBool(4, this.deleted_);
      }

      this.unknownFields.writeTo(var1);
   }
}
