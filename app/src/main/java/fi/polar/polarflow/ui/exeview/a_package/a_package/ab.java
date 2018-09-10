package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.view.View;

import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.Zones;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ab extends fi.polar.polarflow.ui.a_package.k {
   private List d = null;
   private int[] e = null;

   private void b(int var1) {
      if (!Zones.heartRateInZone(var1, 4, this.d) && var1 < ((int[])this.d.get(4))[1]) {
         if (Zones.heartRateInZone(var1, 3, this.d)) {
            this.a.setTextColor(this.c(3));
         } else if (Zones.heartRateInZone(var1, 2, this.d)) {
            this.a.setTextColor(this.c(2));
         } else if (Zones.heartRateInZone(var1, 1, this.d)) {
            this.a.setTextColor(this.c(1));
         } else {
            this.a.setTextColor(this.c(0));
         }
      } else {
         this.a.setTextColor(this.c(4));
      }

   }

   private void b(Intent var1) {
      if ("fi.polar.polarflow.ACTION_HR_DATA".equals(var1.getAction())) {
         int var2 = var1.getIntExtra("fi.polar.polarflow.KEY_SENSOR_HR_MEASUREMENT_VALUE", 0);
         this.b(var2);
         this.a(var2);
      } else if ("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED".equals(var1.getAction()) && (m_SENSOR_STATE)var1.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE") != m_SENSOR_STATE.d_READY) {
         this.b(0);
         this.a(0);
      }

   }

   private void b(Collection var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         this.b((Intent)var2.next());
      }

   }

   private int c(int var1) {
      if (this.e != null && var1 < this.e.length) {
         var1 = this.e[var1];
      } else {
         var1 = -1;
      }

      return var1;
   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      if (this.P == null) {
         SportProfile var2 = this.Q.getSportProfile();
         if (var2 != null) {
            this.c = var2.getSettings();
            this.d = this.c.getHeartRateZones();
         }
      }

      if (this.d == null || this.d.size() == 0) {
         this.d = fi.polar.polarflow.ui.o.e(this.Q.getUserMaximumHeartRate());
      }

      this.e = fi.polar.polarflow.ui.o.a(var1.getContext().getTheme());
   }

   public void a(Collection var1) {
      this.b(var1);
   }

   public void d() {
      this.b((Collection)this.a((String[])(new String[]{"fi.polar.polarflow.ACTION_HR_DATA", "fi.polar.polarflow.SENSOR_HR_STATE_CHANGED"})));
   }
}
