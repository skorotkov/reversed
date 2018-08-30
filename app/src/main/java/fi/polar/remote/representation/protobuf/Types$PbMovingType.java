package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbMovingType implements ProtocolMessageEnum {
   RUNNING(1),

   STANDING(2),

   WALKING(0);

   public static final int STANDING_VALUE = 2;
   public static final int RUNNING_VALUE = 1;
   public static final int WALKING_VALUE = 0;
   private static final Types$PbMovingType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbMovingType$1();
   private final int value;

   private Types$PbMovingType(int var3) {
      this.value = var3;
   }

   public static Types$PbMovingType forNumber(int var0) {
      Types$PbMovingType var1;
      switch(var0) {
      case 0:
         var1 = WALKING;
         break;
      case 1:
         var1 = RUNNING;
         break;
      case 2:
         var1 = STANDING;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(10);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbMovingType valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbMovingType valueOf(EnumValueDescriptor var0) {
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
