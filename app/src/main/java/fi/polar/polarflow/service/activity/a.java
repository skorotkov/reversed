package fi.polar.polarflow.service.activity;

import android.content.Intent;
import android.os.IBinder;

import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

public abstract class a extends aw {
   protected final as a;
   protected at b;
   protected v_StickyLocalBroadcastManager c;
   protected fi.polar.polarflow.service.datalayer.u d;
   private ah e;
   private boolean f;

   public a(int var1, String var2) {
      this.a = new as(var1, var2);
   }

   private boolean e() {
      boolean var1;
      if (this.e.a() && this.a.a(this.b)) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected abstract IBinder a();

   protected abstract void b();

   protected abstract void c();

   public boolean d() {
      return this.f;
   }

   public IBinder onBind(Intent var1) {
      fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "onBind()");
      if (!this.f) {
         if (this.e()) {
            this.f = true;
            this.b();
         } else {
            fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "....Not provisioned or sensors not available, check again in next call");
         }
      }

      return this.a();
   }

   public void onCreate() {
      fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "onCreate()");
      super.onCreate();
      if (this.b == null) {
         this.b = new at(this);
      }

      if (this.c == null) {
         this.c = v_StickyLocalBroadcastManager.a_getInstance();
      }

      if (this.d == null) {
         this.d = new fi.polar.polarflow.service.datalayer.u();
      }

      if (this.e == null) {
         this.e = new ah();
      }

   }

   public void onDestroy() {
      fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "onDestroy()");
      if (this.f) {
         this.f = false;
         this.c();
      }

      super.onDestroy();
   }

   public int onStartCommand(Intent var1, int var2, int var3) {
      fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "onStartCommand()");
      if (!this.f) {
         if (this.e()) {
            this.f = true;
            this.b();
         } else {
            fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "....Not provisioned or sensors not available, check again in next call");
         }
      }

      return 1;
   }
}
