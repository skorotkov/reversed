package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.MotionEvent;

@TargetApi(12)
class bl {
   static float a(MotionEvent var0, int var1) {
      return var0.getAxisValue(var1);
   }
}
