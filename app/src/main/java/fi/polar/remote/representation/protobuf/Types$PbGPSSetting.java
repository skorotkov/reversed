package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbGPSSetting implements ProtocolMessageEnum {
   GPS_OFF(0);

   public static final int GPS_OFF_VALUE = 0;
   GPS_ON_10_HZ(3);

   public static final int GPS_ON_10_HZ_VALUE = 3;
   GPS_ON_LONG(2);

   public static final int GPS_ON_LONG_VALUE = 2;
   GPS_ON_MEDIUM(4);

   public static final int GPS_ON_MEDIUM_VALUE = 4;
   GPS_ON_NORMAL(1);

   public static final int GPS_ON_NORMAL_VALUE = 1;
   private static final Types$PbGPSSetting[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbGPSSetting$1();
   private final int value;

   private Types$PbGPSSetting(int var3) {
      this.value = var3;
   }

   public static Types$PbGPSSetting forNumber(int var0) {
      Types$PbGPSSetting var1;
      switch(var0) {
      case 0:
         var1 = GPS_OFF;
         break;
      case 1:
         var1 = GPS_ON_NORMAL;
         break;
      case 2:
         var1 = GPS_ON_LONG;
         break;
      case 3:
         var1 = GPS_ON_10_HZ;
         break;
      case 4:
         var1 = GPS_ON_MEDIUM;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(25);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbGPSSetting valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbGPSSetting valueOf(EnumValueDescriptor var0) {
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
