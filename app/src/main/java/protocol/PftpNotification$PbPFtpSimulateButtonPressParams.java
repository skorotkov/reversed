package protocol;

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
import fi.polar.remote.representation.protobuf.Types$ButtonState;
import fi.polar.remote.representation.protobuf.Types$Buttons;
import java.io.InputStream;

public final class PftpNotification$PbPFtpSimulateButtonPressParams extends GeneratedMessageV3 implements PftpNotification$PbPFtpSimulateButtonPressParamsOrBuilder {
   public static final int BUTTON_FIELD_NUMBER = 1;
   private static final PftpNotification$PbPFtpSimulateButtonPressParams DEFAULT_INSTANCE = new PftpNotification$PbPFtpSimulateButtonPressParams();
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPFtpSimulateButtonPressParams$1();
   public static final int STATE_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int button_;
   private byte memoizedIsInitialized;
   private int state_;

   private PftpNotification$PbPFtpSimulateButtonPressParams() {
      this.memoizedIsInitialized = (byte)-1;
      this.button_ = 0;
      this.state_ = 0;
   }

   private PftpNotification$PbPFtpSimulateButtonPressParams(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpSimulateButtonPressParams(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPFtpSimulateButtonPressParams(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpSimulateButtonPressParams(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPFtpSimulateButtonPressParams var0, int var1) {
      var0.button_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpNotification$PbPFtpSimulateButtonPressParams var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(PftpNotification$PbPFtpSimulateButtonPressParams var0, int var1) {
      var0.state_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(PftpNotification$PbPFtpSimulateButtonPressParams var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.q();
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams$Builder newBuilder(PftpNotification$PbPFtpSimulateButtonPressParams var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams parseFrom(ByteString var0) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams parseFrom(InputStream var0) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams parseFrom(byte[] var0) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpSimulateButtonPressParams parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPFtpSimulateButtonPressParams)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPFtpSimulateButtonPressParams var5 = (PftpNotification$PbPFtpSimulateButtonPressParams)var1;
            boolean var3;
            if (this.hasButton() == var5.hasButton()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasButton()) {
               if (var3 && this.button_ == var5.button_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasState() == var5.hasState()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasState()) {
               if (var3 && this.state_ == var5.state_) {
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

   public Types$Buttons getButton() {
      Types$Buttons var1 = Types$Buttons.valueOf(this.button_);
      Types$Buttons var2 = var1;
      if (var1 == null) {
         var2 = Types$Buttons.BUTTON_PLUS;
      }

      return var2;
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.button_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeEnumSize(2, this.state_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$ButtonState getState() {
      Types$ButtonState var1 = Types$ButtonState.valueOf(this.state_);
      Types$ButtonState var2 = var1;
      if (var1 == null) {
         var2 = Types$ButtonState.BUTTON_PRESSED;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasButton() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasState() {
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
         if (this.hasButton()) {
            var1 = (var2 * 37 + 1) * 53 + this.button_;
         }

         var2 = var1;
         if (this.hasState()) {
            var2 = (var1 * 37 + 2) * 53 + this.state_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.r().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpSimulateButtonPressParams.class, PftpNotification$PbPFtpSimulateButtonPressParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasButton()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPFtpSimulateButtonPressParams$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPFtpSimulateButtonPressParams$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder toBuilder() {
      PftpNotification$PbPFtpSimulateButtonPressParams$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPFtpSimulateButtonPressParams$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPFtpSimulateButtonPressParams$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.button_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.state_);
      }

      this.unknownFields.writeTo(var1);
   }
}
