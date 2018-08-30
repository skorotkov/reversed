package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface UserIds$PbPasswordTokenOrBuilder extends MessageOrBuilder {
   boolean getEncrypted();

   ByteString getToken();

   boolean hasEncrypted();

   boolean hasToken();
}
