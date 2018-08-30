package fi.polar.polarflow.ui.exewait;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.eb;
import android.support.wearable.view.bd;
import android.support.wearable.view.bg;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class b extends a implements bd, bg {
   private static final String g = b.class.getSimpleName();
   protected ad c;
   protected fi.polar.polarflow.ui.myday.f d;
   protected int e;
   protected TextView f;
   private boolean h;
   private BetterWearableListView i;

   protected b(o var1) {
      super(var1);
   }

   private static List a(List var0) {
      ArrayList var1 = new ArrayList();
      var1.addAll(var0);
      Collections.sort(var1);
      return var1;
   }

   public void a(int var1) {
   }

   protected void b() {
      fi.polar.polarflow.util.d.c(g, "invalidate()");
      if (this.d != null) {
         this.d.a(a(this.c()));
      }

   }

   public void b(int var1) {
   }

   protected abstract List c();

   public void c(int var1) {
   }

   public void d(int var1) {
      if (!this.h && this.getUserVisibleHint()) {
         this.h = true;
         this.f.setVisibility(8);
      }

   }

   public void onAttach(Context var1) {
      super.onAttach(var1);
      fi.polar.polarflow.util.d.c(g, "onAttach() type=" + this.a());
      Activity var2 = this.getActivity();
      if (var2 instanceof ad) {
         this.c = (ad)var2;
      } else {
         throw new RuntimeException(var2.toString() + " must implement TargetListProvider");
      }
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return var1.inflate(2130968638, var2, false);
   }

   public void onDetach() {
      super.onDetach();
      fi.polar.polarflow.util.d.c(g, "onDetach() type=" + this.a());
      this.d = null;
      this.c = null;
   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      this.i = (BetterWearableListView)var1.findViewById(2131755173);
      this.i.setGreedyTouchMode(true);
      this.i.a((eb)(new fi.polar.polarflow.ui.myday.v(6)));
      this.f = (TextView)var1.findViewById(2131755025);
      if (this.h) {
         this.f.setVisibility(8);
      }

      this.d = new fi.polar.polarflow.ui.myday.f(this.getActivity(), a(this.c()));
      this.i.setAdapter(this.d);
      this.i.a_(this.e);
      this.i.a((bd)this);
      this.i.a((bg)this);
   }

   public void setUserVisibleHint(boolean var1) {
      fi.polar.polarflow.util.d.e(g, "setUserVisibleHint(): " + var1);
      super.setUserVisibleHint(var1);
      if (!var1 && this.i != null) {
         this.i.a_(this.e);
         this.h = false;
         this.f.setY(0.0F);
         this.f.setVisibility(0);
      }

      if (var1 && !fi.polar.polarflow.util.u.a().h()) {
         fi.polar.polarflow.util.u.a().d(true);
      }

   }
}
