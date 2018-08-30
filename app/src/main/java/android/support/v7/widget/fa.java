package android.support.v7.widget;

import android.os.Bundle;
import android.view.View;

class fa extends android.support.v4.view.d {
   // $FF: synthetic field
   final ez b;

   fa(ez var1) {
      this.b = var1;
   }

   public void a(View var1, android.support.v4.view.a.h var2) {
      super.a(var1, var2);
      if (!this.b.b() && this.b.b.getLayoutManager() != null) {
         this.b.b.getLayoutManager().a(var1, var2);
      }

   }

   public boolean a(View var1, int var2, Bundle var3) {
      boolean var4;
      if (super.a(var1, var2, var3)) {
         var4 = true;
      } else if (!this.b.b() && this.b.b.getLayoutManager() != null) {
         var4 = this.b.b.getLayoutManager().a(var1, var2, var3);
      } else {
         var4 = false;
      }

      return var4;
   }
}
