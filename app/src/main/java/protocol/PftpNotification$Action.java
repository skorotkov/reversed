package protocol;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PftpNotification$Action implements ProtocolMessageEnum {
   CREATED(0);

   public static final int CREATED_VALUE = 0;
   REMOVED(2);

   public static final int REMOVED_VALUE = 2;
   UPDATED(1);

   public static final int UPDATED_VALUE = 1;
   private static final PftpNotification$Action[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PftpNotification$Action$1();
   private final int value;

   private PftpNotification$Action(int var3) {
      this.value = var3;
   }

   public static PftpNotification$Action forNumber(int var0) {
      PftpNotification$Action var1;
      switch(var0) {
      case 0:
         var1 = CREATED;
         break;
      case 1:
         var1 = UPDATED;
         break;
      case 2:
         var1 = REMOVED;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PftpNotification.getDescriptor().getEnumTypes().get(1);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PftpNotification$Action valueOf(int var0) {
      return forNumber(var0);
   }

   public static PftpNotification$Action valueOf(EnumValueDescriptor var0) {
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
