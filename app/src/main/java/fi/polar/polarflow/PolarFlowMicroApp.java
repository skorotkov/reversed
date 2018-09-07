package fi.polar.polarflow;

import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.Context;
import com.orm.SugarApp;
import fi.polar.polarflow.data.orm.UserId;
import fi.polar.polarflow.service.datalayer.aj;
import fi.polar.polarflow.service.datalayer.o;
import fi.polar.polarflow.service.datalayer.t;
import fi.polar.polarflow.ui.NotificationReceiver;
import fi.polar.polarflow.ui.exeview.ExeViewActivity;
import fi.polar.polarflow.util.j;
import fi.polar.polarflow.util.s;
import fi.polar.polarflow.util.u;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;
import fi.polar.polarflow.util.w;
import fi.polar.polarflow.util.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;

public class PolarFlowMicroApp extends SugarApp {
   static {
      System.loadLibrary("pmsmart");
   }

   private static void a(Context var0) {
      Iterator var4 = ((ActivityManager)var0.getSystemService("activity")).getAppTasks().iterator();

      while(var4.hasNext()) {
         AppTask var1 = (AppTask)var4.next();

         RecentTaskInfo var2;
         try {
            var2 = var1.getTaskInfo();
         } catch (IllegalArgumentException var3) {
            fi.polar.polarflow.util.d.a("PolarFlowMicroApp", "Failed to retrieve task info: ", var3);
            continue;
         }

         if (var2.baseActivity != null && ExeViewActivity.class.getName().equals(var2.baseActivity.getClassName())) {
            var1.finishAndRemoveTask();
         }
      }

   }

   private static void a(PolarFlowMicroApp var0) {
      s var1 = new s(Executors.newSingleThreadExecutor());
      boolean var2 = u.a().d();
      if (var2) {
         if (!(new o(var0)).a()) {
            fi.polar.polarflow.util.d.e("PolarFlowMicroApp", "Initialized, but file system does not exist");
            (new aj(var0)).executeOnExecutor(var1, new String[]{"/"});
         }

         (new t(var0)).executeOnExecutor(var1, a());
      }

      if (u.a().e()) {
         var1.execute(new f(var0));
         var1.execute(new fi.polar.polarflow.util.o(var0));
         var1.execute(new fi.polar.polarflow.service.activity.g(var0));
      }

      var1.execute(new d(var0));
      if (u.a().e()) {
         var1.execute(new e(var0));
         var1.execute(new c(var0));
      }

      var1.execute(new b(var0));
      if (!var2 && !y.f(var0)) {
         var1.execute(new g(var0));
      }

   }

   private static fi.polar.polarflow.service.datalayer.s[] a() {
      ArrayList var0 = new ArrayList();
      var0.add(fi.polar.polarflow.util.c.f().createDataLayerRequest());
      var0.add(w.a().createDataLayerRequest());
      UserId var1 = UserId.getUserId();
      if (var1 != null) {
         var0.add(var1.createDataLayerRequest());
      }

      return (fi.polar.polarflow.service.datalayer.s[])var0.toArray(new fi.polar.polarflow.service.datalayer.s[var0.size()]);
   }

   private static void b(PolarFlowMicroApp var0) {
      u.a((Context)var0);
      v_StickyLocalBroadcastManager.a_getInstance((Context)var0);
      fi.polar.polarflow.service.f.a((Context)var0);
   }

   protected void attachBaseContext(Context var1) {
      super.attachBaseContext(var1);
      android.support.b.a.a(this);
   }

   public void onCreate() {
      super.onCreate();
      fi.polar.polarflow.util.d.a("PolarFlowMicroApp", "Polar Flow Micro Application started");
      a(this.getBaseContext());
      b(this);
      a(this);
      NotificationReceiver.a(this, 0);
      j.a((Context)this);
   }
}
