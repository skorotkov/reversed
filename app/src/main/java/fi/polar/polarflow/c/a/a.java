package fi.polar.polarflow.c.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import fi.polar.polarflow.c.i;
import fi.polar.polarflow.c.l;
import fi.polar.polarflow.c.m;
import fi.polar.polarflow.c.n;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class a extends fi.polar.polarflow.c.a implements i {
   private final SensorManager g;
   private final Sensor h;
   private final int i;
   private final long j;
   private final long k;
   private final d l;
   private final Handler m;
   private long n;
   private boolean o;
   private HandlerThread p;
   private Handler q;
   private fi.polar.polarflow.c.e r;
   private long s;
   private final SensorEventListener t;

   public a(Context var1) {
      this(var1, fi.polar.polarflow.c.n.f, 50, 800);
   }

   public a(Context var1, n var2, int var3, int var4) {
      super(var1, var2);
      this.s = 0L;
      this.t = new b(this);
      this.l = new d(true);
      this.g = (SensorManager)var1.getSystemService("sensor");
      this.h = this.g.getDefaultSensor(1);
      this.m = new Handler();
      this.k = TimeUnit.MILLISECONDS.toNanos((long)var4);
      this.i = 1000000 / var3;
      this.j = TimeUnit.MICROSECONDS.toNanos((long)(this.i - this.i / 10));
   }

   // $FF: synthetic method
   static long a(a var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static long a(a var0, long var1) {
      var0.n = var1;
      return var1;
   }

   // $FF: synthetic method
   static long b(a var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static long b(a var0, long var1) {
      var0.s = var1;
      return var1;
   }

   // $FF: synthetic method
   static d c(a var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static long d(a var0) {
      return var0.s;
   }

   // $FF: synthetic method
   static long e(a var0) {
      return var0.k;
   }

   private void l() {
      if (this.p == null) {
         this.p = new HandlerThread("AccelerometerSensorThread");
         this.p.start();
         this.q = new Handler(this.p.getLooper());
      }

   }

   private void m() {
      if (this.p != null) {
         this.p.quit();
         this.p = null;
         this.q = null;
      }

   }

   private boolean n() {
      if (this.h != null) {
         if (this.g.registerListener(this.t, this.h, this.i, this.q)) {
            this.o = true;
         } else {
            fi.polar.polarflow.util.d.f("AccelerometerSensor", "Start not possible, registering accelerometer listener failed!");
         }
      }

      return this.o;
   }

   private void o() {
      if (this.h != null && this.o) {
         this.g.unregisterListener(this.t, this.h);
         this.o = false;
      }

   }

   protected void a() {
   }

   public void a(l var1) {
      this.r = (fi.polar.polarflow.c.e)var1;
   }

   protected void a(List var1) {
      if (this.r != null) {
         this.r.a(var1);
      }

   }

   public void b() {
      if (!this.d) {
         fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "start");
         this.l();
         if (this.n()) {
            this.a((m)fi.polar.polarflow.c.m.d);
            this.d = true;
         } else {
            this.a((m)fi.polar.polarflow.c.m.a);
            this.m();
         }
      }

   }

   public void c() {
      if (this.d) {
         fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "stop");
         super.i();
         this.o();
         this.q.removeCallbacksAndMessages((Object)null);
         this.m();
         this.a((m)fi.polar.polarflow.c.m.b);
         this.d = false;
         this.m.removeCallbacksAndMessages((Object)null);
      }

   }

   protected void d() {
   }

   void k() {
      List var1 = this.l.a();
      if (!var1.isEmpty()) {
         this.m.post(new c(this, var1));
      }

   }
}
