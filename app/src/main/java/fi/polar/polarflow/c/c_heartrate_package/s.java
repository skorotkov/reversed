package fi.polar.polarflow.c.c_heartrate_package;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.SparseArray;

import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.j_PolarSensorEventListener;
import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.c.m_SENSOR_STATE;

public class s extends a_HeartRateSensor {
   private static final String g = s.class.getSimpleName();
   private static final SparseArray h = new t();
   private SensorManager i;
   private Sensor j;
   private boolean k;
   private e_PolarSensorListenerEx l = null;
   private final Handler m = new Handler();
   private final j_PolarSensorEventListener n = new u(this);
   private final SensorEventListener o;

   public s(Context var1) {
      super(var1);
      this.o = new v(this, this.n, this.m);
      this.i = (SensorManager)var1.getSystemService("sensor");
   }

   // $FF: synthetic method
   static e_PolarSensorListenerEx a(s var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static void a(s var0, m_SENSOR_STATE var1) {
      var0.a_setState((m_SENSOR_STATE)var1);
   }

   // $FF: synthetic method
   static void b(s var0, m_SENSOR_STATE var1) {
      var0.a_setState((m_SENSOR_STATE)var1);
   }

   // $FF: synthetic method
   static String p() {
      return g;
   }

   // $FF: synthetic method
   static SparseArray q() {
      return h;
   }

   private void r() {
      if (!this.k) {
         this.j = this.i.getDefaultSensor(21);
         if (this.j != null) {
            this.k = this.i.registerListener(this.o, this.j, 3, this.m);
            if (!this.k) {
               fi.polar.polarflow.util.d.e(g, "SensorManager.registerListener() returned false");
            }
         } else {
            fi.polar.polarflow.util.d.e(g, "SensorManager.getDefaultSensor(Sensor.TYPE_HEART_RATE) returned null");
         }
      }

   }

   private void s() {
      if (this.k) {
         this.i.unregisterListener(this.o, this.j);
         this.k = false;
      }

   }

   public void a_setPolarSensorListener(l_PolarSensorListener var1) {
      this.l = (e_PolarSensorListenerEx)var1;
   }

   public void b_start() {
      fi.polar.polarflow.util.d.c(g, "start()");
      if (fi.polar.polarflow.ui.o.d(this.a_context, "android.permission.BODY_SENSORS")) {
         if (!this.k) {
            this.r();
            if (this.k) {
               this.a_setState(m_SENSOR_STATE.c_SEARCHING, true);
            } else {
               this.a_setState(m_SENSOR_STATE.a_DISABLED, true);
            }
         } else {
            this.d_broadcastStateChanged();
         }
      } else {
         this.a_setState(m_SENSOR_STATE.a_DISABLED, true);
      }

   }

   public void c_stop() {
      fi.polar.polarflow.util.d.c(g, "stop()");
      this.s();
      this.m.removeCallbacksAndMessages((Object)null);
      this.a_setState(m_SENSOR_STATE.b_NOT_READY, true);
   }

   protected void d_broadcastStateChanged() {
      if (this.l != null) {
         this.l.a(this.e_getState());
      }

   }

   protected void l() {
   }
}
