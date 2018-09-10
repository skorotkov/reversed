package fi.polar.polarflow.c.b_ble_package;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.lang.ref.WeakReference;
import java.util.Locale;

class e extends ScanCallback {
   private final WeakReference a;

   e(b_BleScanner var1) {
      this.a = new WeakReference(var1);
   }

   public void onScanFailed(int var1) {
      if (this.a.get() != null) {
         b_BleScanner.a((b_BleScanner)this.a.get(), var1);
      }

   }

   public void onScanResult(int var1, ScanResult var2) {
      super.onScanResult(var1, var2);
      b_BleScanner var3 = (b_BleScanner)this.a.get();
      if (var3 != null && var3.b()) {
         var1 = i.a(var2.getScanRecord());
         boolean var4;
         if (var1 == 107) {
            var4 = true;
         } else {
            var4 = false;
         }

         String var5 = var2.getDevice().getAddress().toUpperCase(Locale.US);
         a var6 = (a) b_BleScanner.a(var3).get(var5);
         if (var6 == null) {
            fi.polar.polarflow.util.d.c("BleScanner", "onScanResult(): Found: " + var5 + " \"" + var2.getDevice().getName() + "\"");
            String var8;
            if (var4) {
               var8 = fi.polar.polarflow.util.c.a(var2.getDevice().getName());
            } else {
               var8 = null;
            }

            boolean var7 = b_BleScanner.a(var3, var8, var5, var4);
            var6 = new a(var2.getDevice(), var2.getScanRecord(), var8, var2.getRssi(), var1, var7);
            b_BleScanner.a(var3).put(var5, var6);
            if (var7) {
               b_BleScanner.a(var3, var6);
            } else if (var3.a(var2.getRssi(), var4)) {
               b_BleScanner.b(var3, var6);
            }
         } else {
            var1 = var6.b();
            var6.a(var2.getRssi());
            if (!var6.d() && !var3.a(var1, var4) && var3.a(var2.getRssi(), var4)) {
               fi.polar.polarflow.util.d.c("BleScanner", "onScanResult(): Entered into close range: " + var5 + " \"" + var2.getDevice().getName() + "\"");
               b_BleScanner.b(var3, var6);
            }
         }
      }

   }
}
