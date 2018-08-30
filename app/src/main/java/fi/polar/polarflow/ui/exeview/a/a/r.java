package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.view.View;
import java.util.Collection;

public class r extends q {
   private void e() {
      byte var1 = -1;
      if (this.P != null) {
         this.b(this.P.getInt(s, -1));
      } else if (this.Q.isRunning()) {
         int var2 = this.Q.getStatistics().getCadenceStatistics().d();
         if (!this.Q.getStatistics().getCadenceStatistics().b()) {
            var2 = var1;
         }

         this.b(var2);
      }

   }

   public void a(Intent var1) {
      if (var1.getAction().equals("fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA")) {
         this.e();
      }

   }

   public void a(View var1) {
      super.a((View)var1);
      this.a(2131230854, 2131230851);
   }

   public void a(Collection var1) {
      this.e();
   }

   public void d() {
      this.e();
   }
}
