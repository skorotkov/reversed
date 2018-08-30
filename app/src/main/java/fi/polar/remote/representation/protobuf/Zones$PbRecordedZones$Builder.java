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

public final class Zones$PbRecordedZones$Builder extends Builder implements Zones$PbRecordedZonesOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 fatfitZonesBuilder_;
   private Zones$PbRecordedFatFitZones fatfitZones_;
   private int heartRateSettingSource_;
   private RepeatedFieldBuilderV3 heartRateZoneBuilder_;
   private List heartRateZone_;
   private int powerSettingSource_;
   private RepeatedFieldBuilderV3 powerZoneBuilder_;
   private List powerZone_;
   private int speedSettingSource_;
   private RepeatedFieldBuilderV3 speedZoneBuilder_;
   private List speedZone_;

   private Zones$PbRecordedZones$Builder() {
      this.heartRateZone_ = Collections.emptyList();
      this.powerZone_ = Collections.emptyList();
      this.fatfitZones_ = null;
      this.speedZone_ = Collections.emptyList();
      this.heartRateSettingSource_ = 0;
      this.powerSettingSource_ = 0;
      this.speedSettingSource_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Zones$PbRecordedZones$Builder(BuilderParent var1) {
      super(var1);
      this.heartRateZone_ = Collections.emptyList();
      this.powerZone_ = Collections.emptyList();
      this.fatfitZones_ = null;
      this.speedZone_ = Collections.emptyList();
      this.heartRateSettingSource_ = 0;
      this.powerSettingSource_ = 0;
      this.speedSettingSource_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Zones$PbRecordedZones$Builder(BuilderParent var1, Zones$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Zones$PbRecordedZones$Builder(Zones$1 var1) {
      this();
   }

   private void ensureHeartRateZoneIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.heartRateZone_ = new ArrayList(this.heartRateZone_);
         this.bitField0_ |= 1;
      }

   }

   private void ensurePowerZoneIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.powerZone_ = new ArrayList(this.powerZone_);
         this.bitField0_ |= 2;
      }

   }

   private void ensureSpeedZoneIsMutable() {
      if ((this.bitField0_ & 8) != 8) {
         this.speedZone_ = new ArrayList(this.speedZone_);
         this.bitField0_ |= 8;
      }

   }

   public static final Descriptor getDescriptor() {
      return Zones.i();
   }

   private SingleFieldBuilderV3 getFatfitZonesFieldBuilder() {
      if (this.fatfitZonesBuilder_ == null) {
         this.fatfitZonesBuilder_ = new SingleFieldBuilderV3(this.getFatfitZones(), this.getParentForChildren(), this.isClean());
         this.fatfitZones_ = null;
      }

      return this.fatfitZonesBuilder_;
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
         if ((this.bitField0_ & 2) == 2) {
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
         if ((this.bitField0_ & 8) == 8) {
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
      if (Zones$PbRecordedZones.b()) {
         this.getHeartRateZoneFieldBuilder();
         this.getPowerZoneFieldBuilder();
         this.getFatfitZonesFieldBuilder();
         this.getSpeedZoneFieldBuilder();
      }

   }

   public Zones$PbRecordedZones$Builder addAllHeartRateZone(Iterable var1) {
      if (this.heartRateZoneBuilder_ == null) {
         this.ensureHeartRateZoneIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.heartRateZone_);
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder addAllPowerZone(Iterable var1) {
      if (this.powerZoneBuilder_ == null) {
         this.ensurePowerZoneIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.powerZone_);
         this.onChanged();
      } else {
         this.powerZoneBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder addAllSpeedZone(Iterable var1) {
      if (this.speedZoneBuilder_ == null) {
         this.ensureSpeedZoneIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.speedZone_);
         this.onChanged();
      } else {
         this.speedZoneBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder addHeartRateZone(int var1, Zones$PbRecordedHeartRateZone$Builder var2) {
      if (this.heartRateZoneBuilder_ == null) {
         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder addHeartRateZone(int var1, Zones$PbRecordedHeartRateZone var2) {
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

   public Zones$PbRecordedZones$Builder addHeartRateZone(Zones$PbRecordedHeartRateZone$Builder var1) {
      if (this.heartRateZoneBuilder_ == null) {
         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.add(var1.build());
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder addHeartRateZone(Zones$PbRecordedHeartRateZone var1) {
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

   public Zones$PbRecordedHeartRateZone$Builder addHeartRateZoneBuilder() {
      return (Zones$PbRecordedHeartRateZone$Builder)this.getHeartRateZoneFieldBuilder().addBuilder(Zones$PbRecordedHeartRateZone.getDefaultInstance());
   }

   public Zones$PbRecordedHeartRateZone$Builder addHeartRateZoneBuilder(int var1) {
      return (Zones$PbRecordedHeartRateZone$Builder)this.getHeartRateZoneFieldBuilder().addBuilder(var1, Zones$PbRecordedHeartRateZone.getDefaultInstance());
   }

   public Zones$PbRecordedZones$Builder addPowerZone(int var1, Zones$PbRecordedPowerZone$Builder var2) {
      if (this.powerZoneBuilder_ == null) {
         this.ensurePowerZoneIsMutable();
         this.powerZone_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.powerZoneBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder addPowerZone(int var1, Zones$PbRecordedPowerZone var2) {
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

   public Zones$PbRecordedZones$Builder addPowerZone(Zones$PbRecordedPowerZone$Builder var1) {
      if (this.powerZoneBuilder_ == null) {
         this.ensurePowerZoneIsMutable();
         this.powerZone_.add(var1.build());
         this.onChanged();
      } else {
         this.powerZoneBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder addPowerZone(Zones$PbRecordedPowerZone var1) {
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

   public Zones$PbRecordedPowerZone$Builder addPowerZoneBuilder() {
      return (Zones$PbRecordedPowerZone$Builder)this.getPowerZoneFieldBuilder().addBuilder(Zones$PbRecordedPowerZone.getDefaultInstance());
   }

   public Zones$PbRecordedPowerZone$Builder addPowerZoneBuilder(int var1) {
      return (Zones$PbRecordedPowerZone$Builder)this.getPowerZoneFieldBuilder().addBuilder(var1, Zones$PbRecordedPowerZone.getDefaultInstance());
   }

   public Zones$PbRecordedZones$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Zones$PbRecordedZones$Builder)super.addRepeatedField(var1, var2);
   }

   public Zones$PbRecordedZones$Builder addSpeedZone(int var1, Zones$PbRecordedSpeedZone$Builder var2) {
      if (this.speedZoneBuilder_ == null) {
         this.ensureSpeedZoneIsMutable();
         this.speedZone_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.speedZoneBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder addSpeedZone(int var1, Zones$PbRecordedSpeedZone var2) {
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

   public Zones$PbRecordedZones$Builder addSpeedZone(Zones$PbRecordedSpeedZone$Builder var1) {
      if (this.speedZoneBuilder_ == null) {
         this.ensureSpeedZoneIsMutable();
         this.speedZone_.add(var1.build());
         this.onChanged();
      } else {
         this.speedZoneBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder addSpeedZone(Zones$PbRecordedSpeedZone var1) {
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

   public Zones$PbRecordedSpeedZone$Builder addSpeedZoneBuilder() {
      return (Zones$PbRecordedSpeedZone$Builder)this.getSpeedZoneFieldBuilder().addBuilder(Zones$PbRecordedSpeedZone.getDefaultInstance());
   }

   public Zones$PbRecordedSpeedZone$Builder addSpeedZoneBuilder(int var1) {
      return (Zones$PbRecordedSpeedZone$Builder)this.getSpeedZoneFieldBuilder().addBuilder(var1, Zones$PbRecordedSpeedZone.getDefaultInstance());
   }

   public Zones$PbRecordedZones build() {
      Zones$PbRecordedZones var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Zones$PbRecordedZones buildPartial() {
      Zones$PbRecordedZones var1 = new Zones$PbRecordedZones(this, (Zones$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if (this.heartRateZoneBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.heartRateZone_ = Collections.unmodifiableList(this.heartRateZone_);
            this.bitField0_ &= -2;
         }

         Zones$PbRecordedZones.a(var1, this.heartRateZone_);
      } else {
         Zones$PbRecordedZones.a(var1, this.heartRateZoneBuilder_.build());
      }

      if (this.powerZoneBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2) {
            this.powerZone_ = Collections.unmodifiableList(this.powerZone_);
            this.bitField0_ &= -3;
         }

         Zones$PbRecordedZones.b(var1, this.powerZone_);
      } else {
         Zones$PbRecordedZones.b(var1, this.powerZoneBuilder_.build());
      }

      if ((var2 & 4) == 4) {
         var3 = 1;
      }

      if (this.fatfitZonesBuilder_ == null) {
         Zones$PbRecordedZones.a(var1, this.fatfitZones_);
      } else {
         Zones$PbRecordedZones.a(var1, (Zones$PbRecordedFatFitZones)this.fatfitZonesBuilder_.build());
      }

      if (this.speedZoneBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8) {
            this.speedZone_ = Collections.unmodifiableList(this.speedZone_);
            this.bitField0_ &= -9;
         }

         Zones$PbRecordedZones.c(var1, this.speedZone_);
      } else {
         Zones$PbRecordedZones.c(var1, this.speedZoneBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 16) == 16) {
         var4 = var3 | 2;
      }

      Zones$PbRecordedZones.a(var1, this.heartRateSettingSource_);
      int var5 = var4;
      if ((var2 & 32) == 32) {
         var5 = var4 | 4;
      }

      Zones$PbRecordedZones.b(var1, this.powerSettingSource_);
      var4 = var5;
      if ((var2 & 64) == 64) {
         var4 = var5 | 8;
      }

      Zones$PbRecordedZones.c(var1, this.speedSettingSource_);
      Zones$PbRecordedZones.d(var1, var4);
      this.onBuilt();
      return var1;
   }

   public Zones$PbRecordedZones$Builder clear() {
      super.clear();
      if (this.heartRateZoneBuilder_ == null) {
         this.heartRateZone_ = Collections.emptyList();
         this.bitField0_ &= -2;
      } else {
         this.heartRateZoneBuilder_.clear();
      }

      if (this.powerZoneBuilder_ == null) {
         this.powerZone_ = Collections.emptyList();
         this.bitField0_ &= -3;
      } else {
         this.powerZoneBuilder_.clear();
      }

      if (this.fatfitZonesBuilder_ == null) {
         this.fatfitZones_ = null;
      } else {
         this.fatfitZonesBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.speedZoneBuilder_ == null) {
         this.speedZone_ = Collections.emptyList();
         this.bitField0_ &= -9;
      } else {
         this.speedZoneBuilder_.clear();
      }

      this.heartRateSettingSource_ = 0;
      this.bitField0_ &= -17;
      this.powerSettingSource_ = 0;
      this.bitField0_ &= -33;
      this.speedSettingSource_ = 0;
      this.bitField0_ &= -65;
      return this;
   }

   public Zones$PbRecordedZones$Builder clearFatfitZones() {
      if (this.fatfitZonesBuilder_ == null) {
         this.fatfitZones_ = null;
         this.onChanged();
      } else {
         this.fatfitZonesBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Zones$PbRecordedZones$Builder clearField(FieldDescriptor var1) {
      return (Zones$PbRecordedZones$Builder)super.clearField(var1);
   }

   public Zones$PbRecordedZones$Builder clearHeartRateSettingSource() {
      this.bitField0_ &= -17;
      this.heartRateSettingSource_ = 0;
      this.onChanged();
      return this;
   }

   public Zones$PbRecordedZones$Builder clearHeartRateZone() {
      if (this.heartRateZoneBuilder_ == null) {
         this.heartRateZone_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.clear();
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder clearOneof(OneofDescriptor var1) {
      return (Zones$PbRecordedZones$Builder)super.clearOneof(var1);
   }

   public Zones$PbRecordedZones$Builder clearPowerSettingSource() {
      this.bitField0_ &= -33;
      this.powerSettingSource_ = 0;
      this.onChanged();
      return this;
   }

   public Zones$PbRecordedZones$Builder clearPowerZone() {
      if (this.powerZoneBuilder_ == null) {
         this.powerZone_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
      } else {
         this.powerZoneBuilder_.clear();
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder clearSpeedSettingSource() {
      this.bitField0_ &= -65;
      this.speedSettingSource_ = 0;
      this.onChanged();
      return this;
   }

   public Zones$PbRecordedZones$Builder clearSpeedZone() {
      if (this.speedZoneBuilder_ == null) {
         this.speedZone_ = Collections.emptyList();
         this.bitField0_ &= -9;
         this.onChanged();
      } else {
         this.speedZoneBuilder_.clear();
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder clone() {
      return (Zones$PbRecordedZones$Builder)super.clone();
   }

   public Zones$PbRecordedZones getDefaultInstanceForType() {
      return Zones$PbRecordedZones.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Zones.i();
   }

   public Zones$PbRecordedFatFitZones getFatfitZones() {
      Zones$PbRecordedFatFitZones var1;
      if (this.fatfitZonesBuilder_ == null) {
         if (this.fatfitZones_ == null) {
            var1 = Zones$PbRecordedFatFitZones.getDefaultInstance();
         } else {
            var1 = this.fatfitZones_;
         }
      } else {
         var1 = (Zones$PbRecordedFatFitZones)this.fatfitZonesBuilder_.getMessage();
      }

      return var1;
   }

   public Zones$PbRecordedFatFitZones$Builder getFatfitZonesBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Zones$PbRecordedFatFitZones$Builder)this.getFatfitZonesFieldBuilder().getBuilder();
   }

   public Zones$PbRecordedFatFitZonesOrBuilder getFatfitZonesOrBuilder() {
      Object var1;
      if (this.fatfitZonesBuilder_ != null) {
         var1 = (Zones$PbRecordedFatFitZonesOrBuilder)this.fatfitZonesBuilder_.getMessageOrBuilder();
      } else if (this.fatfitZones_ == null) {
         var1 = Zones$PbRecordedFatFitZones.getDefaultInstance();
      } else {
         var1 = this.fatfitZones_;
      }

      return (Zones$PbRecordedFatFitZonesOrBuilder)var1;
   }

   public Types$PbHeartRateZoneSettingSource getHeartRateSettingSource() {
      Types$PbHeartRateZoneSettingSource var1 = Types$PbHeartRateZoneSettingSource.valueOf(this.heartRateSettingSource_);
      Types$PbHeartRateZoneSettingSource var2 = var1;
      if (var1 == null) {
         var2 = Types$PbHeartRateZoneSettingSource.HEART_RATE_ZONE_SETTING_SOURCE_DEFAULT;
      }

      return var2;
   }

   public Zones$PbRecordedHeartRateZone getHeartRateZone(int var1) {
      Zones$PbRecordedHeartRateZone var2;
      if (this.heartRateZoneBuilder_ == null) {
         var2 = (Zones$PbRecordedHeartRateZone)this.heartRateZone_.get(var1);
      } else {
         var2 = (Zones$PbRecordedHeartRateZone)this.heartRateZoneBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Zones$PbRecordedHeartRateZone$Builder getHeartRateZoneBuilder(int var1) {
      return (Zones$PbRecordedHeartRateZone$Builder)this.getHeartRateZoneFieldBuilder().getBuilder(var1);
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

   public Zones$PbRecordedHeartRateZoneOrBuilder getHeartRateZoneOrBuilder(int var1) {
      Zones$PbRecordedHeartRateZoneOrBuilder var2;
      if (this.heartRateZoneBuilder_ == null) {
         var2 = (Zones$PbRecordedHeartRateZoneOrBuilder)this.heartRateZone_.get(var1);
      } else {
         var2 = (Zones$PbRecordedHeartRateZoneOrBuilder)this.heartRateZoneBuilder_.getMessageOrBuilder(var1);
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

   public Zones$PbRecordedPowerZone getPowerZone(int var1) {
      Zones$PbRecordedPowerZone var2;
      if (this.powerZoneBuilder_ == null) {
         var2 = (Zones$PbRecordedPowerZone)this.powerZone_.get(var1);
      } else {
         var2 = (Zones$PbRecordedPowerZone)this.powerZoneBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Zones$PbRecordedPowerZone$Builder getPowerZoneBuilder(int var1) {
      return (Zones$PbRecordedPowerZone$Builder)this.getPowerZoneFieldBuilder().getBuilder(var1);
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

   public Zones$PbRecordedPowerZoneOrBuilder getPowerZoneOrBuilder(int var1) {
      Zones$PbRecordedPowerZoneOrBuilder var2;
      if (this.powerZoneBuilder_ == null) {
         var2 = (Zones$PbRecordedPowerZoneOrBuilder)this.powerZone_.get(var1);
      } else {
         var2 = (Zones$PbRecordedPowerZoneOrBuilder)this.powerZoneBuilder_.getMessageOrBuilder(var1);
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

   public Zones$PbRecordedSpeedZone getSpeedZone(int var1) {
      Zones$PbRecordedSpeedZone var2;
      if (this.speedZoneBuilder_ == null) {
         var2 = (Zones$PbRecordedSpeedZone)this.speedZone_.get(var1);
      } else {
         var2 = (Zones$PbRecordedSpeedZone)this.speedZoneBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Zones$PbRecordedSpeedZone$Builder getSpeedZoneBuilder(int var1) {
      return (Zones$PbRecordedSpeedZone$Builder)this.getSpeedZoneFieldBuilder().getBuilder(var1);
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

   public Zones$PbRecordedSpeedZoneOrBuilder getSpeedZoneOrBuilder(int var1) {
      Zones$PbRecordedSpeedZoneOrBuilder var2;
      if (this.speedZoneBuilder_ == null) {
         var2 = (Zones$PbRecordedSpeedZoneOrBuilder)this.speedZone_.get(var1);
      } else {
         var2 = (Zones$PbRecordedSpeedZoneOrBuilder)this.speedZoneBuilder_.getMessageOrBuilder(var1);
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

   public boolean hasFatfitZones() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRateSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPowerSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Zones.j().ensureFieldAccessorsInitialized(Zones$PbRecordedZones.class, Zones$PbRecordedZones$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      int var2 = 0;

      boolean var3;
      while(true) {
         if (var2 >= this.getHeartRateZoneCount()) {
            for(var2 = 0; var2 < this.getPowerZoneCount(); ++var2) {
               var3 = var1;
               if (!this.getPowerZone(var2).isInitialized()) {
                  return var3;
               }
            }

            if (this.hasFatfitZones()) {
               var3 = var1;
               if (!this.getFatfitZones().isInitialized()) {
                  break;
               }
            }

            for(var2 = 0; var2 < this.getSpeedZoneCount(); ++var2) {
               var3 = var1;
               if (!this.getSpeedZone(var2).isInitialized()) {
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

   public Zones$PbRecordedZones$Builder mergeFatfitZones(Zones$PbRecordedFatFitZones var1) {
      if (this.fatfitZonesBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.fatfitZones_ != null && this.fatfitZones_ != Zones$PbRecordedFatFitZones.getDefaultInstance()) {
            this.fatfitZones_ = Zones$PbRecordedFatFitZones.newBuilder(this.fatfitZones_).mergeFrom(var1).buildPartial();
         } else {
            this.fatfitZones_ = var1;
         }

         this.onChanged();
      } else {
         this.fatfitZonesBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Zones$PbRecordedZones$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Zones$PbRecordedZones var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (Zones$PbRecordedZones)Zones$PbRecordedZones.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (Zones$PbRecordedZones)var11.getUnfinishedMessage();
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

   public Zones$PbRecordedZones$Builder mergeFrom(Message var1) {
      Zones$PbRecordedZones$Builder var2;
      if (var1 instanceof Zones$PbRecordedZones) {
         var2 = this.mergeFrom((Zones$PbRecordedZones)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Zones$PbRecordedZones$Builder mergeFrom(Zones$PbRecordedZones var1) {
      Object var2 = null;
      if (var1 != Zones$PbRecordedZones.getDefaultInstance()) {
         RepeatedFieldBuilderV3 var3;
         if (this.heartRateZoneBuilder_ == null) {
            if (!Zones$PbRecordedZones.a(var1).isEmpty()) {
               if (this.heartRateZone_.isEmpty()) {
                  this.heartRateZone_ = Zones$PbRecordedZones.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensureHeartRateZoneIsMutable();
                  this.heartRateZone_.addAll(Zones$PbRecordedZones.a(var1));
               }

               this.onChanged();
            }
         } else if (!Zones$PbRecordedZones.a(var1).isEmpty()) {
            if (this.heartRateZoneBuilder_.isEmpty()) {
               this.heartRateZoneBuilder_.dispose();
               this.heartRateZoneBuilder_ = null;
               this.heartRateZone_ = Zones$PbRecordedZones.a(var1);
               this.bitField0_ &= -2;
               if (Zones$PbRecordedZones.c()) {
                  var3 = this.getHeartRateZoneFieldBuilder();
               } else {
                  var3 = null;
               }

               this.heartRateZoneBuilder_ = var3;
            } else {
               this.heartRateZoneBuilder_.addAllMessages(Zones$PbRecordedZones.a(var1));
            }
         }

         if (this.powerZoneBuilder_ == null) {
            if (!Zones$PbRecordedZones.b(var1).isEmpty()) {
               if (this.powerZone_.isEmpty()) {
                  this.powerZone_ = Zones$PbRecordedZones.b(var1);
                  this.bitField0_ &= -3;
               } else {
                  this.ensurePowerZoneIsMutable();
                  this.powerZone_.addAll(Zones$PbRecordedZones.b(var1));
               }

               this.onChanged();
            }
         } else if (!Zones$PbRecordedZones.b(var1).isEmpty()) {
            if (this.powerZoneBuilder_.isEmpty()) {
               this.powerZoneBuilder_.dispose();
               this.powerZoneBuilder_ = null;
               this.powerZone_ = Zones$PbRecordedZones.b(var1);
               this.bitField0_ &= -3;
               if (Zones$PbRecordedZones.d()) {
                  var3 = this.getPowerZoneFieldBuilder();
               } else {
                  var3 = null;
               }

               this.powerZoneBuilder_ = var3;
            } else {
               this.powerZoneBuilder_.addAllMessages(Zones$PbRecordedZones.b(var1));
            }
         }

         if (var1.hasFatfitZones()) {
            this.mergeFatfitZones(var1.getFatfitZones());
         }

         if (this.speedZoneBuilder_ == null) {
            if (!Zones$PbRecordedZones.c(var1).isEmpty()) {
               if (this.speedZone_.isEmpty()) {
                  this.speedZone_ = Zones$PbRecordedZones.c(var1);
                  this.bitField0_ &= -9;
               } else {
                  this.ensureSpeedZoneIsMutable();
                  this.speedZone_.addAll(Zones$PbRecordedZones.c(var1));
               }

               this.onChanged();
            }
         } else if (!Zones$PbRecordedZones.c(var1).isEmpty()) {
            if (this.speedZoneBuilder_.isEmpty()) {
               this.speedZoneBuilder_.dispose();
               this.speedZoneBuilder_ = null;
               this.speedZone_ = Zones$PbRecordedZones.c(var1);
               this.bitField0_ &= -9;
               var3 = (RepeatedFieldBuilderV3)var2;
               if (Zones$PbRecordedZones.e()) {
                  var3 = this.getSpeedZoneFieldBuilder();
               }

               this.speedZoneBuilder_ = var3;
            } else {
               this.speedZoneBuilder_.addAllMessages(Zones$PbRecordedZones.c(var1));
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

         this.mergeUnknownFields(Zones$PbRecordedZones.d(var1));
         this.onChanged();
      }

      return this;
   }

   public final Zones$PbRecordedZones$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Zones$PbRecordedZones$Builder)super.mergeUnknownFields(var1);
   }

   public Zones$PbRecordedZones$Builder removeHeartRateZone(int var1) {
      if (this.heartRateZoneBuilder_ == null) {
         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.remove(var1);
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.remove(var1);
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder removePowerZone(int var1) {
      if (this.powerZoneBuilder_ == null) {
         this.ensurePowerZoneIsMutable();
         this.powerZone_.remove(var1);
         this.onChanged();
      } else {
         this.powerZoneBuilder_.remove(var1);
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder removeSpeedZone(int var1) {
      if (this.speedZoneBuilder_ == null) {
         this.ensureSpeedZoneIsMutable();
         this.speedZone_.remove(var1);
         this.onChanged();
      } else {
         this.speedZoneBuilder_.remove(var1);
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder setFatfitZones(Zones$PbRecordedFatFitZones$Builder var1) {
      if (this.fatfitZonesBuilder_ == null) {
         this.fatfitZones_ = var1.build();
         this.onChanged();
      } else {
         this.fatfitZonesBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Zones$PbRecordedZones$Builder setFatfitZones(Zones$PbRecordedFatFitZones var1) {
      if (this.fatfitZonesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.fatfitZones_ = var1;
         this.onChanged();
      } else {
         this.fatfitZonesBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Zones$PbRecordedZones$Builder setField(FieldDescriptor var1, Object var2) {
      return (Zones$PbRecordedZones$Builder)super.setField(var1, var2);
   }

   public Zones$PbRecordedZones$Builder setHeartRateSettingSource(Types$PbHeartRateZoneSettingSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.heartRateSettingSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Zones$PbRecordedZones$Builder setHeartRateZone(int var1, Zones$PbRecordedHeartRateZone$Builder var2) {
      if (this.heartRateZoneBuilder_ == null) {
         this.ensureHeartRateZoneIsMutable();
         this.heartRateZone_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder setHeartRateZone(int var1, Zones$PbRecordedHeartRateZone var2) {
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

   public Zones$PbRecordedZones$Builder setPowerSettingSource(Types$PbPowerZoneSettingSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.powerSettingSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Zones$PbRecordedZones$Builder setPowerZone(int var1, Zones$PbRecordedPowerZone$Builder var2) {
      if (this.powerZoneBuilder_ == null) {
         this.ensurePowerZoneIsMutable();
         this.powerZone_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.powerZoneBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder setPowerZone(int var1, Zones$PbRecordedPowerZone var2) {
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

   public Zones$PbRecordedZones$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Zones$PbRecordedZones$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Zones$PbRecordedZones$Builder setSpeedSettingSource(Types$PbSpeedZoneSettingSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 64;
         this.speedSettingSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Zones$PbRecordedZones$Builder setSpeedZone(int var1, Zones$PbRecordedSpeedZone$Builder var2) {
      if (this.speedZoneBuilder_ == null) {
         this.ensureSpeedZoneIsMutable();
         this.speedZone_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.speedZoneBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Zones$PbRecordedZones$Builder setSpeedZone(int var1, Zones$PbRecordedSpeedZone var2) {
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

   public final Zones$PbRecordedZones$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Zones$PbRecordedZones$Builder)super.setUnknownFields(var1);
   }
}
