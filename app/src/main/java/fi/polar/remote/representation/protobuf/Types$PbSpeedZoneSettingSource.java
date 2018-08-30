package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbSpeedZoneSettingSource implements ProtocolMessageEnum {
   SPEED_ZONE_SETTING_SOURCE_DEFAULT(0),

   SPEED_ZONE_SETTING_SOURCE_FREE(1);

   public static final int SPEED_ZONE_SETTING_SOURCE_DEFAULT_VALUE = 0;
   public static final int SPEED_ZONE_SETTING_SOURCE_FREE_VALUE = 1;
   private static final Types$PbSpeedZoneSettingSource[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbSpeedZoneSettingSource$1();
   private final int value;

   private Types$PbSpeedZoneSettingSource(int var3) {
      this.value = var3;
   }

   public static Types$PbSpeedZoneSettingSource forNumber(int var0) {
      Types$PbSpeedZoneSettingSource var1;
      switch(var0) {
      case 0:
         var1 = SPEED_ZONE_SETTING_SOURCE_DEFAULT;
         break;
      case 1:
         var1 = SPEED_ZONE_SETTING_SOURCE_FREE;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(15);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbSpeedZoneSettingSource valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbSpeedZoneSettingSource valueOf(EnumValueDescriptor var0) {
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
