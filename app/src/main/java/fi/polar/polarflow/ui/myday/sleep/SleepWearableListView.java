package fi.polar.polarflow.ui.myday.sleep;

import android.content.Context;
import android.support.v7.widget.ds;
import android.util.AttributeSet;
import android.view.KeyEvent;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import fi.polar.polarflow.ui.custom.WearableLinearLayoutManager;
import fi.polar.polarflow.ui.custom.ak;

public class SleepWearableListView extends BetterWearableListView {
   private ak H;

   public SleepWearableListView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public SleepWearableListView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public SleepWearableListView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.setGreedyTouchMode(true);
      this.setOneByOneScrollOnFlingEnabled(false);
      WearableLinearLayoutManager var4 = (WearableLinearLayoutManager)this.getLayoutManager();
      var4.a(8388611);
      var4.e(true);
      this.H = new ak(var1, var4, this.getAdapter());
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = false;
      if (var1 == 261) {
         var1 = this.getTopItemPosition() + 1;
         if (var1 < this.getAdapter().a()) {
            this.a(var1, this.H);
            var3 = true;
         }
      } else if (var1 == 260) {
         var1 = this.getTopItemPosition() - 1;
         if (var1 >= 0) {
            this.a(var1, this.H);
            var3 = true;
         }
      } else {
         var3 = super.onKeyDown(var1, var2);
      }

      return var3;
   }

   public void setAdapter(ds var1) {
      super.setAdapter(var1);
      this.H = new ak(this.getContext(), (WearableLinearLayoutManager)this.getLayoutManager(), var1);
   }
}
