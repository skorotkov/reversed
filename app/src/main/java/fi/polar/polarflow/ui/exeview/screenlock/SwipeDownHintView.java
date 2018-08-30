package fi.polar.polarflow.ui.exeview.screenlock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.RelativeLayout;

public class SwipeDownHintView extends RelativeLayout {
   private AnimationSet a;
   private final AnimationListener b = new b(this);

   public SwipeDownHintView(Context var1) {
      super(var1);
      this.a(var1);
   }

   public SwipeDownHintView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1);
   }

   public SwipeDownHintView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var1);
   }

   private void a(Context var1) {
      Animation var2 = AnimationUtils.loadAnimation(var1, 2131034135);
      var2.setDuration(500L);
      Animation var3 = AnimationUtils.loadAnimation(var1, 2131034141);
      var3.setStartOffset(2500L);
      var3.setDuration(500L);
      this.a = new AnimationSet(true);
      this.a.addAnimation(var2);
      this.a.addAnimation(var3);
      this.a.setAnimationListener(this.b);
   }

   public void a() {
      this.startAnimation(this.a);
   }

   protected void onVisibilityChanged(View var1, int var2) {
      super.onVisibilityChanged(var1, var2);
      if (var2 != 0) {
         this.clearAnimation();
      }

   }
}
