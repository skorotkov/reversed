package fi.polar.polarflow.ui.exeview.summary.a.a;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.ui.exeview.a.a.ah;
import fi.polar.polarflow.util.k;
import fi.polar.polarmathsmart.runningindex.ExerciseRunningIndexCalculatorAndroidImpl;
import fi.polar.polarmathsmart.types.RunningPerformanceLevel;
import java.util.Collection;
import java.util.Map;

public class a extends ah {
   private static final Map a = new b(RunningPerformanceLevel.class);

   private static int a(int var0) {
      k var1 = new k(PhysData.getUserPhysData());
      RunningPerformanceLevel var2 = (new ExerciseRunningIndexCalculatorAndroidImpl(var1.u(), var1.v())).getPerformanceLevel(var0, var1.p(), var1.r());
      if (var2 != null && a.containsKey(var2)) {
         var0 = (Integer)a.get(var2);
      } else {
         var0 = 0;
      }

      return var0;
   }

   public int a() {
      return 2130968682;
   }

   public void a(Intent var1) {
   }

   public void a(View var1) {
      if (this.P != null) {
         int var2 = this.P.getInt(E, -1);
         if (var2 != -1) {
            TextView var3 = (TextView)var1.findViewById(2131755324);
            ((TextView)var1.findViewById(2131755325)).setText(String.valueOf(var2));
            var2 = a(var2);
            if (var2 != 0) {
               var3.setText(var2);
            } else {
               var3.setVisibility(8);
            }
         }
      }

   }

   public void a(Collection var1) {
   }

   public void d() {
   }
}
