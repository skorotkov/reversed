package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum SportProfile$PbTrainingReminder$PbTrainingReminderType implements ProtocolMessageEnum {
   TRAINING_REMINDER_CALORIES_BASED(2);

   public static final int TRAINING_REMINDER_CALORIES_BASED_VALUE = 2;
   TRAINING_REMINDER_DISTANCE_BASED(3);

   public static final int TRAINING_REMINDER_DISTANCE_BASED_VALUE = 3;
   TRAINING_REMINDER_OFF(1);

   public static final int TRAINING_REMINDER_OFF_VALUE = 1;
   TRAINING_REMINDER_TIME_BASED(4);

   public static final int TRAINING_REMINDER_TIME_BASED_VALUE = 4;
   private static final SportProfile$PbTrainingReminder$PbTrainingReminderType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new SportProfile$PbTrainingReminder$PbTrainingReminderType$1();
   private final int value;

   private SportProfile$PbTrainingReminder$PbTrainingReminderType(int var3) {
      this.value = var3;
   }

   public static SportProfile$PbTrainingReminder$PbTrainingReminderType forNumber(int var0) {
      SportProfile$PbTrainingReminder$PbTrainingReminderType var1;
      switch(var0) {
      case 1:
         var1 = TRAINING_REMINDER_OFF;
         break;
      case 2:
         var1 = TRAINING_REMINDER_CALORIES_BASED;
         break;
      case 3:
         var1 = TRAINING_REMINDER_DISTANCE_BASED;
         break;
      case 4:
         var1 = TRAINING_REMINDER_TIME_BASED;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)SportProfile$PbTrainingReminder.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static SportProfile$PbTrainingReminder$PbTrainingReminderType valueOf(int var0) {
      return forNumber(var0);
   }

   public static SportProfile$PbTrainingReminder$PbTrainingReminderType valueOf(EnumValueDescriptor var0) {
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
