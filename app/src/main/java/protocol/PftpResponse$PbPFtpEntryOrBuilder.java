package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import fi.polar.remote.representation.protobuf.Types$PbSystemDateTime;
import fi.polar.remote.representation.protobuf.Types$PbSystemDateTimeOrBuilder;

public interface PftpResponse$PbPFtpEntryOrBuilder extends MessageOrBuilder {
   Types$PbSystemDateTime getCreated();

   Types$PbSystemDateTimeOrBuilder getCreatedOrBuilder();

   Types$PbSystemDateTime getModified();

   Types$PbSystemDateTimeOrBuilder getModifiedOrBuilder();

   String getName();

   ByteString getNameBytes();

   long getSize();

   Types$PbSystemDateTime getTouched();

   Types$PbSystemDateTimeOrBuilder getTouchedOrBuilder();

   boolean hasCreated();

   boolean hasModified();

   boolean hasName();

   boolean hasSize();

   boolean hasTouched();
}
