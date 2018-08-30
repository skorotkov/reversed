package fi.polar.polarflow.ui.myday.item;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import fi.polar.polarflow.ui.myday.u;
import fi.polar.polarflow.ui.myday.sleep.SleepResultActivity;
import fi.polar.polarflow.util.ab;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Period;

public class g extends c {
   private static final String c = g.class.getSimpleName();
   private static final SparseIntArray j = new h(5);
   private final fi.polar.polarflow.util.b.a d;
   private final LocalDate e;
   private Context f;
   private Handler g;
   private long h;
   private boolean i = false;

   public g(fi.polar.polarflow.util.b.a var1, String var2, LocalDate var3) {
      super(var1.b.getMillis(), 0, var2, true);
      this.d = var1;
      this.e = var3;
   }

   // $FF: synthetic method
   static boolean a(g var0, boolean var1) {
      var0.i = var1;
      return var1;
   }

   // $FF: synthetic method
   static String k() {
      return c;
   }

   private void l() {
      this.g = new Handler();
      this.g.postDelayed(new i(this), 600L);
   }

   public int a() {
      return 2130968729;
   }

   public void a(View var1) {
      super.a(var1);
      this.f = var1.getContext();
      Period var2 = new Period(ab.a(TimeUnit.SECONDS.toMillis((long)this.d.d)));
      ((TextView)var1.findViewById(2131755423)).setText(String.valueOf(var2.getHours()));
      ((TextView)var1.findViewById(2131755425)).setText(String.valueOf(var2.getMinutes()));
      ((TextView)var1.findViewById(2131755429)).setText(fi.polar.polarflow.a.a.a(20, this.d.i));
      ((TextView)var1.findViewById(2131755421)).setText(fi.polar.polarflow.a.a.a(21, this.d.j));
      ((PolarGlyphView)var1.findViewById(2131755420)).setGlyph(this.f.getText(j.get(this.d.k, 2131231150)));
   }

   public void b() {
      this.f = null;
      if (this.g != null) {
         this.g.removeCallbacksAndMessages((Object)null);
      }

      super.b();
   }

   public DateTime e() {
      return this.d.c;
   }

   public void i() {
      long var1 = SystemClock.uptimeMillis();
      long var3 = this.h;
      this.h = var1;
      if (var1 - var3 <= 600L) {
         fi.polar.polarflow.util.d.c(c, "Clicking too fast, blocking click.");
      } else if (!this.i) {
         this.i = true;
         fi.polar.polarflow.util.d.c(c, "Locking clicks.");
         this.l();
         Intent var5 = new Intent(this.f, SleepResultActivity.class);
         var5.putExtra("SleepResultActivity.sleep_analysis", this.d);
         u.a(this.f, var5, 2);
      }

   }

   public String j() {
      return this.e.toString();
   }
}
