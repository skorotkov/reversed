package fi.polar.polarflow.service.bluetooth;

import android.content.Context;

class q implements o {
   private static final String a = q.class.getSimpleName();
   private p b;

   public int a() {
      return 0;
   }

   void a(p var1) {
      this.b = var1;
   }

   public boolean a(Context var1, byte[] var2) {
      fi.polar.polarflow.util.d.c(a, "receiveNotification()");
      if (this.b != null) {
         this.b.a();
      }

      return true;
   }
}
