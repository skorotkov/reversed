package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Preferences$PbTrainingPreferencesOrBuilder extends MessageOrBuilder {
   Types$PbHeartRateView getHeartRateView();

   int getOBSOLETEHeartRateZoneLock();

   boolean hasHeartRateView();

   boolean hasOBSOLETEHeartRateZoneLock();
}
