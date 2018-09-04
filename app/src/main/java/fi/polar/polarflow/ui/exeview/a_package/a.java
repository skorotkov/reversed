package fi.polar.polarflow.ui.exeview.a_package;

import android.view.View;
import fi.polar.polarflow.ui.exeview.j;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.List;

public class a extends j {
   private List a;

   public int a() {
      int var1;
      switch(this.a.size()) {
      case 1:
         var1 = 2130968615;
         break;
      case 2:
         var1 = 2130968616;
         break;
      case 3:
         var1 = 2130968617;
         break;
      case 4:
         var1 = 2130968618;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   protected View a(View var1, /*ah*/fi.polar.polarflow.ui.exeview.i var2) {
      return e.a(var1, ((ah)(var2)).j());
   }

   public void a(List var1) {
      this.a = var1;
   }

   public List e() {
      return this.a;
   }

   public int f() {
      return this.a.size();
   }
}
