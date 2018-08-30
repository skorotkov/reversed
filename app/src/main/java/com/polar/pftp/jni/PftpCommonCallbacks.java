package com.polar.pftp.jni;

public interface PftpCommonCallbacks {
   void notificationParserMethod(int var1, byte[] var2);

   byte[] readNotificationPacket(int[] var1, int var2);

   byte[] readPacket(int[] var1, int var2);

   void sendProgress(byte[] var1, long var2, long var4);

   int writeNotificationPacket(byte[] var1, int var2);

   int writePacket(byte[] var1, int var2);
}
