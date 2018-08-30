package android.support.v7.widget;

import android.view.View;
import android.view.View.OnClickListener;

class gr implements OnClickListener {
   final android.support.v7.view.menu.a a;
   // $FF: synthetic field
   final gq b;

   gr(gq var1) {
      this.b = var1;
      this.a = new android.support.v7.view.menu.a(this.b.a.getContext(), 0, 16908332, 0, 0, this.b.b);
   }

   public void onClick(View var1) {
      if (this.b.c != null && this.b.d) {
         this.b.c.onMenuItemSelected(0, this.a);
      }

   }
}
