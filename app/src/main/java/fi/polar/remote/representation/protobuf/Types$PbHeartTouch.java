package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbHeartTouch implements ProtocolMessageEnum {
   HEART_TOUCH_ACTIVATE_BACKLIGHT(2);

   public static final int HEART_TOUCH_ACTIVATE_BACKLIGHT_VALUE = 2;
   HEART_TOUCH_OFF(1);

   public static final int HEART_TOUCH_OFF_VALUE = 1;
   HEART_TOUCH_SHOW_PREVIOUS_LAP(3);

   public static final int HEART_TOUCH_SHOW_PREVIOUS_LAP_VALUE = 3;
   HEART_TOUCH_SHOW_TIME_OF_DAY(4);

   public static final int HEART_TOUCH_SHOW_TIME_OF_DAY_VALUE = 4;
   private static final Types$PbHeartTouch[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbHeartTouch$1();
   private final int value;

   private Types$PbHeartTouch(int var3) {
      this.value = var3;
   }

   public static Types$PbHeartTouch forNumber(int var0) {
      Types$PbHeartTouch var1;
      switch(var0) {
      case 1:
         var1 = HEART_TOUCH_OFF;
         break;
      case 2:
         var1 = HEART_TOUCH_ACTIVATE_BACKLIGHT;
         break;
      case 3:
         var1 = HEART_TOUCH_SHOW_PREVIOUS_LAP;
         break;
      case 4:
         var1 = HEART_TOUCH_SHOW_TIME_OF_DAY;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(26);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbHeartTouch valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbHeartTouch valueOf(EnumValueDescriptor var0) {
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
