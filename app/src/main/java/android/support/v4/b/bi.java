package android.support.v4.b;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class bi extends EpicenterCallback {
   // $FF: synthetic field
   final Rect a;

   bi(Rect var1) {
      this.a = var1;
   }

   public Rect onGetEpicenter(Transition var1) {
      Rect var2;
      if (this.a != null && !this.a.isEmpty()) {
         var2 = this.a;
      } else {
         var2 = null;
      }

      return var2;
   }
}
