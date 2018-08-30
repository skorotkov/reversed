package protocol;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

final class PftpRequest$PbPFtpOperation$1 extends AbstractParser {
   public PftpRequest$PbPFtpOperation parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      return new PftpRequest$PbPFtpOperation(var1, var2, (PftpRequest$1)null);
   }
}
