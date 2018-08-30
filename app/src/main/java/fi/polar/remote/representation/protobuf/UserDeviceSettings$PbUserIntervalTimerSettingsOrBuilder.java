package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface UserDeviceSettings$PbUserIntervalTimerSettingsOrBuilder extends MessageOrBuilder {
   UserDeviceSettings$PbIntervalTimerValue getIntervalTimerValue(int var1);

   int getIntervalTimerValueCount();

   List getIntervalTimerValueList();

   UserDeviceSettings$PbIntervalTimerValueOrBuilder getIntervalTimerValueOrBuilder(int var1);

   List getIntervalTimerValueOrBuilderList();
}
