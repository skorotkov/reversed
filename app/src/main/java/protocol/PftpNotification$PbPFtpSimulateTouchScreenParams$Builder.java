package protocol;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class PftpNotification$PbPFtpSimulateTouchScreenParams$Builder extends Builder implements PftpNotification$PbPFtpSimulateTouchScreenParamsOrBuilder {
   private int bitField0_;
   private int state_;
   private SingleFieldBuilderV3 xPosBuilder_;
   private PftpNotification$PbPFtpTouchPosition xPos_;
   private SingleFieldBuilderV3 yPosBuilder_;
   private PftpNotification$PbPFtpTouchPosition yPos_;

   private PftpNotification$PbPFtpSimulateTouchScreenParams$Builder() {
      this.state_ = 0;
      this.xPos_ = null;
      this.yPos_ = null;
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPFtpSimulateTouchScreenParams$Builder(BuilderParent var1) {
      super(var1);
      this.state_ = 0;
      this.xPos_ = null;
      this.yPos_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpSimulateTouchScreenParams$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpSimulateTouchScreenParams$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.u();
   }

   private SingleFieldBuilderV3 getXPosFieldBuilder() {
      if (this.xPosBuilder_ == null) {
         this.xPosBuilder_ = new SingleFieldBuilderV3(this.getXPos(), this.getParentForChildren(), this.isClean());
         this.xPos_ = null;
      }

      return this.xPosBuilder_;
   }

   private SingleFieldBuilderV3 getYPosFieldBuilder() {
      if (this.yPosBuilder_ == null) {
         this.yPosBuilder_ = new SingleFieldBuilderV3(this.getYPos(), this.getParentForChildren(), this.isClean());
         this.yPos_ = null;
      }

      return this.yPosBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPFtpSimulateTouchScreenParams.b()) {
         this.getXPosFieldBuilder();
         this.getYPosFieldBuilder();
      }

   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams build() {
      PftpNotification$PbPFtpSimulateTouchScreenParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams buildPartial() {
      int var1 = 1;
      PftpNotification$PbPFtpSimulateTouchScreenParams var2 = new PftpNotification$PbPFtpSimulateTouchScreenParams(this, (PftpNotification$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPFtpSimulateTouchScreenParams.a(var2, this.state_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.xPosBuilder_ == null) {
         PftpNotification$PbPFtpSimulateTouchScreenParams.a(var2, this.xPos_);
      } else {
         PftpNotification$PbPFtpSimulateTouchScreenParams.a(var2, (PftpNotification$PbPFtpTouchPosition)this.xPosBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      if (this.yPosBuilder_ == null) {
         PftpNotification$PbPFtpSimulateTouchScreenParams.b(var2, this.yPos_);
      } else {
         PftpNotification$PbPFtpSimulateTouchScreenParams.b(var2, (PftpNotification$PbPFtpTouchPosition)this.yPosBuilder_.build());
      }

      PftpNotification$PbPFtpSimulateTouchScreenParams.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder clear() {
      super.clear();
      this.state_ = 0;
      this.bitField0_ &= -2;
      if (this.xPosBuilder_ == null) {
         this.xPos_ = null;
      } else {
         this.xPosBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.yPosBuilder_ == null) {
         this.yPos_ = null;
      } else {
         this.yPosBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder clearState() {
      this.bitField0_ &= -2;
      this.state_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder clearXPos() {
      if (this.xPosBuilder_ == null) {
         this.xPos_ = null;
         this.onChanged();
      } else {
         this.xPosBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder clearYPos() {
      if (this.yPosBuilder_ == null) {
         this.yPos_ = null;
         this.onChanged();
      } else {
         this.yPosBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder clone() {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams$Builder)super.clone();
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams getDefaultInstanceForType() {
      return PftpNotification$PbPFtpSimulateTouchScreenParams.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.u();
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState getState() {
      PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState var1 = PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState.valueOf(this.state_);
      PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState var2 = var1;
      if (var1 == null) {
         var2 = PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState.TOUCH_STATE_START;
      }

      return var2;
   }

   public PftpNotification$PbPFtpTouchPosition getXPos() {
      PftpNotification$PbPFtpTouchPosition var1;
      if (this.xPosBuilder_ == null) {
         if (this.xPos_ == null) {
            var1 = PftpNotification$PbPFtpTouchPosition.getDefaultInstance();
         } else {
            var1 = this.xPos_;
         }
      } else {
         var1 = (PftpNotification$PbPFtpTouchPosition)this.xPosBuilder_.getMessage();
      }

      return var1;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder getXPosBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (PftpNotification$PbPFtpTouchPosition$Builder)this.getXPosFieldBuilder().getBuilder();
   }

   public PftpNotification$PbPFtpTouchPositionOrBuilder getXPosOrBuilder() {
      Object var1;
      if (this.xPosBuilder_ != null) {
         var1 = (PftpNotification$PbPFtpTouchPositionOrBuilder)this.xPosBuilder_.getMessageOrBuilder();
      } else if (this.xPos_ == null) {
         var1 = PftpNotification$PbPFtpTouchPosition.getDefaultInstance();
      } else {
         var1 = this.xPos_;
      }

      return (PftpNotification$PbPFtpTouchPositionOrBuilder)var1;
   }

   public PftpNotification$PbPFtpTouchPosition getYPos() {
      PftpNotification$PbPFtpTouchPosition var1;
      if (this.yPosBuilder_ == null) {
         if (this.yPos_ == null) {
            var1 = PftpNotification$PbPFtpTouchPosition.getDefaultInstance();
         } else {
            var1 = this.yPos_;
         }
      } else {
         var1 = (PftpNotification$PbPFtpTouchPosition)this.yPosBuilder_.getMessage();
      }

      return var1;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder getYPosBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (PftpNotification$PbPFtpTouchPosition$Builder)this.getYPosFieldBuilder().getBuilder();
   }

   public PftpNotification$PbPFtpTouchPositionOrBuilder getYPosOrBuilder() {
      Object var1;
      if (this.yPosBuilder_ != null) {
         var1 = (PftpNotification$PbPFtpTouchPositionOrBuilder)this.yPosBuilder_.getMessageOrBuilder();
      } else if (this.yPos_ == null) {
         var1 = PftpNotification$PbPFtpTouchPosition.getDefaultInstance();
      } else {
         var1 = this.yPos_;
      }

      return (PftpNotification$PbPFtpTouchPositionOrBuilder)var1;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.v().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpSimulateTouchScreenParams.class, PftpNotification$PbPFtpSimulateTouchScreenParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasState()) {
         var2 = var1;
      } else {
         if (this.hasXPos()) {
            var2 = var1;
            if (!this.getXPos().isInitialized()) {
               return var2;
            }
         }

         if (this.hasYPos()) {
            var2 = var1;
            if (!this.getYPos().isInitialized()) {
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPFtpSimulateTouchScreenParams var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (PftpNotification$PbPFtpSimulateTouchScreenParams)PftpNotification$PbPFtpSimulateTouchScreenParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (PftpNotification$PbPFtpSimulateTouchScreenParams)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder mergeFrom(Message var1) {
      PftpNotification$PbPFtpSimulateTouchScreenParams$Builder var2;
      if (var1 instanceof PftpNotification$PbPFtpSimulateTouchScreenParams) {
         var2 = this.mergeFrom((PftpNotification$PbPFtpSimulateTouchScreenParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder mergeFrom(PftpNotification$PbPFtpSimulateTouchScreenParams var1) {
      if (var1 != PftpNotification$PbPFtpSimulateTouchScreenParams.getDefaultInstance()) {
         if (var1.hasState()) {
            this.setState(var1.getState());
         }

         if (var1.hasXPos()) {
            this.mergeXPos(var1.getXPos());
         }

         if (var1.hasYPos()) {
            this.mergeYPos(var1.getYPos());
         }

         this.mergeUnknownFields(PftpNotification$PbPFtpSimulateTouchScreenParams.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPFtpSimulateTouchScreenParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder mergeXPos(PftpNotification$PbPFtpTouchPosition var1) {
      if (this.xPosBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.xPos_ != null && this.xPos_ != PftpNotification$PbPFtpTouchPosition.getDefaultInstance()) {
            this.xPos_ = PftpNotification$PbPFtpTouchPosition.newBuilder(this.xPos_).mergeFrom(var1).buildPartial();
         } else {
            this.xPos_ = var1;
         }

         this.onChanged();
      } else {
         this.xPosBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder mergeYPos(PftpNotification$PbPFtpTouchPosition var1) {
      if (this.yPosBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.yPos_ != null && this.yPos_ != PftpNotification$PbPFtpTouchPosition.getDefaultInstance()) {
            this.yPos_ = PftpNotification$PbPFtpTouchPosition.newBuilder(this.yPos_).mergeFrom(var1).buildPartial();
         } else {
            this.yPos_ = var1;
         }

         this.onChanged();
      } else {
         this.yPosBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder setState(PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.state_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final PftpNotification$PbPFtpSimulateTouchScreenParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpSimulateTouchScreenParams$Builder)super.setUnknownFields(var1);
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder setXPos(PftpNotification$PbPFtpTouchPosition$Builder var1) {
      if (this.xPosBuilder_ == null) {
         this.xPos_ = var1.build();
         this.onChanged();
      } else {
         this.xPosBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder setXPos(PftpNotification$PbPFtpTouchPosition var1) {
      if (this.xPosBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.xPos_ = var1;
         this.onChanged();
      } else {
         this.xPosBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder setYPos(PftpNotification$PbPFtpTouchPosition$Builder var1) {
      if (this.yPosBuilder_ == null) {
         this.yPos_ = var1.build();
         this.onChanged();
      } else {
         this.yPosBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public PftpNotification$PbPFtpSimulateTouchScreenParams$Builder setYPos(PftpNotification$PbPFtpTouchPosition var1) {
      if (this.yPosBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.yPos_ = var1;
         this.onChanged();
      } else {
         this.yPosBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }
}
