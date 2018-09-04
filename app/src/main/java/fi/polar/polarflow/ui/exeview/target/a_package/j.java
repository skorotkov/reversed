package fi.polar.polarflow.ui.exeview.target.a_package;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.Collection;

public class j extends ah {
   public int a() {
      return 2130968676;
   }

   public void a(Intent var1) {
   }

   public void a(View var1) {
      TextView var2 = (TextView)var1.findViewById(2131755310);
      if (var2 != null && this.Q.getTrainingSessionTarget() != null) {
         var2.setText(this.Q.getTrainingSessionTarget().getName());
      }

   }

   public void a(Collection var1) {
   }

   public void d() {
   }
}
