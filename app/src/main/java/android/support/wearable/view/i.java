package android.support.wearable.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

class i implements Callback {
   // $FF: synthetic field
   final CircledImageView a;

   i(CircledImageView var1) {
      this.a = var1;
   }

   public void invalidateDrawable(Drawable var1) {
      this.a.invalidate();
   }

   public void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
   }

   public void unscheduleDrawable(Drawable var1, Runnable var2) {
   }
}
