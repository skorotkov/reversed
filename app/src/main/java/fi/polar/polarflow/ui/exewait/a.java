package fi.polar.polarflow.ui.exewait;

import android.app.Activity;
import android.content.Context;
import fi.polar.polarflow.ui.custom.al;

abstract class a extends al {
   protected p a;
   protected n b;

   a(o var1) {
      super(var1);
   }

   protected abstract void b();

   public void onAttach(Context var1) {
      super.onAttach(var1);
      Activity var2 = this.getActivity();
      if (var2 instanceof p) {
         this.a = (p)var2;
         if (var2 instanceof n) {
            this.b = (n)var2;
         } else {
            throw new RuntimeException(var2.toString() + " must implement FragmentCounter");
         }
      } else {
         throw new RuntimeException(var2.toString() + " must implement HelperProvider");
      }
   }

   public void onDetach() {
      super.onDetach();
      this.a = null;
      this.b = null;
   }
}
