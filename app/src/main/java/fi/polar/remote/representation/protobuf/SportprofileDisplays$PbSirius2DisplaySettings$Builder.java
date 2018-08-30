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

public final class SportprofileDisplays$PbSirius2DisplaySettings$Builder extends Builder implements SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder {
   private int addedDefaultDisplays_;
   private int bitField0_;
   private RepeatedFieldBuilderV3 displayBuilder_;
   private List display_;
   private int lastShownDisplay_;

   private SportprofileDisplays$PbSirius2DisplaySettings$Builder() {
      this.display_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private SportprofileDisplays$PbSirius2DisplaySettings$Builder(BuilderParent var1) {
      super(var1);
      this.display_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileDisplays$PbSirius2DisplaySettings$Builder(BuilderParent var1, SportprofileDisplays$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileDisplays$PbSirius2DisplaySettings$Builder(SportprofileDisplays$1 var1) {
      this();
   }

   private void ensureDisplayIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.display_ = new ArrayList(this.display_);
         this.bitField0_ |= 1;
      }

   }

   public static final Descriptor getDescriptor() {
      return SportprofileDisplays.c();
   }

   private RepeatedFieldBuilderV3 getDisplayFieldBuilder() {
      boolean var1 = true;
      if (this.displayBuilder_ == null) {
         List var2 = this.display_;
         if ((this.bitField0_ & 1) != 1) {
            var1 = false;
         }

         this.displayBuilder_ = new RepeatedFieldBuilderV3(var2, var1, this.getParentForChildren(), this.isClean());
         this.display_ = null;
      }

      return this.displayBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileDisplays$PbSirius2DisplaySettings.b()) {
         this.getDisplayFieldBuilder();
      }

   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder addAllDisplay(Iterable var1) {
      if (this.displayBuilder_ == null) {
         this.ensureDisplayIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.display_);
         this.onChanged();
      } else {
         this.displayBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder addDisplay(int var1, SportprofileDisplays$PbSirius2TrainingDisplay$Builder var2) {
      if (this.displayBuilder_ == null) {
         this.ensureDisplayIsMutable();
         this.display_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.displayBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder addDisplay(int var1, SportprofileDisplays$PbSirius2TrainingDisplay var2) {
      if (this.displayBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureDisplayIsMutable();
         this.display_.add(var1, var2);
         this.onChanged();
      } else {
         this.displayBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder addDisplay(SportprofileDisplays$PbSirius2TrainingDisplay$Builder var1) {
      if (this.displayBuilder_ == null) {
         this.ensureDisplayIsMutable();
         this.display_.add(var1.build());
         this.onChanged();
      } else {
         this.displayBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder addDisplay(SportprofileDisplays$PbSirius2TrainingDisplay var1) {
      if (this.displayBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureDisplayIsMutable();
         this.display_.add(var1);
         this.onChanged();
      } else {
         this.displayBuilder_.addMessage(var1);
      }

      return this;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder addDisplayBuilder() {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)this.getDisplayFieldBuilder().addBuilder(SportprofileDisplays$PbSirius2TrainingDisplay.getDefaultInstance());
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder addDisplayBuilder(int var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)this.getDisplayFieldBuilder().addBuilder(var1, SportprofileDisplays$PbSirius2TrainingDisplay.getDefaultInstance());
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileDisplays$PbSirius2DisplaySettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileDisplays$PbSirius2DisplaySettings build() {
      SportprofileDisplays$PbSirius2DisplaySettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileDisplays$PbSirius2DisplaySettings buildPartial() {
      byte var1 = 1;
      SportprofileDisplays$PbSirius2DisplaySettings var2 = new SportprofileDisplays$PbSirius2DisplaySettings(this, (SportprofileDisplays$1)null);
      int var3 = this.bitField0_;
      if (this.displayBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.display_ = Collections.unmodifiableList(this.display_);
            this.bitField0_ &= -2;
         }

         SportprofileDisplays$PbSirius2DisplaySettings.a(var2, this.display_);
      } else {
         SportprofileDisplays$PbSirius2DisplaySettings.a(var2, this.displayBuilder_.build());
      }

      if ((var3 & 2) != 2) {
         var1 = 0;
      }

      SportprofileDisplays$PbSirius2DisplaySettings.a(var2, this.lastShownDisplay_);
      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 2;
      }

      SportprofileDisplays$PbSirius2DisplaySettings.b(var2, this.addedDefaultDisplays_);
      SportprofileDisplays$PbSirius2DisplaySettings.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder clear() {
      super.clear();
      if (this.displayBuilder_ == null) {
         this.display_ = Collections.emptyList();
         this.bitField0_ &= -2;
      } else {
         this.displayBuilder_.clear();
      }

      this.lastShownDisplay_ = 0;
      this.bitField0_ &= -3;
      this.addedDefaultDisplays_ = 0;
      this.bitField0_ &= -5;
      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder clearAddedDefaultDisplays() {
      this.bitField0_ &= -5;
      this.addedDefaultDisplays_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder clearDisplay() {
      if (this.displayBuilder_ == null) {
         this.display_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.displayBuilder_.clear();
      }

      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileDisplays$PbSirius2DisplaySettings$Builder)super.clearField(var1);
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder clearLastShownDisplay() {
      this.bitField0_ &= -3;
      this.lastShownDisplay_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileDisplays$PbSirius2DisplaySettings$Builder)super.clearOneof(var1);
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder clone() {
      return (SportprofileDisplays$PbSirius2DisplaySettings$Builder)super.clone();
   }

   public int getAddedDefaultDisplays() {
      return this.addedDefaultDisplays_;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings getDefaultInstanceForType() {
      return SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileDisplays.c();
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay getDisplay(int var1) {
      SportprofileDisplays$PbSirius2TrainingDisplay var2;
      if (this.displayBuilder_ == null) {
         var2 = (SportprofileDisplays$PbSirius2TrainingDisplay)this.display_.get(var1);
      } else {
         var2 = (SportprofileDisplays$PbSirius2TrainingDisplay)this.displayBuilder_.getMessage(var1);
      }

      return var2;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder getDisplayBuilder(int var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)this.getDisplayFieldBuilder().getBuilder(var1);
   }

   public List getDisplayBuilderList() {
      return this.getDisplayFieldBuilder().getBuilderList();
   }

   public int getDisplayCount() {
      int var1;
      if (this.displayBuilder_ == null) {
         var1 = this.display_.size();
      } else {
         var1 = this.displayBuilder_.getCount();
      }

      return var1;
   }

   public List getDisplayList() {
      List var1;
      if (this.displayBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.display_);
      } else {
         var1 = this.displayBuilder_.getMessageList();
      }

      return var1;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplayOrBuilder getDisplayOrBuilder(int var1) {
      SportprofileDisplays$PbSirius2TrainingDisplayOrBuilder var2;
      if (this.displayBuilder_ == null) {
         var2 = (SportprofileDisplays$PbSirius2TrainingDisplayOrBuilder)this.display_.get(var1);
      } else {
         var2 = (SportprofileDisplays$PbSirius2TrainingDisplayOrBuilder)this.displayBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getDisplayOrBuilderList() {
      List var1;
      if (this.displayBuilder_ != null) {
         var1 = this.displayBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.display_);
      }

      return var1;
   }

   public int getLastShownDisplay() {
      return this.lastShownDisplay_;
   }

   public boolean hasAddedDefaultDisplays() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastShownDisplay() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileDisplays.d().ensureFieldAccessorsInitialized(SportprofileDisplays$PbSirius2DisplaySettings.class, SportprofileDisplays$PbSirius2DisplaySettings$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileDisplays$PbSirius2DisplaySettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         SportprofileDisplays$PbSirius2DisplaySettings var14;
         try {
            var13 = (SportprofileDisplays$PbSirius2DisplaySettings)SportprofileDisplays$PbSirius2DisplaySettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SportprofileDisplays$PbSirius2DisplaySettings)var10.getUnfinishedMessage();
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

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder mergeFrom(Message var1) {
      SportprofileDisplays$PbSirius2DisplaySettings$Builder var2;
      if (var1 instanceof SportprofileDisplays$PbSirius2DisplaySettings) {
         var2 = this.mergeFrom((SportprofileDisplays$PbSirius2DisplaySettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder mergeFrom(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance()) {
         if (this.displayBuilder_ == null) {
            if (!SportprofileDisplays$PbSirius2DisplaySettings.a(var1).isEmpty()) {
               if (this.display_.isEmpty()) {
                  this.display_ = SportprofileDisplays$PbSirius2DisplaySettings.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensureDisplayIsMutable();
                  this.display_.addAll(SportprofileDisplays$PbSirius2DisplaySettings.a(var1));
               }

               this.onChanged();
            }
         } else if (!SportprofileDisplays$PbSirius2DisplaySettings.a(var1).isEmpty()) {
            if (this.displayBuilder_.isEmpty()) {
               this.displayBuilder_.dispose();
               this.displayBuilder_ = null;
               this.display_ = SportprofileDisplays$PbSirius2DisplaySettings.a(var1);
               this.bitField0_ &= -2;
               if (SportprofileDisplays$PbSirius2DisplaySettings.c()) {
                  var2 = this.getDisplayFieldBuilder();
               }

               this.displayBuilder_ = var2;
            } else {
               this.displayBuilder_.addAllMessages(SportprofileDisplays$PbSirius2DisplaySettings.a(var1));
            }
         }

         if (var1.hasLastShownDisplay()) {
            this.setLastShownDisplay(var1.getLastShownDisplay());
         }

         if (var1.hasAddedDefaultDisplays()) {
            this.setAddedDefaultDisplays(var1.getAddedDefaultDisplays());
         }

         this.mergeUnknownFields(SportprofileDisplays$PbSirius2DisplaySettings.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final SportprofileDisplays$PbSirius2DisplaySettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileDisplays$PbSirius2DisplaySettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder removeDisplay(int var1) {
      if (this.displayBuilder_ == null) {
         this.ensureDisplayIsMutable();
         this.display_.remove(var1);
         this.onChanged();
      } else {
         this.displayBuilder_.remove(var1);
      }

      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder setAddedDefaultDisplays(int var1) {
      this.bitField0_ |= 4;
      this.addedDefaultDisplays_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder setDisplay(int var1, SportprofileDisplays$PbSirius2TrainingDisplay$Builder var2) {
      if (this.displayBuilder_ == null) {
         this.ensureDisplayIsMutable();
         this.display_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.displayBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder setDisplay(int var1, SportprofileDisplays$PbSirius2TrainingDisplay var2) {
      if (this.displayBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureDisplayIsMutable();
         this.display_.set(var1, var2);
         this.onChanged();
      } else {
         this.displayBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileDisplays$PbSirius2DisplaySettings$Builder)super.setField(var1, var2);
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder setLastShownDisplay(int var1) {
      this.bitField0_ |= 2;
      this.lastShownDisplay_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileDisplays$PbSirius2DisplaySettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final SportprofileDisplays$PbSirius2DisplaySettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileDisplays$PbSirius2DisplaySettings$Builder)super.setUnknownFields(var1);
   }
}
