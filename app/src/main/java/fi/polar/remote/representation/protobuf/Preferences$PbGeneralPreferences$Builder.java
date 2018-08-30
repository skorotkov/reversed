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

public final class Preferences$PbGeneralPreferences$Builder extends Builder implements Preferences$PbGeneralPreferencesOrBuilder {
   private SingleFieldBuilderV3 activityGoalPreferencesBuilder_;
   private Preferences$PbActivityGoalPreferences activityGoalPreferences_;
   private int bitField0_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private SingleFieldBuilderV3 localizationPreferencesBuilder_;
   private Preferences$PbLocalizationPreferences localizationPreferences_;
   private SingleFieldBuilderV3 trainingPreferencesBuilder_;
   private Preferences$PbTrainingPreferences trainingPreferences_;

   private Preferences$PbGeneralPreferences$Builder() {
      this.localizationPreferences_ = null;
      this.trainingPreferences_ = null;
      this.activityGoalPreferences_ = null;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Preferences$PbGeneralPreferences$Builder(BuilderParent var1) {
      super(var1);
      this.localizationPreferences_ = null;
      this.trainingPreferences_ = null;
      this.activityGoalPreferences_ = null;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Preferences$PbGeneralPreferences$Builder(BuilderParent var1, Preferences$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Preferences$PbGeneralPreferences$Builder(Preferences$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getActivityGoalPreferencesFieldBuilder() {
      if (this.activityGoalPreferencesBuilder_ == null) {
         this.activityGoalPreferencesBuilder_ = new SingleFieldBuilderV3(this.getActivityGoalPreferences(), this.getParentForChildren(), this.isClean());
         this.activityGoalPreferences_ = null;
      }

      return this.activityGoalPreferencesBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return Preferences.g();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private SingleFieldBuilderV3 getLocalizationPreferencesFieldBuilder() {
      if (this.localizationPreferencesBuilder_ == null) {
         this.localizationPreferencesBuilder_ = new SingleFieldBuilderV3(this.getLocalizationPreferences(), this.getParentForChildren(), this.isClean());
         this.localizationPreferences_ = null;
      }

      return this.localizationPreferencesBuilder_;
   }

   private SingleFieldBuilderV3 getTrainingPreferencesFieldBuilder() {
      if (this.trainingPreferencesBuilder_ == null) {
         this.trainingPreferencesBuilder_ = new SingleFieldBuilderV3(this.getTrainingPreferences(), this.getParentForChildren(), this.isClean());
         this.trainingPreferences_ = null;
      }

      return this.trainingPreferencesBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Preferences$PbGeneralPreferences.b()) {
         this.getLocalizationPreferencesFieldBuilder();
         this.getTrainingPreferencesFieldBuilder();
         this.getActivityGoalPreferencesFieldBuilder();
         this.getLastModifiedFieldBuilder();
      }

   }

   public Preferences$PbGeneralPreferences$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Preferences$PbGeneralPreferences$Builder)super.addRepeatedField(var1, var2);
   }

   public Preferences$PbGeneralPreferences build() {
      Preferences$PbGeneralPreferences var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Preferences$PbGeneralPreferences buildPartial() {
      Preferences$PbGeneralPreferences var1 = new Preferences$PbGeneralPreferences(this, (Preferences$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.localizationPreferencesBuilder_ == null) {
         Preferences$PbGeneralPreferences.a(var1, this.localizationPreferences_);
      } else {
         Preferences$PbGeneralPreferences.a(var1, (Preferences$PbLocalizationPreferences)this.localizationPreferencesBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.trainingPreferencesBuilder_ == null) {
         Preferences$PbGeneralPreferences.a(var1, this.trainingPreferences_);
      } else {
         Preferences$PbGeneralPreferences.a(var1, (Preferences$PbTrainingPreferences)this.trainingPreferencesBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.activityGoalPreferencesBuilder_ == null) {
         Preferences$PbGeneralPreferences.a(var1, this.activityGoalPreferences_);
      } else {
         Preferences$PbGeneralPreferences.a(var1, (Preferences$PbActivityGoalPreferences)this.activityGoalPreferencesBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 8) == 8) {
         var4 = var5 | 8;
      }

      if (this.lastModifiedBuilder_ == null) {
         Preferences$PbGeneralPreferences.a(var1, this.lastModified_);
      } else {
         Preferences$PbGeneralPreferences.a(var1, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      Preferences$PbGeneralPreferences.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public Preferences$PbGeneralPreferences$Builder clear() {
      super.clear();
      if (this.localizationPreferencesBuilder_ == null) {
         this.localizationPreferences_ = null;
      } else {
         this.localizationPreferencesBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.trainingPreferencesBuilder_ == null) {
         this.trainingPreferences_ = null;
      } else {
         this.trainingPreferencesBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.activityGoalPreferencesBuilder_ == null) {
         this.activityGoalPreferences_ = null;
      } else {
         this.activityGoalPreferencesBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder clearActivityGoalPreferences() {
      if (this.activityGoalPreferencesBuilder_ == null) {
         this.activityGoalPreferences_ = null;
         this.onChanged();
      } else {
         this.activityGoalPreferencesBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder clearField(FieldDescriptor var1) {
      return (Preferences$PbGeneralPreferences$Builder)super.clearField(var1);
   }

   public Preferences$PbGeneralPreferences$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder clearLocalizationPreferences() {
      if (this.localizationPreferencesBuilder_ == null) {
         this.localizationPreferences_ = null;
         this.onChanged();
      } else {
         this.localizationPreferencesBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder clearOneof(OneofDescriptor var1) {
      return (Preferences$PbGeneralPreferences$Builder)super.clearOneof(var1);
   }

   public Preferences$PbGeneralPreferences$Builder clearTrainingPreferences() {
      if (this.trainingPreferencesBuilder_ == null) {
         this.trainingPreferences_ = null;
         this.onChanged();
      } else {
         this.trainingPreferencesBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder clone() {
      return (Preferences$PbGeneralPreferences$Builder)super.clone();
   }

   public Preferences$PbActivityGoalPreferences getActivityGoalPreferences() {
      Preferences$PbActivityGoalPreferences var1;
      if (this.activityGoalPreferencesBuilder_ == null) {
         if (this.activityGoalPreferences_ == null) {
            var1 = Preferences$PbActivityGoalPreferences.getDefaultInstance();
         } else {
            var1 = this.activityGoalPreferences_;
         }
      } else {
         var1 = (Preferences$PbActivityGoalPreferences)this.activityGoalPreferencesBuilder_.getMessage();
      }

      return var1;
   }

   public Preferences$PbActivityGoalPreferences$Builder getActivityGoalPreferencesBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Preferences$PbActivityGoalPreferences$Builder)this.getActivityGoalPreferencesFieldBuilder().getBuilder();
   }

   public Preferences$PbActivityGoalPreferencesOrBuilder getActivityGoalPreferencesOrBuilder() {
      Object var1;
      if (this.activityGoalPreferencesBuilder_ != null) {
         var1 = (Preferences$PbActivityGoalPreferencesOrBuilder)this.activityGoalPreferencesBuilder_.getMessageOrBuilder();
      } else if (this.activityGoalPreferences_ == null) {
         var1 = Preferences$PbActivityGoalPreferences.getDefaultInstance();
      } else {
         var1 = this.activityGoalPreferences_;
      }

      return (Preferences$PbActivityGoalPreferencesOrBuilder)var1;
   }

   public Preferences$PbGeneralPreferences getDefaultInstanceForType() {
      return Preferences$PbGeneralPreferences.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Preferences.g();
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
      this.bitField0_ |= 8;
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

   public Preferences$PbLocalizationPreferences getLocalizationPreferences() {
      Preferences$PbLocalizationPreferences var1;
      if (this.localizationPreferencesBuilder_ == null) {
         if (this.localizationPreferences_ == null) {
            var1 = Preferences$PbLocalizationPreferences.getDefaultInstance();
         } else {
            var1 = this.localizationPreferences_;
         }
      } else {
         var1 = (Preferences$PbLocalizationPreferences)this.localizationPreferencesBuilder_.getMessage();
      }

      return var1;
   }

   public Preferences$PbLocalizationPreferences$Builder getLocalizationPreferencesBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Preferences$PbLocalizationPreferences$Builder)this.getLocalizationPreferencesFieldBuilder().getBuilder();
   }

   public Preferences$PbLocalizationPreferencesOrBuilder getLocalizationPreferencesOrBuilder() {
      Object var1;
      if (this.localizationPreferencesBuilder_ != null) {
         var1 = (Preferences$PbLocalizationPreferencesOrBuilder)this.localizationPreferencesBuilder_.getMessageOrBuilder();
      } else if (this.localizationPreferences_ == null) {
         var1 = Preferences$PbLocalizationPreferences.getDefaultInstance();
      } else {
         var1 = this.localizationPreferences_;
      }

      return (Preferences$PbLocalizationPreferencesOrBuilder)var1;
   }

   public Preferences$PbTrainingPreferences getTrainingPreferences() {
      Preferences$PbTrainingPreferences var1;
      if (this.trainingPreferencesBuilder_ == null) {
         if (this.trainingPreferences_ == null) {
            var1 = Preferences$PbTrainingPreferences.getDefaultInstance();
         } else {
            var1 = this.trainingPreferences_;
         }
      } else {
         var1 = (Preferences$PbTrainingPreferences)this.trainingPreferencesBuilder_.getMessage();
      }

      return var1;
   }

   public Preferences$PbTrainingPreferences$Builder getTrainingPreferencesBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Preferences$PbTrainingPreferences$Builder)this.getTrainingPreferencesFieldBuilder().getBuilder();
   }

   public Preferences$PbTrainingPreferencesOrBuilder getTrainingPreferencesOrBuilder() {
      Object var1;
      if (this.trainingPreferencesBuilder_ != null) {
         var1 = (Preferences$PbTrainingPreferencesOrBuilder)this.trainingPreferencesBuilder_.getMessageOrBuilder();
      } else if (this.trainingPreferences_ == null) {
         var1 = Preferences$PbTrainingPreferences.getDefaultInstance();
      } else {
         var1 = this.trainingPreferences_;
      }

      return (Preferences$PbTrainingPreferencesOrBuilder)var1;
   }

   public boolean hasActivityGoalPreferences() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLocalizationPreferences() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingPreferences() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Preferences.h().ensureFieldAccessorsInitialized(Preferences$PbGeneralPreferences.class, Preferences$PbGeneralPreferences$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasLastModified()) {
         var2 = var1;
      } else {
         if (this.hasLocalizationPreferences()) {
            var2 = var1;
            if (!this.getLocalizationPreferences().isInitialized()) {
               return var2;
            }
         }

         if (this.hasActivityGoalPreferences()) {
            var2 = var1;
            if (!this.getActivityGoalPreferences().isInitialized()) {
               return var2;
            }
         }

         var2 = var1;
         if (this.getLastModified().isInitialized()) {
            var2 = true;
         }
      }

      return var2;
   }

   public Preferences$PbGeneralPreferences$Builder mergeActivityGoalPreferences(Preferences$PbActivityGoalPreferences var1) {
      if (this.activityGoalPreferencesBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.activityGoalPreferences_ != null && this.activityGoalPreferences_ != Preferences$PbActivityGoalPreferences.getDefaultInstance()) {
            this.activityGoalPreferences_ = Preferences$PbActivityGoalPreferences.newBuilder(this.activityGoalPreferences_).mergeFrom(var1).buildPartial();
         } else {
            this.activityGoalPreferences_ = var1;
         }

         this.onChanged();
      } else {
         this.activityGoalPreferencesBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Preferences$PbGeneralPreferences var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Preferences$PbGeneralPreferences)Preferences$PbGeneralPreferences.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Preferences$PbGeneralPreferences)var10.getUnfinishedMessage();
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

   public Preferences$PbGeneralPreferences$Builder mergeFrom(Message var1) {
      Preferences$PbGeneralPreferences$Builder var2;
      if (var1 instanceof Preferences$PbGeneralPreferences) {
         var2 = this.mergeFrom((Preferences$PbGeneralPreferences)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Preferences$PbGeneralPreferences$Builder mergeFrom(Preferences$PbGeneralPreferences var1) {
      if (var1 != Preferences$PbGeneralPreferences.getDefaultInstance()) {
         if (var1.hasLocalizationPreferences()) {
            this.mergeLocalizationPreferences(var1.getLocalizationPreferences());
         }

         if (var1.hasTrainingPreferences()) {
            this.mergeTrainingPreferences(var1.getTrainingPreferences());
         }

         if (var1.hasActivityGoalPreferences()) {
            this.mergeActivityGoalPreferences(var1.getActivityGoalPreferences());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         this.mergeUnknownFields(Preferences$PbGeneralPreferences.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Preferences$PbGeneralPreferences$Builder mergeLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.lastModified_ != null && this.lastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastModified_ = Types$PbSystemDateTime.newBuilder(this.lastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.lastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.lastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder mergeLocalizationPreferences(Preferences$PbLocalizationPreferences var1) {
      if (this.localizationPreferencesBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.localizationPreferences_ != null && this.localizationPreferences_ != Preferences$PbLocalizationPreferences.getDefaultInstance()) {
            this.localizationPreferences_ = Preferences$PbLocalizationPreferences.newBuilder(this.localizationPreferences_).mergeFrom(var1).buildPartial();
         } else {
            this.localizationPreferences_ = var1;
         }

         this.onChanged();
      } else {
         this.localizationPreferencesBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder mergeTrainingPreferences(Preferences$PbTrainingPreferences var1) {
      if (this.trainingPreferencesBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.trainingPreferences_ != null && this.trainingPreferences_ != Preferences$PbTrainingPreferences.getDefaultInstance()) {
            this.trainingPreferences_ = Preferences$PbTrainingPreferences.newBuilder(this.trainingPreferences_).mergeFrom(var1).buildPartial();
         } else {
            this.trainingPreferences_ = var1;
         }

         this.onChanged();
      } else {
         this.trainingPreferencesBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Preferences$PbGeneralPreferences$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Preferences$PbGeneralPreferences$Builder)super.mergeUnknownFields(var1);
   }

   public Preferences$PbGeneralPreferences$Builder setActivityGoalPreferences(Preferences$PbActivityGoalPreferences$Builder var1) {
      if (this.activityGoalPreferencesBuilder_ == null) {
         this.activityGoalPreferences_ = var1.build();
         this.onChanged();
      } else {
         this.activityGoalPreferencesBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder setActivityGoalPreferences(Preferences$PbActivityGoalPreferences var1) {
      if (this.activityGoalPreferencesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.activityGoalPreferences_ = var1;
         this.onChanged();
      } else {
         this.activityGoalPreferencesBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder setField(FieldDescriptor var1, Object var2) {
      return (Preferences$PbGeneralPreferences$Builder)super.setField(var1, var2);
   }

   public Preferences$PbGeneralPreferences$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder setLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastModified_ = var1;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder setLocalizationPreferences(Preferences$PbLocalizationPreferences$Builder var1) {
      if (this.localizationPreferencesBuilder_ == null) {
         this.localizationPreferences_ = var1.build();
         this.onChanged();
      } else {
         this.localizationPreferencesBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder setLocalizationPreferences(Preferences$PbLocalizationPreferences var1) {
      if (this.localizationPreferencesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.localizationPreferences_ = var1;
         this.onChanged();
      } else {
         this.localizationPreferencesBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Preferences$PbGeneralPreferences$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Preferences$PbGeneralPreferences$Builder setTrainingPreferences(Preferences$PbTrainingPreferences$Builder var1) {
      if (this.trainingPreferencesBuilder_ == null) {
         this.trainingPreferences_ = var1.build();
         this.onChanged();
      } else {
         this.trainingPreferencesBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Preferences$PbGeneralPreferences$Builder setTrainingPreferences(Preferences$PbTrainingPreferences var1) {
      if (this.trainingPreferencesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.trainingPreferences_ = var1;
         this.onChanged();
      } else {
         this.trainingPreferencesBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Preferences$PbGeneralPreferences$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Preferences$PbGeneralPreferences$Builder)super.setUnknownFields(var1);
   }
}
