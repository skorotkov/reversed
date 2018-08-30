package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface Structures$PbZonesOrBuilder extends MessageOrBuilder {
   Types$PbHeartRateZoneSettingSource getHeartRateSettingSource();

   Structures$PbHeartRateZone getHeartRateZone(int var1);

   int getHeartRateZoneCount();

   List getHeartRateZoneList();

   Structures$PbHeartRateZoneOrBuilder getHeartRateZoneOrBuilder(int var1);

   List getHeartRateZoneOrBuilderList();

   Types$PbPowerZoneSettingSource getPowerSettingSource();

   Structures$PbPowerZone getPowerZone(int var1);

   int getPowerZoneCount();

   List getPowerZoneList();

   Structures$PbPowerZoneOrBuilder getPowerZoneOrBuilder(int var1);

   List getPowerZoneOrBuilderList();

   Types$PbSpeedZoneSettingSource getSpeedSettingSource();

   Structures$PbSpeedZone getSpeedZone(int var1);

   int getSpeedZoneCount();

   List getSpeedZoneList();

   Structures$PbSpeedZoneOrBuilder getSpeedZoneOrBuilder(int var1);

   List getSpeedZoneOrBuilderList();

   boolean hasHeartRateSettingSource();

   boolean hasPowerSettingSource();

   boolean hasSpeedSettingSource();
}
