package protocol;

import com.google.protobuf.MessageOrBuilder;

public interface PftpNotification$PbPFtpSimulateTouchScreenParamsOrBuilder extends MessageOrBuilder {
   PftpNotification$PbPFtpSimulateTouchScreenParams$PbPFtpTouchState getState();

   PftpNotification$PbPFtpTouchPosition getXPos();

   PftpNotification$PbPFtpTouchPositionOrBuilder getXPosOrBuilder();

   PftpNotification$PbPFtpTouchPosition getYPos();

   PftpNotification$PbPFtpTouchPositionOrBuilder getYPosOrBuilder();

   boolean hasState();

   boolean hasXPos();

   boolean hasYPos();
}
