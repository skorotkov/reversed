package protocol;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PftpNotification$PbPftpPnsDHAttributeType implements ProtocolMessageEnum {
   CLEAR_ACTION(4),

   NEGATIVE_ACTION(3),

   POSITIVE_ACTION(2),

   UNKNOWN_ACTION(1);

   public static final int POSITIVE_ACTION_VALUE = 2;
   public static final int NEGATIVE_ACTION_VALUE = 3;
   public static final int CLEAR_ACTION_VALUE = 4;
   public static final int UNKNOWN_ACTION_VALUE = 1;
   private static final PftpNotification$PbPftpPnsDHAttributeType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PftpNotification$PbPftpPnsDHAttributeType$1();
   private final int value;

   private PftpNotification$PbPftpPnsDHAttributeType(int var3) {
      this.value = var3;
   }

   public static PftpNotification$PbPftpPnsDHAttributeType forNumber(int var0) {
      PftpNotification$PbPftpPnsDHAttributeType var1;
      switch(var0) {
      case 1:
         var1 = UNKNOWN_ACTION;
         break;
      case 2:
         var1 = POSITIVE_ACTION;
         break;
      case 3:
         var1 = NEGATIVE_ACTION;
         break;
      case 4:
         var1 = CLEAR_ACTION;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PftpNotification.getDescriptor().getEnumTypes().get(2);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PftpNotification$PbPftpPnsDHAttributeType valueOf(int var0) {
      return forNumber(var0);
   }

   public static PftpNotification$PbPftpPnsDHAttributeType valueOf(EnumValueDescriptor var0) {
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
