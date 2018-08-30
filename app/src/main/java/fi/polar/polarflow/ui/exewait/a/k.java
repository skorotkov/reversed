package fi.polar.polarflow.ui.exewait.a;

import android.app.Fragment;
import fi.polar.polarflow.ui.custom.RadioButtonWearableListView;
import fi.polar.polarflow.ui.custom.w;
import fi.polar.polarflow.util.u;
import java.util.List;

class k implements w {
   // $FF: synthetic field
   final RadioButtonWearableListView a;
   // $FF: synthetic field
   final List b;
   // $FF: synthetic field
   final g c;

   k(g var1, RadioButtonWearableListView var2, List var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void a(int var1) {
      this.a.b(false);
      if (var1 == 3) {
         ((e)this.c.getParentFragment()).e();
      } else {
         m var2 = (m)this.b.get(var1);
         if (var2.b == 2131230941) {
            u.a().a(var2.a, 0);
         } else {
            u.a().a(var2.a, 1);
         }

         Fragment var3 = this.c.getParentFragment();
         if (var3 != null) {
            if (var3 instanceof e) {
               ((e)this.c.getParentFragment()).dismiss();
            } else {
               fi.polar.polarflow.util.d.f("PoolLengthSelectionFragment", "Parent is not instanceof PoolLengthSelectionDialogFragment but should");
            }
         } else {
            fi.polar.polarflow.util.d.f("PoolLengthSelectionFragment", "getParentFragment returned null");
         }
      }

   }
}
