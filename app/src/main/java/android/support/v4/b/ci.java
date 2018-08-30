package android.support.v4.b;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

class ci extends cf {
   public Notification a(bw var1, bx var2) {
      cy var3 = new cy(var1.a, var1.F, var1.d(), var1.c(), var1.h, var1.f, var1.i, var1.d, var1.e, var1.g, var1.p, var1.q, var1.r, var1.l, var1.j, var1.n, var1.w, var1.y, var1.s, var1.t, var1.u, var1.C, var1.D);
      br.a((bp)var3, (ArrayList)var1.v);
      br.a((bq)var3, (ck)var1.m);
      Notification var4 = var2.a(var1, var3);
      if (var1.m != null) {
         Bundle var5 = this.a(var4);
         if (var5 != null) {
            var1.m.a(var5);
         }
      }

      return var4;
   }

   public Bundle a(Notification var1) {
      return cx.a(var1);
   }
}
