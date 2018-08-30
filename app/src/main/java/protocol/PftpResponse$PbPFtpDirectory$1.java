package protocol;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

final class PftpResponse$PbPFtpDirectory$1 extends AbstractParser {
   public PftpResponse$PbPFtpDirectory parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      return new PftpResponse$PbPFtpDirectory(var1, var2, (PftpResponse$1)null);
   }
}
