package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PftpRequest$PbPFtpGenerateChallengeTokenParamsOrBuilder extends MessageOrBuilder {
   ByteString getNonse();

   int getUserId();

   boolean hasNonse();

   boolean hasUserId();
}
