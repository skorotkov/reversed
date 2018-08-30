package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ExercisePhaseStats$PbPhaseRepetitionsOrBuilder extends MessageOrBuilder {
   ExercisePhaseStats$PbPhaseRepetition getPhase(int var1);

   int getPhaseCount();

   List getPhaseList();

   ExercisePhaseStats$PbPhaseRepetitionOrBuilder getPhaseOrBuilder(int var1);

   List getPhaseOrBuilderList();
}
