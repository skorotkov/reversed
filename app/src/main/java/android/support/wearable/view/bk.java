package android.support.wearable.view;

import android.view.ViewTreeObserver.OnPreDrawListener;

class bk implements OnPreDrawListener {
   // $FF: synthetic field
   final WearableRecyclerView a;

   bk(WearableRecyclerView var1) {
      this.a = var1;
   }

   public boolean onPreDraw() {
      if (WearableRecyclerView.a(this.a) && this.a.getChildCount() > 0) {
         WearableRecyclerView.b(this.a);
         WearableRecyclerView.a(this.a, false);
      }

      return true;
   }
}
