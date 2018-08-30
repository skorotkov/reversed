package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbSampleSourceOrBuilder extends MessageOrBuilder {
   Types$PbSampleSourceType getSampleSourceType();

   int getStartIndex();

   int getStopIndex();

   boolean hasSampleSourceType();

   boolean hasStartIndex();

   boolean hasStopIndex();
}
