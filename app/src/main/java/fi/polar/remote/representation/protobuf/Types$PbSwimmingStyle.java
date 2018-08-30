package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbSwimmingStyle implements ProtocolMessageEnum {
   BACKSTROKE(13);

   public static final int BACKSTROKE_VALUE = 13;
   BREASTSTROKE(12);

   public static final int BREASTSTROKE_VALUE = 12;
   BUTTERFLY(14);

   public static final int BUTTERFLY_VALUE = 14;
   FREESTYLE(11);

   public static final int FREESTYLE_VALUE = 11;
   OTHER(-1),
   OTHER_SWIMMING(10);

   public static final int OTHER_SWIMMING_VALUE = 10;
   public static final int OTHER_VALUE = -1;
   TURN(0);

   public static final int TURN_VALUE = 0;
   private static final Types$PbSwimmingStyle[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbSwimmingStyle$1();
   private final int value;

   private Types$PbSwimmingStyle(int var3) {
      this.value = var3;
   }

   public static Types$PbSwimmingStyle forNumber(int var0) {
      Types$PbSwimmingStyle var1;
      switch(var0) {
      case -1:
         var1 = OTHER;
         break;
      case 0:
         var1 = TURN;
         break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      default:
         var1 = null;
         break;
      case 10:
         var1 = OTHER_SWIMMING;
         break;
      case 11:
         var1 = FREESTYLE;
         break;
      case 12:
         var1 = BREASTSTROKE;
         break;
      case 13:
         var1 = BACKSTROKE;
         break;
      case 14:
         var1 = BUTTERFLY;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(17);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbSwimmingStyle valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbSwimmingStyle valueOf(EnumValueDescriptor var0) {
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
