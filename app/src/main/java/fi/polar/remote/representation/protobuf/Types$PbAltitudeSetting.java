package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbAltitudeSetting implements ProtocolMessageEnum {
   ALTITUDE_OFF(0),

   ALTITUDE_ON(1);

   public static final int ALTITUDE_OFF_VALUE = 0;
   public static final int ALTITUDE_ON_VALUE = 1;
   private static final Types$PbAltitudeSetting[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbAltitudeSetting$1();
   private final int value;

   private Types$PbAltitudeSetting(int var3) {
      this.value = var3;
   }

   public static Types$PbAltitudeSetting forNumber(int var0) {
      Types$PbAltitudeSetting var1;
      switch(var0) {
      case 0:
         var1 = ALTITUDE_OFF;
         break;
      case 1:
         var1 = ALTITUDE_ON;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(24);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbAltitudeSetting valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbAltitudeSetting valueOf(EnumValueDescriptor var0) {
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
