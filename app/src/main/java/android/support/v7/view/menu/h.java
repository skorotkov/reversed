package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Iterator;

class h implements OnGlobalLayoutListener {
   // $FF: synthetic field
   final g a;

   h(g var1) {
      this.a = var1;
   }

   public void onGlobalLayout() {
      if (this.a.d() && this.a.b.size() > 0 && !((k)this.a.b.get(0)).a.g()) {
         View var1 = this.a.c;
         if (var1 != null && var1.isShown()) {
            Iterator var2 = this.a.b.iterator();

            while(var2.hasNext()) {
               ((k)var2.next()).a.a();
            }
         } else {
            this.a.c();
         }
      }

   }
}
