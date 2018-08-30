package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class bl implements Runnable {
   // $FF: synthetic field
   final ArrayList a;
   // $FF: synthetic field
   final bi b;

   bl(bi var1, ArrayList var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      Iterator var1 = this.a.iterator();

      while(var1.hasNext()) {
         ey var2 = (ey)var1.next();
         this.b.c(var2);
      }

      this.a.clear();
      this.b.a.remove(this.a);
   }
}
