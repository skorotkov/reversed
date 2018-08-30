package protocol;

import com.google.protobuf.MessageOrBuilder;
import fi.polar.remote.representation.protobuf.Types$ButtonState;
import fi.polar.remote.representation.protobuf.Types$Buttons;

public interface PftpNotification$PbPFtpSimulateButtonPressParamsOrBuilder extends MessageOrBuilder {
   Types$Buttons getButton();

   Types$ButtonState getState();

   boolean hasButton();

   boolean hasState();
}
