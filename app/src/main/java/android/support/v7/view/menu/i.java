package android.support.v7.view.menu;

import android.os.SystemClock;
import android.support.v7.widget.dd;
import android.view.MenuItem;

class i implements dd {
   // $FF: synthetic field
   final g a;

   i(g var1) {
      this.a = var1;
   }

   public void a(m var1, MenuItem var2) {
      this.a.a.removeCallbacksAndMessages(var1);
   }

   public void b(m var1, MenuItem var2) {
      this.a.a.removeCallbacksAndMessages((Object)null);
      int var3 = 0;
      int var4 = this.a.b.size();

      while(true) {
         if (var3 >= var4) {
            var3 = -1;
            break;
         }

         if (var1 == ((k)this.a.b.get(var3)).b) {
            break;
         }

         ++var3;
      }

      if (var3 != -1) {
         ++var3;
         k var5;
         if (var3 < this.a.b.size()) {
            var5 = (k)this.a.b.get(var3);
         } else {
            var5 = null;
         }

         j var8 = new j(this, var5, var2, var1);
         long var6 = SystemClock.uptimeMillis();
         this.a.a.postAtTime(var8, var1, var6 + 200L);
      }

   }
}
