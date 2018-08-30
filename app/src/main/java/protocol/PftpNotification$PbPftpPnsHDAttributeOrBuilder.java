package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PftpNotification$PbPftpPnsHDAttributeOrBuilder extends MessageOrBuilder {
   int getAttributeFullSize();

   String getData();

   ByteString getDataBytes();

   PftpNotification$PbPftpPnsHDAttributeType getType();

   boolean hasAttributeFullSize();

   boolean hasData();

   boolean hasType();
}
