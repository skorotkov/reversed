package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class bk implements Runnable {
   // $FF: synthetic field
   final ArrayList a;
   // $FF: synthetic field
   final bi b;

   bk(bi var1, ArrayList var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      Iterator var1 = this.a.iterator();

      while(var1.hasNext()) {
         br var2 = (br)var1.next();
         this.b.a(var2);
      }

      this.a.clear();
      this.b.c.remove(this.a);
   }
}
