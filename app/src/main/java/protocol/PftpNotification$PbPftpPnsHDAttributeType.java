package protocol;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PftpNotification$PbPftpPnsHDAttributeType implements ProtocolMessageEnum {
   APPLICATION_NAME(5);

   public static final int APPLICATION_NAME_VALUE = 5;
   CLEAR_ACTION_LABEL(6);

   public static final int CLEAR_ACTION_LABEL_VALUE = 6;
   MESSAGE(2);

   public static final int MESSAGE_VALUE = 2;
   NEGATIVE_ACTION_LABEL(4);

   public static final int NEGATIVE_ACTION_LABEL_VALUE = 4;
   POSITIVE_ACTION_LABEL(3);

   public static final int POSITIVE_ACTION_LABEL_VALUE = 3;
   SUBTITLE(1);

   public static final int SUBTITLE_VALUE = 1;
   TITLE(0);

   public static final int TITLE_VALUE = 0;
   private static final PftpNotification$PbPftpPnsHDAttributeType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PftpNotification$PbPftpPnsHDAttributeType$1();
   private final int value;

   private PftpNotification$PbPftpPnsHDAttributeType(int var3) {
      this.value = var3;
   }

   public static PftpNotification$PbPftpPnsHDAttributeType forNumber(int var0) {
      PftpNotification$PbPftpPnsHDAttributeType var1;
      switch(var0) {
      case 0:
         var1 = TITLE;
         break;
      case 1:
         var1 = SUBTITLE;
         break;
      case 2:
         var1 = MESSAGE;
         break;
      case 3:
         var1 = POSITIVE_ACTION_LABEL;
         break;
      case 4:
         var1 = NEGATIVE_ACTION_LABEL;
         break;
      case 5:
         var1 = APPLICATION_NAME;
         break;
      case 6:
         var1 = CLEAR_ACTION_LABEL;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PftpNotification.getDescriptor().getEnumTypes().get(5);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PftpNotification$PbPftpPnsHDAttributeType valueOf(int var0) {
      return forNumber(var0);
   }

   public static PftpNotification$PbPftpPnsHDAttributeType valueOf(EnumValueDescriptor var0) {
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
