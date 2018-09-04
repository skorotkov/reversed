package fi.polar.polarflow.ui.myday.item.sleeprating;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.view.View;
import fi.polar.polarflow.service.datalayer.u;
import fi.polar.polarflow.ui.NotificationReceiver;
import fi.polar.polarflow.ui.myday.item.c;
import fi.polar.polarflow.util.v;
import fi.polar.polarflow.util.z;
import org.joda.time.LocalDate;

public class a extends c implements fi.polar.polarflow.ui.myday.a_package.c {
   private final LocalDate c;
   private z d = new z();
   private u e = new u();
   private v f = v.a();
   private Context g;
   private SleepRatingGlyphsView h;
   private int i;

   public a(long var1, String var3, LocalDate var4, int var5) {
      super(var1, 1, var3, true);
      this.i = var5;
      this.c = var4;
   }

   private void j() {
      if (this.g instanceof Activity) {
         Activity var1 = (Activity)this.g;
         Fragment var2 = var1.getFragmentManager().findFragmentByTag("sleep_rating_dialog");
         if (var2 != null && var2 instanceof fi.polar.polarflow.ui.myday.a_package.a) {
            fi.polar.polarflow.ui.myday.a_package.a var3 = (fi.polar.polarflow.ui.myday.a_package.a)var2;
            var3.a((fi.polar.polarflow.ui.myday.a_package.c)null);
            if (!var1.isDestroyed()) {
               var3.dismiss();
            }
         }
      } else {
         fi.polar.polarflow.util.d.f("SleepRating", "Context is not Activity");
      }

   }

   private void k() {
      if (this.g instanceof Activity) {
         FragmentManager var1 = ((Activity)this.g).getFragmentManager();
         if (var1.findFragmentByTag("sleep_rating_dialog") == null) {
            fi.polar.polarflow.ui.myday.a_package.a var2 = fi.polar.polarflow.ui.myday.a_package.a.a(this.i);
            var2.a((fi.polar.polarflow.ui.myday.a_package.c)this);
            var2.show(var1, "sleep_rating_dialog");
            NotificationReceiver.a(this.g, 7);
         }
      } else {
         fi.polar.polarflow.util.d.f("SleepRating", "Context is not Activity");
      }

   }

   public int a() {
      return 2130968728;
   }

   public void a(View var1) {
      super.a(var1);
      this.g = var1.getContext();
      this.h = (SleepRatingGlyphsView)var1.findViewById(2131755435);
      if (this.i != Integer.MAX_VALUE) {
         this.h.setSelectedRating(this.i);
      }

   }

   public void a(fi.polar.polarflow.ui.myday.a_package.a var1) {
   }

   public void a(fi.polar.polarflow.ui.myday.a_package.a var1, int var2) {
      if (var2 != this.i) {
         this.h.setSelectedRating(var2);
         this.i = var2;
         (new Thread(new b(this.g, this.d, this.e, this.f, this.g(), var2))).start();
      }

   }

   public void b() {
      if (this.c()) {
         this.j();
      }

      this.g = null;
      super.b();
   }

   public String e() {
      return this.c.toString();
   }

   public void i() {
      this.k();
   }
}
