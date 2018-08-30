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
import java.io.InputStream;

public final class PftpNotification$PbPFtpSimulateTouchScreenParams extends GeneratedMessageV3 implements PftpNotification$PbPFtpSimulateTouchScreenParamsOrBuilder {
   private static final PftpNotification$PbPFtpSimulateTouchScreenParams DEFAULT_INSTANCE = new PftpNotification$PbPFtpSimulateTouchScreenParams();
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPFtpSimulateTouchScreenParams$1();
   public static final int STATE_FIELD_NUMBER = 1;
   public static final int X_POS_FIELD_NUMBER = 2;
   public static final int Y_POS_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int state_;
   private PftpNotification$PbPFtpTouchPosition xPos_;
   private PftpNotification$PbPFtpTouchPosition yPos_;

   private PftpNotification$PbPFtpSimulateTouchScreenParams() {
      this.memoizedIsInitialized = (byte)-1;
      this.state_ = 0;
   }

   private PftpNotification$PbPFtpSimulateTouchScreenParams(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpSimulateTouchScreenParams(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPFtpSimulateTouchScreenParams(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpSimulateTouchScreenParams(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPFtpSimulateTouchScreenParams var0, int var1) {
      var0.state_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpNotification$PbPFtpSimulateTouchScreenParams var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static PftpNotification$PbPFtpTouchPosition a(PftpNotification$PbPFtpSimulateTouchScreenParams var0, PftpNotification$PbPFtpTouchPosition var1) {
      var0.xPos_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PftpNotification$PbPFtpSimulateTouchScreenParams var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PftpNotification$PbPFtpTouchPosition b(PftpNotification$PbPFtpSimulateTouchScreenParams var0, PftpNotification$PbPFtpTouchPosition var1) {
      var0.yPos_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.u();
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams$Builder newBuilder(PftpNotification$PbPFtpSimulateTouchScreenParams var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams parseFrom(ByteString var0) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams parseFrom(InputStream var0) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams parseFrom(byte[] var0) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPFtpSimulateTouchScreenParams)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPFtpSimulateTouchScreenParams var5 = (PftpNotification$PbPFtpSimulateTouchScreenParams)var1;
            boolean var3;
            if (this.hasState() == var5.hasState()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasState()) {
               if (var3 && this.state_ == var5.state_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasXPos() == var5.hasXPos()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasXPos()) {
               if (var3 && this.getXPos().equals(var5.getXPos())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasYPos() == var5.hasYPos()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasYPos()) {
               if (var3 && this.getYPos().equals(var5.getYPos())) {
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

   public PftpNotification$PbPFtpSimulateTouchScreenParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.state_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getXPos());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getYPos());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState getState() {
      PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState var1 = PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState.valueOf(this.state_);
      PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState var2 = var1;
      if (var1 == null) {
         var2 = PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState.TOUCH_STATE_START;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public PftpNotification$PbPFtpTouchPosition getXPos() {
      PftpNotification$PbPFtpTouchPosition var1;
      if (this.xPos_ == null) {
         var1 = PftpNotification$PbPFtpTouchPosition.getDefaultInstance();
      } else {
         var1 = this.xPos_;
      }

      return var1;
   }

   public PftpNotification$PbPFtpTouchPositionOrBuilder getXPosOrBuilder() {
      PftpNotification$PbPFtpTouchPosition var1;
      if (this.xPos_ == null) {
         var1 = PftpNotification$PbPFtpTouchPosition.getDefaultInstance();
      } else {
         var1 = this.xPos_;
      }

      return var1;
   }

   public PftpNotification$PbPFtpTouchPosition getYPos() {
      PftpNotification$PbPFtpTouchPosition var1;
      if (this.yPos_ == null) {
         var1 = PftpNotification$PbPFtpTouchPosition.getDefaultInstance();
      } else {
         var1 = this.yPos_;
      }

      return var1;
   }

   public PftpNotification$PbPFtpTouchPositionOrBuilder getYPosOrBuilder() {
      PftpNotification$PbPFtpTouchPosition var1;
      if (this.yPos_ == null) {
         var1 = PftpNotification$PbPFtpTouchPosition.getDefaultInstance();
      } else {
         var1 = this.yPos_;
      }

      return var1;
   }

   public boolean hasState() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasXPos() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasYPos() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasState()) {
            var2 = (var1 * 37 + 1) * 53 + this.state_;
         }

         var1 = var2;
         if (this.hasXPos()) {
            var1 = (var2 * 37 + 2) * 53 + this.getXPos().hashCode();
         }

         var2 = var1;
         if (this.hasYPos()) {
            var2 = (var1 * 37 + 3) * 53 + this.getYPos().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.v().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpSimulateTouchScreenParams.class, PftpNotification$PbPFtpSimulateTouchScreenParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasXPos() && !this.getXPos().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasYPos() && !this.getYPos().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPFtpSimulateTouchScreenParams$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPFtpSimulateTouchScreenParams$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder toBuilder() {
      PftpNotification$PbPFtpSimulateTouchScreenParams$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPFtpSimulateTouchScreenParams$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPFtpSimulateTouchScreenParams$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.state_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getXPos());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getYPos());
      }

      this.unknownFields.writeTo(var1);
   }
}
