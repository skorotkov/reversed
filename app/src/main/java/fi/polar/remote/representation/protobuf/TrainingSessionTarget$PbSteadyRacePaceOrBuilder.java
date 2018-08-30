package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface TrainingSessionTarget$PbSteadyRacePaceOrBuilder extends MessageOrBuilder {
   float getDistance();

   Types$PbDuration getDuration();

   Types$PbDurationOrBuilder getDurationOrBuilder();

   boolean hasDistance();

   boolean hasDuration();
}
