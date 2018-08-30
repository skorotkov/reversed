package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface TrainingSession$PbTrainingSessionOrBuilder extends MessageOrBuilder {
   Types$PbExerciseFeedback getBenefit();

   int getCalories();

   String getDeviceId();

   ByteString getDeviceIdBytes();

   float getDistance();

   Types$PbDuration getDuration();

   Types$PbDurationOrBuilder getDurationOrBuilder();

   Types$PbLocalDateTime getEnd();

   Types$PbLocalDateTimeOrBuilder getEndOrBuilder();

   int getExerciseCount();

   float getFeeling();

   TrainingSession$PbSessionHeartRateStatistics getHeartRate();

   TrainingSession$PbSessionHeartRateStatisticsOrBuilder getHeartRateOrBuilder();

   Types$PbDuration getHeartRateZoneDuration(int var1);

   int getHeartRateZoneDurationCount();

   List getHeartRateZoneDurationList();

   Types$PbDurationOrBuilder getHeartRateZoneDurationOrBuilder(int var1);

   List getHeartRateZoneDurationOrBuilderList();

   double getLatitude();

   double getLongitude();

   String getModelName();

   ByteString getModelNameBytes();

   Structures$PbMultiLineText getNote();

   Structures$PbMultiLineTextOrBuilder getNoteOrBuilder();

   Structures$PbOneLineText getPlace();

   Structures$PbOneLineTextOrBuilder getPlaceOrBuilder();

   Structures$PbOneLineText getSessionName();

   Structures$PbOneLineTextOrBuilder getSessionNameOrBuilder();

   Structures$PbSportIdentifier getSport();

   Structures$PbSportIdentifierOrBuilder getSportOrBuilder();

   Types$PbLocalDateTime getStart();

   Types$PbLocalDateTimeOrBuilder getStartOrBuilder();

   Structures$PbTrainingLoad getTrainingLoad();

   Structures$PbTrainingLoadOrBuilder getTrainingLoadOrBuilder();

   Structures$PbTrainingSessionFavoriteId getTrainingSessionFavoriteId();

   Structures$PbTrainingSessionFavoriteIdOrBuilder getTrainingSessionFavoriteIdOrBuilder();

   Structures$PbTrainingSessionTargetId getTrainingSessionTargetId();

   Structures$PbTrainingSessionTargetIdOrBuilder getTrainingSessionTargetIdOrBuilder();

   boolean hasBenefit();

   boolean hasCalories();

   boolean hasDeviceId();

   boolean hasDistance();

   boolean hasDuration();

   boolean hasEnd();

   boolean hasExerciseCount();

   boolean hasFeeling();

   boolean hasHeartRate();

   boolean hasLatitude();

   boolean hasLongitude();

   boolean hasModelName();

   boolean hasNote();

   boolean hasPlace();

   boolean hasSessionName();

   boolean hasSport();

   boolean hasStart();

   boolean hasTrainingLoad();

   boolean hasTrainingSessionFavoriteId();

   boolean hasTrainingSessionTargetId();
}
