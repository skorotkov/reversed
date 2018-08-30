package android.support.v7.widget;

import android.view.MenuItem;

class u implements android.support.v7.view.menu.n {
   // $FF: synthetic field
   final ActionMenuView a;

   u(ActionMenuView var1) {
      this.a = var1;
   }

   public void a(android.support.v7.view.menu.m var1) {
      if (this.a.a != null) {
         this.a.a.a(var1);
      }

   }

   public boolean a(android.support.v7.view.menu.m var1, MenuItem var2) {
      boolean var3;
      if (this.a.b != null && this.a.b.a(var2)) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }
}
