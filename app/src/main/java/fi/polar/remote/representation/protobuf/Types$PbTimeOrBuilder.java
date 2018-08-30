package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbTimeOrBuilder extends MessageOrBuilder {
   int getHour();

   int getMillis();

   int getMinute();

   int getSeconds();

   boolean hasHour();

   boolean hasMillis();

   boolean hasMinute();

   boolean hasSeconds();
}
