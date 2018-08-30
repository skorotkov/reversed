package android.support.a.a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

class d implements Callback {
   // $FF: synthetic field
   final c a;

   d(c var1) {
      this.a = var1;
   }

   public void invalidateDrawable(Drawable var1) {
      this.a.invalidateSelf();
   }

   public void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
      this.a.scheduleSelf(var2, var3);
   }

   public void unscheduleDrawable(Drawable var1, Runnable var2) {
      this.a.unscheduleSelf(var2);
   }
}
