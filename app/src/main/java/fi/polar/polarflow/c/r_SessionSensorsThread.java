package fi.polar.polarflow.c;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Handler.Callback;

import fi.polar.polarflow.c.a_accelerometer_package.a_AccelerometerSensor;
import fi.polar.polarflow.c.a_accelerometer_package.e_RunningCadenceProvider;
import fi.polar.polarflow.c.c_heartrate_package.j_HeartRateSensorManager;
import fi.polar.polarflow.c.d_gps_package.b_GpsLocationProvider;
import fi.polar.polarflow.calculators.am_SessionCalculators;
import fi.polar.polarflow.data.ExerciseSensors;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class r_SessionSensorsThread extends HandlerThread implements Callback {
   private static final int[] a = new int[]{1, 4, 8, 16};
   private final Context b_context;
   private final Set c;
   private am_SessionCalculators d_sessionCalculators;
   private final Map e_sensorsMap;
   private int f;
   private boolean g;
   private Handler h;
   private k i;

   r_SessionSensorsThread(Context var1) {
      super("SessionSensorsThread");
      fi.polar.polarflow.util.d.c("SessionSensorsThread", "new SessionSensorsThread()");
      this.b_context = var1;
      this.c = new LinkedHashSet();
      this.e_sensorsMap = new HashMap();
   }

   private void b_createSensors() {
      int[] var1 = a;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = var1[var3];
         if (this.c(var4) && this.e_sensorsMap.get(var4) == null) {
            Object var5 = null;
            switch(var4) {
            case 1:
               var5 = new j_HeartRateSensorManager(this.b_context);
               break;
            case 4:
               var5 = new b_GpsLocationProvider(this.b_context);
               break;
            case 8:
               var5 = new e_RunningCadenceProvider(this.b_context);
               break;
            case 16:
               var5 = new a_AccelerometerSensor(this.b_context);
            }

            if (var5 != null) {
               this.e_sensorsMap.put(var4, var5);
               ((a_Sensor)var5).b_start();
            }
         }
      }

   }

   private void b(m_SENSOR_STATE var1) {
      if (this.g && var1 == m_SENSOR_STATE.d_READY) {
         this.c();
      }

   }

   private void c() {
      // $FF: Couldn't be decompiled
   }

   private boolean c(int var1) {
      boolean var2;
      if ((this.f & var1) == var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private a_Sensor d_getSensor(int var1) {
      a_Sensor var2;
      if (this.c(var1)) {
         var2 = (a_Sensor)this.e_sensorsMap.get(var1);
      } else {
         var2 = null;
      }

      return var2;
   }

   private void d() {
      Iterator var1 = this.e_sensorsMap.entrySet().iterator();

      while(var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         a_Sensor var3 = (a_Sensor)var2.getValue();
         if (this.c((Integer)var2.getKey())) {
            var3.h();
         } else {
            var3.c_stop();
         }
      }

   }

   private void e() {
      if (this.e_sensorsMap.isEmpty()) {
         this.f = 5;
         this.b_createSensors();
      } else {
         Iterator var1 = this.e_sensorsMap.values().iterator();

         while(var1.hasNext()) {
            ((a_Sensor)var1.next()).b_start();
         }
      }

   }

   private void e(int param1) {
      // $FF: Couldn't be decompiled
   }

   private void f() {
      // $FF: Couldn't be decompiled
   }

   private void g() {
      if (this.g) {
         this.d_sessionCalculators.b();
         Iterator var1 = this.e_sensorsMap.entrySet().iterator();

         while(var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            a_Sensor var3 = (a_Sensor)var2.getValue();
            if (this.c((Integer)var2.getKey())) {
               var3.f();
            }
         }
      }

   }

   private void h() {
      if (this.g) {
         Iterator var1 = this.e_sensorsMap.entrySet().iterator();

         while(var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            a_Sensor var3 = (a_Sensor)var2.getValue();
            if (this.c((Integer)var2.getKey())) {
               var3.g();
            }
         }

         this.d_sessionCalculators.c();
      }

   }

   private void i() {
      fi.polar.polarflow.util.d.c("SessionSensorsThread", "onKill() id: " + this.getId());
      this.h = null;
      this.quit();
   }

   ExerciseSensors a() {
      // $FF: Couldn't be decompiled
      return null;
   }

   void a(int var1) {
      if (this.h != null) {
         this.h.sendMessage(this.h.obtainMessage(6, var1, 0));
      }

   }

   public void a(k var1) {
      this.i = var1;
   }

   void a(m_SENSOR_STATE var1) {
      if (this.h != null) {
         this.h.sendMessage(this.h.obtainMessage(5, var1));
      }

   }

   boolean b(int var1) {
      boolean var2;
      if (this.h == null) {
         var2 = false;
      } else {
         this.h.removeMessages(var1);
         var2 = this.h.sendEmptyMessage(var1);
      }

      return var2;
   }

   public boolean handleMessage(Message var1) {
      boolean var2;
      switch(var1.what) {
      case 1:
         this.e();
         break;
      case 2:
         this.f();
         break;
      case 3:
         this.g();
         break;
      case 4:
         this.h();
         break;
      case 5:
         this.b((m_SENSOR_STATE)var1.obj);
         break;
      case 6:
         this.e(var1.arg1);
         break;
      case 7:
         this.i();
         break;
      default:
         var2 = false;
         return var2;
      }

      var2 = true;
      return var2;
   }

   public void start() {
      fi.polar.polarflow.util.d.c("SessionSensorsThread", "start() id: " + this.getId());
      super.start();
      this.h = new Handler(this.getLooper(), this);
   }
}