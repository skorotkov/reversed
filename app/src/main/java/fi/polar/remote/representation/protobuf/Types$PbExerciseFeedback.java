package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbExerciseFeedback implements ProtocolMessageEnum {
   FEEDBACK_1(2),
   FEEDBACK_10(11);

   public static final int FEEDBACK_10_VALUE = 11;
   FEEDBACK_11(12);

   public static final int FEEDBACK_11_VALUE = 12;
   FEEDBACK_12(13);

   public static final int FEEDBACK_12_VALUE = 13;
   FEEDBACK_13(14);

   public static final int FEEDBACK_13_VALUE = 14;
   FEEDBACK_14(15);

   public static final int FEEDBACK_14_VALUE = 15;
   FEEDBACK_15(16);

   public static final int FEEDBACK_15_VALUE = 16;
   FEEDBACK_16(17);

   public static final int FEEDBACK_16_VALUE = 17;
   FEEDBACK_17(18);

   public static final int FEEDBACK_17_VALUE = 18;
   public static final int FEEDBACK_1_VALUE = 2;
   FEEDBACK_2(3);

   public static final int FEEDBACK_2_VALUE = 3;
   FEEDBACK_3(4);

   public static final int FEEDBACK_3_VALUE = 4;
   FEEDBACK_4(5);

   public static final int FEEDBACK_4_VALUE = 5;
   FEEDBACK_5(6);

   public static final int FEEDBACK_5_VALUE = 6;
   FEEDBACK_6(7);

   public static final int FEEDBACK_6_VALUE = 7;
   FEEDBACK_7(8);

   public static final int FEEDBACK_7_VALUE = 8;
   FEEDBACK_8(9);

   public static final int FEEDBACK_8_VALUE = 9;
   FEEDBACK_9(10);

   public static final int FEEDBACK_9_VALUE = 10;
   FEEDBACK_NONE(1);

   public static final int FEEDBACK_NONE_VALUE = 1;
   private static final Types$PbExerciseFeedback[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbExerciseFeedback$1();
   private final int value;

   private Types$PbExerciseFeedback(int var3) {
      this.value = var3;
   }

   public static Types$PbExerciseFeedback forNumber(int var0) {
      Types$PbExerciseFeedback var1;
      switch(var0) {
      case 1:
         var1 = FEEDBACK_NONE;
         break;
      case 2:
         var1 = FEEDBACK_1;
         break;
      case 3:
         var1 = FEEDBACK_2;
         break;
      case 4:
         var1 = FEEDBACK_3;
         break;
      case 5:
         var1 = FEEDBACK_4;
         break;
      case 6:
         var1 = FEEDBACK_5;
         break;
      case 7:
         var1 = FEEDBACK_6;
         break;
      case 8:
         var1 = FEEDBACK_7;
         break;
      case 9:
         var1 = FEEDBACK_8;
         break;
      case 10:
         var1 = FEEDBACK_9;
         break;
      case 11:
         var1 = FEEDBACK_10;
         break;
      case 12:
         var1 = FEEDBACK_11;
         break;
      case 13:
         var1 = FEEDBACK_12;
         break;
      case 14:
         var1 = FEEDBACK_13;
         break;
      case 15:
         var1 = FEEDBACK_14;
         break;
      case 16:
         var1 = FEEDBACK_15;
         break;
      case 17:
         var1 = FEEDBACK_16;
         break;
      case 18:
         var1 = FEEDBACK_17;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(12);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbExerciseFeedback valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbExerciseFeedback valueOf(EnumValueDescriptor var0) {
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
