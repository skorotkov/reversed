package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PhysData$PbUserWeight$WeightSettingSource implements ProtocolMessageEnum {
   SOURCE_DEFAULT(0),

   SOURCE_MEASURED(3),

   SOURCE_USER(2);

   public static final int SOURCE_DEFAULT_VALUE = 0;
   public static final int SOURCE_MEASURED_VALUE = 3;
   public static final int SOURCE_USER_VALUE = 2;
   private static final PhysData$PbUserWeight$WeightSettingSource[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PhysData$PbUserWeight$WeightSettingSource$1();
   private final int value;

   private PhysData$PbUserWeight$WeightSettingSource(int var3) {
      this.value = var3;
   }

   public static PhysData$PbUserWeight$WeightSettingSource forNumber(int var0) {
      PhysData$PbUserWeight$WeightSettingSource var1;
      switch(var0) {
      case 0:
         var1 = SOURCE_DEFAULT;
         break;
      case 1:
      default:
         var1 = null;
         break;
      case 2:
         var1 = SOURCE_USER;
         break;
      case 3:
         var1 = SOURCE_MEASURED;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PhysData$PbUserWeight.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PhysData$PbUserWeight$WeightSettingSource valueOf(int var0) {
      return forNumber(var0);
   }

   public static PhysData$PbUserWeight$WeightSettingSource valueOf(EnumValueDescriptor var0) {
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
