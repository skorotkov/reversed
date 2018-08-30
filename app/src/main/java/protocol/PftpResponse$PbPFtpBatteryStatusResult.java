package protocol;

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

public final class PftpResponse$PbPFtpBatteryStatusResult extends GeneratedMessageV3 implements PftpResponse$PbPFtpBatteryStatusResultOrBuilder {
   public static final int BATTERY_STATUS_FIELD_NUMBER = 1;
   public static final int CHARGING_FIELD_NUMBER = 2;
   private static final PftpResponse$PbPFtpBatteryStatusResult DEFAULT_INSTANCE = new PftpResponse$PbPFtpBatteryStatusResult();
   @Deprecated
   public static final Parser PARSER = new PftpResponse$PbPFtpBatteryStatusResult$1();
   private static final long serialVersionUID = 0L;
   private int batteryStatus_;
   private int bitField0_;
   private boolean charging_;
   private byte memoizedIsInitialized;

   private PftpResponse$PbPFtpBatteryStatusResult() {
      this.memoizedIsInitialized = (byte)-1;
      this.batteryStatus_ = 0;
      this.charging_ = false;
   }

   private PftpResponse$PbPFtpBatteryStatusResult(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpBatteryStatusResult(CodedInputStream var1, ExtensionRegistryLite var2, PftpResponse$1 var3) {
      this(var1, var2);
   }

   private PftpResponse$PbPFtpBatteryStatusResult(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpBatteryStatusResult(Builder var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpResponse$PbPFtpBatteryStatusResult var0, int var1) {
      var0.batteryStatus_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpResponse$PbPFtpBatteryStatusResult var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(PftpResponse$PbPFtpBatteryStatusResult var0, boolean var1) {
      var0.charging_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PftpResponse$PbPFtpBatteryStatusResult var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpResponse$PbPFtpBatteryStatusResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.o();
   }

   public static PftpResponse$PbPFtpBatteryStatusResult$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpResponse$PbPFtpBatteryStatusResult$Builder newBuilder(PftpResponse$PbPFtpBatteryStatusResult var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpResponse$PbPFtpBatteryStatusResult parseDelimitedFrom(InputStream var0) {
      return (PftpResponse$PbPFtpBatteryStatusResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpBatteryStatusResult parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpBatteryStatusResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpBatteryStatusResult parseFrom(ByteString var0) {
      return (PftpResponse$PbPFtpBatteryStatusResult)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpBatteryStatusResult parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpBatteryStatusResult)PARSER.parseFrom(var0, var1);
   }

   public static PftpResponse$PbPFtpBatteryStatusResult parseFrom(CodedInputStream var0) {
      return (PftpResponse$PbPFtpBatteryStatusResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpBatteryStatusResult parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpBatteryStatusResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpBatteryStatusResult parseFrom(InputStream var0) {
      return (PftpResponse$PbPFtpBatteryStatusResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpBatteryStatusResult parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpBatteryStatusResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpBatteryStatusResult parseFrom(byte[] var0) {
      return (PftpResponse$PbPFtpBatteryStatusResult)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpBatteryStatusResult parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpBatteryStatusResult)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpResponse$PbPFtpBatteryStatusResult)) {
            var2 = super.equals(var1);
         } else {
            PftpResponse$PbPFtpBatteryStatusResult var5 = (PftpResponse$PbPFtpBatteryStatusResult)var1;
            boolean var3;
            if (this.hasBatteryStatus() == var5.hasBatteryStatus()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasBatteryStatus()) {
               if (var3 && this.getBatteryStatus() == var5.getBatteryStatus()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCharging() == var5.hasCharging()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasCharging()) {
               if (var3 && this.getCharging() == var5.getCharging()) {
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

   public int getBatteryStatus() {
      return this.batteryStatus_;
   }

   public boolean getCharging() {
      return this.charging_;
   }

   public PftpResponse$PbPFtpBatteryStatusResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.batteryStatus_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeBoolSize(2, this.charging_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasBatteryStatus() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCharging() {
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
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasBatteryStatus()) {
            var1 = (var2 * 37 + 1) * 53 + this.getBatteryStatus();
         }

         var2 = var1;
         if (this.hasCharging()) {
            var2 = (var1 * 37 + 2) * 53 + Internal.hashBoolean(this.getCharging());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.p().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpBatteryStatusResult.class, PftpResponse$PbPFtpBatteryStatusResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasBatteryStatus()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpResponse$PbPFtpBatteryStatusResult$Builder newBuilderForType(BuilderParent var1) {
      return new PftpResponse$PbPFtpBatteryStatusResult$Builder(var1, (PftpResponse$1)null);
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder toBuilder() {
      PftpResponse$PbPFtpBatteryStatusResult$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpResponse$PbPFtpBatteryStatusResult$Builder((PftpResponse$1)null);
      } else {
         var1 = (new PftpResponse$PbPFtpBatteryStatusResult$Builder((PftpResponse$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.batteryStatus_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(2, this.charging_);
      }

      this.unknownFields.writeTo(var1);
   }
}
