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

public final class SportprofileAceSettings$PbAceSportProfileSettings extends GeneratedMessageV3 implements SportprofileAceSettings$PbAceSportProfileSettingsOrBuilder {
   public static final int AUTOLAP_SETTINGS_FIELD_NUMBER = 9;
   public static final int AUTO_PAUSE_FIELD_NUMBER = 11;
   public static final int AUTO_START_FIELD_NUMBER = 4;
   private static final SportprofileAceSettings$PbAceSportProfileSettings DEFAULT_INSTANCE = new SportprofileAceSettings$PbAceSportProfileSettings();
   public static final int GPS_SETTING_FIELD_NUMBER = 8;
   public static final int HEART_RATE_VIEW_FIELD_NUMBER = 10;
   public static final int HEART_TOUCH_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new SportprofileAceSettings$PbAceSportProfileSettings$1();
   public static final int SIRIUS2_DISPLAY_SETTINGS_FIELD_NUMBER = 7;
   public static final int STRIDE_SENSOR_CALIB_SETTINGS_FIELD_NUMBER = 6;
   private static final long serialVersionUID = 0L;
   private Types$PbAutoPause autoPause_;
   private boolean autoStart_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private int heartTouch_;
   private byte memoizedIsInitialized;
   private SportprofileDisplays$PbSirius2DisplaySettings sirius2DisplaySettings_;
   private Types$PbStrideSensorCalibSettings strideSensorCalibSettings_;

   private SportprofileAceSettings$PbAceSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.heartTouch_ = 1;
      this.autoStart_ = false;
      this.gpsSetting_ = 0;
      this.heartRateView_ = 1;
   }

   private SportprofileAceSettings$PbAceSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileAceSettings$PbAceSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileAceSettings$1 var3) {
      this(var1, var2);
   }

   private SportprofileAceSettings$PbAceSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileAceSettings$PbAceSportProfileSettings(Builder var1, SportprofileAceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileAceSettings$PbAceSportProfileSettings var0, int var1) {
      var0.heartTouch_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportprofileAceSettings$PbAceSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static SportprofileDisplays$PbSirius2DisplaySettings a(SportprofileAceSettings$PbAceSportProfileSettings var0, SportprofileDisplays$PbSirius2DisplaySettings var1) {
      var0.sirius2DisplaySettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoLapSettings a(SportprofileAceSettings$PbAceSportProfileSettings var0, Types$PbAutoLapSettings var1) {
      var0.autolapSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoPause a(SportprofileAceSettings$PbAceSportProfileSettings var0, Types$PbAutoPause var1) {
      var0.autoPause_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbStrideSensorCalibSettings a(SportprofileAceSettings$PbAceSportProfileSettings var0, Types$PbStrideSensorCalibSettings var1) {
      var0.strideSensorCalibSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(SportprofileAceSettings$PbAceSportProfileSettings var0, boolean var1) {
      var0.autoStart_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportprofileAceSettings$PbAceSportProfileSettings var0, int var1) {
      var0.gpsSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(SportprofileAceSettings$PbAceSportProfileSettings var0, int var1) {
      var0.heartRateView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(SportprofileAceSettings$PbAceSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileAceSettings.a();
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings$Builder newBuilder(SportprofileAceSettings$PbAceSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileAceSettings$PbAceSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAceSettings$PbAceSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings parseFrom(ByteString var0) {
      return (SportprofileAceSettings$PbAceSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileAceSettings$PbAceSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportprofileAceSettings$PbAceSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAceSettings$PbAceSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings parseFrom(InputStream var0) {
      return (SportprofileAceSettings$PbAceSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAceSettings$PbAceSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings parseFrom(byte[] var0) {
      return (SportprofileAceSettings$PbAceSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileAceSettings$PbAceSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileAceSettings$PbAceSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileAceSettings$PbAceSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileAceSettings$PbAceSportProfileSettings var5 = (SportprofileAceSettings$PbAceSportProfileSettings)var1;
            boolean var3;
            if (this.hasHeartTouch() == var5.hasHeartTouch()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasHeartTouch()) {
               if (var3 && this.heartTouch_ == var5.heartTouch_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAutoStart() == var5.hasAutoStart()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAutoStart()) {
               if (var3 && this.getAutoStart() == var5.getAutoStart()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStrideSensorCalibSettings() == var5.hasStrideSensorCalibSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasStrideSensorCalibSettings()) {
               if (var4 && this.getStrideSensorCalibSettings().equals(var5.getStrideSensorCalibSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSirius2DisplaySettings() == var5.hasSirius2DisplaySettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSirius2DisplaySettings()) {
               if (var3 && this.getSirius2DisplaySettings().equals(var5.getSirius2DisplaySettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasGpsSetting() == var5.hasGpsSetting()) {
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
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAutoPause()) {
               if (var3 && this.getAutoPause().equals(var5.getAutoPause())) {
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

   public boolean getAutoStart() {
      return this.autoStart_;
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

   public SportprofileAceSettings$PbAceSportProfileSettings getDefaultInstanceForType() {
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

   public Types$PbHeartTouch getHeartTouch() {
      Types$PbHeartTouch var1 = Types$PbHeartTouch.valueOf(this.heartTouch_);
      Types$PbHeartTouch var2 = var1;
      if (var1 == null) {
         var2 = Types$PbHeartTouch.HEART_TOUCH_OFF;
      }

      return var2;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.heartTouch_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeBoolSize(4, this.autoStart_);
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeMessageSize(6, this.getStrideSensorCalibSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeMessageSize(7, this.getSirius2DisplaySettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeEnumSize(8, this.gpsSetting_);
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + CodedOutputStream.computeMessageSize(9, this.getAutolapSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var2 + CodedOutputStream.computeEnumSize(10, this.heartRateView_);
         }

         var2 = var1;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var1 + CodedOutputStream.computeMessageSize(11, this.getAutoPause());
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

   public boolean hasAutoPause() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutoStart() {
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

   public boolean hasHeartTouch() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasHeartTouch()) {
            var1 = (var2 * 37 + 1) * 53 + this.heartTouch_;
         }

         var2 = var1;
         if (this.hasAutoStart()) {
            var2 = (var1 * 37 + 4) * 53 + Internal.hashBoolean(this.getAutoStart());
         }

         var1 = var2;
         if (this.hasStrideSensorCalibSettings()) {
            var1 = (var2 * 37 + 6) * 53 + this.getStrideSensorCalibSettings().hashCode();
         }

         int var3 = var1;
         if (this.hasSirius2DisplaySettings()) {
            var3 = (var1 * 37 + 7) * 53 + this.getSirius2DisplaySettings().hashCode();
         }

         var2 = var3;
         if (this.hasGpsSetting()) {
            var2 = (var3 * 37 + 8) * 53 + this.gpsSetting_;
         }

         var1 = var2;
         if (this.hasAutolapSettings()) {
            var1 = (var2 * 37 + 9) * 53 + this.getAutolapSettings().hashCode();
         }

         var2 = var1;
         if (this.hasHeartRateView()) {
            var2 = (var1 * 37 + 10) * 53 + this.heartRateView_;
         }

         var1 = var2;
         if (this.hasAutoPause()) {
            var1 = (var2 * 37 + 11) * 53 + this.getAutoPause().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileAceSettings.b().ensureFieldAccessorsInitialized(SportprofileAceSettings$PbAceSportProfileSettings.class, SportprofileAceSettings$PbAceSportProfileSettings$Builder.class);
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

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileAceSettings$PbAceSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileAceSettings$PbAceSportProfileSettings$Builder(var1, (SportprofileAceSettings$1)null);
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder toBuilder() {
      SportprofileAceSettings$PbAceSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileAceSettings$PbAceSportProfileSettings$Builder((SportprofileAceSettings$1)null);
      } else {
         var1 = (new SportprofileAceSettings$PbAceSportProfileSettings$Builder((SportprofileAceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.heartTouch_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(4, this.autoStart_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(6, this.getStrideSensorCalibSettings());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(7, this.getSirius2DisplaySettings());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeEnum(8, this.gpsSetting_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(9, this.getAutolapSettings());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeEnum(10, this.heartRateView_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(11, this.getAutoPause());
      }

      this.unknownFields.writeTo(var1);
   }
}
