package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbStrideSensorCalibSettingsOrBuilder extends MessageOrBuilder {
   Types$PbStrideSensorCalibSettings$PbStrideCalibType getCalibType();

   float getRunningFactor();

   Types$PbStrideSensorCalibSettings$PbRunningFactorSource getRunningFactorSource();

   boolean hasCalibType();

   boolean hasRunningFactor();

   boolean hasRunningFactorSource();
}
