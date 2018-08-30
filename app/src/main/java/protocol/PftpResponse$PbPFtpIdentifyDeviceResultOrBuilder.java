package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PftpResponse$PbPFtpIdentifyDeviceResultOrBuilder extends MessageOrBuilder {
   String getDeviceId();

   ByteString getDeviceIdBytes();

   boolean hasDeviceId();
}
