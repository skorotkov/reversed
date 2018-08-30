package android.support.v7.widget;

import android.annotation.TargetApi;
import android.graphics.Outline;

@TargetApi(21)
class d extends c {
   public d(ActionBarContainer var1) {
      super(var1);
   }

   public void getOutline(Outline var1) {
      if (this.a.d) {
         if (this.a.c != null) {
            this.a.c.getOutline(var1);
         }
      } else if (this.a.a != null) {
         this.a.a.getOutline(var1);
      }

   }
}
