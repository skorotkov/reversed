package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface Structures$PbSubcomponentInfoOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();

   Structures$PbVersion getOBSOLETERequiredVersion();

   Structures$PbVersionOrBuilder getOBSOLETERequiredVersionOrBuilder();

   Structures$PbVersion getVersion();

   Structures$PbVersionOrBuilder getVersionOrBuilder();

   boolean hasName();

   boolean hasOBSOLETERequiredVersion();

   boolean hasVersion();
}
