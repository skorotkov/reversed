package protocol;

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
import fi.polar.remote.representation.protobuf.Types$PbSystemDateTime;
import fi.polar.remote.representation.protobuf.Types$PbSystemDateTimeOrBuilder;
import java.io.InputStream;

public final class PftpResponse$PbPFtpEntry extends GeneratedMessageV3 implements PftpResponse$PbPFtpEntryOrBuilder {
   public static final int CREATED_FIELD_NUMBER = 3;
   private static final PftpResponse$PbPFtpEntry DEFAULT_INSTANCE = new PftpResponse$PbPFtpEntry();
   public static final int MODIFIED_FIELD_NUMBER = 4;
   public static final int NAME_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new PftpResponse$PbPFtpEntry$1();
   public static final int SIZE_FIELD_NUMBER = 2;
   public static final int TOUCHED_FIELD_NUMBER = 5;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbSystemDateTime created_;
   private byte memoizedIsInitialized;
   private Types$PbSystemDateTime modified_;
   private volatile Object name_;
   private long size_;
   private Types$PbSystemDateTime touched_;

   private PftpResponse$PbPFtpEntry() {
      this.memoizedIsInitialized = (byte)-1;
      this.name_ = "";
      this.size_ = 0L;
   }

   private PftpResponse$PbPFtpEntry(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpEntry(CodedInputStream var1, ExtensionRegistryLite var2, PftpResponse$1 var3) {
      this(var1, var2);
   }

   private PftpResponse$PbPFtpEntry(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpEntry(Builder var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpResponse$PbPFtpEntry var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(PftpResponse$PbPFtpEntry var0, long var1) {
      var0.size_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(PftpResponse$PbPFtpEntry var0, Types$PbSystemDateTime var1) {
      var0.created_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(PftpResponse$PbPFtpEntry var0) {
      return var0.name_;
   }

   // $FF: synthetic method
   static Object a(PftpResponse$PbPFtpEntry var0, Object var1) {
      var0.name_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(PftpResponse$PbPFtpEntry var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime b(PftpResponse$PbPFtpEntry var0, Types$PbSystemDateTime var1) {
      var0.modified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime c(PftpResponse$PbPFtpEntry var0, Types$PbSystemDateTime var1) {
      var0.touched_ = var1;
      return var1;
   }

   public static PftpResponse$PbPFtpEntry getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.a();
   }

   public static PftpResponse$PbPFtpEntry$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpResponse$PbPFtpEntry$Builder newBuilder(PftpResponse$PbPFtpEntry var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpResponse$PbPFtpEntry parseDelimitedFrom(InputStream var0) {
      return (PftpResponse$PbPFtpEntry)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpEntry parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpEntry)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpEntry parseFrom(ByteString var0) {
      return (PftpResponse$PbPFtpEntry)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpEntry parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpEntry)PARSER.parseFrom(var0, var1);
   }

   public static PftpResponse$PbPFtpEntry parseFrom(CodedInputStream var0) {
      return (PftpResponse$PbPFtpEntry)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpEntry parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpEntry)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpEntry parseFrom(InputStream var0) {
      return (PftpResponse$PbPFtpEntry)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpEntry parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpEntry)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpEntry parseFrom(byte[] var0) {
      return (PftpResponse$PbPFtpEntry)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpEntry parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpEntry)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpResponse$PbPFtpEntry)) {
            var2 = super.equals(var1);
         } else {
            PftpResponse$PbPFtpEntry var5 = (PftpResponse$PbPFtpEntry)var1;
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

            if (var4 && this.hasSize() == var5.hasSize()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSize()) {
               if (var3 && this.getSize() == var5.getSize()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCreated() == var5.hasCreated()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasCreated()) {
               if (var4 && this.getCreated().equals(var5.getCreated())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasModified() == var5.hasModified()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasModified()) {
               if (var4 && this.getModified().equals(var5.getModified())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasTouched() == var5.hasTouched()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTouched()) {
               if (var3 && this.getTouched().equals(var5.getTouched())) {
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

   public PftpResponse$PbPFtpEntry getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbSystemDateTime getModified() {
      Types$PbSystemDateTime var1;
      if (this.modified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.modified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.modified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.modified_;
      }

      return var1;
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
            var1 = var2 + CodedOutputStream.computeUInt64Size(2, this.size_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getCreated());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeMessageSize(4, this.getModified());
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeMessageSize(5, this.getTouched());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public long getSize() {
      return this.size_;
   }

   public Types$PbSystemDateTime getTouched() {
      Types$PbSystemDateTime var1;
      if (this.touched_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.touched_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getTouchedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.touched_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.touched_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCreated() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasModified() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
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

   public boolean hasSize() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTouched() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
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
         if (this.hasName()) {
            var1 = (var2 * 37 + 1) * 53 + this.getName().hashCode();
         }

         var2 = var1;
         if (this.hasSize()) {
            var2 = (var1 * 37 + 2) * 53 + Internal.hashLong(this.getSize());
         }

         var1 = var2;
         if (this.hasCreated()) {
            var1 = (var2 * 37 + 3) * 53 + this.getCreated().hashCode();
         }

         var2 = var1;
         if (this.hasModified()) {
            var2 = (var1 * 37 + 4) * 53 + this.getModified().hashCode();
         }

         var1 = var2;
         if (this.hasTouched()) {
            var1 = (var2 * 37 + 5) * 53 + this.getTouched().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.b().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpEntry.class, PftpResponse$PbPFtpEntry$Builder.class);
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
         } else if (!this.hasSize()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasCreated() && !this.getCreated().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasModified() && !this.getModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasTouched() && !this.getTouched().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpResponse$PbPFtpEntry$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpResponse$PbPFtpEntry$Builder newBuilderForType(BuilderParent var1) {
      return new PftpResponse$PbPFtpEntry$Builder(var1, (PftpResponse$1)null);
   }

   public PftpResponse$PbPFtpEntry$Builder toBuilder() {
      PftpResponse$PbPFtpEntry$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpResponse$PbPFtpEntry$Builder((PftpResponse$1)null);
      } else {
         var1 = (new PftpResponse$PbPFtpEntry$Builder((PftpResponse$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt64(2, this.size_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getCreated());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getModified());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getTouched());
      }

      this.unknownFields.writeTo(var1);
   }
}
