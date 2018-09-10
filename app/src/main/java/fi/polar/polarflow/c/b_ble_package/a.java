package fi.polar.polarflow.c.b_ble_package;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;

public class a {
   private BluetoothDevice a;
   private ScanRecord b;
   private int c;
   private int d;
   private boolean e;
   private String f;

   public a() {
   }

   public a(BluetoothDevice var1, ScanRecord var2, String var3, int var4, int var5, boolean var6) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.f = var3;
   }

   public BluetoothDevice a() {
      return this.a;
   }

   public void a(int var1) {
      this.c = var1;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public String e() {
      return this.f;
   }
}
