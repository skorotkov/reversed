package fi.polar.polarflow.service.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;

public class i {
   private final BluetoothAdapter a;

   public i(BluetoothManager var1) {
      BluetoothAdapter var2;
      if (var1 != null) {
         var2 = var1.getAdapter();
      } else {
         var2 = null;
      }

      this.a = var2;
   }

   public BluetoothDevice a(String var1) {
      BluetoothDevice var2;
      if (this.a != null) {
         var2 = this.a.getRemoteDevice(var1);
      } else {
         var2 = null;
      }

      return var2;
   }

   public boolean a() {
      boolean var1;
      if (this.a != null) {
         var1 = this.a.isEnabled();
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean b() {
      boolean var1;
      if (this.a != null) {
         var1 = this.a.enable();
      } else {
         var1 = false;
      }

      return var1;
   }

   public k c() {
      k var1;
      if (this.a != null) {
         var1 = new k(this.a.getBluetoothLeScanner());
      } else {
         var1 = null;
      }

      return var1;
   }
}
