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

public final class SportprofileDisplays$PbAlcorDisplaySettings$Builder extends Builder implements SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder {
   private int addedDefaultDisplays_;
   private int bitField0_;
   private RepeatedFieldBuilderV3 displayBuilder_;
   private List display_;
   private int lastShownDisplay_;

   private SportprofileDisplays$PbAlcorDisplaySettings$Builder() {
      this.display_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private SportprofileDisplays$PbAlcorDisplaySettings$Builder(BuilderParent var1) {
      super(var1);
      this.display_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileDisplays$PbAlcorDisplaySettings$Builder(BuilderParent var1, SportprofileDisplays$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileDisplays$PbAlcorDisplaySettings$Builder(SportprofileDisplays$1 var1) {
      this();
   }

   private void ensureDisplayIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.display_ = new ArrayList(this.display_);
         this.bitField0_ |= 1;
      }

   }

   public static final Descriptor getDescriptor() {
      return SportprofileDisplays.g();
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
      if (SportprofileDisplays$PbAlcorDisplaySettings.b()) {
         this.getDisplayFieldBuilder();
      }

   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder addAllDisplay(Iterable var1) {
      if (this.displayBuilder_ == null) {
         this.ensureDisplayIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.display_);
         this.onChanged();
      } else {
         this.displayBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder addDisplay(int var1, SportprofileDisplays$PbAlcorTrainingDisplay$Builder var2) {
      if (this.displayBuilder_ == null) {
         this.ensureDisplayIsMutable();
         this.display_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.displayBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder addDisplay(int var1, SportprofileDisplays$PbAlcorTrainingDisplay var2) {
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

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder addDisplay(SportprofileDisplays$PbAlcorTrainingDisplay$Builder var1) {
      if (this.displayBuilder_ == null) {
         this.ensureDisplayIsMutable();
         this.display_.add(var1.build());
         this.onChanged();
      } else {
         this.displayBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder addDisplay(SportprofileDisplays$PbAlcorTrainingDisplay var1) {
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

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder addDisplayBuilder() {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)this.getDisplayFieldBuilder().addBuilder(SportprofileDisplays$PbAlcorTrainingDisplay.getDefaultInstance());
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder addDisplayBuilder(int var1) {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)this.getDisplayFieldBuilder().addBuilder(var1, SportprofileDisplays$PbAlcorTrainingDisplay.getDefaultInstance());
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileDisplays$PbAlcorDisplaySettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileDisplays$PbAlcorDisplaySettings build() {
      SportprofileDisplays$PbAlcorDisplaySettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileDisplays$PbAlcorDisplaySettings buildPartial() {
      byte var1 = 1;
      SportprofileDisplays$PbAlcorDisplaySettings var2 = new SportprofileDisplays$PbAlcorDisplaySettings(this, (SportprofileDisplays$1)null);
      int var3 = this.bitField0_;
      if (this.displayBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.display_ = Collections.unmodifiableList(this.display_);
            this.bitField0_ &= -2;
         }

         SportprofileDisplays$PbAlcorDisplaySettings.a(var2, this.display_);
      } else {
         SportprofileDisplays$PbAlcorDisplaySettings.a(var2, this.displayBuilder_.build());
      }

      if ((var3 & 2) != 2) {
         var1 = 0;
      }

      SportprofileDisplays$PbAlcorDisplaySettings.a(var2, this.lastShownDisplay_);
      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 2;
      }

      SportprofileDisplays$PbAlcorDisplaySettings.b(var2, this.addedDefaultDisplays_);
      SportprofileDisplays$PbAlcorDisplaySettings.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder clear() {
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

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder clearAddedDefaultDisplays() {
      this.bitField0_ &= -5;
      this.addedDefaultDisplays_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder clearDisplay() {
      if (this.displayBuilder_ == null) {
         this.display_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.displayBuilder_.clear();
      }

      return this;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileDisplays$PbAlcorDisplaySettings$Builder)super.clearField(var1);
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder clearLastShownDisplay() {
      this.bitField0_ &= -3;
      this.lastShownDisplay_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileDisplays$PbAlcorDisplaySettings$Builder)super.clearOneof(var1);
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder clone() {
      return (SportprofileDisplays$PbAlcorDisplaySettings$Builder)super.clone();
   }

   public int getAddedDefaultDisplays() {
      return this.addedDefaultDisplays_;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings getDefaultInstanceForType() {
      return SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileDisplays.g();
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay getDisplay(int var1) {
      SportprofileDisplays$PbAlcorTrainingDisplay var2;
      if (this.displayBuilder_ == null) {
         var2 = (SportprofileDisplays$PbAlcorTrainingDisplay)this.display_.get(var1);
      } else {
         var2 = (SportprofileDisplays$PbAlcorTrainingDisplay)this.displayBuilder_.getMessage(var1);
      }

      return var2;
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder getDisplayBuilder(int var1) {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)this.getDisplayFieldBuilder().getBuilder(var1);
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

   public SportprofileDisplays$PbAlcorTrainingDisplayOrBuilder getDisplayOrBuilder(int var1) {
      SportprofileDisplays$PbAlcorTrainingDisplayOrBuilder var2;
      if (this.displayBuilder_ == null) {
         var2 = (SportprofileDisplays$PbAlcorTrainingDisplayOrBuilder)this.display_.get(var1);
      } else {
         var2 = (SportprofileDisplays$PbAlcorTrainingDisplayOrBuilder)this.displayBuilder_.getMessageOrBuilder(var1);
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
      return SportprofileDisplays.h().ensureFieldAccessorsInitialized(SportprofileDisplays$PbAlcorDisplaySettings.class, SportprofileDisplays$PbAlcorDisplaySettings$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileDisplays$PbAlcorDisplaySettings var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (SportprofileDisplays$PbAlcorDisplaySettings)SportprofileDisplays$PbAlcorDisplaySettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (SportprofileDisplays$PbAlcorDisplaySettings)var11.getUnfinishedMessage();
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

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder mergeFrom(Message var1) {
      SportprofileDisplays$PbAlcorDisplaySettings$Builder var2;
      if (var1 instanceof SportprofileDisplays$PbAlcorDisplaySettings) {
         var2 = this.mergeFrom((SportprofileDisplays$PbAlcorDisplaySettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder mergeFrom(SportprofileDisplays$PbAlcorDisplaySettings var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance()) {
         if (this.displayBuilder_ == null) {
            if (!SportprofileDisplays$PbAlcorDisplaySettings.a(var1).isEmpty()) {
               if (this.display_.isEmpty()) {
                  this.display_ = SportprofileDisplays$PbAlcorDisplaySettings.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensureDisplayIsMutable();
                  this.display_.addAll(SportprofileDisplays$PbAlcorDisplaySettings.a(var1));
               }

               this.onChanged();
            }
         } else if (!SportprofileDisplays$PbAlcorDisplaySettings.a(var1).isEmpty()) {
            if (this.displayBuilder_.isEmpty()) {
               this.displayBuilder_.dispose();
               this.displayBuilder_ = null;
               this.display_ = SportprofileDisplays$PbAlcorDisplaySettings.a(var1);
               this.bitField0_ &= -2;
               if (SportprofileDisplays$PbAlcorDisplaySettings.c()) {
                  var2 = this.getDisplayFieldBuilder();
               }

               this.displayBuilder_ = var2;
            } else {
               this.displayBuilder_.addAllMessages(SportprofileDisplays$PbAlcorDisplaySettings.a(var1));
            }
         }

         if (var1.hasLastShownDisplay()) {
            this.setLastShownDisplay(var1.getLastShownDisplay());
         }

         if (var1.hasAddedDefaultDisplays()) {
            this.setAddedDefaultDisplays(var1.getAddedDefaultDisplays());
         }

         this.mergeUnknownFields(SportprofileDisplays$PbAlcorDisplaySettings.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final SportprofileDisplays$PbAlcorDisplaySettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileDisplays$PbAlcorDisplaySettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder removeDisplay(int var1) {
      if (this.displayBuilder_ == null) {
         this.ensureDisplayIsMutable();
         this.display_.remove(var1);
         this.onChanged();
      } else {
         this.displayBuilder_.remove(var1);
      }

      return this;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder setAddedDefaultDisplays(int var1) {
      this.bitField0_ |= 4;
      this.addedDefaultDisplays_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder setDisplay(int var1, SportprofileDisplays$PbAlcorTrainingDisplay$Builder var2) {
      if (this.displayBuilder_ == null) {
         this.ensureDisplayIsMutable();
         this.display_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.displayBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder setDisplay(int var1, SportprofileDisplays$PbAlcorTrainingDisplay var2) {
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

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileDisplays$PbAlcorDisplaySettings$Builder)super.setField(var1, var2);
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder setLastShownDisplay(int var1) {
      this.bitField0_ |= 2;
      this.lastShownDisplay_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileDisplays$PbAlcorDisplaySettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final SportprofileDisplays$PbAlcorDisplaySettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileDisplays$PbAlcorDisplaySettings$Builder)super.setUnknownFields(var1);
   }
}
