package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface Device$PbDeviceInfoOrBuilder extends MessageOrBuilder {
   Structures$PbVersion getBootloaderVersion();

   Structures$PbVersionOrBuilder getBootloaderVersionOrBuilder();

   String getDeviceID();

   ByteString getDeviceIDBytes();

   Structures$PbVersion getDeviceVersion();

   Structures$PbVersionOrBuilder getDeviceVersionOrBuilder();

   String getElectricalSerialNumber();

   ByteString getElectricalSerialNumberBytes();

   ByteString getGitHash();

   String getHardwareCode();

   ByteString getHardwareCodeBytes();

   String getModelName();

   ByteString getModelNameBytes();

   Structures$PbVersion getPlatformVersion();

   Structures$PbVersionOrBuilder getPlatformVersionOrBuilder();

   Structures$PbVersion getPolarmathsmartVersion();

   Structures$PbVersionOrBuilder getPolarmathsmartVersionOrBuilder();

   String getProductColor();

   ByteString getProductColorBytes();

   String getProductDesign();

   ByteString getProductDesignBytes();

   Structures$PbSubcomponentInfo getSubComponentInfo(int var1);

   int getSubComponentInfoCount();

   List getSubComponentInfoList();

   Structures$PbSubcomponentInfoOrBuilder getSubComponentInfoOrBuilder(int var1);

   List getSubComponentInfoOrBuilderList();

   int getSvnRev();

   String getSystemId();

   ByteString getSystemIdBytes();

   boolean hasBootloaderVersion();

   boolean hasDeviceID();

   boolean hasDeviceVersion();

   boolean hasElectricalSerialNumber();

   boolean hasGitHash();

   boolean hasHardwareCode();

   boolean hasModelName();

   boolean hasPlatformVersion();

   boolean hasPolarmathsmartVersion();

   boolean hasProductColor();

   boolean hasProductDesign();

   boolean hasSvnRev();

   boolean hasSystemId();
}
