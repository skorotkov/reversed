package protocol;

import com.google.protobuf.MessageOrBuilder;
import fi.polar.remote.representation.protobuf.Types$PbLocalDateTime;
import fi.polar.remote.representation.protobuf.Types$PbLocalDateTimeOrBuilder;
import java.util.List;

public interface PftpNotification$PbPftpPnsHDNotificationOrBuilder extends MessageOrBuilder {
   PftpNotification$Action getAction();

   PftpNotification$PbPftpPnsHDAttribute getAttributes(int var1);

   int getAttributesCount();

   List getAttributesList();

   PftpNotification$PbPftpPnsHDAttributeOrBuilder getAttributesOrBuilder(int var1);

   List getAttributesOrBuilderList();

   PftpNotification$PbPftpPnsHDCategoryID getCategoryId();

   Types$PbLocalDateTime getIssueTime();

   Types$PbLocalDateTimeOrBuilder getIssueTimeOrBuilder();

   int getNewSameCategoryNotifications();

   int getNotificationId();

   int getUnreadSameCategoryNotifications();

   boolean hasAction();

   boolean hasCategoryId();

   boolean hasIssueTime();

   boolean hasNewSameCategoryNotifications();

   boolean hasNotificationId();

   boolean hasUnreadSameCategoryNotifications();
}
