package fi.polar.polarflow.ui.custom;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class a implements OnGlobalLayoutListener {
   // $FF: synthetic field
   final BetterWearableListView a;

   a(BetterWearableListView var1) {
      this.a = var1;
   }

   public void onGlobalLayout() {
      this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
      if (!BetterWearableListView.a(this.a).q()) {
         BetterWearableListView.a(this.a).a((int)this.a.getY(), this.a.getHeight());
      }

      if (BetterWearableListView.b(this.a) != -1) {
         this.a.a_(BetterWearableListView.b(this.a));
      }

   }
}
