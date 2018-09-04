package fi.polar.polarflow.service.activity;

import android.content.Context;
import fi.polar.polarflow.data.orm.Identifier;
import fi.polar.polarflow.data.orm.SleepAnalysisResult;
import java.util.ArrayList;

public abstract class b implements Runnable {
   private final Context a;
   private final fi.polar.polarflow.util.z b;
   private final fi.polar.polarflow.service.datalayer.u c;
   private final boolean d;
   private final fi.polar.polarflow.service.datalayer.at e = new c(this);

   protected b(Context var1, fi.polar.polarflow.util.z var2, fi.polar.polarflow.service.datalayer.u var3, boolean var4) {
      this.a = var1.getApplicationContext();
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   // $FF: synthetic method
   static boolean a(b var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static Context b(b var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.util.z c(b var0) {
      return var0.b;
   }

   protected void a(SleepAnalysisResult var1) {
      ArrayList var2 = new ArrayList();
      int var3;
      if (var1.getId() == null) {
         var3 = SleepAnalysisResult.deleteAll(SleepAnalysisResult.class, "PATH = ?", var1.getPath()) + 0;
      } else {
         var3 = 0;
      }

      if (var3 + Identifier.deleteAll(Identifier.class, "PATH = ?", new String[]{var1.getPath()}) > 0) {
         fi.polar.polarflow.service.datalayer.s var4 = new fi.polar.polarflow.service.datalayer.s(2, var1.getPath());
         var4.a(1);
         var2.add(var4);
      }

      var1.save();
      var2.add(var1.createDataLayerRequest());
      var2.add(fi.polar.polarflow.util.w.a(var1.getPath()));
      this.c.a(this.a, this.e).execute((fi.polar.polarflow.service.datalayer.s[])var2.toArray(new fi.polar.polarflow.service.datalayer.s[var2.size()]));
   }
}
