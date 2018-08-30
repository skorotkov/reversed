package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class SportprofileMetroSettings$PbMetroSportProfileSettings extends GeneratedMessageV3 implements SportprofileMetroSettings$PbMetroSportProfileSettingsOrBuilder {
   public static final int AUTOLAP_SETTINGS_FIELD_NUMBER = 6;
   public static final int AUTO_PAUSE_FIELD_NUMBER = 8;
   public static final int AUTO_SCROLLING_FIELD_NUMBER = 2;
   private static final SportprofileMetroSettings$PbMetroSportProfileSettings DEFAULT_INSTANCE = new SportprofileMetroSettings$PbMetroSportProfileSettings();
   public static final int GPS_SETTING_FIELD_NUMBER = 5;
   public static final int HEART_RATE_VIEW_FIELD_NUMBER = 7;
   @Deprecated
   public static final Parser PARSER = new SportprofileMetroSettings$PbMetroSportProfileSettings$1();
   public static final int SIRIUS2_DISPLAY_SETTINGS_FIELD_NUMBER = 4;
   public static final int STRIDE_SENSOR_CALIB_SETTINGS_FIELD_NUMBER = 3;
   public static final int VIBRATION_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private Types$PbAutoPause autoPause_;
   private boolean autoScrolling_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private byte memoizedIsInitialized;
   private SportprofileDisplays$PbSirius2DisplaySettings sirius2DisplaySettings_;
   private Types$PbStrideSensorCalibSettings strideSensorCalibSettings_;
   private boolean vibration_;

   private SportprofileMetroSettings$PbMetroSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.vibration_ = false;
      this.autoScrolling_ = false;
      this.gpsSetting_ = 0;
      this.heartRateView_ = 1;
   }

   private SportprofileMetroSettings$PbMetroSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileMetroSettings$PbMetroSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileMetroSettings$1 var3) {
      this(var1, var2);
   }

   private SportprofileMetroSettings$PbMetroSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileMetroSettings$PbMetroSportProfileSettings(Builder var1, SportprofileMetroSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileMetroSettings$PbMetroSportProfileSettings var0, int var1) {
      var0.gpsSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportprofileMetroSettings$PbMetroSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static SportprofileDisplays$PbSirius2DisplaySettings a(SportprofileMetroSettings$PbMetroSportProfileSettings var0, SportprofileDisplays$PbSirius2DisplaySettings var1) {
      var0.sirius2DisplaySettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoLapSettings a(SportprofileMetroSettings$PbMetroSportProfileSettings var0, Types$PbAutoLapSettings var1) {
      var0.autolapSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoPause a(SportprofileMetroSettings$PbMetroSportProfileSettings var0, Types$PbAutoPause var1) {
      var0.autoPause_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbStrideSensorCalibSettings a(SportprofileMetroSettings$PbMetroSportProfileSettings var0, Types$PbStrideSensorCalibSettings var1) {
      var0.strideSensorCalibSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(SportprofileMetroSettings$PbMetroSportProfileSettings var0, boolean var1) {
      var0.vibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportprofileMetroSettings$PbMetroSportProfileSettings var0, int var1) {
      var0.heartRateView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(SportprofileMetroSettings$PbMetroSportProfileSettings var0, boolean var1) {
      var0.autoScrolling_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(SportprofileMetroSettings$PbMetroSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileMetroSettings.a();
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings$Builder newBuilder(SportprofileMetroSettings$PbMetroSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileMetroSettings$PbMetroSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileMetroSettings$PbMetroSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings parseFrom(ByteString var0) {
      return (SportprofileMetroSettings$PbMetroSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileMetroSettings$PbMetroSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportprofileMetroSettings$PbMetroSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileMetroSettings$PbMetroSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings parseFrom(InputStream var0) {
      return (SportprofileMetroSettings$PbMetroSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileMetroSettings$PbMetroSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings parseFrom(byte[] var0) {
      return (SportprofileMetroSettings$PbMetroSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileMetroSettings$PbMetroSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileMetroSettings$PbMetroSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileMetroSettings$PbMetroSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileMetroSettings$PbMetroSportProfileSettings var5 = (SportprofileMetroSettings$PbMetroSportProfileSettings)var1;
            boolean var3;
            if (this.hasVibration() == var5.hasVibration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasVibration()) {
               if (var3 && this.getVibration() == var5.getVibration()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAutoScrolling() == var5.hasAutoScrolling()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAutoScrolling()) {
               if (var3 && this.getAutoScrolling() == var5.getAutoScrolling()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStrideSensorCalibSettings() == var5.hasStrideSensorCalibSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStrideSensorCalibSettings()) {
               if (var3 && this.getStrideSensorCalibSettings().equals(var5.getStrideSensorCalibSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSirius2DisplaySettings() == var5.hasSirius2DisplaySettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSirius2DisplaySettings()) {
               if (var4 && this.getSirius2DisplaySettings().equals(var5.getSirius2DisplaySettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasGpsSetting() == var5.hasGpsSetting()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasGpsSetting()) {
               if (var4 && this.gpsSetting_ == var5.gpsSetting_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAutolapSettings() == var5.hasAutolapSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAutolapSettings()) {
               if (var3 && this.getAutolapSettings().equals(var5.getAutolapSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasHeartRateView() == var5.hasHeartRateView()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasHeartRateView()) {
               if (var3 && this.heartRateView_ == var5.heartRateView_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAutoPause() == var5.hasAutoPause()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAutoPause()) {
               if (var4 && this.getAutoPause().equals(var5.getAutoPause())) {
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

   public Types$PbAutoPause getAutoPause() {
      Types$PbAutoPause var1;
      if (this.autoPause_ == null) {
         var1 = Types$PbAutoPause.getDefaultInstance();
      } else {
         var1 = this.autoPause_;
      }

      return var1;
   }

   public Types$PbAutoPauseOrBuilder getAutoPauseOrBuilder() {
      Types$PbAutoPause var1;
      if (this.autoPause_ == null) {
         var1 = Types$PbAutoPause.getDefaultInstance();
      } else {
         var1 = this.autoPause_;
      }

      return var1;
   }

   public boolean getAutoScrolling() {
      return this.autoScrolling_;
   }

   public Types$PbAutoLapSettings getAutolapSettings() {
      Types$PbAutoLapSettings var1;
      if (this.autolapSettings_ == null) {
         var1 = Types$PbAutoLapSettings.getDefaultInstance();
      } else {
         var1 = this.autolapSettings_;
      }

      return var1;
   }

   public Types$PbAutoLapSettingsOrBuilder getAutolapSettingsOrBuilder() {
      Types$PbAutoLapSettings var1;
      if (this.autolapSettings_ == null) {
         var1 = Types$PbAutoLapSettings.getDefaultInstance();
      } else {
         var1 = this.autolapSettings_;
      }

      return var1;
   }

   public SportprofileMetroSettings$PbMetroSportProfileSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbGPSSetting getGpsSetting() {
      Types$PbGPSSetting var1 = Types$PbGPSSetting.valueOf(this.gpsSetting_);
      Types$PbGPSSetting var2 = var1;
      if (var1 == null) {
         var2 = Types$PbGPSSetting.GPS_OFF;
      }

      return var2;
   }

   public Types$PbHeartRateView getHeartRateView() {
      Types$PbHeartRateView var1 = Types$PbHeartRateView.valueOf(this.heartRateView_);
      Types$PbHeartRateView var2 = var1;
      if (var1 == null) {
         var2 = Types$PbHeartRateView.HEART_RATE_VIEW_BPM;
      }

      return var2;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeBoolSize(1, this.vibration_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeBoolSize(2, this.autoScrolling_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getStrideSensorCalibSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeMessageSize(4, this.getSirius2DisplaySettings());
         }

         int var3 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var3 = var1 + CodedOutputStream.computeEnumSize(5, this.gpsSetting_);
         }

         var2 = var3;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var3 + CodedOutputStream.computeMessageSize(6, this.getAutolapSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var2 + CodedOutputStream.computeEnumSize(7, this.heartRateView_);
         }

         var2 = var1;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var1 + CodedOutputStream.computeMessageSize(8, this.getAutoPause());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings getSirius2DisplaySettings() {
      SportprofileDisplays$PbSirius2DisplaySettings var1;
      if (this.sirius2DisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
      } else {
         var1 = this.sirius2DisplaySettings_;
      }

      return var1;
   }

   public SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder getSirius2DisplaySettingsOrBuilder() {
      SportprofileDisplays$PbSirius2DisplaySettings var1;
      if (this.sirius2DisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
      } else {
         var1 = this.sirius2DisplaySettings_;
      }

      return var1;
   }

   public Types$PbStrideSensorCalibSettings getStrideSensorCalibSettings() {
      Types$PbStrideSensorCalibSettings var1;
      if (this.strideSensorCalibSettings_ == null) {
         var1 = Types$PbStrideSensorCalibSettings.getDefaultInstance();
      } else {
         var1 = this.strideSensorCalibSettings_;
      }

      return var1;
   }

   public Types$PbStrideSensorCalibSettingsOrBuilder getStrideSensorCalibSettingsOrBuilder() {
      Types$PbStrideSensorCalibSettings var1;
      if (this.strideSensorCalibSettings_ == null) {
         var1 = Types$PbStrideSensorCalibSettings.getDefaultInstance();
      } else {
         var1 = this.strideSensorCalibSettings_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean getVibration() {
      return this.vibration_;
   }

   public boolean hasAutoPause() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutoScrolling() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutolapSettings() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGpsSetting() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSirius2DisplaySettings() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrideSensorCalibSettings() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVibration() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
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
         if (this.hasVibration()) {
            var2 = (var1 * 37 + 1) * 53 + Internal.hashBoolean(this.getVibration());
         }

         var1 = var2;
         if (this.hasAutoScrolling()) {
            var1 = (var2 * 37 + 2) * 53 + Internal.hashBoolean(this.getAutoScrolling());
         }

         int var3 = var1;
         if (this.hasStrideSensorCalibSettings()) {
            var3 = (var1 * 37 + 3) * 53 + this.getStrideSensorCalibSettings().hashCode();
         }

         var2 = var3;
         if (this.hasSirius2DisplaySettings()) {
            var2 = (var3 * 37 + 4) * 53 + this.getSirius2DisplaySettings().hashCode();
         }

         var1 = var2;
         if (this.hasGpsSetting()) {
            var1 = (var2 * 37 + 5) * 53 + this.gpsSetting_;
         }

         var2 = var1;
         if (this.hasAutolapSettings()) {
            var2 = (var1 * 37 + 6) * 53 + this.getAutolapSettings().hashCode();
         }

         var1 = var2;
         if (this.hasHeartRateView()) {
            var1 = (var2 * 37 + 7) * 53 + this.heartRateView_;
         }

         var2 = var1;
         if (this.hasAutoPause()) {
            var2 = (var1 * 37 + 8) * 53 + this.getAutoPause().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileMetroSettings.b().ensureFieldAccessorsInitialized(SportprofileMetroSettings$PbMetroSportProfileSettings.class, SportprofileMetroSettings$PbMetroSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (this.hasStrideSensorCalibSettings() && !this.getStrideSensorCalibSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasAutolapSettings() && !this.getAutolapSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasAutoPause() && !this.getAutoPause().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SportprofileMetroSettings$PbMetroSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileMetroSettings$PbMetroSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileMetroSettings$PbMetroSportProfileSettings$Builder(var1, (SportprofileMetroSettings$1)null);
   }

   public SportprofileMetroSettings$PbMetroSportProfileSettings$Builder toBuilder() {
      SportprofileMetroSettings$PbMetroSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileMetroSettings$PbMetroSportProfileSettings$Builder((SportprofileMetroSettings$1)null);
      } else {
         var1 = (new SportprofileMetroSettings$PbMetroSportProfileSettings$Builder((SportprofileMetroSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.vibration_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(2, this.autoScrolling_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getStrideSensorCalibSettings());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getSirius2DisplaySettings());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeEnum(5, this.gpsSetting_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getAutolapSettings());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeEnum(7, this.heartRateView_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getAutoPause());
      }

      this.unknownFields.writeTo(var1);
   }
}
