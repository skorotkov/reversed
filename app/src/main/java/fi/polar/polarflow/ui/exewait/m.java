package fi.polar.polarflow.ui.exewait;

import android.os.Bundle;
import android.view.View;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class m extends b {
   private static final String g = m.class.getSimpleName();

   public m() {
      super(o.c);
   }

   private static List a(List var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null) {
         Iterator var4 = var0.iterator();

         while(var4.hasNext()) {
            TrainingSessionTarget var2 = (TrainingSessionTarget)var4.next();
            k var3 = new k(var2.getStartTime());
            var3.a(true);
            if (fi.polar.polarflow.ui.myday.u.a((fi.polar.polarflow.ui.myday.item.e)var3, (TrainingSessionTarget)var2) != null) {
               var1.add(var3);
            } else {
               fi.polar.polarflow.util.d.e(g, "Training session target " + var2.getId() + " has no exercise target!");
            }
         }
      }

      return var1;
   }

   public static List d() {
      return TrainingSessionTarget.getFavoriteTrainingTargets();
   }

   protected List c() {
      return a(this.c.e());
   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      this.f.setText(this.getString(2131230946));
      this.e = 0;
   }
}
