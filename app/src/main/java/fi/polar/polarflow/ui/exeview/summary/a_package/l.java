package fi.polar.polarflow.ui.exeview.summary.a_package;

import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.Collection;

public class l extends ah {
   public int a() {
      return 2130968688;
   }

   public void a(View var1) {
      super.a(var1);
      TextView var2 = (TextView)var1.findViewById(2131755025);
      int var3 = this.P.getInt(ah.N, -1);
      if (var3 != -1) {
         var2.setText(fi.polar.polarflow.ui.exeview.summary.h.a(var1.getContext(), var3));
      }

   }

   public void a(Collection var1) {
   }
}
