package fi.polar.polarflow.ui.myday;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.AsyncTask.Status;
import android.support.wearable.view.bd;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.util.aa_TimeUtils;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joda.time.LocalDate;

public class h extends a implements bd {
   private final IntentFilter a = new IntentFilter();
   private v_StickyLocalBroadcastManager b;
   private int c;
   private MyDayListView d;
   private AsyncTask e;
   private f f;
   private int g;
   private aa_TimeUtils h;
   private LocalDate i;
   private final BroadcastReceiver j = new i(this);

   public h() {
      super(fi.polar.polarflow.ui.myday.e.a);
      this.a.addAction("DailyActivityService.action.DAILY_ACTIVITY_STATUS");
      this.a.addAction("SleepTrackingService.action.SLEEP_STATE_CHANGED");
      this.b = v_StickyLocalBroadcastManager.a_getInstance();
      this.g = -1;
      this.h = new aa_TimeUtils();
   }

   // $FF: synthetic method
   static int a(h var0, int var1) {
      var0.g = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(h var0, List var1) {
      return var0.a(var1);
   }

   private int a(List var1) {
      Intent var2 = this.d();
      int var3;
      if (var2 != null && var2.hasExtra("MyDayFragment.extra.SCROLL_TO_MY_DAY_ITEM")) {
         var3 = u.a(var1, var2.getStringExtra("MyDayFragment.extra.SCROLL_TO_MY_DAY_ITEM"));
      } else {
         var3 = -1;
      }

      int var4 = var3;
      if (var3 == -1) {
         var4 = var3;
         if (this.g != -1) {
            switch(this.g) {
            case -3:
               var4 = u.a(var1, fi.polar.polarflow.ui.myday.item.f.class);
               break;
            case -2:
               var4 = u.a(var1, fi.polar.polarflow.ui.myday.item.a_package.e.class);
               break;
            default:
               if (this.g >= 0 && this.g < var1.size()) {
                  var4 = this.g;
               } else {
                  var4 = -1;
               }
            }
         }
      }

      var3 = var4;
      if (var4 == -1) {
         var3 = u.a(var1, fi.polar.polarflow.ui.myday.item.f.class);
      }

      var4 = var3;
      if (var3 == -1) {
         var4 = u.a(var1, fi.polar.polarflow.ui.myday.item.a_package.e.class);
      }

      var3 = var4;
      if (var4 == -1) {
         var3 = 0;
      }

      return var3;
   }

   private Intent a(String var1) {
      return this.b.a_registerReceiver((BroadcastReceiver)null, (String)var1);
   }

   private void a(Intent var1) {
      if ("SleepTrackingService.action.SLEEP_STATE_CHANGED".equals(var1.getAction())) {
         this.b(var1);
      }

      for(int var2 = 0; var2 < this.f.a(); ++var2) {
         this.f.e(var2).a((Intent)var1);
      }

   }

   // $FF: synthetic method
   static void a(h var0, Intent var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(h var0, List var1, int var2) {
      var0.a(var1, var2);
   }

   private void a(fi.polar.polarflow.ui.myday.item.c var1) {
      List var2 = this.f.d();
      var2.add(var1);
      Collections.sort(var2);
      this.b(var2);
   }

   private void a(List var1, int var2) {
      if (this.getActivity() != null) {
         this.f = new f(this.getActivity(), var1);
         this.d.setAdapter(this.f);
         this.d.a_(var2);
      } else {
         fi.polar.polarflow.util.d.f("MyDayFragment", "getActivity() returned null");
      }

   }

   private void a(List var1, fi.polar.polarflow.ui.myday.item.c var2) {
      int var3 = var1.indexOf(var2);
      int var4 = var3;
      if (var3 == -1) {
         var4 = this.a(var1);
      }

      this.a(var1, var4);
   }

   private void a(List var1, List var2, fi.polar.polarflow.ui.myday.item.c var3) {
      List var4 = this.f.d();
      var4.removeAll(var1);
      var4.addAll(var2);
      Collections.sort(var4);
      this.a(var4, var3);
   }

   // $FF: synthetic method
   static boolean a(h var0) {
      return var0.f();
   }

   private boolean a(fi.polar.polarflow.util.b_package.a var1) {
      boolean var2;
      if (var1.b().isBefore(new LocalDate())) {
         var2 = false;
      } else {
         fi.polar.polarflow.ui.myday.item.c var3 = this.f.a(var1.c());
         if (var3 instanceof fi.polar.polarflow.ui.myday.item.g) {
            fi.polar.polarflow.ui.myday.item.g var4 = (fi.polar.polarflow.ui.myday.item.g)var3;
            if (!var1.c.isAfter(var4.e())) {
               var2 = false;
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   // $FF: synthetic method
   static boolean a(List var0, boolean var1) {
      return b(var0, var1);
   }

   // $FF: synthetic method
   static MyDayListView b(h var0) {
      return var0.d;
   }

   private void b(Intent var1) {
      boolean var2 = c(var1);
      fi.polar.polarflow.ui.myday.item.f var3 = (fi.polar.polarflow.ui.myday.item.f)this.f.a(fi.polar.polarflow.ui.myday.item.f.class);
      if (var2 && var3 == null) {
         this.a((fi.polar.polarflow.ui.myday.item.c)(new fi.polar.polarflow.ui.myday.item.f()));
      } else if (!var2 && var3 != null) {
         fi.polar.polarflow.util.b_package.a var6 = this.e();
         if (var6 != null) {
            ArrayList var4 = new ArrayList();
            var4.add(new fi.polar.polarflow.ui.myday.item.g(var6, var6.c(), var6.b()));
            var4.add(new fi.polar.polarflow.ui.myday.item.sleeprating.a(var6.b.getMillis(), var6.c(), var6.b(), var6.l));
            ArrayList var5 = new ArrayList();
            var5.add(var3);
            var5.addAll(this.f.b(var6.c()));
            this.a(var5, var4, (fi.polar.polarflow.ui.myday.item.c)var4.get(0));
         } else {
            this.b((fi.polar.polarflow.ui.myday.item.c)var3);
         }
      }

   }

   private void b(fi.polar.polarflow.ui.myday.item.c var1) {
      List var2 = this.f.d();
      if (var2.remove(var1)) {
         this.b(var2);
      } else {
         fi.polar.polarflow.util.d.f("MyDayFragment", "removing failed, could not find item: " + var1);
      }

   }

   private void b(List var1) {
      this.a(var1, this.b());
   }

   private static boolean b(List var0, boolean var1) {
      fi.polar.polarflow.ui.myday.item.f var2 = (fi.polar.polarflow.ui.myday.item.f)u.b(var0, fi.polar.polarflow.ui.myday.item.f.class);
      if (var1 && var2 == null) {
         var1 = var0.add(new fi.polar.polarflow.ui.myday.item.f());
      } else if (!var1 && var2 != null) {
         var1 = var0.remove(var2);
      } else {
         var1 = false;
      }

      return var1;
   }

   private void c() {
      this.i = this.h.f_newLocalDate();
      ArrayList var1 = new ArrayList();
      if (this.f()) {
         var1.add(new fi.polar.polarflow.ui.myday.item.f());
      }

      var1.add(new fi.polar.polarflow.ui.myday.item.a_package.e());
      if (this.f == null) {
         this.f = new f(this.getActivity(), var1);
      }

      this.d.setAdapter(this.f);
      this.d.a_(this.a((List)var1));
      if (this.e != null) {
         this.e.cancel(true);
      }

      this.e = new j(this, (i)null);
      this.e.execute(var1.toArray(new fi.polar.polarflow.ui.myday.item.c[var1.size()]));
   }

   private static boolean c(Intent var0) {
      boolean var1;
      if (var0 != null && fi.polar.polarflow.service.activity.bd.c == var0.getSerializableExtra("SleepTrackingService.extra.SLEEP_STATE")) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private Intent d() {
      Activity var1 = this.getActivity();
      Intent var2;
      if (var1 != null) {
         var2 = var1.getIntent();
      } else {
         var2 = null;
      }

      return var2;
   }

   private fi.polar.polarflow.util.b_package.a e() {
      Intent var1 = this.a("SleepTrackingService.action.SLEEP_ANALYSIS_RESULT");
      fi.polar.polarflow.util.b_package.a var2;
      if (var1 != null) {
         var2 = (fi.polar.polarflow.util.b_package.a)var1.getParcelableExtra("SleepTrackingService.extra.SLEEP_ANALYSIS");
         if (this.a(var2)) {
            return var2;
         }
      }

      var2 = null;
      return var2;
   }

   private boolean f() {
      return c(this.a("SleepTrackingService.action.SLEEP_STATE_CHANGED"));
   }

   private boolean g() {
      boolean var1;
      if (this.i != null && this.i.equals(this.h.f_newLocalDate())) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void a(int var1) {
      this.c = var1;
      Activity var2 = this.getActivity();
      if (var2 instanceof bd) {
         ((bd)var2).a(var1);
      }

   }

   fi.polar.polarflow.ui.myday.item.c b() {
      return this.f.e(this.c);
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return var1.inflate(2130968710, var2, false);
   }

   public void onDestroyView() {
      super.onDestroyView();

      for(int var1 = 0; var1 < this.f.a(); ++var1) {
         this.f.e(var1).b();
      }

      if (this.e.getStatus() != Status.FINISHED) {
         this.d.setCanScrollVertically(true);
         this.e.cancel(false);
      }

   }

   public void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      fi.polar.polarflow.ui.myday.item.c var2 = this.b();
      if (var2 instanceof fi.polar.polarflow.ui.myday.item.a_package.e) {
         var1.putInt("MyDayFragment.extra.SAVED_SCROLL_POSITION", -2);
      } else if (var2 instanceof fi.polar.polarflow.ui.myday.item.f) {
         var1.putInt("MyDayFragment.extra.SAVED_SCROLL_POSITION", -3);
      } else {
         var1.putInt("MyDayFragment.extra.SAVED_SCROLL_POSITION", this.c);
      }

   }

   public void onStart() {
      super.onStart();
      this.b.a_registerReceiver(this.j, this.a);
      Intent var1 = this.a("SleepTrackingService.action.SLEEP_STATE_CHANGED");
      if (var1 != null) {
         this.b(var1);
      }

      if (this.g()) {
         fi.polar.polarflow.util.d.c("MyDayFragment", "Day changed and my day items should be updated");
         this.c();
      }

   }

   public void onStop() {
      this.b.a_unregisterReceiver(this.j);
      super.onStop();
   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      if (var2 != null) {
         this.g = var2.getInt("MyDayFragment.extra.SAVED_SCROLL_POSITION", -1);
      }

      this.d = (MyDayListView)var1.findViewById(2131755173);
      this.d.a(this);
      if (this.f == null) {
         this.d.setCanScrollVertically(false);
         this.c();
      } else {
         this.d.setAdapter(this.f);
      }

   }
}
