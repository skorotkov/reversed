package fi.polar.polarflow.ui.exeview.laps;

import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import fi.polar.polarflow.data.Lap;
import fi.polar.polarflow.data.SportProfileSettings;

public class LapNotificationView extends FrameLayout {
   private long a;
   private TextView b;
   private View c;
   private View d;
   private FrameLayout e;
   private m f;
   private boolean g;
   private SportProfileSettings h;
   private Lap i;
   private final Runnable j;
   private final Runnable k;

   public LapNotificationView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public LapNotificationView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public LapNotificationView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a = 3000L;
      this.g = false;
      this.j = new i(this);
      this.k = new j(this);
   }

   private static CharSequence a(Context var0, Lap var1) {
      String var2;
      if (var1.getAutoLapType() != -1) {
         var2 = var0.getString(2131230848, new Object[]{var1.getLapNumber()});
      } else {
         var2 = var0.getString(2131230892, new Object[]{var1.getLapNumber()});
      }

      return var2;
   }

   private void a() {
      this.animate().cancel();
      this.removeCallbacks(this.j);
      this.removeCallbacks(this.k);
      this.g = false;
   }

   // $FF: synthetic method
   static void a(LapNotificationView var0) {
      var0.b();
   }

   private void a(Runnable var1, long var2) {
      this.postDelayed(var1, var2);
      ((PowerManager)this.getContext().getSystemService("power")).newWakeLock(1, "LapNotificationWakelockTag").acquire(1000L + var2);
   }

   // $FF: synthetic method
   static boolean a(LapNotificationView var0, boolean var1) {
      var0.g = var1;
      return var1;
   }

   private void b() {
      fi.polar.polarflow.util.d.c("LapNotificationView", "hideAnimate()");
      this.a();
      Animation var1;
      if (this.f == m.a) {
         var1 = AnimationUtils.loadAnimation(this.getContext(), 2131034137);
      } else if (this.f == m.b) {
         var1 = AnimationUtils.loadAnimation(this.getContext(), 2131034139);
      } else if (this.f == m.d) {
         var1 = AnimationUtils.loadAnimation(this.getContext(), 2131034136);
      } else {
         var1 = AnimationUtils.loadAnimation(this.getContext(), 2131034141);
      }

      var1.setDuration(600L);
      this.setAnimation(var1);
      this.animate().withEndAction(new l(this)).start();
   }

   private void b(boolean var1) {
      Object var2;
      if (this.i.getAutoLapType() != -1) {
         var2 = new fi.polar.polarflow.ui.exeview.laps.a_package.c(this.i, this.h);
         if (var1) {
            ((n)var2).a_((Bundle)null);
         }
      } else {
         var2 = new fi.polar.polarflow.ui.exeview.laps.b_package.c(this.i, this.h);
      }

      ViewGroup var3 = (ViewGroup)this.findViewById(2131755180);
      var3.removeAllViews();
      ContextThemeWrapper var4;
      if (var1) {
         var4 = new ContextThemeWrapper(this.getContext(), 2131427624);
      } else {
         var4 = new ContextThemeWrapper(this.getContext(), 2131427631);
      }

      ((n)var2).a((View)((n)var2).a(LayoutInflater.from(var4), var3, true));
      ((n)var2).d();
   }

   private void c() {
      this.a();
      this.setAlpha(0.0F);
      this.a = 1000L;
      this.c.setVisibility(0);
      this.d.setVisibility(8);
      this.e.setVisibility(8);
      this.setVisibility(0);
      this.getLayoutParams().height = this.c.getLayoutParams().height;
      this.setLayoutParams(this.getLayoutParams());
      this.f = m.c;
      this.g();
   }

   private void d() {
      this.getLayoutParams().height = this.d.getLayoutParams().height;
      this.setLayoutParams(this.getLayoutParams());
      this.a = 3000L;
      this.c.setVisibility(8);
      this.d.setVisibility(0);
      this.f();
   }

   private void e() {
      this.a();
      this.setAlpha(1.0F);
      this.setVisibility(0);
      this.a(this.j, this.a);
   }

   private void f() {
      this.a();
      if (this.f == m.d) {
         this.e.setVisibility(0);
      } else {
         this.e.setVisibility(8);
      }

      this.setAlpha(0.0F);
      this.animate().alpha(1.0F).setDuration(600L).start();
      this.setVisibility(0);
      this.a(this.j, this.a);
   }

   private void g() {
      this.a();
      this.setAlpha(1.0F);
      this.setVisibility(0);
      Animation var1 = AnimationUtils.loadAnimation(this.getContext(), 2131034135);
      var1.setDuration(600L);
      this.setAnimation(var1);
      this.animate().start();
      this.a(this.j, this.a + 600L);
   }

   public void a(long var1) {
      if (!this.g) {
         this.a();
         this.g = true;
         this.a(this.k, var1);
      }

   }

   public void a(Lap var1) {
      this.b.setText(a(this.getContext(), var1));
      this.c();
   }

   public void a(Lap var1, int var2, boolean var3) {
      this.i = var1;
      this.b(var3);
      if (var2 < 0) {
         this.f = m.a;
      } else if (var2 == 0) {
         this.f = m.d;
      } else if (var2 > 0) {
         this.f = m.b;
      }

      this.d();
   }

   public void a(boolean var1) {
      if (this.getVisibility() == 0 && this.d.getVisibility() == 0) {
         this.b(var1);
         this.e();
      }

   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.e = (FrameLayout)this.findViewById(2131755178);
      this.d = this.findViewById(2131755179);
      this.c = this.findViewById(2131755181);
      this.b = (TextView)this.findViewById(2131755182);
   }

   public void setSportProfileSettings(SportProfileSettings var1) {
      this.h = var1;
   }
}
