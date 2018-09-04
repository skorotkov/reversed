package fi.polar.polarflow.ui.exeview.laps.a_package.a_package;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.a_package.k;
import java.util.Collection;

public class e extends k {
   private void b(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_AUTO_LAP_DATA_HR".equals(var1.getAction())) {
         this.a(var1.getIntExtra("ExerciseLapCalc.KEY_MAX_HR", 0));
      }

   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      TextView var2 = (TextView)var1.findViewById(2131755292);
      if (var2 != null) {
         var2.setVisibility(0);
         var2.setText(2131230893);
      }

   }

   public void a(Collection var1) {
      this.b(e(var1, "ExerciseLapCalc.ACTION_AUTO_LAP_DATA_HR"));
   }

   public void d() {
      this.b(this.a((String)"ExerciseLapCalc.ACTION_AUTO_LAP_DATA_HR"));
   }
}
