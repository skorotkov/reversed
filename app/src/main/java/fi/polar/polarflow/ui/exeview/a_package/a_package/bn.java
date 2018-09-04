package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.content.res.Resources.Theme;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import fi.polar.polarflow.c_sensor_package.m_SENSOR_STATE;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.Zones;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

class bn extends br {
   private String S;
   private TextView T;
   private int[] U;
   private int V;
   private boolean W;
   TextView a;
   TextView c;
   TextView d;
   View e;
   PolarGlyphView f;
   TextView g;
   final long[] h = new long[]{0L, 0L, 0L, 0L, 0L};
   long i = 0L;
   int j = -1;
   float k;
   float l;
   float m;
   private List n;

   bn() {
      super((int)TimeUnit.SECONDS.toMillis(1L));
   }

   private void a(int var1) {
      if (this.W) {
         this.e();
         this.W = false;
      }

      if (var1 != -1) {
         this.a(this.h[var1]);
      }

   }

   private void a(long var1) {
      String var3 = "%02d:%02d";
      var1 = fi.polar.polarflow.ui.c.a(var1);
      String var4 = var3;
      if (bj.c.equals(this.l())) {
         float var5;
         if (var1 < fi.polar.polarflow.ui.c.b) {
            var3 = "%d:%02d";
            var5 = this.l;
         } else {
            var5 = this.m;
         }

         var4 = var3;
         if (this.k != var5) {
            this.c.setTextSize(0, var5);
            this.k = var5;
            var4 = var3;
         }
      }

      Locale var6 = Locale.getDefault();
      this.a.setText(String.format(var6, "%02d", TimeUnit.MILLISECONDS.toSeconds(var1) % 60L));
      this.c.setText(String.format(var6, var4, TimeUnit.MILLISECONDS.toHours(var1), TimeUnit.MILLISECONDS.toMinutes(var1) % 60L));
   }

   private static void a(long[] var0, Training var1) {
      Zones var3 = var1.getZones();
      if (var3 != null) {
         for(int var2 = 0; var2 <= 4; ++var2) {
            var0[var2] = var3.getTimeInHrZone(var2);
         }
      }

   }

   private void b(int var1) {
      var1 = Zones.getCurrentHrZone(var1, this.n);
      if (this.j != var1) {
         long var2 = SystemClock.elapsedRealtime();
         if (this.j != -1) {
            long[] var4 = this.h;
            int var5 = this.j;
            var4[var5] += var2 - this.i;
         }

         this.i = var2;
         this.j = var1;
         this.W = true;
      }

   }

   private void e() {
      if (this.j != -1) {
         if (this.e != null) {
            if (this.h()) {
               this.e.setBackgroundColor(this.V);
               this.g.setTextColor(this.V);
            } else {
               this.e.setBackgroundColor(this.U[this.j]);
               this.g.setTextColor(this.U[this.j]);
            }

            this.g.setText(String.valueOf(this.j + 1));
            this.g.setVisibility(0);
            this.f.setVisibility(4);
            this.T.setVisibility(8);
         }

         if (this.d != null) {
            this.d.setText(String.format(this.S, String.valueOf(this.j + 1)));
         }

         this.a.setTextColor(this.U[this.j]);
         this.c.setTextColor(this.U[this.j]);
         this.a.setVisibility(0);
         this.c.setGravity(8388613);
         this.c.setVisibility(0);
      } else {
         this.s();
      }

   }

   private void s() {
      this.a.setVisibility(8);
      if (this.e != null) {
         this.e.setBackgroundColor(this.V);
         this.f.setGlyphColor(this.V);
         this.f.setVisibility(0);
         this.g.setVisibility(8);
         this.c.setVisibility(8);
         this.T.setVisibility(0);
      } else {
         this.c.setGravity(1);
         this.c.setTextColor(-1);
         this.c.setText(2131231102);
      }

      if (this.d != null) {
         this.d.setText(2131230866);
      }

   }

   public int a() {
      int var1;
      switch(bo.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968696;
         break;
      case 2:
         var1 = 2130968661;
         break;
      case 3:
         var1 = 2130968660;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   public void a(Intent var1) {
      super.a(var1);
      if (var1.getAction().equals("fi.polar.polarflow.ACTION_HR_DATA")) {
         this.b(var1.getIntExtra("fi.polar.polarflow.KEY_SENSOR_HR_MEASUREMENT_VALUE", 0));
      } else if ("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED".equals(var1.getAction()) && (m_SENSOR_STATE)var1.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE") != m_SENSOR_STATE.d_READY) {
         if (this.j != -1) {
            this.W = true;
            this.j = -1;
         }

         this.a(this.j);
      }

   }

   public void a(View var1) {
      Theme var2 = var1.getContext().getTheme();
      TypedValue var3 = new TypedValue();
      this.c = (TextView)var1.findViewById(2131755275);
      this.a = (TextView)var1.findViewById(2131755276);
      if (bj.c.equals(this.l())) {
         this.l = (float)this.c.getResources().getDimensionPixelSize(2131362010);
         this.m = (float)this.c.getResources().getDimensionPixelSize(2131362009);
         this.k = this.l;
      }

      this.d = (TextView)var1.findViewById(2131755274);
      this.e = var1.findViewById(2131755370);
      this.f = (PolarGlyphView)var1.findViewById(2131755371);
      this.g = (TextView)var1.findViewById(2131755372);
      this.T = (TextView)var1.findViewById(2131755373);
      this.S = var2.getResources().getString(2131230913);
      SportProfile var4 = this.Q.getSportProfile();
      if (var4 != null) {
         this.n = var4.getSettings().getHeartRateZones();
      }

      if (this.n == null || this.n.size() == 0) {
         this.n = fi.polar.polarflow.ui.o.e(this.Q.getUserMaximumHeartRate());
      }

      this.U = fi.polar.polarflow.ui.o.a(var2);
      var2.resolveAttribute(2130771994, var3, true);
      this.V = var3.data;
      this.W = true;
      a(this.h, this.Q);
      if (this.Q.isRunning()) {
         this.f();
      }

      this.a(this.j);
   }

   public void a(Collection var1) {
      if (this.Q.isRunning()) {
         a(this.h, this.Q);
         this.b(Math.round(this.Q.getStatistics().getHeartrateStatistics().i()));
         this.a(this.j);
      }

   }

   public void d() {
      if (this.Q.isRunning()) {
         a(this.h, this.Q);
         this.b(Math.round(this.Q.getStatistics().getHeartrateStatistics().i()));
         this.a(this.j);
      }

   }

   public void f() {
      this.j = Zones.getCurrentHrZone(Math.round(this.Q.getStatistics().getHeartrateStatistics().i()), this.n);
      this.i = SystemClock.elapsedRealtime();
      super.f();
   }

   public void g() {
      if (this.j != -1) {
         long var1 = SystemClock.elapsedRealtime();
         long[] var3 = this.h;
         int var4 = this.j;
         var3[var4] += var1 - this.i;
         this.i = var1;
      }

      this.a(this.j);
   }
}
