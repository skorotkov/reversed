package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum SleepanalysisResult$PbSleepUserRating implements ProtocolMessageEnum {
   PB_SLEPT_NEITHER_POORLY_NOR_WELL(2);

   public static final int PB_SLEPT_NEITHER_POORLY_NOR_WELL_VALUE = 2;
   PB_SLEPT_POORLY(0);

   public static final int PB_SLEPT_POORLY_VALUE = 0;
   PB_SLEPT_SOMEWHAT_POORLY(1);

   public static final int PB_SLEPT_SOMEWHAT_POORLY_VALUE = 1;
   PB_SLEPT_SOMEWHAT_WELL(3);

   public static final int PB_SLEPT_SOMEWHAT_WELL_VALUE = 3;
   PB_SLEPT_WELL(4);

   public static final int PB_SLEPT_WELL_VALUE = 4;
   private static final SleepanalysisResult$PbSleepUserRating[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new SleepanalysisResult$PbSleepUserRating$1();
   private final int value;

   private SleepanalysisResult$PbSleepUserRating(int var3) {
      this.value = var3;
   }

   public static SleepanalysisResult$PbSleepUserRating forNumber(int var0) {
      SleepanalysisResult$PbSleepUserRating var1;
      switch(var0) {
      case 0:
         var1 = PB_SLEPT_POORLY;
         break;
      case 1:
         var1 = PB_SLEPT_SOMEWHAT_POORLY;
         break;
      case 2:
         var1 = PB_SLEPT_NEITHER_POORLY_NOR_WELL;
         break;
      case 3:
         var1 = PB_SLEPT_SOMEWHAT_WELL;
         break;
      case 4:
         var1 = PB_SLEPT_WELL;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)SleepanalysisResult.getDescriptor().getEnumTypes().get(1);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static SleepanalysisResult$PbSleepUserRating valueOf(int var0) {
      return forNumber(var0);
   }

   public static SleepanalysisResult$PbSleepUserRating valueOf(EnumValueDescriptor var0) {
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
