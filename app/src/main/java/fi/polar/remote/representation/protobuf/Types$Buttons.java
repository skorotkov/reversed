package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$Buttons implements ProtocolMessageEnum {
   BUTTON_BACK(4);

   public static final int BUTTON_BACK_VALUE = 4;
   BUTTON_LIGHT(3);

   public static final int BUTTON_LIGHT_VALUE = 3;
   BUTTON_MINUS(1);

   public static final int BUTTON_MINUS_VALUE = 1;
   BUTTON_OK(2);

   public static final int BUTTON_OK_VALUE = 2;
   BUTTON_PLUS(0);

   public static final int BUTTON_PLUS_VALUE = 0;
   private static final Types$Buttons[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$Buttons$1();
   private final int value;

   private Types$Buttons(int var3) {
      this.value = var3;
   }

   public static Types$Buttons forNumber(int var0) {
      Types$Buttons var1;
      switch(var0) {
      case 0:
         var1 = BUTTON_PLUS;
         break;
      case 1:
         var1 = BUTTON_MINUS;
         break;
      case 2:
         var1 = BUTTON_OK;
         break;
      case 3:
         var1 = BUTTON_LIGHT;
         break;
      case 4:
         var1 = BUTTON_BACK;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(20);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$Buttons valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$Buttons valueOf(EnumValueDescriptor var0) {
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
