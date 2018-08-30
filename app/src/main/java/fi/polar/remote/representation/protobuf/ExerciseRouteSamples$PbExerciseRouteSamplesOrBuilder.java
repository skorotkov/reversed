package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ExerciseRouteSamples$PbExerciseRouteSamplesOrBuilder extends MessageOrBuilder {
   int getDuration(int var1);

   int getDurationCount();

   List getDurationList();

   Types$PbSystemDateTime getFirstLocationTime();

   Types$PbSystemDateTimeOrBuilder getFirstLocationTimeOrBuilder();

   int getGpsAltitude(int var1);

   int getGpsAltitudeCount();

   List getGpsAltitudeList();

   double getLatitude(int var1);

   int getLatitudeCount();

   List getLatitudeList();

   double getLongitude(int var1);

   int getLongitudeCount();

   List getLongitudeList();

   boolean getOBSOLETEFix(int var1);

   int getOBSOLETEFixCount();

   List getOBSOLETEFixList();

   Types$PbSystemDateTime getOBSOLETEGpsDateTime(int var1);

   int getOBSOLETEGpsDateTimeCount();

   List getOBSOLETEGpsDateTimeList();

   Types$PbSystemDateTimeOrBuilder getOBSOLETEGpsDateTimeOrBuilder(int var1);

   List getOBSOLETEGpsDateTimeOrBuilderList();

   Types$PbSensorOffline getOBSOLETEGpsOffline(int var1);

   int getOBSOLETEGpsOfflineCount();

   List getOBSOLETEGpsOfflineList();

   Types$PbSensorOfflineOrBuilder getOBSOLETEGpsOfflineOrBuilder(int var1);

   List getOBSOLETEGpsOfflineOrBuilderList();

   int getSatelliteAmount(int var1);

   int getSatelliteAmountCount();

   List getSatelliteAmountList();

   boolean hasFirstLocationTime();
}
