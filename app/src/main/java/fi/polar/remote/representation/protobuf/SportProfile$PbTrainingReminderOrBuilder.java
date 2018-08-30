package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SportProfile$PbTrainingReminderOrBuilder extends MessageOrBuilder {
   int getCalorieReminderValue();

   float getDistanceReminderValue();

   Structures$PbOneLineText getReminderText();

   Structures$PbOneLineTextOrBuilder getReminderTextOrBuilder();

   SportProfile$PbTrainingReminder$PbTrainingReminderType getReminderType();

   Types$PbDuration getTimeReminderValue();

   Types$PbDurationOrBuilder getTimeReminderValueOrBuilder();

   boolean hasCalorieReminderValue();

   boolean hasDistanceReminderValue();

   boolean hasReminderText();

   boolean hasReminderType();

   boolean hasTimeReminderValue();
}
