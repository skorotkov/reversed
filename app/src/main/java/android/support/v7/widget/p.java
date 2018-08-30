package android.support.v7.widget;

import android.content.Context;
import android.view.View;

class p extends android.support.v7.view.menu.z {
   // $FF: synthetic field
   final j a;

   public p(j var1, Context var2, android.support.v7.view.menu.m var3, View var4, boolean var5) {
      super(var2, var3, var4, var5, android.support.v7.a.b.actionOverflowMenuStyle);
      this.a = var1;
      this.a(8388613);
      this.a(var1.k);
   }

   protected void e() {
      if (android.support.v7.widget.j.a(this.a) != null) {
         android.support.v7.widget.j.b(this.a).close();
      }

      this.a.h = null;
      super.e();
   }
}
