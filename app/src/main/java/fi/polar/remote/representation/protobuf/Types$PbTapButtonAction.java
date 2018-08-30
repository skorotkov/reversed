package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbTapButtonAction implements ProtocolMessageEnum {
   TAP_BUTTON_ACTIVATE_BACKLIGHT(4);

   public static final int TAP_BUTTON_ACTIVATE_BACKLIGHT_VALUE = 4;
   TAP_BUTTON_CHANGE_TRAINING_VIEW(3);

   public static final int TAP_BUTTON_CHANGE_TRAINING_VIEW_VALUE = 3;
   TAP_BUTTON_OFF(1);

   public static final int TAP_BUTTON_OFF_VALUE = 1;
   TAP_BUTTON_TAKE_LAP(2);

   public static final int TAP_BUTTON_TAKE_LAP_VALUE = 2;
   private static final Types$PbTapButtonAction[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbTapButtonAction$1();
   private final int value;

   private Types$PbTapButtonAction(int var3) {
      this.value = var3;
   }

   public static Types$PbTapButtonAction forNumber(int var0) {
      Types$PbTapButtonAction var1;
      switch(var0) {
      case 1:
         var1 = TAP_BUTTON_OFF;
         break;
      case 2:
         var1 = TAP_BUTTON_TAKE_LAP;
         break;
      case 3:
         var1 = TAP_BUTTON_CHANGE_TRAINING_VIEW;
         break;
      case 4:
         var1 = TAP_BUTTON_ACTIVATE_BACKLIGHT;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(27);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbTapButtonAction valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbTapButtonAction valueOf(EnumValueDescriptor var0) {
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
