package fi.polar.polarflow.ui.exeview.laps.b.a;

import fi.polar.polarflow.ui.exeview.a.a.ah;
import fi.polar.polarflow.ui.exeview.a.a.bj;
import fi.polar.polarflow.ui.exeview.a.a.y;

public class a {
   private int a;
   private int b;
   private bj c;

   public ah a() {
      Object var1;
      switch(this.b) {
      case 6:
         var1 = new c();
         break;
      case 7:
         var1 = new g();
         break;
      case 24:
         var1 = new d();
         break;
      case 25:
         var1 = new e();
         break;
      case 38:
         var1 = new b();
         break;
      case 44:
         var1 = new f();
         break;
      default:
         var1 = new y();
      }

      ((ah)var1).f(this.b);
      ((ah)var1).e(this.a);
      ((ah)var1).a(this.c);
      return (ah)var1;
   }

   public a a(int var1) {
      this.a = var1;
      return this;
   }

   public a a(bj var1) {
      this.c = var1;
      return this;
   }

   public a b(int var1) {
      this.b = var1;
      return this;
   }
}
