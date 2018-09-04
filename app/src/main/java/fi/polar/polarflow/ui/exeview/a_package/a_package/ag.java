package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.view.View;

public abstract class ag extends ah {
   private View a;

   protected float a(bj var1, int var2) {
      float var3;
      if (var1 == bj.c) {
         if (var2 < 4) {
            var3 = this.a.getResources().getDimension(2131362011);
         } else if (var2 < 5) {
            var3 = this.a.getResources().getDimension(2131362012);
         } else {
            var3 = this.a.getResources().getDimension(2131362013);
         }
      } else if (var1 == bj.b) {
         if (var2 < 4) {
            var3 = this.a.getResources().getDimension(2131362024);
         } else {
            var3 = this.a.getResources().getDimension(2131362022);
         }
      } else if (var2 < 4) {
         var3 = this.a.getResources().getDimension(2131362043);
      } else {
         var3 = this.a.getResources().getDimension(2131362041);
      }

      return var3;
   }

   public void a(View var1) {
      super.a(var1);
      this.a = var1;
   }
}
