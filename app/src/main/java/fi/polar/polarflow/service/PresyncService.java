package fi.polar.polarflow.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PresyncService extends Service {
   private static final String a = PresyncService.class.getSimpleName();
   private final IBinder b = new i(this);
   private final Set c = Collections.synchronizedSet(new HashSet());
   private fi.polar.polarflow.util.s d = new fi.polar.polarflow.util.s(Executors.newSingleThreadExecutor());
   private int e = 10000;
   private ExecutorService f;
   private fi.polar.polarflow.service.datalayer.u g;
   private m h;

   public PresyncService() {
      this.h = m.a;
   }

   public static Intent a(Context var0, String var1) {
      Intent var2 = new Intent(var0, PresyncService.class);
      var2.setAction("fi.polar.polarflow.action.REQUEST_PRE_SYNC");
      var2.putExtra("fi.polar.polarflow.extra.HOST_NODE_ID", var1);
      return var2;
   }

   // $FF: synthetic method
   static String a() {
      return a;
   }

   // $FF: synthetic method
   static Set a(PresyncService var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static void a(PresyncService var0, m var1) {
      var0.a(var1);
   }

   private void a(m var1) {
      fi.polar.polarflow.util.d.c(a, "setState(" + this.h + "->" + var1 + ")");
      this.h = var1;
   }

   public void a(j var1) {
      this.c.add(var1);
      fi.polar.polarflow.util.d.c(a, "registerListener(listener=" + var1 + ")");
   }

   public void b(j var1) {
      this.c.remove(var1);
      fi.polar.polarflow.util.d.c(a, "unregisterListener(listener=" + var1 + ")");
   }

   public IBinder onBind(Intent var1) {
      return this.b;
   }

   public void onDestroy() {
      fi.polar.polarflow.util.d.e(a, "onDestroy(registered listeners=" + this.c + ")");
      this.c.clear();
      this.a(m.a);
      super.onDestroy();
   }

   public int onStartCommand(Intent var1, int var2, int var3) {
      String var4 = var1.getAction();
      String var5 = var1.getStringExtra("fi.polar.polarflow.extra.HOST_NODE_ID");
      fi.polar.polarflow.util.d.c(a, "onStartCommand(action=" + var4 + ", host node=" + var5 + ", state=" + this.h + ")");
      if ("fi.polar.polarflow.action.REQUEST_PRE_SYNC".equals(var4) && this.h == m.a) {
         this.a(m.b);
         k var6;
         if (this.f != null && this.g != null) {
            var6 = new k(this, this.g, this.f, var5);
         } else {
            var6 = new k(this, var5);
         }

         var6.a(this.e);
         this.d.execute(var6);
      }

      return 2;
   }
}
