package fi.polar.polarflow.ui.exeview.laps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.support.v7.widget.dw;
import android.support.v7.widget.fq;
import android.support.wearable.view.bg;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.data.Lap;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.service.TrainingService;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import fi.polar.polarflow.ui.exeview.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class a extends fi.polar.polarflow.ui.exeview.a implements bg {
   protected final List e = new f();
   protected TrainingService f;
   private boolean g = false;
   private int h = 0;
   private fi.polar.polarflow.ui.exeview.d i;
   private g j;
   private final List k = new ArrayList();
   private boolean l = false;
   private final ServiceConnection m = new b(this);

   protected a(ak var1) {
      super(var1);
   }

   // $FF: synthetic method
   static BetterWearableListView a(a var0) {
      return var0.a;
   }

   private void e(int var1) {
      if (this.a != null) {
         this.a.post(new c(this, var1));
      }

   }

   protected abstract e a(SportProfileSettings var1);

   protected abstract n a(Lap var1, SportProfileSettings var2);

   public void a(int var1) {
      fi.polar.polarflow.util.d.c("AbstractLapFragment", "onCentralPositionChanged: " + var1);
      if (var1 == 0) {
         if (this.i != null) {
            this.i.a(true);
         }
      } else if (this.h == 0 && this.i != null) {
         this.i.a(false);
      }

      this.h = var1;
   }

   protected void a(Lap var1) {
      this.e.add(var1);
      n var2 = this.a(var1, this.k());
      this.j.a((d)var2);
      if (!this.g && this.h > 0 && this.h < this.j.a() - 1) {
         this.a.a_(this.h + 1);
      }

   }

   public void a(Collection var1) {
      Iterator var2 = this.k.iterator();

      while(var2.hasNext()) {
         ((d)var2.next()).a(var1);
      }

   }

   protected void a(List var1) {
      this.k.clear();
      SportProfileSettings var2 = this.k();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Lap var4 = (Lap)var3.next();
         this.k.add(0, this.a(var4, var2));
      }

      this.k.add(0, this.a(var2));
      if (this.d()) {
         Iterator var5 = this.k.iterator();

         while(var5.hasNext()) {
            ((d)var5.next()).a_((Bundle)null);
         }
      }

      this.j.a(this.k);
   }

   public void a_(Bundle var1) {
      super.a_(var1);
      Iterator var2 = this.k.iterator();

      while(var2.hasNext()) {
         ((d)var2.next()).a_(var1);
      }

   }

   public void b(int var1) {
   }

   public void c() {
      super.c();
      Iterator var1 = this.k.iterator();

      while(var1.hasNext()) {
         ((d)var1.next()).d();
      }

   }

   public void c(int var1) {
   }

   public void d(int var1) {
      fi.polar.polarflow.util.d.c("AbstractLapFragment", "onScrollStateChanged: " + var1);
      boolean var2;
      if (var1 != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.g = var2;
   }

   public void d_() {
      Iterator var1 = this.k.iterator();

      while(var1.hasNext()) {
         ((d)var1.next()).d_();
      }

      super.d_();
   }

   public void h() {
      if (this.j.a() > 1) {
         this.h = 1;
         this.e(this.h);
      }

   }

   public int i() {
      return this.h;
   }

   protected abstract void j();

   protected SportProfileSettings k() {
      SportProfile var1 = this.f();
      SportProfileSettings var2;
      if (var1 == null) {
         var2 = null;
      } else {
         var2 = var1.getSettings();
      }

      return var2;
   }

   public void onAttach(Context var1) {
      super.onAttach(var1);
      Activity var2 = this.getActivity();

      try {
         this.i = (fi.polar.polarflow.ui.exeview.d)var2;
      } catch (ClassCastException var3) {
         throw new ClassCastException(var2.toString() + " must implement OnTopViewCenteredListener");
      }
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.k.clear();
      this.k.add(this.a(this.k()));
      Context var2 = this.getContext();
      if (var2 != null) {
         this.l = var2.bindService(new Intent(var2, TrainingService.class), this.m, 1);
      }

   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      fi.polar.polarflow.util.d.c("AbstractLapFragment", "onCreateView() savedInstanceState= " + var3 + " ");
      ContextThemeWrapper var4;
      if (((android.support.wearable.activity.a)this.getActivity()).b()) {
         var4 = new ContextThemeWrapper(this.getActivity(), 2131427623);
      } else {
         var4 = new ContextThemeWrapper(this.getActivity(), 2131427629);
      }

      return var1.cloneInContext(var4).inflate(2130968622, var2, false);
   }

   public void onDestroy() {
      Context var1 = this.getContext();
      if (var1 != null && this.l) {
         var1.unbindService(this.m);
      }

      this.f = null;
      super.onDestroy();
   }

   public void onDestroyView() {
      Iterator var1 = this.k.iterator();

      while(var1.hasNext()) {
         ((d)var1.next()).b();
      }

      super.onDestroyView();
   }

   public void onDetach() {
      super.onDetach();
      fi.polar.polarflow.util.d.c("AbstractLapFragment", "onDetach()");
      this.i = null;
      this.e.clear();
   }

   public void onResume() {
      super.onResume();
      this.j();
   }

   public void onViewCreated(View var1, Bundle var2) {
      fi.polar.polarflow.util.d.c("AbstractLapFragment", "onViewCreated() savedInstanceState= " + var2);
      super.onViewCreated(var1, var2);
      this.a = (BetterWearableListView)var1.findViewById(2131755173);
      this.a.setGreedyTouchMode(true);
      dw var3 = this.a.getItemAnimator();
      if (var3 instanceof fq) {
         ((fq)var3).a(false);
      }

      var3.b(0L);
      var3.a(0L);
      var3.c(0L);
      this.j = new g(var1.getContext(), this.k, ((android.support.wearable.activity.a)this.getActivity()).b());
      this.a.setAdapter(this.j);
      this.a.a((bg)this);
   }

   public void setUserVisibleHint(boolean var1) {
      super.setUserVisibleHint(var1);
      if (!var1) {
         this.h = 0;
         this.e(this.h);
      } else {
         this.j();
      }

   }
}
