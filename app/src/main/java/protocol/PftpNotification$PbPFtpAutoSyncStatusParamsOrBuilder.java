package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PftpNotification$PbPFtpAutoSyncStatusParamsOrBuilder extends MessageOrBuilder {
   String getDescription();

   ByteString getDescriptionBytes();

   boolean getSucceeded();

   boolean hasDescription();

   boolean hasSucceeded();
}
