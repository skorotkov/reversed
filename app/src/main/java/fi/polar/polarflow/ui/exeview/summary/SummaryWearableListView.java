package fi.polar.polarflow.ui.exeview.summary;

import android.content.Context;
import android.support.v7.widget.ds;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import fi.polar.polarflow.ui.custom.WearableLinearLayoutManager;
import fi.polar.polarflow.ui.custom.ak;

public class SummaryWearableListView extends BetterWearableListView {
   private final Context H;
   private final WearableLinearLayoutManager I;
   private ak J;
   private final int K;

   public SummaryWearableListView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public SummaryWearableListView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public SummaryWearableListView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.setGreedyTouchMode(true);
      this.setOneByOneScrollOnFlingEnabled(false);
      this.I = (WearableLinearLayoutManager)this.getLayoutManager();
      this.I.a(8388611);
      this.I.e(true);
      this.H = var1;
      this.J = new ak(var1, this.I, this.getAdapter());
      this.K = var1.getResources().getDisplayMetrics().heightPixels;
   }

   private boolean a(View var1, boolean var2) {
      int var3 = var1.getHeight();
      int var4 = (int)var1.getY();
      int var5;
      int var6;
      if (var2) {
         var5 = this.j(-var4);
         if (-var4 + var5 >= var3) {
            var2 = this.b(var2);
            return var2;
         }

         var6 = var5;
         if (-var4 + var5 + this.K > var3) {
            var6 = var3 + var4 - this.K;
         }
      } else {
         var5 = this.k(-var4);
         var6 = var5;
         if (-var4 + var5 < 0) {
            var2 = this.b(var2);
            return var2;
         }
      }

      this.a(0, var6);
      var2 = true;
      return var2;
   }

   private boolean b(boolean var1) {
      int var2 = this.getTopItemPosition();
      int var3;
      if (var1) {
         var3 = var2 + 1;
         var2 = var3;
         if (var3 >= this.getAdapter().a()) {
            var1 = false;
            return var1;
         }
      } else {
         var3 = var2 - 1;
         var2 = var3;
         if (var3 < 0) {
            var1 = false;
            return var1;
         }
      }

      this.a(var2, this.J);
      var1 = true;
      return var1;
   }

   private int j(int var1) {
      return this.K - var1 % this.K;
   }

   private int k(int var1) {
      if (var1 % this.K == 0) {
         var1 = -this.K;
      } else {
         var1 = -(var1 % this.K);
      }

      return var1;
   }

   private boolean r(View var1) {
      boolean var2;
      if (var1.getHeight() > this.K) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      boolean var4 = false;
      if (var1 == 261) {
         var4 = true;
      } else if (var1 == 260) {
         var4 = true;
         var3 = false;
      } else {
         var3 = false;
      }

      if (var4) {
         View var5 = this.getLayoutManager().c(this.getTopItemPosition());
         if (this.r(var5)) {
            var3 = this.a(var5, var3);
         } else {
            var3 = this.b(var3);
         }
      } else {
         var3 = super.onKeyDown(var1, var2);
      }

      return var3;
   }

   public void setAdapter(ds var1) {
      super.setAdapter(var1);
      this.J = new ak(this.H, this.I, var1);
   }
}
