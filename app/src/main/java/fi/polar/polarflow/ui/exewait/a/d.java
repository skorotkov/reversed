package fi.polar.polarflow.ui.exewait.a;

import android.util.Pair;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.ui.custom.w;
import fi.polar.polarflow.util.u;

class d implements w {
   // $FF: synthetic field
   final a a;

   d(a var1) {
      this.a = var1;
   }

   public void a(int var1) {
      byte var2;
      if (var1 == 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      var1 = u.a().j();
      int var3 = u.a().k();
      if (var2 != var3) {
         if (var3 == 0) {
            var1 = o.a(var1);
         } else {
            var1 = o.b(var1);
         }
      }

      u.a().a(var1, var2);
      Pair var4 = (Pair)fi.polar.polarflow.ui.exewait.a.a.a().get(var2);
      fi.polar.polarflow.ui.exewait.a.a.c(this.a).a(var4, fi.polar.polarflow.ui.exewait.a.a.a(var2));
      fi.polar.polarflow.ui.exewait.a.a.c(this.a).a(var1 - (Integer)var4.first, false);
      fi.polar.polarflow.ui.exewait.a.a.d(this.a).a();
      fi.polar.polarflow.ui.exewait.a.a.d(this.a).setTitle(fi.polar.polarflow.ui.exewait.a.a.a(this.a, var2));
   }
}
