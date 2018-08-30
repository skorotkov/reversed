package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbMacType implements ProtocolMessageEnum {
   MAC_TYPE_BT_CLASSIC(4);

   public static final int MAC_TYPE_BT_CLASSIC_VALUE = 4;
   MAC_TYPE_PRIVATE_NONRESOLVABLE(2);

   public static final int MAC_TYPE_PRIVATE_NONRESOLVABLE_VALUE = 2;
   MAC_TYPE_PRIVATE_RESOLVABLE(3);

   public static final int MAC_TYPE_PRIVATE_RESOLVABLE_VALUE = 3;
   MAC_TYPE_PUBLIC(0);

   public static final int MAC_TYPE_PUBLIC_VALUE = 0;
   MAC_TYPE_STATIC(1);

   public static final int MAC_TYPE_STATIC_VALUE = 1;
   private static final Types$PbMacType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbMacType$1();
   private final int value;

   private Types$PbMacType(int var3) {
      this.value = var3;
   }

   public static Types$PbMacType forNumber(int var0) {
      Types$PbMacType var1;
      switch(var0) {
      case 0:
         var1 = MAC_TYPE_PUBLIC;
         break;
      case 1:
         var1 = MAC_TYPE_STATIC;
         break;
      case 2:
         var1 = MAC_TYPE_PRIVATE_NONRESOLVABLE;
         break;
      case 3:
         var1 = MAC_TYPE_PRIVATE_RESOLVABLE;
         break;
      case 4:
         var1 = MAC_TYPE_BT_CLASSIC;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(16);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbMacType valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbMacType valueOf(EnumValueDescriptor var0) {
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
