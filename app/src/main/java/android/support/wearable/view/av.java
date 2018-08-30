package android.support.wearable.view;

import android.util.Log;

class av implements Runnable {
   // $FF: synthetic field
   final au a;

   av(au var1) {
      this.a = var1;
   }

   public void run() {
      if (this.a.getChildCount() > 0) {
         au.a(this.a, this.a.getChildAt(au.a(this.a)));
         au.b(this.a).setPressed(true);
      } else {
         Log.w("WearableListView", "mPressedRunnable: the children were removed, skipping.");
      }

   }
}
