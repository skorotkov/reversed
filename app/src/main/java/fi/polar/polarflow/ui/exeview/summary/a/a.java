package fi.polar.polarflow.ui.exeview.summary.a;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.Training;
import java.util.Collection;

class a extends fi.polar.polarflow.ui.a.a {
   private void a(double var1) {
      String var3;
      if (Double.isNaN(var1)) {
         var3 = this.a.getContext().getResources().getString(2131231094);
      } else if (this.p() == 2) {
         var3 = fi.polar.polarflow.ui.o.a(var1);
      } else {
         var3 = fi.polar.polarflow.ui.o.b(var1);
      }

      this.a.setTextSize(0, this.a(this.l(), var3.length()));
      this.a.setText(var3);
   }

   private static float b(Training var0) {
      fi.polar.polarflow.calculators.a var2 = (fi.polar.polarflow.calculators.a)var0.getStatistics().getAltitudeStatistics();
      float var1;
      if (var2.g()) {
         var1 = var2.e();
      } else {
         var1 = Float.NaN;
      }

      return var1;
   }

   private void e() {
      if (this.P != null) {
         this.a((double)this.P.getFloat(I, Float.NaN));
      } else if (this.Q.isRunning()) {
         this.a((double)b(this.Q));
      }

   }

   public int a() {
      return 2130968647;
   }

   public void a(Intent var1) {
      this.e();
   }

   public void a(View var1) {
      super.a(var1);
      TextView var2 = (TextView)var1.findViewById(2131755240);
      var2.setText(2131230893);
      var2.setVisibility(0);
   }

   public void a(Collection var1) {
      this.e();
   }

   public void d() {
      this.e();
   }
}
