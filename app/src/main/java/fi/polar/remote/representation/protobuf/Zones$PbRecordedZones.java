package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class Zones$PbRecordedZones extends GeneratedMessageV3 implements Zones$PbRecordedZonesOrBuilder {
   private static final Zones$PbRecordedZones DEFAULT_INSTANCE = new Zones$PbRecordedZones();
   public static final int FATFIT_ZONES_FIELD_NUMBER = 3;
   public static final int HEART_RATE_SETTING_SOURCE_FIELD_NUMBER = 10;
   public static final int HEART_RATE_ZONE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Zones$PbRecordedZones$1();
   public static final int POWER_SETTING_SOURCE_FIELD_NUMBER = 11;
   public static final int POWER_ZONE_FIELD_NUMBER = 2;
   public static final int SPEED_SETTING_SOURCE_FIELD_NUMBER = 12;
   public static final int SPEED_ZONE_FIELD_NUMBER = 4;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Zones$PbRecordedFatFitZones fatfitZones_;
   private int heartRateSettingSource_;
   private List heartRateZone_;
   private byte memoizedIsInitialized;
   private int powerSettingSource_;
   private List powerZone_;
   private int speedSettingSource_;
   private List speedZone_;

   private Zones$PbRecordedZones() {
      this.memoizedIsInitialized = (byte)-1;
      this.heartRateZone_ = Collections.emptyList();
      this.powerZone_ = Collections.emptyList();
      this.speedZone_ = Collections.emptyList();
      this.heartRateSettingSource_ = 0;
      this.powerSettingSource_ = 0;
      this.speedSettingSource_ = 0;
   }

   private Zones$PbRecordedZones(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Zones$PbRecordedZones(CodedInputStream var1, ExtensionRegistryLite var2, Zones$1 var3) {
      this(var1, var2);
   }

   private Zones$PbRecordedZones(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Zones$PbRecordedZones(Builder var1, Zones$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Zones$PbRecordedZones var0, int var1) {
      var0.heartRateSettingSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Zones$PbRecordedFatFitZones a(Zones$PbRecordedZones var0, Zones$PbRecordedFatFitZones var1) {
      var0.fatfitZones_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(Zones$PbRecordedZones var0) {
      return var0.heartRateZone_;
   }

   // $FF: synthetic method
   static List a(Zones$PbRecordedZones var0, List var1) {
      var0.heartRateZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Zones$PbRecordedZones var0, int var1) {
      var0.powerSettingSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List b(Zones$PbRecordedZones var0) {
      return var0.powerZone_;
   }

   // $FF: synthetic method
   static List b(Zones$PbRecordedZones var0, List var1) {
      var0.powerZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Zones$PbRecordedZones var0, int var1) {
      var0.speedSettingSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List c(Zones$PbRecordedZones var0) {
      return var0.speedZone_;
   }

   // $FF: synthetic method
   static List c(Zones$PbRecordedZones var0, List var1) {
      var0.speedZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int d(Zones$PbRecordedZones var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet d(Zones$PbRecordedZones var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean d() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean e() {
      return alwaysUseFieldBuilders;
   }

   public static Zones$PbRecordedZones getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Zones.i();
   }

   public static Zones$PbRecordedZones$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Zones$PbRecordedZones$Builder newBuilder(Zones$PbRecordedZones var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Zones$PbRecordedZones parseDelimitedFrom(InputStream var0) {
      return (Zones$PbRecordedZones)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedZones parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedZones)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedZones parseFrom(ByteString var0) {
      return (Zones$PbRecordedZones)PARSER.parseFrom(var0);
   }

   public static Zones$PbRecordedZones parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedZones)PARSER.parseFrom(var0, var1);
   }

   public static Zones$PbRecordedZones parseFrom(CodedInputStream var0) {
      return (Zones$PbRecordedZones)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedZones parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedZones)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedZones parseFrom(InputStream var0) {
      return (Zones$PbRecordedZones)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedZones parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedZones)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedZones parseFrom(byte[] var0) {
      return (Zones$PbRecordedZones)PARSER.parseFrom(var0);
   }

   public static Zones$PbRecordedZones parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedZones)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Zones$PbRecordedZones)) {
            var2 = super.equals(var1);
         } else {
            Zones$PbRecordedZones var5 = (Zones$PbRecordedZones)var1;
            boolean var3;
            if (this.getHeartRateZoneList().equals(var5.getHeartRateZoneList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getPowerZoneList().equals(var5.getPowerZoneList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4;
            if (var3 && this.hasFatfitZones() == var5.hasFatfitZones()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFatfitZones()) {
               if (var4 && this.getFatfitZones().equals(var5.getFatfitZones())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.getSpeedZoneList().equals(var5.getSpeedZoneList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasHeartRateSettingSource() == var5.hasHeartRateSettingSource()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasHeartRateSettingSource()) {
               if (var3 && this.heartRateSettingSource_ == var5.heartRateSettingSource_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPowerSettingSource() == var5.hasPowerSettingSource()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPowerSettingSource()) {
               if (var4 && this.powerSettingSource_ == var5.powerSettingSource_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSpeedSettingSource() == var5.hasSpeedSettingSource()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSpeedSettingSource()) {
               if (var3 && this.speedSettingSource_ == var5.speedSettingSource_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public Zones$PbRecordedZones getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Zones$PbRecordedFatFitZones getFatfitZones() {
      Zones$PbRecordedFatFitZones var1;
      if (this.fatfitZones_ == null) {
         var1 = Zones$PbRecordedFatFitZones.getDefaultInstance();
      } else {
         var1 = this.fatfitZones_;
      }

      return var1;
   }

   public Zones$PbRecordedFatFitZonesOrBuilder getFatfitZonesOrBuilder() {
      Zones$PbRecordedFatFitZones var1;
      if (this.fatfitZones_ == null) {
         var1 = Zones$PbRecordedFatFitZones.getDefaultInstance();
      } else {
         var1 = this.fatfitZones_;
      }

      return var1;
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
      return (Zones$PbRecordedHeartRateZone)this.heartRateZone_.get(var1);
   }

   public int getHeartRateZoneCount() {
      return this.heartRateZone_.size();
   }

   public List getHeartRateZoneList() {
      return this.heartRateZone_;
   }

   public Zones$PbRecordedHeartRateZoneOrBuilder getHeartRateZoneOrBuilder(int var1) {
      return (Zones$PbRecordedHeartRateZoneOrBuilder)this.heartRateZone_.get(var1);
   }

   public List getHeartRateZoneOrBuilderList() {
      return this.heartRateZone_;
   }

   public Parser getParserForType() {
      return PARSER;
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
      return (Zones$PbRecordedPowerZone)this.powerZone_.get(var1);
   }

   public int getPowerZoneCount() {
      return this.powerZone_.size();
   }

   public List getPowerZoneList() {
      return this.powerZone_;
   }

   public Zones$PbRecordedPowerZoneOrBuilder getPowerZoneOrBuilder(int var1) {
      return (Zones$PbRecordedPowerZoneOrBuilder)this.powerZone_.get(var1);
   }

   public List getPowerZoneOrBuilderList() {
      return this.powerZone_;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         var2 = 0;

         int var3;
         for(var3 = 0; var2 < this.heartRateZone_.size(); ++var2) {
            var3 += CodedOutputStream.computeMessageSize(1, (MessageLite)this.heartRateZone_.get(var2));
         }

         for(var2 = 0; var2 < this.powerZone_.size(); ++var2) {
            var3 += CodedOutputStream.computeMessageSize(2, (MessageLite)this.powerZone_.get(var2));
         }

         int var4 = var1;
         var2 = var3;
         if ((this.bitField0_ & 1) == 1) {
            var2 = var3 + CodedOutputStream.computeMessageSize(3, this.getFatfitZones());
            var4 = var1;
         }

         while(var4 < this.speedZone_.size()) {
            var2 += CodedOutputStream.computeMessageSize(4, (MessageLite)this.speedZone_.get(var4));
            ++var4;
         }

         var3 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var3 = var2 + CodedOutputStream.computeEnumSize(10, this.heartRateSettingSource_);
         }

         var2 = var3;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var3 + CodedOutputStream.computeEnumSize(11, this.powerSettingSource_);
         }

         var3 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var3 = var2 + CodedOutputStream.computeEnumSize(12, this.speedSettingSource_);
         }

         var2 = this.unknownFields.getSerializedSize() + var3;
         this.memoizedSize = var2;
      }

      return var2;
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
      return (Zones$PbRecordedSpeedZone)this.speedZone_.get(var1);
   }

   public int getSpeedZoneCount() {
      return this.speedZone_.size();
   }

   public List getSpeedZoneList() {
      return this.speedZone_;
   }

   public Zones$PbRecordedSpeedZoneOrBuilder getSpeedZoneOrBuilder(int var1) {
      return (Zones$PbRecordedSpeedZoneOrBuilder)this.speedZone_.get(var1);
   }

   public List getSpeedZoneOrBuilderList() {
      return this.speedZone_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasFatfitZones() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRateSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPowerSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.getHeartRateZoneCount() > 0) {
            var2 = (var1 * 37 + 1) * 53 + this.getHeartRateZoneList().hashCode();
         }

         var1 = var2;
         if (this.getPowerZoneCount() > 0) {
            var1 = (var2 * 37 + 2) * 53 + this.getPowerZoneList().hashCode();
         }

         var2 = var1;
         if (this.hasFatfitZones()) {
            var2 = (var1 * 37 + 3) * 53 + this.getFatfitZones().hashCode();
         }

         var1 = var2;
         if (this.getSpeedZoneCount() > 0) {
            var1 = (var2 * 37 + 4) * 53 + this.getSpeedZoneList().hashCode();
         }

         var2 = var1;
         if (this.hasHeartRateSettingSource()) {
            var2 = (var1 * 37 + 10) * 53 + this.heartRateSettingSource_;
         }

         var1 = var2;
         if (this.hasPowerSettingSource()) {
            var1 = (var2 * 37 + 11) * 53 + this.powerSettingSource_;
         }

         var2 = var1;
         if (this.hasSpeedSettingSource()) {
            var2 = (var1 * 37 + 12) * 53 + this.speedSettingSource_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Zones.j().ensureFieldAccessorsInitialized(Zones$PbRecordedZones.class, Zones$PbRecordedZones$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      byte var2 = this.memoizedIsInitialized;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = var1;
         if (var2 != 0) {
            int var4 = 0;

            while(true) {
               if (var4 >= this.getHeartRateZoneCount()) {
                  for(var4 = 0; var4 < this.getPowerZoneCount(); ++var4) {
                     if (!this.getPowerZone(var4).isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                        return var3;
                     }
                  }

                  if (!this.hasFatfitZones() || this.getFatfitZones().isInitialized()) {
                     for(var4 = 0; var4 < this.getSpeedZoneCount(); ++var4) {
                        if (!this.getSpeedZone(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     this.memoizedIsInitialized = (byte)1;
                     var3 = true;
                     break;
                  }

                  this.memoizedIsInitialized = (byte)0;
                  var3 = var1;
                  break;
               }

               if (!this.getHeartRateZone(var4).isInitialized()) {
                  this.memoizedIsInitialized = (byte)0;
                  var3 = var1;
                  break;
               }

               ++var4;
            }
         }
      }

      return var3;
   }

   public Zones$PbRecordedZones$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Zones$PbRecordedZones$Builder newBuilderForType(BuilderParent var1) {
      return new Zones$PbRecordedZones$Builder(var1, (Zones$1)null);
   }

   public Zones$PbRecordedZones$Builder toBuilder() {
      Zones$PbRecordedZones$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Zones$PbRecordedZones$Builder((Zones$1)null);
      } else {
         var1 = (new Zones$PbRecordedZones$Builder((Zones$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.heartRateZone_.size(); ++var3) {
         var1.writeMessage(1, (MessageLite)this.heartRateZone_.get(var3));
      }

      for(var3 = 0; var3 < this.powerZone_.size(); ++var3) {
         var1.writeMessage(2, (MessageLite)this.powerZone_.get(var3));
      }

      var3 = var2;
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(3, this.getFatfitZones());
         var3 = var2;
      }

      while(var3 < this.speedZone_.size()) {
         var1.writeMessage(4, (MessageLite)this.speedZone_.get(var3));
         ++var3;
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(10, this.heartRateSettingSource_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(11, this.powerSettingSource_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeEnum(12, this.speedSettingSource_);
      }

      this.unknownFields.writeTo(var1);
   }
}
