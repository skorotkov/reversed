package fi.polar.polarflow.ui.exewait.a;

import android.app.Fragment;
import fi.polar.polarflow.ui.custom.w;
import fi.polar.polarflow.util.u;

class c implements w {
   // $FF: synthetic field
   final a a;

   c(a var1) {
      this.a = var1;
   }

   public void a(int var1) {
      fi.polar.polarflow.ui.exewait.a.a.a(this.a).b(false);
      u.a().b(fi.polar.polarflow.ui.exewait.a.a.b(this.a) + var1);
      Fragment var2 = this.a.getParentFragment();
      if (var2 != null) {
         if (var2 instanceof e) {
            ((e)var2).dismiss();
         } else {
            fi.polar.polarflow.util.d.f("PoolCustomLengthSelectionFragment", "Parent is not instanceof PoolLengthSelectionDialogFragment but should");
         }
      } else {
         fi.polar.polarflow.util.d.f("PoolCustomLengthSelectionFragment", "getParentFragment returned null");
      }

   }
}
