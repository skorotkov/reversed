package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum SleepanalysisResult$PbSleepWakeState implements ProtocolMessageEnum {
   PB_NONREM1(-4);

   public static final int PB_NONREM1_VALUE = -4;
   PB_NONREM2(-5);

   public static final int PB_NONREM2_VALUE = -5;
   PB_NONREM3(-6);

   public static final int PB_NONREM3_VALUE = -6;
   PB_REM(-3);

   public static final int PB_REM_VALUE = -3;
   PB_WAKE(-2);

   public static final int PB_WAKE_VALUE = -2;
   private static final SleepanalysisResult$PbSleepWakeState[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new SleepanalysisResult$PbSleepWakeState$1();
   private final int value;

   private SleepanalysisResult$PbSleepWakeState(int var3) {
      this.value = var3;
   }

   public static SleepanalysisResult$PbSleepWakeState forNumber(int var0) {
      SleepanalysisResult$PbSleepWakeState var1;
      switch(var0) {
      case -6:
         var1 = PB_NONREM3;
         break;
      case -5:
         var1 = PB_NONREM2;
         break;
      case -4:
         var1 = PB_NONREM1;
         break;
      case -3:
         var1 = PB_REM;
         break;
      case -2:
         var1 = PB_WAKE;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)SleepanalysisResult.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static SleepanalysisResult$PbSleepWakeState valueOf(int var0) {
      return forNumber(var0);
   }

   public static SleepanalysisResult$PbSleepWakeState valueOf(EnumValueDescriptor var0) {
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
