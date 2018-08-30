package protocol;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface PftpResponse$PbPFtpDirectoryOrBuilder extends MessageOrBuilder {
   PftpResponse$PbPFtpEntry getEntries(int var1);

   int getEntriesCount();

   List getEntriesList();

   PftpResponse$PbPFtpEntryOrBuilder getEntriesOrBuilder(int var1);

   List getEntriesOrBuilderList();
}
