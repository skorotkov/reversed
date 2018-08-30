package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PftpNotification$PbPFtpFilesystemModifiedParamsOrBuilder extends MessageOrBuilder {
   PftpNotification$Action getAction();

   String getPath();

   ByteString getPathBytes();

   boolean hasAction();

   boolean hasPath();
}
