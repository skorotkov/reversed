package fi.polar.polarflow.ui.a;

import android.view.View;
import android.widget.TextView;

public abstract class a extends fi.polar.polarflow.ui.exeview.a.a.ag {
   protected TextView a;
   private TextView c;

   public int a() {
      int var1;
      switch(fi.polar.polarflow.ui.a.b.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968647;
         break;
      case 2:
         var1 = 2130968646;
         break;
      case 3:
         var1 = 2130968645;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   protected void a(int var1) {
      if (this.c != null) {
         this.c.setText(var1);
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.a = (TextView)var1.findViewById(2131755235);
      this.c = (TextView)var1.findViewById(2131755233);
      if (this.p() == 2) {
         ((TextView)var1.findViewById(2131755234)).setText(2131231097);
      }

   }
}
