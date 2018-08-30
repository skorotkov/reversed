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

public final class SportprofileVectraSettings$PbVectraSportProfileSettings extends GeneratedMessageV3 implements SportprofileVectraSettings$PbVectraSportProfileSettingsOrBuilder {
   private static final SportprofileVectraSettings$PbVectraSportProfileSettings DEFAULT_INSTANCE = new SportprofileVectraSettings$PbVectraSportProfileSettings();
   public static final int GPS_SETTING_FIELD_NUMBER = 5;
   public static final int HEART_RATE_VIEW_FIELD_NUMBER = 4;
   @Deprecated
   public static final Parser PARSER = new SportprofileVectraSettings$PbVectraSportProfileSettings$1();
   public static final int VIBRATION_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private byte memoizedIsInitialized;
   private boolean vibration_;

   private SportprofileVectraSettings$PbVectraSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.vibration_ = false;
      this.heartRateView_ = 1;
      this.gpsSetting_ = 0;
   }

   private SportprofileVectraSettings$PbVectraSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileVectraSettings$PbVectraSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileVectraSettings$1 var3) {
      this(var1, var2);
   }

   private SportprofileVectraSettings$PbVectraSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileVectraSettings$PbVectraSportProfileSettings(Builder var1, SportprofileVectraSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileVectraSettings$PbVectraSportProfileSettings var0, int var1) {
      var0.heartRateView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportprofileVectraSettings$PbVectraSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(SportprofileVectraSettings$PbVectraSportProfileSettings var0, boolean var1) {
      var0.vibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportprofileVectraSettings$PbVectraSportProfileSettings var0, int var1) {
      var0.gpsSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(SportprofileVectraSettings$PbVectraSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileVectraSettings.a();
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings$Builder newBuilder(SportprofileVectraSettings$PbVectraSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings parseFrom(ByteString var0) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings parseFrom(InputStream var0) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings parseFrom(byte[] var0) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileVectraSettings$PbVectraSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileVectraSettings$PbVectraSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileVectraSettings$PbVectraSportProfileSettings var5 = (SportprofileVectraSettings$PbVectraSportProfileSettings)var1;
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

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings getDefaultInstanceForType() {
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
            var1 = var2 + CodedOutputStream.computeEnumSize(4, this.heartRateView_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeEnumSize(5, this.gpsSetting_);
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
      if ((this.bitField0_ & 2) == 2) {
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

         var2 = var1;
         if (this.hasHeartRateView()) {
            var2 = (var1 * 37 + 4) * 53 + this.heartRateView_;
         }

         var1 = var2;
         if (this.hasGpsSetting()) {
            var1 = (var2 * 37 + 5) * 53 + this.gpsSetting_;
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileVectraSettings.b().ensureFieldAccessorsInitialized(SportprofileVectraSettings$PbVectraSportProfileSettings.class, SportprofileVectraSettings$PbVectraSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileVectraSettings$PbVectraSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileVectraSettings$PbVectraSportProfileSettings$Builder(var1, (SportprofileVectraSettings$1)null);
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder toBuilder() {
      SportprofileVectraSettings$PbVectraSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileVectraSettings$PbVectraSportProfileSettings$Builder((SportprofileVectraSettings$1)null);
      } else {
         var1 = (new SportprofileVectraSettings$PbVectraSportProfileSettings$Builder((SportprofileVectraSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(3, this.vibration_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(4, this.heartRateView_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(5, this.gpsSetting_);
      }

      this.unknownFields.writeTo(var1);
   }
}
