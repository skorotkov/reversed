package fi.polar.polarflow.service.bluetooth;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class l {
   private final BluetoothManager a;
   private final i b;

   public l(Context var1) {
      this.a = (BluetoothManager)var1.getSystemService("bluetooth");
      this.b = new i(this.a);
   }

   public i a() {
      i var1;
      if (this.a != null) {
         var1 = this.b;
      } else {
         var1 = null;
      }

      return var1;
   }

   public List a(int var1) {
      Object var2;
      if (this.a != null) {
         var2 = this.a.getConnectedDevices(var1);
      } else {
         var2 = new ArrayList();
      }

      return (List)var2;
   }
}
