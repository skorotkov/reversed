package fi.polar.polarflow.ui.myday;

import android.content.Context;
import android.support.wearable.view.aa;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyDayGridPager extends fi.polar.polarflow.ui.custom.m {
   private boolean a = true;

   public MyDayGridPager(Context var1) {
      super(var1);
   }

   public MyDayGridPager(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public MyDayGridPager(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   protected fi.polar.polarflow.ui.custom.p a(aa var1) {
      k var2;
      if (var1 instanceof k) {
         var2 = (k)var1;
      } else {
         fi.polar.polarflow.util.d.c("MyDayGridPager", "", new ClassCastException("adapter not MyDayGridPagerAdapter"));
         var2 = null;
      }

      return var2;
   }

   public boolean c() {
      return this.a;
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2;
      if (this.a && super.onInterceptTouchEvent(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2;
      if (this.a && super.onTouchEvent(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void setTouchEnabled(boolean var1) {
      this.a = var1;
   }
}
