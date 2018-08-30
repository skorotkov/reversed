package android.support.v4.b;

import android.app.Notification;
import android.os.Bundle;

class cf implements cb {
   public Notification a(bw var1, bx var2) {
      Notification var3 = cr.a(var1.F, var1.a, var1.d(), var1.c(), var1.d, var1.e);
      if (var1.j > 0) {
         var3.flags |= 128;
      }

      if (var1.C != null) {
         var3.contentView = var1.C;
      }

      return var3;
   }

   public Bundle a(Notification var1) {
      return null;
   }
}
