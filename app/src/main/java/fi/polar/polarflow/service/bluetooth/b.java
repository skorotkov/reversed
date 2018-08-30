package fi.polar.polarflow.service.bluetooth;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;

class b extends BluetoothGattCallback {
   // $FF: synthetic field
   final a a;

   b(a var1) {
      this.a = var1;
   }

   public void onConnectionStateChange(BluetoothGatt var1, int var2, int var3) {
      fi.polar.polarflow.util.d.c(fi.polar.polarflow.service.bluetooth.a.d(), "onConnectionStateChange(status=" + var2 + ", newState=" + var3 + ")");
      fi.polar.polarflow.service.bluetooth.a.a(this.a).a(var1);
      if (var3 == 2) {
         if (!fi.polar.polarflow.service.bluetooth.a.a(this.a).d()) {
            this.onServicesDiscovered(var1, 257);
         }
      } else {
         fi.polar.polarflow.service.bluetooth.a.b(this.a);
         fi.polar.polarflow.service.bluetooth.a.a(this.a).c();
         fi.polar.polarflow.service.bluetooth.a.c(this.a);
      }

   }

   public void onServicesDiscovered(BluetoothGatt var1, int var2) {
      fi.polar.polarflow.util.d.c(fi.polar.polarflow.service.bluetooth.a.d(), "onServicesDiscovered(status=" + var2 + ")");
      fi.polar.polarflow.service.bluetooth.a.b(this.a);
      if (var2 == 0 && fi.polar.polarflow.service.bluetooth.a.a(this.a).a(fi.polar.polarflow.service.bluetooth.a.d(this.a)) != null) {
         fi.polar.polarflow.service.bluetooth.a.f(this.a).add(fi.polar.polarflow.service.bluetooth.a.e(this.a).getAddress());
         fi.polar.polarflow.util.d.c(fi.polar.polarflow.service.bluetooth.a.d(), "onServicesDiscovered(Found serviceUUID=" + fi.polar.polarflow.service.bluetooth.a.d(this.a).toString() + ")");
         if (fi.polar.polarflow.service.bluetooth.a.g(this.a) != null) {
            fi.polar.polarflow.service.bluetooth.a.g(this.a).a(fi.polar.polarflow.service.bluetooth.a.e(this.a));
         }
      }

      fi.polar.polarflow.service.bluetooth.a.a(this.a).b();
      fi.polar.polarflow.service.bluetooth.a.a(this.a).c();
      fi.polar.polarflow.service.bluetooth.a.c(this.a);
   }
}
