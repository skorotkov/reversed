package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class ej extends AnimatorListenerAdapter {
   // $FF: synthetic field
   final em a;
   // $FF: synthetic field
   final View b;

   ej(em var1, View var2) {
      this.a = var1;
      this.b = var2;
   }

   public void onAnimationCancel(Animator var1) {
      this.a.c(this.b);
   }

   public void onAnimationEnd(Animator var1) {
      this.a.b(this.b);
   }

   public void onAnimationStart(Animator var1) {
      this.a.a(this.b);
   }
}
