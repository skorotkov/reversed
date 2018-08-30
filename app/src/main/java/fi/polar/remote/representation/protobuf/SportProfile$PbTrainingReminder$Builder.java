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

public final class SportProfile$PbTrainingReminder$Builder extends Builder implements SportProfile$PbTrainingReminderOrBuilder {
   private int bitField0_;
   private int calorieReminderValue_;
   private float distanceReminderValue_;
   private SingleFieldBuilderV3 reminderTextBuilder_;
   private Structures$PbOneLineText reminderText_;
   private int reminderType_;
   private SingleFieldBuilderV3 timeReminderValueBuilder_;
   private Types$PbDuration timeReminderValue_;

   private SportProfile$PbTrainingReminder$Builder() {
      this.reminderType_ = 1;
      this.reminderText_ = null;
      this.timeReminderValue_ = null;
      this.maybeForceBuilderInitialization();
   }

   private SportProfile$PbTrainingReminder$Builder(BuilderParent var1) {
      super(var1);
      this.reminderType_ = 1;
      this.reminderText_ = null;
      this.timeReminderValue_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportProfile$PbTrainingReminder$Builder(BuilderParent var1, SportProfile$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportProfile$PbTrainingReminder$Builder(SportProfile$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return SportProfile.a();
   }

   private SingleFieldBuilderV3 getReminderTextFieldBuilder() {
      if (this.reminderTextBuilder_ == null) {
         this.reminderTextBuilder_ = new SingleFieldBuilderV3(this.getReminderText(), this.getParentForChildren(), this.isClean());
         this.reminderText_ = null;
      }

      return this.reminderTextBuilder_;
   }

   private SingleFieldBuilderV3 getTimeReminderValueFieldBuilder() {
      if (this.timeReminderValueBuilder_ == null) {
         this.timeReminderValueBuilder_ = new SingleFieldBuilderV3(this.getTimeReminderValue(), this.getParentForChildren(), this.isClean());
         this.timeReminderValue_ = null;
      }

      return this.timeReminderValueBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SportProfile$PbTrainingReminder.b()) {
         this.getReminderTextFieldBuilder();
         this.getTimeReminderValueFieldBuilder();
      }

   }

   public SportProfile$PbTrainingReminder$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportProfile$PbTrainingReminder$Builder)super.addRepeatedField(var1, var2);
   }

   public SportProfile$PbTrainingReminder build() {
      SportProfile$PbTrainingReminder var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportProfile$PbTrainingReminder buildPartial() {
      byte var1 = 1;
      SportProfile$PbTrainingReminder var2 = new SportProfile$PbTrainingReminder(this, (SportProfile$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportProfile$PbTrainingReminder.a(var2, this.reminderType_);
      int var4;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      } else {
         var4 = var1;
      }

      if (this.reminderTextBuilder_ == null) {
         SportProfile$PbTrainingReminder.a(var2, this.reminderText_);
      } else {
         SportProfile$PbTrainingReminder.a(var2, (Structures$PbOneLineText)this.reminderTextBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      SportProfile$PbTrainingReminder.b(var2, this.calorieReminderValue_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      if (this.timeReminderValueBuilder_ == null) {
         SportProfile$PbTrainingReminder.a(var2, this.timeReminderValue_);
      } else {
         SportProfile$PbTrainingReminder.a(var2, (Types$PbDuration)this.timeReminderValueBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 16) == 16) {
         var5 = var4 | 16;
      }

      SportProfile$PbTrainingReminder.a(var2, this.distanceReminderValue_);
      SportProfile$PbTrainingReminder.c(var2, var5);
      this.onBuilt();
      return var2;
   }

   public SportProfile$PbTrainingReminder$Builder clear() {
      super.clear();
      this.reminderType_ = 1;
      this.bitField0_ &= -2;
      if (this.reminderTextBuilder_ == null) {
         this.reminderText_ = null;
      } else {
         this.reminderTextBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.calorieReminderValue_ = 0;
      this.bitField0_ &= -5;
      if (this.timeReminderValueBuilder_ == null) {
         this.timeReminderValue_ = null;
      } else {
         this.timeReminderValueBuilder_.clear();
      }

      this.bitField0_ &= -9;
      this.distanceReminderValue_ = 0.0F;
      this.bitField0_ &= -17;
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder clearCalorieReminderValue() {
      this.bitField0_ &= -5;
      this.calorieReminderValue_ = 0;
      this.onChanged();
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder clearDistanceReminderValue() {
      this.bitField0_ &= -17;
      this.distanceReminderValue_ = 0.0F;
      this.onChanged();
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder clearField(FieldDescriptor var1) {
      return (SportProfile$PbTrainingReminder$Builder)super.clearField(var1);
   }

   public SportProfile$PbTrainingReminder$Builder clearOneof(OneofDescriptor var1) {
      return (SportProfile$PbTrainingReminder$Builder)super.clearOneof(var1);
   }

   public SportProfile$PbTrainingReminder$Builder clearReminderText() {
      if (this.reminderTextBuilder_ == null) {
         this.reminderText_ = null;
         this.onChanged();
      } else {
         this.reminderTextBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder clearReminderType() {
      this.bitField0_ &= -2;
      this.reminderType_ = 1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder clearTimeReminderValue() {
      if (this.timeReminderValueBuilder_ == null) {
         this.timeReminderValue_ = null;
         this.onChanged();
      } else {
         this.timeReminderValueBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder clone() {
      return (SportProfile$PbTrainingReminder$Builder)super.clone();
   }

   public int getCalorieReminderValue() {
      return this.calorieReminderValue_;
   }

   public SportProfile$PbTrainingReminder getDefaultInstanceForType() {
      return SportProfile$PbTrainingReminder.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportProfile.a();
   }

   public float getDistanceReminderValue() {
      return this.distanceReminderValue_;
   }

   public Structures$PbOneLineText getReminderText() {
      Structures$PbOneLineText var1;
      if (this.reminderTextBuilder_ == null) {
         if (this.reminderText_ == null) {
            var1 = Structures$PbOneLineText.getDefaultInstance();
         } else {
            var1 = this.reminderText_;
         }
      } else {
         var1 = (Structures$PbOneLineText)this.reminderTextBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbOneLineText$Builder getReminderTextBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Structures$PbOneLineText$Builder)this.getReminderTextFieldBuilder().getBuilder();
   }

   public Structures$PbOneLineTextOrBuilder getReminderTextOrBuilder() {
      Object var1;
      if (this.reminderTextBuilder_ != null) {
         var1 = (Structures$PbOneLineTextOrBuilder)this.reminderTextBuilder_.getMessageOrBuilder();
      } else if (this.reminderText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.reminderText_;
      }

      return (Structures$PbOneLineTextOrBuilder)var1;
   }

   public SportProfile$PbTrainingReminder$PbTrainingReminderType getReminderType() {
      SportProfile$PbTrainingReminder$PbTrainingReminderType var1 = SportProfile$PbTrainingReminder$PbTrainingReminderType.valueOf(this.reminderType_);
      SportProfile$PbTrainingReminder$PbTrainingReminderType var2 = var1;
      if (var1 == null) {
         var2 = SportProfile$PbTrainingReminder$PbTrainingReminderType.TRAINING_REMINDER_OFF;
      }

      return var2;
   }

   public Types$PbDuration getTimeReminderValue() {
      Types$PbDuration var1;
      if (this.timeReminderValueBuilder_ == null) {
         if (this.timeReminderValue_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeReminderValue_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeReminderValueBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeReminderValueBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeReminderValueFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeReminderValueOrBuilder() {
      Object var1;
      if (this.timeReminderValueBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeReminderValueBuilder_.getMessageOrBuilder();
      } else if (this.timeReminderValue_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeReminderValue_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public boolean hasCalorieReminderValue() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistanceReminderValue() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasReminderText() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasReminderType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeReminderValue() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportProfile.b().ensureFieldAccessorsInitialized(SportProfile$PbTrainingReminder.class, SportProfile$PbTrainingReminder$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasReminderType() && (!this.hasReminderText() || this.getReminderText().isInitialized())) {
         var1 = true;
      }

      return var1;
   }

   public SportProfile$PbTrainingReminder$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportProfile$PbTrainingReminder var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (SportProfile$PbTrainingReminder)SportProfile$PbTrainingReminder.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (SportProfile$PbTrainingReminder)var11.getUnfinishedMessage();
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

   public SportProfile$PbTrainingReminder$Builder mergeFrom(Message var1) {
      SportProfile$PbTrainingReminder$Builder var2;
      if (var1 instanceof SportProfile$PbTrainingReminder) {
         var2 = this.mergeFrom((SportProfile$PbTrainingReminder)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportProfile$PbTrainingReminder$Builder mergeFrom(SportProfile$PbTrainingReminder var1) {
      if (var1 != SportProfile$PbTrainingReminder.getDefaultInstance()) {
         if (var1.hasReminderType()) {
            this.setReminderType(var1.getReminderType());
         }

         if (var1.hasReminderText()) {
            this.mergeReminderText(var1.getReminderText());
         }

         if (var1.hasCalorieReminderValue()) {
            this.setCalorieReminderValue(var1.getCalorieReminderValue());
         }

         if (var1.hasTimeReminderValue()) {
            this.mergeTimeReminderValue(var1.getTimeReminderValue());
         }

         if (var1.hasDistanceReminderValue()) {
            this.setDistanceReminderValue(var1.getDistanceReminderValue());
         }

         this.mergeUnknownFields(SportProfile$PbTrainingReminder.a(var1));
         this.onChanged();
      }

      return this;
   }

   public SportProfile$PbTrainingReminder$Builder mergeReminderText(Structures$PbOneLineText var1) {
      if (this.reminderTextBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.reminderText_ != null && this.reminderText_ != Structures$PbOneLineText.getDefaultInstance()) {
            this.reminderText_ = Structures$PbOneLineText.newBuilder(this.reminderText_).mergeFrom(var1).buildPartial();
         } else {
            this.reminderText_ = var1;
         }

         this.onChanged();
      } else {
         this.reminderTextBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder mergeTimeReminderValue(Types$PbDuration var1) {
      if (this.timeReminderValueBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.timeReminderValue_ != null && this.timeReminderValue_ != Types$PbDuration.getDefaultInstance()) {
            this.timeReminderValue_ = Types$PbDuration.newBuilder(this.timeReminderValue_).mergeFrom(var1).buildPartial();
         } else {
            this.timeReminderValue_ = var1;
         }

         this.onChanged();
      } else {
         this.timeReminderValueBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public final SportProfile$PbTrainingReminder$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportProfile$PbTrainingReminder$Builder)super.mergeUnknownFields(var1);
   }

   public SportProfile$PbTrainingReminder$Builder setCalorieReminderValue(int var1) {
      this.bitField0_ |= 4;
      this.calorieReminderValue_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder setDistanceReminderValue(float var1) {
      this.bitField0_ |= 16;
      this.distanceReminderValue_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportProfile$PbTrainingReminder$Builder)super.setField(var1, var2);
   }

   public SportProfile$PbTrainingReminder$Builder setReminderText(Structures$PbOneLineText$Builder var1) {
      if (this.reminderTextBuilder_ == null) {
         this.reminderText_ = var1.build();
         this.onChanged();
      } else {
         this.reminderTextBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder setReminderText(Structures$PbOneLineText var1) {
      if (this.reminderTextBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.reminderText_ = var1;
         this.onChanged();
      } else {
         this.reminderTextBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder setReminderType(SportProfile$PbTrainingReminder$PbTrainingReminderType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.reminderType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbTrainingReminder$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportProfile$PbTrainingReminder$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SportProfile$PbTrainingReminder$Builder setTimeReminderValue(Types$PbDuration$Builder var1) {
      if (this.timeReminderValueBuilder_ == null) {
         this.timeReminderValue_ = var1.build();
         this.onChanged();
      } else {
         this.timeReminderValueBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportProfile$PbTrainingReminder$Builder setTimeReminderValue(Types$PbDuration var1) {
      if (this.timeReminderValueBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeReminderValue_ = var1;
         this.onChanged();
      } else {
         this.timeReminderValueBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public final SportProfile$PbTrainingReminder$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportProfile$PbTrainingReminder$Builder)super.setUnknownFields(var1);
   }
}
