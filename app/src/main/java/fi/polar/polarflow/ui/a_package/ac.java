package fi.polar.polarflow.ui.a_package;

import android.content.Intent;

import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.data.orm.SportProfile;
import java.util.Collection;

class ac implements ab {
   // $FF: synthetic field
   final z b;

   ac(z var1) {
      this.b = var1;
   }

   public String a(float var1) {
      String var2;
      if (this.b.p() == 2) {
         if (z.l(this.b)) {
            var2 = fi.polar.polarflow.ui.o.f(z.f(this.b), var1);
         } else {
            var2 = fi.polar.polarflow.ui.o.d(z.f(this.b), var1);
         }
      } else if (z.l(this.b)) {
         var2 = fi.polar.polarflow.ui.o.e(z.f(this.b), var1);
      } else {
         var2 = fi.polar.polarflow.ui.o.c(z.f(this.b), var1);
      }

      return var2;
   }

   public void a() {
      this.b.b(this.b.a(z.k(this.b).getSpeedStatistics()));
   }

   public void a(Intent var1) {
      if (var1 != null && "fi.polar.polarflow.ACTION_LOCATION_DATA".equals(var1.getAction()) && "fi.polar.polarflow.SENSOR_CALCULATOR_TYPE_POLAR".equals(var1.getStringExtra("fi.polar.polarflow.KEY_SENSOR_CALCULATOR_TYPE"))) {
         if (!m_SENSOR_STATE.d_READY.equals(var1.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE"))) {
            if (z.g(this.b).g != -1) {
               this.b.b(this.b.b(var1));
            } else {
               this.b.b(-1.0F);
            }
         } else {
            this.b.b(this.b.b(var1));
         }
      }

   }

   public void a(Collection var1) {
      this.a(z.d(var1, "fi.polar.polarflow.ACTION_LOCATION_DATA"));
   }

   public boolean b() {
      boolean var1 = true;
      if (z.h(this.b) == null) {
         SportProfile var2 = z.i(this.b).getSportProfile();
         if (var2 != null) {
            if (var2.getSettings().getSpeedViewType() != 1) {
               var1 = false;
            }
         } else {
            var1 = false;
         }
      } else if (z.j(this.b).getInt(fi.polar.polarflow.ui.exeview.a_package.a_package.ah.A, -1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public void c() {
      if (this.b.p() == 2) {
         if (z.l(this.b)) {
            z.d(this.b).setText(2131231113);
         } else {
            z.d(this.b).setText(2131231114);
         }
      } else if (z.l(this.b)) {
         z.d(this.b).setText(2131230924);
      } else {
         z.d(this.b).setText(2131230925);
      }

   }
}
