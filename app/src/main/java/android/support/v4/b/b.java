package android.support.v4.b;

import android.app.Activity;
import android.content.pm.PackageManager;

final class b implements Runnable {
   // $FF: synthetic field
   final String[] a;
   // $FF: synthetic field
   final Activity b;
   // $FF: synthetic field
   final int c;

   b(String[] var1, Activity var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void run() {
      int[] var1 = new int[this.a.length];
      PackageManager var2 = this.b.getPackageManager();
      String var3 = this.b.getPackageName();
      int var4 = this.a.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         var1[var5] = var2.checkPermission(this.a[var5], var3);
      }

      ((c)this.b).onRequestPermissionsResult(this.c, this.a, var1);
   }
}
