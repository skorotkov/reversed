package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class SportprofileRangerSettings$PbRangerSportProfileSettings extends GeneratedMessageV3 implements SportprofileRangerSettings$PbRangerSportProfileSettingsOrBuilder {
   private static final SportprofileRangerSettings$PbRangerSportProfileSettings DEFAULT_INSTANCE = new SportprofileRangerSettings$PbRangerSportProfileSettings();
   public static final int GPS_SETTING_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new SportprofileRangerSettings$PbRangerSportProfileSettings$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int gpsSetting_;
   private byte memoizedIsInitialized;

   private SportprofileRangerSettings$PbRangerSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.gpsSetting_ = 0;
   }

   private SportprofileRangerSettings$PbRangerSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileRangerSettings$PbRangerSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileRangerSettings$1 var3) {
      this(var1, var2);
   }

   private SportprofileRangerSettings$PbRangerSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileRangerSettings$PbRangerSportProfileSettings(Builder var1, SportprofileRangerSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileRangerSettings$PbRangerSportProfileSettings var0, int var1) {
      var0.gpsSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportprofileRangerSettings$PbRangerSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(SportprofileRangerSettings$PbRangerSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileRangerSettings.a();
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings$Builder newBuilder(SportprofileRangerSettings$PbRangerSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings parseFrom(ByteString var0) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings parseFrom(InputStream var0) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings parseFrom(byte[] var0) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileRangerSettings$PbRangerSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileRangerSettings$PbRangerSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileRangerSettings$PbRangerSportProfileSettings var5 = (SportprofileRangerSettings$PbRangerSportProfileSettings)var1;
            boolean var3;
            if (this.hasGpsSetting() == var5.hasGpsSetting()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasGpsSetting()) {
               if (var3 && this.gpsSetting_ == var5.gpsSetting_) {
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

   public SportprofileRangerSettings$PbRangerSportProfileSettings getDefaultInstanceForType() {
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

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.gpsSetting_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasGpsSetting() {
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
         if (this.hasGpsSetting()) {
            var1 = (var2 * 37 + 1) * 53 + this.gpsSetting_;
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileRangerSettings.b().ensureFieldAccessorsInitialized(SportprofileRangerSettings$PbRangerSportProfileSettings.class, SportprofileRangerSettings$PbRangerSportProfileSettings$Builder.class);
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

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileRangerSettings$PbRangerSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileRangerSettings$PbRangerSportProfileSettings$Builder(var1, (SportprofileRangerSettings$1)null);
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder toBuilder() {
      SportprofileRangerSettings$PbRangerSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileRangerSettings$PbRangerSportProfileSettings$Builder((SportprofileRangerSettings$1)null);
      } else {
         var1 = (new SportprofileRangerSettings$PbRangerSportProfileSettings$Builder((SportprofileRangerSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.gpsSetting_);
      }

      this.unknownFields.writeTo(var1);
   }
}
