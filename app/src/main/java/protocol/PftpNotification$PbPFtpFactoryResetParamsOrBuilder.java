package protocol;

import com.google.protobuf.MessageOrBuilder;

public interface PftpNotification$PbPFtpFactoryResetParamsOrBuilder extends MessageOrBuilder {
   boolean getDoFactoryDefaults();

   boolean getOtaFwupdate();

   boolean getSleep();

   boolean hasDoFactoryDefaults();

   boolean hasOtaFwupdate();

   boolean hasSleep();
}
