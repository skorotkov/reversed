package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

class ea implements Runnable {
   WeakReference a;
   dy b;
   // $FF: synthetic field
   final dz c;

   ea(dz var1, dy var2, View var3) {
      this.c = var1;
      this.a = new WeakReference(var3);
      this.b = var2;
   }

   public void run() {
      View var1 = (View)this.a.get();
      if (var1 != null) {
         this.c.c(this.b, var1);
      }

   }
}
