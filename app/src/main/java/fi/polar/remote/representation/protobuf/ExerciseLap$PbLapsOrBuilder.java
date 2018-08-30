package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ExerciseLap$PbLapsOrBuilder extends MessageOrBuilder {
   ExerciseLap$PbLap getLaps(int var1);

   int getLapsCount();

   List getLapsList();

   ExerciseLap$PbLapOrBuilder getLapsOrBuilder(int var1);

   List getLapsOrBuilderList();

   ExerciseLap$PbLapSummary getSummary();

   ExerciseLap$PbLapSummaryOrBuilder getSummaryOrBuilder();

   boolean hasSummary();
}
