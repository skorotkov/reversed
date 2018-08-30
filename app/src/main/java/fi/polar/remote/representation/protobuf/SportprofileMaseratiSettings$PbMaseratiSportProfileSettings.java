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

public final class SportprofileMaseratiSettings$PbMaseratiSportProfileSettings extends GeneratedMessageV3 implements SportprofileMaseratiSettings$PbMaseratiSportProfileSettingsOrBuilder {
   public static final int ALTITUDE_SETTING_FIELD_NUMBER = 6;
   public static final int AUTOLAP_SETTINGS_FIELD_NUMBER = 8;
   public static final int AUTO_START_FIELD_NUMBER = 4;
   private static final SportprofileMaseratiSettings$PbMaseratiSportProfileSettings DEFAULT_INSTANCE = new SportprofileMaseratiSettings$PbMaseratiSportProfileSettings();
   public static final int GPS_SETTING_FIELD_NUMBER = 7;
   public static final int HEART_RATE_VIEW_FIELD_NUMBER = 9;
   public static final int HEART_TOUCH_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$1();
   public static final int SIRIUS2_DISPLAY_SETTINGS_FIELD_NUMBER = 5;
   public static final int TAP_BUTTON_ACTION_FIELD_NUMBER = 2;
   public static final int VIBRATION_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int altitudeSetting_;
   private boolean autoStart_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private int heartTouch_;
   private byte memoizedIsInitialized;
   private SportprofileDisplays$PbSirius2DisplaySettings sirius2DisplaySettings_;
   private int tapButtonAction_;
   private boolean vibration_;

   private SportprofileMaseratiSettings$PbMaseratiSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.heartTouch_ = 1;
      this.tapButtonAction_ = 1;
      this.vibration_ = false;
      this.autoStart_ = false;
      this.altitudeSetting_ = 0;
      this.gpsSetting_ = 0;
      this.heartRateView_ = 1;
   }

   private SportprofileMaseratiSettings$PbMaseratiSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileMaseratiSettings$PbMaseratiSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileMaseratiSettings$1 var3) {
      this(var1, var2);
   }

   private SportprofileMaseratiSettings$PbMaseratiSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileMaseratiSettings$PbMaseratiSportProfileSettings(Builder var1, SportprofileMaseratiSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0, int var1) {
      var0.heartTouch_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static SportprofileDisplays$PbSirius2DisplaySettings a(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0, SportprofileDisplays$PbSirius2DisplaySettings var1) {
      var0.sirius2DisplaySettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoLapSettings a(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0, Types$PbAutoLapSettings var1) {
      var0.autolapSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0, boolean var1) {
      var0.vibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0, int var1) {
      var0.tapButtonAction_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0, boolean var1) {
      var0.autoStart_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0, int var1) {
      var0.altitudeSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0, int var1) {
      var0.gpsSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0, int var1) {
      var0.heartRateView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int f(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileMaseratiSettings.a();
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder newBuilder(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings parseFrom(ByteString var0) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings parseFrom(InputStream var0) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings parseFrom(byte[] var0) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var5 = (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)var1;
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

            if (var4 && this.hasTapButtonAction() == var5.hasTapButtonAction()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTapButtonAction()) {
               if (var3 && this.tapButtonAction_ == var5.tapButtonAction_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasVibration() == var5.hasVibration()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasVibration()) {
               if (var4 && this.getVibration() == var5.getVibration()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAutoStart() == var5.hasAutoStart()) {
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

            if (var4 && this.hasSirius2DisplaySettings() == var5.hasSirius2DisplaySettings()) {
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

            if (var4 && this.hasAltitudeSetting() == var5.hasAltitudeSetting()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAltitudeSetting()) {
               if (var3 && this.altitudeSetting_ == var5.altitudeSetting_) {
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
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasHeartRateView()) {
               if (var4 && this.heartRateView_ == var5.heartRateView_) {
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

   public Types$PbAltitudeSetting getAltitudeSetting() {
      Types$PbAltitudeSetting var1 = Types$PbAltitudeSetting.valueOf(this.altitudeSetting_);
      Types$PbAltitudeSetting var2 = var1;
      if (var1 == null) {
         var2 = Types$PbAltitudeSetting.ALTITUDE_OFF;
      }

      return var2;
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

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings getDefaultInstanceForType() {
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
            var2 = var1 + CodedOutputStream.computeEnumSize(2, this.tapButtonAction_);
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeBoolSize(3, this.vibration_);
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeBoolSize(4, this.autoStart_);
         }

         int var3 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var3 = var2 + CodedOutputStream.computeMessageSize(5, this.getSirius2DisplaySettings());
         }

         var1 = var3;
         if ((this.bitField0_ & 32) == 32) {
            var1 = var3 + CodedOutputStream.computeEnumSize(6, this.altitudeSetting_);
         }

         var2 = var1;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var1 + CodedOutputStream.computeEnumSize(7, this.gpsSetting_);
         }

         var1 = var2;
         if ((this.bitField0_ & 128) == 128) {
            var1 = var2 + CodedOutputStream.computeMessageSize(8, this.getAutolapSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 256) == 256) {
            var2 = var1 + CodedOutputStream.computeEnumSize(9, this.heartRateView_);
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

   public Types$PbTapButtonAction getTapButtonAction() {
      Types$PbTapButtonAction var1 = Types$PbTapButtonAction.valueOf(this.tapButtonAction_);
      Types$PbTapButtonAction var2 = var1;
      if (var1 == null) {
         var2 = Types$PbTapButtonAction.TAP_BUTTON_OFF;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean getVibration() {
      return this.vibration_;
   }

   public boolean hasAltitudeSetting() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutoStart() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutolapSettings() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGpsSetting() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
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
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTapButtonAction() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVibration() {
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
         if (this.hasTapButtonAction()) {
            var2 = (var1 * 37 + 2) * 53 + this.tapButtonAction_;
         }

         var1 = var2;
         if (this.hasVibration()) {
            var1 = (var2 * 37 + 3) * 53 + Internal.hashBoolean(this.getVibration());
         }

         var2 = var1;
         if (this.hasAutoStart()) {
            var2 = (var1 * 37 + 4) * 53 + Internal.hashBoolean(this.getAutoStart());
         }

         var1 = var2;
         if (this.hasSirius2DisplaySettings()) {
            var1 = (var2 * 37 + 5) * 53 + this.getSirius2DisplaySettings().hashCode();
         }

         var2 = var1;
         if (this.hasAltitudeSetting()) {
            var2 = (var1 * 37 + 6) * 53 + this.altitudeSetting_;
         }

         var1 = var2;
         if (this.hasGpsSetting()) {
            var1 = (var2 * 37 + 7) * 53 + this.gpsSetting_;
         }

         var2 = var1;
         if (this.hasAutolapSettings()) {
            var2 = (var1 * 37 + 8) * 53 + this.getAutolapSettings().hashCode();
         }

         var1 = var2;
         if (this.hasHeartRateView()) {
            var1 = (var2 * 37 + 9) * 53 + this.heartRateView_;
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileMaseratiSettings.b().ensureFieldAccessorsInitialized(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.class, SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (this.hasAutolapSettings() && !this.getAutolapSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder(var1, (SportprofileMaseratiSettings$1)null);
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder toBuilder() {
      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder((SportprofileMaseratiSettings$1)null);
      } else {
         var1 = (new SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder((SportprofileMaseratiSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.heartTouch_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.tapButtonAction_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeBool(3, this.vibration_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeBool(4, this.autoStart_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getSirius2DisplaySettings());
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeEnum(6, this.altitudeSetting_);
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeEnum(7, this.gpsSetting_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getAutolapSettings());
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeEnum(9, this.heartRateView_);
      }

      this.unknownFields.writeTo(var1);
   }
}
