package fi.polar.polarflow.ui.myheartrate;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

class a implements AnimatorListener {
   // $FF: synthetic field
   final MyHeartRateActivity a;

   a(MyHeartRateActivity var1) {
      this.a = var1;
   }

   public void onAnimationCancel(Animator var1) {
   }

   public void onAnimationEnd(Animator var1) {
      this.a.finish();
   }

   public void onAnimationRepeat(Animator var1) {
   }

   public void onAnimationStart(Animator var1) {
      MyHeartRateActivity.a(this.a, MyHeartRateActivity.a(this.a), 200L);
      MyHeartRateActivity.a(this.a, MyHeartRateActivity.b(this.a), 200L);
      MyHeartRateActivity.a(this.a, MyHeartRateActivity.c(this.a), 200L);
      MyHeartRateActivity.a(this.a, MyHeartRateActivity.d(this.a), 200L);
   }
}
