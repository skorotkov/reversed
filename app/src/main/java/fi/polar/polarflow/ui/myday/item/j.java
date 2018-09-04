package fi.polar.polarflow.ui.myday.item;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.orm.Preferences;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.TrainingSession;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import fi.polar.polarflow.ui.custom.s;
import fi.polar.polarflow.ui.myday.u;

public class j extends c {
   private static final String c = j.class.getSimpleName();
   private long d;
   private long e;
   private float f;
   private int g;
   private int h;
   private Context i;
   private int j = 0;
   private Handler k;
   private long l;
   private boolean m = false;

   public j(TrainingSession var1) {
      super(var1.getStartTime(), 0, var1.getPath(), true);
      this.b(var1.getDuration());
      this.a(var1.getDistance());
      this.a(var1.getCalories());
   }

   private void a(TextView var1, int var2) {
      var2 = fi.polar.polarflow.a_package.a.a(7, var2);
      var1.setText(o.d(this.i, var2));
   }

   private void a(TextView var1, int var2, float var3) {
      String var4 = o.a(var2, fi.polar.polarflow.a_package.a.a(1, var3));
      String var5 = o.a(var4);
      if (var5.length() != 4) {
         var5 = var4;
      }

      var1.setText(var5);
   }

   // $FF: synthetic method
   static boolean a(j var0, boolean var1) {
      var0.m = var1;
      return var1;
   }

   // $FF: synthetic method
   static String j() {
      return c;
   }

   private void k() {
      this.k = new Handler();
      this.k.postDelayed(new k(this), 600L);
   }

   public int a() {
      return 2130968730;
   }

   public void a(float var1) {
      this.f = var1;
   }

   public void a(int var1) {
      this.g = var1;
   }

   public void a(long var1) {
      this.d = var1;
   }

   public void a(View var1) {
      super.a(var1);
      this.i = var1.getContext();
      ((PolarGlyphView)var1.findViewById(2131755437)).setGlyph(s.a(this.d));
      ((TextView)var1.findViewById(2131755438)).setText(o.a(this.e));
      int var2 = Preferences.getUserUnitSystem();
      if (this.f == -1.0F && (this.h & 4) != 4) {
         var1.findViewById(2131755407).setVisibility(8);
      } else {
         TextView var3 = (TextView)var1.findViewById(2131755408);
         TextView var4 = (TextView)var1.findViewById(2131755409);
         if (Sport.isSwimmingSport(this.d)) {
            o.a(17, var3, this.f, this.j);
            o.a(var4, this.j);
         } else {
            this.a(var3, var2, this.f);
            var4.setText(o.c(var2));
         }
      }

      this.a((TextView)var1.findViewById(2131755405), this.g);
      ((TextView)var1.findViewById(2131755406)).setText(o.d(var2));
   }

   public void b() {
      this.i = null;
      if (this.k != null) {
         this.k.removeCallbacksAndMessages((Object)null);
      }

      super.b();
   }

   public void b(int var1) {
      this.h = var1;
   }

   public void b(long var1) {
      long var3;
      if (var1 > fi.polar.polarflow.ui.c.a) {
         var3 = fi.polar.polarflow.ui.c.a;
      } else {
         var3 = var1;
         if (var1 < 0L) {
            var3 = 0L;
         }
      }

      this.e = var3;
   }

   public void c(int var1) {
      this.j = var1;
   }

   public long e() {
      return this.d;
   }

   public void i() {
      long var1 = SystemClock.uptimeMillis();
      long var3 = this.l;
      this.l = var1;
      if (var1 - var3 <= 600L) {
         fi.polar.polarflow.util.d.c(c, "Clicking too fast, blocking click.");
      } else if (!this.m) {
         this.m = true;
         fi.polar.polarflow.util.d.c(c, "Locking clicks.");
         this.k();
         u.a(this.i, this.f());
      }

   }
}
