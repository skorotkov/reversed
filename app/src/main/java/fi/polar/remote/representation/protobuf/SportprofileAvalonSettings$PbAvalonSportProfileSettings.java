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

public final class SportprofileAvalonSettings$PbAvalonSportProfileSettings extends GeneratedMessageV3 implements SportprofileAvalonSettings$PbAvalonSportProfileSettingsOrBuilder {
   public static final int AUTOLAP_SETTINGS_FIELD_NUMBER = 5;
   public static final int AUTO_START_FIELD_NUMBER = 4;
   private static final SportprofileAvalonSettings$PbAvalonSportProfileSettings DEFAULT_INSTANCE = new SportprofileAvalonSettings$PbAvalonSportProfileSettings();
   public static final int HEART_RATE_VIEW_FIELD_NUMBER = 6;
   public static final int HEART_TOUCH_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new SportprofileAvalonSettings$PbAvalonSportProfileSettings$1();
   public static final int VIBRATION_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private boolean autoStart_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int heartRateView_;
   private int heartTouch_;
   private byte memoizedIsInitialized;
   private boolean vibration_;

   private SportprofileAvalonSettings$PbAvalonSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.heartTouch_ = 1;
      this.vibration_ = false;
      this.autoStart_ = false;
      this.heartRateView_ = 1;
   }

   private SportprofileAvalonSettings$PbAvalonSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileAvalonSettings$PbAvalonSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileAvalonSettings$1 var3) {
      this(var1, var2);
   }

   private SportprofileAvalonSettings$PbAvalonSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileAvalonSettings$PbAvalonSportProfileSettings(Builder var1, SportprofileAvalonSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileAvalonSettings$PbAvalonSportProfileSettings var0, int var1) {
      var0.heartTouch_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportprofileAvalonSettings$PbAvalonSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbAutoLapSettings a(SportprofileAvalonSettings$PbAvalonSportProfileSettings var0, Types$PbAutoLapSettings var1) {
      var0.autolapSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(SportprofileAvalonSettings$PbAvalonSportProfileSettings var0, boolean var1) {
      var0.vibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportprofileAvalonSettings$PbAvalonSportProfileSettings var0, int var1) {
      var0.heartRateView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(SportprofileAvalonSettings$PbAvalonSportProfileSettings var0, boolean var1) {
      var0.autoStart_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(SportprofileAvalonSettings$PbAvalonSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileAvalonSettings.a();
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder newBuilder(SportprofileAvalonSettings$PbAvalonSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings parseFrom(ByteString var0) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings parseFrom(InputStream var0) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings parseFrom(byte[] var0) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileAvalonSettings$PbAvalonSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileAvalonSettings$PbAvalonSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileAvalonSettings$PbAvalonSportProfileSettings var5 = (SportprofileAvalonSettings$PbAvalonSportProfileSettings)var1;
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
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAutoStart()) {
               if (var4 && this.getAutoStart() == var5.getAutoStart()) {
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

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
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
            var1 = var2 + CodedOutputStream.computeBoolSize(3, this.vibration_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeBoolSize(4, this.autoStart_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeMessageSize(5, this.getAutolapSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeEnumSize(6, this.heartRateView_);
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

   public boolean hasAutoStart() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
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

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
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

   public boolean hasVibration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
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
         if (this.hasHeartTouch()) {
            var2 = (var1 * 37 + 1) * 53 + this.heartTouch_;
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
         if (this.hasAutolapSettings()) {
            var1 = (var2 * 37 + 5) * 53 + this.getAutolapSettings().hashCode();
         }

         var2 = var1;
         if (this.hasHeartRateView()) {
            var2 = (var1 * 37 + 6) * 53 + this.heartRateView_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileAvalonSettings.b().ensureFieldAccessorsInitialized(SportprofileAvalonSettings$PbAvalonSportProfileSettings.class, SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder.class);
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

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder(var1, (SportprofileAvalonSettings$1)null);
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder toBuilder() {
      SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder((SportprofileAvalonSettings$1)null);
      } else {
         var1 = (new SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder((SportprofileAvalonSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.heartTouch_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(3, this.vibration_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeBool(4, this.autoStart_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(5, this.getAutolapSettings());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeEnum(6, this.heartRateView_);
      }

      this.unknownFields.writeTo(var1);
   }
}
