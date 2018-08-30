package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbLocation$Fix implements ProtocolMessageEnum {
   FIX_2D(1),

   FIX_3D(2),

   FIX_NONE(0);

   public static final int FIX_NONE_VALUE = 0;
   public static final int FIX_3D_VALUE = 2;
   public static final int FIX_2D_VALUE = 1;
   private static final Types$PbLocation$Fix[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbLocation$Fix$1();
   private final int value;

   private Types$PbLocation$Fix(int var3) {
      this.value = var3;
   }

   public static Types$PbLocation$Fix forNumber(int var0) {
      Types$PbLocation$Fix var1;
      switch(var0) {
      case 0:
         var1 = FIX_NONE;
         break;
      case 1:
         var1 = FIX_2D;
         break;
      case 2:
         var1 = FIX_3D;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types$PbLocation.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbLocation$Fix valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbLocation$Fix valueOf(EnumValueDescriptor var0) {
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
