package protocol;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

final class PftpResponse$PbPFtpEntry$1 extends AbstractParser {
   public PftpResponse$PbPFtpEntry parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      return new PftpResponse$PbPFtpEntry(var1, var2, (PftpResponse$1)null);
   }
}
