package android.support.v7.widget;

import android.view.MenuItem;

class gi implements v {
   // $FF: synthetic field
   final Toolbar a;

   gi(Toolbar var1) {
      this.a = var1;
   }

   public boolean a(MenuItem var1) {
      boolean var2;
      if (this.a.d != null) {
         var2 = this.a.d.a(var1);
      } else {
         var2 = false;
      }

      return var2;
   }
}
