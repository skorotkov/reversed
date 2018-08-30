package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ExerciseRRSamples$PbExerciseRRIntervalsOrBuilder extends MessageOrBuilder {
   int getRrIntervals(int var1);

   int getRrIntervalsCount();

   List getRrIntervalsList();

   ExerciseRRSamples$PbRROffline getRrSensorOffline(int var1);

   int getRrSensorOfflineCount();

   List getRrSensorOfflineList();

   ExerciseRRSamples$PbRROfflineOrBuilder getRrSensorOfflineOrBuilder(int var1);

   List getRrSensorOfflineOrBuilderList();
}
