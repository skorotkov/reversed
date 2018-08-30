package fi.polar.polarflow.service.bluetooth;

import android.content.Context;
import com.google.protobuf.InvalidProtocolBufferException;
import protocol.PftpNotification$PbPFtpStopSyncParams;

class r implements o {
   private static final String a = r.class.getSimpleName();
   private p b;

   public int a() {
      return 1;
   }

   void a(p var1) {
      this.b = var1;
   }

   public boolean a(Context var1, byte[] var2) {
      String var3 = a;
      StringBuilder var4 = (new StringBuilder()).append("receiveNotification(parameters=");
      Integer var7;
      if (var2 != null) {
         var7 = var2.length;
      } else {
         var7 = null;
      }

      fi.polar.polarflow.util.d.c(var3, var4.append(var7).append(" bytes)").toString());
      boolean var5;
      if (var2 == null) {
         fi.polar.polarflow.util.d.b(a, "Sync Stop requires sync stop parameters!");
         var5 = false;
      } else {
         try {
            var5 = PftpNotification$PbPFtpStopSyncParams.parseFrom(var2).getCompleted();
            if (this.b != null) {
               this.b.b(var5);
            }
         } catch (InvalidProtocolBufferException var6) {
            fi.polar.polarflow.util.d.a(a, "receiveNotification(Exception)", var6);
            var5 = false;
            return var5;
         }

         var5 = true;
      }

      return var5;
   }
}
