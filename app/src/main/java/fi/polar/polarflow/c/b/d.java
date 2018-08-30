package fi.polar.polarflow.c.b;

import java.util.Comparator;

class d implements Comparator {
   // $FF: synthetic field
   final b a;

   d(b var1) {
      this.a = var1;
   }

   public int a(a var1, a var2) {
      return var2.b() - var1.b();
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((a)var1, (a)var2);
   }
}
