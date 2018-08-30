package android.support.wearable.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.em;
import android.support.v7.widget.ev;
import android.view.View;

public abstract class WearableRecyclerView$ChildLayoutManager extends LinearLayoutManager {
   public WearableRecyclerView$ChildLayoutManager(Context var1) {
      super(var1, 1, false);
   }

   private void O() {
      for(int var1 = 0; var1 < this.y(); ++var1) {
         View var2 = this.i(var1);
         this.a(var2, (WearableRecyclerView)var2.getParent());
      }

   }

   public abstract void a(View var1, WearableRecyclerView var2);

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
