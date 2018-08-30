package com.polar.pftp.jni;

import android.util.Log;

public class PftpJni {
   public static final String TAG = PftpJni.class.getSimpleName();
   private PftpDeviceCallbacks callbacks;
   private PftpCommonCallbacks hostCallbacks;

   static {
      System.loadLibrary("pftp");
   }

   public PftpJni(PftpCommonCallbacks var1) {
      this.hostCallbacks = var1;
   }

   public PftpJni(PftpDeviceCallbacks var1) {
      this.callbacks = var1;
   }

   private byte[] deviceProcessQueryRequest(int[] var1, int var2, byte[] var3) {
      byte[] var4;
      if (this.callbacks != null) {
         var4 = this.callbacks.deviceProcessQueryRequest(var1, var2, var3);
      } else {
         Log.e(TAG, "Received callback in non device role");
         var4 = new byte[0];
      }

      return var4;
   }

   private byte[] deviceProcessReadRequest(int[] var1, byte[] var2) {
      byte[] var3;
      if (this.callbacks != null) {
         var3 = this.callbacks.deviceProcessReadRequest(var1, var2);
      } else {
         Log.e(TAG, "Received callback in non device role");
         var3 = new byte[0];
      }

      return var3;
   }

   private int deviceProcessWriteRequest(byte[] var1) {
      int var2;
      if (this.callbacks != null) {
         var2 = this.callbacks.deviceProcessWriteRequest(var1);
      } else {
         Log.e(TAG, "Received callback in non device role");
         var2 = -1;
      }

      return var2;
   }

   private void deviceReadRequestCompleted(int var1) {
      if (this.callbacks != null) {
         this.callbacks.deviceReadRequestCompleted(var1);
      } else {
         Log.e(TAG, "Received callback in non device role");
      }

   }

   private void deviceStreamFailure(int var1, boolean var2) {
      if (this.callbacks != null) {
         this.callbacks.deviceStreamFailure(var1, var2);
      } else {
         Log.e(TAG, "Received callback in non device role");
      }

   }

   private byte[] deviceWaitForRequest(int[] var1) {
      byte[] var2;
      if (this.callbacks != null) {
         var2 = this.callbacks.deviceWaitForRequest(var1);
      } else {
         Log.e(TAG, "Received callback in non device role");
         var2 = new byte[0];
      }

      return var2;
   }

   private void deviceWriteRequestCompleted(int var1, byte[] var2, byte[] var3) {
      if (this.callbacks != null) {
         this.callbacks.deviceWriteRequestCompleted(var1, var2, var3);
      } else {
         Log.e(TAG, "Received callback in non device role");
      }

   }

   private void notificationParserMethod(int var1, byte[] var2) {
      if (this.callbacks != null) {
         this.callbacks.notificationParserMethod(var1, var2);
      } else {
         this.hostCallbacks.notificationParserMethod(var1, var2);
      }

   }

   private byte[] readMethod(int[] var1, int var2) {
      byte[] var3;
      if (this.callbacks != null) {
         var3 = this.callbacks.readPacket(var1, var2);
      } else {
         var3 = this.hostCallbacks.readPacket(var1, var2);
      }

      return var3;
   }

   private byte[] readNotificationMethod(int[] var1, int var2) {
      byte[] var3;
      if (this.callbacks != null) {
         var3 = this.callbacks.readNotificationPacket(var1, var2);
      } else {
         var3 = this.hostCallbacks.readNotificationPacket(var1, var2);
      }

      return var3;
   }

   private void sendProgressMethod(byte[] var1, long var2, long var4) {
      this.hostCallbacks.sendProgress(var1, var2, var4);
   }

   private int writeMethod(byte[] var1, int var2) {
      if (this.callbacks != null) {
         var2 = this.callbacks.writePacket(var1, var2);
      } else {
         var2 = this.hostCallbacks.writePacket(var1, var2);
      }

      return var2;
   }

   private int writeNotificationMethod(byte[] var1, int var2) {
      if (this.callbacks != null) {
         var2 = this.callbacks.writeNotificationPacket(var1, var2);
      } else {
         var2 = this.hostCallbacks.writeNotificationPacket(var1, var2);
      }

      return var2;
   }

   public native int advertise(int var1, byte[] var2);

   public native void deviceReceiveNotification();

   public native int deviceSendNotification(int var1, byte[] var2);

   public native int deviceWaitForRequest();

   public native byte[] query(int[] var1, int var2, byte[] var3);

   public native byte[] read(int[] var1, byte[] var2);

   public native void receivenotification();

   public native int transmitnotification(int var1, byte[] var2);

   public native int write(byte[] var1, byte[] var2);
}
