package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum SportProfile$PbSportProfileSettings$PbSpeedView implements ProtocolMessageEnum {
   SPEED_VIEW_PACE(1),

   SPEED_VIEW_SPEED(2);

   public static final int SPEED_VIEW_PACE_VALUE = 1;
   public static final int SPEED_VIEW_SPEED_VALUE = 2;
   private static final SportProfile$PbSportProfileSettings$PbSpeedView[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new SportProfile$PbSportProfileSettings$PbSpeedView$1();
   private final int value;

   private SportProfile$PbSportProfileSettings$PbSpeedView(int var3) {
      this.value = var3;
   }

   public static SportProfile$PbSportProfileSettings$PbSpeedView forNumber(int var0) {
      SportProfile$PbSportProfileSettings$PbSpeedView var1;
      switch(var0) {
      case 1:
         var1 = SPEED_VIEW_PACE;
         break;
      case 2:
         var1 = SPEED_VIEW_SPEED;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)SportProfile$PbSportProfileSettings.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static SportProfile$PbSportProfileSettings$PbSpeedView valueOf(int var0) {
      return forNumber(var0);
   }

   public static SportProfile$PbSportProfileSettings$PbSpeedView valueOf(EnumValueDescriptor var0) {
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
