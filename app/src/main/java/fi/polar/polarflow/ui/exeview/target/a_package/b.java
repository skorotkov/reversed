package fi.polar.polarflow.ui.exeview.target.a_package;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.Collection;

public class b extends ah {
   TextView a;
   TextView c;

   private void a(float var1) {
      float var2 = var1;
      if (var1 < 0.0F) {
         var2 = 0.0F;
      }

      String var3 = fi.polar.polarflow.ui.o.a(this.p(), var2);
      int var4 = var3.length() - 3;
      String var5;
      if (var4 == 4) {
         var5 = var3.substring(0, var4);
      } else {
         var5 = var3;
         if (var4 == 3) {
            var5 = var3.substring(0, var3.length() - 1);
         }
      }

      while((var5.endsWith("0") || var5.endsWith(".")) && var5.length() > var4) {
         var5 = var5.substring(0, var5.length() - 1);
      }

      this.a.setText(var5);
   }

   public int a() {
      return 2130968658;
   }

   public void a(Intent var1) {
   }

   public void a(View var1) {
      super.a(var1);
      float var2;
      if (this.P != null) {
         var2 = this.P.getFloat(r, -1.0F);
      } else {
         var2 = -1.0F;
      }

      this.a = (TextView)var1.findViewById(2131755265);
      this.c = (TextView)var1.findViewById(2131755264);
      if (this.p() == 2) {
         this.c.setText(2131231098);
      }

      this.a(var2);
   }

   public void a(Collection var1) {
   }

   public void d() {
   }
}
