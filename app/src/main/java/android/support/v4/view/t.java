package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.GestureDetector.OnGestureListener;

public final class t {
   private final u a;

   public t(Context var1, OnGestureListener var2) {
      this(var1, var2, (Handler)null);
   }

   public t(Context var1, OnGestureListener var2, Handler var3) {
      if (VERSION.SDK_INT > 17) {
         this.a = new x(var1, var2, var3);
      } else {
         this.a = new v(var1, var2, var3);
      }

   }

   public boolean a(MotionEvent var1) {
      return this.a.a(var1);
   }
}
