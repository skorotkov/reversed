package fi.polar.polarflow.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import fi.polar.polarflow.data.ExerciseSensors;

public class o_SessionSensors {
   public static final String a;
   public static final String b;
   private static final String c = o_SessionSensors.class.getSimpleName();
   private final Context d;
   private final android.support.v4.c.g e;
   private final IntentFilter f;
   private final IntentFilter g;
   private r_SessionSensorsThread h_sessionSensorsThread;
   private ExerciseSensors i;
   private boolean j;
   private boolean k;
   private boolean l;
   private final BroadcastReceiver m = new p(this);
   private final BroadcastReceiver n = new q(this);

   static {
      a = c + ".START_SENSOR_UPDATES";
      b = c + ".STOP_SENSOR_UPDATES";
   }

   public o_SessionSensors(Context var1) {
      fi.polar.polarflow.util.d.c(c, "new SessionSensors()");
      this.d = var1;
      this.e = android.support.v4.c.g.a(var1);
      this.h_sessionSensorsThread = new r_SessionSensorsThread(var1);
      this.f = new IntentFilter();
      this.f.addAction("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
      this.f.addAction("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED");
      this.g = new IntentFilter();
      this.g.addAction(a);
      this.g.addAction(b);
      this.h();
   }

   // $FF: synthetic method
   static void a(o_SessionSensors var0) {
      var0.g();
   }

   // $FF: synthetic method
   static void a(o_SessionSensors var0, k var1) {
      var0.b(var1);
   }

   // $FF: synthetic method
   static r_SessionSensorsThread b(o_SessionSensors var0) {
      return var0.h_sessionSensorsThread;
   }

   private void b(k param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String f() {
      return c;
   }

   private void g() {
      synchronized(this){}

      try {
         if (this.h_sessionSensorsThread == null) {
            r_SessionSensorsThread var1 = new r_SessionSensorsThread(this.d);
            this.h_sessionSensorsThread = var1;
         }

         if (!this.h_sessionSensorsThread.isAlive()) {
            this.h_sessionSensorsThread.start();
            this.h_sessionSensorsThread.b(1);
         }
      } finally {
         ;
      }

   }

   private void h() {
      if (!this.k) {
         this.e.a(this.m, this.g);
         this.k = true;
      }

   }

   private void i() {
      if (this.k) {
         this.e.a(this.m);
         this.k = false;
      }

   }

   private void j() {
      if (!this.j) {
         this.e.a(this.n, this.f);
         this.j = true;
      }

   }

   private void k() {
      if (this.j) {
         this.e.a(this.n);
         this.j = false;
      }

   }

   public void a() {
      fi.polar.polarflow.util.d.c(c, "onDestroy()");
      this.k();
      this.i();
      this.b((k)null);
   }

   public void a_startSessionSensors(int var1) {
      if (!this.l) {
         fi.polar.polarflow.util.d.c(c, "startSessionSensors()");
         this.i = new ExerciseSensors();
         this.i();
         if (var1 != 0) {
            this.j();
         } else {
            this.k();
         }

         this.g();
         this.l = true;
         this.h_sessionSensorsThread.a(var1);
      }

   }

   public void a_stopSessionSensors(k var1) {
      if (this.l) {
         fi.polar.polarflow.util.d.c(c, "stopSessionSensors()");
         this.k();
         this.i = this.h_sessionSensorsThread.a();
         this.b(var1);
         this.l = false;
         this.h();
      }

   }

   public void b_pauseSessionSensors() {
      fi.polar.polarflow.util.d.c(c, "pauseSessionSensors");
      this.h_sessionSensorsThread.b(3);
   }

   public void c_resumeSessionSensors() {
      fi.polar.polarflow.util.d.c(c, "resumeSessionSensors");
      this.h_sessionSensorsThread.b(4);
   }

   public ExerciseSensors d() {
      if (this.e()) {
         this.i = this.h_sessionSensorsThread.a();
      }

      return this.i;
   }

   boolean e() {
      return this.l;
   }
}
