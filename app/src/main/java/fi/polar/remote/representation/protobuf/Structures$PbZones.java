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

public final class Structures$PbZones extends GeneratedMessageV3 implements Structures$PbZonesOrBuilder {
   private static final Structures$PbZones DEFAULT_INSTANCE = new Structures$PbZones();
   public static final int HEART_RATE_SETTING_SOURCE_FIELD_NUMBER = 10;
   public static final int HEART_RATE_ZONE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Structures$PbZones$1();
   public static final int POWER_SETTING_SOURCE_FIELD_NUMBER = 11;
   public static final int POWER_ZONE_FIELD_NUMBER = 3;
   public static final int SPEED_SETTING_SOURCE_FIELD_NUMBER = 12;
   public static final int SPEED_ZONE_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int heartRateSettingSource_;
   private List heartRateZone_;
   private byte memoizedIsInitialized;
   private int powerSettingSource_;
   private List powerZone_;
   private int speedSettingSource_;
   private List speedZone_;

   private Structures$PbZones() {
      this.memoizedIsInitialized = (byte)-1;
      this.heartRateZone_ = Collections.emptyList();
      this.speedZone_ = Collections.emptyList();
      this.powerZone_ = Collections.emptyList();
      this.heartRateSettingSource_ = 0;
      this.powerSettingSource_ = 0;
      this.speedSettingSource_ = 0;
   }

   private Structures$PbZones(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbZones(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbZones(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbZones(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbZones var0, int var1) {
      var0.heartRateSettingSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(Structures$PbZones var0) {
      return var0.heartRateZone_;
   }

   // $FF: synthetic method
   static List a(Structures$PbZones var0, List var1) {
      var0.heartRateZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Structures$PbZones var0, int var1) {
      var0.powerSettingSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List b(Structures$PbZones var0) {
      return var0.speedZone_;
   }

   // $FF: synthetic method
   static List b(Structures$PbZones var0, List var1) {
      var0.speedZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Structures$PbZones var0, int var1) {
      var0.speedSettingSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List c(Structures$PbZones var0) {
      return var0.powerZone_;
   }

   // $FF: synthetic method
   static List c(Structures$PbZones var0, List var1) {
      var0.powerZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int d(Structures$PbZones var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet d(Structures$PbZones var0) {
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

   public static Structures$PbZones getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.o();
   }

   public static Structures$PbZones$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbZones$Builder newBuilder(Structures$PbZones var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbZones parseDelimitedFrom(InputStream var0) {
      return (Structures$PbZones)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbZones parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbZones)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbZones parseFrom(ByteString var0) {
      return (Structures$PbZones)PARSER.parseFrom(var0);
   }

   public static Structures$PbZones parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbZones)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbZones parseFrom(CodedInputStream var0) {
      return (Structures$PbZones)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbZones parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbZones)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbZones parseFrom(InputStream var0) {
      return (Structures$PbZones)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbZones parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbZones)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbZones parseFrom(byte[] var0) {
      return (Structures$PbZones)PARSER.parseFrom(var0);
   }

   public static Structures$PbZones parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbZones)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbZones)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbZones var5 = (Structures$PbZones)var1;
            boolean var3;
            if (this.getHeartRateZoneList().equals(var5.getHeartRateZoneList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getSpeedZoneList().equals(var5.getSpeedZoneList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getPowerZoneList().equals(var5.getPowerZoneList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasHeartRateSettingSource() == var5.hasHeartRateSettingSource()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
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
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSpeedSettingSource()) {
               if (var4 && this.speedSettingSource_ == var5.speedSettingSource_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public Structures$PbZones getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
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
      return (Structures$PbHeartRateZone)this.heartRateZone_.get(var1);
   }

   public int getHeartRateZoneCount() {
      return this.heartRateZone_.size();
   }

   public List getHeartRateZoneList() {
      return this.heartRateZone_;
   }

   public Structures$PbHeartRateZoneOrBuilder getHeartRateZoneOrBuilder(int var1) {
      return (Structures$PbHeartRateZoneOrBuilder)this.heartRateZone_.get(var1);
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

   public Structures$PbPowerZone getPowerZone(int var1) {
      return (Structures$PbPowerZone)this.powerZone_.get(var1);
   }

   public int getPowerZoneCount() {
      return this.powerZone_.size();
   }

   public List getPowerZoneList() {
      return this.powerZone_;
   }

   public Structures$PbPowerZoneOrBuilder getPowerZoneOrBuilder(int var1) {
      return (Structures$PbPowerZoneOrBuilder)this.powerZone_.get(var1);
   }

   public List getPowerZoneOrBuilderList() {
      return this.powerZone_;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         int var3 = 0;

         for(var2 = 0; var3 < this.heartRateZone_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(1, (MessageLite)this.heartRateZone_.get(var3));
         }

         int var4 = 0;

         while(true) {
            int var5 = var1;
            var3 = var2;
            if (var4 >= this.speedZone_.size()) {
               while(var5 < this.powerZone_.size()) {
                  var3 += CodedOutputStream.computeMessageSize(3, (MessageLite)this.powerZone_.get(var5));
                  ++var5;
               }

               var2 = var3;
               if ((this.bitField0_ & 1) == 1) {
                  var2 = var3 + CodedOutputStream.computeEnumSize(10, this.heartRateSettingSource_);
               }

               var3 = var2;
               if ((this.bitField0_ & 2) == 2) {
                  var3 = var2 + CodedOutputStream.computeEnumSize(11, this.powerSettingSource_);
               }

               var2 = var3;
               if ((this.bitField0_ & 4) == 4) {
                  var2 = var3 + CodedOutputStream.computeEnumSize(12, this.speedSettingSource_);
               }

               var2 += this.unknownFields.getSerializedSize();
               this.memoizedSize = var2;
               break;
            }

            var2 += CodedOutputStream.computeMessageSize(2, (MessageLite)this.speedZone_.get(var4));
            ++var4;
         }
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

   public Structures$PbSpeedZone getSpeedZone(int var1) {
      return (Structures$PbSpeedZone)this.speedZone_.get(var1);
   }

   public int getSpeedZoneCount() {
      return this.speedZone_.size();
   }

   public List getSpeedZoneList() {
      return this.speedZone_;
   }

   public Structures$PbSpeedZoneOrBuilder getSpeedZoneOrBuilder(int var1) {
      return (Structures$PbSpeedZoneOrBuilder)this.speedZone_.get(var1);
   }

   public List getSpeedZoneOrBuilderList() {
      return this.speedZone_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasHeartRateSettingSource() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPowerSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
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
         if (this.getSpeedZoneCount() > 0) {
            var1 = (var2 * 37 + 2) * 53 + this.getSpeedZoneList().hashCode();
         }

         int var3 = var1;
         if (this.getPowerZoneCount() > 0) {
            var3 = (var1 * 37 + 3) * 53 + this.getPowerZoneList().hashCode();
         }

         var2 = var3;
         if (this.hasHeartRateSettingSource()) {
            var2 = (var3 * 37 + 10) * 53 + this.heartRateSettingSource_;
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
      return Structures.p().ensureFieldAccessorsInitialized(Structures$PbZones.class, Structures$PbZones$Builder.class);
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
                  for(var4 = 0; var4 < this.getSpeedZoneCount(); ++var4) {
                     if (!this.getSpeedZone(var4).isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                        return var3;
                     }
                  }

                  for(var4 = 0; var4 < this.getPowerZoneCount(); ++var4) {
                     if (!this.getPowerZone(var4).isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                        return var3;
                     }
                  }

                  this.memoizedIsInitialized = (byte)1;
                  var3 = true;
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

   public Structures$PbZones$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbZones$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbZones$Builder(var1, (Structures$1)null);
   }

   public Structures$PbZones$Builder toBuilder() {
      Structures$PbZones$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbZones$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbZones$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.heartRateZone_.size(); ++var3) {
         var1.writeMessage(1, (MessageLite)this.heartRateZone_.get(var3));
      }

      var3 = 0;

      while(true) {
         int var4 = var2;
         if (var3 >= this.speedZone_.size()) {
            while(var4 < this.powerZone_.size()) {
               var1.writeMessage(3, (MessageLite)this.powerZone_.get(var4));
               ++var4;
            }

            if ((this.bitField0_ & 1) == 1) {
               var1.writeEnum(10, this.heartRateSettingSource_);
            }

            if ((this.bitField0_ & 2) == 2) {
               var1.writeEnum(11, this.powerSettingSource_);
            }

            if ((this.bitField0_ & 4) == 4) {
               var1.writeEnum(12, this.speedSettingSource_);
            }

            this.unknownFields.writeTo(var1);
            return;
         }

         var1.writeMessage(2, (MessageLite)this.speedZone_.get(var3));
         ++var3;
      }
   }
}
