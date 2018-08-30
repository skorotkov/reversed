package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface Sport$PbSportOrBuilder extends MessageOrBuilder {
   Types$PbAccelerationMetrics getAccelerationMetrics(int var1);

   int getAccelerationMetricsCount();

   List getAccelerationMetricsList();

   Types$PbAccelerationMetricsOrBuilder getAccelerationMetricsOrBuilder(int var1);

   List getAccelerationMetricsOrBuilderList();

   Types$PbSystemDateTime getCreated();

   Types$PbSystemDateTimeOrBuilder getCreatedOrBuilder();

   float getFactor();

   Structures$PbSportIdentifier getIdentifier();

   Structures$PbSportIdentifierOrBuilder getIdentifierOrBuilder();

   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   Structures$PbSportIdentifier getParentIdentifier();

   Structures$PbSportIdentifierOrBuilder getParentIdentifierOrBuilder();

   boolean getRunningMetricMeasurementsSupported();

   boolean getSpeedZonesEnabled();

   Sport$PbSport$PbSportType getSportType();

   Structures$PbSportIdentifier getStages(int var1);

   int getStagesCount();

   List getStagesList();

   Structures$PbSportIdentifierOrBuilder getStagesOrBuilder(int var1);

   List getStagesOrBuilderList();

   Sport$PbSportTranslation getTranslation(int var1);

   int getTranslationCount();

   List getTranslationList();

   Sport$PbSportTranslationOrBuilder getTranslationOrBuilder(int var1);

   List getTranslationOrBuilderList();

   boolean hasCreated();

   boolean hasFactor();

   boolean hasIdentifier();

   boolean hasLastModified();

   boolean hasParentIdentifier();

   boolean hasRunningMetricMeasurementsSupported();

   boolean hasSpeedZonesEnabled();

   boolean hasSportType();
}
