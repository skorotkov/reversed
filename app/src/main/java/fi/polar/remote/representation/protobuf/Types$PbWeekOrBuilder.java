package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbWeekOrBuilder extends MessageOrBuilder {
   int getTimeZoneOffset();

   int getWeekNumberISO8601();

   Types$PbStartDayOfWeek getWeekStartDay();

   int getYear();

   boolean hasTimeZoneOffset();

   boolean hasWeekNumberISO8601();

   boolean hasWeekStartDay();

   boolean hasYear();
}
