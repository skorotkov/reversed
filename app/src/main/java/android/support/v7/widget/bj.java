package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class bj implements Runnable {
   // $FF: synthetic field
   final ArrayList a;
   // $FF: synthetic field
   final bi b;

   bj(bi var1, ArrayList var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      Iterator var1 = this.a.iterator();

      while(var1.hasNext()) {
         bs var2 = (bs)var1.next();
         this.b.b(var2.a, var2.b, var2.c, var2.d, var2.e);
      }

      this.a.clear();
      this.b.b.remove(this.a);
   }
}
