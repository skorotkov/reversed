package protocol;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState implements ProtocolMessageEnum {
   TOUCH_STATE_END(2),

   TOUCH_STATE_POSITION(1),

   TOUCH_STATE_START(0);

   public static final int TOUCH_STATE_START_VALUE = 0;
   public static final int TOUCH_STATE_POSITION_VALUE = 1;
   public static final int TOUCH_STATE_END_VALUE = 2;
   private static final PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState$1();
   private final int value;

   private PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState(int var3) {
      this.value = var3;
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState forNumber(int var0) {
      PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState var1;
      switch(var0) {
      case 0:
         var1 = TOUCH_STATE_START;
         break;
      case 1:
         var1 = TOUCH_STATE_POSITION;
         break;
      case 2:
         var1 = TOUCH_STATE_END;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PftpNotification$PbPFtpSimulateTouchScreenParams.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState valueOf(int var0) {
      return forNumber(var0);
   }

   public static PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState valueOf(EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return VALUES[var0.getIndex()];
      }
   }

   public final EnumDescriptor getDescriptorForType() {
      return getDescriptor();
   }

   public final int getNumber() {
      return this.value;
   }

   public final EnumValueDescriptor getValueDescriptor() {
      return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
   }
}
