package fi.polar.polarflow.ui.exeview.shader;

import android.content.Context;
import android.support.wearable.view.aa;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.Iterator;

public class ShaderGridPager extends fi.polar.polarflow.ui.custom.m {
   public ShaderGridPager(Context var1) {
      super(var1);
   }

   public ShaderGridPager(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public ShaderGridPager(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   protected fi.polar.polarflow.ui.custom.p a(aa var1) {
      q var2;
      if (var1 instanceof q) {
         var2 = (q)var1;
      } else {
         fi.polar.polarflow.util.d.c("ShaderGridPager", "", new ClassCastException("adapter not ShaderGridPagerAdapter"));
         var2 = null;
      }

      return var2;
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2;
      try {
         var2 = super.onInterceptTouchEvent(var1);
      } catch (IllegalArgumentException var3) {
         fi.polar.polarflow.util.d.c("ShaderGridPager", "onInterceptTouchEvent couldn't handle MotionEvent", var3);
         var2 = true;
      }

      return var2;
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2;
      try {
         var2 = super.onTouchEvent(var1);
      } catch (IllegalArgumentException var3) {
         fi.polar.polarflow.util.d.a("ShaderGridPager", "onTouchEvent couldn't handle MotionEvent", var3);
         var2 = true;
      }

      return var2;
   }

   public void setFragmentsVisibility(int var1) {
      Iterator var2 = ((q)this.getAdapter()).c().iterator();

      while(var2.hasNext()) {
         ((n)var2.next()).a(var1);
      }

   }
}
