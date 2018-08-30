package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class SyncInfo$PbSyncInfo extends GeneratedMessageV3 implements SyncInfo$PbSyncInfoOrBuilder {
   public static final int CHANGED_PATH_FIELD_NUMBER = 2;
   private static final SyncInfo$PbSyncInfo DEFAULT_INSTANCE = new SyncInfo$PbSyncInfo();
   public static final int FULL_SYNC_REQUIRED_FIELD_NUMBER = 4;
   public static final int LAST_MODIFIED_FIELD_NUMBER = 1;
   public static final int LAST_SYNCHRONIZED_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new SyncInfo$PbSyncInfo$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private LazyStringList changedPath_;
   private boolean fullSyncRequired_;
   private Types$PbSystemDateTime lastModified_;
   private Types$PbSystemDateTime lastSynchronized_;
   private byte memoizedIsInitialized;

   private SyncInfo$PbSyncInfo() {
      this.memoizedIsInitialized = (byte)-1;
      this.changedPath_ = LazyStringArrayList.EMPTY;
      this.fullSyncRequired_ = true;
   }

   private SyncInfo$PbSyncInfo(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SyncInfo$PbSyncInfo(CodedInputStream var1, ExtensionRegistryLite var2, SyncInfo$1 var3) {
      this(var1, var2);
   }

   private SyncInfo$PbSyncInfo(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SyncInfo$PbSyncInfo(Builder var1, SyncInfo$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SyncInfo$PbSyncInfo var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static LazyStringList a(SyncInfo$PbSyncInfo var0) {
      return var0.changedPath_;
   }

   // $FF: synthetic method
   static LazyStringList a(SyncInfo$PbSyncInfo var0, LazyStringList var1) {
      var0.changedPath_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(SyncInfo$PbSyncInfo var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(SyncInfo$PbSyncInfo var0, boolean var1) {
      var0.fullSyncRequired_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(SyncInfo$PbSyncInfo var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime b(SyncInfo$PbSyncInfo var0, Types$PbSystemDateTime var1) {
      var0.lastSynchronized_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static SyncInfo$PbSyncInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SyncInfo.a();
   }

   public static SyncInfo$PbSyncInfo$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SyncInfo$PbSyncInfo$Builder newBuilder(SyncInfo$PbSyncInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SyncInfo$PbSyncInfo parseDelimitedFrom(InputStream var0) {
      return (SyncInfo$PbSyncInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SyncInfo$PbSyncInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SyncInfo$PbSyncInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SyncInfo$PbSyncInfo parseFrom(ByteString var0) {
      return (SyncInfo$PbSyncInfo)PARSER.parseFrom(var0);
   }

   public static SyncInfo$PbSyncInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SyncInfo$PbSyncInfo)PARSER.parseFrom(var0, var1);
   }

   public static SyncInfo$PbSyncInfo parseFrom(CodedInputStream var0) {
      return (SyncInfo$PbSyncInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SyncInfo$PbSyncInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SyncInfo$PbSyncInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SyncInfo$PbSyncInfo parseFrom(InputStream var0) {
      return (SyncInfo$PbSyncInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SyncInfo$PbSyncInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SyncInfo$PbSyncInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SyncInfo$PbSyncInfo parseFrom(byte[] var0) {
      return (SyncInfo$PbSyncInfo)PARSER.parseFrom(var0);
   }

   public static SyncInfo$PbSyncInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SyncInfo$PbSyncInfo)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SyncInfo$PbSyncInfo)) {
            var2 = super.equals(var1);
         } else {
            SyncInfo$PbSyncInfo var5 = (SyncInfo$PbSyncInfo)var1;
            boolean var3;
            if (this.hasLastModified() == var5.hasLastModified()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasLastModified()) {
               if (var3 && this.getLastModified().equals(var5.getLastModified())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getChangedPathList().equals(var5.getChangedPathList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.hasLastSynchronized() == var5.hasLastSynchronized()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLastSynchronized()) {
               if (var4 && this.getLastSynchronized().equals(var5.getLastSynchronized())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasFullSyncRequired() == var5.hasFullSyncRequired()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFullSyncRequired()) {
               if (var4 && this.getFullSyncRequired() == var5.getFullSyncRequired()) {
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

   public String getChangedPath(int var1) {
      return (String)this.changedPath_.get(var1);
   }

   public ByteString getChangedPathBytes(int var1) {
      return this.changedPath_.getByteString(var1);
   }

   public int getChangedPathCount() {
      return this.changedPath_.size();
   }

   public ProtocolStringList getChangedPathList() {
      return this.changedPath_;
   }

   public SyncInfo$PbSyncInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getFullSyncRequired() {
      return this.fullSyncRequired_;
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

   public Types$PbSystemDateTime getLastSynchronized() {
      Types$PbSystemDateTime var1;
      if (this.lastSynchronized_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastSynchronized_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastSynchronizedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastSynchronized_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastSynchronized_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         if ((this.bitField0_ & 1) == 1) {
            var2 = CodedOutputStream.computeMessageSize(1, this.getLastModified()) + 0;
         } else {
            var2 = 0;
         }

         int var3;
         for(var3 = 0; var1 < this.changedPath_.size(); ++var1) {
            var3 += computeStringSizeNoTag(this.changedPath_.getRaw(var1));
         }

         var3 = var2 + var3 + this.getChangedPathList().size() * 1;
         var2 = var3;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var3 + CodedOutputStream.computeMessageSize(3, this.getLastSynchronized());
         }

         var3 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var3 = var2 + CodedOutputStream.computeBoolSize(4, this.fullSyncRequired_);
         }

         var2 = var3 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var2;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasFullSyncRequired() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastSynchronized() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
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
         if (this.hasLastModified()) {
            var1 = (var2 * 37 + 1) * 53 + this.getLastModified().hashCode();
         }

         var2 = var1;
         if (this.getChangedPathCount() > 0) {
            var2 = (var1 * 37 + 2) * 53 + this.getChangedPathList().hashCode();
         }

         var1 = var2;
         if (this.hasLastSynchronized()) {
            var1 = (var2 * 37 + 3) * 53 + this.getLastSynchronized().hashCode();
         }

         var2 = var1;
         if (this.hasFullSyncRequired()) {
            var2 = (var1 * 37 + 4) * 53 + Internal.hashBoolean(this.getFullSyncRequired());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SyncInfo.b().ensureFieldAccessorsInitialized(SyncInfo$PbSyncInfo.class, SyncInfo$PbSyncInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasLastModified()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getLastModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasLastSynchronized() && !this.getLastSynchronized().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SyncInfo$PbSyncInfo$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SyncInfo$PbSyncInfo$Builder newBuilderForType(BuilderParent var1) {
      return new SyncInfo$PbSyncInfo$Builder(var1, (SyncInfo$1)null);
   }

   public SyncInfo$PbSyncInfo$Builder toBuilder() {
      SyncInfo$PbSyncInfo$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SyncInfo$PbSyncInfo$Builder((SyncInfo$1)null);
      } else {
         var1 = (new SyncInfo$PbSyncInfo$Builder((SyncInfo$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getLastModified());
      }

      for(int var2 = 0; var2 < this.changedPath_.size(); ++var2) {
         GeneratedMessageV3.writeString(var1, 2, this.changedPath_.getRaw(var2));
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(3, this.getLastSynchronized());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeBool(4, this.fullSyncRequired_);
      }

      this.unknownFields.writeTo(var1);
   }
}
