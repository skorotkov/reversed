package protocol;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

final class PftpNotification$PbPFtpInactivityAlert$1 extends AbstractParser {
   public PftpNotification$PbPFtpInactivityAlert parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      return new PftpNotification$PbPFtpInactivityAlert(var1, var2, (PftpNotification$1)null);
   }
}