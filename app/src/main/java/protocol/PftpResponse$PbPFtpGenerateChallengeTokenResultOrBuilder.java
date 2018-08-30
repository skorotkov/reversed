package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PftpResponse$PbPFtpGenerateChallengeTokenResultOrBuilder extends MessageOrBuilder {
   ByteString getToken();

   boolean hasToken();
}
