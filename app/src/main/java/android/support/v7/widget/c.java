package android.support.v7.widget;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

@TargetApi(9)
class c extends Drawable {
   final ActionBarContainer a;

   public c(ActionBarContainer var1) {
      this.a = var1;
   }

   public void draw(Canvas var1) {
      if (this.a.d) {
         if (this.a.c != null) {
            this.a.c.draw(var1);
         }
      } else {
         if (this.a.a != null) {
            this.a.a.draw(var1);
         }

         if (this.a.b != null && this.a.e) {
            this.a.b.draw(var1);
         }
      }

   }

   public int getOpacity() {
      return 0;
   }

   public void setAlpha(int var1) {
   }

   public void setColorFilter(ColorFilter var1) {
   }
}
