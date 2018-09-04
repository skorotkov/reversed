package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.view.View;
import java.util.Collection;

public class s extends q {
   private void e() {
      int var1 = -1;
      if (this.P != null) {
         this.b(this.P.getInt(t, -1));
      } else if (this.Q.isRunning()) {
         int var2 = this.Q.getStatistics().getCadenceStatistics().e();
         if (this.Q.getStatistics().getCadenceStatistics().b()) {
            var1 = var2;
         }

         this.b(var1);
      }

   }

   public void a(Intent var1) {
      if (var1.getAction().equals("fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA")) {
         this.e();
      }

   }

   public void a(View var1) {
      super.a((View)var1);
      this.a(2131230896, 2131230893);
   }

   public void a(Collection var1) {
      this.e();
   }

   public void d() {
      this.e();
   }
}
