package android.support.v7.view.menu;

import android.support.v4.view.bd;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

class u extends f implements bd {
   // $FF: synthetic field
   final r a;

   u(r var1, OnActionExpandListener var2) {
      super(var2);
      this.a = var1;
   }

   public boolean a(MenuItem var1) {
      return ((OnActionExpandListener)this.b).onMenuItemActionExpand(this.a.a(var1));
   }

   public boolean b(MenuItem var1) {
      return ((OnActionExpandListener)this.b).onMenuItemActionCollapse(this.a.a(var1));
   }
}
