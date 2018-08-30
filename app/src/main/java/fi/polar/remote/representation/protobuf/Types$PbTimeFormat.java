package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbTimeFormat implements ProtocolMessageEnum {
   TIME_FORMAT_12H(2),

   TIME_FORMAT_24H(1);

   public static final int TIME_FORMAT_24H_VALUE = 1;
   public static final int TIME_FORMAT_12H_VALUE = 2;
   private static final Types$PbTimeFormat[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbTimeFormat$1();
   private final int value;

   private Types$PbTimeFormat(int var3) {
      this.value = var3;
   }

   public static Types$PbTimeFormat forNumber(int var0) {
      Types$PbTimeFormat var1;
      switch(var0) {
      case 1:
         var1 = TIME_FORMAT_24H;
         break;
      case 2:
         var1 = TIME_FORMAT_12H;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(4);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbTimeFormat valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbTimeFormat valueOf(EnumValueDescriptor var0) {
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
