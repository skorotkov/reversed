package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PhysData$PbUserTrainingBackground$TrainingBackground implements ProtocolMessageEnum {
   FREQUENT(30);

   public static final int FREQUENT_VALUE = 30;
   HEAVY(40);

   public static final int HEAVY_VALUE = 40;
   OCCASIONAL(10);

   public static final int OCCASIONAL_VALUE = 10;
   PRO(60);

   public static final int PRO_VALUE = 60;
   REGULAR(20);

   public static final int REGULAR_VALUE = 20;
   SEMI_PRO(50);

   public static final int SEMI_PRO_VALUE = 50;
   private static final PhysData$PbUserTrainingBackground$TrainingBackground[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PhysData$PbUserTrainingBackground$TrainingBackground$1();
   private final int value;

   private PhysData$PbUserTrainingBackground$TrainingBackground(int var3) {
      this.value = var3;
   }

   public static PhysData$PbUserTrainingBackground$TrainingBackground forNumber(int var0) {
      PhysData$PbUserTrainingBackground$TrainingBackground var1;
      switch(var0) {
      case 10:
         var1 = OCCASIONAL;
         break;
      case 20:
         var1 = REGULAR;
         break;
      case 30:
         var1 = FREQUENT;
         break;
      case 40:
         var1 = HEAVY;
         break;
      case 50:
         var1 = SEMI_PRO;
         break;
      case 60:
         var1 = PRO;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PhysData$PbUserTrainingBackground.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PhysData$PbUserTrainingBackground$TrainingBackground valueOf(int var0) {
      return forNumber(var0);
   }

   public static PhysData$PbUserTrainingBackground$TrainingBackground valueOf(EnumValueDescriptor var0) {
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
