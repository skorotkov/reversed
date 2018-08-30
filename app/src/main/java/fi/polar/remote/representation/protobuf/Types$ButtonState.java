package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$ButtonState implements ProtocolMessageEnum {
   BUTTON_PRESSED(0);

   public static final int BUTTON_PRESSED_VALUE = 0;
   BUTTON_RELEASED(1);

   public static final int BUTTON_RELEASED_VALUE = 1;
   private static final Types$ButtonState[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$ButtonState$1();
   private final int value;

   private Types$ButtonState(int var3) {
      this.value = var3;
   }

   public static Types$ButtonState forNumber(int var0) {
      Types$ButtonState var1;
      switch(var0) {
      case 0:
         var1 = BUTTON_PRESSED;
         break;
      case 1:
         var1 = BUTTON_RELEASED;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(21);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$ButtonState valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$ButtonState valueOf(EnumValueDescriptor var0) {
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
