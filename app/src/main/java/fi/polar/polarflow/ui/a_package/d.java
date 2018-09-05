package fi.polar.polarflow.ui.a_package;

import android.view.View;
import android.widget.TextView;

import fi.polar.polarflow.a_package.a_DataTypes;

public abstract class d extends fi.polar.polarflow.ui.exeview.a_package.a_package.ah {
   private TextView a;
   private TextView c;
   private TextView d;

   public int a() {
      int var1;
      switch(fi.polar.polarflow.ui.a_package.e.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968651;
         break;
      case 2:
         var1 = 2130968650;
         break;
      case 3:
         var1 = 2130968649;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   protected void a(int var1) {
      if (this.a != null) {
         this.a.setText(var1);
      }

   }

   protected void a(int var1, int var2) {
      this.a(var1);
      this.c(var2);
   }

   public void a(View var1) {
      super.a(var1);
      this.a = (TextView)var1.findViewById(2131755246);
      this.c = (TextView)var1.findViewById(2131755253);
      this.d = (TextView)var1.findViewById(2131755248);
   }

   public void b(int var1) {
      if (this.d != null) {
         this.d.setText(String.valueOf(a_DataTypes.a_adjust(9, var1)));
      }

   }

   protected void c(int var1) {
      if (this.c != null) {
         this.c.setVisibility(0);
         this.c.setText(var1);
      }

   }
}
