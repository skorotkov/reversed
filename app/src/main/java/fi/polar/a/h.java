package fi.polar.a;

import java.util.UUID;

class h implements c {
   // $FF: synthetic field
   final d a;

   h(d var1) {
      this.a = var1;
   }

   public void a() {
      fi.polar.a.a.b.d(d.d(), "timeoutTimer(timeout during sync)");
      this.a.a();
   }

   public boolean a(UUID var1, byte[] var2) {
      String var3 = d.d();
      StringBuilder var4 = (new StringBuilder()).append("onWriteRequest(uuid=").append(var1).append(", writeBytes=");
      Object var5;
      if (var2 != null) {
         var5 = var2.length;
      } else {
         var5 = "null";
      }

      fi.polar.a.a.b.c(var3, var4.append(var5).append(")").toString());
      return d.a(this.a, fi.polar.a.a.a.b, var1, var2);
   }
}
