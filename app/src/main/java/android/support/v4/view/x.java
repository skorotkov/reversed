package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.GestureDetector.OnGestureListener;

class x implements u {
   private final GestureDetector a;

   public x(Context var1, OnGestureListener var2, Handler var3) {
      this.a = new GestureDetector(var1, var2, var3);
   }

   public boolean a(MotionEvent var1) {
      return this.a.onTouchEvent(var1);
   }
}
