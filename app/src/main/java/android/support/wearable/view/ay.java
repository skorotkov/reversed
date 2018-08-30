package android.support.wearable.view;

import android.support.v7.widget.dl;
import android.support.v7.widget.ej;
import android.view.MotionEvent;
import java.util.Iterator;

class ay extends ej {
   // $FF: synthetic field
   final au a;

   ay(au var1) {
      this.a = var1;
   }

   public void a(dl var1, int var2) {
      if (var2 == 0 && this.a.getChildCount() > 0) {
         au.a(this.a, (MotionEvent)null, var2);
      }

      Iterator var3 = au.d(this.a).iterator();

      while(var3.hasNext()) {
         ((bg)var3.next()).d(var2);
      }

   }

   public void a(dl var1, int var2, int var3) {
      au.a(this.a, var3);
   }
}
