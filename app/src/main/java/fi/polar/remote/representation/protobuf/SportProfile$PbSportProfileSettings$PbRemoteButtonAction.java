package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum SportProfile$PbSportProfileSettings$PbRemoteButtonAction implements ProtocolMessageEnum {
   REMOTE_BUTTON_ACTIVATE_BACKLIGHT(2),

   REMOTE_BUTTON_ACTIVATE_SAFETY_LIGHT(5),

   REMOTE_BUTTON_BROWSE_DOWN(7),

   REMOTE_BUTTON_BROWSE_UP(6),

   REMOTE_BUTTON_CHANGE_TRAINING_VIEW(3),

   REMOTE_BUTTON_RING_BELL(1),

   REMOTE_BUTTON_TAKE_LAP(4);

   public static final int REMOTE_BUTTON_TAKE_LAP_VALUE = 4;
   public static final int REMOTE_BUTTON_RING_BELL_VALUE = 1;
   public static final int REMOTE_BUTTON_CHANGE_TRAINING_VIEW_VALUE = 3;
   public static final int REMOTE_BUTTON_BROWSE_UP_VALUE = 6;
   public static final int REMOTE_BUTTON_BROWSE_DOWN_VALUE = 7;
   public static final int REMOTE_BUTTON_ACTIVATE_SAFETY_LIGHT_VALUE = 5;
   public static final int REMOTE_BUTTON_ACTIVATE_BACKLIGHT_VALUE = 2;
   private static final SportProfile$PbSportProfileSettings$PbRemoteButtonAction[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new SportProfile$PbSportProfileSettings$PbRemoteButtonAction$1();
   private final int value;

   private SportProfile$PbSportProfileSettings$PbRemoteButtonAction(int var3) {
      this.value = var3;
   }

   public static SportProfile$PbSportProfileSettings$PbRemoteButtonAction forNumber(int var0) {
      SportProfile$PbSportProfileSettings$PbRemoteButtonAction var1;
      switch(var0) {
      case 1:
         var1 = REMOTE_BUTTON_RING_BELL;
         break;
      case 2:
         var1 = REMOTE_BUTTON_ACTIVATE_BACKLIGHT;
         break;
      case 3:
         var1 = REMOTE_BUTTON_CHANGE_TRAINING_VIEW;
         break;
      case 4:
         var1 = REMOTE_BUTTON_TAKE_LAP;
         break;
      case 5:
         var1 = REMOTE_BUTTON_ACTIVATE_SAFETY_LIGHT;
         break;
      case 6:
         var1 = REMOTE_BUTTON_BROWSE_UP;
         break;
      case 7:
         var1 = REMOTE_BUTTON_BROWSE_DOWN;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)SportProfile$PbSportProfileSettings.getDescriptor().getEnumTypes().get(4);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static SportProfile$PbSportProfileSettings$PbRemoteButtonAction valueOf(int var0) {
      return forNumber(var0);
   }

   public static SportProfile$PbSportProfileSettings$PbRemoteButtonAction valueOf(EnumValueDescriptor var0) {
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
