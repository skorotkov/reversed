package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface Structures$PbBleServiceOrBuilder extends MessageOrBuilder {
   Structures$PbBleCharacteristic getCharacteristics(int var1);

   int getCharacteristicsCount();

   List getCharacteristicsList();

   Structures$PbBleCharacteristicOrBuilder getCharacteristicsOrBuilder(int var1);

   List getCharacteristicsOrBuilderList();

   Structures$PbBleUuid getServiceUuid();

   Structures$PbBleUuidOrBuilder getServiceUuidOrBuilder();

   boolean hasServiceUuid();
}
