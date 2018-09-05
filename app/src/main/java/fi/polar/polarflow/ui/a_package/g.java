package fi.polar.polarflow.ui.a_package;

import android.util.Pair;
import android.view.View;
import android.widget.TextView;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.ui.exeview.a_package.a_package.bj;

public abstract class g extends fi.polar.polarflow.ui.exeview.a_package.a_package.ah {
   private static final String c = a_DataTypes.a_roundAndToString(1, 99.9990005493164D);
   protected int a = 1;
   private TextView d;
   private TextView e;
   private TextView f;
   private int g;
   private int h;

   private static Pair a(bj var0, String var1) {
      String var2 = null;
      Object var3 = null;
      int var4 = var1.length() - 3;
      String var5 = var1.substring(0, var4);
      String var6 = var1;
      if (var4 >= 3) {
         String var7;
         if (var0 == bj.c && var4 == 4) {
            var7 = (String)var3;
         } else {
            var7 = var1.substring(var4, var4 + 3);
         }

         var6 = var5;
         var2 = var7;
      }

      return Pair.create(var6, var2);
   }

   private void b(float var1) {
      String var2;
      if (this.p() == 2) {
         var2 = fi.polar.polarflow.ui.o.a(var1, this.a);
      } else {
         var2 = fi.polar.polarflow.ui.o.b(var1, this.a);
      }

      Pair var3 = a(this.l(), var2);
      var2 = (String)var3.first;
      String var4 = (String)var3.second;
      if (this.l() == bj.c) {
         if (var2.length() == 3) {
            this.d.setGravity(this.g | 8388613);
         } else if (var2.length() >= 4) {
            this.d.setGravity(this.g);
         }
      }

      if (var4 != null) {
         this.e.setVisibility(0);
         this.e.setText(var4);
      } else {
         this.e.setVisibility(8);
         this.e.setText((CharSequence)null);
      }

      this.d.setText(var2);
   }

   private void c(float var1) {
      this.e.setVisibility(8);
      this.e.setText("");
      float var2 = a_DataTypes.a_adjust(1, var1);
      String var3;
      if (this.h == 1) {
         var1 = fi.polar.polarflow.ui.o.e(var2);
         var3 = a_DataTypes.a_roundAndToString(this.a, (double)var1);
      } else {
         var3 = a_DataTypes.a_roundAndToString(this.a, (double)var2);
      }

      if (var3.length() > 4) {
         this.d(var2);
      } else {
         this.d.setText(var3);
      }

   }

   private void d(float var1) {
      byte var2;
      if (this.a == 18) {
         var2 = 3;
      } else {
         var2 = 1;
      }

      String var3;
      if (this.h == 1) {
         this.f.setText(2131231098);
         var3 = fi.polar.polarflow.ui.o.a(var1, var2);
      } else {
         this.f.setText(2131230860);
         var3 = fi.polar.polarflow.ui.o.b(var1, var2);
      }

      String var4 = var3;
      if (var3.length() > 5) {
         var4 = c;
      }

      this.d.setText(var4);
   }

   public int a() {
      int var1;
      switch(fi.polar.polarflow.ui.a_package.h.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968658;
         break;
      case 2:
         var1 = 2130968657;
         break;
      case 3:
         var1 = 2130968656;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   public void a(float var1) {
      var1 = a_DataTypes.a_adjust(1, var1);
      if (this.n()) {
         this.c(var1);
      } else {
         this.b(var1);
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.d = (TextView)var1.findViewById(2131755265);
      this.g = this.d.getGravity();
      this.e = (TextView)var1.findViewById(2131755266);
      this.f = (TextView)var1.findViewById(2131755264);
      if (this.n()) {
         if (this.P != null) {
            this.h = this.P.getInt(fi.polar.polarflow.ui.exeview.a_package.a_package.ah.O, 0);
         } else {
            this.h = fi.polar.polarflow.util.u.a().k();
         }

         this.a = 17;
         if (this.h == 0) {
            this.f.setText(2131230861);
         } else {
            this.f.setText(2131230943);
         }
      } else if (this.p() == 2) {
         this.f.setText(2131231098);
      }

   }

   protected void b(String var1) {
      this.d.setText(var1);
   }
}
