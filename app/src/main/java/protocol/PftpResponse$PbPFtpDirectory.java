package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class PftpResponse$PbPFtpDirectory extends GeneratedMessageV3 implements PftpResponse$PbPFtpDirectoryOrBuilder {
   private static final PftpResponse$PbPFtpDirectory DEFAULT_INSTANCE = new PftpResponse$PbPFtpDirectory();
   public static final int ENTRIES_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new PftpResponse$PbPFtpDirectory$1();
   private static final long serialVersionUID = 0L;
   private List entries_;
   private byte memoizedIsInitialized;

   private PftpResponse$PbPFtpDirectory() {
      this.memoizedIsInitialized = (byte)-1;
      this.entries_ = Collections.emptyList();
   }

   private PftpResponse$PbPFtpDirectory(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpDirectory(CodedInputStream var1, ExtensionRegistryLite var2, PftpResponse$1 var3) {
      this(var1, var2);
   }

   private PftpResponse$PbPFtpDirectory(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpDirectory(Builder var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static List a(PftpResponse$PbPFtpDirectory var0) {
      return var0.entries_;
   }

   // $FF: synthetic method
   static List a(PftpResponse$PbPFtpDirectory var0, List var1) {
      var0.entries_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(PftpResponse$PbPFtpDirectory var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   public static PftpResponse$PbPFtpDirectory getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.c();
   }

   public static PftpResponse$PbPFtpDirectory$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpResponse$PbPFtpDirectory$Builder newBuilder(PftpResponse$PbPFtpDirectory var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpResponse$PbPFtpDirectory parseDelimitedFrom(InputStream var0) {
      return (PftpResponse$PbPFtpDirectory)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpDirectory parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpDirectory)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpDirectory parseFrom(ByteString var0) {
      return (PftpResponse$PbPFtpDirectory)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpDirectory parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpDirectory)PARSER.parseFrom(var0, var1);
   }

   public static PftpResponse$PbPFtpDirectory parseFrom(CodedInputStream var0) {
      return (PftpResponse$PbPFtpDirectory)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpDirectory parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpDirectory)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpDirectory parseFrom(InputStream var0) {
      return (PftpResponse$PbPFtpDirectory)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpDirectory parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpDirectory)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpDirectory parseFrom(byte[] var0) {
      return (PftpResponse$PbPFtpDirectory)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpDirectory parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpDirectory)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpResponse$PbPFtpDirectory)) {
            var2 = super.equals(var1);
         } else {
            PftpResponse$PbPFtpDirectory var4 = (PftpResponse$PbPFtpDirectory)var1;
            boolean var3;
            if (this.getEntriesList().equals(var4.getEntriesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (!var3 || !this.unknownFields.equals(var4.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public PftpResponse$PbPFtpDirectory getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public PftpResponse$PbPFtpEntry getEntries(int var1) {
      return (PftpResponse$PbPFtpEntry)this.entries_.get(var1);
   }

   public int getEntriesCount() {
      return this.entries_.size();
   }

   public List getEntriesList() {
      return this.entries_;
   }

   public PftpResponse$PbPFtpEntryOrBuilder getEntriesOrBuilder(int var1) {
      return (PftpResponse$PbPFtpEntryOrBuilder)this.entries_.get(var1);
   }

   public List getEntriesOrBuilderList() {
      return this.entries_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;

         for(var1 = 0; var2 < this.entries_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(1, (MessageLite)this.entries_.get(var2));
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.getEntriesCount() > 0) {
            var1 = (var2 * 37 + 1) * 53 + this.getEntriesList().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.d().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpDirectory.class, PftpResponse$PbPFtpDirectory$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      byte var2 = this.memoizedIsInitialized;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = var1;
         if (var2 != 0) {
            int var4 = 0;

            while(true) {
               if (var4 >= this.getEntriesCount()) {
                  this.memoizedIsInitialized = (byte)1;
                  var3 = true;
                  break;
               }

               if (!this.getEntries(var4).isInitialized()) {
                  this.memoizedIsInitialized = (byte)0;
                  var3 = var1;
                  break;
               }

               ++var4;
            }
         }
      }

      return var3;
   }

   public PftpResponse$PbPFtpDirectory$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpResponse$PbPFtpDirectory$Builder newBuilderForType(BuilderParent var1) {
      return new PftpResponse$PbPFtpDirectory$Builder(var1, (PftpResponse$1)null);
   }

   public PftpResponse$PbPFtpDirectory$Builder toBuilder() {
      PftpResponse$PbPFtpDirectory$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpResponse$PbPFtpDirectory$Builder((PftpResponse$1)null);
      } else {
         var1 = (new PftpResponse$PbPFtpDirectory$Builder((PftpResponse$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      for(int var2 = 0; var2 < this.entries_.size(); ++var2) {
         var1.writeMessage(1, (MessageLite)this.entries_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
