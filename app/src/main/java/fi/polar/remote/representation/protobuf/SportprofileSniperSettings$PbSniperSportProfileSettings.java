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

public final class SportprofileSniperSettings$PbSniperSportProfileSettings extends GeneratedMessageV3 implements SportprofileSniperSettings$PbSniperSportProfileSettingsOrBuilder {
   public static final int ALTITUDE_SETTING_FIELD_NUMBER = 4;
   public static final int AUTOLAP_SETTINGS_FIELD_NUMBER = 7;
   public static final int AUTO_PAUSE_FIELD_NUMBER = 6;
   public static final int AUTO_START_FIELD_NUMBER = 2;
   private static final SportprofileSniperSettings$PbSniperSportProfileSettings DEFAULT_INSTANCE = new SportprofileSniperSettings$PbSniperSportProfileSettings();
   public static final int GPS_SETTING_FIELD_NUMBER = 5;
   public static final int HEART_RATE_VIEW_FIELD_NUMBER = 8;
   public static final int HEART_TOUCH_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new SportprofileSniperSettings$PbSniperSportProfileSettings$1();
   public static final int SIRIUS2_DISPLAY_SETTINGS_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int altitudeSetting_;
   private Types$PbAutoPause autoPause_;
   private boolean autoStart_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private int heartTouch_;
   private byte memoizedIsInitialized;
   private SportprofileDisplays$PbSirius2DisplaySettings sirius2DisplaySettings_;

   private SportprofileSniperSettings$PbSniperSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.heartTouch_ = 1;
      this.autoStart_ = false;
      this.altitudeSetting_ = 0;
      this.gpsSetting_ = 0;
      this.heartRateView_ = 1;
   }

   private SportprofileSniperSettings$PbSniperSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileSniperSettings$PbSniperSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileSniperSettings$1 var3) {
      this(var1, var2);
   }

   private SportprofileSniperSettings$PbSniperSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileSniperSettings$PbSniperSportProfileSettings(Builder var1, SportprofileSniperSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileSniperSettings$PbSniperSportProfileSettings var0, int var1) {
      var0.heartTouch_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportprofileSniperSettings$PbSniperSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static SportprofileDisplays$PbSirius2DisplaySettings a(SportprofileSniperSettings$PbSniperSportProfileSettings var0, SportprofileDisplays$PbSirius2DisplaySettings var1) {
      var0.sirius2DisplaySettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoLapSettings a(SportprofileSniperSettings$PbSniperSportProfileSettings var0, Types$PbAutoLapSettings var1) {
      var0.autolapSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoPause a(SportprofileSniperSettings$PbSniperSportProfileSettings var0, Types$PbAutoPause var1) {
      var0.autoPause_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(SportprofileSniperSettings$PbSniperSportProfileSettings var0, boolean var1) {
      var0.autoStart_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportprofileSniperSettings$PbSniperSportProfileSettings var0, int var1) {
      var0.altitudeSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(SportprofileSniperSettings$PbSniperSportProfileSettings var0, int var1) {
      var0.gpsSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(SportprofileSniperSettings$PbSniperSportProfileSettings var0, int var1) {
      var0.heartRateView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(SportprofileSniperSettings$PbSniperSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileSniperSettings.a();
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings$Builder newBuilder(SportprofileSniperSettings$PbSniperSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings parseFrom(ByteString var0) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings parseFrom(InputStream var0) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings parseFrom(byte[] var0) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileSniperSettings$PbSniperSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileSniperSettings$PbSniperSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileSniperSettings$PbSniperSportProfileSettings var5 = (SportprofileSniperSettings$PbSniperSportProfileSettings)var1;
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

            if (var3 && this.hasAutoPause() == var5.hasAutoPause()) {
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

            if (var3 && this.hasAutolapSettings() == var5.hasAutolapSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAutolapSettings()) {
               if (var4 && this.getAutolapSettings().equals(var5.getAutolapSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasHeartRateView() == var5.hasHeartRateView()) {
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

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
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

   public SportprofileSniperSettings$PbSniperSportProfileSettings getDefaultInstanceForType() {
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
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.heartTouch_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeBoolSize(2, this.autoStart_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getSirius2DisplaySettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeEnumSize(4, this.altitudeSetting_);
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeEnumSize(5, this.gpsSetting_);
         }

         var1 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var1 = var2 + CodedOutputStream.computeMessageSize(6, this.getAutoPause());
         }

         var2 = var1;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var1 + CodedOutputStream.computeMessageSize(7, this.getAutolapSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 128) == 128) {
            var1 = var2 + CodedOutputStream.computeEnumSize(8, this.heartRateView_);
         }

         var1 += this.unknownFields.getSerializedSize();
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

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAltitudeSetting() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutoPause() {
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
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutolapSettings() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
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
      if ((this.bitField0_ & 128) == 128) {
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
            var2 = (var1 * 37 + 2) * 53 + Internal.hashBoolean(this.getAutoStart());
         }

         var1 = var2;
         if (this.hasSirius2DisplaySettings()) {
            var1 = (var2 * 37 + 3) * 53 + this.getSirius2DisplaySettings().hashCode();
         }

         int var3 = var1;
         if (this.hasAltitudeSetting()) {
            var3 = (var1 * 37 + 4) * 53 + this.altitudeSetting_;
         }

         var2 = var3;
         if (this.hasGpsSetting()) {
            var2 = (var3 * 37 + 5) * 53 + this.gpsSetting_;
         }

         var1 = var2;
         if (this.hasAutoPause()) {
            var1 = (var2 * 37 + 6) * 53 + this.getAutoPause().hashCode();
         }

         var2 = var1;
         if (this.hasAutolapSettings()) {
            var2 = (var1 * 37 + 7) * 53 + this.getAutolapSettings().hashCode();
         }

         var1 = var2;
         if (this.hasHeartRateView()) {
            var1 = (var2 * 37 + 8) * 53 + this.heartRateView_;
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileSniperSettings.b().ensureFieldAccessorsInitialized(SportprofileSniperSettings$PbSniperSportProfileSettings.class, SportprofileSniperSettings$PbSniperSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (this.hasAutoPause() && !this.getAutoPause().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
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

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileSniperSettings$PbSniperSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileSniperSettings$PbSniperSportProfileSettings$Builder(var1, (SportprofileSniperSettings$1)null);
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder toBuilder() {
      SportprofileSniperSettings$PbSniperSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileSniperSettings$PbSniperSportProfileSettings$Builder((SportprofileSniperSettings$1)null);
      } else {
         var1 = (new SportprofileSniperSettings$PbSniperSportProfileSettings$Builder((SportprofileSniperSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.heartTouch_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(2, this.autoStart_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getSirius2DisplaySettings());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeEnum(4, this.altitudeSetting_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeEnum(5, this.gpsSetting_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getAutoPause());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getAutolapSettings());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeEnum(8, this.heartRateView_);
      }

      this.unknownFields.writeTo(var1);
   }
}
