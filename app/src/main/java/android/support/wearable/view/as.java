package android.support.wearable.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;

@TargetApi(20)
public class as implements AnimatorListener {
   private boolean a;

   public void a(Animator var1) {
   }

   public boolean a() {
      return this.a;
   }

   public void onAnimationCancel(Animator var1) {
      this.a = true;
   }

   public void onAnimationEnd(Animator var1) {
      if (!this.a) {
         this.a(var1);
      }

   }

   public void onAnimationRepeat(Animator var1) {
   }

   public void onAnimationStart(Animator var1) {
      this.a = false;
   }
}
