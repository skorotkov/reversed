package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbUnitSystem implements ProtocolMessageEnum {
   IMPERIAL(2);

   public static final int IMPERIAL_VALUE = 2;
   METRIC(1);

   public static final int METRIC_VALUE = 1;
   private static final Types$PbUnitSystem[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbUnitSystem$1();
   private final int value;

   private Types$PbUnitSystem(int var3) {
      this.value = var3;
   }

   public static Types$PbUnitSystem forNumber(int var0) {
      Types$PbUnitSystem var1;
      switch(var0) {
      case 1:
         var1 = METRIC;
         break;
      case 2:
         var1 = IMPERIAL;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(2);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbUnitSystem valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbUnitSystem valueOf(EnumValueDescriptor var0) {
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
