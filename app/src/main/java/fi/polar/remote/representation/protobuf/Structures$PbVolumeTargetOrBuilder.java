package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Structures$PbVolumeTargetOrBuilder extends MessageOrBuilder {
   int getCalories();

   float getDistance();

   Types$PbDuration getDuration();

   Types$PbDurationOrBuilder getDurationOrBuilder();

   Structures$PbVolumeTarget$PbVolymeTargetType getTargetType();

   boolean hasCalories();

   boolean hasDistance();

   boolean hasDuration();

   boolean hasTargetType();
}
