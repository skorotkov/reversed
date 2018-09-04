package fi.polar.polarflow.ui.exeview.summary.a_package;

import android.content.Intent;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.Collection;

public class o extends ah {
   private static final SparseIntArray d = new p(18);
   private static final SparseIntArray e = new q(17);
   TextView a;
   TextView c;

   public int a() {
      return 2130968700;
   }

   public void a(Intent var1) {
   }

   public void a(View var1) {
      if (this.P != null) {
         int var2 = this.P.getInt(D, -1);
         this.a = (TextView)var1.findViewById(2131755382);
         int var3 = e.get(var2);
         if (var3 != 0) {
            this.a.setText(var3);
            this.a.setVisibility(0);
         } else {
            this.a.setVisibility(8);
         }

         this.c = (TextView)var1.findViewById(2131755383);
         var3 = d.get(var2);
         TextView var4 = this.c;
         if (var3 == 0) {
            var3 = 2131230948;
         }

         var4.setText(var3);
      }

   }

   public void a(Collection var1) {
   }

   public void d() {
   }
}
