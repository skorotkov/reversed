package fi.polar.polarflow.ui.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import fi.polar.polarflow.calculators.as;
import fi.polar.polarflow.calculators.bd;
import fi.polar.polarflow.data.Training;
import java.util.Collection;

public abstract class z extends fi.polar.polarflow.ui.exeview.a.a.ah {
   private TextView a;
   private TextView c;
   private RelativeLayout d;
   private boolean e;
   private TextView f;
   private final ad g;
   private Context h;
   private ab i;

   public z(ad var1) {
      this.g = var1;
   }

   // $FF: synthetic method
   static Bundle a(z var0) {
      return var0.P;
   }

   private void a(int var1, int var2) {
      if (this.a != null) {
         if (this.e) {
            this.a.setText(var2);
         } else {
            this.a.setText(var1);
         }
      }

   }

   // $FF: synthetic method
   static Bundle b(z var0) {
      return var0.P;
   }

   // $FF: synthetic method
   static Intent c(Collection var0, String var1) {
      return e(var0, var1);
   }

   // $FF: synthetic method
   static Training c(z var0) {
      return var0.Q;
   }

   // $FF: synthetic method
   static Intent d(Collection var0, String var1) {
      return e(var0, var1);
   }

   // $FF: synthetic method
   static TextView d(z var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static RelativeLayout e(z var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static Context f(z var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static ad g(z var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static Bundle h(z var0) {
      return var0.P;
   }

   // $FF: synthetic method
   static Training i(z var0) {
      return var0.Q;
   }

   // $FF: synthetic method
   static Bundle j(z var0) {
      return var0.P;
   }

   // $FF: synthetic method
   static Training k(z var0) {
      return var0.Q;
   }

   // $FF: synthetic method
   static boolean l(z var0) {
      return var0.e;
   }

   protected float a(Bundle var1) {
      return -1.0F;
   }

   public abstract float a(as var1);

   public abstract float a(bd var1);

   public int a() {
      int var1;
      switch(aa.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968685;
         break;
      case 2:
         var1 = 2130968684;
         break;
      case 3:
         var1 = 2130968683;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   public String a(float var1) {
      float var2 = var1;
      if (var1 >= 0.0F) {
         var2 = fi.polar.polarflow.a.a.a(2, var1);
      }

      return this.i.a(var2);
   }

   public void a(Intent var1) {
      this.i.a(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.h = var1.getContext();
      this.f = (TextView)var1.findViewById(2131755333);
      this.a = (TextView)var1.findViewById(2131755327);
      TextView var2 = (TextView)var1.findViewById(2131755338);
      this.c = (TextView)var1.findViewById(2131755332);
      this.d = (RelativeLayout)var1.findViewById(2131755328);
      if (this.n()) {
         this.i = new af(this);
      } else {
         this.i = new ac(this);
      }

      this.e = this.i.b();
      if (this.e) {
         this.f.setText(2131231107);
      }

      this.i.c();
      if (var2 != null) {
         if (this.g.g != -1) {
            var2.setVisibility(0);
            var2.setText(this.g.g);
         }
      } else {
         this.a(this.g.e, this.g.f);
      }

   }

   public void a(Collection var1) {
      this.i.a(var1);
   }

   protected float b(Intent var1) {
      return var1.getFloatExtra(this.g.h, this.g.j) * 3.6F;
   }

   public void b(float var1) {
      if (this.f != null) {
         this.f.setText(this.a(var1));
      }

   }

   public void d() {
      if (this.P != null) {
         this.b(this.a(this.P));
      } else if (this.Q.isRunning()) {
         this.i.a();
      }

   }
}
