package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PhysData$PbUserTypicalDay$TypicalDay implements ProtocolMessageEnum {
   MOSTLY_MOVING(3),

   MOSTLY_SITTING(1),

   MOSTLY_STANDING(2);

   public static final int MOSTLY_MOVING_VALUE = 3;
   public static final int MOSTLY_SITTING_VALUE = 1;
   public static final int MOSTLY_STANDING_VALUE = 2;
   private static final PhysData$PbUserTypicalDay$TypicalDay[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PhysData$PbUserTypicalDay$TypicalDay$1();
   private final int value;

   private PhysData$PbUserTypicalDay$TypicalDay(int var3) {
      this.value = var3;
   }

   public static PhysData$PbUserTypicalDay$TypicalDay forNumber(int var0) {
      PhysData$PbUserTypicalDay$TypicalDay var1;
      switch(var0) {
      case 1:
         var1 = MOSTLY_SITTING;
         break;
      case 2:
         var1 = MOSTLY_STANDING;
         break;
      case 3:
         var1 = MOSTLY_MOVING;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PhysData$PbUserTypicalDay.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PhysData$PbUserTypicalDay$TypicalDay valueOf(int var0) {
      return forNumber(var0);
   }

   public static PhysData$PbUserTypicalDay$TypicalDay valueOf(EnumValueDescriptor var0) {
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
