package fi.polar.polarflow.ui.exeview;

import android.app.Activity;

public abstract class x extends fi.polar.polarflow.ui.g {
   protected boolean d() {
      Activity var1 = this.getActivity();
      boolean var2;
      if (var1 != null) {
         if (var1 instanceof e) {
            var2 = ((e)var1).e_();
            return var2;
         }

         fi.polar.polarflow.util.d.f(this.getClass().getSimpleName(), var1.toString() + " must implement ActivityPrefsProvider");
      } else {
         fi.polar.polarflow.util.d.f(this.getClass().getSimpleName(), "getActivity() returned null");
      }

      var2 = false;
      return var2;
   }
}
