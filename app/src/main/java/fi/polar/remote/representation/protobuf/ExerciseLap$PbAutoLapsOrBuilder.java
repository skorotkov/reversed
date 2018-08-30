package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ExerciseLap$PbAutoLapsOrBuilder extends MessageOrBuilder {
   ExerciseLap$PbLap getAutoLaps(int var1);

   int getAutoLapsCount();

   List getAutoLapsList();

   ExerciseLap$PbLapOrBuilder getAutoLapsOrBuilder(int var1);

   List getAutoLapsOrBuilderList();

   ExerciseLap$PbLapSummary getSummary();

   ExerciseLap$PbLapSummaryOrBuilder getSummaryOrBuilder();

   boolean hasSummary();
}
