package fi.polar.polarflow.ui.exeview.summary.a;

import android.content.Context;
import android.os.Bundle;
import fi.polar.polarflow.ui.exeview.a.a.ai;
import fi.polar.polarflow.ui.exeview.a.a.bj;
import fi.polar.polarflow.ui.exeview.a.a.y;
import java.util.ArrayList;
import java.util.List;

public class f {
   private fi.polar.polarflow.ui.exeview.summary.g a;
   private Bundle b;
   private List c;

   public f() {
      this.a = fi.polar.polarflow.ui.exeview.summary.g.C;
      this.b = null;
   }

   private void a(List var1, int var2) {
      i var3 = new i();
      var3.a(var2);
      var3.b(this.b);
      var3.a(this.c);
      var1.add(var3);
   }

   public d a(Context var1) {
      Object var2;
      if (this.a == fi.polar.polarflow.ui.exeview.summary.g.a) {
         var2 = new n();
      } else {
         var2 = new d();
      }

      ((d)var2).a(this.a);
      ((d)var2).b(this.b);
      ArrayList var3 = new ArrayList();
      switch(e.a[this.a.ordinal()]) {
      case 1:
         ((d)var2).b(this.b);
         break;
      case 2:
         ((d)var2).b(var1.getString(2131230865));
         g var12 = new g();
         var12.b(this.b);
         var3.add(var12);
         break;
      case 3:
         ((d)var2).b(var1.getString(2131230863));
         o var11 = new o();
         var11.b(this.b);
         var3.add(var11);
         break;
      case 4:
         c var10 = new c();
         var10.b(this.b);
         var3.add(var10);
         break;
      case 5:
         var3.add((new ai()).b(2).a(bj.a).a());
         break;
      case 6:
         var3.add((new ai()).b(3).a(bj.a).a(this.b).a());
         break;
      case 7:
         var3.add((new ai()).b(37).a(bj.a).a(this.b).a());
         break;
      case 8:
         var3.add((new ai()).b(21).a(bj.a).a(this.b).a());
         var3.add((new ai()).b(22).a(bj.a).a(this.b).a());
         break;
      case 9:
         var3.add((new ai()).b(21).a(bj.a).a(this.b).a());
         break;
      case 10:
         var3.add((new ai()).b(22).a(bj.a).a(this.b).a());
         break;
      case 11:
         var3.add((new ai()).b(42).a(bj.a).a(this.b).a());
         var3.add((new ai()).b(43).a(bj.a).a(this.b).a());
         break;
      case 12:
         var3.add((new ai()).b(42).a(bj.a).a(this.b).a());
         break;
      case 13:
         var3.add((new ai()).b(43).a(bj.a).a(this.b).a());
         break;
      case 14:
         var3.add((new ai()).b(27).a(bj.a).a(this.b).a());
         break;
      case 15:
         ((d)var2).b(var1.getString(2131230902));
         fi.polar.polarflow.ui.exeview.summary.a.a.a var9 = new fi.polar.polarflow.ui.exeview.summary.a.a.a();
         var9.b(this.b);
         var3.add(var9);
         break;
      case 16:
         b var8 = new b();
         var8.b(this.b);
         var3.add(var8);
         break;
      case 17:
         ((d)var2).b(var1.getString(2131230920));
         fi.polar.polarflow.ui.exeview.summary.a.b.a var7 = new fi.polar.polarflow.ui.exeview.summary.a.b.a();
         var7.b(this.b);
         var3.add(var7);
         break;
      case 18:
         a var6 = new a();
         var6.b(this.b);
         var3.add(var6);
         break;
      case 19:
         var3.add((new ai()).b(11).a(bj.a).a(this.b).a());
         break;
      case 20:
         var3.add((new ai()).b(12).a(bj.a).a(this.b).a());
         break;
      case 21:
         var3.add((new ai()).b(50).a(bj.a).a(this.b).a());
         break;
      case 22:
         var3.add((new ai()).b(240).a(bj.a).a(this.b).a());
         break;
      case 23:
         l var5 = new l();
         var5.b(this.b);
         var3.add(var5);
         break;
      case 24:
         this.a(var3, 0);
         break;
      case 25:
         this.a(var3, 1);
         break;
      case 26:
         this.a(var3, 2);
         break;
      case 27:
         this.a(var3, 3);
         break;
      case 28:
         m var4 = new m();
         var4.b(this.b);
         var3.add(var4);
         break;
      default:
         var3.add(new y());
      }

      ((d)var2).a((List)var3);
      return (d)var2;
   }

   public f a(Bundle var1) {
      this.b = var1;
      return this;
   }

   public f a(fi.polar.polarflow.ui.exeview.summary.g var1) {
      this.a = var1;
      return this;
   }

   public f a(List var1) {
      this.c = var1;
      return this;
   }
}
