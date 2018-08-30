package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Structures$PbBleCharacteristicOrBuilder extends MessageOrBuilder {
   int getHandle();

   Structures$PbBleUuid getType();

   Structures$PbBleUuidOrBuilder getTypeOrBuilder();

   boolean hasHandle();

   boolean hasType();
}
