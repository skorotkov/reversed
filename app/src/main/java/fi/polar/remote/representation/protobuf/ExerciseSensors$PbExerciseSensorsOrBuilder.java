package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ExerciseSensors$PbExerciseSensorsOrBuilder extends MessageOrBuilder {
   ExerciseSensors$PbExerciseSensor getSensors(int var1);

   int getSensorsCount();

   List getSensorsList();

   ExerciseSensors$PbExerciseSensorOrBuilder getSensorsOrBuilder(int var1);

   List getSensorsOrBuilderList();
}
