package fi.polar.polarflow.ui.custom;

import android.support.v7.widget.dl;
import android.support.v7.widget.ej;
import android.support.wearable.view.bg;
import java.util.Iterator;

class b extends ej {
   // $FF: synthetic field
   final BetterWearableListView a;

   b(BetterWearableListView var1) {
      this.a = var1;
   }

   public void a(dl var1, int var2) {
      BetterWearableListView.a(this.a, var2);
      if (var2 == 0 && this.a.getChildCount() > 0) {
         BetterWearableListView.b(this.a, BetterWearableListView.a(this.a).R());
         int var3 = this.a.B();
         if (var3 == 17) {
            BetterWearableListView.a(this.a).n(17);
         } else {
            switch(BetterWearableListView.c(this.a)) {
            case 1:
               BetterWearableListView.a(this.a).n(8388611);
               break;
            case 2:
               BetterWearableListView.a(this.a).n(8388613);
               break;
            default:
               if (BetterWearableListView.a(this.a).I() == BetterWearableListView.b(this.a) + 1) {
                  BetterWearableListView.a(this.a).n(8388613);
               } else if (BetterWearableListView.b(this.a) == 0) {
                  BetterWearableListView.a(this.a).n(8388611);
               } else {
                  BetterWearableListView.a(this.a).n(var3);
               }
            }
         }
      }

      Iterator var4 = BetterWearableListView.d(this.a).iterator();

      while(var4.hasNext()) {
         ((bg)var4.next()).d(var2);
      }

   }

   public void a(dl var1, int var2, int var3) {
      BetterWearableListView.c(this.a, var3);
      Iterator var4 = BetterWearableListView.d(this.a).iterator();

      while(var4.hasNext()) {
         ((bg)var4.next()).b(var3);
      }

   }
}
