package fi.polar.polarflow.ui.exeview.laps.a_package;

import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.Lap;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import fi.polar.polarflow.ui.exeview.laps.n;
import fi.polar.polarflow.ui.exeview.laps.a_package.a_package.e;
import fi.polar.polarflow.ui.exeview.laps.a_package.a_package.f;
import fi.polar.polarflow.ui.exeview.laps.a_package.a_package.g;
import java.util.Iterator;

public class c extends n {
   private final Lap a;

   public c(Lap var1, SportProfileSettings var2) {
      super(d.a(var2, true));
      this.a = var1;
   }

   public void a(View var1) {
      super.a((View)var1);
      ((TextView)var1.findViewById(2131755176)).setText(var1.getContext().getString(2131230848, new Object[]{this.a.getLapNumber()}));
   }

   public void d() {
      if (this.c()) {
         Iterator var1 = this.e().iterator();

         while(var1.hasNext()) {
            ah var2 = (ah)var1.next();
            if (var2 instanceof fi.polar.polarflow.ui.exeview.laps.a_package.a_package.c) {
               ((g)var2).d(this.a.getDurationMillis());
            } else if (var2 instanceof fi.polar.polarflow.ui.exeview.laps.a_package.a_package.b) {
               ((fi.polar.polarflow.ui.exeview.laps.a_package.a_package.b)var2).a(this.a.getDistance());
            } else if (var2 instanceof f) {
               ((f)var2).b(this.a.getAvgSpeed());
            } else if (var2 instanceof fi.polar.polarflow.ui.exeview.laps.a_package.a_package.d) {
               ((fi.polar.polarflow.ui.exeview.laps.a_package.a_package.d)var2).a(this.a.getAvgHR());
            } else if (var2 instanceof e) {
               ((e)var2).a(this.a.getMaxHR());
            }
         }
      }

   }
}
