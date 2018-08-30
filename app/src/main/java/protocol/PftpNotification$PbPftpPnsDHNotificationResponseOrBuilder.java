package protocol;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface PftpNotification$PbPftpPnsDHNotificationResponseOrBuilder extends MessageOrBuilder {
   PftpNotification$PbPftpPnsDHAttribute getAttributes(int var1);

   int getAttributesCount();

   List getAttributesList();

   PftpNotification$PbPftpPnsDHAttributeOrBuilder getAttributesOrBuilder(int var1);

   List getAttributesOrBuilderList();

   int getNotificationId();

   boolean hasNotificationId();
}
