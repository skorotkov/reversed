package protocol;

import com.google.protobuf.MessageOrBuilder;

public interface PftpResponse$PbPFtpDiskSpaceResultOrBuilder extends MessageOrBuilder {
   int getFragmentSize();

   long getFreeFragments();

   long getTotalFragments();

   boolean hasFragmentSize();

   boolean hasFreeFragments();

   boolean hasTotalFragments();
}
