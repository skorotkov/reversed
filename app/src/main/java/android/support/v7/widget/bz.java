package android.support.v7.widget;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

class bz implements OnAttachStateChangeListener {
   // $FF: synthetic field
   final by a;

   bz(by var1) {
      this.a = var1;
   }

   public void onViewAttachedToWindow(View var1) {
   }

   public void onViewDetachedFromWindow(View var1) {
      by.a(this.a);
   }
}
