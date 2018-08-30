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

public final class ExerciseLap$PbLaps$Builder extends Builder implements ExerciseLap$PbLapsOrBuilder {
   private int bitField0_;
   private RepeatedFieldBuilderV3 lapsBuilder_;
   private List laps_;
   private SingleFieldBuilderV3 summaryBuilder_;
   private ExerciseLap$PbLapSummary summary_;

   private ExerciseLap$PbLaps$Builder() {
      this.laps_ = Collections.emptyList();
      this.summary_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLaps$Builder(BuilderParent var1) {
      super(var1);
      this.laps_ = Collections.emptyList();
      this.summary_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLaps$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLaps$Builder(ExerciseLap$1 var1) {
      this();
   }

   private void ensureLapsIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.laps_ = new ArrayList(this.laps_);
         this.bitField0_ |= 1;
      }

   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.E();
   }

   private RepeatedFieldBuilderV3 getLapsFieldBuilder() {
      boolean var1 = true;
      if (this.lapsBuilder_ == null) {
         List var2 = this.laps_;
         if ((this.bitField0_ & 1) != 1) {
            var1 = false;
         }

         this.lapsBuilder_ = new RepeatedFieldBuilderV3(var2, var1, this.getParentForChildren(), this.isClean());
         this.laps_ = null;
      }

      return this.lapsBuilder_;
   }

   private SingleFieldBuilderV3 getSummaryFieldBuilder() {
      if (this.summaryBuilder_ == null) {
         this.summaryBuilder_ = new SingleFieldBuilderV3(this.getSummary(), this.getParentForChildren(), this.isClean());
         this.summary_ = null;
      }

      return this.summaryBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLaps.b()) {
         this.getLapsFieldBuilder();
         this.getSummaryFieldBuilder();
      }

   }

   public ExerciseLap$PbLaps$Builder addAllLaps(Iterable var1) {
      if (this.lapsBuilder_ == null) {
         this.ensureLapsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.laps_);
         this.onChanged();
      } else {
         this.lapsBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseLap$PbLaps$Builder addLaps(int var1, ExerciseLap$PbLap$Builder var2) {
      if (this.lapsBuilder_ == null) {
         this.ensureLapsIsMutable();
         this.laps_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.lapsBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseLap$PbLaps$Builder addLaps(int var1, ExerciseLap$PbLap var2) {
      if (this.lapsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureLapsIsMutable();
         this.laps_.add(var1, var2);
         this.onChanged();
      } else {
         this.lapsBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseLap$PbLaps$Builder addLaps(ExerciseLap$PbLap$Builder var1) {
      if (this.lapsBuilder_ == null) {
         this.ensureLapsIsMutable();
         this.laps_.add(var1.build());
         this.onChanged();
      } else {
         this.lapsBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseLap$PbLaps$Builder addLaps(ExerciseLap$PbLap var1) {
      if (this.lapsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureLapsIsMutable();
         this.laps_.add(var1);
         this.onChanged();
      } else {
         this.lapsBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseLap$PbLap$Builder addLapsBuilder() {
      return (ExerciseLap$PbLap$Builder)this.getLapsFieldBuilder().addBuilder(ExerciseLap$PbLap.getDefaultInstance());
   }

   public ExerciseLap$PbLap$Builder addLapsBuilder(int var1) {
      return (ExerciseLap$PbLap$Builder)this.getLapsFieldBuilder().addBuilder(var1, ExerciseLap$PbLap.getDefaultInstance());
   }

   public ExerciseLap$PbLaps$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLaps$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLaps build() {
      ExerciseLap$PbLaps var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLaps buildPartial() {
      ExerciseLap$PbLaps var1 = new ExerciseLap$PbLaps(this, (ExerciseLap$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if (this.lapsBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.laps_ = Collections.unmodifiableList(this.laps_);
            this.bitField0_ &= -2;
         }

         ExerciseLap$PbLaps.a(var1, this.laps_);
      } else {
         ExerciseLap$PbLaps.a(var1, this.lapsBuilder_.build());
      }

      if ((var2 & 2) == 2) {
         var3 = 1;
      }

      if (this.summaryBuilder_ == null) {
         ExerciseLap$PbLaps.a(var1, this.summary_);
      } else {
         ExerciseLap$PbLaps.a(var1, (ExerciseLap$PbLapSummary)this.summaryBuilder_.build());
      }

      ExerciseLap$PbLaps.a(var1, var3);
      this.onBuilt();
      return var1;
   }

   public ExerciseLap$PbLaps$Builder clear() {
      super.clear();
      if (this.lapsBuilder_ == null) {
         this.laps_ = Collections.emptyList();
         this.bitField0_ &= -2;
      } else {
         this.lapsBuilder_.clear();
      }

      if (this.summaryBuilder_ == null) {
         this.summary_ = null;
      } else {
         this.summaryBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLaps$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLaps$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLaps$Builder clearLaps() {
      if (this.lapsBuilder_ == null) {
         this.laps_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.lapsBuilder_.clear();
      }

      return this;
   }

   public ExerciseLap$PbLaps$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLaps$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLaps$Builder clearSummary() {
      if (this.summaryBuilder_ == null) {
         this.summary_ = null;
         this.onChanged();
      } else {
         this.summaryBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLaps$Builder clone() {
      return (ExerciseLap$PbLaps$Builder)super.clone();
   }

   public ExerciseLap$PbLaps getDefaultInstanceForType() {
      return ExerciseLap$PbLaps.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.E();
   }

   public ExerciseLap$PbLap getLaps(int var1) {
      ExerciseLap$PbLap var2;
      if (this.lapsBuilder_ == null) {
         var2 = (ExerciseLap$PbLap)this.laps_.get(var1);
      } else {
         var2 = (ExerciseLap$PbLap)this.lapsBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseLap$PbLap$Builder getLapsBuilder(int var1) {
      return (ExerciseLap$PbLap$Builder)this.getLapsFieldBuilder().getBuilder(var1);
   }

   public List getLapsBuilderList() {
      return this.getLapsFieldBuilder().getBuilderList();
   }

   public int getLapsCount() {
      int var1;
      if (this.lapsBuilder_ == null) {
         var1 = this.laps_.size();
      } else {
         var1 = this.lapsBuilder_.getCount();
      }

      return var1;
   }

   public List getLapsList() {
      List var1;
      if (this.lapsBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.laps_);
      } else {
         var1 = this.lapsBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseLap$PbLapOrBuilder getLapsOrBuilder(int var1) {
      ExerciseLap$PbLapOrBuilder var2;
      if (this.lapsBuilder_ == null) {
         var2 = (ExerciseLap$PbLapOrBuilder)this.laps_.get(var1);
      } else {
         var2 = (ExerciseLap$PbLapOrBuilder)this.lapsBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getLapsOrBuilderList() {
      List var1;
      if (this.lapsBuilder_ != null) {
         var1 = this.lapsBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.laps_);
      }

      return var1;
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
      return ExerciseLap.F().ensureFieldAccessorsInitialized(ExerciseLap$PbLaps.class, ExerciseLap$PbLaps$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      int var2 = 0;

      while(true) {
         if (var2 >= this.getLapsCount()) {
            var1 = true;
            break;
         }

         if (!this.getLaps(var2).isInitialized()) {
            break;
         }

         ++var2;
      }

      return var1;
   }

   public ExerciseLap$PbLaps$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLaps var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseLap$PbLaps var14;
         try {
            var13 = (ExerciseLap$PbLaps)ExerciseLap$PbLaps.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseLap$PbLaps)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLaps$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLaps$Builder var2;
      if (var1 instanceof ExerciseLap$PbLaps) {
         var2 = this.mergeFrom((ExerciseLap$PbLaps)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLaps$Builder mergeFrom(ExerciseLap$PbLaps var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != ExerciseLap$PbLaps.getDefaultInstance()) {
         if (this.lapsBuilder_ == null) {
            if (!ExerciseLap$PbLaps.a(var1).isEmpty()) {
               if (this.laps_.isEmpty()) {
                  this.laps_ = ExerciseLap$PbLaps.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensureLapsIsMutable();
                  this.laps_.addAll(ExerciseLap$PbLaps.a(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseLap$PbLaps.a(var1).isEmpty()) {
            if (this.lapsBuilder_.isEmpty()) {
               this.lapsBuilder_.dispose();
               this.lapsBuilder_ = null;
               this.laps_ = ExerciseLap$PbLaps.a(var1);
               this.bitField0_ &= -2;
               if (ExerciseLap$PbLaps.c()) {
                  var2 = this.getLapsFieldBuilder();
               }

               this.lapsBuilder_ = var2;
            } else {
               this.lapsBuilder_.addAllMessages(ExerciseLap$PbLaps.a(var1));
            }
         }

         if (var1.hasSummary()) {
            this.mergeSummary(var1.getSummary());
         }

         this.mergeUnknownFields(ExerciseLap$PbLaps.b(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseLap$PbLaps$Builder mergeSummary(ExerciseLap$PbLapSummary var1) {
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

   public final ExerciseLap$PbLaps$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLaps$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLaps$Builder removeLaps(int var1) {
      if (this.lapsBuilder_ == null) {
         this.ensureLapsIsMutable();
         this.laps_.remove(var1);
         this.onChanged();
      } else {
         this.lapsBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseLap$PbLaps$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLaps$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLaps$Builder setLaps(int var1, ExerciseLap$PbLap$Builder var2) {
      if (this.lapsBuilder_ == null) {
         this.ensureLapsIsMutable();
         this.laps_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.lapsBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseLap$PbLaps$Builder setLaps(int var1, ExerciseLap$PbLap var2) {
      if (this.lapsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureLapsIsMutable();
         this.laps_.set(var1, var2);
         this.onChanged();
      } else {
         this.lapsBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseLap$PbLaps$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLaps$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseLap$PbLaps$Builder setSummary(ExerciseLap$PbLapSummary$Builder var1) {
      if (this.summaryBuilder_ == null) {
         this.summary_ = var1.build();
         this.onChanged();
      } else {
         this.summaryBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseLap$PbLaps$Builder setSummary(ExerciseLap$PbLapSummary var1) {
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

   public final ExerciseLap$PbLaps$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLaps$Builder)super.setUnknownFields(var1);
   }
}
