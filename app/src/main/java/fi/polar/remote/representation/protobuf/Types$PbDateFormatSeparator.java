package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbDateFormatSeparator implements ProtocolMessageEnum {
   DOT(1);

   public static final int DOT_VALUE = 1;
   HYPHEN(3);

   public static final int HYPHEN_VALUE = 3;
   SLASH(2);

   public static final int SLASH_VALUE = 2;
   private static final Types$PbDateFormatSeparator[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbDateFormatSeparator$1();
   private final int value;

   private Types$PbDateFormatSeparator(int var3) {
      this.value = var3;
   }

   public static Types$PbDateFormatSeparator forNumber(int var0) {
      Types$PbDateFormatSeparator var1;
      switch(var0) {
      case 1:
         var1 = DOT;
         break;
      case 2:
         var1 = SLASH;
         break;
      case 3:
         var1 = HYPHEN;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(7);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbDateFormatSeparator valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbDateFormatSeparator valueOf(EnumValueDescriptor var0) {
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
