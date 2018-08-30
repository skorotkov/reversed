package fi.polar.polarflow.service.sensorhubsocket;

import android.content.Context;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.net.LocalSocketAddress.Namespace;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

class d {
   private final String a;
   private LocalSocket b = null;
   private DataOutputStream c;
   private DataInputStream d;
   private String e;
   private int f;
   private boolean g = true;

   public d(String var1) {
      this.a = var1;
   }

   private int a(boolean var1, boolean var2) {
      int var3 = -1;
      this.g = var1;
      if (this.e == null || this.e.length() > 0 && this.e.length() <= 4096) {
         if (!this.e().isConnected() && !this.a()) {
            fi.polar.polarflow.util.d.b("LocalSocketHelper", "Connection to local socket failed");
         } else {
            int var4;
            label22: {
               this.c();
               if (this.g) {
                  this.a(100L);
                  if (!Thread.currentThread().isInterrupted()) {
                     var4 = this.d();
                     fi.polar.polarflow.util.d.c("LocalSocketHelper", "Ack: 0x" + Integer.toHexString(var4));
                     break label22;
                  }
               }

               var4 = 0;
            }

            var3 = var4;
            if (!var2) {
               this.b();
               this.a(100L);
               var3 = var4;
            }
         }
      } else {
         fi.polar.polarflow.util.d.b("LocalSocketHelper", "Invalid data (length = " + this.e.length() + ")");
      }

      return var3;
   }

   private void a(long var1) {
      try {
         Thread.sleep(var1);
      } catch (InterruptedException var4) {
         fi.polar.polarflow.util.d.a("LocalSocketHelper", "", var4);
         Thread.currentThread().interrupt();
      }

   }

   private boolean a() {
      boolean var1 = true;

      try {
         LocalSocketAddress var2 = new LocalSocketAddress(this.a, Namespace.FILESYSTEM);
         this.e().connect(var2);
      } catch (IOException var4) {
         fi.polar.polarflow.util.d.a("LocalSocketHelper", "", var4);
         var1 = false;
      }

      fi.polar.polarflow.util.d.c("LocalSocketHelper", "Local socket:" + this.a + " " + this.b.isConnected());
      boolean var3 = var1;
      if (this.b.isConnected()) {
         try {
            DataOutputStream var6 = new DataOutputStream(this.b.getOutputStream());
            this.c = var6;
            DataInputStream var7 = new DataInputStream(this.b.getInputStream());
            this.d = var7;
         } catch (IOException var5) {
            fi.polar.polarflow.util.d.a("LocalSocketHelper", "", var5);
            var3 = false;
            return var3;
         }

         var3 = var1;
      }

      return var3;
   }

   public static boolean a(Context var0) {
      boolean var1 = false;
      boolean var2 = var1;
      if (var0 != null) {
         var2 = var1;
         if (var0.getPackageManager().hasSystemFeature("com.polar.wearable")) {
            var2 = var1;
            if (!"release".equals("debug")) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   private void b() {
      try {
         if (this.d != null) {
            this.d.close();
         }
      } catch (IOException var4) {
      }

      try {
         if (this.c != null) {
            this.c.close();
         }
      } catch (IOException var3) {
      }

      try {
         this.b.close();
      } catch (IOException var2) {
         fi.polar.polarflow.util.d.b("LocalSocketHelper", "Could not close local socket");
      }

      this.b = null;
   }

   private void c() {
      // $FF: Couldn't be decompiled
   }

   private int d() {
      int var1 = 0;

      int var2;
      try {
         var2 = this.d.readInt();
      } catch (IOException var4) {
         fi.polar.polarflow.util.d.a("LocalSocketHelper", "", var4);
         return Integer.reverseBytes(var1);
      }

      var1 = var2;
      return Integer.reverseBytes(var1);
   }

   private LocalSocket e() {
      if (this.b == null) {
         this.b = new LocalSocket();
      }

      return this.b;
   }

   public int a(String var1, boolean var2, boolean var3) {
      this.e = var1;
      return this.a(var2, var3);
   }
}
