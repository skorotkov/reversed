package com.polar.pftp.jni;

public interface PftpDeviceCallbacks extends PftpCommonCallbacks {
   byte[] deviceProcessQueryRequest(int[] var1, int var2, byte[] var3);

   byte[] deviceProcessReadRequest(int[] var1, byte[] var2);

   int deviceProcessWriteRequest(byte[] var1);

   void deviceReadRequestCompleted(int var1);

   void deviceStreamFailure(int var1, boolean var2);

   byte[] deviceWaitForRequest(int[] var1);

   void deviceWriteRequestCompleted(int var1, byte[] var2, byte[] var3);
}
