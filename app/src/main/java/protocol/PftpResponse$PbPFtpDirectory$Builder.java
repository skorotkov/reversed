package protocol;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PftpResponse$PbPFtpDirectory$Builder extends Builder implements PftpResponse$PbPFtpDirectoryOrBuilder {
   private int bitField0_;
   private RepeatedFieldBuilderV3 entriesBuilder_;
   private List entries_;

   private PftpResponse$PbPFtpDirectory$Builder() {
      this.entries_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private PftpResponse$PbPFtpDirectory$Builder(BuilderParent var1) {
      super(var1);
      this.entries_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpDirectory$Builder(BuilderParent var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpDirectory$Builder(PftpResponse$1 var1) {
      this();
   }

   private void ensureEntriesIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.entries_ = new ArrayList(this.entries_);
         this.bitField0_ |= 1;
      }

   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.c();
   }

   private RepeatedFieldBuilderV3 getEntriesFieldBuilder() {
      boolean var1 = true;
      if (this.entriesBuilder_ == null) {
         List var2 = this.entries_;
         if ((this.bitField0_ & 1) != 1) {
            var1 = false;
         }

         this.entriesBuilder_ = new RepeatedFieldBuilderV3(var2, var1, this.getParentForChildren(), this.isClean());
         this.entries_ = null;
      }

      return this.entriesBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (PftpResponse$PbPFtpDirectory.b()) {
         this.getEntriesFieldBuilder();
      }

   }

   public PftpResponse$PbPFtpDirectory$Builder addAllEntries(Iterable var1) {
      if (this.entriesBuilder_ == null) {
         this.ensureEntriesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.entries_);
         this.onChanged();
      } else {
         this.entriesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public PftpResponse$PbPFtpDirectory$Builder addEntries(int var1, PftpResponse$PbPFtpEntry$Builder var2) {
      if (this.entriesBuilder_ == null) {
         this.ensureEntriesIsMutable();
         this.entries_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.entriesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public PftpResponse$PbPFtpDirectory$Builder addEntries(int var1, PftpResponse$PbPFtpEntry var2) {
      if (this.entriesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureEntriesIsMutable();
         this.entries_.add(var1, var2);
         this.onChanged();
      } else {
         this.entriesBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public PftpResponse$PbPFtpDirectory$Builder addEntries(PftpResponse$PbPFtpEntry$Builder var1) {
      if (this.entriesBuilder_ == null) {
         this.ensureEntriesIsMutable();
         this.entries_.add(var1.build());
         this.onChanged();
      } else {
         this.entriesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public PftpResponse$PbPFtpDirectory$Builder addEntries(PftpResponse$PbPFtpEntry var1) {
      if (this.entriesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureEntriesIsMutable();
         this.entries_.add(var1);
         this.onChanged();
      } else {
         this.entriesBuilder_.addMessage(var1);
      }

      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder addEntriesBuilder() {
      return (PftpResponse$PbPFtpEntry$Builder)this.getEntriesFieldBuilder().addBuilder(PftpResponse$PbPFtpEntry.getDefaultInstance());
   }

   public PftpResponse$PbPFtpEntry$Builder addEntriesBuilder(int var1) {
      return (PftpResponse$PbPFtpEntry$Builder)this.getEntriesFieldBuilder().addBuilder(var1, PftpResponse$PbPFtpEntry.getDefaultInstance());
   }

   public PftpResponse$PbPFtpDirectory$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpDirectory$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpResponse$PbPFtpDirectory build() {
      PftpResponse$PbPFtpDirectory var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpResponse$PbPFtpDirectory buildPartial() {
      PftpResponse$PbPFtpDirectory var1 = new PftpResponse$PbPFtpDirectory(this, (PftpResponse$1)null);
      int var2 = this.bitField0_;
      if (this.entriesBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.entries_ = Collections.unmodifiableList(this.entries_);
            this.bitField0_ &= -2;
         }

         PftpResponse$PbPFtpDirectory.a(var1, this.entries_);
      } else {
         PftpResponse$PbPFtpDirectory.a(var1, this.entriesBuilder_.build());
      }

      this.onBuilt();
      return var1;
   }

   public PftpResponse$PbPFtpDirectory$Builder clear() {
      super.clear();
      if (this.entriesBuilder_ == null) {
         this.entries_ = Collections.emptyList();
         this.bitField0_ &= -2;
      } else {
         this.entriesBuilder_.clear();
      }

      return this;
   }

   public PftpResponse$PbPFtpDirectory$Builder clearEntries() {
      if (this.entriesBuilder_ == null) {
         this.entries_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.entriesBuilder_.clear();
      }

      return this;
   }

   public PftpResponse$PbPFtpDirectory$Builder clearField(FieldDescriptor var1) {
      return (PftpResponse$PbPFtpDirectory$Builder)super.clearField(var1);
   }

   public PftpResponse$PbPFtpDirectory$Builder clearOneof(OneofDescriptor var1) {
      return (PftpResponse$PbPFtpDirectory$Builder)super.clearOneof(var1);
   }

   public PftpResponse$PbPFtpDirectory$Builder clone() {
      return (PftpResponse$PbPFtpDirectory$Builder)super.clone();
   }

   public PftpResponse$PbPFtpDirectory getDefaultInstanceForType() {
      return PftpResponse$PbPFtpDirectory.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpResponse.c();
   }

   public PftpResponse$PbPFtpEntry getEntries(int var1) {
      PftpResponse$PbPFtpEntry var2;
      if (this.entriesBuilder_ == null) {
         var2 = (PftpResponse$PbPFtpEntry)this.entries_.get(var1);
      } else {
         var2 = (PftpResponse$PbPFtpEntry)this.entriesBuilder_.getMessage(var1);
      }

      return var2;
   }

   public PftpResponse$PbPFtpEntry$Builder getEntriesBuilder(int var1) {
      return (PftpResponse$PbPFtpEntry$Builder)this.getEntriesFieldBuilder().getBuilder(var1);
   }

   public List getEntriesBuilderList() {
      return this.getEntriesFieldBuilder().getBuilderList();
   }

   public int getEntriesCount() {
      int var1;
      if (this.entriesBuilder_ == null) {
         var1 = this.entries_.size();
      } else {
         var1 = this.entriesBuilder_.getCount();
      }

      return var1;
   }

   public List getEntriesList() {
      List var1;
      if (this.entriesBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.entries_);
      } else {
         var1 = this.entriesBuilder_.getMessageList();
      }

      return var1;
   }

   public PftpResponse$PbPFtpEntryOrBuilder getEntriesOrBuilder(int var1) {
      PftpResponse$PbPFtpEntryOrBuilder var2;
      if (this.entriesBuilder_ == null) {
         var2 = (PftpResponse$PbPFtpEntryOrBuilder)this.entries_.get(var1);
      } else {
         var2 = (PftpResponse$PbPFtpEntryOrBuilder)this.entriesBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getEntriesOrBuilderList() {
      List var1;
      if (this.entriesBuilder_ != null) {
         var1 = this.entriesBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.entries_);
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.d().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpDirectory.class, PftpResponse$PbPFtpDirectory$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      int var2 = 0;

      while(true) {
         if (var2 >= this.getEntriesCount()) {
            var1 = true;
            break;
         }

         if (!this.getEntries(var2).isInitialized()) {
            break;
         }

         ++var2;
      }

      return var1;
   }

   public PftpResponse$PbPFtpDirectory$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpResponse$PbPFtpDirectory var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (PftpResponse$PbPFtpDirectory)PftpResponse$PbPFtpDirectory.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (PftpResponse$PbPFtpDirectory)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var13.unwrapIOException();
         } finally {
            if (var12 != null) {
               this.mergeFrom(var12);
            }

            throw var13;
         }
      }

      if (var12 != null) {
         this.mergeFrom(var12);
      }

      return this;
   }

   public PftpResponse$PbPFtpDirectory$Builder mergeFrom(Message var1) {
      PftpResponse$PbPFtpDirectory$Builder var2;
      if (var1 instanceof PftpResponse$PbPFtpDirectory) {
         var2 = this.mergeFrom((PftpResponse$PbPFtpDirectory)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpResponse$PbPFtpDirectory$Builder mergeFrom(PftpResponse$PbPFtpDirectory var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != PftpResponse$PbPFtpDirectory.getDefaultInstance()) {
         if (this.entriesBuilder_ == null) {
            if (!PftpResponse$PbPFtpDirectory.a(var1).isEmpty()) {
               if (this.entries_.isEmpty()) {
                  this.entries_ = PftpResponse$PbPFtpDirectory.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensureEntriesIsMutable();
                  this.entries_.addAll(PftpResponse$PbPFtpDirectory.a(var1));
               }

               this.onChanged();
            }
         } else if (!PftpResponse$PbPFtpDirectory.a(var1).isEmpty()) {
            if (this.entriesBuilder_.isEmpty()) {
               this.entriesBuilder_.dispose();
               this.entriesBuilder_ = null;
               this.entries_ = PftpResponse$PbPFtpDirectory.a(var1);
               this.bitField0_ &= -2;
               if (PftpResponse$PbPFtpDirectory.c()) {
                  var2 = this.getEntriesFieldBuilder();
               }

               this.entriesBuilder_ = var2;
            } else {
               this.entriesBuilder_.addAllMessages(PftpResponse$PbPFtpDirectory.a(var1));
            }
         }

         this.mergeUnknownFields(PftpResponse$PbPFtpDirectory.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpResponse$PbPFtpDirectory$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpDirectory$Builder)super.mergeUnknownFields(var1);
   }

   public PftpResponse$PbPFtpDirectory$Builder removeEntries(int var1) {
      if (this.entriesBuilder_ == null) {
         this.ensureEntriesIsMutable();
         this.entries_.remove(var1);
         this.onChanged();
      } else {
         this.entriesBuilder_.remove(var1);
      }

      return this;
   }

   public PftpResponse$PbPFtpDirectory$Builder setEntries(int var1, PftpResponse$PbPFtpEntry$Builder var2) {
      if (this.entriesBuilder_ == null) {
         this.ensureEntriesIsMutable();
         this.entries_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.entriesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public PftpResponse$PbPFtpDirectory$Builder setEntries(int var1, PftpResponse$PbPFtpEntry var2) {
      if (this.entriesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureEntriesIsMutable();
         this.entries_.set(var1, var2);
         this.onChanged();
      } else {
         this.entriesBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public PftpResponse$PbPFtpDirectory$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpDirectory$Builder)super.setField(var1, var2);
   }

   public PftpResponse$PbPFtpDirectory$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpResponse$PbPFtpDirectory$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpResponse$PbPFtpDirectory$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpDirectory$Builder)super.setUnknownFields(var1);
   }
}
