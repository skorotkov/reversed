package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbDateFormat implements ProtocolMessageEnum {
   DD_MM_YYYY(1);

   public static final int DD_MM_YYYY_VALUE = 1;
   MM_DD_YYYY(2);

   public static final int MM_DD_YYYY_VALUE = 2;
   private static final Types$PbDateFormat[] VALUES = values();
   YYYY_MM_DD(3);

   public static final int YYYY_MM_DD_VALUE = 3;
   private static final EnumLiteMap internalValueMap = new Types$PbDateFormat$1();
   private final int value;

   private Types$PbDateFormat(int var3) {
      this.value = var3;
   }

   public static Types$PbDateFormat forNumber(int var0) {
      Types$PbDateFormat var1;
      switch(var0) {
      case 1:
         var1 = DD_MM_YYYY;
         break;
      case 2:
         var1 = MM_DD_YYYY;
         break;
      case 3:
         var1 = YYYY_MM_DD;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(8);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbDateFormat valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbDateFormat valueOf(EnumValueDescriptor var0) {
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
