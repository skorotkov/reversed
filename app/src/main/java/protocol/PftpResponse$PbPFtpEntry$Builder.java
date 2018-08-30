package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import fi.polar.remote.representation.protobuf.Types$PbSystemDateTime;
import fi.polar.remote.representation.protobuf.Types$PbSystemDateTime$Builder;
import fi.polar.remote.representation.protobuf.Types$PbSystemDateTimeOrBuilder;

public final class PftpResponse$PbPFtpEntry$Builder extends Builder implements PftpResponse$PbPFtpEntryOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 createdBuilder_;
   private Types$PbSystemDateTime created_;
   private SingleFieldBuilderV3 modifiedBuilder_;
   private Types$PbSystemDateTime modified_;
   private Object name_;
   private long size_;
   private SingleFieldBuilderV3 touchedBuilder_;
   private Types$PbSystemDateTime touched_;

   private PftpResponse$PbPFtpEntry$Builder() {
      this.name_ = "";
      this.created_ = null;
      this.modified_ = null;
      this.touched_ = null;
      this.maybeForceBuilderInitialization();
   }

   private PftpResponse$PbPFtpEntry$Builder(BuilderParent var1) {
      super(var1);
      this.name_ = "";
      this.created_ = null;
      this.modified_ = null;
      this.touched_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpEntry$Builder(BuilderParent var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpEntry$Builder(PftpResponse$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getCreatedFieldBuilder() {
      if (this.createdBuilder_ == null) {
         this.createdBuilder_ = new SingleFieldBuilderV3(this.getCreated(), this.getParentForChildren(), this.isClean());
         this.created_ = null;
      }

      return this.createdBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.a();
   }

   private SingleFieldBuilderV3 getModifiedFieldBuilder() {
      if (this.modifiedBuilder_ == null) {
         this.modifiedBuilder_ = new SingleFieldBuilderV3(this.getModified(), this.getParentForChildren(), this.isClean());
         this.modified_ = null;
      }

      return this.modifiedBuilder_;
   }

   private SingleFieldBuilderV3 getTouchedFieldBuilder() {
      if (this.touchedBuilder_ == null) {
         this.touchedBuilder_ = new SingleFieldBuilderV3(this.getTouched(), this.getParentForChildren(), this.isClean());
         this.touched_ = null;
      }

      return this.touchedBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (PftpResponse$PbPFtpEntry.b()) {
         this.getCreatedFieldBuilder();
         this.getModifiedFieldBuilder();
         this.getTouchedFieldBuilder();
      }

   }

   public PftpResponse$PbPFtpEntry$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpEntry$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpResponse$PbPFtpEntry build() {
      PftpResponse$PbPFtpEntry var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpResponse$PbPFtpEntry buildPartial() {
      byte var1 = 1;
      PftpResponse$PbPFtpEntry var2 = new PftpResponse$PbPFtpEntry(this, (PftpResponse$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpResponse$PbPFtpEntry.a(var2, this.name_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpResponse$PbPFtpEntry.a(var2, this.size_);
      if ((var3 & 4) == 4) {
         var4 |= 4;
      }

      if (this.createdBuilder_ == null) {
         PftpResponse$PbPFtpEntry.a(var2, this.created_);
      } else {
         PftpResponse$PbPFtpEntry.a(var2, (Types$PbSystemDateTime)this.createdBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 8) == 8) {
         var5 = var4 | 8;
      }

      if (this.modifiedBuilder_ == null) {
         PftpResponse$PbPFtpEntry.b(var2, this.modified_);
      } else {
         PftpResponse$PbPFtpEntry.b(var2, (Types$PbSystemDateTime)this.modifiedBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 16) == 16) {
         var4 = var5 | 16;
      }

      if (this.touchedBuilder_ == null) {
         PftpResponse$PbPFtpEntry.c(var2, this.touched_);
      } else {
         PftpResponse$PbPFtpEntry.c(var2, (Types$PbSystemDateTime)this.touchedBuilder_.build());
      }

      PftpResponse$PbPFtpEntry.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpResponse$PbPFtpEntry$Builder clear() {
      super.clear();
      this.name_ = "";
      this.bitField0_ &= -2;
      this.size_ = 0L;
      this.bitField0_ &= -3;
      if (this.createdBuilder_ == null) {
         this.created_ = null;
      } else {
         this.createdBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.modifiedBuilder_ == null) {
         this.modified_ = null;
      } else {
         this.modifiedBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.touchedBuilder_ == null) {
         this.touched_ = null;
      } else {
         this.touchedBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder clearCreated() {
      if (this.createdBuilder_ == null) {
         this.created_ = null;
         this.onChanged();
      } else {
         this.createdBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder clearField(FieldDescriptor var1) {
      return (PftpResponse$PbPFtpEntry$Builder)super.clearField(var1);
   }

   public PftpResponse$PbPFtpEntry$Builder clearModified() {
      if (this.modifiedBuilder_ == null) {
         this.modified_ = null;
         this.onChanged();
      } else {
         this.modifiedBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder clearName() {
      this.bitField0_ &= -2;
      this.name_ = PftpResponse$PbPFtpEntry.getDefaultInstance().getName();
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder clearOneof(OneofDescriptor var1) {
      return (PftpResponse$PbPFtpEntry$Builder)super.clearOneof(var1);
   }

   public PftpResponse$PbPFtpEntry$Builder clearSize() {
      this.bitField0_ &= -3;
      this.size_ = 0L;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder clearTouched() {
      if (this.touchedBuilder_ == null) {
         this.touched_ = null;
         this.onChanged();
      } else {
         this.touchedBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder clone() {
      return (PftpResponse$PbPFtpEntry$Builder)super.clone();
   }

   public Types$PbSystemDateTime getCreated() {
      Types$PbSystemDateTime var1;
      if (this.createdBuilder_ == null) {
         if (this.created_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.created_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.createdBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getCreatedBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getCreatedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getCreatedOrBuilder() {
      Object var1;
      if (this.createdBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.createdBuilder_.getMessageOrBuilder();
      } else if (this.created_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.created_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public PftpResponse$PbPFtpEntry getDefaultInstanceForType() {
      return PftpResponse$PbPFtpEntry.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpResponse.a();
   }

   public Types$PbSystemDateTime getModified() {
      Types$PbSystemDateTime var1;
      if (this.modifiedBuilder_ == null) {
         if (this.modified_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.modified_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.modifiedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getModifiedBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getModifiedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getModifiedOrBuilder() {
      Object var1;
      if (this.modifiedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.modifiedBuilder_.getMessageOrBuilder();
      } else if (this.modified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.modified_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public String getName() {
      Object var1 = this.name_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.name_ = var3;
         }
      } else {
         var3 = (String)var1;
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

   public long getSize() {
      return this.size_;
   }

   public Types$PbSystemDateTime getTouched() {
      Types$PbSystemDateTime var1;
      if (this.touchedBuilder_ == null) {
         if (this.touched_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.touched_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.touchedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getTouchedBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getTouchedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getTouchedOrBuilder() {
      Object var1;
      if (this.touchedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.touchedBuilder_.getMessageOrBuilder();
      } else if (this.touched_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.touched_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.b().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpEntry.class, PftpResponse$PbPFtpEntry$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasName()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasSize()) {
            if (this.hasCreated()) {
               var2 = var1;
               if (!this.getCreated().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasModified()) {
               var2 = var1;
               if (!this.getModified().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasTouched()) {
               var2 = var1;
               if (!this.getTouched().isInitialized()) {
                  return var2;
               }
            }

            var2 = true;
         }
      }

      return var2;
   }

   public PftpResponse$PbPFtpEntry$Builder mergeCreated(Types$PbSystemDateTime var1) {
      if (this.createdBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.created_ != null && this.created_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.created_ = Types$PbSystemDateTime.newBuilder(this.created_).mergeFrom(var1).buildPartial();
         } else {
            this.created_ = var1;
         }

         this.onChanged();
      } else {
         this.createdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpResponse$PbPFtpEntry var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpResponse$PbPFtpEntry var14;
         try {
            var13 = (PftpResponse$PbPFtpEntry)PftpResponse$PbPFtpEntry.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpResponse$PbPFtpEntry)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder mergeFrom(Message var1) {
      PftpResponse$PbPFtpEntry$Builder var2;
      if (var1 instanceof PftpResponse$PbPFtpEntry) {
         var2 = this.mergeFrom((PftpResponse$PbPFtpEntry)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpResponse$PbPFtpEntry$Builder mergeFrom(PftpResponse$PbPFtpEntry var1) {
      if (var1 != PftpResponse$PbPFtpEntry.getDefaultInstance()) {
         if (var1.hasName()) {
            this.bitField0_ |= 1;
            this.name_ = PftpResponse$PbPFtpEntry.a(var1);
            this.onChanged();
         }

         if (var1.hasSize()) {
            this.setSize(var1.getSize());
         }

         if (var1.hasCreated()) {
            this.mergeCreated(var1.getCreated());
         }

         if (var1.hasModified()) {
            this.mergeModified(var1.getModified());
         }

         if (var1.hasTouched()) {
            this.mergeTouched(var1.getTouched());
         }

         this.mergeUnknownFields(PftpResponse$PbPFtpEntry.b(var1));
         this.onChanged();
      }

      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder mergeModified(Types$PbSystemDateTime var1) {
      if (this.modifiedBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.modified_ != null && this.modified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.modified_ = Types$PbSystemDateTime.newBuilder(this.modified_).mergeFrom(var1).buildPartial();
         } else {
            this.modified_ = var1;
         }

         this.onChanged();
      } else {
         this.modifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder mergeTouched(Types$PbSystemDateTime var1) {
      if (this.touchedBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.touched_ != null && this.touched_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.touched_ = Types$PbSystemDateTime.newBuilder(this.touched_).mergeFrom(var1).buildPartial();
         } else {
            this.touched_ = var1;
         }

         this.onChanged();
      } else {
         this.touchedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public final PftpResponse$PbPFtpEntry$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpEntry$Builder)super.mergeUnknownFields(var1);
   }

   public PftpResponse$PbPFtpEntry$Builder setCreated(Types$PbSystemDateTime$Builder var1) {
      if (this.createdBuilder_ == null) {
         this.created_ = var1.build();
         this.onChanged();
      } else {
         this.createdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder setCreated(Types$PbSystemDateTime var1) {
      if (this.createdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.created_ = var1;
         this.onChanged();
      } else {
         this.createdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpEntry$Builder)super.setField(var1, var2);
   }

   public PftpResponse$PbPFtpEntry$Builder setModified(Types$PbSystemDateTime$Builder var1) {
      if (this.modifiedBuilder_ == null) {
         this.modified_ = var1.build();
         this.onChanged();
      } else {
         this.modifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder setModified(Types$PbSystemDateTime var1) {
      if (this.modifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.modified_ = var1;
         this.onChanged();
      } else {
         this.modifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder setName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.name_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpResponse$PbPFtpEntry$Builder setNameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.name_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpResponse$PbPFtpEntry$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpResponse$PbPFtpEntry$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpResponse$PbPFtpEntry$Builder setSize(long var1) {
      this.bitField0_ |= 2;
      this.size_ = var1;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder setTouched(Types$PbSystemDateTime$Builder var1) {
      if (this.touchedBuilder_ == null) {
         this.touched_ = var1.build();
         this.onChanged();
      } else {
         this.touchedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public PftpResponse$PbPFtpEntry$Builder setTouched(Types$PbSystemDateTime var1) {
      if (this.touchedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.touched_ = var1;
         this.onChanged();
      } else {
         this.touchedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public final PftpResponse$PbPFtpEntry$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpEntry$Builder)super.setUnknownFields(var1);
   }
}
