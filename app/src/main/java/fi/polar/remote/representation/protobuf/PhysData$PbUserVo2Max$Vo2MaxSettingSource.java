package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PhysData$PbUserVo2Max$Vo2MaxSettingSource implements ProtocolMessageEnum {
   SOURCE_DEFAULT(0);

   public static final int SOURCE_DEFAULT_VALUE = 0;
   SOURCE_ESTIMATE(1);

   public static final int SOURCE_ESTIMATE_VALUE = 1;
   SOURCE_FITNESSTEST(3);

   public static final int SOURCE_FITNESSTEST_VALUE = 3;
   SOURCE_USER(2);

   public static final int SOURCE_USER_VALUE = 2;
   private static final PhysData$PbUserVo2Max$Vo2MaxSettingSource[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PhysData$PbUserVo2Max$Vo2MaxSettingSource$1();
   private final int value;

   private PhysData$PbUserVo2Max$Vo2MaxSettingSource(int var3) {
      this.value = var3;
   }

   public static PhysData$PbUserVo2Max$Vo2MaxSettingSource forNumber(int var0) {
      PhysData$PbUserVo2Max$Vo2MaxSettingSource var1;
      switch(var0) {
      case 0:
         var1 = SOURCE_DEFAULT;
         break;
      case 1:
         var1 = SOURCE_ESTIMATE;
         break;
      case 2:
         var1 = SOURCE_USER;
         break;
      case 3:
         var1 = SOURCE_FITNESSTEST;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PhysData$PbUserVo2Max.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PhysData$PbUserVo2Max$Vo2MaxSettingSource valueOf(int var0) {
      return forNumber(var0);
   }

   public static PhysData$PbUserVo2Max$Vo2MaxSettingSource valueOf(EnumValueDescriptor var0) {
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
