package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import fi.polar.polarflow.c_sensor_package.m_SENSOR_STATE;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.Zones;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ae extends br {
   TextView a;
   PolarGlyphView[] c;
   View d;
   ProgressBar[] e;
   private List f;
   private int g = -1;
   private long h = 0L;
   private final long[] i = new long[]{0L, 0L, 0L, 0L, 0L};
   private int[] j;
   private int[] k;
   private boolean l;

   public ae() {
      super((int)TimeUnit.SECONDS.toMillis(1L));
   }

   private void a(int var1) {
      var1 = Zones.getCurrentHrZone(var1, this.f);
      if (this.g != var1) {
         long var2 = SystemClock.elapsedRealtime();
         if (this.g != -1) {
            long[] var4 = this.i;
            int var5 = this.g;
            var4[var5] += var2 - this.h;
         }

         this.h = var2;
         this.g = var1;
         this.l = true;
         this.s();
      }

   }

   private static void a(ProgressBar var0, long var1, long var3) {
      boolean var5;
      if ((int)(var3 / 1000L) > 100) {
         var5 = true;
      } else {
         var5 = false;
      }

      int var6;
      if (var5) {
         var6 = (int)((float)var1 / (float)var3 * 100.0F);
      } else {
         var6 = (int)(var1 / 1000L);
      }

      var0.setProgress(var6);
   }

   private static void a(TextView var0, int var1) {
      switch(var1) {
      case 0:
      case 1:
         var0.setGravity(8388611);
         break;
      case 2:
         var0.setGravity(17);
         break;
      default:
         var0.setGravity(8388613);
      }

   }

   private static void a(long[] var0, Training var1) {
      Zones var3 = var1.getZones();
      if (var3 != null) {
         for(int var2 = 0; var2 <= 4; ++var2) {
            var0[var2] = var3.getTimeInHrZone(var2);
         }
      }

   }

   private static void a(PolarGlyphView[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var2 != var1) {
            var0[var2].setVisibility(4);
         }
      }

      if (var1 != -1) {
         var0[var1].setVisibility(0);
      }

   }

   private static int[] a(Theme var0) {
      TypedValue var1 = new TypedValue();
      var0.resolveAttribute(2130771973, var1, true);
      int var2 = var1.data;
      var0.resolveAttribute(2130771976, var1, true);
      int var3 = var1.data;
      var0.resolveAttribute(2130771979, var1, true);
      int var4 = var1.data;
      var0.resolveAttribute(2130771982, var1, true);
      int var5 = var1.data;
      var0.resolveAttribute(2130771985, var1, true);
      return new int[]{var2, var3, var4, var5, var1.data};
   }

   private void b(int var1) {
      byte var2 = 0;
      long var3 = 0L;
      long[] var5 = this.i;
      int var6 = var5.length;

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         var3 += var5[var7];
      }

      var7 = var2;
      if (var1 != -1) {
         a(this.e[var1], this.i[var1], var3);
         var7 = var2;
      }

      for(; var7 < this.e.length; ++var7) {
         if (var7 != var1) {
            a(this.e[var7], this.i[var7], var3);
         }
      }

   }

   private void b(View var1) {
      this.e = new ProgressBar[5];
      this.e[0] = (ProgressBar)var1.findViewById(2131755534);
      this.e[1] = (ProgressBar)var1.findViewById(2131755535);
      this.e[2] = (ProgressBar)var1.findViewById(2131755536);
      this.e[3] = (ProgressBar)var1.findViewById(2131755537);
      this.e[4] = (ProgressBar)var1.findViewById(2131755538);
      this.k = a(var1.getContext().getTheme());
      this.l = true;
   }

   private void c(int var1) {
      if (var1 != -1) {
         this.a.setText(fi.polar.polarflow.ui.o.a(fi.polar.polarflow.ui.c.a(this.i[var1])));
         this.a.setTextColor(this.j[var1]);
         a(this.a, var1);
      } else {
         this.a.setTextColor(-1);
         this.a.setText(2131230866);
         a((TextView)this.a, 2);
      }

   }

   private void e() {
      if (this.Q.isRunning()) {
         a(this.i, this.Q);
         this.a(Math.round(this.Q.getStatistics().getHeartrateStatistics().i()));
      }

   }

   private void s() {
      a(this.c, this.g);
      if (this.d != null) {
         this.t();
         this.b(this.g);
      }

      if (this.a != null) {
         this.c(this.g);
      }

   }

   private void t() {
      if (this.l) {
         for(int var1 = 0; var1 <= 4; ++var1) {
            if (var1 != this.g) {
               this.e[var1].setProgressTintList(ColorStateList.valueOf(this.k[var1]));
            }
         }

         if (this.g != -1) {
            this.e[this.g].setProgressTintList(ColorStateList.valueOf(this.j[this.g]));
         }

         this.l = false;
      }

   }

   public int a() {
      int var1;
      switch(af.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968669;
         break;
      case 2:
         var1 = 2130968668;
         break;
      case 3:
         var1 = 2130968667;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   public void a(Intent var1) {
      super.a(var1);
      if (var1.getAction().equals("fi.polar.polarflow.ACTION_HR_DATA")) {
         this.a(var1.getIntExtra("fi.polar.polarflow.KEY_SENSOR_HR_MEASUREMENT_VALUE", 0));
      } else if ("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED".equals(var1.getAction()) && (m_SENSOR_STATE)var1.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE") != m_SENSOR_STATE.d_READY) {
         if (this.g != -1) {
            this.l = true;
            this.g = -1;
         }

         this.s();
      }

   }

   public void a(View var1) {
      super.a((View)var1);
      this.c = new PolarGlyphView[5];
      this.c[0] = (PolarGlyphView)var1.findViewById(2131755221);
      this.c[1] = (PolarGlyphView)var1.findViewById(2131755222);
      this.c[2] = (PolarGlyphView)var1.findViewById(2131755223);
      this.c[3] = (PolarGlyphView)var1.findViewById(2131755224);
      this.c[4] = (PolarGlyphView)var1.findViewById(2131755225);
      SportProfile var2 = this.Q.getSportProfile();
      if (var2 != null) {
         this.f = var2.getSettings().getHeartRateZones();
      }

      if (this.f == null || this.f.size() == 0) {
         this.f = fi.polar.polarflow.ui.o.e(this.Q.getUserMaximumHeartRate());
      }

      this.j = fi.polar.polarflow.ui.o.a(var1.getContext().getTheme());
      this.a = (TextView)var1.findViewById(2131755295);
      this.d = var1.findViewById(2131755294);
      if (this.d != null) {
         this.b(this.d);
      }

      a(this.i, this.Q);
      if (this.Q.isRunning()) {
         this.g = Zones.getCurrentHrZone(Math.round(this.Q.getStatistics().getHeartrateStatistics().i()), this.f);
         this.h = SystemClock.elapsedRealtime();
         this.f();
      }

      this.s();
   }

   public void a(Collection var1) {
      this.e();
   }

   public void d() {
      this.e();
   }

   public void g() {
      if (this.g != -1) {
         long var1 = SystemClock.elapsedRealtime();
         long[] var3 = this.i;
         int var4 = this.g;
         var3[var4] += var1 - this.h;
         this.h = var1;
      }

      this.s();
   }
}
