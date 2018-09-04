package fi.polar.polarflow.ui.exeview.target.a_package;

import android.view.View;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.List;

public class n extends fi.polar.polarflow.ui.exeview.j {
   protected List a;
   private fi.polar.polarflow.ui.exeview.target.h c;

   public n() {
      this.c = fi.polar.polarflow.ui.exeview.target.h.h;
   }

   public int a() {
      return 2130968795;
   }

   protected View a(View var1, fi.polar.polarflow.ui.exeview.i var) {
      ah var2 = (ah)var;
      return var1.findViewWithTag(var2.k());
   }

   public void a(fi.polar.polarflow.ui.exeview.target.h var1) {
      this.c = var1;
   }

   public void a(List var1) {
      this.a = var1;
   }

   protected List e() {
      return this.a;
   }

   public fi.polar.polarflow.ui.exeview.target.h f() {
      return this.c;
   }

   public List g() {
      return this.a;
   }
}
