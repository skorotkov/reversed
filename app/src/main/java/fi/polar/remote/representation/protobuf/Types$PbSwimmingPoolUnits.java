package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbSwimmingPoolUnits implements ProtocolMessageEnum {
   SWIMMING_POOL_METERS(0);

   public static final int SWIMMING_POOL_METERS_VALUE = 0;
   SWIMMING_POOL_YARDS(1);

   public static final int SWIMMING_POOL_YARDS_VALUE = 1;
   private static final Types$PbSwimmingPoolUnits[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbSwimmingPoolUnits$1();
   private final int value;

   private Types$PbSwimmingPoolUnits(int var3) {
      this.value = var3;
   }

   public static Types$PbSwimmingPoolUnits forNumber(int var0) {
      Types$PbSwimmingPoolUnits var1;
      switch(var0) {
      case 0:
         var1 = SWIMMING_POOL_METERS;
         break;
      case 1:
         var1 = SWIMMING_POOL_YARDS;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(18);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbSwimmingPoolUnits valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbSwimmingPoolUnits valueOf(EnumValueDescriptor var0) {
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
