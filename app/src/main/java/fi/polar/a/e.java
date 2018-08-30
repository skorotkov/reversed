package fi.polar.a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

class e extends BluetoothGattCallback {
   // $FF: synthetic field
   final d a;

   e(d var1) {
      this.a = var1;
   }

   public void onCharacteristicChanged(BluetoothGatt var1, BluetoothGattCharacteristic var2) {
      a var3 = (a)d.l(this.a).get(var2.getUuid());
      fi.polar.a.a.b.c(d.d(), "onCharacteristicChanged(characteristic=" + var2.getUuid() + ")");
      if (var3 != null) {
         var3.a(var2.getValue());
      } else {
         fi.polar.a.a.b.d(d.d(), "onCharacteristicChanged(no handler for characteristic=" + var2.getUuid() + ")");
      }

   }

   public void onCharacteristicRead(BluetoothGatt var1, BluetoothGattCharacteristic var2, int var3) {
      fi.polar.a.a.b.c(d.d(), "onCharacteristicRead(characteristic=" + var2.getUuid() + ", status=" + fi.polar.a.a.b.b(var3) + ")");
      if (fi.polar.a.a.a.c.equals(var2.getUuid())) {
         d.c(this.a, var3);
      }

   }

   public void onCharacteristicWrite(BluetoothGatt var1, BluetoothGattCharacteristic var2, int var3) {
      fi.polar.a.a.b.c(d.d(), "onCharacteristicWrite(characteristic=" + var2.getUuid() + ", status=" + fi.polar.a.a.b.b(var3) + ")");
      d.j(this.a).lock();

      try {
         d.b(this.a, false);
         d.k(this.a).signalAll();
      } finally {
         d.j(this.a).unlock();
      }

   }

   public void onConnectionStateChange(BluetoothGatt var1, int var2, int var3) {
      fi.polar.a.a.b.b(d.d(), "onConnectionStateChange(status=" + fi.polar.a.a.b.b(var2) + ", newState=" + fi.polar.a.a.b.a(var3) + ")");
      d.a(this.a).a(var1);
      if (var3 == 2) {
         d.a(this.a, 0);
         if (d.b(this.a) == i.b) {
            if (d.c(this.a)) {
               d.a(this.a, false);
               d.a(this.a).e();
            }

            if (!d.a(this.a).d()) {
               this.onServicesDiscovered(var1, 257);
            }
         } else {
            d.d(this.a);
         }
      } else {
         d.d(this.a);
         j var4 = d.b(this.a, var2);
         if (var4 != j.a) {
            d.e(this.a);
            if (var4 == j.c) {
               d.a(this.a).c();
               d.f(this.a);
            } else if (var4 == j.b && !d.g(this.a)) {
               d.h(this.a);
               d.a(this.a).c();
            }
         } else {
            d.h(this.a);
            d.a(this.a).c();
         }
      }

   }

   public void onDescriptorRead(BluetoothGatt var1, BluetoothGattDescriptor var2, int var3) {
      fi.polar.a.a.b.c(d.d(), "onDescriptorRead(descriptor=" + var2.getUuid() + ", status=" + fi.polar.a.a.b.b(var3) + ")");
   }

   public void onDescriptorWrite(BluetoothGatt var1, BluetoothGattDescriptor var2, int var3) {
      fi.polar.a.a.b.c(d.d(), "onDescriptorWrite(descriptor=" + var2.getUuid() + ", status=" + fi.polar.a.a.b.b(var3) + ")");
      if (fi.polar.a.a.a.a.equals(var2.getUuid())) {
         if (fi.polar.a.a.a.c.equals(var2.getCharacteristic().getUuid())) {
            d.a(this.a, var3, var2.getValue());
         } else if (fi.polar.a.a.a.e.equals(var2.getCharacteristic().getUuid())) {
            d.b(this.a, var3, var2.getValue());
         }
      }

   }

   public void onMtuChanged(BluetoothGatt var1, int var2, int var3) {
      fi.polar.a.a.b.c(d.d(), "onMtuChanged(mtu=" + var2 + ", status=" + fi.polar.a.a.b.b(var3) + ")");
   }

   public void onReadRemoteRssi(BluetoothGatt var1, int var2, int var3) {
      fi.polar.a.a.b.c(d.d(), "onReadRemoteRssi(rssi=" + var2 + ", status=" + fi.polar.a.a.b.b(var3) + ")");
   }

   public void onReliableWriteCompleted(BluetoothGatt var1, int var2) {
      fi.polar.a.a.b.c(d.d(), "onReliableWriteCompleted(status=" + fi.polar.a.a.b.b(var2) + ")");
   }

   public void onServicesDiscovered(BluetoothGatt var1, int var2) {
      fi.polar.a.a.b.c(d.d(), "onServicesDiscovered(" + fi.polar.a.a.b.b(var2) + ")");
      boolean var3;
      if (var2 == 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4 = var3;
      if (var3) {
         var4 = d.i(this.a);
      }

      if (!var4) {
         d.h(this.a);
         d.a(this.a).b();
         d.a(this.a).c();
         d.a(this.a, true);
      }

   }
}
