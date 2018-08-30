package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbHeartRateView implements ProtocolMessageEnum {
   HEART_RATE_VIEW_BPM(1);

   public static final int HEART_RATE_VIEW_BPM_VALUE = 1;
   HEART_RATE_VIEW_PERCENTS_OF_HR_RESERVE(2);

   public static final int HEART_RATE_VIEW_PERCENTS_OF_HR_RESERVE_VALUE = 2;
   HEART_RATE_VIEW_PERCENTS_OF_MAX_HR(3);

   public static final int HEART_RATE_VIEW_PERCENTS_OF_MAX_HR_VALUE = 3;
   private static final Types$PbHeartRateView[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbHeartRateView$1();
   private final int value;

   private Types$PbHeartRateView(int var3) {
      this.value = var3;
   }

   public static Types$PbHeartRateView forNumber(int var0) {
      Types$PbHeartRateView var1;
      switch(var0) {
      case 1:
         var1 = HEART_RATE_VIEW_BPM;
         break;
      case 2:
         var1 = HEART_RATE_VIEW_PERCENTS_OF_HR_RESERVE;
         break;
      case 3:
         var1 = HEART_RATE_VIEW_PERCENTS_OF_MAX_HR;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(1);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbHeartRateView valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbHeartRateView valueOf(EnumValueDescriptor var0) {
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
