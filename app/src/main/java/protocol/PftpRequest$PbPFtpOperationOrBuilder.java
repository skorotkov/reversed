package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PftpRequest$PbPFtpOperationOrBuilder extends MessageOrBuilder {
   PftpRequest$PbPFtpOperation$Command getCommand();

   String getPath();

   ByteString getPathBytes();

   boolean hasCommand();

   boolean hasPath();
}
