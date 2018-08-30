package android.support.v7.view.menu;

import android.view.MenuItem;

class j implements Runnable {
   // $FF: synthetic field
   final k a;
   // $FF: synthetic field
   final MenuItem b;
   // $FF: synthetic field
   final m c;
   // $FF: synthetic field
   final i d;

   j(i var1, k var2, MenuItem var3, m var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public void run() {
      if (this.a != null) {
         this.d.a.d = true;
         this.a.b.a(false);
         this.d.a.d = false;
      }

      if (this.b.isEnabled() && this.b.hasSubMenu()) {
         this.c.a((MenuItem)this.b, 4);
      }

   }
}
