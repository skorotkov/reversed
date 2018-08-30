package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum SportProfile$PbSportProfileSettings$PbPowerView implements ProtocolMessageEnum {
   POWER_VIEW_FTP_PERCENT(3);

   public static final int POWER_VIEW_FTP_PERCENT_VALUE = 3;
   POWER_VIEW_WATT(1),
   POWER_VIEW_WATT_PER_KG(2);

   public static final int POWER_VIEW_WATT_PER_KG_VALUE = 2;
   public static final int POWER_VIEW_WATT_VALUE = 1;
   private static final SportProfile$PbSportProfileSettings$PbPowerView[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new SportProfile$PbSportProfileSettings$PbPowerView$1();
   private final int value;

   private SportProfile$PbSportProfileSettings$PbPowerView(int var3) {
      this.value = var3;
   }

   public static SportProfile$PbSportProfileSettings$PbPowerView forNumber(int var0) {
      SportProfile$PbSportProfileSettings$PbPowerView var1;
      switch(var0) {
      case 1:
         var1 = POWER_VIEW_WATT;
         break;
      case 2:
         var1 = POWER_VIEW_WATT_PER_KG;
         break;
      case 3:
         var1 = POWER_VIEW_FTP_PERCENT;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)SportProfile$PbSportProfileSettings.getDescriptor().getEnumTypes().get(2);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static SportProfile$PbSportProfileSettings$PbPowerView valueOf(int var0) {
      return forNumber(var0);
   }

   public static SportProfile$PbSportProfileSettings$PbPowerView valueOf(EnumValueDescriptor var0) {
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
