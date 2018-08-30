package fi.polar.polarflow.ui.exeview.shader;

import android.view.MotionEvent;
import android.view.GestureDetector.OnGestureListener;

class m implements OnGestureListener {
   // $FF: synthetic field
   final l a;

   private m(l var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   m(l var1, k var2) {
      this(var1);
   }

   public boolean onDown(MotionEvent var1) {
      return false;
   }

   public boolean onFling(MotionEvent var1, MotionEvent var2, float var3, float var4) {
      if (l.a(this.a) == 8) {
         ShaderContainerView.a(this.a.a, 0.0F);
      } else if (l.a(this.a) == 4) {
         ShaderContainerView.a(this.a.a, -240.0F);
      }

      return false;
   }

   public void onLongPress(MotionEvent var1) {
   }

   public boolean onScroll(MotionEvent var1, MotionEvent var2, float var3, float var4) {
      return false;
   }

   public void onShowPress(MotionEvent var1) {
   }

   public boolean onSingleTapUp(MotionEvent var1) {
      return false;
   }
}
