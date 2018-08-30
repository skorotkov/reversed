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

public final class SportprofileAstraSettings$PbAstraSportProfileSettings extends GeneratedMessageV3 implements SportprofileAstraSettings$PbAstraSportProfileSettingsOrBuilder {
   private static final SportprofileAstraSettings$PbAstraSportProfileSettings DEFAULT_INSTANCE = new SportprofileAstraSettings$PbAstraSportProfileSettings();
   public static final int HEART_RATE_VIEW_FIELD_NUMBER = 4;
   @Deprecated
   public static final Parser PARSER = new SportprofileAstraSettings$PbAstraSportProfileSettings$1();
   public static final int VIBRATION_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int heartRateView_;
   private byte memoizedIsInitialized;
   private boolean vibration_;

   private SportprofileAstraSettings$PbAstraSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.vibration_ = false;
      this.heartRateView_ = 1;
   }

   private SportprofileAstraSettings$PbAstraSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileAstraSettings$PbAstraSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileAstraSettings$1 var3) {
      this(var1, var2);
   }

   private SportprofileAstraSettings$PbAstraSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileAstraSettings$PbAstraSportProfileSettings(Builder var1, SportprofileAstraSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileAstraSettings$PbAstraSportProfileSettings var0, int var1) {
      var0.heartRateView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportprofileAstraSettings$PbAstraSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(SportprofileAstraSettings$PbAstraSportProfileSettings var0, boolean var1) {
      var0.vibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportprofileAstraSettings$PbAstraSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileAstraSettings.a();
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings$Builder newBuilder(SportprofileAstraSettings$PbAstraSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings parseFrom(ByteString var0) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings parseFrom(InputStream var0) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings parseFrom(byte[] var0) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileAstraSettings$PbAstraSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileAstraSettings$PbAstraSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileAstraSettings$PbAstraSportProfileSettings var5 = (SportprofileAstraSettings$PbAstraSportProfileSettings)var1;
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

   public SportprofileAstraSettings$PbAstraSportProfileSettings getDefaultInstanceForType() {
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

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(3, this.vibration_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeEnumSize(4, this.heartRateView_);
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

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileAstraSettings.b().ensureFieldAccessorsInitialized(SportprofileAstraSettings$PbAstraSportProfileSettings.class, SportprofileAstraSettings$PbAstraSportProfileSettings$Builder.class);
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

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileAstraSettings$PbAstraSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileAstraSettings$PbAstraSportProfileSettings$Builder(var1, (SportprofileAstraSettings$1)null);
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder toBuilder() {
      SportprofileAstraSettings$PbAstraSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileAstraSettings$PbAstraSportProfileSettings$Builder((SportprofileAstraSettings$1)null);
      } else {
         var1 = (new SportprofileAstraSettings$PbAstraSportProfileSettings$Builder((SportprofileAstraSettings$1)null)).mergeFrom(this);
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

      this.unknownFields.writeTo(var1);
   }
}
