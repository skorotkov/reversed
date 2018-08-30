package android.support.v4.b;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class ak implements AnimationListener {
   private AnimationListener a;
   private boolean b;
   View c;

   public ak(View var1, Animation var2) {
      if (var1 != null && var2 != null) {
         this.c = var1;
      }

   }

   public ak(View var1, Animation var2, AnimationListener var3) {
      if (var1 != null && var2 != null) {
         this.a = var3;
         this.c = var1;
         this.b = true;
      }

   }

   public void onAnimationEnd(Animation var1) {
      if (this.c != null && this.b) {
         if (!android.support.v4.view.bz.y(this.c) && !android.support.v4.f.c.a()) {
            android.support.v4.view.bz.a(this.c, 0, (Paint)null);
         } else {
            this.c.post(new al(this));
         }
      }

      if (this.a != null) {
         this.a.onAnimationEnd(var1);
      }

   }

   public void onAnimationRepeat(Animation var1) {
      if (this.a != null) {
         this.a.onAnimationRepeat(var1);
      }

   }

   public void onAnimationStart(Animation var1) {
      if (this.a != null) {
         this.a.onAnimationStart(var1);
      }

   }
}
