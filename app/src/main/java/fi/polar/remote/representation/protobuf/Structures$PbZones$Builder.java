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

public final class Structures$PbZones$Builder extends Builder implements Structures$PbZonesOrBuilder {
   private int bitField0_;
   private int heartRateSettingSource_;
   private RepeatedFieldBuilderV3 heartRateZoneBuilder_;
   private List heartRateZone_;
   private int powerSettingSource_;
   private RepeatedFieldBuilderV3 powerZoneBuilder_;
   private List powerZone_;
   private int speedSettingSource_;
   private RepeatedFieldBuilderV3 speedZoneBuilder_;
   private List speedZone_;

   private Structures$PbZones$Builder() {
      this.heartRateZone_ = Collections.emptyList();
      this.speedZone_ = Collections.emptyList();
      this.powerZone_ = Collections.emptyList();
      this.heartRateSettingSource_ = 0;
      this.powerSettingSource_ = 0;
      this.speedSettingSource_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbZones$Builder(BuilderParent var1) {
      super(var1);
      this.heartRateZone_ = Collections.emptyList();
      this.speedZone_ = Collections.emptyList();
      this.powerZone_ = Collections.emptyList();
      this.heartRateSettingSource_ = 0;
      this.powerSettingSource_ = 0;
      this.speedSettingSource_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbZones$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbZones$Builder(Structures$1 var1) {
      this();
   }

   private void ensureHeartRateZoneIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.heartRateZone_ = new ArrayList(this.heartRateZone_);
         this.bitField0_ |= 1;
      }

   }

   private void ensurePowerZoneIsMutable() {
      if ((this.bitField0_ & 4) != 4) {
         this.powerZone_ = new ArrayList(this.powerZone_);
         this.bitField0_ |= 4;
      }

   }

   private void ensureSpeedZoneIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.speedZone_ = new ArrayList(this.speedZone_);
         this.bitField0_ |= 2;
      }

   }

   public static final Descriptor getDescriptor() {
      return Structures.o();
   }

   private RepeatedFieldBuilderV3 getHeartRateZoneFieldBuilder() {
      boolean var1 = true;
      if (this.heartRateZoneBuilder_ == null) {
         List var2 = this.heartRateZone_;
         if ((this.bitField0_ & 1) != 1) {
            var1 = false;
         }

         this.heartRateZoneBuilder_ = new RepeatedFieldBuilderV3(var2, var1, this.getParentForChildren(), this.isClean());
         this.heartRateZone_ = null;
      }

      return this.heartRateZoneBuilder_;
   }

   private RepeatedFieldBuilderV3 getPowerZoneFieldBuilder() {
      if (this.powerZoneBuilder_ == null) {
         List var1 = this.powerZone_;
         boolean var2;
         if ((this.bitField0_ & 4) == 4) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.powerZoneBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.powerZone_ = null;
      }

      return this.powerZoneBuilder_;
   }

   private RepeatedFieldBuilderV3 getSpeedZoneFieldBuilder() {
      if (this.speedZoneBuilder_ == null) {
         List var1 = this.speedZone_;
         boolean var2;
         if ((this.bitField0_ & 2) == 2) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.speedZoneBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.speedZone_ = null;
      }

      return this.speedZoneBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbZones.b()) {
         this.getHeartRateZoneFieldBuilder();
         this.getSpeedZoneFieldBuilder();
         this.getPowerZoneFieldBuilder();
      }

   }

   public Structures$PbZones$Builder addAllHeartRateZone(Iterable var1) {
      if (this.heartRateZoneBuilder_ == null) {
         this.ensureHeartRateZoneIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.heartRateZone_);
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Structures$PbZones$Builder addAllPowerZone(Iterable var1) {
      if (this.powerZoneBuilder_ == null) {
         this.ensurePowerZoneIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.powerZone_);
         this.onChanged();
      } else {
         this.powerZoneBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Structures$PbZones$Builder addAllSpeedZone(Iterable var1) {
      if (this.speedZoneBuilder_ == null) {
         this.ensureSpeedZoneIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.speedZone_);
         this.onChanged();
      } else {
         this.speedZoneBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Structures$PbZones$Builder addHeartRateZone(int var1, Structures$PbHeartRateZone$Builder var2) {
      if (this.heartRateZoneBuilder_ == null) {
         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Structures$PbZones$Builder addHeartRateZone(int var1, Structures$PbHeartRateZone var2) {
      if (this.heartRateZoneBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.add(var1, var2);
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public Structures$PbZones$Builder addHeartRateZone(Structures$PbHeartRateZone$Builder var1) {
      if (this.heartRateZoneBuilder_ == null) {
         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.add(var1.build());
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Structures$PbZones$Builder addHeartRateZone(Structures$PbHeartRateZone var1) {
      if (this.heartRateZoneBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.add(var1);
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.addMessage(var1);
      }

      return this;
   }

   public Structures$PbHeartRateZone$Builder addHeartRateZoneBuilder() {
      return (Structures$PbHeartRateZone$Builder)this.getHeartRateZoneFieldBuilder().addBuilder(Structures$PbHeartRateZone.getDefaultInstance());
   }

   public Structures$PbHeartRateZone$Builder addHeartRateZoneBuilder(int var1) {
      return (Structures$PbHeartRateZone$Builder)this.getHeartRateZoneFieldBuilder().addBuilder(var1, Structures$PbHeartRateZone.getDefaultInstance());
   }

   public Structures$PbZones$Builder addPowerZone(int var1, Structures$PbPowerZone$Builder var2) {
      if (this.powerZoneBuilder_ == null) {
         this.ensurePowerZoneIsMutable();
         this.powerZone_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.powerZoneBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Structures$PbZones$Builder addPowerZone(int var1, Structures$PbPowerZone var2) {
      if (this.powerZoneBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensurePowerZoneIsMutable();
         this.powerZone_.add(var1, var2);
         this.onChanged();
      } else {
         this.powerZoneBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public Structures$PbZones$Builder addPowerZone(Structures$PbPowerZone$Builder var1) {
      if (this.powerZoneBuilder_ == null) {
         this.ensurePowerZoneIsMutable();
         this.powerZone_.add(var1.build());
         this.onChanged();
      } else {
         this.powerZoneBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Structures$PbZones$Builder addPowerZone(Structures$PbPowerZone var1) {
      if (this.powerZoneBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensurePowerZoneIsMutable();
         this.powerZone_.add(var1);
         this.onChanged();
      } else {
         this.powerZoneBuilder_.addMessage(var1);
      }

      return this;
   }

   public Structures$PbPowerZone$Builder addPowerZoneBuilder() {
      return (Structures$PbPowerZone$Builder)this.getPowerZoneFieldBuilder().addBuilder(Structures$PbPowerZone.getDefaultInstance());
   }

   public Structures$PbPowerZone$Builder addPowerZoneBuilder(int var1) {
      return (Structures$PbPowerZone$Builder)this.getPowerZoneFieldBuilder().addBuilder(var1, Structures$PbPowerZone.getDefaultInstance());
   }

   public Structures$PbZones$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbZones$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbZones$Builder addSpeedZone(int var1, Structures$PbSpeedZone$Builder var2) {
      if (this.speedZoneBuilder_ == null) {
         this.ensureSpeedZoneIsMutable();
         this.speedZone_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.speedZoneBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Structures$PbZones$Builder addSpeedZone(int var1, Structures$PbSpeedZone var2) {
      if (this.speedZoneBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSpeedZoneIsMutable();
         this.speedZone_.add(var1, var2);
         this.onChanged();
      } else {
         this.speedZoneBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public Structures$PbZones$Builder addSpeedZone(Structures$PbSpeedZone$Builder var1) {
      if (this.speedZoneBuilder_ == null) {
         this.ensureSpeedZoneIsMutable();
         this.speedZone_.add(var1.build());
         this.onChanged();
      } else {
         this.speedZoneBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Structures$PbZones$Builder addSpeedZone(Structures$PbSpeedZone var1) {
      if (this.speedZoneBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureSpeedZoneIsMutable();
         this.speedZone_.add(var1);
         this.onChanged();
      } else {
         this.speedZoneBuilder_.addMessage(var1);
      }

      return this;
   }

   public Structures$PbSpeedZone$Builder addSpeedZoneBuilder() {
      return (Structures$PbSpeedZone$Builder)this.getSpeedZoneFieldBuilder().addBuilder(Structures$PbSpeedZone.getDefaultInstance());
   }

   public Structures$PbSpeedZone$Builder addSpeedZoneBuilder(int var1) {
      return (Structures$PbSpeedZone$Builder)this.getSpeedZoneFieldBuilder().addBuilder(var1, Structures$PbSpeedZone.getDefaultInstance());
   }

   public Structures$PbZones build() {
      Structures$PbZones var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbZones buildPartial() {
      byte var1 = 1;
      Structures$PbZones var2 = new Structures$PbZones(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if (this.heartRateZoneBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.heartRateZone_ = Collections.unmodifiableList(this.heartRateZone_);
            this.bitField0_ &= -2;
         }

         Structures$PbZones.a(var2, this.heartRateZone_);
      } else {
         Structures$PbZones.a(var2, this.heartRateZoneBuilder_.build());
      }

      if (this.speedZoneBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2) {
            this.speedZone_ = Collections.unmodifiableList(this.speedZone_);
            this.bitField0_ &= -3;
         }

         Structures$PbZones.b(var2, this.speedZone_);
      } else {
         Structures$PbZones.b(var2, this.speedZoneBuilder_.build());
      }

      if (this.powerZoneBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4) {
            this.powerZone_ = Collections.unmodifiableList(this.powerZone_);
            this.bitField0_ &= -5;
         }

         Structures$PbZones.c(var2, this.powerZone_);
      } else {
         Structures$PbZones.c(var2, this.powerZoneBuilder_.build());
      }

      if ((var3 & 8) != 8) {
         var1 = 0;
      }

      Structures$PbZones.a(var2, this.heartRateSettingSource_);
      int var4 = var1;
      if ((var3 & 16) == 16) {
         var4 = var1 | 2;
      }

      Structures$PbZones.b(var2, this.powerSettingSource_);
      int var5 = var4;
      if ((var3 & 32) == 32) {
         var5 = var4 | 4;
      }

      Structures$PbZones.c(var2, this.speedSettingSource_);
      Structures$PbZones.d(var2, var5);
      this.onBuilt();
      return var2;
   }

   public Structures$PbZones$Builder clear() {
      super.clear();
      if (this.heartRateZoneBuilder_ == null) {
         this.heartRateZone_ = Collections.emptyList();
         this.bitField0_ &= -2;
      } else {
         this.heartRateZoneBuilder_.clear();
      }

      if (this.speedZoneBuilder_ == null) {
         this.speedZone_ = Collections.emptyList();
         this.bitField0_ &= -3;
      } else {
         this.speedZoneBuilder_.clear();
      }

      if (this.powerZoneBuilder_ == null) {
         this.powerZone_ = Collections.emptyList();
         this.bitField0_ &= -5;
      } else {
         this.powerZoneBuilder_.clear();
      }

      this.heartRateSettingSource_ = 0;
      this.bitField0_ &= -9;
      this.powerSettingSource_ = 0;
      this.bitField0_ &= -17;
      this.speedSettingSource_ = 0;
      this.bitField0_ &= -33;
      return this;
   }

   public Structures$PbZones$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbZones$Builder)super.clearField(var1);
   }

   public Structures$PbZones$Builder clearHeartRateSettingSource() {
      this.bitField0_ &= -9;
      this.heartRateSettingSource_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbZones$Builder clearHeartRateZone() {
      if (this.heartRateZoneBuilder_ == null) {
         this.heartRateZone_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.clear();
      }

      return this;
   }

   public Structures$PbZones$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbZones$Builder)super.clearOneof(var1);
   }

   public Structures$PbZones$Builder clearPowerSettingSource() {
      this.bitField0_ &= -17;
      this.powerSettingSource_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbZones$Builder clearPowerZone() {
      if (this.powerZoneBuilder_ == null) {
         this.powerZone_ = Collections.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
      } else {
         this.powerZoneBuilder_.clear();
      }

      return this;
   }

   public Structures$PbZones$Builder clearSpeedSettingSource() {
      this.bitField0_ &= -33;
      this.speedSettingSource_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbZones$Builder clearSpeedZone() {
      if (this.speedZoneBuilder_ == null) {
         this.speedZone_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
      } else {
         this.speedZoneBuilder_.clear();
      }

      return this;
   }

   public Structures$PbZones$Builder clone() {
      return (Structures$PbZones$Builder)super.clone();
   }

   public Structures$PbZones getDefaultInstanceForType() {
      return Structures$PbZones.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.o();
   }

   public Types$PbHeartRateZoneSettingSource getHeartRateSettingSource() {
      Types$PbHeartRateZoneSettingSource var1 = Types$PbHeartRateZoneSettingSource.valueOf(this.heartRateSettingSource_);
      Types$PbHeartRateZoneSettingSource var2 = var1;
      if (var1 == null) {
         var2 = Types$PbHeartRateZoneSettingSource.HEART_RATE_ZONE_SETTING_SOURCE_DEFAULT;
      }

      return var2;
   }

   public Structures$PbHeartRateZone getHeartRateZone(int var1) {
      Structures$PbHeartRateZone var2;
      if (this.heartRateZoneBuilder_ == null) {
         var2 = (Structures$PbHeartRateZone)this.heartRateZone_.get(var1);
      } else {
         var2 = (Structures$PbHeartRateZone)this.heartRateZoneBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Structures$PbHeartRateZone$Builder getHeartRateZoneBuilder(int var1) {
      return (Structures$PbHeartRateZone$Builder)this.getHeartRateZoneFieldBuilder().getBuilder(var1);
   }

   public List getHeartRateZoneBuilderList() {
      return this.getHeartRateZoneFieldBuilder().getBuilderList();
   }

   public int getHeartRateZoneCount() {
      int var1;
      if (this.heartRateZoneBuilder_ == null) {
         var1 = this.heartRateZone_.size();
      } else {
         var1 = this.heartRateZoneBuilder_.getCount();
      }

      return var1;
   }

   public List getHeartRateZoneList() {
      List var1;
      if (this.heartRateZoneBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.heartRateZone_);
      } else {
         var1 = this.heartRateZoneBuilder_.getMessageList();
      }

      return var1;
   }

   public Structures$PbHeartRateZoneOrBuilder getHeartRateZoneOrBuilder(int var1) {
      Structures$PbHeartRateZoneOrBuilder var2;
      if (this.heartRateZoneBuilder_ == null) {
         var2 = (Structures$PbHeartRateZoneOrBuilder)this.heartRateZone_.get(var1);
      } else {
         var2 = (Structures$PbHeartRateZoneOrBuilder)this.heartRateZoneBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getHeartRateZoneOrBuilderList() {
      List var1;
      if (this.heartRateZoneBuilder_ != null) {
         var1 = this.heartRateZoneBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.heartRateZone_);
      }

      return var1;
   }

   public Types$PbPowerZoneSettingSource getPowerSettingSource() {
      Types$PbPowerZoneSettingSource var1 = Types$PbPowerZoneSettingSource.valueOf(this.powerSettingSource_);
      Types$PbPowerZoneSettingSource var2 = var1;
      if (var1 == null) {
         var2 = Types$PbPowerZoneSettingSource.POWER_ZONE_SETTING_SOURCE_DEFAULT;
      }

      return var2;
   }

   public Structures$PbPowerZone getPowerZone(int var1) {
      Structures$PbPowerZone var2;
      if (this.powerZoneBuilder_ == null) {
         var2 = (Structures$PbPowerZone)this.powerZone_.get(var1);
      } else {
         var2 = (Structures$PbPowerZone)this.powerZoneBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Structures$PbPowerZone$Builder getPowerZoneBuilder(int var1) {
      return (Structures$PbPowerZone$Builder)this.getPowerZoneFieldBuilder().getBuilder(var1);
   }

   public List getPowerZoneBuilderList() {
      return this.getPowerZoneFieldBuilder().getBuilderList();
   }

   public int getPowerZoneCount() {
      int var1;
      if (this.powerZoneBuilder_ == null) {
         var1 = this.powerZone_.size();
      } else {
         var1 = this.powerZoneBuilder_.getCount();
      }

      return var1;
   }

   public List getPowerZoneList() {
      List var1;
      if (this.powerZoneBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.powerZone_);
      } else {
         var1 = this.powerZoneBuilder_.getMessageList();
      }

      return var1;
   }

   public Structures$PbPowerZoneOrBuilder getPowerZoneOrBuilder(int var1) {
      Structures$PbPowerZoneOrBuilder var2;
      if (this.powerZoneBuilder_ == null) {
         var2 = (Structures$PbPowerZoneOrBuilder)this.powerZone_.get(var1);
      } else {
         var2 = (Structures$PbPowerZoneOrBuilder)this.powerZoneBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getPowerZoneOrBuilderList() {
      List var1;
      if (this.powerZoneBuilder_ != null) {
         var1 = this.powerZoneBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.powerZone_);
      }

      return var1;
   }

   public Types$PbSpeedZoneSettingSource getSpeedSettingSource() {
      Types$PbSpeedZoneSettingSource var1 = Types$PbSpeedZoneSettingSource.valueOf(this.speedSettingSource_);
      Types$PbSpeedZoneSettingSource var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSpeedZoneSettingSource.SPEED_ZONE_SETTING_SOURCE_DEFAULT;
      }

      return var2;
   }

   public Structures$PbSpeedZone getSpeedZone(int var1) {
      Structures$PbSpeedZone var2;
      if (this.speedZoneBuilder_ == null) {
         var2 = (Structures$PbSpeedZone)this.speedZone_.get(var1);
      } else {
         var2 = (Structures$PbSpeedZone)this.speedZoneBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Structures$PbSpeedZone$Builder getSpeedZoneBuilder(int var1) {
      return (Structures$PbSpeedZone$Builder)this.getSpeedZoneFieldBuilder().getBuilder(var1);
   }

   public List getSpeedZoneBuilderList() {
      return this.getSpeedZoneFieldBuilder().getBuilderList();
   }

   public int getSpeedZoneCount() {
      int var1;
      if (this.speedZoneBuilder_ == null) {
         var1 = this.speedZone_.size();
      } else {
         var1 = this.speedZoneBuilder_.getCount();
      }

      return var1;
   }

   public List getSpeedZoneList() {
      List var1;
      if (this.speedZoneBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.speedZone_);
      } else {
         var1 = this.speedZoneBuilder_.getMessageList();
      }

      return var1;
   }

   public Structures$PbSpeedZoneOrBuilder getSpeedZoneOrBuilder(int var1) {
      Structures$PbSpeedZoneOrBuilder var2;
      if (this.speedZoneBuilder_ == null) {
         var2 = (Structures$PbSpeedZoneOrBuilder)this.speedZone_.get(var1);
      } else {
         var2 = (Structures$PbSpeedZoneOrBuilder)this.speedZoneBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getSpeedZoneOrBuilderList() {
      List var1;
      if (this.speedZoneBuilder_ != null) {
         var1 = this.speedZoneBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.speedZone_);
      }

      return var1;
   }

   public boolean hasHeartRateSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPowerSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.p().ensureFieldAccessorsInitialized(Structures$PbZones.class, Structures$PbZones$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      int var2 = 0;

      boolean var3;
      while(true) {
         if (var2 >= this.getHeartRateZoneCount()) {
            for(var2 = 0; var2 < this.getSpeedZoneCount(); ++var2) {
               var3 = var1;
               if (!this.getSpeedZone(var2).isInitialized()) {
                  return var3;
               }
            }

            for(var2 = 0; var2 < this.getPowerZoneCount(); ++var2) {
               var3 = var1;
               if (!this.getPowerZone(var2).isInitialized()) {
                  return var3;
               }
            }

            var3 = true;
            break;
         }

         if (!this.getHeartRateZone(var2).isInitialized()) {
            var3 = var1;
            break;
         }

         ++var2;
      }

      return var3;
   }

   public Structures$PbZones$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbZones var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbZones)Structures$PbZones.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbZones)var10.getUnfinishedMessage();
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

   public Structures$PbZones$Builder mergeFrom(Message var1) {
      Structures$PbZones$Builder var2;
      if (var1 instanceof Structures$PbZones) {
         var2 = this.mergeFrom((Structures$PbZones)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbZones$Builder mergeFrom(Structures$PbZones var1) {
      Object var2 = null;
      if (var1 != Structures$PbZones.getDefaultInstance()) {
         RepeatedFieldBuilderV3 var3;
         if (this.heartRateZoneBuilder_ == null) {
            if (!Structures$PbZones.a(var1).isEmpty()) {
               if (this.heartRateZone_.isEmpty()) {
                  this.heartRateZone_ = Structures$PbZones.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensureHeartRateZoneIsMutable();
                  this.heartRateZone_.addAll(Structures$PbZones.a(var1));
               }

               this.onChanged();
            }
         } else if (!Structures$PbZones.a(var1).isEmpty()) {
            if (this.heartRateZoneBuilder_.isEmpty()) {
               this.heartRateZoneBuilder_.dispose();
               this.heartRateZoneBuilder_ = null;
               this.heartRateZone_ = Structures$PbZones.a(var1);
               this.bitField0_ &= -2;
               if (Structures$PbZones.c()) {
                  var3 = this.getHeartRateZoneFieldBuilder();
               } else {
                  var3 = null;
               }

               this.heartRateZoneBuilder_ = var3;
            } else {
               this.heartRateZoneBuilder_.addAllMessages(Structures$PbZones.a(var1));
            }
         }

         if (this.speedZoneBuilder_ == null) {
            if (!Structures$PbZones.b(var1).isEmpty()) {
               if (this.speedZone_.isEmpty()) {
                  this.speedZone_ = Structures$PbZones.b(var1);
                  this.bitField0_ &= -3;
               } else {
                  this.ensureSpeedZoneIsMutable();
                  this.speedZone_.addAll(Structures$PbZones.b(var1));
               }

               this.onChanged();
            }
         } else if (!Structures$PbZones.b(var1).isEmpty()) {
            if (this.speedZoneBuilder_.isEmpty()) {
               this.speedZoneBuilder_.dispose();
               this.speedZoneBuilder_ = null;
               this.speedZone_ = Structures$PbZones.b(var1);
               this.bitField0_ &= -3;
               if (Structures$PbZones.d()) {
                  var3 = this.getSpeedZoneFieldBuilder();
               } else {
                  var3 = null;
               }

               this.speedZoneBuilder_ = var3;
            } else {
               this.speedZoneBuilder_.addAllMessages(Structures$PbZones.b(var1));
            }
         }

         if (this.powerZoneBuilder_ == null) {
            if (!Structures$PbZones.c(var1).isEmpty()) {
               if (this.powerZone_.isEmpty()) {
                  this.powerZone_ = Structures$PbZones.c(var1);
                  this.bitField0_ &= -5;
               } else {
                  this.ensurePowerZoneIsMutable();
                  this.powerZone_.addAll(Structures$PbZones.c(var1));
               }

               this.onChanged();
            }
         } else if (!Structures$PbZones.c(var1).isEmpty()) {
            if (this.powerZoneBuilder_.isEmpty()) {
               this.powerZoneBuilder_.dispose();
               this.powerZoneBuilder_ = null;
               this.powerZone_ = Structures$PbZones.c(var1);
               this.bitField0_ &= -5;
               var3 = (RepeatedFieldBuilderV3)var2;
               if (Structures$PbZones.e()) {
                  var3 = this.getPowerZoneFieldBuilder();
               }

               this.powerZoneBuilder_ = var3;
            } else {
               this.powerZoneBuilder_.addAllMessages(Structures$PbZones.c(var1));
            }
         }

         if (var1.hasHeartRateSettingSource()) {
            this.setHeartRateSettingSource(var1.getHeartRateSettingSource());
         }

         if (var1.hasPowerSettingSource()) {
            this.setPowerSettingSource(var1.getPowerSettingSource());
         }

         if (var1.hasSpeedSettingSource()) {
            this.setSpeedSettingSource(var1.getSpeedSettingSource());
         }

         this.mergeUnknownFields(Structures$PbZones.d(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbZones$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbZones$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbZones$Builder removeHeartRateZone(int var1) {
      if (this.heartRateZoneBuilder_ == null) {
         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.remove(var1);
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.remove(var1);
      }

      return this;
   }

   public Structures$PbZones$Builder removePowerZone(int var1) {
      if (this.powerZoneBuilder_ == null) {
         this.ensurePowerZoneIsMutable();
         this.powerZone_.remove(var1);
         this.onChanged();
      } else {
         this.powerZoneBuilder_.remove(var1);
      }

      return this;
   }

   public Structures$PbZones$Builder removeSpeedZone(int var1) {
      if (this.speedZoneBuilder_ == null) {
         this.ensureSpeedZoneIsMutable();
         this.speedZone_.remove(var1);
         this.onChanged();
      } else {
         this.speedZoneBuilder_.remove(var1);
      }

      return this;
   }

   public Structures$PbZones$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbZones$Builder)super.setField(var1, var2);
   }

   public Structures$PbZones$Builder setHeartRateSettingSource(Types$PbHeartRateZoneSettingSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.heartRateSettingSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Structures$PbZones$Builder setHeartRateZone(int var1, Structures$PbHeartRateZone$Builder var2) {
      if (this.heartRateZoneBuilder_ == null) {
         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Structures$PbZones$Builder setHeartRateZone(int var1, Structures$PbHeartRateZone var2) {
      if (this.heartRateZoneBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.set(var1, var2);
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public Structures$PbZones$Builder setPowerSettingSource(Types$PbPowerZoneSettingSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.powerSettingSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Structures$PbZones$Builder setPowerZone(int var1, Structures$PbPowerZone$Builder var2) {
      if (this.powerZoneBuilder_ == null) {
         this.ensurePowerZoneIsMutable();
         this.powerZone_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.powerZoneBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Structures$PbZones$Builder setPowerZone(int var1, Structures$PbPowerZone var2) {
      if (this.powerZoneBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensurePowerZoneIsMutable();
         this.powerZone_.set(var1, var2);
         this.onChanged();
      } else {
         this.powerZoneBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public Structures$PbZones$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbZones$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbZones$Builder setSpeedSettingSource(Types$PbSpeedZoneSettingSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.speedSettingSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Structures$PbZones$Builder setSpeedZone(int var1, Structures$PbSpeedZone$Builder var2) {
      if (this.speedZoneBuilder_ == null) {
         this.ensureSpeedZoneIsMutable();
         this.speedZone_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.speedZoneBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Structures$PbZones$Builder setSpeedZone(int var1, Structures$PbSpeedZone var2) {
      if (this.speedZoneBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSpeedZoneIsMutable();
         this.speedZone_.set(var1, var2);
         this.onChanged();
      } else {
         this.speedZoneBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public final Structures$PbZones$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbZones$Builder)super.setUnknownFields(var1);
   }
}
