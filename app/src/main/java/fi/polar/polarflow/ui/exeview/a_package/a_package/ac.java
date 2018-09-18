package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.Training;
import java.util.Collection;

public class ac extends ab {
   private void e() {
      if (this.P != null) {
         this.a(this.P.getInt(v, -1));
      } else if (Training.getInstance().isRunning()) {
         int var1 = Math.round(Training.getInstance().getStatistics().getHeartrateStatistics().c_getAverage());
         int var2 = var1;
         if (var1 == 0) {
            var2 = Math.round(Training.getInstance().getStatistics().getHeartrateStatistics().i_getMostResentSample());
         }

         this.a(var2);
      }

   }

   public void a(Intent var1) {
      if (var1.getAction().equals("fi.polar.polarflow.ACTION_HR_DATA")) {
         this.e();
      }

   }

   public void a(View var1) {
      super.a(var1);
      TextView var2 = (TextView)var1.findViewById(2131755292);
      if (var2 != null) {
         var2.setVisibility(0);
         var2.setText(2131230851);
      } else {
         TextView var3 = (TextView)var1.findViewById(2131755285);
         if (var3 != null) {
            var3.setText(2131230852);
         }
      }

   }

   public void a(Collection var1) {
      this.e();
   }

   public void d() {
      this.e();
   }
}
