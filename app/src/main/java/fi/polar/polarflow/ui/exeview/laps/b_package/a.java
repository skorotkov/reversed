package fi.polar.polarflow.ui.exeview.laps.b_package;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.ui.exeview.laps.e;

class a extends e {
   private TextView a;

   a(SportProfileSettings var1) {
      super(d.a(var1, false));
   }

   public void a(Intent var1) {
      super.a(var1);
      if (var1 != null && "ExerciseLapCalc.ACTION_MANUAL_LAP".equals(var1.getAction()) && this.c()) {
         int var2 = var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", 0);
         this.a.setText(this.a.getContext().getString(2131230892, new Object[]{var2 + 1}));
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.a = (TextView)var1.findViewById(2131755176);
      Intent var3 = this.a((String)"ExerciseLapCalc.ACTION_MANUAL_LAP");
      int var2;
      if (var3 != null) {
         var2 = var3.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", 0) + 1;
      } else {
         var2 = 1;
      }

      this.a.setText(this.a.getContext().getString(2131230892, new Object[]{var2}));
   }
}
