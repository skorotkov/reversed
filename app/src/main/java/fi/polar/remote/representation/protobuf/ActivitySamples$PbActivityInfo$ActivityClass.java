package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum ActivitySamples$PbActivityInfo$ActivityClass implements ProtocolMessageEnum {
   SLEEP(1), SEDENTARY(2), LIGHT(3), CONTINUOUS_MODERATE(4), INTERMITTENT_MODERATE(5),
   CONTINUOUS_VIGOROUS(6), INTERMITTENT_VIGOROUS(7), NON_WEAR(8);
//   CONTINUOUS_MODERATE(4);

   public static final int CONTINUOUS_MODERATE_VALUE = 4;
//   CONTINUOUS_VIGOROUS(6);

   public static final int CONTINUOUS_VIGOROUS_VALUE = 6;
//   INTERMITTENT_MODERATE(5);

   public static final int INTERMITTENT_MODERATE_VALUE = 5;
//   INTERMITTENT_VIGOROUS(7);

   public static final int INTERMITTENT_VIGOROUS_VALUE = 7;
//   LIGHT(3);

   public static final int LIGHT_VALUE = 3;
//   NON_WEAR(8);

   public static final int NON_WEAR_VALUE = 8;
//   SEDENTARY(2);

   public static final int SEDENTARY_VALUE = 2;
//   SLEEP(1);

   public static final int SLEEP_VALUE = 1;
   private static final ActivitySamples$PbActivityInfo$ActivityClass[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new ActivitySamples$PbActivityInfo$ActivityClass$1();
   private final int value;

   private ActivitySamples$PbActivityInfo$ActivityClass(int var3) {
      this.value = var3;
   }

   public static ActivitySamples$PbActivityInfo$ActivityClass forNumber(int var0) {
      ActivitySamples$PbActivityInfo$ActivityClass var1;
      switch(var0) {
      case 1:
         var1 = SLEEP;
         break;
      case 2:
         var1 = SEDENTARY;
         break;
      case 3:
         var1 = LIGHT;
         break;
      case 4:
         var1 = CONTINUOUS_MODERATE;
         break;
      case 5:
         var1 = INTERMITTENT_MODERATE;
         break;
      case 6:
         var1 = CONTINUOUS_VIGOROUS;
         break;
      case 7:
         var1 = INTERMITTENT_VIGOROUS;
         break;
      case 8:
         var1 = NON_WEAR;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)ActivitySamples$PbActivityInfo.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static ActivitySamples$PbActivityInfo$ActivityClass valueOf(int var0) {
      return forNumber(var0);
   }

   public static ActivitySamples$PbActivityInfo$ActivityClass valueOf(EnumValueDescriptor var0) {
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
