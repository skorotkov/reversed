package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Preferences$PbGeneralPreferencesOrBuilder extends MessageOrBuilder {
   Preferences$PbActivityGoalPreferences getActivityGoalPreferences();

   Preferences$PbActivityGoalPreferencesOrBuilder getActivityGoalPreferencesOrBuilder();

   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   Preferences$PbLocalizationPreferences getLocalizationPreferences();

   Preferences$PbLocalizationPreferencesOrBuilder getLocalizationPreferencesOrBuilder();

   Preferences$PbTrainingPreferences getTrainingPreferences();

   Preferences$PbTrainingPreferencesOrBuilder getTrainingPreferencesOrBuilder();

   boolean hasActivityGoalPreferences();

   boolean hasLastModified();

   boolean hasLocalizationPreferences();

   boolean hasTrainingPreferences();
}
