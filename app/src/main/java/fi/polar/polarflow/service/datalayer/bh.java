package fi.polar.polarflow.service.datalayer;

import android.content.Context;

public class bh implements aq {
   private static final String a = bh.class.getSimpleName();

   public String a() {
      return "/MESSAGE/SYNC_START_NOTIFICATION";
   }

   public void a(Context var1, String var2, byte[] var3, String var4) {
      fi.polar.polarflow.util.d.c(a, "onReceive: " + var2);
      fi.polar.polarflow.util.y.e(var1);
   }
}
