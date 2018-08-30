package android.support.v4.b;

import android.app.Notification;

public class bx {
   protected bx() {
   }

   public Notification a(bw var1, bq var2) {
      Notification var3 = var2.b();
      if (var1.C != null) {
         var3.contentView = var1.C;
      }

      return var3;
   }
}
