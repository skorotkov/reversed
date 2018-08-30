package fi.polar.polarflow.ui.exewait;

import android.animation.ValueAnimator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;

public class ExeWaitGridPager extends fi.polar.polarflow.ui.custom.m {
   private ValueAnimator a;
   private AnimatorListener b;
   private h c;

   public ExeWaitGridPager(Context var1) {
      super(var1);
   }

   public ExeWaitGridPager(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public ExeWaitGridPager(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   protected fi.polar.polarflow.ui.custom.p a(android.support.wearable.view.aa var1) {
      h var2;
      if (var1 instanceof h) {
         this.c = (h)var1;
         var2 = (h)var1;
      } else {
         fi.polar.polarflow.util.d.c("ExeWaitGridPager", "", new ClassCastException("adapter not ExeWaitGridPagerAdapter"));
         var2 = null;
      }

      return var2;
   }

   public a a(o var1) {
      return (a)this.c.b(var1);
   }

   public void c() {
      if (!fi.polar.polarflow.util.u.a().h() && this.c.a(0) > 1) {
         fi.polar.polarflow.util.d.c("ExeWaitGridPager", "Animate second column peek");
         this.a = ValueAnimator.ofInt(new int[]{0, 120});
         this.a.addUpdateListener(new g(this));
         this.a.setDuration(400L);
         this.a.setRepeatMode(2);
         this.a.setRepeatCount(1);
         this.a.setInterpolator(new DecelerateInterpolator());
         if (this.b != null) {
            this.a.addListener(this.b);
         }

         this.a.start();
         fi.polar.polarflow.util.u.a().d(true);
      }

   }

   public a getCurrentFragment() {
      return (a)this.c.d();
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2;
      if (this.a != null && this.a.isRunning()) {
         var2 = true;
      } else {
         var2 = super.onInterceptTouchEvent(var1);
      }

      return var2;
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2;
      if (this.a != null && this.a.isRunning()) {
         var2 = true;
      } else {
         var2 = super.onTouchEvent(var1);
      }

      return var2;
   }

   void setAnimatorListener(AnimatorListener var1) {
      this.b = var1;
   }
}
