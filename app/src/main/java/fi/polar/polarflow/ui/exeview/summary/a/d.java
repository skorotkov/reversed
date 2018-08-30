package fi.polar.polarflow.ui.exeview.summary.a;

import android.os.Bundle;
import android.view.View;
import fi.polar.polarflow.ui.exeview.a.a.ah;
import java.util.List;

public class d extends fi.polar.polarflow.ui.exeview.j {
   protected Bundle a;
   private fi.polar.polarflow.ui.exeview.summary.g c;
   private List d;
   private String e;

   public d() {
      this.c = fi.polar.polarflow.ui.exeview.summary.g.C;
      this.a = null;
   }

   public int a() {
      int var1;
      switch(fi.polar.polarflow.ui.exeview.summary.a.e.a[this.c.ordinal()]) {
      case 1:
         var1 = 2130968789;
         break;
      case 2:
         var1 = 2130968786;
         break;
      case 3:
         var1 = 2130968790;
         break;
      default:
         var1 = 2130968787;
      }

      return var1;
   }

   protected View a(View var1, ah var2) {
      return var1.findViewWithTag(var2.k());
   }

   public void a(fi.polar.polarflow.ui.exeview.summary.g var1) {
      this.c = var1;
   }

   public void a(List var1) {
      this.d = var1;
   }

   public void b(Bundle var1) {
      this.a = var1;
   }

   public void b(String var1) {
      this.e = var1;
   }

   protected List e() {
      return this.d;
   }

   public List f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }
}
