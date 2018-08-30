package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
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

public final class ExerciseLap$PbAutoLaps$Builder extends Builder implements ExerciseLap$PbAutoLapsOrBuilder {
   private RepeatedFieldBuilderV3 autoLapsBuilder_;
   private List autoLaps_;
   private int bitField0_;
   private SingleFieldBuilderV3 summaryBuilder_;
   private ExerciseLap$PbLapSummary summary_;

   private ExerciseLap$PbAutoLaps$Builder() {
      this.autoLaps_ = Collections.emptyList();
      this.summary_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbAutoLaps$Builder(BuilderParent var1) {
      super(var1);
      this.autoLaps_ = Collections.emptyList();
      this.summary_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbAutoLaps$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbAutoLaps$Builder(ExerciseLap$1 var1) {
      this();
   }

   private void ensureAutoLapsIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.autoLaps_ = new ArrayList(this.autoLaps_);
         this.bitField0_ |= 1;
      }

   }

   private RepeatedFieldBuilderV3 getAutoLapsFieldBuilder() {
      boolean var1 = true;
      if (this.autoLapsBuilder_ == null) {
         List var2 = this.autoLaps_;
         if ((this.bitField0_ & 1) != 1) {
            var1 = false;
         }

         this.autoLapsBuilder_ = new RepeatedFieldBuilderV3(var2, var1, this.getParentForChildren(), this.isClean());
         this.autoLaps_ = null;
      }

      return this.autoLapsBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.G();
   }

   private SingleFieldBuilderV3 getSummaryFieldBuilder() {
      if (this.summaryBuilder_ == null) {
         this.summaryBuilder_ = new SingleFieldBuilderV3(this.getSummary(), this.getParentForChildren(), this.isClean());
         this.summary_ = null;
      }

      return this.summaryBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbAutoLaps.b()) {
         this.getAutoLapsFieldBuilder();
         this.getSummaryFieldBuilder();
      }

   }

   public ExerciseLap$PbAutoLaps$Builder addAllAutoLaps(Iterable var1) {
      if (this.autoLapsBuilder_ == null) {
         this.ensureAutoLapsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.autoLaps_);
         this.onChanged();
      } else {
         this.autoLapsBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder addAutoLaps(int var1, ExerciseLap$PbLap$Builder var2) {
      if (this.autoLapsBuilder_ == null) {
         this.ensureAutoLapsIsMutable();
         this.autoLaps_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.autoLapsBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder addAutoLaps(int var1, ExerciseLap$PbLap var2) {
      if (this.autoLapsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAutoLapsIsMutable();
         this.autoLaps_.add(var1, var2);
         this.onChanged();
      } else {
         this.autoLapsBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder addAutoLaps(ExerciseLap$PbLap$Builder var1) {
      if (this.autoLapsBuilder_ == null) {
         this.ensureAutoLapsIsMutable();
         this.autoLaps_.add(var1.build());
         this.onChanged();
      } else {
         this.autoLapsBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder addAutoLaps(ExerciseLap$PbLap var1) {
      if (this.autoLapsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAutoLapsIsMutable();
         this.autoLaps_.add(var1);
         this.onChanged();
      } else {
         this.autoLapsBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseLap$PbLap$Builder addAutoLapsBuilder() {
      return (ExerciseLap$PbLap$Builder)this.getAutoLapsFieldBuilder().addBuilder(ExerciseLap$PbLap.getDefaultInstance());
   }

   public ExerciseLap$PbLap$Builder addAutoLapsBuilder(int var1) {
      return (ExerciseLap$PbLap$Builder)this.getAutoLapsFieldBuilder().addBuilder(var1, ExerciseLap$PbLap.getDefaultInstance());
   }

   public ExerciseLap$PbAutoLaps$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbAutoLaps$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbAutoLaps build() {
      ExerciseLap$PbAutoLaps var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbAutoLaps buildPartial() {
      ExerciseLap$PbAutoLaps var1 = new ExerciseLap$PbAutoLaps(this, (ExerciseLap$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if (this.autoLapsBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.autoLaps_ = Collections.unmodifiableList(this.autoLaps_);
            this.bitField0_ &= -2;
         }

         ExerciseLap$PbAutoLaps.a(var1, this.autoLaps_);
      } else {
         ExerciseLap$PbAutoLaps.a(var1, this.autoLapsBuilder_.build());
      }

      if ((var2 & 2) == 2) {
         var3 = 1;
      }

      if (this.summaryBuilder_ == null) {
         ExerciseLap$PbAutoLaps.a(var1, this.summary_);
      } else {
         ExerciseLap$PbAutoLaps.a(var1, (ExerciseLap$PbLapSummary)this.summaryBuilder_.build());
      }

      ExerciseLap$PbAutoLaps.a(var1, var3);
      this.onBuilt();
      return var1;
   }

   public ExerciseLap$PbAutoLaps$Builder clear() {
      super.clear();
      if (this.autoLapsBuilder_ == null) {
         this.autoLaps_ = Collections.emptyList();
         this.bitField0_ &= -2;
      } else {
         this.autoLapsBuilder_.clear();
      }

      if (this.summaryBuilder_ == null) {
         this.summary_ = null;
      } else {
         this.summaryBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder clearAutoLaps() {
      if (this.autoLapsBuilder_ == null) {
         this.autoLaps_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.autoLapsBuilder_.clear();
      }

      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbAutoLaps$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbAutoLaps$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbAutoLaps$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbAutoLaps$Builder clearSummary() {
      if (this.summaryBuilder_ == null) {
         this.summary_ = null;
         this.onChanged();
      } else {
         this.summaryBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder clone() {
      return (ExerciseLap$PbAutoLaps$Builder)super.clone();
   }

   public ExerciseLap$PbLap getAutoLaps(int var1) {
      ExerciseLap$PbLap var2;
      if (this.autoLapsBuilder_ == null) {
         var2 = (ExerciseLap$PbLap)this.autoLaps_.get(var1);
      } else {
         var2 = (ExerciseLap$PbLap)this.autoLapsBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseLap$PbLap$Builder getAutoLapsBuilder(int var1) {
      return (ExerciseLap$PbLap$Builder)this.getAutoLapsFieldBuilder().getBuilder(var1);
   }

   public List getAutoLapsBuilderList() {
      return this.getAutoLapsFieldBuilder().getBuilderList();
   }

   public int getAutoLapsCount() {
      int var1;
      if (this.autoLapsBuilder_ == null) {
         var1 = this.autoLaps_.size();
      } else {
         var1 = this.autoLapsBuilder_.getCount();
      }

      return var1;
   }

   public List getAutoLapsList() {
      List var1;
      if (this.autoLapsBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.autoLaps_);
      } else {
         var1 = this.autoLapsBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseLap$PbLapOrBuilder getAutoLapsOrBuilder(int var1) {
      ExerciseLap$PbLapOrBuilder var2;
      if (this.autoLapsBuilder_ == null) {
         var2 = (ExerciseLap$PbLapOrBuilder)this.autoLaps_.get(var1);
      } else {
         var2 = (ExerciseLap$PbLapOrBuilder)this.autoLapsBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getAutoLapsOrBuilderList() {
      List var1;
      if (this.autoLapsBuilder_ != null) {
         var1 = this.autoLapsBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.autoLaps_);
      }

      return var1;
   }

   public ExerciseLap$PbAutoLaps getDefaultInstanceForType() {
      return ExerciseLap$PbAutoLaps.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.G();
   }

   public ExerciseLap$PbLapSummary getSummary() {
      ExerciseLap$PbLapSummary var1;
      if (this.summaryBuilder_ == null) {
         if (this.summary_ == null) {
            var1 = ExerciseLap$PbLapSummary.getDefaultInstance();
         } else {
            var1 = this.summary_;
         }
      } else {
         var1 = (ExerciseLap$PbLapSummary)this.summaryBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapSummary$Builder getSummaryBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (ExerciseLap$PbLapSummary$Builder)this.getSummaryFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapSummaryOrBuilder getSummaryOrBuilder() {
      Object var1;
      if (this.summaryBuilder_ != null) {
         var1 = (ExerciseLap$PbLapSummaryOrBuilder)this.summaryBuilder_.getMessageOrBuilder();
      } else if (this.summary_ == null) {
         var1 = ExerciseLap$PbLapSummary.getDefaultInstance();
      } else {
         var1 = this.summary_;
      }

      return (ExerciseLap$PbLapSummaryOrBuilder)var1;
   }

   public boolean hasSummary() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.H().ensureFieldAccessorsInitialized(ExerciseLap$PbAutoLaps.class, ExerciseLap$PbAutoLaps$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      int var2 = 0;

      while(true) {
         if (var2 >= this.getAutoLapsCount()) {
            var1 = true;
            break;
         }

         if (!this.getAutoLaps(var2).isInitialized()) {
            break;
         }

         ++var2;
      }

      return var1;
   }

   public ExerciseLap$PbAutoLaps$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbAutoLaps var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExerciseLap$PbAutoLaps)ExerciseLap$PbAutoLaps.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExerciseLap$PbAutoLaps)var11.getUnfinishedMessage();
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

   public ExerciseLap$PbAutoLaps$Builder mergeFrom(Message var1) {
      ExerciseLap$PbAutoLaps$Builder var2;
      if (var1 instanceof ExerciseLap$PbAutoLaps) {
         var2 = this.mergeFrom((ExerciseLap$PbAutoLaps)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbAutoLaps$Builder mergeFrom(ExerciseLap$PbAutoLaps var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != ExerciseLap$PbAutoLaps.getDefaultInstance()) {
         if (this.autoLapsBuilder_ == null) {
            if (!ExerciseLap$PbAutoLaps.a(var1).isEmpty()) {
               if (this.autoLaps_.isEmpty()) {
                  this.autoLaps_ = ExerciseLap$PbAutoLaps.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensureAutoLapsIsMutable();
                  this.autoLaps_.addAll(ExerciseLap$PbAutoLaps.a(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseLap$PbAutoLaps.a(var1).isEmpty()) {
            if (this.autoLapsBuilder_.isEmpty()) {
               this.autoLapsBuilder_.dispose();
               this.autoLapsBuilder_ = null;
               this.autoLaps_ = ExerciseLap$PbAutoLaps.a(var1);
               this.bitField0_ &= -2;
               if (ExerciseLap$PbAutoLaps.c()) {
                  var2 = this.getAutoLapsFieldBuilder();
               }

               this.autoLapsBuilder_ = var2;
            } else {
               this.autoLapsBuilder_.addAllMessages(ExerciseLap$PbAutoLaps.a(var1));
            }
         }

         if (var1.hasSummary()) {
            this.mergeSummary(var1.getSummary());
         }

         this.mergeUnknownFields(ExerciseLap$PbAutoLaps.b(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder mergeSummary(ExerciseLap$PbLapSummary var1) {
      if (this.summaryBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.summary_ != null && this.summary_ != ExerciseLap$PbLapSummary.getDefaultInstance()) {
            this.summary_ = ExerciseLap$PbLapSummary.newBuilder(this.summary_).mergeFrom(var1).buildPartial();
         } else {
            this.summary_ = var1;
         }

         this.onChanged();
      } else {
         this.summaryBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final ExerciseLap$PbAutoLaps$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbAutoLaps$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbAutoLaps$Builder removeAutoLaps(int var1) {
      if (this.autoLapsBuilder_ == null) {
         this.ensureAutoLapsIsMutable();
         this.autoLaps_.remove(var1);
         this.onChanged();
      } else {
         this.autoLapsBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder setAutoLaps(int var1, ExerciseLap$PbLap$Builder var2) {
      if (this.autoLapsBuilder_ == null) {
         this.ensureAutoLapsIsMutable();
         this.autoLaps_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.autoLapsBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder setAutoLaps(int var1, ExerciseLap$PbLap var2) {
      if (this.autoLapsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAutoLapsIsMutable();
         this.autoLaps_.set(var1, var2);
         this.onChanged();
      } else {
         this.autoLapsBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbAutoLaps$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbAutoLaps$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbAutoLaps$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseLap$PbAutoLaps$Builder setSummary(ExerciseLap$PbLapSummary$Builder var1) {
      if (this.summaryBuilder_ == null) {
         this.summary_ = var1.build();
         this.onChanged();
      } else {
         this.summaryBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseLap$PbAutoLaps$Builder setSummary(ExerciseLap$PbLapSummary var1) {
      if (this.summaryBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.summary_ = var1;
         this.onChanged();
      } else {
         this.summaryBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final ExerciseLap$PbAutoLaps$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbAutoLaps$Builder)super.setUnknownFields(var1);
   }
}
