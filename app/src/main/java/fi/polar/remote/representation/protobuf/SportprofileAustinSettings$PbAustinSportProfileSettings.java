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

public final class SportprofileAustinSettings$PbAustinSportProfileSettings extends GeneratedMessageV3 implements SportprofileAustinSettings$PbAustinSportProfileSettingsOrBuilder {
   public static final int ALCOR_DISPLAY_SETTINGS_FIELD_NUMBER = 4;
   public static final int AUTOLAP_SETTINGS_FIELD_NUMBER = 6;
   private static final SportprofileAustinSettings$PbAustinSportProfileSettings DEFAULT_INSTANCE = new SportprofileAustinSettings$PbAustinSportProfileSettings();
   public static final int GPS_SETTING_FIELD_NUMBER = 5;
   public static final int HEART_RATE_VIEW_FIELD_NUMBER = 7;
   @Deprecated
   public static final Parser PARSER = new SportprofileAustinSettings$PbAustinSportProfileSettings$1();
   public static final int VIBRATION_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private SportprofileDisplays$PbAlcorDisplaySettings alcorDisplaySettings_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private byte memoizedIsInitialized;
   private boolean vibration_;

   private SportprofileAustinSettings$PbAustinSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.vibration_ = false;
      this.gpsSetting_ = 0;
      this.heartRateView_ = 1;
   }

   private SportprofileAustinSettings$PbAustinSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileAustinSettings$PbAustinSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileAustinSettings$1 var3) {
      this(var1, var2);
   }

   private SportprofileAustinSettings$PbAustinSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileAustinSettings$PbAustinSportProfileSettings(Builder var1, SportprofileAustinSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileAustinSettings$PbAustinSportProfileSettings var0, int var1) {
      var0.gpsSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportprofileAustinSettings$PbAustinSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static SportprofileDisplays$PbAlcorDisplaySettings a(SportprofileAustinSettings$PbAustinSportProfileSettings var0, SportprofileDisplays$PbAlcorDisplaySettings var1) {
      var0.alcorDisplaySettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoLapSettings a(SportprofileAustinSettings$PbAustinSportProfileSettings var0, Types$PbAutoLapSettings var1) {
      var0.autolapSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(SportprofileAustinSettings$PbAustinSportProfileSettings var0, boolean var1) {
      var0.vibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportprofileAustinSettings$PbAustinSportProfileSettings var0, int var1) {
      var0.heartRateView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(SportprofileAustinSettings$PbAustinSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileAustinSettings.a();
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings$Builder newBuilder(SportprofileAustinSettings$PbAustinSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings parseFrom(ByteString var0) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings parseFrom(InputStream var0) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings parseFrom(byte[] var0) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileAustinSettings$PbAustinSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileAustinSettings$PbAustinSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileAustinSettings$PbAustinSportProfileSettings var5 = (SportprofileAustinSettings$PbAustinSportProfileSettings)var1;
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

            if (var4 && this.hasAlcorDisplaySettings() == var5.hasAlcorDisplaySettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAlcorDisplaySettings()) {
               if (var4 && this.getAlcorDisplaySettings().equals(var5.getAlcorDisplaySettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasGpsSetting() == var5.hasGpsSetting()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasGpsSetting()) {
               if (var3 && this.gpsSetting_ == var5.gpsSetting_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAutolapSettings() == var5.hasAutolapSettings()) {
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

   public SportprofileDisplays$PbAlcorDisplaySettings getAlcorDisplaySettings() {
      SportprofileDisplays$PbAlcorDisplaySettings var1;
      if (this.alcorDisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance();
      } else {
         var1 = this.alcorDisplaySettings_;
      }

      return var1;
   }

   public SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder getAlcorDisplaySettingsOrBuilder() {
      SportprofileDisplays$PbAlcorDisplaySettings var1;
      if (this.alcorDisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance();
      } else {
         var1 = this.alcorDisplaySettings_;
      }

      return var1;
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

   public SportprofileAustinSettings$PbAustinSportProfileSettings getDefaultInstanceForType() {
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
            var2 = 0 + CodedOutputStream.computeBoolSize(3, this.vibration_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(4, this.getAlcorDisplaySettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeEnumSize(5, this.gpsSetting_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeMessageSize(6, this.getAutolapSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeEnumSize(7, this.heartRateView_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean getVibration() {
      return this.vibration_;
   }

   public boolean hasAlcorDisplaySettings() {
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
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGpsSetting() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
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
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasVibration()) {
            var1 = (var2 * 37 + 3) * 53 + Internal.hashBoolean(this.getVibration());
         }

         int var3 = var1;
         if (this.hasAlcorDisplaySettings()) {
            var3 = (var1 * 37 + 4) * 53 + this.getAlcorDisplaySettings().hashCode();
         }

         var2 = var3;
         if (this.hasGpsSetting()) {
            var2 = (var3 * 37 + 5) * 53 + this.gpsSetting_;
         }

         var1 = var2;
         if (this.hasAutolapSettings()) {
            var1 = (var2 * 37 + 6) * 53 + this.getAutolapSettings().hashCode();
         }

         var2 = var1;
         if (this.hasHeartRateView()) {
            var2 = (var1 * 37 + 7) * 53 + this.heartRateView_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileAustinSettings.b().ensureFieldAccessorsInitialized(SportprofileAustinSettings$PbAustinSportProfileSettings.class, SportprofileAustinSettings$PbAustinSportProfileSettings$Builder.class);
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

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileAustinSettings$PbAustinSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileAustinSettings$PbAustinSportProfileSettings$Builder(var1, (SportprofileAustinSettings$1)null);
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder toBuilder() {
      SportprofileAustinSettings$PbAustinSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileAustinSettings$PbAustinSportProfileSettings$Builder((SportprofileAustinSettings$1)null);
      } else {
         var1 = (new SportprofileAustinSettings$PbAustinSportProfileSettings$Builder((SportprofileAustinSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(3, this.vibration_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(4, this.getAlcorDisplaySettings());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(5, this.gpsSetting_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(6, this.getAutolapSettings());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeEnum(7, this.heartRateView_);
      }

      this.unknownFields.writeTo(var1);
   }
}
