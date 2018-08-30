package android.support.v4.b;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class bd extends EpicenterCallback {
   // $FF: synthetic field
   final Rect a;

   bd(Rect var1) {
      this.a = var1;
   }

   public Rect onGetEpicenter(Transition var1) {
      return this.a;
   }
}
