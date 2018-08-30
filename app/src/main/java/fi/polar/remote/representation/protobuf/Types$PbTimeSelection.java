package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbTimeSelection implements ProtocolMessageEnum {
   TIME_1(1);

   public static final int TIME_1_VALUE = 1;
   TIME_2(2);

   public static final int TIME_2_VALUE = 2;
   private static final Types$PbTimeSelection[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbTimeSelection$1();
   private final int value;

   private Types$PbTimeSelection(int var3) {
      this.value = var3;
   }

   public static Types$PbTimeSelection forNumber(int var0) {
      Types$PbTimeSelection var1;
      switch(var0) {
      case 1:
         var1 = TIME_1;
         break;
      case 2:
         var1 = TIME_2;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(3);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbTimeSelection valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbTimeSelection valueOf(EnumValueDescriptor var0) {
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
