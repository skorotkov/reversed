package fi.polar.polarflow.ui.exeview.shader;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class c implements OnTouchListener {
   // $FF: synthetic field
   final a a;

   c(a var1) {
      this.a = var1;
   }

   @SuppressLint({"ClickableViewAccessibility"})
   public boolean onTouch(View var1, MotionEvent var2) {
      this.a.a.setX(var1.getX() + (float)(var1.getWidth() / 2));
      int var3 = var2.getAction() & 255;
      if (var3 == 0 && !this.a.c) {
         this.a.d = true;
         this.a.b();
      } else if (var3 == 1) {
         this.a.d = false;
         if (!this.a.c) {
            this.a.d();
         }
      } else if (var3 == 3) {
         this.a.c();
      }

      return false;
   }
}
