package fi.polar.polarflow.ui.exeview.laps.a.a;

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
      case 8:
         var1 = new g();
         break;
      case 200:
         var1 = new d();
         break;
      case 201:
         var1 = new c();
         break;
      case 204:
         var1 = new f();
         break;
      case 205:
         var1 = new b();
         break;
      case 210:
         var1 = new e();
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
