package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.View;

class cj extends ci {
   public eo a(View var1, eo var2) {
      return eo.a(ct.a(var1, eo.a(var2)));
   }

   public void a(View var1, ColorStateList var2) {
      ct.a(var1, var2);
   }

   public void a(View var1, Mode var2) {
      ct.a(var1, var2);
   }

   public void a(View var1, bq var2) {
      if (var2 == null) {
         ct.a(var1, (cv)null);
      } else {
         ct.a(var1, (cv)(new ck(this, var2)));
      }

   }

   public eo b(View var1, eo var2) {
      return eo.a(ct.b(var1, eo.a(var2)));
   }

   public String r(View var1) {
      return ct.a(var1);
   }

   public void t(View var1) {
      ct.b(var1);
   }

   public ColorStateList v(View var1) {
      return ct.c(var1);
   }

   public Mode w(View var1) {
      return ct.d(var1);
   }

   public void x(View var1) {
      ct.e(var1);
   }
}
