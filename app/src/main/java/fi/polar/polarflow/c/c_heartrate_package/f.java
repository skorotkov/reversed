package fi.polar.polarflow.c.c_heartrate_package;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.data.orm.BleDevice;

class f extends BluetoothGattCallback {
   // $FF: synthetic field
   final b_BleHeartRateSensor a;

   f(b_BleHeartRateSensor var1) {
      this.a = var1;
   }

   private boolean a(int var1) {
      boolean var2 = true;
      boolean var3 = b_BleHeartRateSensor.i(this.a).isEnabled();
      boolean var4 = this.a.p();
      if (!var3 || var1 != 133 || (!var4 || b_BleHeartRateSensor.m(this.a) >= 10) && b_BleHeartRateSensor.m(this.a) >= 3) {
         var2 = false;
      }

      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "btEnabled=" + var3 + ", gattStatus=" + var1 + ", paired=" + var4 + ", failCount=" + b_BleHeartRateSensor.m(this.a) + " -> shouldRetry=" + var2);
      return var2;
   }

   public void onCharacteristicChanged(BluetoothGatt var1, BluetoothGattCharacteristic var2) {
      if (fi.polar.polarflow.c.b_ble_package.i.i.equals(var2.getUuid())) {
         b_BleHeartRateSensor.a(this.a, var2);
      }

   }

   public void onCharacteristicRead(BluetoothGatt var1, BluetoothGattCharacteristic var2, int var3) {
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "onCharacteristicRead(uuid=" + var2.getUuid() + ", status=" + var3 + ")");
      if (fi.polar.polarflow.c.b_ble_package.i.h.equals(var2.getUuid())) {
         b_BleHeartRateSensor.a(this.a, var2, var3);
      } else if (fi.polar.polarflow.c.b_ble_package.i.d.equals(var2.getUuid())) {
         b_BleHeartRateSensor.b(this.a, var2, var3);
      } else if (fi.polar.polarflow.c.b_ble_package.i.e.equals(var2.getUuid())) {
         b_BleHeartRateSensor.c(this.a, var2, var3);
      } else if (fi.polar.polarflow.c.b_ble_package.i.f.equals(var2.getUuid())) {
         b_BleHeartRateSensor.d(this.a, var2, var3);
      } else if (fi.polar.polarflow.c.b_ble_package.i.g.equals(var2.getUuid())) {
         b_BleHeartRateSensor.e(this.a, var2, var3);
      }

   }

   public void onConnectionStateChange(BluetoothGatt var1, int var2, int var3) {
      StringBuilder var4 = (new StringBuilder()).append("onConnectionStateChange(): ");
      String var6;
      if (var3 == 2) {
         var6 = "CONNECTED: ";
      } else {
         var6 = "DISCONNECTED: ";
      }

      fi.polar.polarflow.util.d.c("BleHeartRateSensor", var4.append(var6).append(this.a.q()).append(" \"").append(b_BleHeartRateSensor.g(this.a)).append("\"").toString());
      b_BleHeartRateSensor.h(this.a);
      int var5 = b_BleHeartRateSensor.e(this.a);
      b_BleHeartRateSensor.a(this.a, var3);
      if (var3 == 2) {
         b_BleHeartRateSensor.b((b_BleHeartRateSensor)this.a, 0);
         if (!b_BleHeartRateSensor.a(this.a).d()) {
            fi.polar.polarflow.util.d.e("BleHeartRateSensor", "BluetoothGatt.discoverServices() returned false -> disconnect");
            b_BleHeartRateSensor.b(this.a, m_SENSOR_STATE.a_DISABLED);
            b_BleHeartRateSensor.c(this.a);
         }
      } else if (b_BleHeartRateSensor.d(this.a)) {
         if (var5 == 2) {
            b_BleHeartRateSensor.c(this.a, m_SENSOR_STATE.a_DISABLED);
            if (b_BleHeartRateSensor.i(this.a).isEnabled()) {
               b_BleHeartRateSensor.j(this.a);
            } else {
               fi.polar.polarflow.util.d.c("BleHeartRateSensor", "Unable to reconnect. Bluetooth is not enabled");
            }
         } else {
            b_BleHeartRateSensor.k(this.a);
            b_BleHeartRateSensor.a(this.a).c();
            if (this.a(var2)) {
               b_BleHeartRateSensor.l(this.a);
            } else {
               b_BleHeartRateSensor.d(this.a, m_SENSOR_STATE.a_DISABLED);
            }
         }
      } else {
         b_BleHeartRateSensor.e(this.a, m_SENSOR_STATE.b_NOT_READY);
      }

   }

   public void onDescriptorWrite(BluetoothGatt var1, BluetoothGattDescriptor var2, int var3) {
      if (var3 == 0) {
         fi.polar.polarflow.util.d.c("BleHeartRateSensor", "onDescriptorWrite(uuid=" + var2.getUuid() + ", status=" + var3 + ")");
      } else {
         fi.polar.polarflow.util.d.e("BleHeartRateSensor", "onDescriptorWrite(uuid=" + var2.getUuid() + ", status=" + var3 + ")");
      }

   }

   public void onServicesDiscovered(BluetoothGatt var1, int var2) {
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "onServicesDiscovered(status=" + var2 + ")");
      BleDevice var3 = b_BleHeartRateSensor.n(this.a);
      if (var3 != null) {
         b_BleHeartRateSensor.a(this.a, var3.getManufacturerName());
         b_BleHeartRateSensor.b(this.a, var3.getModelName());
         b_BleHeartRateSensor.c(this.a, var3.getMacType());
         b_BleHeartRateSensor.a(this.a, true);
      } else {
         b_BleHeartRateSensor.o(this.a);
      }

   }
}
