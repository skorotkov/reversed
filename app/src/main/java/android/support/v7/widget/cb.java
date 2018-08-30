package android.support.v7.widget;

import android.view.ViewParent;

class cb implements Runnable {
   // $FF: synthetic field
   final by a;

   cb(by var1) {
      this.a = var1;
   }

   public void run() {
      ViewParent var1 = this.a.c.getParent();
      if (var1 != null) {
         var1.requestDisallowInterceptTouchEvent(true);
      }

   }
}
