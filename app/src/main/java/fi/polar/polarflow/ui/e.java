package fi.polar.polarflow.ui;

import android.content.Context;
import android.support.v7.widget.ey;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

final class e extends fi.polar.polarflow.ui.custom.c {
   private final LayoutInflater a;
   private final Menu b;

   e(Context var1, Menu var2) {
      this.a = LayoutInflater.from(var1);
      this.b = var2;
   }

   public int a() {
      return this.b.size();
   }

   public int a(int var1) {
      return this.b.getItem(var1).getItemId();
   }

   // $FF: synthetic method
   public ey a(ViewGroup var1, int var2) {
      return this.c(var1, var2);
   }

   public void a(ey var, int var2) {
      f var1 = (f)var;
      MenuItem var3 = this.b.getItem(var2);
      f.a(var1).setTag(var3.getItemId());
   }

   public f c(ViewGroup var1, int var2) {
      switch(var2) {
      case 2131755548:
         var2 = 2130968707;
         break;
      case 2131755549:
         var2 = 2130968705;
         break;
      case 2131755550:
         var2 = 2130968706;
         break;
      case 2131755551:
         var2 = 2130968704;
         break;
      default:
         var2 = 2130968703;
      }

      return new f(this.a.inflate(var2, var1, false));
   }
}
