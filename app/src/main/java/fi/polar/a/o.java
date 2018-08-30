package fi.polar.a;

import com.google.protobuf.InvalidProtocolBufferException;
import java.util.UUID;
import protocol.PftpRequest$PbPFtpOperation;

class o extends a {
   o(UUID var1, l var2) {
      super(var1, var2);
   }

   private m a(PftpRequest$PbPFtpOperation var1, byte[] var2) {
      String var3 = var1.getPath();
      boolean var4 = var3.endsWith("/");
      fi.polar.a.a.b.c("DataPftpHandler", "handleClientOperation: " + var1.getCommand().getNumber() + ", path: " + var3 + ", isDirectory: " + var4);
      m var5;
      switch(var1.getCommand().getNumber()) {
      case 0:
         if (var4) {
            var5 = this.a.d(var3);
         } else {
            var5 = this.a.a(var3);
         }
         break;
      case 1:
         if (var4) {
            var5 = new m(this.a.e(var3), (byte[])null);
         } else {
            var5 = new m(this.a.a(var3, var2), (byte[])null);
         }
         break;
      case 2:
         var5 = new m(this.a.b(var3, var2), (byte[])null);
         break;
      case 3:
         if (var4) {
            var5 = new m(this.a.c(var3), (byte[])null);
         } else {
            var5 = new m(this.a.b(var3), (byte[])null);
         }
         break;
      default:
         fi.polar.a.a.b.a("DataPftpHandler", "Unrecognized operation: " + var1.getCommand().getNumber());
         var5 = new m(201, (byte[])null);
      }

      return var5;
   }

   boolean a() {
      boolean var1 = super.a();
      if (var1) {
         this.f();
      }

      return var1;
   }

   void b(byte[] var1) {
      this.c(var1);
   }

   boolean b() {
      boolean var1 = super.b();
      if (var1 && !this.e()) {
         this.c(new byte[0]);
      }

      return var1;
   }

   void d() {
      this.b.deviceWaitForRequest();
   }

   public byte[] deviceProcessQueryRequest(int[] var1, int var2, byte[] var3) {
      fi.polar.a.a.b.c("DataPftpHandler", "deviceProcessQueryRequest(id=" + var2 + ")");
      m var5 = this.a.a(var2, var3);
      if (var5 != null) {
         var2 = var5.a();
      } else {
         var2 = 200;
      }

      fi.polar.a.a.e.a(var2, var1);
      byte[] var4;
      if (var5 != null && var5.b() != null) {
         var4 = var5.b();
      } else {
         var4 = new byte[0];
      }

      return var4;
   }

   public byte[] deviceProcessReadRequest(int[] var1, byte[] var2) {
      Object var3 = null;

      m var7;
      try {
         var7 = this.a(PftpRequest$PbPFtpOperation.parseFrom(var2), (byte[])null);
      } catch (InvalidProtocolBufferException var5) {
         var5.printStackTrace();
         var7 = (m)var3;
      }

      int var4;
      if (var7 != null) {
         var4 = var7.a();
      } else {
         var4 = 200;
      }

      fi.polar.a.a.e.a(var4, var1);
      byte[] var6;
      if (var7 != null && var7.b() != null) {
         var6 = var7.b();
      } else {
         var6 = new byte[0];
      }

      return var6;
   }

   public int deviceProcessWriteRequest(byte[] var1) {
      return 0;
   }

   public void deviceReadRequestCompleted(int var1) {
      fi.polar.a.a.b.c("DataPftpHandler", "deviceReadRequestCompleted(error=" + var1 + ")");
   }

   public byte[] deviceWaitForRequest(int[] var1) {
      return this.readPacket(var1, 60000);
   }

   public void deviceWriteRequestCompleted(int var1, byte[] var2, byte[] var3) {
      fi.polar.a.a.b.c("DataPftpHandler", "deviceWriteRequestCompleted(error=" + var1 + ")");

      try {
         this.a(PftpRequest$PbPFtpOperation.parseFrom(var2), var3);
      } catch (InvalidProtocolBufferException var4) {
         var4.printStackTrace();
      }

   }
}
