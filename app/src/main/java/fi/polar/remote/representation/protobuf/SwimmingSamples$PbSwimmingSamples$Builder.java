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

public final class SwimmingSamples$PbSwimmingSamples$Builder extends Builder implements SwimmingSamples$PbSwimmingSamplesOrBuilder {
   private int bitField0_;
   private RepeatedFieldBuilderV3 poolMetricBuilder_;
   private List poolMetric_;
   private SingleFieldBuilderV3 startBuilder_;
   private Types$PbLocalDateTime start_;

   private SwimmingSamples$PbSwimmingSamples$Builder() {
      this.start_ = null;
      this.poolMetric_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private SwimmingSamples$PbSwimmingSamples$Builder(BuilderParent var1) {
      super(var1);
      this.start_ = null;
      this.poolMetric_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingSamples$Builder(BuilderParent var1, SwimmingSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingSamples$Builder(SwimmingSamples$1 var1) {
      this();
   }

   private void ensurePoolMetricIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.poolMetric_ = new ArrayList(this.poolMetric_);
         this.bitField0_ |= 2;
      }

   }

   public static final Descriptor getDescriptor() {
      return SwimmingSamples.e();
   }

   private RepeatedFieldBuilderV3 getPoolMetricFieldBuilder() {
      if (this.poolMetricBuilder_ == null) {
         List var1 = this.poolMetric_;
         boolean var2;
         if ((this.bitField0_ & 2) == 2) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.poolMetricBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.poolMetric_ = null;
      }

      return this.poolMetricBuilder_;
   }

   private SingleFieldBuilderV3 getStartFieldBuilder() {
      if (this.startBuilder_ == null) {
         this.startBuilder_ = new SingleFieldBuilderV3(this.getStart(), this.getParentForChildren(), this.isClean());
         this.start_ = null;
      }

      return this.startBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SwimmingSamples$PbSwimmingSamples.b()) {
         this.getStartFieldBuilder();
         this.getPoolMetricFieldBuilder();
      }

   }

   public SwimmingSamples$PbSwimmingSamples$Builder addAllPoolMetric(Iterable var1) {
      if (this.poolMetricBuilder_ == null) {
         this.ensurePoolMetricIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.poolMetric_);
         this.onChanged();
      } else {
         this.poolMetricBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder addPoolMetric(int var1, SwimmingSamples$PbSwimmingPoolMetric$Builder var2) {
      if (this.poolMetricBuilder_ == null) {
         this.ensurePoolMetricIsMutable();
         this.poolMetric_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.poolMetricBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder addPoolMetric(int var1, SwimmingSamples$PbSwimmingPoolMetric var2) {
      if (this.poolMetricBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensurePoolMetricIsMutable();
         this.poolMetric_.add(var1, var2);
         this.onChanged();
      } else {
         this.poolMetricBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder addPoolMetric(SwimmingSamples$PbSwimmingPoolMetric$Builder var1) {
      if (this.poolMetricBuilder_ == null) {
         this.ensurePoolMetricIsMutable();
         this.poolMetric_.add(var1.build());
         this.onChanged();
      } else {
         this.poolMetricBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder addPoolMetric(SwimmingSamples$PbSwimmingPoolMetric var1) {
      if (this.poolMetricBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensurePoolMetricIsMutable();
         this.poolMetric_.add(var1);
         this.onChanged();
      } else {
         this.poolMetricBuilder_.addMessage(var1);
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder addPoolMetricBuilder() {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)this.getPoolMetricFieldBuilder().addBuilder(SwimmingSamples$PbSwimmingPoolMetric.getDefaultInstance());
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder addPoolMetricBuilder(int var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)this.getPoolMetricFieldBuilder().addBuilder(var1, SwimmingSamples$PbSwimmingPoolMetric.getDefaultInstance());
   }

   public SwimmingSamples$PbSwimmingSamples$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SwimmingSamples$PbSwimmingSamples$Builder)super.addRepeatedField(var1, var2);
   }

   public SwimmingSamples$PbSwimmingSamples build() {
      SwimmingSamples$PbSwimmingSamples var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SwimmingSamples$PbSwimmingSamples buildPartial() {
      SwimmingSamples$PbSwimmingSamples var1 = new SwimmingSamples$PbSwimmingSamples(this, (SwimmingSamples$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.startBuilder_ == null) {
         SwimmingSamples$PbSwimmingSamples.a(var1, this.start_);
      } else {
         SwimmingSamples$PbSwimmingSamples.a(var1, (Types$PbLocalDateTime)this.startBuilder_.build());
      }

      if (this.poolMetricBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2) {
            this.poolMetric_ = Collections.unmodifiableList(this.poolMetric_);
            this.bitField0_ &= -3;
         }

         SwimmingSamples$PbSwimmingSamples.a(var1, this.poolMetric_);
      } else {
         SwimmingSamples$PbSwimmingSamples.a(var1, this.poolMetricBuilder_.build());
      }

      SwimmingSamples$PbSwimmingSamples.a(var1, var3);
      this.onBuilt();
      return var1;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder clear() {
      super.clear();
      if (this.startBuilder_ == null) {
         this.start_ = null;
      } else {
         this.startBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.poolMetricBuilder_ == null) {
         this.poolMetric_ = Collections.emptyList();
         this.bitField0_ &= -3;
      } else {
         this.poolMetricBuilder_.clear();
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder clearField(FieldDescriptor var1) {
      return (SwimmingSamples$PbSwimmingSamples$Builder)super.clearField(var1);
   }

   public SwimmingSamples$PbSwimmingSamples$Builder clearOneof(OneofDescriptor var1) {
      return (SwimmingSamples$PbSwimmingSamples$Builder)super.clearOneof(var1);
   }

   public SwimmingSamples$PbSwimmingSamples$Builder clearPoolMetric() {
      if (this.poolMetricBuilder_ == null) {
         this.poolMetric_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
      } else {
         this.poolMetricBuilder_.clear();
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder clearStart() {
      if (this.startBuilder_ == null) {
         this.start_ = null;
         this.onChanged();
      } else {
         this.startBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder clone() {
      return (SwimmingSamples$PbSwimmingSamples$Builder)super.clone();
   }

   public SwimmingSamples$PbSwimmingSamples getDefaultInstanceForType() {
      return SwimmingSamples$PbSwimmingSamples.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SwimmingSamples.e();
   }

   public SwimmingSamples$PbSwimmingPoolMetric getPoolMetric(int var1) {
      SwimmingSamples$PbSwimmingPoolMetric var2;
      if (this.poolMetricBuilder_ == null) {
         var2 = (SwimmingSamples$PbSwimmingPoolMetric)this.poolMetric_.get(var1);
      } else {
         var2 = (SwimmingSamples$PbSwimmingPoolMetric)this.poolMetricBuilder_.getMessage(var1);
      }

      return var2;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder getPoolMetricBuilder(int var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)this.getPoolMetricFieldBuilder().getBuilder(var1);
   }

   public List getPoolMetricBuilderList() {
      return this.getPoolMetricFieldBuilder().getBuilderList();
   }

   public int getPoolMetricCount() {
      int var1;
      if (this.poolMetricBuilder_ == null) {
         var1 = this.poolMetric_.size();
      } else {
         var1 = this.poolMetricBuilder_.getCount();
      }

      return var1;
   }

   public List getPoolMetricList() {
      List var1;
      if (this.poolMetricBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.poolMetric_);
      } else {
         var1 = this.poolMetricBuilder_.getMessageList();
      }

      return var1;
   }

   public SwimmingSamples$PbSwimmingPoolMetricOrBuilder getPoolMetricOrBuilder(int var1) {
      SwimmingSamples$PbSwimmingPoolMetricOrBuilder var2;
      if (this.poolMetricBuilder_ == null) {
         var2 = (SwimmingSamples$PbSwimmingPoolMetricOrBuilder)this.poolMetric_.get(var1);
      } else {
         var2 = (SwimmingSamples$PbSwimmingPoolMetricOrBuilder)this.poolMetricBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getPoolMetricOrBuilderList() {
      List var1;
      if (this.poolMetricBuilder_ != null) {
         var1 = this.poolMetricBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.poolMetric_);
      }

      return var1;
   }

   public Types$PbLocalDateTime getStart() {
      Types$PbLocalDateTime var1;
      if (this.startBuilder_ == null) {
         if (this.start_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.start_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.startBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getStartBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getStartFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getStartOrBuilder() {
      Object var1;
      if (this.startBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.startBuilder_.getMessageOrBuilder();
      } else if (this.start_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.start_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public boolean hasStart() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SwimmingSamples.f().ensureFieldAccessorsInitialized(SwimmingSamples$PbSwimmingSamples.class, SwimmingSamples$PbSwimmingSamples$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasStart()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.getStart().isInitialized()) {
            int var3 = 0;

            while(true) {
               if (var3 >= this.getPoolMetricCount()) {
                  var2 = true;
                  break;
               }

               var2 = var1;
               if (!this.getPoolMetric(var3).isInitialized()) {
                  break;
               }

               ++var3;
            }
         }
      }

      return var2;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SwimmingSamples$PbSwimmingSamples var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (SwimmingSamples$PbSwimmingSamples)SwimmingSamples$PbSwimmingSamples.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (SwimmingSamples$PbSwimmingSamples)var11.getUnfinishedMessage();
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

   public SwimmingSamples$PbSwimmingSamples$Builder mergeFrom(Message var1) {
      SwimmingSamples$PbSwimmingSamples$Builder var2;
      if (var1 instanceof SwimmingSamples$PbSwimmingSamples) {
         var2 = this.mergeFrom((SwimmingSamples$PbSwimmingSamples)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder mergeFrom(SwimmingSamples$PbSwimmingSamples var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != SwimmingSamples$PbSwimmingSamples.getDefaultInstance()) {
         if (var1.hasStart()) {
            this.mergeStart(var1.getStart());
         }

         if (this.poolMetricBuilder_ == null) {
            if (!SwimmingSamples$PbSwimmingSamples.a(var1).isEmpty()) {
               if (this.poolMetric_.isEmpty()) {
                  this.poolMetric_ = SwimmingSamples$PbSwimmingSamples.a(var1);
                  this.bitField0_ &= -3;
               } else {
                  this.ensurePoolMetricIsMutable();
                  this.poolMetric_.addAll(SwimmingSamples$PbSwimmingSamples.a(var1));
               }

               this.onChanged();
            }
         } else if (!SwimmingSamples$PbSwimmingSamples.a(var1).isEmpty()) {
            if (this.poolMetricBuilder_.isEmpty()) {
               this.poolMetricBuilder_.dispose();
               this.poolMetricBuilder_ = null;
               this.poolMetric_ = SwimmingSamples$PbSwimmingSamples.a(var1);
               this.bitField0_ &= -3;
               if (SwimmingSamples$PbSwimmingSamples.c()) {
                  var2 = this.getPoolMetricFieldBuilder();
               }

               this.poolMetricBuilder_ = var2;
            } else {
               this.poolMetricBuilder_.addAllMessages(SwimmingSamples$PbSwimmingSamples.a(var1));
            }
         }

         this.mergeUnknownFields(SwimmingSamples$PbSwimmingSamples.b(var1));
         this.onChanged();
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder mergeStart(Types$PbLocalDateTime var1) {
      if (this.startBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.start_ != null && this.start_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.start_ = Types$PbLocalDateTime.newBuilder(this.start_).mergeFrom(var1).buildPartial();
         } else {
            this.start_ = var1;
         }

         this.onChanged();
      } else {
         this.startBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final SwimmingSamples$PbSwimmingSamples$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SwimmingSamples$PbSwimmingSamples$Builder)super.mergeUnknownFields(var1);
   }

   public SwimmingSamples$PbSwimmingSamples$Builder removePoolMetric(int var1) {
      if (this.poolMetricBuilder_ == null) {
         this.ensurePoolMetricIsMutable();
         this.poolMetric_.remove(var1);
         this.onChanged();
      } else {
         this.poolMetricBuilder_.remove(var1);
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder setField(FieldDescriptor var1, Object var2) {
      return (SwimmingSamples$PbSwimmingSamples$Builder)super.setField(var1, var2);
   }

   public SwimmingSamples$PbSwimmingSamples$Builder setPoolMetric(int var1, SwimmingSamples$PbSwimmingPoolMetric$Builder var2) {
      if (this.poolMetricBuilder_ == null) {
         this.ensurePoolMetricIsMutable();
         this.poolMetric_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.poolMetricBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder setPoolMetric(int var1, SwimmingSamples$PbSwimmingPoolMetric var2) {
      if (this.poolMetricBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensurePoolMetricIsMutable();
         this.poolMetric_.set(var1, var2);
         this.onChanged();
      } else {
         this.poolMetricBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SwimmingSamples$PbSwimmingSamples$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SwimmingSamples$PbSwimmingSamples$Builder setStart(Types$PbLocalDateTime$Builder var1) {
      if (this.startBuilder_ == null) {
         this.start_ = var1.build();
         this.onChanged();
      } else {
         this.startBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder setStart(Types$PbLocalDateTime var1) {
      if (this.startBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.start_ = var1;
         this.onChanged();
      } else {
         this.startBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final SwimmingSamples$PbSwimmingSamples$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SwimmingSamples$PbSwimmingSamples$Builder)super.setUnknownFields(var1);
   }
}
