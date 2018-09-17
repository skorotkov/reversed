package fi.polar.polarflow.c.c_heartrate_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;

import fi.polar.polarflow.c.a_Sensor;
import fi.polar.polarflow.c.b_ble_package.b_BleScanner;
import fi.polar.polarflow.c.b_ble_package.j_BluetoothStatusHandler;
import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.i_PolarSensorListenerSupport;
import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.data.ExerciseSensor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class j_HeartRateSensorManager extends a_HeartRateSensor {
   private final Handler g = new Handler();
   private b_BleScanner h;
   private s i;
   private final j_BluetoothStatusHandler j;
   private final Set k;
   private i l;
   private b_BleHeartRateSensor m;
   private boolean n;
   private boolean o;
   private e_PolarSensorListenerEx p;
   private final e_PolarSensorListenerEx q = new l(this);
   private final l_PolarSensorListener r = new m(this);
   private final BroadcastReceiver s = new n(this);
   private final fi.polar.polarflow.c.b_ble_package.h t = new o(this);

   public j_HeartRateSensorManager(Context var1) {
      super(var1);
      this.h = new b_BleScanner(var1);
      this.i = new s(var1);
      this.j = new j_BluetoothStatusHandler(var1);
      this.k = new HashSet();
      this.l = new i();
   }

   private void A_switchToBleSensor() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "switchToBleSensor()");
      if (!this.n && this.m != null) {
         this.n = true;
         a_stopSensor((a_Sensor)this.i);
         if (!b((a_Sensor)this.m)) {
            b_startSensor((a_Sensor)this.m, (l_PolarSensorListener)this.r);
         }
      }

   }

   private void B_switchToInDeviceSensor() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "switchToInDeviceSensor()");
      if (this.n) {
         this.n = false;
         a_stopSensor((a_Sensor)this.m);
         this.m = null;
         if (!b((a_Sensor)this.i)) {
            b_startSensor((a_Sensor)this.i, (l_PolarSensorListener)this.q);
         }
      }

   }

   private void C() {
      List var1 = this.h.c();
      fi.polar.polarflow.c.b_ble_package.a var2 = this.a(var1);
      if (var2 != null) {
         this.h.a();
         this.m = this.a(var2);
         b_startSensor((a_Sensor)this.m, (l_PolarSensorListener)this.r);
      } else {
         var2 = this.b(var1);
         if (var2 != null) {
            this.m = this.a(var2);
            this.s_broadcastPairingConfirmationNeeded();
         } else if (!this.h.b()) {
            this.h.a(this.t);
         }
      }

   }

   private void D_onBluetoothEnabled() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBluetoothEnabled()");
      if (!this.n) {
         this.h.a();
         this.m = null;
         this.h.a(this.t);
      }

   }

   private void E_onBluetoothDisabled() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBluetoothDisabled()");
      if (this.h.b()) {
         this.h.a();
      }

      if (this.n) {
         this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.c_SEARCHING);
         this.B_switchToInDeviceSensor();
      }

   }

   private fi.polar.polarflow.c.b_ble_package.a a(List var1) {
      Iterator var2 = var1.iterator();

      fi.polar.polarflow.c.b_ble_package.a var3;
      do {
         if (!var2.hasNext()) {
            var3 = null;
            break;
         }

         var3 = (fi.polar.polarflow.c.b_ble_package.a)var2.next();
      } while(!var3.d() || this.a(var3.a().getAddress()));

      return var3;
   }

   private b_BleHeartRateSensor a(fi.polar.polarflow.c.b_ble_package.a var1) {
      b_BleHeartRateSensor var2 = this.l.a(this.a_context, var1.a(), var1.e());
      var2.b(var1.c());
      return var2;
   }

   // $FF: synthetic method
   static b_BleHeartRateSensor a(j_HeartRateSensorManager var0, fi.polar.polarflow.c.b_ble_package.a var1) {
      return var0.a(var1);
   }

   // $FF: synthetic method
   static b_BleHeartRateSensor a(j_HeartRateSensorManager var0, b_BleHeartRateSensor var1) {
      var0.m = var1;
      return var1;
   }

   private static void a_stopSensor(a_Sensor var0) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "stopSensor(" + var0 + ")");
      if (var0 != null) {
         if (var0 instanceof i_PolarSensorListenerSupport) {
            ((i_PolarSensorListenerSupport)var0).a_setPolarSensorListener((l_PolarSensorListener)null);
         }

         var0.c_stop();
      }

   }

   // $FF: synthetic method
   static void a(a_Sensor var0, l_PolarSensorListener var1) {
      b_startSensor(var0, var1);
   }

   // $FF: synthetic method
   static void a(j_HeartRateSensorManager var0) {
      var0.D_onBluetoothEnabled();
   }

   // $FF: synthetic method
   static boolean a(j_HeartRateSensorManager var0, String var1) {
      return var0.a(var1);
   }

   private boolean a(String var1) {
      return this.k.contains(var1.toUpperCase(Locale.US));
   }

   private fi.polar.polarflow.c.b_ble_package.a b(List var1) {
      Iterator var2 = var1.iterator();

      fi.polar.polarflow.c.b_ble_package.a var6;
      while(true) {
         if (!var2.hasNext()) {
            var6 = null;
            break;
         }

         var6 = (fi.polar.polarflow.c.b_ble_package.a)var2.next();
         if (!var6.d() && !this.a(var6.a().getAddress())) {
            b_BleScanner var3 = this.h;
            int var4 = var6.b();
            boolean var5;
            if (var6.c() == 107) {
               var5 = true;
            } else {
               var5 = false;
            }

            if (var3.a(var4, var5)) {
               break;
            }
         }
      }

      return var6;
   }

   private static void b_startSensor(a_Sensor var0, l_PolarSensorListener var1) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "startSensor(" + var0 + ")");
      if (var0 != null) {
         if (var0 instanceof i_PolarSensorListenerSupport) {
            ((i_PolarSensorListenerSupport)var0).a_setPolarSensorListener(var1);
         }

         var0.b_start();
      }

   }

   // $FF: synthetic method
   static void b(j_HeartRateSensorManager var0) {
      var0.E_onBluetoothDisabled();
   }

   // $FF: synthetic method
   static void b(j_HeartRateSensorManager var0, String var1) {
      var0.b(var1);
   }

   private void b(String var1) {
      this.k.add(var1.toUpperCase(Locale.US));
   }

   private static boolean b(a_Sensor var0) {
      boolean var1;
      if (var0.e_getState() != m_SENSOR_STATE.c_SEARCHING && var0.e_getState() != m_SENSOR_STATE.d_READY) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   // $FF: synthetic method
   static boolean c(j_HeartRateSensorManager var0) {
      return var0.o;
   }

   // $FF: synthetic method
   static boolean d(j_HeartRateSensorManager var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static void e(j_HeartRateSensorManager var0) {
      var0.y_onInDeviceSensorDisabled();
   }

   // $FF: synthetic method
   static void f(j_HeartRateSensorManager var0) {
      var0.z_onInDeviceSensorSearching();
   }

   // $FF: synthetic method
   static void g(j_HeartRateSensorManager var0) {
      var0.x_onInDeviceSensorReady();
   }

   // $FF: synthetic method
   static e_PolarSensorListenerEx h(j_HeartRateSensorManager var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static void i(j_HeartRateSensorManager var0) {
      var0.v_onBleSensorDisconnected();
   }

   // $FF: synthetic method
   static void j(j_HeartRateSensorManager var0) {
      var0.w_onBleSensorSearching();
   }

   // $FF: synthetic method
   static void k(j_HeartRateSensorManager var0) {
      var0.t_onBleSensorReady();
   }

   // $FF: synthetic method
   static void l(j_HeartRateSensorManager var0) {
      var0.u_onBleSensorConnectFailed();
   }

   // $FF: synthetic method
   static Handler m(j_HeartRateSensorManager var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static b_BleHeartRateSensor n(j_HeartRateSensorManager var0) {
      return var0.m;
   }

   // $FF: synthetic method
   static b_BleScanner o(j_HeartRateSensorManager var0) {
      return var0.h;
   }

   private a_HeartRateSensor p() {
      Object var1;
      if (this.n) {
         var1 = this.m;
      } else {
         var1 = this.i;
      }

      return (a_HeartRateSensor)var1;
   }

   // $FF: synthetic method
   static l_PolarSensorListener p(j_HeartRateSensorManager var0) {
      return var0.r;
   }

   private void q() {
      IntentFilter var1 = new IntentFilter();
      var1.addAction("TrainingService.action.TRAINING_STARTED");
      var1.addAction("fi.polar.polarflow.ACTION_SENSOR_PAIRING_CONFIRMED");
      var1.addAction("fi.polar.polarflow.ACTION_SENSOR_PAIRING_DECLINED");
      this.o().a_registerReceiver(this.s, var1);
   }

   // $FF: synthetic method
   static void q(j_HeartRateSensorManager var0) {
      var0.s_broadcastPairingConfirmationNeeded();
   }

   private void r() {
      this.o().a_unregisterReceiver(this.s);
   }

   // $FF: synthetic method
   static void r(j_HeartRateSensorManager var0) {
      var0.C();
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c.b_ble_package.h s(j_HeartRateSensorManager var0) {
      return var0.t;
   }

   private void s_broadcastPairingConfirmationNeeded() {
      Intent var1 = new Intent("fi.polar.polarflow.ACTION_SENSOR_PAIRING_CONFIRMATION_NEEDED");
      var1.putExtras(this.m.k());
      this.o().a_sendBroadcast(var1);
   }

   private void t_onBleSensorReady() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBleSensorReady()");
      this.A_switchToBleSensor();
      this.a_setState(m_SENSOR_STATE.d_READY, true);
   }

   private void u_onBleSensorConnectFailed() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBleSensorConnectFailed()");
      if (!this.m.p()) {
         this.b(this.m.q());
         a_stopSensor((a_Sensor)this.m);
         this.m = null;
         this.C();
      }

   }

   private void v_onBleSensorDisconnected() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBleSensorDisconnected()");
      this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.c_SEARCHING);
      this.n = false;
      b_startSensor((a_Sensor)this.i, (l_PolarSensorListener)this.q);
   }

   private void w_onBleSensorSearching() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBleSensorSearching()");
      this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.c_SEARCHING);
   }

   private void x_onInDeviceSensorReady() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onInDeviceSensorReady()");
      this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.d_READY);
   }

   private void y_onInDeviceSensorDisabled() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onInDeviceSensorDisabled()");
      if (this.h.b()) {
         this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.c_SEARCHING);
      } else {
         this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.a_DISABLED);
      }

   }

   private void z_onInDeviceSensorSearching() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onInDeviceSensorSearching()");
      this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.c_SEARCHING);
   }

   public void a_setPolarSensorListener(l_PolarSensorListener var1) {
      this.p = (e_PolarSensorListenerEx)var1;
   }

   protected void a_setState(m_SENSOR_STATE var1, boolean var2) {
      super.a_setState(var1, var2);
      if (var1 != m_SENSOR_STATE.d_READY) {
         this.a(0);
      }

   }

   public void b_start() {
      if (!this.o) {
         this.o = true;
         this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.c_SEARCHING);
         this.q();
         this.j.a((fi.polar.polarflow.c.b_ble_package.m)(new k(this)));
         this.k.clear();
         this.m = null;
         this.n = false;
         this.h.a(2);
         this.h.a(fi.polar.polarflow.c.b_ble_package.i.b);
         this.h.a(fi.polar.polarflow.util.i.a(this.a_context, "PAIRING_RSSI_THRESHOLD_POLAR", -55), fi.polar.polarflow.util.i.a(this.a_context, "PAIRING_RSSI_THRESHOLD_OTHER", -55));
         this.h.a(this.t);
         b_startSensor((a_Sensor)this.i, (l_PolarSensorListener)this.q);
      } else {
         this.d_broadcastStateChanged();
      }

   }

   public void c_stop() {
      this.a_setState(m_SENSOR_STATE.b_NOT_READY, true);
      if (this.o) {
         this.o = false;
         this.j.a();
         this.r();
         a_stopSensor((a_Sensor)this.i);
         a_stopSensor((a_Sensor)this.m);
         this.h.a();
         this.g.removeCallbacksAndMessages((Object)null);
      }

      this.m();
   }

   public void h() {
      if (this.o) {
         this.p().h();
      }

   }

   public void i() {
      if (this.o) {
         this.p().h();
      }

   }

   public ExerciseSensor j() {
      a_HeartRateSensor var1 = this.p();
      ExerciseSensor var2;
      if (var1 != null) {
         var2 = var1.j();
      } else {
         var2 = null;
      }

      return var2;
   }

   protected Bundle k() {
      Bundle var1;
      if (this.n) {
         var1 = this.m.k();
      } else {
         var1 = this.i.k();
      }

      var1.putSerializable("fi.polar.polarflow.SENSOR_STATE", this.e_getState());
      return var1;
   }
}
