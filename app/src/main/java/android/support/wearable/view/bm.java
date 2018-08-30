package android.support.wearable.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.em;
import android.support.v7.widget.ev;
import android.view.View;

@Deprecated
final class bm extends LinearLayoutManager {
   // $FF: synthetic field
   final WearableRecyclerView a;

   public bm(WearableRecyclerView var1, Context var2) {
      super(var2, 1, false);
      this.a = var1;
   }

   private void O() {
      if (WearableRecyclerView.c(this.a) != null) {
         for(int var1 = 0; var1 < this.y(); ++var1) {
            View var2 = this.i(var1);
            WearableRecyclerView.c(this.a).a(var2, this.a);
         }
      }

   }

   public int b(int var1, em var2, ev var3) {
      var1 = super.b(var1, var2, var3);
      this.O();
      return var1;
   }

   public void c(em var1, ev var2) {
      super.c(var1, var2);
      if (this.y() != 0) {
         this.O();
      }

   }
}
