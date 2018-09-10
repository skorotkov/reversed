package fi.polar.polarflow.c.c_heartrate_package;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.data.ExerciseSensor;
import fi.polar.polarflow.data.orm.BleDevice;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class b_BleHeartRateSensor extends a_HeartRateSensor {
   private static final long g;
   private l_PolarSensorListener A = null;
   private final boolean B;
   private Handler C = new Handler();
   private Runnable D = new c(this);
   private final Runnable E = new d(this);
   private final Runnable F = new e(this);
   private final BluetoothGattCallback G = new f(this);
   private final Handler h = new Handler();
   private BluetoothAdapter i = null;
   private fi.polar.polarflow.service.bluetooth.j j = null;
   private final BluetoothDevice k;
   private final String l;
   private int m = 0;
   private boolean n = false;
   private boolean o = false;
   private String p = null;
   private String q = null;
   private int r = 65535;
   private String s = null;
   private String t = null;
   private String u = null;
   private int v = Integer.MAX_VALUE;
   private int w = 0;
   private int x = 20000;
   private int y = 1000;
   private int z = 10000;

   static {
      g = TimeUnit.SECONDS.toMillis(5L);
   }

   public b_BleHeartRateSensor(Context var1, BluetoothDevice var2, String var3) {
      super(var1);
      this.i = ((BluetoothManager)var1.getSystemService(Context.BLUETOOTH_SERVICE)).getAdapter();
      this.j = new fi.polar.polarflow.service.bluetooth.j();
      this.k = var2;
      this.l = var3;
      boolean var4;
      if (!fi.polar.polarflow.util.y.f(var1)) {
         var4 = true;
      } else {
         var4 = false;
      }

      this.B = var4;
   }

   private void A() {
      this.h.removeCallbacks(this.E);
      this.h.postDelayed(this.E, (long)this.x);
   }

   private void B() {
      this.h.removeCallbacks(this.E);
   }

   private int C() {
      int var1 = this.y * (1 << this.w - 1);
      int var2 = var1;
      if (var1 > this.z) {
         var2 = this.z;
      }

      return var2;
   }

   private void D() {
      int var1 = this.C();
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "startRetryTimer(), timeout=" + var1);
      this.h.removeCallbacks(this.F);
      this.h.postDelayed(this.F, (long)var1);
   }

   private void E() {
      this.h.removeCallbacks(this.F);
   }

   private void F() {
      if (!this.a(fi.polar.polarflow.c.b_ble_package.i.a, fi.polar.polarflow.c.b_ble_package.i.h)) {
         this.a((BluetoothGattCharacteristic)null, 257);
      }

   }

   private void G() {
      if (!this.a(fi.polar.polarflow.c.b_ble_package.i.a, fi.polar.polarflow.c.b_ble_package.i.d)) {
         this.b((BluetoothGattCharacteristic)null, 257);
      }

   }

   private void H() {
      if (!this.a(fi.polar.polarflow.c.b_ble_package.i.a, fi.polar.polarflow.c.b_ble_package.i.e)) {
         this.c((BluetoothGattCharacteristic)null, 257);
      }

   }

   private void I() {
      if (!this.a(fi.polar.polarflow.c.b_ble_package.i.a, fi.polar.polarflow.c.b_ble_package.i.f)) {
         this.d((BluetoothGattCharacteristic)null, 257);
      }

   }

   private void J() {
      if (!this.a(fi.polar.polarflow.c.b_ble_package.i.a, fi.polar.polarflow.c.b_ble_package.i.g)) {
         this.e((BluetoothGattCharacteristic)null, 257);
      }

   }

   // $FF: synthetic method
   static int a(b_BleHeartRateSensor var0, int var1) {
      var0.m = var1;
      return var1;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.service.bluetooth.j a(b_BleHeartRateSensor var0) {
      return var0.j;
   }

   private static String a(BluetoothGattCharacteristic var0) {
      Object var1 = null;
      byte[] var2 = var0.getValue();
      String var3 = (String)var1;
      if (var2 != null) {
         var3 = (String)var1;
         if (var2.length > 0) {
            try {
               var3 = new String(var2, "UTF-8");
               var3 = var3.trim();
            } catch (UnsupportedEncodingException var4) {
               fi.polar.polarflow.util.d.b("BleHeartRateSensor", "UnsupportedEncodingException when converting value of " + var0.getUuid() + " to UTF-8 string", var4);
               var3 = (String)var1;
            }
         }
      }

      return var3;
   }

   // $FF: synthetic method
   static String a(b_BleHeartRateSensor var0, String var1) {
      var0.p = var1;
      return var1;
   }

   private void a(BluetoothGattCharacteristic var1, int var2) {
      if (var2 == 0) {
         this.p = a(var1);
      }

      this.G();
   }

   private void a(BluetoothGattDescriptor var1, boolean var2) {
      byte[] var3;
      if (var2) {
         var3 = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
      } else {
         var3 = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
      }

      if (this.j.a(var1.getCharacteristic(), var2)) {
         if (var1.setValue(var3)) {
            if (!this.j.a(var1)) {
               fi.polar.polarflow.util.d.e("BleHeartRateSensor", "BluetoothGatt.writeDescriptor() for Client Configuration Characteristic returned false");
            }
         } else {
            fi.polar.polarflow.util.d.e("BleHeartRateSensor", "BluetoothGattDescriptor.setValue() for Client Configuration Characteristic returned false");
         }
      } else {
         fi.polar.polarflow.util.d.e("BleHeartRateSensor", "BluetoothGatt.setCharacteristicNotification() returned false");
      }

   }

   // $FF: synthetic method
   static void a(b_BleHeartRateSensor var0, BluetoothGattCharacteristic var1) {
      var0.e(var1);
   }

   // $FF: synthetic method
   static void a(b_BleHeartRateSensor var0, BluetoothGattCharacteristic var1, int var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(b_BleHeartRateSensor var0, m_SENSOR_STATE var1) {
      var0.a_setState((m_SENSOR_STATE)var1);
   }

   // $FF: synthetic method
   static void a(b_BleHeartRateSensor var0, boolean var1) {
      var0.a(var1);
   }

   private void a(boolean var1) {
      BluetoothGattCharacteristic var2 = this.b(fi.polar.polarflow.c.b_ble_package.i.b, fi.polar.polarflow.c.b_ble_package.i.i);
      if (var2 != null) {
         BluetoothGattDescriptor var3 = var2.getDescriptor(fi.polar.polarflow.c.b_ble_package.i.j);
         if (var3 != null) {
            this.a(var3, var1);
         } else {
            fi.polar.polarflow.util.d.e("BleHeartRateSensor", "Could not find Client Characteristic Configuration descriptor");
         }
      } else {
         fi.polar.polarflow.util.d.e("BleHeartRateSensor", "Could not find Heart Rate Measurement characteristic");
      }

   }

   private boolean a(UUID var1, UUID var2) {
      boolean var3 = false;
      BluetoothGattCharacteristic var4 = this.b(var1, var2);
      if (var4 != null) {
         var3 = this.j.a(var4);
      }

      return var3;
   }

   private static int b(BluetoothGattCharacteristic var0) {
      byte var1;
      if ((var0.getProperties() & 1) == 1) {
         var1 = 18;
      } else {
         var1 = 17;
      }

      return var1;
   }

   // $FF: synthetic method
   static int b(b_BleHeartRateSensor var0) {
      return var0.x;
   }

   // $FF: synthetic method
   static int b(b_BleHeartRateSensor var0, int var1) {
      var0.w = var1;
      return var1;
   }

   private BluetoothGattCharacteristic b(UUID var1, UUID var2) {
      BluetoothGattService var3 = this.j.a(var1);
      BluetoothGattCharacteristic var4;
      if (var3 != null) {
         var4 = var3.getCharacteristic(var2);
      } else {
         var4 = null;
      }

      return var4;
   }

   // $FF: synthetic method
   static String b(b_BleHeartRateSensor var0, String var1) {
      var0.q = var1;
      return var1;
   }

   private void b(BluetoothGattCharacteristic var1, int var2) {
      if (var2 == 0) {
         this.q = a(var1);
      }

      if (this.r == 107) {
         this.H();
      } else {
         this.s();
         this.a(true);
      }

   }

   // $FF: synthetic method
   static void b(b_BleHeartRateSensor var0, BluetoothGattCharacteristic var1, int var2) {
      var0.b(var1, var2);
   }

   // $FF: synthetic method
   static void b(b_BleHeartRateSensor var0, m_SENSOR_STATE var1) {
      var0.a_setState((m_SENSOR_STATE)var1);
   }

   // $FF: synthetic method
   static int c(b_BleHeartRateSensor var0, int var1) {
      var0.v = var1;
      return var1;
   }

   private void c(int var1) {
      BleDevice var2 = this.r();
      if (var2 != null && !var2.getAvailableFeaturesSet().contains(var1)) {
         var2.addAvailableFeature(var1);
         var2.setLastModified(new Date(), true);
         var2.save();
         var2.publish(this.a_context);
         fi.polar.polarflow.util.w.a(this.a_context, var2.getPath() + var2.getFilename());
      }

   }

   private void c(BluetoothGattCharacteristic var1, int var2) {
      if (var2 == 0) {
         this.s = a(var1);
      }

      this.I();
   }

   // $FF: synthetic method
   static void c(b_BleHeartRateSensor var0) {
      var0.z();
   }

   // $FF: synthetic method
   static void c(b_BleHeartRateSensor var0, BluetoothGattCharacteristic var1, int var2) {
      var0.c(var1, var2);
   }

   // $FF: synthetic method
   static void c(b_BleHeartRateSensor var0, m_SENSOR_STATE var1) {
      var0.a_setState((m_SENSOR_STATE)var1);
   }

   private static boolean c(BluetoothGattCharacteristic var0) {
      boolean var1;
      if ((var0.getProperties() & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void d(BluetoothGattCharacteristic var1, int var2) {
      if (var2 == 0) {
         this.t = a(var1);
      }

      this.J();
   }

   // $FF: synthetic method
   static void d(b_BleHeartRateSensor var0, BluetoothGattCharacteristic var1, int var2) {
      var0.d(var1, var2);
   }

   // $FF: synthetic method
   static void d(b_BleHeartRateSensor var0, m_SENSOR_STATE var1) {
      var0.a_setState((m_SENSOR_STATE)var1);
   }

   private static boolean d(BluetoothGattCharacteristic var0) {
      boolean var1;
      if ((var0.getProperties() & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   // $FF: synthetic method
   static boolean d(b_BleHeartRateSensor var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static int e(b_BleHeartRateSensor var0) {
      return var0.m;
   }

   private void e(BluetoothGattCharacteristic var1) {
      int var2 = b(var1);
      Integer var3 = var1.getIntValue(var2, 1);
      byte var6;
      if (var2 == 18) {
         var6 = 2;
      } else {
         var6 = 1;
      }

      int var4 = var6 + 1;
      if (var3 != null && var3 > 0) {
         if (var3 != this.n()) {
            fi.polar.polarflow.util.d.c("BleHeartRateSensor", "Heart rate: " + var3);
         }

         this.a(var3);
         this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.d_READY);
         if (this.B) {
            this.C.removeCallbacksAndMessages((Object)null);
            this.C.postDelayed(this.D, g);
         }
      } else {
         fi.polar.polarflow.util.d.c("BleHeartRateSensor", "Heart rate: " + var3);
         this.a(0);
         this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.c_SEARCHING);
      }

      var2 = var4;
      if (c(var1)) {
         var3 = var1.getIntValue(18, var4);
         fi.polar.polarflow.util.d.c("BleHeartRateSensor", "Energy expended: " + var3);
         var2 = var4 + 2;
      }

      if (d(var1)) {
         ArrayList var7 = new ArrayList();

         for(var4 = var1.getValue().length; var4 - var2 >= 2; var2 += 2) {
            Integer var5 = var1.getIntValue(18, var2);
            if (var5 == null) {
               break;
            }

            var7.add(var5);
         }

         if (!this.o && var7.size() > 0) {
            this.c(2);
            this.o = true;
         }
      }

      this.l();
   }

   private void e(BluetoothGattCharacteristic var1, int var2) {
      if (var2 == 0) {
         this.u = a(var1);
      }

      this.s();
      this.a(true);
   }

   // $FF: synthetic method
   static void e(b_BleHeartRateSensor var0, BluetoothGattCharacteristic var1, int var2) {
      var0.e(var1, var2);
   }

   // $FF: synthetic method
   static void e(b_BleHeartRateSensor var0, m_SENSOR_STATE var1) {
      var0.a_setState((m_SENSOR_STATE)var1);
   }

   // $FF: synthetic method
   static void f(b_BleHeartRateSensor var0) {
      var0.x();
   }

   // $FF: synthetic method
   static String g(b_BleHeartRateSensor var0) {
      return var0.t();
   }

   // $FF: synthetic method
   static void h(b_BleHeartRateSensor var0) {
      var0.B();
   }

   // $FF: synthetic method
   static BluetoothAdapter i(b_BleHeartRateSensor var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static void j(b_BleHeartRateSensor var0) {
      var0.y();
   }

   // $FF: synthetic method
   static int k(b_BleHeartRateSensor var0) {
      int var1 = var0.w;
      var0.w = var1 + 1;
      return var1;
   }

   // $FF: synthetic method
   static void l(b_BleHeartRateSensor var0) {
      var0.D();
   }

   // $FF: synthetic method
   static int m(b_BleHeartRateSensor var0) {
      return var0.w;
   }

   // $FF: synthetic method
   static BleDevice n(b_BleHeartRateSensor var0) {
      return var0.r();
   }

   // $FF: synthetic method
   static void o(b_BleHeartRateSensor var0) {
      var0.F();
   }

   // $FF: synthetic method
   static l_PolarSensorListener p(b_BleHeartRateSensor var0) {
      return var0.A;
   }

   private BleDevice r() {
      BleDevice var1 = null;
      if (this.r == 107) {
         var1 = BleDevice.findByDeviceId(this.l);
      }

      BleDevice var2 = var1;
      if (var1 == null) {
         var2 = BleDevice.findByMac(this.q());
      }

      return var2;
   }

   private void s() {
      BluetoothDevice var1 = this.j.e();
      if (var1 != null) {
         BleDevice var2 = new BleDevice();
         var2.setPaired(new Date(), true);
         var2.setLastModified(new Date(), true);
         var2.setName(var1.getName());
         if (this.r == 107 && this.l != null) {
            var2.setDeviceId(this.l);
            var2.setManufacturer(1);
            var2.setHardwareVersion(this.t);
            var2.setFirmwareVersion(this.s);
            var2.setSoftwareVersion(fi.polar.polarflow.util.q.f(this.u));
         } else {
            var2.setManufacturer(2);
            var2.setMac(var1.getAddress(), 0);
         }

         var2.setManufacturerName(this.p);
         var2.setModelName(this.q);
         var2.addAvailableFeature(1);
         if (this.j.a(fi.polar.polarflow.c.b_ble_package.i.c) != null) {
            var2.addAvailableFeature(26);
         }

         var2.save();
         var2.publish(this.a_context);
         fi.polar.polarflow.util.w.a(this.a_context, var2.getPath() + var2.getFilename());
      }

   }

   private String t() {
      String var1 = null;
      BluetoothDevice var2 = this.j.e();
      if (var2 != null) {
         var1 = var2.getName();
      }

      String var3 = var1;
      if (var1 == null) {
         var3 = this.k.getName();
      }

      return var3;
   }

   private int u() {
      int var1;
      if (this.v != Integer.MAX_VALUE) {
         var1 = this.v;
      } else {
         var1 = 0;
      }

      return var1;
   }

   private boolean v() {
      boolean var1 = true;
      boolean var2 = var1;
      if (this.m != 1) {
         if (this.m == 2) {
            var2 = var1;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   private void w() {
      this.o = false;
      this.p = null;
      this.q = null;
      this.w = 0;
      this.E();
      this.x();
   }

   private void x() {
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "connect(): " + this.q() + " \"" + this.t() + "\"");
      this.m = 1;
      this.A();
      this.j.a(this.k, this.a_context, false, this.G, 2);
   }

   private void y() {
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "reconnect()");
      this.m = 1;
      if (!this.j.a()) {
         fi.polar.polarflow.util.d.e("BleHeartRateSensor", "BluetoothGatt.connect() returned false");
         this.m = 0;
      }

   }

   private void z() {
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "disconnect()");
      this.B();
      this.E();
      if (this.v()) {
         this.j.b();
      }

      this.j.c();
      this.m = 0;
   }

   public void a_setPolarSensorListener(l_PolarSensorListener var1) {
      this.A = var1;
   }

   public void b_start() {
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "start()");
      this.n = true;
      if (!this.v()) {
         this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.c_SEARCHING, true);
         this.w();
      } else {
         this.d_broadcastStateChanged();
      }

   }

   public void b(int var1) {
      this.r = var1;
   }

   public void c_stop() {
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "stop()");
      this.n = false;
      this.z();
      this.h.removeCallbacksAndMessages((Object)null);
      this.C.removeCallbacksAndMessages((Object)null);
      this.a_setState((m_SENSOR_STATE) m_SENSOR_STATE.b_NOT_READY);
   }

   protected void d_broadcastStateChanged() {
      if (this.A != null) {
         this.h.post(new h(this, this.e_getState()));
      }

   }

   public ExerciseSensor j() {
      return new ExerciseSensor(this.q().toUpperCase(Locale.US), this.u(), this.t(), this.l);
   }

   protected Bundle k() {
      Bundle var1 = super.k();
      var1.putString("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_NAME", this.t());
      var1.putString("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_MODEL_NUMBER", this.q);
      var1.putString("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_ADDRESS", this.q());
      return var1;
   }

   protected void l() {
      if (this.A != null) {
         this.h.post(new g(this, this.n()));
      }

   }

   public boolean p() {
      boolean var1;
      if (this.r() != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public String q() {
      return this.k.getAddress();
   }
}
