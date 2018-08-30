package fi.polar.polarflow.ui.exewait;

import android.os.Bundle;
import android.view.View;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

public class v extends b {
   private static final String g = v.class.getSimpleName();

   public v() {
      super(o.b);
   }

   private static List a(List var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null) {
         Iterator var4 = var0.iterator();

         while(var4.hasNext()) {
            TrainingSessionTarget var2 = (TrainingSessionTarget)var4.next();
            k var3 = new k(var2.getStartTime());
            if (fi.polar.polarflow.ui.myday.u.a((fi.polar.polarflow.ui.myday.item.e)var3, (TrainingSessionTarget)var2) != null) {
               var1.add(var3);
            } else {
               fi.polar.polarflow.util.d.e(g, "Training session target " + var2.getId() + " has no exercise target!");
            }
         }
      }

      return var1;
   }

   private void b(List var1) {
      DateTime var2 = new DateTime();
      int var3 = 0;

      while(true) {
         if (var3 >= var1.size()) {
            var3 = -1;
            break;
         }

         if (((k)var1.get(var3)).f() > var2.getMillis()) {
            break;
         }

         ++var3;
      }

      int var4 = var3;
      if (var3 == -1) {
         var4 = var1.size() - 1;
      }

      this.e = var4;
   }

   public static List d() {
      DateTime var0 = (new DateTime()).withTimeAtStartOfDay();
      return TrainingSessionTarget.getTrainingTargetsForPeriod(var0.minusDays(7).getMillis(), var0.plusDays(8).getMillis(), false);
   }

   protected List c() {
      List var1 = a(this.c.d());
      this.b(var1);
      return var1;
   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      this.f.setText(this.getString(2131230947));
   }
}
