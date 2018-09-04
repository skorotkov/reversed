package fi.polar.polarflow.ui.exeview.laps.b_package;

import android.content.BroadcastReceiver;
import android.content.Intent;
import fi.polar.polarflow.data.Lap;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.ui.exeview.ak;
import fi.polar.polarflow.ui.exeview.laps.e;
import fi.polar.polarflow.ui.exeview.laps.n;
import java.util.List;

public class b extends fi.polar.polarflow.ui.exeview.laps.a {
   private e g;

   public b() {
      super(ak.d);
   }

   protected e a(SportProfileSettings var1) {
      if (this.g == null) {
         this.g = new a(var1);
      }

      return this.g;
   }

   protected n a(Lap var1, SportProfileSettings var2) {
      return new c(var1, var2);
   }

   protected void a(Intent var1) {
      String var2 = var1.getAction();
      byte var3 = -1;
      switch(var2.hashCode()) {
      case -2010326729:
         if (var2.equals("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA")) {
            var3 = 2;
         }
         break;
      case -1392251851:
         if (var2.equals("ExerciseLapCalc.ACTION_MANUAL_LAP")) {
            var3 = 3;
         }
         break;
      case -807142475:
         if (var2.equals("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_HR")) {
            var3 = 0;
         }
         break;
      case 748386111:
         if (var2.equals("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS")) {
            var3 = 1;
         }
      }

      switch(var3) {
      case 0:
         this.g.a(var1);
         break;
      case 1:
         this.g.a(var1);
         break;
      case 2:
         this.g.a(var1);
         break;
      case 3:
         Lap var4 = (Lap)var1.getParcelableExtra("ExerciseLapCalc.KEY_LAP");
         if (var4 != null) {
            this.a((Lap)var4);
         }

         this.g.a(var1);
      }

   }

   protected void a(fi.polar.polarflow.ui.exeview.c var1) {
      var1.a("ExerciseLapCalc.ACTION_MANUAL_LAP", true);
      var1.a("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_HR", false);
      var1.a("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS", false);
      var1.a("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA", false);
   }

   protected void j() {
      Intent var1 = this.b.a((BroadcastReceiver)null, (String)"ExerciseLapCalc.ACTION_MANUAL_LAP");
      if (var1 != null && var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", 0) > this.e.size() && this.f != null) {
         this.e.clear();
         this.e.addAll(this.f.f());
         this.a((List)this.e);
      }

   }
}
