package android.support.v7.widget;

import android.view.View;

class ck {
   boolean a = true;
   int b;
   int c;
   int d;
   int e;
   int f = 0;
   int g = 0;
   boolean h;
   boolean i;

   View a(em var1) {
      View var2 = var1.c(this.c);
      this.c += this.d;
      return var2;
   }

   boolean a(ev var1) {
      boolean var2;
      if (this.c >= 0 && this.c < var1.e()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public String toString() {
      return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
   }
}
