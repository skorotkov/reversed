package fi.polar.remote.representation.protobuf;

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

public final class Types$PbSystemDateTime$Builder extends Builder implements Types$PbSystemDateTimeOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 dateBuilder_;
   private Types$PbDate date_;
   private SingleFieldBuilderV3 timeBuilder_;
   private Types$PbTime time_;
   private boolean trusted_;

   private Types$PbSystemDateTime$Builder() {
      this.date_ = null;
      this.time_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Types$PbSystemDateTime$Builder(BuilderParent var1) {
      super(var1);
      this.date_ = null;
      this.time_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbSystemDateTime$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbSystemDateTime$Builder(Types$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getDateFieldBuilder() {
      if (this.dateBuilder_ == null) {
         this.dateBuilder_ = new SingleFieldBuilderV3(this.getDate(), this.getParentForChildren(), this.isClean());
         this.date_ = null;
      }

      return this.dateBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return Types.g();
   }

   private SingleFieldBuilderV3 getTimeFieldBuilder() {
      if (this.timeBuilder_ == null) {
         this.timeBuilder_ = new SingleFieldBuilderV3(this.getTime(), this.getParentForChildren(), this.isClean());
         this.time_ = null;
      }

      return this.timeBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbSystemDateTime.b()) {
         this.getDateFieldBuilder();
         this.getTimeFieldBuilder();
      }

   }

   public Types$PbSystemDateTime$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbSystemDateTime$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbSystemDateTime build() {
      Types$PbSystemDateTime var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbSystemDateTime buildPartial() {
      Types$PbSystemDateTime var1 = new Types$PbSystemDateTime(this, (Types$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.dateBuilder_ == null) {
         Types$PbSystemDateTime.a(var1, this.date_);
      } else {
         Types$PbSystemDateTime.a(var1, (Types$PbDate)this.dateBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.timeBuilder_ == null) {
         Types$PbSystemDateTime.a(var1, this.time_);
      } else {
         Types$PbSystemDateTime.a(var1, (Types$PbTime)this.timeBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      Types$PbSystemDateTime.a(var1, this.trusted_);
      Types$PbSystemDateTime.a(var1, var5);
      this.onBuilt();
      return var1;
   }

   public Types$PbSystemDateTime$Builder clear() {
      super.clear();
      if (this.dateBuilder_ == null) {
         this.date_ = null;
      } else {
         this.dateBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.timeBuilder_ == null) {
         this.time_ = null;
      } else {
         this.timeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.trusted_ = false;
      this.bitField0_ &= -5;
      return this;
   }

   public Types$PbSystemDateTime$Builder clearDate() {
      if (this.dateBuilder_ == null) {
         this.date_ = null;
         this.onChanged();
      } else {
         this.dateBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Types$PbSystemDateTime$Builder clearField(FieldDescriptor var1) {
      return (Types$PbSystemDateTime$Builder)super.clearField(var1);
   }

   public Types$PbSystemDateTime$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbSystemDateTime$Builder)super.clearOneof(var1);
   }

   public Types$PbSystemDateTime$Builder clearTime() {
      if (this.timeBuilder_ == null) {
         this.time_ = null;
         this.onChanged();
      } else {
         this.timeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Types$PbSystemDateTime$Builder clearTrusted() {
      this.bitField0_ &= -5;
      this.trusted_ = false;
      this.onChanged();
      return this;
   }

   public Types$PbSystemDateTime$Builder clone() {
      return (Types$PbSystemDateTime$Builder)super.clone();
   }

   public Types$PbDate getDate() {
      Types$PbDate var1;
      if (this.dateBuilder_ == null) {
         if (this.date_ == null) {
            var1 = Types$PbDate.getDefaultInstance();
         } else {
            var1 = this.date_;
         }
      } else {
         var1 = (Types$PbDate)this.dateBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDate$Builder getDateBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDate$Builder)this.getDateFieldBuilder().getBuilder();
   }

   public Types$PbDateOrBuilder getDateOrBuilder() {
      Object var1;
      if (this.dateBuilder_ != null) {
         var1 = (Types$PbDateOrBuilder)this.dateBuilder_.getMessageOrBuilder();
      } else if (this.date_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.date_;
      }

      return (Types$PbDateOrBuilder)var1;
   }

   public Types$PbSystemDateTime getDefaultInstanceForType() {
      return Types$PbSystemDateTime.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.g();
   }

   public Types$PbTime getTime() {
      Types$PbTime var1;
      if (this.timeBuilder_ == null) {
         if (this.time_ == null) {
            var1 = Types$PbTime.getDefaultInstance();
         } else {
            var1 = this.time_;
         }
      } else {
         var1 = (Types$PbTime)this.timeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbTime$Builder getTimeBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbTime$Builder)this.getTimeFieldBuilder().getBuilder();
   }

   public Types$PbTimeOrBuilder getTimeOrBuilder() {
      Object var1;
      if (this.timeBuilder_ != null) {
         var1 = (Types$PbTimeOrBuilder)this.timeBuilder_.getMessageOrBuilder();
      } else if (this.time_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.time_;
      }

      return (Types$PbTimeOrBuilder)var1;
   }

   public boolean getTrusted() {
      return this.trusted_;
   }

   public boolean hasDate() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrusted() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.h().ensureFieldAccessorsInitialized(Types$PbSystemDateTime.class, Types$PbSystemDateTime$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasDate()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasTime()) {
            var2 = var1;
            if (this.hasTrusted()) {
               var2 = var1;
               if (this.getDate().isInitialized()) {
                  var2 = var1;
                  if (this.getTime().isInitialized()) {
                     var2 = true;
                  }
               }
            }
         }
      }

      return var2;
   }

   public Types$PbSystemDateTime$Builder mergeDate(Types$PbDate var1) {
      if (this.dateBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.date_ != null && this.date_ != Types$PbDate.getDefaultInstance()) {
            this.date_ = Types$PbDate.newBuilder(this.date_).mergeFrom(var1).buildPartial();
         } else {
            this.date_ = var1;
         }

         this.onChanged();
      } else {
         this.dateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Types$PbSystemDateTime$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbSystemDateTime var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Types$PbSystemDateTime)Types$PbSystemDateTime.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Types$PbSystemDateTime)var10.getUnfinishedMessage();
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

   public Types$PbSystemDateTime$Builder mergeFrom(Message var1) {
      Types$PbSystemDateTime$Builder var2;
      if (var1 instanceof Types$PbSystemDateTime) {
         var2 = this.mergeFrom((Types$PbSystemDateTime)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbSystemDateTime$Builder mergeFrom(Types$PbSystemDateTime var1) {
      if (var1 != Types$PbSystemDateTime.getDefaultInstance()) {
         if (var1.hasDate()) {
            this.mergeDate(var1.getDate());
         }

         if (var1.hasTime()) {
            this.mergeTime(var1.getTime());
         }

         if (var1.hasTrusted()) {
            this.setTrusted(var1.getTrusted());
         }

         this.mergeUnknownFields(Types$PbSystemDateTime.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Types$PbSystemDateTime$Builder mergeTime(Types$PbTime var1) {
      if (this.timeBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.time_ != null && this.time_ != Types$PbTime.getDefaultInstance()) {
            this.time_ = Types$PbTime.newBuilder(this.time_).mergeFrom(var1).buildPartial();
         } else {
            this.time_ = var1;
         }

         this.onChanged();
      } else {
         this.timeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Types$PbSystemDateTime$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbSystemDateTime$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbSystemDateTime$Builder setDate(Types$PbDate$Builder var1) {
      if (this.dateBuilder_ == null) {
         this.date_ = var1.build();
         this.onChanged();
      } else {
         this.dateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Types$PbSystemDateTime$Builder setDate(Types$PbDate var1) {
      if (this.dateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.date_ = var1;
         this.onChanged();
      } else {
         this.dateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Types$PbSystemDateTime$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbSystemDateTime$Builder)super.setField(var1, var2);
   }

   public Types$PbSystemDateTime$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbSystemDateTime$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbSystemDateTime$Builder setTime(Types$PbTime$Builder var1) {
      if (this.timeBuilder_ == null) {
         this.time_ = var1.build();
         this.onChanged();
      } else {
         this.timeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Types$PbSystemDateTime$Builder setTime(Types$PbTime var1) {
      if (this.timeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.time_ = var1;
         this.onChanged();
      } else {
         this.timeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Types$PbSystemDateTime$Builder setTrusted(boolean var1) {
      this.bitField0_ |= 4;
      this.trusted_ = var1;
      this.onChanged();
      return this;
   }

   public final Types$PbSystemDateTime$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbSystemDateTime$Builder)super.setUnknownFields(var1);
   }
}
