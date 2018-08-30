package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbHandedness implements ProtocolMessageEnum {
   WU_IN_LEFT_HAND(1),

   WU_IN_NECKLACE(3),

   WU_IN_RIGHT_HAND(2);

   public static final int WU_IN_RIGHT_HAND_VALUE = 2;
   public static final int WU_IN_NECKLACE_VALUE = 3;
   public static final int WU_IN_LEFT_HAND_VALUE = 1;
   private static final Types$PbHandedness[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbHandedness$1();
   private final int value;

   private Types$PbHandedness(int var3) {
      this.value = var3;
   }

   public static Types$PbHandedness forNumber(int var0) {
      Types$PbHandedness var1;
      switch(var0) {
      case 1:
         var1 = WU_IN_LEFT_HAND;
         break;
      case 2:
         var1 = WU_IN_RIGHT_HAND;
         break;
      case 3:
         var1 = WU_IN_NECKLACE;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(28);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbHandedness valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbHandedness valueOf(EnumValueDescriptor var0) {
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
