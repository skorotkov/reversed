package fi.polar.remote.representation.protobuf;

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

public final class ExerciseSensors$PbExerciseSensors$Builder extends Builder implements ExerciseSensors$PbExerciseSensorsOrBuilder {
   private int bitField0_;
   private RepeatedFieldBuilderV3 sensorsBuilder_;
   private List sensors_;

   private ExerciseSensors$PbExerciseSensors$Builder() {
      this.sensors_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private ExerciseSensors$PbExerciseSensors$Builder(BuilderParent var1) {
      super(var1);
      this.sensors_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseSensors$PbExerciseSensors$Builder(BuilderParent var1, ExerciseSensors$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseSensors$PbExerciseSensors$Builder(ExerciseSensors$1 var1) {
      this();
   }

   private void ensureSensorsIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.sensors_ = new ArrayList(this.sensors_);
         this.bitField0_ |= 1;
      }

   }

   public static final Descriptor getDescriptor() {
      return ExerciseSensors.c();
   }

   private RepeatedFieldBuilderV3 getSensorsFieldBuilder() {
      boolean var1 = true;
      if (this.sensorsBuilder_ == null) {
         List var2 = this.sensors_;
         if ((this.bitField0_ & 1) != 1) {
            var1 = false;
         }

         this.sensorsBuilder_ = new RepeatedFieldBuilderV3(var2, var1, this.getParentForChildren(), this.isClean());
         this.sensors_ = null;
      }

      return this.sensorsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseSensors$PbExerciseSensors.b()) {
         this.getSensorsFieldBuilder();
      }

   }

   public ExerciseSensors$PbExerciseSensors$Builder addAllSensors(Iterable var1) {
      if (this.sensorsBuilder_ == null) {
         this.ensureSensorsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.sensors_);
         this.onChanged();
      } else {
         this.sensorsBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSensors$PbExerciseSensors$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseSensors$PbExerciseSensors$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseSensors$PbExerciseSensors$Builder addSensors(int var1, ExerciseSensors$PbExerciseSensor$Builder var2) {
      if (this.sensorsBuilder_ == null) {
         this.ensureSensorsIsMutable();
         this.sensors_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.sensorsBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSensors$PbExerciseSensors$Builder addSensors(int var1, ExerciseSensors$PbExerciseSensor var2) {
      if (this.sensorsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSensorsIsMutable();
         this.sensors_.add(var1, var2);
         this.onChanged();
      } else {
         this.sensorsBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSensors$PbExerciseSensors$Builder addSensors(ExerciseSensors$PbExerciseSensor$Builder var1) {
      if (this.sensorsBuilder_ == null) {
         this.ensureSensorsIsMutable();
         this.sensors_.add(var1.build());
         this.onChanged();
      } else {
         this.sensorsBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSensors$PbExerciseSensors$Builder addSensors(ExerciseSensors$PbExerciseSensor var1) {
      if (this.sensorsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureSensorsIsMutable();
         this.sensors_.add(var1);
         this.onChanged();
      } else {
         this.sensorsBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder addSensorsBuilder() {
      return (ExerciseSensors$PbExerciseSensor$Builder)this.getSensorsFieldBuilder().addBuilder(ExerciseSensors$PbExerciseSensor.getDefaultInstance());
   }

   public ExerciseSensors$PbExerciseSensor$Builder addSensorsBuilder(int var1) {
      return (ExerciseSensors$PbExerciseSensor$Builder)this.getSensorsFieldBuilder().addBuilder(var1, ExerciseSensors$PbExerciseSensor.getDefaultInstance());
   }

   public ExerciseSensors$PbExerciseSensors build() {
      ExerciseSensors$PbExerciseSensors var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseSensors$PbExerciseSensors buildPartial() {
      ExerciseSensors$PbExerciseSensors var1 = new ExerciseSensors$PbExerciseSensors(this, (ExerciseSensors$1)null);
      int var2 = this.bitField0_;
      if (this.sensorsBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.sensors_ = Collections.unmodifiableList(this.sensors_);
            this.bitField0_ &= -2;
         }

         ExerciseSensors$PbExerciseSensors.a(var1, this.sensors_);
      } else {
         ExerciseSensors$PbExerciseSensors.a(var1, this.sensorsBuilder_.build());
      }

      this.onBuilt();
      return var1;
   }

   public ExerciseSensors$PbExerciseSensors$Builder clear() {
      super.clear();
      if (this.sensorsBuilder_ == null) {
         this.sensors_ = Collections.emptyList();
         this.bitField0_ &= -2;
      } else {
         this.sensorsBuilder_.clear();
      }

      return this;
   }

   public ExerciseSensors$PbExerciseSensors$Builder clearField(FieldDescriptor var1) {
      return (ExerciseSensors$PbExerciseSensors$Builder)super.clearField(var1);
   }

   public ExerciseSensors$PbExerciseSensors$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseSensors$PbExerciseSensors$Builder)super.clearOneof(var1);
   }

   public ExerciseSensors$PbExerciseSensors$Builder clearSensors() {
      if (this.sensorsBuilder_ == null) {
         this.sensors_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.sensorsBuilder_.clear();
      }

      return this;
   }

   public ExerciseSensors$PbExerciseSensors$Builder clone() {
      return (ExerciseSensors$PbExerciseSensors$Builder)super.clone();
   }

   public ExerciseSensors$PbExerciseSensors getDefaultInstanceForType() {
      return ExerciseSensors$PbExerciseSensors.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseSensors.c();
   }

   public ExerciseSensors$PbExerciseSensor getSensors(int var1) {
      ExerciseSensors$PbExerciseSensor var2;
      if (this.sensorsBuilder_ == null) {
         var2 = (ExerciseSensors$PbExerciseSensor)this.sensors_.get(var1);
      } else {
         var2 = (ExerciseSensors$PbExerciseSensor)this.sensorsBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseSensors$PbExerciseSensor$Builder getSensorsBuilder(int var1) {
      return (ExerciseSensors$PbExerciseSensor$Builder)this.getSensorsFieldBuilder().getBuilder(var1);
   }

   public List getSensorsBuilderList() {
      return this.getSensorsFieldBuilder().getBuilderList();
   }

   public int getSensorsCount() {
      int var1;
      if (this.sensorsBuilder_ == null) {
         var1 = this.sensors_.size();
      } else {
         var1 = this.sensorsBuilder_.getCount();
      }

      return var1;
   }

   public List getSensorsList() {
      List var1;
      if (this.sensorsBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.sensors_);
      } else {
         var1 = this.sensorsBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseSensors$PbExerciseSensorOrBuilder getSensorsOrBuilder(int var1) {
      ExerciseSensors$PbExerciseSensorOrBuilder var2;
      if (this.sensorsBuilder_ == null) {
         var2 = (ExerciseSensors$PbExerciseSensorOrBuilder)this.sensors_.get(var1);
      } else {
         var2 = (ExerciseSensors$PbExerciseSensorOrBuilder)this.sensorsBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getSensorsOrBuilderList() {
      List var1;
      if (this.sensorsBuilder_ != null) {
         var1 = this.sensorsBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.sensors_);
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSensors.d().ensureFieldAccessorsInitialized(ExerciseSensors$PbExerciseSensors.class, ExerciseSensors$PbExerciseSensors$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      int var2 = 0;

      while(true) {
         if (var2 >= this.getSensorsCount()) {
            var1 = true;
            break;
         }

         if (!this.getSensors(var2).isInitialized()) {
            break;
         }

         ++var2;
      }

      return var1;
   }

   public ExerciseSensors$PbExerciseSensors$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseSensors$PbExerciseSensors var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseSensors$PbExerciseSensors)ExerciseSensors$PbExerciseSensors.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseSensors$PbExerciseSensors)var10.getUnfinishedMessage();
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

   public ExerciseSensors$PbExerciseSensors$Builder mergeFrom(Message var1) {
      ExerciseSensors$PbExerciseSensors$Builder var2;
      if (var1 instanceof ExerciseSensors$PbExerciseSensors) {
         var2 = this.mergeFrom((ExerciseSensors$PbExerciseSensors)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseSensors$PbExerciseSensors$Builder mergeFrom(ExerciseSensors$PbExerciseSensors var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != ExerciseSensors$PbExerciseSensors.getDefaultInstance()) {
         if (this.sensorsBuilder_ == null) {
            if (!ExerciseSensors$PbExerciseSensors.a(var1).isEmpty()) {
               if (this.sensors_.isEmpty()) {
                  this.sensors_ = ExerciseSensors$PbExerciseSensors.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensureSensorsIsMutable();
                  this.sensors_.addAll(ExerciseSensors$PbExerciseSensors.a(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSensors$PbExerciseSensors.a(var1).isEmpty()) {
            if (this.sensorsBuilder_.isEmpty()) {
               this.sensorsBuilder_.dispose();
               this.sensorsBuilder_ = null;
               this.sensors_ = ExerciseSensors$PbExerciseSensors.a(var1);
               this.bitField0_ &= -2;
               if (ExerciseSensors$PbExerciseSensors.c()) {
                  var2 = this.getSensorsFieldBuilder();
               }

               this.sensorsBuilder_ = var2;
            } else {
               this.sensorsBuilder_.addAllMessages(ExerciseSensors$PbExerciseSensors.a(var1));
            }
         }

         this.mergeUnknownFields(ExerciseSensors$PbExerciseSensors.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseSensors$PbExerciseSensors$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSensors$PbExerciseSensors$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseSensors$PbExerciseSensors$Builder removeSensors(int var1) {
      if (this.sensorsBuilder_ == null) {
         this.ensureSensorsIsMutable();
         this.sensors_.remove(var1);
         this.onChanged();
      } else {
         this.sensorsBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSensors$PbExerciseSensors$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseSensors$PbExerciseSensors$Builder)super.setField(var1, var2);
   }

   public ExerciseSensors$PbExerciseSensors$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseSensors$PbExerciseSensors$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseSensors$PbExerciseSensors$Builder setSensors(int var1, ExerciseSensors$PbExerciseSensor$Builder var2) {
      if (this.sensorsBuilder_ == null) {
         this.ensureSensorsIsMutable();
         this.sensors_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.sensorsBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSensors$PbExerciseSensors$Builder setSensors(int var1, ExerciseSensors$PbExerciseSensor var2) {
      if (this.sensorsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSensorsIsMutable();
         this.sensors_.set(var1, var2);
         this.onChanged();
      } else {
         this.sensorsBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public final ExerciseSensors$PbExerciseSensors$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSensors$PbExerciseSensors$Builder)super.setUnknownFields(var1);
   }
}
