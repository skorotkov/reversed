package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SportprofileAvalonSettings$PbAvalonSportProfileSettingsOrBuilder extends MessageOrBuilder {
   boolean getAutoStart();

   Types$PbAutoLapSettings getAutolapSettings();

   Types$PbAutoLapSettingsOrBuilder getAutolapSettingsOrBuilder();

   Types$PbHeartRateView getHeartRateView();

   Types$PbHeartTouch getHeartTouch();

   boolean getVibration();

   boolean hasAutoStart();

   boolean hasAutolapSettings();

   boolean hasHeartRateView();

   boolean hasHeartTouch();

   boolean hasVibration();
}
