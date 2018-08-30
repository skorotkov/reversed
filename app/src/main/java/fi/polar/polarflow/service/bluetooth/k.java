package fi.polar.polarflow.service.bluetooth;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import java.util.List;

public class k {
   private final BluetoothLeScanner a;

   public k(BluetoothLeScanner var1) {
      this.a = var1;
   }

   public void a(ScanCallback var1) {
      this.a.stopScan(var1);
   }

   public void a(List var1, ScanSettings var2, ScanCallback var3) {
      this.a.startScan(var1, var2, var3);
   }
}
