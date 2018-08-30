package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import android.content.Intent;

public class bn implements r {
   public String a() {
      return "/U/0/USERID\\.BPB";
   }

   public void a(Context var1, String var2) {
      if (!fi.polar.polarflow.util.u.a().f()) {
         fi.polar.polarflow.util.u.a().c(true);
         var1.sendBroadcast(new Intent("fi.polar.polarflow.action.USERID_RECEIVED"));
      }

   }
}
