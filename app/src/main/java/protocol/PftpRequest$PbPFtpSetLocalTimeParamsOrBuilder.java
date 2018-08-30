package protocol;

import com.google.protobuf.MessageOrBuilder;
import fi.polar.remote.representation.protobuf.Types$PbDate;
import fi.polar.remote.representation.protobuf.Types$PbDateOrBuilder;
import fi.polar.remote.representation.protobuf.Types$PbTime;
import fi.polar.remote.representation.protobuf.Types$PbTimeOrBuilder;

public interface PftpRequest$PbPFtpSetLocalTimeParamsOrBuilder extends MessageOrBuilder {
   Types$PbDate getDate();

   Types$PbDateOrBuilder getDateOrBuilder();

   Types$PbTime getTime();

   Types$PbTimeOrBuilder getTimeOrBuilder();

   int getTzOffset();

   boolean hasDate();

   boolean hasTime();

   boolean hasTzOffset();
}
