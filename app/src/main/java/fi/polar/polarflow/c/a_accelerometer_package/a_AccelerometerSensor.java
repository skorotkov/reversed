package fi.polar.polarflow.c.a_accelerometer_package;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

import fi.polar.polarflow.c.a_Sensor;
import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.i_PolarSensorListenerSupport;
import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.c.n_SENSOR_TYPE;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class a_AccelerometerSensor extends a_Sensor implements i_PolarSensorListenerSupport {
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
   private e_PolarSensorListenerEx r;
   private long s;
   private final SensorEventListener t;

   public a_AccelerometerSensor(Context var1) {
      this(var1, n_SENSOR_TYPE.f_ACCELEROMETER, 50, 800);
   }

   public a_AccelerometerSensor(Context var1, n_SENSOR_TYPE var2, int var3, int var4) {
      super(var1, var2);
      this.s = 0L;
      this.t = new b(this);
      this.l = new d(true);
      this.g = (SensorManager)var1.getSystemService(Context.SENSOR_SERVICE);
      this.h = this.g.getDefaultSensor(1);
      this.m = new Handler();
      this.k = TimeUnit.MILLISECONDS.toNanos((long)var4);
      this.i = 1000000 / var3;
      this.j = TimeUnit.MICROSECONDS.toNanos((long)(this.i - this.i / 10));
   }

   // $FF: synthetic method
   static long a(a_AccelerometerSensor var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static long a(a_AccelerometerSensor var0, long var1) {
      var0.n = var1;
      return var1;
   }

   // $FF: synthetic method
   static long b(a_AccelerometerSensor var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static long b(a_AccelerometerSensor var0, long var1) {
      var0.s = var1;
      return var1;
   }

   // $FF: synthetic method
   static d c(a_AccelerometerSensor var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static long d(a_AccelerometerSensor var0) {
      return var0.s;
   }

   // $FF: synthetic method
   static long e(a_AccelerometerSensor var0) {
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

   protected void a_reset() {
   }

   public void a_setPolarSensorListener(l_PolarSensorListener var1) {
      this.r = (e_PolarSensorListenerEx)var1;
   }

   protected void a(List var1) {
      if (this.r != null) {
         this.r.a_onPolarSensorEvents(var1);
      }

   }

   public void b_start() {
      if (!this.d_sensorStarted) {
         fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "start");
         this.l();
         if (this.n()) {
            this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.d_READY);
            this.d_sensorStarted = true;
         } else {
            this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.a_DISABLED);
            this.m();
         }
      }

   }

   public void c_stop() {
      if (this.d_sensorStarted) {
         fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "stop");
         super.i();
         this.o();
         this.q.removeCallbacksAndMessages((Object)null);
         this.m();
         this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.b_NOT_READY);
         this.d_sensorStarted = false;
         this.m.removeCallbacksAndMessages((Object)null);
      }

   }

   protected void d_broadcastStateChanged() {
   }

   void k() {
      List var1 = this.l.a();
      if (!var1.isEmpty()) {
         this.m.post(new c(this, var1));
      }

   }
}
