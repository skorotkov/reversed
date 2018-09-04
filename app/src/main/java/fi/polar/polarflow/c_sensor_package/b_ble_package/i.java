package fi.polar.polarflow.c_sensor_package.b_ble_package;

import android.bluetooth.le.ScanRecord;
import android.util.SparseArray;
import java.util.UUID;

public class i {
   public static final UUID a = UUID.fromString("0000180a-0000-1000-8000-00805f9b34fb");
   public static final UUID b = UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb");
   public static final UUID c = UUID.fromString("0000180f-0000-1000-8000-00805f9b34fb");
   public static final UUID d = UUID.fromString("00002a24-0000-1000-8000-00805f9b34fb");
   public static final UUID e = UUID.fromString("00002a26-0000-1000-8000-00805f9b34fb");
   public static final UUID f = UUID.fromString("00002a27-0000-1000-8000-00805f9b34fb");
   public static final UUID g = UUID.fromString("00002a28-0000-1000-8000-00805f9b34fb");
   public static final UUID h = UUID.fromString("00002a29-0000-1000-8000-00805f9b34fb");
   public static final UUID i = UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb");
   public static final UUID j = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

   public static int a(ScanRecord var0) {
      SparseArray var2 = var0.getManufacturerSpecificData();
      int var1;
      if (var2.size() > 0) {
         var1 = var2.keyAt(0);
      } else {
         var1 = 65535;
      }

      return var1;
   }
}
