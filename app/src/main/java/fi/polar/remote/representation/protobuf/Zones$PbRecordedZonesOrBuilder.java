package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface Zones$PbRecordedZonesOrBuilder extends MessageOrBuilder {
   Zones$PbRecordedFatFitZones getFatfitZones();

   Zones$PbRecordedFatFitZonesOrBuilder getFatfitZonesOrBuilder();

   Types$PbHeartRateZoneSettingSource getHeartRateSettingSource();

   Zones$PbRecordedHeartRateZone getHeartRateZone(int var1);

   int getHeartRateZoneCount();

   List getHeartRateZoneList();

   Zones$PbRecordedHeartRateZoneOrBuilder getHeartRateZoneOrBuilder(int var1);

   List getHeartRateZoneOrBuilderList();

   Types$PbPowerZoneSettingSource getPowerSettingSource();

   Zones$PbRecordedPowerZone getPowerZone(int var1);

   int getPowerZoneCount();

   List getPowerZoneList();

   Zones$PbRecordedPowerZoneOrBuilder getPowerZoneOrBuilder(int var1);

   List getPowerZoneOrBuilderList();

   Types$PbSpeedZoneSettingSource getSpeedSettingSource();

   Zones$PbRecordedSpeedZone getSpeedZone(int var1);

   int getSpeedZoneCount();

   List getSpeedZoneList();

   Zones$PbRecordedSpeedZoneOrBuilder getSpeedZoneOrBuilder(int var1);

   List getSpeedZoneOrBuilderList();

   boolean hasFatfitZones();

   boolean hasHeartRateSettingSource();

   boolean hasPowerSettingSource();

   boolean hasSpeedSettingSource();
}
