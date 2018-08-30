package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseLap$PbLapHeaderOrBuilder extends MessageOrBuilder {
   float getAscent();

   ExerciseLap$PbLapHeader$PbAutolapType getAutolapType();

   float getDescent();

   float getDistance();

   Types$PbDuration getDuration();

   Types$PbDurationOrBuilder getDurationOrBuilder();

   Types$PbDuration getSplitTime();

   Types$PbDurationOrBuilder getSplitTimeOrBuilder();

   boolean hasAscent();

   boolean hasAutolapType();

   boolean hasDescent();

   boolean hasDistance();

   boolean hasDuration();

   boolean hasSplitTime();
}
