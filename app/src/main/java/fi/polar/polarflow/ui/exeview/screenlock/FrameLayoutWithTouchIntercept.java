package fi.polar.polarflow.ui.exeview.screenlock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class FrameLayoutWithTouchIntercept extends FrameLayout {
   private a a;

   public FrameLayoutWithTouchIntercept(Context var1) {
      super(var1);
   }

   public FrameLayoutWithTouchIntercept(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public FrameLayoutWithTouchIntercept(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2;
      if (this.a != null) {
         var2 = this.a.a(var1);
      } else {
         var2 = super.onInterceptTouchEvent(var1);
      }

      return var2;
   }

   public void setOnInterceptTouchListener(a var1) {
      this.a = var1;
   }
}
