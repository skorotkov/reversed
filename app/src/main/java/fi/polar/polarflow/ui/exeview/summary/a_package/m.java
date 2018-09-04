package fi.polar.polarflow.ui.exeview.summary.a_package;

import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.Collection;

public class m extends ah {
   private TextView a;

   public int a() {
      return 2130968689;
   }

   public void a(View var1) {
      super.a(var1);
      this.a = (TextView)var1.findViewById(2131755348);
      int var2 = Math.round(this.P.getFloat(ah.M, -1.0F));
      if (var2 > 0) {
         this.a.setText(String.valueOf(var2));
      }

   }

   public void a(Collection var1) {
   }
}
