package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting implements ProtocolMessageEnum {
   private static final SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting[] VALUES = values();
   ZONEOPTIMIZER_DEFAULT(3);

   public static final int ZONEOPTIMIZER_DEFAULT_VALUE = 3;
   ZONEOPTIMIZER_MODIFIED(4),
   ZONEOPTIMIZER_MODIFIED_OFF(2);

   public static final int ZONEOPTIMIZER_MODIFIED_OFF_VALUE = 2;
   public static final int ZONEOPTIMIZER_MODIFIED_VALUE = 4;
   ZONEOPTIMIZER_OFF(1);

   public static final int ZONEOPTIMIZER_OFF_VALUE = 1;
   private static final EnumLiteMap internalValueMap = new SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting$1();
   private final int value;

   private SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting(int var3) {
      this.value = var3;
   }

   public static SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting forNumber(int var0) {
      SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting var1;
      switch(var0) {
      case 1:
         var1 = ZONEOPTIMIZER_OFF;
         break;
      case 2:
         var1 = ZONEOPTIMIZER_MODIFIED_OFF;
         break;
      case 3:
         var1 = ZONEOPTIMIZER_DEFAULT;
         break;
      case 4:
         var1 = ZONEOPTIMIZER_MODIFIED;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)SportProfile$PbSportProfileSettings.getDescriptor().getEnumTypes().get(1);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting valueOf(int var0) {
      return forNumber(var0);
   }

   public static SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting valueOf(EnumValueDescriptor var0) {
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
