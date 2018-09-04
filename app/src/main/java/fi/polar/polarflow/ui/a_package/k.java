package fi.polar.polarflow.ui.a_package;

import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.data.orm.SportProfile;

public abstract class k extends fi.polar.polarflow.ui.exeview.a_package.a_package.ah {
   protected TextView a;
   protected SportProfileSettings c;
   private TextView d;
   private TextView e;
   private int f;
   private int g = 0;

   public int a() {
      int var1;
      switch(l.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968666;
         break;
      case 2:
         var1 = 2130968665;
         break;
      case 3:
         var1 = 2130968664;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   public void a(int var1) {
      if (this.f == 3) {
         this.a.setText(fi.polar.polarflow.ui.o.a(this.a.getContext(), (float)var1, (float)this.g));
      } else {
         this.a.setText(fi.polar.polarflow.ui.o.c(this.a.getContext(), var1));
      }

   }

   protected void a(int var1, int var2) {
      if (this.d != null) {
         this.d.setText(var1);
      }

      if (this.e != null) {
         this.e.setVisibility(0);
         this.e.setText(var2);
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.d = (TextView)var1.findViewById(2131755285);
      this.e = (TextView)var1.findViewById(2131755292);
      if (this.P == null) {
         SportProfile var2 = this.Q.getSportProfile();
         if (var2 != null) {
            this.c = var2.getSettings();
            this.f = this.c.getHeartRateView();
         }
      } else {
         this.f = this.P.getInt(x, -1);
      }

      this.a = (TextView)var1.findViewById(2131755287);
      if (this.f == 3) {
         this.g = fi.polar.polarflow.ui.o.a();
         ((TextView)var1.findViewById(2131755286)).setText(2131231108);
      }

   }
}
