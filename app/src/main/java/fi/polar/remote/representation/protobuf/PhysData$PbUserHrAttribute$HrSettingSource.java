package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PhysData$PbUserHrAttribute$HrSettingSource implements ProtocolMessageEnum {
   SOURCE_AGE_BASED(1);

   public static final int SOURCE_AGE_BASED_VALUE = 1;
   SOURCE_DEFAULT(0);

   public static final int SOURCE_DEFAULT_VALUE = 0;
   SOURCE_KEEP(4);

   public static final int SOURCE_KEEP_VALUE = 4;
   SOURCE_MEASURED(3);

   public static final int SOURCE_MEASURED_VALUE = 3;
   SOURCE_USER(2);

   public static final int SOURCE_USER_VALUE = 2;
   private static final PhysData$PbUserHrAttribute$HrSettingSource[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PhysData$PbUserHrAttribute$HrSettingSource$1();
   private final int value;

   private PhysData$PbUserHrAttribute$HrSettingSource(int var3) {
      this.value = var3;
   }

   public static PhysData$PbUserHrAttribute$HrSettingSource forNumber(int var0) {
      PhysData$PbUserHrAttribute$HrSettingSource var1;
      switch(var0) {
      case 0:
         var1 = SOURCE_DEFAULT;
         break;
      case 1:
         var1 = SOURCE_AGE_BASED;
         break;
      case 2:
         var1 = SOURCE_USER;
         break;
      case 3:
         var1 = SOURCE_MEASURED;
         break;
      case 4:
         var1 = SOURCE_KEEP;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PhysData$PbUserHrAttribute.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PhysData$PbUserHrAttribute$HrSettingSource valueOf(int var0) {
      return forNumber(var0);
   }

   public static PhysData$PbUserHrAttribute$HrSettingSource valueOf(EnumValueDescriptor var0) {
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
