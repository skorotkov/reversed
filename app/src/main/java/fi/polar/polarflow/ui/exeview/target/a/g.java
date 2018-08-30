package fi.polar.polarflow.ui.exeview.target.a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;
import fi.polar.polarflow.data.orm.ExercisePhase;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.Zones;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import fi.polar.polarflow.ui.exeview.a.a.ah;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class g extends ah {
   private View[] R;
   private Animation S;
   PolarGlyphView[] a;
   private List c;
   private int[] d;
   private int e;
   private int f = -1;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k = 0;
   private TextView l;
   private TextView m;
   private TextView n;

   private int a(int var1) {
      if (var1 - 1 >= 0 && var1 - 1 <= 4) {
         --var1;
      } else {
         var1 = -1;
      }

      return var1;
   }

   private void a(TextView var1) {
      this.u();
      this.n = var1;
      if (this.S == null) {
         this.S = new AlphaAnimation(0.0F, 1.0F);
         this.S.setDuration(500L);
         this.S.setRepeatMode(2);
         this.S.setRepeatCount(-1);
      }

      this.n.startAnimation(this.S);
   }

   private void b(int var1) {
      PolarGlyphView[] var2 = this.a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         var2[var4].setVisibility(4);
      }

      if (this.i() == 5 && var1 != -1) {
         this.a[var1].setVisibility(0);
      } else {
         float var5 = (float)(this.e - this.i) / (float)(this.j - this.i);
         if (var5 >= 0.0F && var5 <= 1.0F) {
            this.a[5].setVisibility(0);
            if (this.f != -1) {
               this.a[5].setGlyphColor(this.d[this.f]);
            }

            var1 = this.a[5].getWidth();
            var1 = (int)(var5 * (float)(this.a[5].getRootView().getWidth() - var1));
            MarginLayoutParams var6 = (MarginLayoutParams)this.a[5].getLayoutParams();
            var6.setMarginStart(var1);
            this.a[5].setLayoutParams(var6);
         }
      }

   }

   private void b(Intent var1) {
      if (var1 != null) {
         if (var1.getAction().equals("fi.polar.polarflow.ACTION_HR_DATA")) {
            this.c(var1.getIntExtra("fi.polar.polarflow.KEY_SENSOR_HR_MEASUREMENT_VALUE", 0));
            this.e();
         } else if ("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED".equals(var1.getAction())) {
            if ((fi.polar.polarflow.c_package.m)var1.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE") != fi.polar.polarflow.c_package.m.d) {
               this.f = -1;
               this.c(0);
               this.e();
            }
         } else if ("ExercisePhaseCalc.ACTION_PHASE_FINISHED".equals(var1.getAction())) {
            this.u();
            if (this.Q.getCurrentPhase() != null) {
               this.g();
               this.s();
               this.e();
            }
         }
      }

   }

   private void c(int var1) {
      if (this.c != null) {
         this.f = Zones.getCurrentHrZone(var1, this.c);
      }

      this.e = var1;
   }

   private void f() {
      SportProfile var1 = this.Q.getSportProfile();
      if (var1 != null) {
         this.c = var1.getSettings().getHeartRateZones();
      }

      if (this.c == null || this.c.size() == 0) {
         this.c = fi.polar.polarflow.ui.o.e(this.Q.getUserMaximumHeartRate());
      }

   }

   private void g() {
      ExercisePhase var1 = this.Q.getCurrentPhase();
      if (var1 != null && var1.getIntensityType() == 1) {
         this.g = this.a(var1.getIntensityZoneLower());
         this.h = this.a(var1.getIntensityZoneUpper());
         if (this.g == -1 || this.h == -1) {
            this.g = -1;
            this.h = -1;
         }
      } else {
         this.g = -1;
         this.h = -1;
      }

   }

   private int i() {
      int var1;
      if (!this.r()) {
         var1 = 5;
      } else {
         var1 = this.h - this.g + 1;
      }

      return var1;
   }

   private boolean r() {
      boolean var1;
      if (this.g != -1 && this.h != -1) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void s() {
      float var1 = 1.0F / (float)this.i();

      for(int var2 = 0; var2 <= 4; ++var2) {
         View var3 = this.R[var2];
         if (this.g == -1 || this.h == -1 || var2 >= this.g && var2 <= this.h) {
            LayoutParams var4 = (LayoutParams)var3.getLayoutParams();
            var4.weight = var1;
            var3.setLayoutParams(var4);
            var3.setVisibility(0);
         } else {
            var3.setVisibility(8);
         }
      }

      if (this.r()) {
         this.l.setVisibility(0);
         this.m.setVisibility(0);
         this.i = ((int[])this.c.get(this.g))[0];
         this.j = ((int[])this.c.get(this.h))[1];
         if (this.h != 4) {
            --this.j;
         }

         this.l.setText(String.valueOf(this.i));
         this.m.setText(String.valueOf(this.j));
         this.l.setTextColor(this.d[this.g]);
         this.m.setTextColor(this.d[this.h]);
      } else {
         this.l.setVisibility(8);
         this.m.setVisibility(8);
      }

   }

   private void t() {
      if (this.e <= 0 || this.e >= this.i && this.e <= this.j) {
         this.u();
      } else if (this.n == null) {
         if (this.e < this.i) {
            this.a(this.l);
         } else if (this.e > this.j) {
            this.a(this.m);
         }
      }

   }

   private void u() {
      if (this.n != null) {
         this.n.clearAnimation();
         this.n = null;
      }

   }

   private void v() {
      int var1;
      if (this.Q.getCurrentPhase() != null) {
         var1 = this.Q.getCurrentPhase().getIndex();
      } else {
         var1 = -1;
      }

      if (this.k != var1 && var1 != -1) {
         this.k = var1;
         this.u();
         this.g();
         this.s();
      }

   }

   public int a() {
      return 2130968678;
   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.R = new View[5];
      this.R[0] = var1.findViewById(2131755227);
      this.R[1] = var1.findViewById(2131755228);
      this.R[2] = var1.findViewById(2131755229);
      this.R[3] = var1.findViewById(2131755230);
      this.R[4] = var1.findViewById(2131755231);
      this.a = new PolarGlyphView[6];
      this.a[0] = (PolarGlyphView)var1.findViewById(2131755221);
      this.a[1] = (PolarGlyphView)var1.findViewById(2131755222);
      this.a[2] = (PolarGlyphView)var1.findViewById(2131755223);
      this.a[3] = (PolarGlyphView)var1.findViewById(2131755224);
      this.a[4] = (PolarGlyphView)var1.findViewById(2131755225);
      this.a[5] = (PolarGlyphView)var1.findViewById(2131755311);
      this.l = (TextView)var1.findViewById(2131755313);
      this.m = (TextView)var1.findViewById(2131755314);
      if (this.Q.getCurrentPhase() != null) {
         this.f();
         this.g();
         this.d = fi.polar.polarflow.ui.o.a(var1.getContext().getTheme());
         this.s();
      }

   }

   public void a(Collection var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         this.b((Intent)var2.next());
      }

   }

   public void a_(Bundle var1) {
      this.u();
      super.a_(var1);
   }

   public void b() {
      this.u();
      super.b();
   }

   public void d() {
      this.c(Math.round(this.Q.getStatistics().getHeartrateStatistics().i()));
      this.v();
      this.e();
   }

   public void d_() {
      super.d_();
      if (this.r()) {
         this.t();
      }

   }

   protected void e() {
      if (this.r() && !this.h()) {
         this.t();
      }

      this.b(this.f);
   }
}
