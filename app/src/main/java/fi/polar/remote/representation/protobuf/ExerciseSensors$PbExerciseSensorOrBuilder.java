package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseSensors$PbExerciseSensorOrBuilder extends MessageOrBuilder {
   Structures$PbDeviceId getDeviceId();

   Structures$PbDeviceIdOrBuilder getDeviceIdOrBuilder();

   Structures$PbBleDeviceName getDeviceName();

   Structures$PbBleDeviceNameOrBuilder getDeviceNameOrBuilder();

   Structures$PbBleMac getMac();

   Structures$PbBleMacOrBuilder getMacOrBuilder();

   boolean hasDeviceId();

   boolean hasDeviceName();

   boolean hasMac();
}
