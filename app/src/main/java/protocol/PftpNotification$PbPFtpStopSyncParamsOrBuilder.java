package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PftpNotification$PbPFtpStopSyncParamsOrBuilder extends MessageOrBuilder {
   boolean getCompleted();

   String getDescription();

   ByteString getDescriptionBytes();

   boolean hasCompleted();

   boolean hasDescription();
}
