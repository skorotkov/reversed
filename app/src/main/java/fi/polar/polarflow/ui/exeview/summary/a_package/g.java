package fi.polar.polarflow.ui.exeview.summary.a_package;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.SystemClock;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.Zones;
import fi.polar.polarflow.ui.exeview.a_package.a_package.br;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

class g extends br {
   TextView[] a;
   private List c = null;
   private int[] d = null;
   private int[] e = null;
   private ProgressBar[] f;
   private final long[] g = new long[5];
   private long h = 0L;
   private int i = -1;

   g() {
      super((int)TimeUnit.SECONDS.toMillis(1L));
   }

   private static int a(long var0, long var2) {
      return (int)((float)var2 / (float)var0 * 100.0F);
   }

   private void a(int var1) {
      if (!this.Q.isPaused()) {
         var1 = Zones.getCurrentHrZone(var1, this.c);
         if (this.i != var1) {
            long var2 = SystemClock.elapsedRealtime();
            if (this.i != -1) {
               long[] var4 = this.g;
               int var5 = this.i;
               var4[var5] += var2 - this.h;
            }

            this.h = var2;
            this.i = var1;
         }
      }

   }

   private void a(View var1, int var2) {
      TextView var3 = (TextView)var1.findViewById(2131755524);
      var3.setText(String.valueOf(var2 + 1));
      var3.setBackgroundColor(this.d[var2]);
      this.f[var2] = (ProgressBar)var1.findViewById(2131755525);
      this.f[var2].setBackgroundColor(this.e[var2]);
      this.f[var2].setProgressTintList(ColorStateList.valueOf(this.d[var2]));
      this.a[var2] = (TextView)var1.findViewById(2131755526);
      this.a[var2].setText(fi.polar.polarflow.ui.o.a(this.g[var2]));
   }

   private static int[] a(Context var0) {
      return new int[]{var0.getColor(2131624116), var0.getColor(2131624117), var0.getColor(2131624118), var0.getColor(2131624119), var0.getColor(2131624120)};
   }

   private void e() {
      if (this.P != null) {
         this.t();
      } else {
         this.s();
      }

      this.u();
      this.v();
   }

   private void s() {
      Zones var1 = this.Q.getZones();
      long[] var2;
      if (var1 != null) {
         var2 = var1.getTimeInZones();
      } else {
         var2 = null;
      }

      if (var2 != null) {
         System.arraycopy(var2, 0, this.g, 0, 5);
      }

   }

   private void t() {
      long[] var1 = this.P.getLongArray(G);
      if (var1 != null) {
         System.arraycopy(var1, 0, this.g, 0, 5);
      }

   }

   private void u() {
      if (this.f[0] != null) {
         long[] var1 = this.g;
         int var2 = var1.length;
         int var3 = 0;

         long var4;
         long var6;
         for(var4 = 0L; var3 < var2; var4 += var6) {
            var6 = var1[var3];
            ++var3;
         }

         boolean var9;
         if (TimeUnit.MILLISECONDS.toSeconds(var4) > 100L) {
            var9 = true;
         } else {
            var9 = false;
         }

         for(int var8 = 0; var8 < 5; ++var8) {
            if (var4 != 0L) {
               var3 = a(var4, this.g[var8]);
            } else {
               var3 = 0;
            }

            if (!var9) {
               var3 = (int)TimeUnit.MILLISECONDS.toSeconds(this.g[var8]);
            }

            this.f[var8].setProgress(var3);
         }
      }

   }

   private void v() {
      for(int var1 = 0; var1 < 5; ++var1) {
         this.a[var1].setText(fi.polar.polarflow.ui.o.a(fi.polar.polarflow.ui.c.a(this.g[var1])));
      }

   }

   public int a() {
      return 2130968686;
   }

   public void a(Intent var1) {
      super.a(var1);
      if (var1.getAction().equals("fi.polar.polarflow.ACTION_HR_DATA")) {
         this.a(var1.getIntExtra("fi.polar.polarflow.KEY_SENSOR_HR_MEASUREMENT_VALUE", 0));
      } else if ("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED".equals(var1.getAction()) && (fi.polar.polarflow.c_package.m)var1.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE") != fi.polar.polarflow.c_package.m.d) {
         this.i = -1;
      }

   }

   public void a(View var1) {
      var1.addOnLayoutChangeListener(new h(this, var1));
      this.d = fi.polar.polarflow.ui.o.a(var1.getContext().getTheme());
      this.e = a(var1.getContext());
      this.f = new ProgressBar[5];
      this.a = new TextView[5];
      this.a(var1.findViewById(2131755344), 0);
      this.a(var1.findViewById(2131755343), 1);
      this.a(var1.findViewById(2131755342), 2);
      this.a(var1.findViewById(2131755341), 3);
      this.a(var1.findViewById(2131755340), 4);
      if (this.P != null) {
         this.t();
      } else {
         SportProfile var2 = this.Q.getSportProfile();
         if (var2 != null) {
            this.c = var2.getSettings().getHeartRateZones();
            this.s();
         }
      }

      if (this.c == null || this.c.size() == 0) {
         this.c = fi.polar.polarflow.ui.o.e(this.Q.getUserMaximumHeartRate());
      }

      if (this.Q.isRunning()) {
         this.i = Zones.getCurrentHrZone(Math.round(this.Q.getStatistics().getHeartrateStatistics().i()), this.c);
         if (this.Q.isPaused()) {
            this.r();
         } else {
            this.f();
         }
      }

      this.u();
      this.v();
   }

   public void a(Collection var1) {
      this.e();
   }

   public void d() {
      this.e();
   }

   public void f() {
      this.h = SystemClock.elapsedRealtime();
      super.f();
   }

   public void g() {
      if (this.i != -1) {
         long var1 = SystemClock.elapsedRealtime();
         long[] var3 = this.g;
         int var4 = this.i;
         var3[var4] += var1 - this.h;
         this.h = var1;
      }

      this.u();
      this.v();
   }
}
