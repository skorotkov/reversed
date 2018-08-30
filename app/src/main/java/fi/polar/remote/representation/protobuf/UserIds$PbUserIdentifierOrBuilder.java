package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface UserIds$PbUserIdentifierOrBuilder extends MessageOrBuilder {
   String getEmail();

   ByteString getEmailBytes();

   String getFirstName();

   ByteString getFirstNameBytes();

   String getLastName();

   ByteString getLastNameBytes();

   long getMasterIdentifier();

   String getNickname();

   ByteString getNicknameBytes();

   UserIds$PbPasswordToken getPasswordToken();

   UserIds$PbPasswordTokenOrBuilder getPasswordTokenOrBuilder();

   Types$PbSystemDateTime getUserIdLastModified();

   Types$PbSystemDateTimeOrBuilder getUserIdLastModifiedOrBuilder();

   boolean hasEmail();

   boolean hasFirstName();

   boolean hasLastName();

   boolean hasMasterIdentifier();

   boolean hasNickname();

   boolean hasPasswordToken();

   boolean hasUserIdLastModified();
}
