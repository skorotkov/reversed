package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SportprofileVectraSettings$PbVectraSportProfileSettingsOrBuilder extends MessageOrBuilder {
   Types$PbGPSSetting getGpsSetting();

   Types$PbHeartRateView getHeartRateView();

   boolean getVibration();

   boolean hasGpsSetting();

   boolean hasHeartRateView();

   boolean hasVibration();
}
