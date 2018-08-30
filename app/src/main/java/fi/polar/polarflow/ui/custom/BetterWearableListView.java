package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.support.v7.widget.ec;
import android.support.v7.widget.ej;
import android.support.v7.widget.es;
import android.support.v7.widget.ey;
import android.support.wearable.view.au;
import android.support.wearable.view.bd;
import android.support.wearable.view.bg;
import android.support.wearable.view.bj;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;

public class BetterWearableListView extends au {
   private final d H;
   private final List I;
   private final List J;
   private final int K;
   private final int L;
   private boolean M;
   private int N;
   private final ej O;

   public BetterWearableListView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public BetterWearableListView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public BetterWearableListView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.M = true;
      this.N = -1;
      this.O = new b(this);
      this.H = new d(this, var1);
      super.setLayoutManager(this.H);
      this.I = new ArrayList();
      this.J = new ArrayList();
      this.setOnScrollListener((ej)null);
      this.a((ej)this.O);
      this.K = ViewConfiguration.get(var1).getScaledMinimumFlingVelocity();
      this.L = var1.getResources().getDimensionPixelSize(2131362062);
      ViewTreeObserver var4 = this.getViewTreeObserver();
      if (var4.isAlive()) {
         var4.addOnGlobalLayoutListener(new a(this));
      }

   }

   // $FF: synthetic method
   static d a(BetterWearableListView var0) {
      return var0.H;
   }

   // $FF: synthetic method
   static void a(BetterWearableListView var0, int var1) {
      var0.j(var1);
   }

   // $FF: synthetic method
   static int b(BetterWearableListView var0) {
      return var0.N;
   }

   // $FF: synthetic method
   static int b(BetterWearableListView var0, int var1) {
      var0.N = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(BetterWearableListView var0) {
      return var0.getOverScrollState();
   }

   // $FF: synthetic method
   static void c(BetterWearableListView var0, int var1) {
      var0.k(var1);
   }

   // $FF: synthetic method
   static List d(BetterWearableListView var0) {
      return var0.I;
   }

   // $FF: synthetic method
   static List e(BetterWearableListView var0) {
      return var0.J;
   }

   private int getOverScrollState() {
      int var1 = this.H.m();
      View var2;
      byte var4;
      if (var1 == 0) {
         var2 = this.getChildAt(var1);
         if (var2 != null && var2.getTop() > this.getTop()) {
            var4 = 1;
            return var4;
         }
      } else {
         int var3 = this.H.o();
         var1 = this.H.n();
         if (var3 != -1 && var3 == var1 || var1 == this.H.I() - 1) {
            var2 = this.d(var1).a;
            if (var2 != null && var2.getBottom() < this.getBottom()) {
               var4 = 2;
               return var4;
            }
         }
      }

      var4 = 0;
      return var4;
   }

   private void j(int var1) {
      int var2 = this.getChildCount();
      if (var2 != 0) {
         for(int var3 = 0; var3 < var2; ++var3) {
            g var4 = this.q(this.getChildAt(var3));
            if (var4 != null) {
               ((g)var4).d(var1);
            }
         }
      }

   }

   private void k(int var1) {
      int var2 = this.getChildCount();
      if (var2 != 0) {
         for(int var3 = 0; var3 < var2; ++var3) {
            g var4 = this.q(this.getChildAt(var3));
            if (var4 != null) {
               ((g)var4).c(var1);
            }
         }
      }

   }

   protected int B() {
      return this.H.P();
   }

   public void a(int var1, es var2) {
      this.H.b(var2);
      this.c(var1);
      this.H.O();
   }

   public void a(bd var1) {
      super.a(var1);
      this.J.add(var1);
   }

   public void a(bg var1) {
      super.a(var1);
      this.I.add(var1);
   }

   public void a_(int var1) {
      super.a_(var1);
      this.N = var1;
   }

   // $FF: synthetic method
   public ey b(View var1) {
      return this.q(var1);
   }

   public boolean b(int var1, int var2) {
      boolean var3 = true;
      if (this.getChildCount() != 0) {
         int var4 = Math.abs(var2);
         if (!this.M || var4 > this.L) {
            var3 = super.b(var1, var2);
            return var3;
         }

         byte var7;
         if (var2 > 0) {
            var7 = 1;
         } else {
            var7 = -1;
         }

         int var5;
         if (this.N != -1) {
            var5 = this.N;
         } else {
            var5 = this.H.R();
         }

         int var6 = this.getAdapter().a() - 1;
         if (var4 >= this.K && (var5 != 0 || var2 >= 0) && (var5 != var6 || var2 <= 0)) {
            this.c(Math.max(0, Math.min(var6, var7 + var5)));
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   public int getCentralViewTop() {
      return this.H.Q();
   }

   protected final int getCurrentItemInIdle() {
      return this.N;
   }

   protected ej getOnScrollListener() {
      return this.O;
   }

   public int getTopItemPosition() {
      int var1 = this.H.T();
      if (var1 != -1) {
         var1 = this.g(this.H.i(var1));
      }

      return var1;
   }

   // $FF: synthetic method
   public bj o(View var1) {
      return this.q(var1);
   }

   public g q(View var1) {
      return (g)super.o(var1);
   }

   public void setCanScrollVertically(boolean var1) {
      d.a((d)this.getLayoutManager(), var1);
   }

   protected final void setCurrentItemInIdle(int var1) {
      this.N = var1;
   }

   public void setLayoutManager(ec var1) {
   }

   public void setOneByOneScrollOnFlingEnabled(boolean var1) {
      this.M = var1;
   }
}
