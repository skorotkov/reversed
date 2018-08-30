package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbStartDayOfWeek implements ProtocolMessageEnum {
   MONDAY(1),

   SATURDAY(2),

   SUNDAY(3);

   public static final int SUNDAY_VALUE = 3;
   public static final int SATURDAY_VALUE = 2;
   public static final int MONDAY_VALUE = 1;
   private static final Types$PbStartDayOfWeek[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbStartDayOfWeek$1();
   private final int value;

   private Types$PbStartDayOfWeek(int var3) {
      this.value = var3;
   }

   public static Types$PbStartDayOfWeek forNumber(int var0) {
      Types$PbStartDayOfWeek var1;
      switch(var0) {
      case 1:
         var1 = MONDAY;
         break;
      case 2:
         var1 = SATURDAY;
         break;
      case 3:
         var1 = SUNDAY;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(6);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbStartDayOfWeek valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbStartDayOfWeek valueOf(EnumValueDescriptor var0) {
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
