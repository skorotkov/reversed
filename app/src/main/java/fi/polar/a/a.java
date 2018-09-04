package fi.polar.a;

import android.os.Handler;
import android.os.HandlerThread;
import com.polar.pftp.jni.PftpDeviceCallbacks;
import com.polar.pftp.jni.PftpJni;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

abstract class a implements PftpDeviceCallbacks {
   final l a;
   final PftpJni b;
   private final LinkedBlockingQueue c = new LinkedBlockingQueue(10000);
   private boolean d;
   private c e;
   private final UUID f;
   private HandlerThread g;
   private Handler h;
   private final Runnable i = new b(this);

   a(UUID var1, l var2) {
      this.f = var1;
      this.a = var2;
      this.b = new PftpJni(this);
   }

   void a(c var1) {
      this.e = var1;
   }

   void a(byte[] var1) {
      this.b(var1);
   }

   boolean a() {
      boolean var1 = true;
      if (!this.d) {
         this.d = true;
         this.c.clear();
         fi.polar.a.a_package.b.b("AbstractPftpHandler", "start(uuid=" + this.f + ")");
         this.g = new HandlerThread("AbstractPftpHandler.OPERATION_HANDLER_THREAD");
         this.g.start();
         this.h = new Handler(this.g.getLooper());
      } else {
         fi.polar.a.a_package.b.d("AbstractPftpHandler", "start(already started, uuid=" + this.f + ")");
         var1 = false;
      }

      return var1;
   }

   byte[] a(int var1) throws InterruptedException {
      return (byte[])this.c.poll((long)var1, TimeUnit.MILLISECONDS);
   }

   abstract void b(byte[] var1);

   boolean b() {
      boolean var1 = false;
      if (this.d) {
         fi.polar.a.a_package.b.b("AbstractPftpHandler", "stop(uuid=" + this.f + ")");
         this.d = false;
         var1 = this.g.quitSafely();
      } else {
         fi.polar.a.a_package.b.d("AbstractPftpHandler", "stop(already stopped, uuid=" + this.f + ")");
      }

      return var1;
   }

   void c(byte[] var1) {
      this.c.add(var1);
   }

   boolean c() {
      return this.d;
   }

   abstract void d();

   public void deviceStreamFailure(int var1, boolean var2) {
      fi.polar.a.a_package.b.d("AbstractPftpHandler", "deviceStreamFailure(error=" + var1 + ", notification=" + var2 + ")");
   }

   boolean e() {
      boolean var1;
      if (!this.c.isEmpty()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   void f() {
      this.h.post(this.i);
   }

   public void notificationParserMethod(int var1, byte[] var2) {
      this.a.b(var1, var2);
   }

   public byte[] readNotificationPacket(int[] var1, int var2) {
      fi.polar.a.a_package.b.c("AbstractPftpHandler", "readNotificationPacket()");
      return this.readPacket(var1, var2);
   }

   public byte[] readPacket(int[] var1, int var2) {
      byte[] var3 = null;

      short var7;
      label31: {
         byte[] var4;
         try {
            var4 = this.a(var2);
         } catch (InterruptedException var6) {
            fi.polar.a.a_package.b.a("AbstractPftpHandler", "readPacket(interrupted)", var6);
            var7 = 200;
            break label31;
         }

         var3 = var4;
         if (var4 != null) {
            var7 = 0;
         } else {
            var7 = 207;
         }
      }

      short var5;
      if (this.d) {
         var5 = var7;
      } else {
         var5 = 208;
      }

      fi.polar.a.a_package.e.a(var5, var1);
      if (var7 == 207 && this.e != null) {
         this.e.a();
      }

      if (var3 == null) {
         var3 = new byte[0];
      }

      return var3;
   }

   public void sendProgress(byte[] var1, long var2, long var4) {
      fi.polar.a.a_package.b.c("AbstractPftpHandler", "sendProgress()");
   }

   public int writeNotificationPacket(byte[] var1, int var2) {
      fi.polar.a.a_package.b.c("AbstractPftpHandler", "writeNotificationPacket()");
      return this.writePacket(var1, var2);
   }

   public int writePacket(byte[] var1, int var2) {
      short var3;
      if (this.e != null && this.e.a(this.f, var1)) {
         var3 = 0;
      } else {
         var3 = 200;
      }

      return var3;
   }
}
