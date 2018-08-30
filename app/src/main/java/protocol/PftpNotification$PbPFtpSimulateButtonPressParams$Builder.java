package protocol;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import fi.polar.remote.representation.protobuf.Types$ButtonState;
import fi.polar.remote.representation.protobuf.Types$Buttons;

public final class PftpNotification$PbPFtpSimulateButtonPressParams$Builder extends Builder implements PftpNotification$PbPFtpSimulateButtonPressParamsOrBuilder {
   private int bitField0_;
   private int button_;
   private int state_;

   private PftpNotification$PbPFtpSimulateButtonPressParams$Builder() {
      this.button_ = 0;
      this.state_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPFtpSimulateButtonPressParams$Builder(BuilderParent var1) {
      super(var1);
      this.button_ = 0;
      this.state_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpSimulateButtonPressParams$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpSimulateButtonPressParams$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.q();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPFtpSimulateButtonPressParams.b()) {
      }

   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams build() {
      PftpNotification$PbPFtpSimulateButtonPressParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPFtpSimulateButtonPressParams var2 = new PftpNotification$PbPFtpSimulateButtonPressParams(this, (PftpNotification$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPFtpSimulateButtonPressParams.a(var2, this.button_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpNotification$PbPFtpSimulateButtonPressParams.b(var2, this.state_);
      PftpNotification$PbPFtpSimulateButtonPressParams.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder clear() {
      super.clear();
      this.button_ = 0;
      this.bitField0_ &= -2;
      this.state_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder clearButton() {
      this.bitField0_ &= -2;
      this.button_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder clearState() {
      this.bitField0_ &= -3;
      this.state_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder clone() {
      return (PftpNotification$PbPFtpSimulateButtonPressParams$Builder)super.clone();
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
      return PftpNotification$PbPFtpSimulateButtonPressParams.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.q();
   }

   public Types$ButtonState getState() {
      Types$ButtonState var1 = Types$ButtonState.valueOf(this.state_);
      Types$ButtonState var2 = var1;
      if (var1 == null) {
         var2 = Types$ButtonState.BUTTON_PRESSED;
      }

      return var2;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.r().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpSimulateButtonPressParams.class, PftpNotification$PbPFtpSimulateButtonPressParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasButton() && this.hasState()) {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPFtpSimulateButtonPressParams var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpNotification$PbPFtpSimulateButtonPressParams var14;
         try {
            var13 = (PftpNotification$PbPFtpSimulateButtonPressParams)PftpNotification$PbPFtpSimulateButtonPressParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpNotification$PbPFtpSimulateButtonPressParams)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder mergeFrom(Message var1) {
      PftpNotification$PbPFtpSimulateButtonPressParams$Builder var2;
      if (var1 instanceof PftpNotification$PbPFtpSimulateButtonPressParams) {
         var2 = this.mergeFrom((PftpNotification$PbPFtpSimulateButtonPressParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder mergeFrom(PftpNotification$PbPFtpSimulateButtonPressParams var1) {
      if (var1 != PftpNotification$PbPFtpSimulateButtonPressParams.getDefaultInstance()) {
         if (var1.hasButton()) {
            this.setButton(var1.getButton());
         }

         if (var1.hasState()) {
            this.setState(var1.getState());
         }

         this.mergeUnknownFields(PftpNotification$PbPFtpSimulateButtonPressParams.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPFtpSimulateButtonPressParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder setButton(Types$Buttons var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.button_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpNotification$PbPFtpSimulateButtonPressParams$Builder setState(Types$ButtonState var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.state_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final PftpNotification$PbPFtpSimulateButtonPressParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpSimulateButtonPressParams$Builder)super.setUnknownFields(var1);
   }
}
