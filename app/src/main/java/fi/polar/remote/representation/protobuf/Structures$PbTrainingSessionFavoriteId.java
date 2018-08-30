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

public final class Structures$PbTrainingSessionFavoriteId extends GeneratedMessageV3 implements Structures$PbTrainingSessionFavoriteIdOrBuilder {
   private static final Structures$PbTrainingSessionFavoriteId DEFAULT_INSTANCE = new Structures$PbTrainingSessionFavoriteId();
   public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Structures$PbTrainingSessionFavoriteId$1();
   public static final int VALUE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbSystemDateTime lastModified_;
   private byte memoizedIsInitialized;
   private long value_;

   private Structures$PbTrainingSessionFavoriteId() {
      this.memoizedIsInitialized = (byte)-1;
      this.value_ = 0L;
   }

   private Structures$PbTrainingSessionFavoriteId(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbTrainingSessionFavoriteId(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbTrainingSessionFavoriteId(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbTrainingSessionFavoriteId(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbTrainingSessionFavoriteId var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(Structures$PbTrainingSessionFavoriteId var0, long var1) {
      var0.value_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbTrainingSessionFavoriteId var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(Structures$PbTrainingSessionFavoriteId var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbTrainingSessionFavoriteId getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.I();
   }

   public static Structures$PbTrainingSessionFavoriteId$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbTrainingSessionFavoriteId$Builder newBuilder(Structures$PbTrainingSessionFavoriteId var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbTrainingSessionFavoriteId parseDelimitedFrom(InputStream var0) {
      return (Structures$PbTrainingSessionFavoriteId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbTrainingSessionFavoriteId parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbTrainingSessionFavoriteId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbTrainingSessionFavoriteId parseFrom(ByteString var0) {
      return (Structures$PbTrainingSessionFavoriteId)PARSER.parseFrom(var0);
   }

   public static Structures$PbTrainingSessionFavoriteId parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbTrainingSessionFavoriteId)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbTrainingSessionFavoriteId parseFrom(CodedInputStream var0) {
      return (Structures$PbTrainingSessionFavoriteId)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbTrainingSessionFavoriteId parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbTrainingSessionFavoriteId)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbTrainingSessionFavoriteId parseFrom(InputStream var0) {
      return (Structures$PbTrainingSessionFavoriteId)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbTrainingSessionFavoriteId parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbTrainingSessionFavoriteId)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbTrainingSessionFavoriteId parseFrom(byte[] var0) {
      return (Structures$PbTrainingSessionFavoriteId)PARSER.parseFrom(var0);
   }

   public static Structures$PbTrainingSessionFavoriteId parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbTrainingSessionFavoriteId)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbTrainingSessionFavoriteId)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbTrainingSessionFavoriteId var5 = (Structures$PbTrainingSessionFavoriteId)var1;
            boolean var3;
            if (this.hasValue() == var5.hasValue()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasValue()) {
               if (var3 && this.getValue() == var5.getValue()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastModified() == var5.hasLastModified()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLastModified()) {
               if (var4 && this.getLastModified().equals(var5.getLastModified())) {
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

   public Structures$PbTrainingSessionFavoriteId getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeUInt64Size(1, this.value_);
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

   public long getValue() {
      return this.value_;
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
            var1 = (var2 * 37 + 1) * 53 + Internal.hashLong(this.getValue());
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
      return Structures.J().ensureFieldAccessorsInitialized(Structures$PbTrainingSessionFavoriteId.class, Structures$PbTrainingSessionFavoriteId$Builder.class);
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
         } else if (this.hasLastModified() && !this.getLastModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbTrainingSessionFavoriteId$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbTrainingSessionFavoriteId$Builder(var1, (Structures$1)null);
   }

   public Structures$PbTrainingSessionFavoriteId$Builder toBuilder() {
      Structures$PbTrainingSessionFavoriteId$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbTrainingSessionFavoriteId$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbTrainingSessionFavoriteId$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt64(1, this.value_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getLastModified());
      }

      this.unknownFields.writeTo(var1);
   }
}
