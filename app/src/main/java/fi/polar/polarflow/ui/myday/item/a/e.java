package fi.polar.polarflow.ui.myday.item.a;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.ViewFlipper;
import fi.polar.polarflow.data.orm.DailySummary;
import fi.polar.polarflow.ui.myday.DailyGoalReachedActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e extends fi.polar.polarflow.ui.myday.item.c {
   private Context c;
   private ViewFlipper d;
   private final List e = new ArrayList();
   private float f;
   private boolean g = false;
   private boolean h = false;
   private Animation i;
   private Animation j;
   private final AnimationListener k = new f(this);
   private final AnimationListener l = new g(this);

   public e() {
      super(Long.MAX_VALUE, 1, true);
   }

   // $FF: synthetic method
   static ViewFlipper a(e var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static boolean a(e var0, boolean var1) {
      var0.g = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b(e var0, boolean var1) {
      var0.h = var1;
      return var1;
   }

   private void e() {
      this.j();
      this.e.add(new a());
      if (this.f != -1.0F && this.f < 100.0F) {
         this.e.add(new b(0));
         this.e.add(new b(1));
         this.e.add(new b(2));
      }

   }

   private void j() {
      Iterator var1 = this.e.iterator();

      while(var1.hasNext()) {
         ((fi.polar.polarflow.ui.myday.item.b)var1.next()).b();
         var1.remove();
      }

   }

   private float k() {
      Intent var1 = this.a((String)"DailyActivityService.action.DAILY_ACTIVITY_STATUS");
      float var2;
      if (var1 != null) {
         Parcelable var3 = var1.getParcelableExtra("DailyActivityService.extra.DAILY_SUMMARY");
         if (var3 instanceof DailySummary) {
            var2 = ((DailySummary)var3).getAchievedPercentage();
            return var2;
         }
      }

      var2 = -1.0F;
      return var2;
   }

   public int a() {
      return 2130968711;
   }

   public void a(Intent var1) {
      super.a((Intent)var1);
      Iterator var2 = this.e.iterator();

      while(var2.hasNext()) {
         ((fi.polar.polarflow.ui.myday.item.b)var2.next()).a(var1);
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.f = this.k();
      this.e();
      this.c = var1.getContext();
      this.g = false;
      this.h = false;
      this.d = (ViewFlipper)var1.findViewById(2131755392);
      if (this.i == null) {
         this.i = AnimationUtils.loadAnimation(this.c, 17432576);
         this.i.setAnimationListener(this.k);
      }

      if (this.j == null) {
         this.j = AnimationUtils.loadAnimation(this.c, 17432577);
         this.j.setAnimationListener(this.l);
      }

      this.d.setInAnimation(this.i);
      this.d.setOutAnimation(this.j);
      this.d.setFlipInterval(2500);
      LayoutInflater var2 = LayoutInflater.from(this.c);
      Iterator var5 = this.e.iterator();

      while(var5.hasNext()) {
         fi.polar.polarflow.ui.myday.item.b var3 = (fi.polar.polarflow.ui.myday.item.b)var5.next();
         View var4 = var2.inflate(var3.a(), (ViewGroup)null);
         var3.a(var4);
         this.d.addView(var4);
      }

   }

   public void b() {
      if (this.c()) {
         this.d.stopFlipping();
         this.d.removeAllViews();
         this.j();
         this.c = null;
         super.b();
      }

   }

   public void d() {
      super.d();
      Iterator var1 = this.e.iterator();

      while(var1.hasNext()) {
         ((fi.polar.polarflow.ui.myday.item.b)var1.next()).d();
      }

   }

   public void i() {
      if (this.e.size() > 1) {
         if (!this.g && !this.h) {
            this.d.stopFlipping();
            this.d.showNext();
            this.d.startFlipping();
         }
      } else if (this.f >= 100.0F) {
         Intent var1 = new Intent(this.c.getApplicationContext(), DailyGoalReachedActivity.class);
         var1.putExtra("DailyGoalReachedActivity.achieved_percentage", this.f);
         this.c.startActivity(var1);
      }

   }
}
