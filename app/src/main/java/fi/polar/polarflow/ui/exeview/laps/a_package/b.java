package fi.polar.polarflow.ui.exeview.laps.a_package;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.ui.exeview.laps.e;

class b extends e {
   private TextView a;

   b(SportProfileSettings var1) {
      super(d.a(var1, false));
   }

   public void a(Intent var1) {
      super.a(var1);
      if (var1 != null && "ExerciseLapCalc.ACTION_AUTO_LAP".equals(var1.getAction())) {
         int var2 = var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", 0);
         this.a.setText(this.a.getContext().getString(2131230848, new Object[]{var2 + 1}));
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.a = (TextView)var1.findViewById(2131755176);
      Intent var2 = this.a((String)"ExerciseLapCalc.ACTION_AUTO_LAP");
      int var3;
      if (var2 != null) {
         var3 = var2.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", 0) + 1;
      } else {
         var3 = 1;
      }

      this.a.setText(var1.getContext().getString(2131230848, new Object[]{var3}));
   }
}
