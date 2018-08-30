package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbDurationOrBuilder extends MessageOrBuilder {
   int getHours();

   int getMillis();

   int getMinutes();

   int getSeconds();

   boolean hasHours();

   boolean hasMillis();

   boolean hasMinutes();

   boolean hasSeconds();
}
