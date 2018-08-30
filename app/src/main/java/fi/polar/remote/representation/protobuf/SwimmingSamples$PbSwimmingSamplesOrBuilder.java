package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface SwimmingSamples$PbSwimmingSamplesOrBuilder extends MessageOrBuilder {
   SwimmingSamples$PbSwimmingPoolMetric getPoolMetric(int var1);

   int getPoolMetricCount();

   List getPoolMetricList();

   SwimmingSamples$PbSwimmingPoolMetricOrBuilder getPoolMetricOrBuilder(int var1);

   List getPoolMetricOrBuilderList();

   Types$PbLocalDateTime getStart();

   Types$PbLocalDateTimeOrBuilder getStartOrBuilder();

   boolean hasStart();
}
