package fi.polar.remote.representation.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

final class TrainingSession$PbSessionHeartRateStatistics$1 extends AbstractParser {
   public TrainingSession$PbSessionHeartRateStatistics parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      return new TrainingSession$PbSessionHeartRateStatistics(var1, var2, (TrainingSession$1)null);
   }
}
