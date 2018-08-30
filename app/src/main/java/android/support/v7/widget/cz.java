package android.support.v7.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class cz implements OnTouchListener {
   // $FF: synthetic field
   final ct a;

   cz(ct var1) {
      this.a = var1;
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      int var3 = var2.getAction();
      int var4 = (int)var2.getX();
      int var5 = (int)var2.getY();
      if (var3 == 0 && this.a.g != null && this.a.g.isShowing() && var4 >= 0 && var4 < this.a.g.getWidth() && var5 >= 0 && var5 < this.a.g.getHeight()) {
         this.a.f.postDelayed(this.a.e, 250L);
      } else if (var3 == 1) {
         this.a.f.removeCallbacks(this.a.e);
      }

      return false;
   }
}
