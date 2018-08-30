package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Preferences$PbLocalizationPreferencesOrBuilder extends MessageOrBuilder {
   Types$PbDateFormat getDateFormat();

   Types$PbDateFormatSeparator getDateFormatSeparator();

   Types$PbStartDayOfWeek getFirstdayOfWeek();

   Structures$PbLanguageId getLanguage();

   Structures$PbLanguageIdOrBuilder getLanguageOrBuilder();

   Types$PbTimeFormat getTimeFormat();

   Types$PbTimeFormatSeparator getTimeFormatSeparator();

   Types$PbUnitSystem getUnitSystem();

   boolean hasDateFormat();

   boolean hasDateFormatSeparator();

   boolean hasFirstdayOfWeek();

   boolean hasLanguage();

   boolean hasTimeFormat();

   boolean hasTimeFormatSeparator();

   boolean hasUnitSystem();
}
