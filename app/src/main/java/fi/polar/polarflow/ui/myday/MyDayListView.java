package fi.polar.polarflow.ui.myday;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import fi.polar.polarflow.ui.custom.ScrollGravityListItemLayout;
import fi.polar.polarflow.ui.custom.WearableLinearLayoutManager;

public class MyDayListView extends BetterWearableListView {
   public MyDayListView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public MyDayListView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public MyDayListView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      ((WearableLinearLayoutManager)this.getLayoutManager()).a(17);
      this.setGreedyTouchMode(true);
      this.a(new v(6));
   }

   protected int B() {
      int var2;
      if (this.getChildCount() > 0) {
         View var1 = this.getLayoutManager().c(this.getCurrentItemInIdle());
         if (var1 instanceof ScrollGravityListItemLayout) {
            ((WearableLinearLayoutManager)this.getLayoutManager()).m(1);
            if (var1.getY() + (float)(var1.getHeight() / 2) > (float)((this.getBottom() - this.getTop()) / 2)) {
               var2 = ((ScrollGravityListItemLayout)var1).getForwardScrollGravity();
            } else {
               var2 = ((ScrollGravityListItemLayout)var1).getBackwardScrollGravity();
            }

            return var2;
         }

         ((WearableLinearLayoutManager)this.getLayoutManager()).m(0);
      }

      var2 = 17;
      return var2;
   }
}
