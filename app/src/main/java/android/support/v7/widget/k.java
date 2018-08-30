package android.support.v7.widget;

import android.content.Context;
import android.view.View;

class k extends android.support.v7.view.menu.z {
   // $FF: synthetic field
   final j a;

   public k(j var1, Context var2, android.support.v7.view.menu.ak var3, View var4) {
      super(var2, var3, var4, false, android.support.v7.a.b.actionOverflowMenuStyle);
      this.a = var1;
      if (!((android.support.v7.view.menu.p)var3.getItem()).j()) {
         Object var5;
         if (var1.g == null) {
            var5 = (View)android.support.v7.widget.j.c(var1);
         } else {
            var5 = var1.g;
         }

         this.a((View)var5);
      }

      this.a(var1.k);
   }

   protected void e() {
      this.a.i = null;
      this.a.l = 0;
      super.e();
   }
}
