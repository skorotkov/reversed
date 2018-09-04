package fi.polar.polarflow.c_package.c_package;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import fi.polar.polarflow.data.orm.BleDevice;

class f extends BluetoothGattCallback {
   // $FF: synthetic field
   final b a;

   f(b var1) {
      this.a = var1;
   }

   private boolean a(int var1) {
      boolean var2 = true;
      boolean var3 = b.i(this.a).isEnabled();
      boolean var4 = this.a.p();
      if (!var3 || var1 != 133 || (!var4 || b.m(this.a) >= 10) && b.m(this.a) >= 3) {
         var2 = false;
      }

      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "btEnabled=" + var3 + ", gattStatus=" + var1 + ", paired=" + var4 + ", failCount=" + b.m(this.a) + " -> shouldRetry=" + var2);
      return var2;
   }

   public void onCharacteristicChanged(BluetoothGatt var1, BluetoothGattCharacteristic var2) {
      if (fi.polar.polarflow.c_package.b_package.i.i.equals(var2.getUuid())) {
         b.a(this.a, var2);
      }

   }

   public void onCharacteristicRead(BluetoothGatt var1, BluetoothGattCharacteristic var2, int var3) {
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "onCharacteristicRead(uuid=" + var2.getUuid() + ", status=" + var3 + ")");
      if (fi.polar.polarflow.c_package.b_package.i.h.equals(var2.getUuid())) {
         b.a(this.a, var2, var3);
      } else if (fi.polar.polarflow.c_package.b_package.i.d.equals(var2.getUuid())) {
         b.b(this.a, var2, var3);
      } else if (fi.polar.polarflow.c_package.b_package.i.e.equals(var2.getUuid())) {
         b.c(this.a, var2, var3);
      } else if (fi.polar.polarflow.c_package.b_package.i.f.equals(var2.getUuid())) {
         b.d(this.a, var2, var3);
      } else if (fi.polar.polarflow.c_package.b_package.i.g.equals(var2.getUuid())) {
         b.e(this.a, var2, var3);
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

      fi.polar.polarflow.util.d.c("BleHeartRateSensor", var4.append(var6).append(this.a.q()).append(" \"").append(b.g(this.a)).append("\"").toString());
      b.h(this.a);
      int var5 = b.e(this.a);
      b.a(this.a, var3);
      if (var3 == 2) {
         b.b((b)this.a, 0);
         if (!b.a(this.a).d()) {
            fi.polar.polarflow.util.d.e("BleHeartRateSensor", "BluetoothGatt.discoverServices() returned false -> disconnect");
            b.b(this.a, fi.polar.polarflow.c_package.m.a);
            b.c(this.a);
         }
      } else if (b.d(this.a)) {
         if (var5 == 2) {
            b.c(this.a, fi.polar.polarflow.c_package.m.a);
            if (b.i(this.a).isEnabled()) {
               b.j(this.a);
            } else {
               fi.polar.polarflow.util.d.c("BleHeartRateSensor", "Unable to reconnect. Bluetooth is not enabled");
            }
         } else {
            b.k(this.a);
            b.a(this.a).c();
            if (this.a(var2)) {
               b.l(this.a);
            } else {
               b.d(this.a, fi.polar.polarflow.c_package.m.a);
            }
         }
      } else {
         b.e(this.a, fi.polar.polarflow.c_package.m.b);
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
      BleDevice var3 = b.n(this.a);
      if (var3 != null) {
         b.a(this.a, var3.getManufacturerName());
         b.b(this.a, var3.getModelName());
         b.c(this.a, var3.getMacType());
         b.a(this.a, true);
      } else {
         b.o(this.a);
      }

   }
}
