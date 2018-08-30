package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.SleepAnalysisResult;
import java.io.InputStream;

public class ay implements q {
   public String a() {
      return "/U/0/[0-9]{8}/SLEEP/SLEEPRES\\.BPB";
   }

   public void a(Context param1, String param2, InputStream param3) {
      // $FF: Couldn't be decompiled
   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c("SleepAnalysisResultReceiver", "onLocalDeleted(" + var1 + ")");
      SleepAnalysisResult.deleteAll(SleepAnalysisResult.class, "PATH = ?", v.a(var1));
   }
}
