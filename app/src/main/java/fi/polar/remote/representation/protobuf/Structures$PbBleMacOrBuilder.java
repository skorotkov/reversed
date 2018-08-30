package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface Structures$PbBleMacOrBuilder extends MessageOrBuilder {
   ByteString getMac();

   Types$PbMacType getType();

   boolean hasMac();

   boolean hasType();
}
