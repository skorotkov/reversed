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

public final class Types$PbAccelerationMetrics extends GeneratedMessageV3 implements Types$PbAccelerationMetricsOrBuilder {
   public static final int CALIBRATION_SETTINGS_FIELD_NUMBER = 2;
   private static final Types$PbAccelerationMetrics DEFAULT_INSTANCE = new Types$PbAccelerationMetrics();
   @Deprecated
   public static final Parser PARSER = new Types$PbAccelerationMetrics$1();
   public static final int SAMPLE_SOURCE_TYPE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private List calibrationSettings_;
   private byte memoizedIsInitialized;
   private int sampleSourceType_;

   private Types$PbAccelerationMetrics() {
      this.memoizedIsInitialized = (byte)-1;
      this.sampleSourceType_ = 0;
      this.calibrationSettings_ = Collections.emptyList();
   }

   private Types$PbAccelerationMetrics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbAccelerationMetrics(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbAccelerationMetrics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbAccelerationMetrics(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Types$PbAccelerationMetrics var0, int var1) {
      var0.sampleSourceType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(Types$PbAccelerationMetrics var0) {
      return var0.calibrationSettings_;
   }

   // $FF: synthetic method
   static List a(Types$PbAccelerationMetrics var0, List var1) {
      var0.calibrationSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Types$PbAccelerationMetrics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(Types$PbAccelerationMetrics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   public static Types$PbAccelerationMetrics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.C();
   }

   public static Types$PbAccelerationMetrics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbAccelerationMetrics$Builder newBuilder(Types$PbAccelerationMetrics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbAccelerationMetrics parseDelimitedFrom(InputStream var0) {
      return (Types$PbAccelerationMetrics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbAccelerationMetrics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbAccelerationMetrics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbAccelerationMetrics parseFrom(ByteString var0) {
      return (Types$PbAccelerationMetrics)PARSER.parseFrom(var0);
   }

   public static Types$PbAccelerationMetrics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbAccelerationMetrics)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbAccelerationMetrics parseFrom(CodedInputStream var0) {
      return (Types$PbAccelerationMetrics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbAccelerationMetrics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbAccelerationMetrics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbAccelerationMetrics parseFrom(InputStream var0) {
      return (Types$PbAccelerationMetrics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbAccelerationMetrics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbAccelerationMetrics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbAccelerationMetrics parseFrom(byte[] var0) {
      return (Types$PbAccelerationMetrics)PARSER.parseFrom(var0);
   }

   public static Types$PbAccelerationMetrics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbAccelerationMetrics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbAccelerationMetrics)) {
            var2 = super.equals(var1);
         } else {
            Types$PbAccelerationMetrics var5 = (Types$PbAccelerationMetrics)var1;
            boolean var3;
            if (this.hasSampleSourceType() == var5.hasSampleSourceType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSampleSourceType()) {
               if (var3 && this.sampleSourceType_ == var5.sampleSourceType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getCalibrationSettingsList().equals(var5.getCalibrationSettingsList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public Types$PbCalibrationSettings getCalibrationSettings(int var1) {
      return (Types$PbCalibrationSettings)this.calibrationSettings_.get(var1);
   }

   public int getCalibrationSettingsCount() {
      return this.calibrationSettings_.size();
   }

   public List getCalibrationSettingsList() {
      return this.calibrationSettings_;
   }

   public Types$PbCalibrationSettingsOrBuilder getCalibrationSettingsOrBuilder(int var1) {
      return (Types$PbCalibrationSettingsOrBuilder)this.calibrationSettings_.get(var1);
   }

   public List getCalibrationSettingsOrBuilderList() {
      return this.calibrationSettings_;
   }

   public Types$PbAccelerationMetrics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public Types$PbSampleSourceType getSampleSourceType() {
      Types$PbSampleSourceType var1 = Types$PbSampleSourceType.valueOf(this.sampleSourceType_);
      Types$PbSampleSourceType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSampleSourceType.SAMPLE_SOURCE_TYPE_UNDEFINED;
      }

      return var2;
   }

   public int getSerializedSize() {
      int var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         if ((this.bitField0_ & 1) == 1) {
            var2 = CodedOutputStream.computeEnumSize(1, this.sampleSourceType_) + 0;
         } else {
            var2 = 0;
         }

         while(var1 < this.calibrationSettings_.size()) {
            int var3 = CodedOutputStream.computeMessageSize(2, (MessageLite)this.calibrationSettings_.get(var1));
            ++var1;
            var2 += var3;
         }

         var2 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var2;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasSampleSourceType() {
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
         if (this.hasSampleSourceType()) {
            var1 = (var2 * 37 + 1) * 53 + this.sampleSourceType_;
         }

         var2 = var1;
         if (this.getCalibrationSettingsCount() > 0) {
            var2 = (var1 * 37 + 2) * 53 + this.getCalibrationSettingsList().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.D().ensureFieldAccessorsInitialized(Types$PbAccelerationMetrics.class, Types$PbAccelerationMetrics$Builder.class);
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
            if (!this.hasSampleSourceType()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getCalibrationSettingsCount()) {
                     this.memoizedIsInitialized = (byte)1;
                     var3 = true;
                     break;
                  }

                  if (!this.getCalibrationSettings(var4).isInitialized()) {
                     this.memoizedIsInitialized = (byte)0;
                     var3 = var1;
                     break;
                  }

                  ++var4;
               }
            }
         }
      }

      return var3;
   }

   public Types$PbAccelerationMetrics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbAccelerationMetrics$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbAccelerationMetrics$Builder(var1, (Types$1)null);
   }

   public Types$PbAccelerationMetrics$Builder toBuilder() {
      Types$PbAccelerationMetrics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbAccelerationMetrics$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbAccelerationMetrics$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.sampleSourceType_);
      }

      for(int var2 = 0; var2 < this.calibrationSettings_.size(); ++var2) {
         var1.writeMessage(2, (MessageLite)this.calibrationSettings_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
