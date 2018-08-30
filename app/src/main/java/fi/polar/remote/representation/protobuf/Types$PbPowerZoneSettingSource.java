package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbPowerZoneSettingSource implements ProtocolMessageEnum {
   POWER_ZONE_SETTING_SOURCE_DEFAULT(0);

   public static final int POWER_ZONE_SETTING_SOURCE_DEFAULT_VALUE = 0;
   POWER_ZONE_SETTING_SOURCE_FREE(1);

   public static final int POWER_ZONE_SETTING_SOURCE_FREE_VALUE = 1;
   private static final Types$PbPowerZoneSettingSource[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbPowerZoneSettingSource$1();
   private final int value;

   private Types$PbPowerZoneSettingSource(int var3) {
      this.value = var3;
   }

   public static Types$PbPowerZoneSettingSource forNumber(int var0) {
      Types$PbPowerZoneSettingSource var1;
      switch(var0) {
      case 0:
         var1 = POWER_ZONE_SETTING_SOURCE_DEFAULT;
         break;
      case 1:
         var1 = POWER_ZONE_SETTING_SOURCE_FREE;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(14);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbPowerZoneSettingSource valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbPowerZoneSettingSource valueOf(EnumValueDescriptor var0) {
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
