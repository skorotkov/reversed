package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SyncInfo$PbSyncInfo$Builder extends Builder implements SyncInfo$PbSyncInfoOrBuilder {
   private int bitField0_;
   private LazyStringList changedPath_;
   private boolean fullSyncRequired_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private SingleFieldBuilderV3 lastSynchronizedBuilder_;
   private Types$PbSystemDateTime lastSynchronized_;

   private SyncInfo$PbSyncInfo$Builder() {
      this.lastModified_ = null;
      this.changedPath_ = LazyStringArrayList.EMPTY;
      this.lastSynchronized_ = null;
      this.fullSyncRequired_ = true;
      this.maybeForceBuilderInitialization();
   }

   private SyncInfo$PbSyncInfo$Builder(BuilderParent var1) {
      super(var1);
      this.lastModified_ = null;
      this.changedPath_ = LazyStringArrayList.EMPTY;
      this.lastSynchronized_ = null;
      this.fullSyncRequired_ = true;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SyncInfo$PbSyncInfo$Builder(BuilderParent var1, SyncInfo$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SyncInfo$PbSyncInfo$Builder(SyncInfo$1 var1) {
      this();
   }

   private void ensureChangedPathIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.changedPath_ = new LazyStringArrayList(this.changedPath_);
         this.bitField0_ |= 2;
      }

   }

   public static final Descriptor getDescriptor() {
      return SyncInfo.a();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private SingleFieldBuilderV3 getLastSynchronizedFieldBuilder() {
      if (this.lastSynchronizedBuilder_ == null) {
         this.lastSynchronizedBuilder_ = new SingleFieldBuilderV3(this.getLastSynchronized(), this.getParentForChildren(), this.isClean());
         this.lastSynchronized_ = null;
      }

      return this.lastSynchronizedBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SyncInfo$PbSyncInfo.b()) {
         this.getLastModifiedFieldBuilder();
         this.getLastSynchronizedFieldBuilder();
      }

   }

   public SyncInfo$PbSyncInfo$Builder addAllChangedPath(Iterable var1) {
      this.ensureChangedPathIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.changedPath_);
      this.onChanged();
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder addChangedPath(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.ensureChangedPathIsMutable();
         this.changedPath_.add(var1);
         this.onChanged();
         return this;
      }
   }

   public SyncInfo$PbSyncInfo$Builder addChangedPathBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.ensureChangedPathIsMutable();
         this.changedPath_.add(var1);
         this.onChanged();
         return this;
      }
   }

   public SyncInfo$PbSyncInfo$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SyncInfo$PbSyncInfo$Builder)super.addRepeatedField(var1, var2);
   }

   public SyncInfo$PbSyncInfo build() {
      SyncInfo$PbSyncInfo var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SyncInfo$PbSyncInfo buildPartial() {
      SyncInfo$PbSyncInfo var1 = new SyncInfo$PbSyncInfo(this, (SyncInfo$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.lastModifiedBuilder_ == null) {
         SyncInfo$PbSyncInfo.a(var1, this.lastModified_);
      } else {
         SyncInfo$PbSyncInfo.a(var1, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      if ((this.bitField0_ & 2) == 2) {
         this.changedPath_ = this.changedPath_.getUnmodifiableView();
         this.bitField0_ &= -3;
      }

      SyncInfo$PbSyncInfo.a(var1, this.changedPath_);
      int var4 = var3;
      if ((var2 & 4) == 4) {
         var4 = var3 | 2;
      }

      if (this.lastSynchronizedBuilder_ == null) {
         SyncInfo$PbSyncInfo.b(var1, this.lastSynchronized_);
      } else {
         SyncInfo$PbSyncInfo.b(var1, (Types$PbSystemDateTime)this.lastSynchronizedBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 8) == 8) {
         var5 = var4 | 4;
      }

      SyncInfo$PbSyncInfo.a(var1, this.fullSyncRequired_);
      SyncInfo$PbSyncInfo.a(var1, var5);
      this.onBuilt();
      return var1;
   }

   public SyncInfo$PbSyncInfo$Builder clear() {
      super.clear();
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -2;
      this.changedPath_ = LazyStringArrayList.EMPTY;
      this.bitField0_ &= -3;
      if (this.lastSynchronizedBuilder_ == null) {
         this.lastSynchronized_ = null;
      } else {
         this.lastSynchronizedBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.fullSyncRequired_ = true;
      this.bitField0_ &= -9;
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder clearChangedPath() {
      this.changedPath_ = LazyStringArrayList.EMPTY;
      this.bitField0_ &= -3;
      this.onChanged();
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder clearField(FieldDescriptor var1) {
      return (SyncInfo$PbSyncInfo$Builder)super.clearField(var1);
   }

   public SyncInfo$PbSyncInfo$Builder clearFullSyncRequired() {
      this.bitField0_ &= -9;
      this.fullSyncRequired_ = true;
      this.onChanged();
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder clearLastSynchronized() {
      if (this.lastSynchronizedBuilder_ == null) {
         this.lastSynchronized_ = null;
         this.onChanged();
      } else {
         this.lastSynchronizedBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder clearOneof(OneofDescriptor var1) {
      return (SyncInfo$PbSyncInfo$Builder)super.clearOneof(var1);
   }

   public SyncInfo$PbSyncInfo$Builder clone() {
      return (SyncInfo$PbSyncInfo$Builder)super.clone();
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
      return this.changedPath_.getUnmodifiableView();
   }

   public SyncInfo$PbSyncInfo getDefaultInstanceForType() {
      return SyncInfo$PbSyncInfo.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SyncInfo.a();
   }

   public boolean getFullSyncRequired() {
      return this.fullSyncRequired_;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModifiedBuilder_ == null) {
         if (this.lastModified_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.lastModified_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.lastModifiedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getLastModifiedBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getLastModifiedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Object var1;
      if (this.lastModifiedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.lastModifiedBuilder_.getMessageOrBuilder();
      } else if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public Types$PbSystemDateTime getLastSynchronized() {
      Types$PbSystemDateTime var1;
      if (this.lastSynchronizedBuilder_ == null) {
         if (this.lastSynchronized_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.lastSynchronized_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.lastSynchronizedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getLastSynchronizedBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getLastSynchronizedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getLastSynchronizedOrBuilder() {
      Object var1;
      if (this.lastSynchronizedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.lastSynchronizedBuilder_.getMessageOrBuilder();
      } else if (this.lastSynchronized_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastSynchronized_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public boolean hasFullSyncRequired() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SyncInfo.b().ensureFieldAccessorsInitialized(SyncInfo$PbSyncInfo.class, SyncInfo$PbSyncInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasLastModified()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.getLastModified().isInitialized()) {
            if (this.hasLastSynchronized()) {
               var2 = var1;
               if (!this.getLastSynchronized().isInitialized()) {
                  return var2;
               }
            }

            var2 = true;
         }
      }

      return var2;
   }

   public SyncInfo$PbSyncInfo$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SyncInfo$PbSyncInfo var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (SyncInfo$PbSyncInfo)SyncInfo$PbSyncInfo.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (SyncInfo$PbSyncInfo)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public SyncInfo$PbSyncInfo$Builder mergeFrom(Message var1) {
      SyncInfo$PbSyncInfo$Builder var2;
      if (var1 instanceof SyncInfo$PbSyncInfo) {
         var2 = this.mergeFrom((SyncInfo$PbSyncInfo)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SyncInfo$PbSyncInfo$Builder mergeFrom(SyncInfo$PbSyncInfo var1) {
      if (var1 != SyncInfo$PbSyncInfo.getDefaultInstance()) {
         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         if (!SyncInfo$PbSyncInfo.a(var1).isEmpty()) {
            if (this.changedPath_.isEmpty()) {
               this.changedPath_ = SyncInfo$PbSyncInfo.a(var1);
               this.bitField0_ &= -3;
            } else {
               this.ensureChangedPathIsMutable();
               this.changedPath_.addAll(SyncInfo$PbSyncInfo.a(var1));
            }

            this.onChanged();
         }

         if (var1.hasLastSynchronized()) {
            this.mergeLastSynchronized(var1.getLastSynchronized());
         }

         if (var1.hasFullSyncRequired()) {
            this.setFullSyncRequired(var1.getFullSyncRequired());
         }

         this.mergeUnknownFields(SyncInfo$PbSyncInfo.b(var1));
         this.onChanged();
      }

      return this;
   }

   public SyncInfo$PbSyncInfo$Builder mergeLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.lastModified_ != null && this.lastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastModified_ = Types$PbSystemDateTime.newBuilder(this.lastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.lastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.lastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder mergeLastSynchronized(Types$PbSystemDateTime var1) {
      if (this.lastSynchronizedBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.lastSynchronized_ != null && this.lastSynchronized_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastSynchronized_ = Types$PbSystemDateTime.newBuilder(this.lastSynchronized_).mergeFrom(var1).buildPartial();
         } else {
            this.lastSynchronized_ = var1;
         }

         this.onChanged();
      } else {
         this.lastSynchronizedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final SyncInfo$PbSyncInfo$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SyncInfo$PbSyncInfo$Builder)super.mergeUnknownFields(var1);
   }

   public SyncInfo$PbSyncInfo$Builder setChangedPath(int var1, String var2) {
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         this.ensureChangedPathIsMutable();
         this.changedPath_.set(var1, var2);
         this.onChanged();
         return this;
      }
   }

   public SyncInfo$PbSyncInfo$Builder setField(FieldDescriptor var1, Object var2) {
      return (SyncInfo$PbSyncInfo$Builder)super.setField(var1, var2);
   }

   public SyncInfo$PbSyncInfo$Builder setFullSyncRequired(boolean var1) {
      this.bitField0_ |= 8;
      this.fullSyncRequired_ = var1;
      this.onChanged();
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder setLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastModified_ = var1;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder setLastSynchronized(Types$PbSystemDateTime$Builder var1) {
      if (this.lastSynchronizedBuilder_ == null) {
         this.lastSynchronized_ = var1.build();
         this.onChanged();
      } else {
         this.lastSynchronizedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder setLastSynchronized(Types$PbSystemDateTime var1) {
      if (this.lastSynchronizedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastSynchronized_ = var1;
         this.onChanged();
      } else {
         this.lastSynchronizedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public SyncInfo$PbSyncInfo$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SyncInfo$PbSyncInfo$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final SyncInfo$PbSyncInfo$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SyncInfo$PbSyncInfo$Builder)super.setUnknownFields(var1);
   }
}
