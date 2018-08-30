package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class v extends f implements OnMenuItemClickListener {
   // $FF: synthetic field
   final r a;

   v(r var1, OnMenuItemClickListener var2) {
      super(var2);
      this.a = var1;
   }

   public boolean onMenuItemClick(MenuItem var1) {
      return ((OnMenuItemClickListener)this.b).onMenuItemClick(this.a.a(var1));
   }
}
